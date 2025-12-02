package com.google.android.gms.internal.clearcut;

public final class J extends H {

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f6796d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6797e;

    /* renamed from: f  reason: collision with root package name */
    public int f6798f;

    /* renamed from: g  reason: collision with root package name */
    public int f6799g;

    /* renamed from: h  reason: collision with root package name */
    public int f6800h;

    /* renamed from: i  reason: collision with root package name */
    public int f6801i;

    /* renamed from: j  reason: collision with root package name */
    public int f6802j;

    public J(byte[] bArr, int i4, int i5, boolean z4) {
        super();
        this.f6802j = Integer.MAX_VALUE;
        this.f6796d = bArr;
        this.f6798f = i5 + i4;
        this.f6800h = i4;
        this.f6801i = i4;
        this.f6797e = z4;
    }

    public final int c() {
        return this.f6800h - this.f6801i;
    }

    public final int d(int i4) {
        if (i4 >= 0) {
            int c4 = i4 + c();
            int i5 = this.f6802j;
            if (c4 <= i5) {
                this.f6802j = c4;
                int i6 = this.f6798f + this.f6799g;
                this.f6798f = i6;
                int i7 = i6 - this.f6801i;
                if (i7 > c4) {
                    int i8 = i7 - c4;
                    this.f6799g = i8;
                    this.f6798f = i6 - i8;
                } else {
                    this.f6799g = 0;
                }
                return i5;
            }
            throw C0425g0.a();
        }
        throw new C0425g0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
