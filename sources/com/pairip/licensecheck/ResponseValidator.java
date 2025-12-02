package com.pairip.licensecheck;

import android.os.Bundle;
import android.util.Base64;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class ResponseValidator {
    private static final String KEY_FACTORY_ALGORITHM = "RSA";
    private static final String PAYLOAD_LICENSE_DATA = "LICENSE_DATA";
    private static final String PAYLOAD_PACKAGE_NAME = "packageName";
    private static final String SIGNATURE_ALGORITHM = "SHA256withRSA";
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public static void validateResponse(Bundle bundle, String str) throws LicenseCheckException {
        try {
            String string = bundle.getString(PAYLOAD_LICENSE_DATA);
            if (string != null) {
                String[] split = string.split("\\.", -1);
                if (split.length == 3) {
                    JSONObject base64ToJson = base64ToJson(split[0]);
                    JSONObject base64ToJson2 = base64ToJson(split[1]);
                    String str2 = split[2];
                    String str3 = split[0] + "." + split[1];
                    if (base64ToJson.getString("alg").equals("RS256")) {
                        verifySignature(str3, str2, SIGNATURE_ALGORITHM, getPublicKey());
                        if (!base64ToJson2.getString(PAYLOAD_PACKAGE_NAME).equals(str)) {
                            throw new LicenseCheckException("Package name doesn't match.");
                        }
                        return;
                    }
                    throw new LicenseCheckException("Response must be signed with RS256 algorithm.");
                }
                throw new LicenseCheckException("Invalid response");
            }
            throw new LicenseCheckException("Invalid response");
        } catch (JSONException e4) {
            throw new LicenseCheckException("Could not decode json", e4);
        }
    }

    private static JSONObject base64ToJson(String str) throws LicenseCheckException {
        try {
            return new JSONObject(new String(Base64.decode(str, 8), UTF_8));
        } catch (IllegalArgumentException | JSONException e4) {
            throw new LicenseCheckException("Invalid response", e4);
        }
    }

    private static void verifySignature(String str, String str2, String str3, PublicKey publicKey) throws LicenseCheckException {
        try {
            Signature instance = Signature.getInstance(str3);
            instance.initVerify(publicKey);
            instance.update(str.getBytes(UTF_8));
            if (!instance.verify(Base64.decode(str2, 8))) {
                throw new LicenseCheckException("Signature verification failed.");
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new LicenseCheckException(String.format("Could not find %s algorithm on the device", new Object[]{str3}), e4);
        } catch (InvalidKeyException e5) {
            throw new LicenseCheckException("Could not sign data with the public key", e5);
        } catch (SignatureException e6) {
            throw new LicenseCheckException("Could not parse returned signature.", e6);
        } catch (IllegalArgumentException e7) {
            throw new LicenseCheckException("Could not base64 decode returned signature", e7);
        }
    }

    private static PublicKey getPublicKey() throws LicenseCheckException {
        try {
            return KeyFactory.getInstance(KEY_FACTORY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(LicenseClient.getLicensePubKey(), 0)));
        } catch (NoSuchAlgorithmException e4) {
            throw new LicenseCheckException(String.format("%s algorithm not found on device", new Object[]{KEY_FACTORY_ALGORITHM}), e4);
        } catch (IllegalArgumentException e5) {
            throw new LicenseCheckException("Could not decode public key", e5);
        } catch (InvalidKeySpecException e6) {
            throw new LicenseCheckException("Could not create key specification from the public key", e6);
        }
    }

    private ResponseValidator() {
    }
}
