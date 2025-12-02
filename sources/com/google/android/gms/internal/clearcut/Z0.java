package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0407a0;
import java.util.Arrays;

public final class Z0 {

    /* renamed from: f  reason: collision with root package name */
    public static final Z0 f6995f = new Z0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f6996a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f6997b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f6998c;

    /* renamed from: d  reason: collision with root package name */
    public int f6999d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7000e;

    public Z0() {
        this(0, new int[8], new Object[8], true);
    }

    public static Z0 a(Z0 z02, Z0 z03) {
        int i4 = z02.f6996a + z03.f6996a;
        int[] copyOf = Arrays.copyOf(z02.f6997b, i4);
        System.arraycopy(z03.f6997b, 0, copyOf, z02.f6996a, z03.f6996a);
        Object[] copyOf2 = Arrays.copyOf(z02.f6998c, i4);
        System.arraycopy(z03.f6998c, 0, copyOf2, z02.f6996a, z03.f6996a);
        return new Z0(i4, copyOf, copyOf2, true);
    }

    public static void f(int i4, Object obj, C0464t1 t1Var) {
        int i5 = i4 >>> 3;
        int i6 = i4 & 7;
        if (i6 == 0) {
            t1Var.S(i5, ((Long) obj).longValue());
        } else if (i6 == 1) {
            t1Var.n(i5, ((Long) obj).longValue());
        } else if (i6 == 2) {
            t1Var.G(i5, (C0477y) obj);
        } else if (i6 != 3) {
            if (i6 == 5) {
                t1Var.e(i5, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C0425g0.c());
        } else if (t1Var.O() == C0407a0.c.f7031l) {
            t1Var.K(i5);
            ((Z0) obj).g(t1Var);
            t1Var.P(i5);
        } else {
            t1Var.P(i5);
            ((Z0) obj).g(t1Var);
            t1Var.K(i5);
        }
    }

    public static Z0 h() {
        return f6995f;
    }

    public static Z0 i() {
        return new Z0();
    }

    public final void b(C0464t1 t1Var) {
        if (t1Var.O() == C0407a0.c.f7032m) {
            for (int i4 = this.f6996a - 1; i4 >= 0; i4--) {
                t1Var.o(this.f6997b[i4] >>> 3, this.f6998c[i4]);
            }
            return;
        }
        for (int i5 = 0; i5 < this.f6996a; i5++) {
            t1Var.o(this.f6997b[i5] >>> 3, this.f6998c[i5]);
        }
    }

    public final void c(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < this.f6996a; i5++) {
            E0.c(sb, i4, String.valueOf(this.f6997b[i5] >>> 3), this.f6998c[i5]);
        }
    }

    public final int d() {
        int X3;
        int i4 = this.f6999d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f6996a; i6++) {
            int i7 = this.f6997b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                X3 = K.X(i8, ((Long) this.f6998c[i6]).longValue());
            } else if (i9 == 1) {
                X3 = K.e0(i8, ((Long) this.f6998c[i6]).longValue());
            } else if (i9 == 2) {
                X3 = K.K(i8, (C0477y) this.f6998c[i6]);
            } else if (i9 == 3) {
                X3 = (K.v0(i8) << 1) + ((Z0) this.f6998c[i6]).d();
            } else if (i9 == 5) {
                X3 = K.n0(i8, ((Integer) this.f6998c[i6]).intValue());
            } else {
                throw new IllegalStateException(C0425g0.c());
            }
            i5 += X3;
        }
        this.f6999d = i5;
        return i5;
    }

    public final void e(int i4, Object obj) {
        if (this.f7000e) {
            int i5 = this.f6996a;
            int[] iArr = this.f6997b;
            if (i5 == iArr.length) {
                int i6 = i5 + (i5 < 4 ? 8 : i5 >> 1);
                this.f6997b = Arrays.copyOf(iArr, i6);
                this.f6998c = Arrays.copyOf(this.f6998c, i6);
            }
            int[] iArr2 = this.f6997b;
            int i7 = this.f6996a;
            iArr2[i7] = i4;
            this.f6998c[i7] = obj;
            this.f6996a = i7 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Z0)) {
            return false;
        }
        Z0 z02 = (Z0) obj;
        int i4 = this.f6996a;
        if (i4 == z02.f6996a) {
            int[] iArr = this.f6997b;
            int[] iArr2 = z02.f6997b;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    Object[] objArr = this.f6998c;
                    Object[] objArr2 = z02.f6998c;
                    int i6 = this.f6996a;
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

    public final void g(C0464t1 t1Var) {
        if (this.f6996a != 0) {
            if (t1Var.O() == C0407a0.c.f7031l) {
                for (int i4 = 0; i4 < this.f6996a; i4++) {
                    f(this.f6997b[i4], this.f6998c[i4], t1Var);
                }
                return;
            }
            for (int i5 = this.f6996a - 1; i5 >= 0; i5--) {
                f(this.f6997b[i5], this.f6998c[i5], t1Var);
            }
        }
    }

    public final int hashCode() {
        int i4 = this.f6996a;
        int i5 = (i4 + 527) * 31;
        int[] iArr = this.f6997b;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i4; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = (i5 + i7) * 31;
        Object[] objArr = this.f6998c;
        int i10 = this.f6996a;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }

    public final int j() {
        int i4 = this.f6999d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f6996a; i6++) {
            i5 += K.U(this.f6997b[i6] >>> 3, (C0477y) this.f6998c[i6]);
        }
        this.f6999d = i5;
        return i5;
    }

    public final void k() {
        this.f7000e = false;
    }

    public Z0(int i4, int[] iArr, Object[] objArr, boolean z4) {
        this.f6999d = -1;
        this.f6996a = i4;
        this.f6997b = iArr;
        this.f6998c = objArr;
        this.f7000e = z4;
    }
}
