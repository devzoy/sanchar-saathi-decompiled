package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.t0  reason: case insensitive filesystem */
public abstract class C0545t0 {

    /* renamed from: a  reason: collision with root package name */
    public int f7558a;

    /* renamed from: b  reason: collision with root package name */
    public int f7559b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7560c;

    public C0545t0() {
        this.f7558a = 100;
        this.f7559b = Integer.MAX_VALUE;
        this.f7560c = false;
    }

    public static long a(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    public static C0545t0 b(byte[] bArr, int i4, int i5, boolean z4) {
        C0548u0 u0Var = new C0548u0(bArr, i5);
        try {
            u0Var.c(i5);
            return u0Var;
        } catch (W0 e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static int d(int i4) {
        return (-(i4 & 1)) ^ (i4 >>> 1);
    }

    public abstract int c(int i4);

    public abstract int e();
}
