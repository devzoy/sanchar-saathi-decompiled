package com.google.android.gms.common;

public abstract class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: e  reason: collision with root package name */
    public final int f6633e;

    public GooglePlayServicesManifestException(int i4, String str) {
        super(str);
        this.f6633e = i4;
    }
}
