package com.google.android.gms.internal.clearcut;

public final class D {

    /* renamed from: a  reason: collision with root package name */
    public final K f6712a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f6713b;

    public D(int i4) {
        byte[] bArr = new byte[i4];
        this.f6713b = bArr;
        this.f6712a = K.P(bArr);
    }

    public final C0477y a() {
        if (this.f6712a.s() == 0) {
            return new F(this.f6713b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final K b() {
        return this.f6712a;
    }

    public /* synthetic */ D(int i4, C0480z zVar) {
        this(i4);
    }
}
