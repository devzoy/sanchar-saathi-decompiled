package com.google.android.gms.internal.clearcut;

public abstract class H {

    /* renamed from: a  reason: collision with root package name */
    public int f6793a;

    /* renamed from: b  reason: collision with root package name */
    public int f6794b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6795c;

    public H() {
        this.f6793a = 100;
        this.f6794b = Integer.MAX_VALUE;
        this.f6795c = false;
    }

    public static long a(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    public static H b(byte[] bArr, int i4, int i5, boolean z4) {
        J j4 = new J(bArr, 0, i5, false);
        try {
            j4.d(i5);
            return j4;
        } catch (C0425g0 e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static int e(int i4) {
        return (-(i4 & 1)) ^ (i4 >>> 1);
    }

    public abstract int c();

    public abstract int d(int i4);
}
