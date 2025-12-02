package com.google.android.gms.internal.vision;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.vision.d2  reason: case insensitive filesystem */
public final class C0498d2 {

    /* renamed from: f  reason: collision with root package name */
    public static final C0498d2 f7427f = new C0498d2(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f7428a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f7429b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f7430c;

    /* renamed from: d  reason: collision with root package name */
    public int f7431d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7432e;

    public C0498d2() {
        this(0, new int[8], new Object[8], true);
    }

    public static C0498d2 a() {
        return f7427f;
    }

    public static C0498d2 b(C0498d2 d2Var, C0498d2 d2Var2) {
        int i4 = d2Var.f7428a + d2Var2.f7428a;
        int[] copyOf = Arrays.copyOf(d2Var.f7429b, i4);
        System.arraycopy(d2Var2.f7429b, 0, copyOf, d2Var.f7428a, d2Var2.f7428a);
        Object[] copyOf2 = Arrays.copyOf(d2Var.f7430c, i4);
        System.arraycopy(d2Var2.f7430c, 0, copyOf2, d2Var.f7428a, d2Var2.f7428a);
        return new C0498d2(i4, copyOf, copyOf2, true);
    }

    public static void d(int i4, Object obj, y2 y2Var) {
        int i5 = i4 >>> 3;
        int i6 = i4 & 7;
        if (i6 == 0) {
            y2Var.C(i5, ((Long) obj).longValue());
        } else if (i6 == 1) {
            y2Var.L(i5, ((Long) obj).longValue());
        } else if (i6 == 2) {
            y2Var.G(i5, (C0507g0) obj);
        } else if (i6 != 3) {
            if (i6 == 5) {
                y2Var.s(i5, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(W0.d());
        } else if (y2Var.a() == x2.f7606a) {
            y2Var.b(i5);
            ((C0498d2) obj).h(y2Var);
            y2Var.f(i5);
        } else {
            y2Var.f(i5);
            ((C0498d2) obj).h(y2Var);
            y2Var.b(i5);
        }
    }

    public static C0498d2 g() {
        return new C0498d2();
    }

    public final void c(int i4, Object obj) {
        if (this.f7432e) {
            int i5 = this.f7428a;
            int[] iArr = this.f7429b;
            if (i5 == iArr.length) {
                int i6 = i5 + (i5 < 4 ? 8 : i5 >> 1);
                this.f7429b = Arrays.copyOf(iArr, i6);
                this.f7430c = Arrays.copyOf(this.f7430c, i6);
            }
            int[] iArr2 = this.f7429b;
            int i7 = this.f7428a;
            iArr2[i7] = i4;
            this.f7430c[i7] = obj;
            this.f7428a = i7 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void e(y2 y2Var) {
        if (y2Var.a() == x2.f7607b) {
            for (int i4 = this.f7428a - 1; i4 >= 0; i4--) {
                y2Var.o(this.f7429b[i4] >>> 3, this.f7430c[i4]);
            }
            return;
        }
        for (int i5 = 0; i5 < this.f7428a; i5++) {
            y2Var.o(this.f7429b[i5] >>> 3, this.f7430c[i5]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0498d2)) {
            return false;
        }
        C0498d2 d2Var = (C0498d2) obj;
        int i4 = this.f7428a;
        if (i4 == d2Var.f7428a) {
            int[] iArr = this.f7429b;
            int[] iArr2 = d2Var.f7429b;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    Object[] objArr = this.f7430c;
                    Object[] objArr2 = d2Var.f7430c;
                    int i6 = this.f7428a;
                    int i7 = 0;
                    while (i7 < i6) {
                        if (objArr[i7].equals(objArr2[i7])) {
                            i7++;
                        }
                    }
                    return true;
                } else if (iArr[i5] != iArr2[i5]) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        return false;
    }

    public final void f(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < this.f7428a; i5++) {
            C0561y1.d(sb, i4, String.valueOf(this.f7429b[i5] >>> 3), this.f7430c[i5]);
        }
    }

    public final void h(y2 y2Var) {
        if (this.f7428a != 0) {
            if (y2Var.a() == x2.f7606a) {
                for (int i4 = 0; i4 < this.f7428a; i4++) {
                    d(this.f7429b[i4], this.f7430c[i4], y2Var);
                }
                return;
            }
            for (int i5 = this.f7428a - 1; i5 >= 0; i5--) {
                d(this.f7429b[i5], this.f7430c[i5], y2Var);
            }
        }
    }

    public final int hashCode() {
        int i4 = this.f7428a;
        int i5 = (i4 + 527) * 31;
        int[] iArr = this.f7429b;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i4; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = (i5 + i7) * 31;
        Object[] objArr = this.f7430c;
        int i10 = this.f7428a;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }

    public final void i() {
        this.f7432e = false;
    }

    public final int j() {
        int i4 = this.f7431d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f7428a; i6++) {
            i5 += C0551v0.Y(this.f7429b[i6] >>> 3, (C0507g0) this.f7430c[i6]);
        }
        this.f7431d = i5;
        return i5;
    }

    public final int k() {
        int d02;
        int i4 = this.f7431d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f7428a; i6++) {
            int i7 = this.f7429b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                d02 = C0551v0.d0(i8, ((Long) this.f7430c[i6]).longValue());
            } else if (i9 == 1) {
                d02 = C0551v0.m0(i8, ((Long) this.f7430c[i6]).longValue());
            } else if (i9 == 2) {
                d02 = C0551v0.P(i8, (C0507g0) this.f7430c[i6]);
            } else if (i9 == 3) {
                d02 = (C0551v0.c0(i8) << 1) + ((C0498d2) this.f7430c[i6]).k();
            } else if (i9 == 5) {
                d02 = C0551v0.t0(i8, ((Integer) this.f7430c[i6]).intValue());
            } else {
                throw new IllegalStateException(W0.d());
            }
            i5 += d02;
        }
        this.f7431d = i5;
        return i5;
    }

    public C0498d2(int i4, int[] iArr, Object[] objArr, boolean z4) {
        this.f7431d = -1;
        this.f7428a = i4;
        this.f7429b = iArr;
        this.f7430c = objArr;
        this.f7432e = z4;
    }
}
