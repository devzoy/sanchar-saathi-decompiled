package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.p0  reason: case insensitive filesystem */
public final class C0534p0 {

    /* renamed from: a  reason: collision with root package name */
    public final C0551v0 f7525a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f7526b;

    public C0534p0(int i4) {
        byte[] bArr = new byte[i4];
        this.f7526b = bArr;
        this.f7525a = C0551v0.d(bArr);
    }

    public final C0507g0 a() {
        this.f7525a.J();
        return new C0539r0(this.f7526b);
    }

    public final C0551v0 b() {
        return this.f7525a;
    }

    public /* synthetic */ C0534p0(int i4, C0504f0 f0Var) {
        this(i4);
    }
}
