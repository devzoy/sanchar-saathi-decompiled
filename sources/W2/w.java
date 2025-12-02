package w2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static final i f12684a = new i("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                f12684a.d("Play Store package is disabled.", new Object[0]);
            } else {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (r0 = signatureArr.length) == 0) {
                        f12684a.d("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Signature byteArray : signatureArr) {
                            String a4 = v.a(byteArray.toByteArray());
                            arrayList.add(a4);
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(a4)) {
                                return true;
                            }
                            String str = Build.TAGS;
                            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(a4)) {
                                return true;
                            }
                        }
                        i iVar = f12684a;
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb.append((CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb.append(", ");
                            }
                        }
                        iVar.d(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", new Object[]{sb.toString()}), new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    f12684a.d("Play Store package is not found.", new Object[0]);
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            f12684a.d("Play Store package is not found.", new Object[0]);
        }
        return false;
    }
}
