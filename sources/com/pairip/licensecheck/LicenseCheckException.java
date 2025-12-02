package com.pairip.licensecheck;

public final class LicenseCheckException extends Exception {
    public LicenseCheckException(String str) {
        super(str);
    }

    public LicenseCheckException(String str, Throwable th) {
        super(str, th);
    }
}
