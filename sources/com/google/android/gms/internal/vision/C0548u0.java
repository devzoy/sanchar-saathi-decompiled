package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.u0  reason: case insensitive filesystem */
public final class C0548u0 extends C0545t0 {

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f7561d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7562e;

    /* renamed from: f  reason: collision with root package name */
    public int f7563f;

    /* renamed from: g  reason: collision with root package name */
    public int f7564g;

    /* renamed from: h  reason: collision with root package name */
    public int f7565h;

    /* renamed from: i  reason: collision with root package name */
    public int f7566i;

    /* renamed from: j  reason: collision with root package name */
    public int f7567j;

    public C0548u0(byte[] bArr, int i4, int i5, boolean z4) {
        super();
        this.f7567j = Integer.MAX_VALUE;
        this.f7561d = bArr;
        this.f7563f = i5 + i4;
        this.f7565h = i4;
        this.f7566i = i4;
        this.f7562e = z4;
    }

    public final int c(int i4) {
        if (i4 >= 0) {
            int e4 = i4 + e();
            int i5 = this.f7567j;
            if (e4 <= i5) {
                this.f7567j = e4;
                f();
                return i5;
            }
            throw W0.a();
        }
        throw W0.b();
    }

    public final int e() {
        return this.f7565h - this.f7566i;
    }

    public final void f() {
        int i4 = this.f7563f + this.f7564g;
        this.f7563f = i4;
        int i5 = i4 - this.f7566i;
        int i6 = this.f7567j;
        if (i5 > i6) {
            int i7 = i5 - i6;
            this.f7564g = i7;
            this.f7563f = i4 - i7;
            return;
        }
        this.f7564g = 0;
    }
}
