package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s0;
import java.util.Arrays;

public final class n0 {

    /* renamed from: f  reason: collision with root package name */
    public static final n0 f5167f = new n0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f5168a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f5169b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f5170c;

    /* renamed from: d  reason: collision with root package name */
    public int f5171d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5172e;

    public n0() {
        this(0, new int[8], new Object[8], true);
    }

    public static n0 c() {
        return f5167f;
    }

    public static int f(int[] iArr, int i4) {
        int i5 = 17;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        return i5;
    }

    public static int g(Object[] objArr, int i4) {
        int i5 = 17;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 = (i5 * 31) + objArr[i6].hashCode();
        }
        return i5;
    }

    public static n0 j(n0 n0Var, n0 n0Var2) {
        int i4 = n0Var.f5168a + n0Var2.f5168a;
        int[] copyOf = Arrays.copyOf(n0Var.f5169b, i4);
        System.arraycopy(n0Var2.f5169b, 0, copyOf, n0Var.f5168a, n0Var2.f5168a);
        Object[] copyOf2 = Arrays.copyOf(n0Var.f5170c, i4);
        System.arraycopy(n0Var2.f5170c, 0, copyOf2, n0Var.f5168a, n0Var2.f5168a);
        return new n0(i4, copyOf, copyOf2, true);
    }

    public static n0 k() {
        return new n0();
    }

    public static boolean l(Object[] objArr, Object[] objArr2, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (!objArr[i5].equals(objArr2[i5])) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(int[] iArr, int[] iArr2, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (iArr[i5] != iArr2[i5]) {
                return false;
            }
        }
        return true;
    }

    public static void q(int i4, Object obj, s0 s0Var) {
        int a4 = r0.a(i4);
        int b4 = r0.b(i4);
        if (b4 == 0) {
            s0Var.c(a4, ((Long) obj).longValue());
        } else if (b4 == 1) {
            s0Var.w(a4, ((Long) obj).longValue());
        } else if (b4 == 2) {
            s0Var.l(a4, (C0355g) obj);
        } else if (b4 != 3) {
            if (b4 == 5) {
                s0Var.m(a4, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C0373z.e());
        } else if (s0Var.x() == s0.a.ASCENDING) {
            s0Var.h(a4);
            ((n0) obj).r(s0Var);
            s0Var.D(a4);
        } else {
            s0Var.D(a4);
            ((n0) obj).r(s0Var);
            s0Var.h(a4);
        }
    }

    public void a() {
        if (!this.f5172e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i4) {
        int[] iArr = this.f5169b;
        if (i4 > iArr.length) {
            int i5 = this.f5168a;
            int i6 = i5 + (i5 / 2);
            if (i6 >= i4) {
                i4 = i6;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            this.f5169b = Arrays.copyOf(iArr, i4);
            this.f5170c = Arrays.copyOf(this.f5170c, i4);
        }
    }

    public int d() {
        int R3;
        int i4 = this.f5171d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f5168a; i6++) {
            int i7 = this.f5169b[i6];
            int a4 = r0.a(i7);
            int b4 = r0.b(i7);
            if (b4 == 0) {
                R3 = C0358j.R(a4, ((Long) this.f5170c[i6]).longValue());
            } else if (b4 == 1) {
                R3 = C0358j.n(a4, ((Long) this.f5170c[i6]).longValue());
            } else if (b4 == 2) {
                R3 = C0358j.f(a4, (C0355g) this.f5170c[i6]);
            } else if (b4 == 3) {
                R3 = (C0358j.O(a4) * 2) + ((n0) this.f5170c[i6]).d();
            } else if (b4 == 5) {
                R3 = C0358j.l(a4, ((Integer) this.f5170c[i6]).intValue());
            } else {
                throw new IllegalStateException(C0373z.e());
            }
            i5 += R3;
        }
        this.f5171d = i5;
        return i5;
    }

    public int e() {
        int i4 = this.f5171d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f5168a; i6++) {
            i5 += C0358j.D(r0.a(this.f5169b[i6]), (C0355g) this.f5170c[i6]);
        }
        this.f5171d = i5;
        return i5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        int i4 = this.f5168a;
        return i4 == n0Var.f5168a && o(this.f5169b, n0Var.f5169b, i4) && l(this.f5170c, n0Var.f5170c, this.f5168a);
    }

    public void h() {
        if (this.f5172e) {
            this.f5172e = false;
        }
    }

    public int hashCode() {
        int i4 = this.f5168a;
        return ((((527 + i4) * 31) + f(this.f5169b, i4)) * 31) + g(this.f5170c, this.f5168a);
    }

    public n0 i(n0 n0Var) {
        if (n0Var.equals(c())) {
            return this;
        }
        a();
        int i4 = this.f5168a + n0Var.f5168a;
        b(i4);
        System.arraycopy(n0Var.f5169b, 0, this.f5169b, this.f5168a, n0Var.f5168a);
        System.arraycopy(n0Var.f5170c, 0, this.f5170c, this.f5168a, n0Var.f5168a);
        this.f5168a = i4;
        return this;
    }

    public final void m(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < this.f5168a; i5++) {
            S.d(sb, i4, String.valueOf(r0.a(this.f5169b[i5])), this.f5170c[i5]);
        }
    }

    public void n(int i4, Object obj) {
        a();
        b(this.f5168a + 1);
        int[] iArr = this.f5169b;
        int i5 = this.f5168a;
        iArr[i5] = i4;
        this.f5170c[i5] = obj;
        this.f5168a = i5 + 1;
    }

    public void p(s0 s0Var) {
        if (s0Var.x() == s0.a.DESCENDING) {
            for (int i4 = this.f5168a - 1; i4 >= 0; i4--) {
                s0Var.f(r0.a(this.f5169b[i4]), this.f5170c[i4]);
            }
            return;
        }
        for (int i5 = 0; i5 < this.f5168a; i5++) {
            s0Var.f(r0.a(this.f5169b[i5]), this.f5170c[i5]);
        }
    }

    public void r(s0 s0Var) {
        if (this.f5168a != 0) {
            if (s0Var.x() == s0.a.ASCENDING) {
                for (int i4 = 0; i4 < this.f5168a; i4++) {
                    q(this.f5169b[i4], this.f5170c[i4], s0Var);
                }
                return;
            }
            for (int i5 = this.f5168a - 1; i5 >= 0; i5--) {
                q(this.f5169b[i5], this.f5170c[i5], s0Var);
            }
        }
    }

    public n0(int i4, int[] iArr, Object[] objArr, boolean z4) {
        this.f5171d = -1;
        this.f5168a = i4;
        this.f5169b = iArr;
        this.f5170c = objArr;
        this.f5172e = z4;
    }
}
