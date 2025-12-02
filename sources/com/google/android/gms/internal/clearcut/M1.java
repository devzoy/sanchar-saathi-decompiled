package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

public final class M1 extends C0473w1 implements Cloneable {

    /* renamed from: A  reason: collision with root package name */
    public D1 f6830A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f6831B;

    /* renamed from: f  reason: collision with root package name */
    public long f6832f = 0;

    /* renamed from: g  reason: collision with root package name */
    public long f6833g = 0;

    /* renamed from: h  reason: collision with root package name */
    public long f6834h = 0;

    /* renamed from: i  reason: collision with root package name */
    public String f6835i = "";

    /* renamed from: j  reason: collision with root package name */
    public int f6836j = 0;

    /* renamed from: k  reason: collision with root package name */
    public String f6837k = "";

    /* renamed from: l  reason: collision with root package name */
    public int f6838l = 0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6839m = false;

    /* renamed from: n  reason: collision with root package name */
    public N1[] f6840n = N1.l();

    /* renamed from: o  reason: collision with root package name */
    public byte[] f6841o;

    /* renamed from: p  reason: collision with root package name */
    public C1 f6842p;

    /* renamed from: q  reason: collision with root package name */
    public byte[] f6843q;

    /* renamed from: r  reason: collision with root package name */
    public String f6844r;

    /* renamed from: s  reason: collision with root package name */
    public String f6845s;

    /* renamed from: t  reason: collision with root package name */
    public String f6846t;

    /* renamed from: u  reason: collision with root package name */
    public long f6847u;

    /* renamed from: v  reason: collision with root package name */
    public byte[] f6848v;

    /* renamed from: w  reason: collision with root package name */
    public String f6849w;

    /* renamed from: x  reason: collision with root package name */
    public int f6850x;

    /* renamed from: y  reason: collision with root package name */
    public int[] f6851y;

    /* renamed from: z  reason: collision with root package name */
    public long f6852z;

    public M1() {
        byte[] bArr = B1.f6711h;
        this.f6841o = bArr;
        this.f6842p = null;
        this.f6843q = bArr;
        this.f6844r = "";
        this.f6845s = "";
        this.f6846t = "";
        this.f6847u = 180000;
        this.f6848v = bArr;
        this.f6849w = "";
        this.f6850x = 0;
        this.f6851y = B1.f6704a;
        this.f6852z = 0;
        this.f6830A = null;
        this.f6831B = false;
        this.f7186e = -1;
    }

    public final void a(C0467u1 u1Var) {
        long j4 = this.f6832f;
        if (j4 != 0) {
            u1Var.r(1, j4);
        }
        String str = this.f6835i;
        if (str != null && !str.equals("")) {
            u1Var.b(2, this.f6835i);
        }
        N1[] n1Arr = this.f6840n;
        int i4 = 0;
        if (n1Arr != null && n1Arr.length > 0) {
            int i5 = 0;
            while (true) {
                N1[] n1Arr2 = this.f6840n;
                if (i5 >= n1Arr2.length) {
                    break;
                }
                N1 n12 = n1Arr2[i5];
                i5++;
            }
        }
        byte[] bArr = this.f6841o;
        byte[] bArr2 = B1.f6711h;
        if (!Arrays.equals(bArr, bArr2)) {
            u1Var.c(4, this.f6841o);
        }
        if (!Arrays.equals(this.f6843q, bArr2)) {
            u1Var.c(6, this.f6843q);
        }
        String str2 = this.f6844r;
        if (str2 != null && !str2.equals("")) {
            u1Var.b(8, this.f6844r);
        }
        C1 c12 = this.f6842p;
        if (c12 != null) {
            u1Var.m(9, c12);
        }
        int i6 = this.f6836j;
        if (i6 != 0) {
            u1Var.j(11, i6);
        }
        String str3 = this.f6845s;
        if (str3 != null && !str3.equals("")) {
            u1Var.b(13, this.f6845s);
        }
        String str4 = this.f6846t;
        if (str4 != null && !str4.equals("")) {
            u1Var.b(14, this.f6846t);
        }
        long j5 = this.f6847u;
        if (j5 != 180000) {
            u1Var.h(15, 0);
            u1Var.t(C0467u1.s(j5));
        }
        long j6 = this.f6833g;
        if (j6 != 0) {
            u1Var.r(17, j6);
        }
        if (!Arrays.equals(this.f6848v, bArr2)) {
            u1Var.c(18, this.f6848v);
        }
        int[] iArr = this.f6851y;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f6851y;
                if (i4 >= iArr2.length) {
                    break;
                }
                u1Var.j(20, iArr2[i4]);
                i4++;
            }
        }
        D1 d12 = this.f6830A;
        if (d12 != null) {
            u1Var.m(23, d12);
        }
        String str5 = this.f6849w;
        if (str5 != null && !str5.equals("")) {
            u1Var.b(24, this.f6849w);
        }
        boolean z4 = this.f6831B;
        if (z4) {
            u1Var.i(25, z4);
        }
        String str6 = this.f6837k;
        if (str6 != null && !str6.equals("")) {
            u1Var.b(26, this.f6837k);
        }
        super.a(u1Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M1)) {
            return false;
        }
        M1 m12 = (M1) obj;
        if (this.f6832f != m12.f6832f || this.f6833g != m12.f6833g) {
            return false;
        }
        String str = this.f6835i;
        if (str == null) {
            if (m12.f6835i != null) {
                return false;
            }
        } else if (!str.equals(m12.f6835i)) {
            return false;
        }
        if (this.f6836j != m12.f6836j) {
            return false;
        }
        String str2 = this.f6837k;
        if (str2 == null) {
            if (m12.f6837k != null) {
                return false;
            }
        } else if (!str2.equals(m12.f6837k)) {
            return false;
        }
        if (!C0476x1.b(this.f6840n, m12.f6840n) || !Arrays.equals(this.f6841o, m12.f6841o)) {
            return false;
        }
        C1 c12 = this.f6842p;
        if (c12 == null) {
            if (m12.f6842p != null) {
                return false;
            }
        } else if (!c12.equals(m12.f6842p)) {
            return false;
        }
        if (!Arrays.equals(this.f6843q, m12.f6843q)) {
            return false;
        }
        String str3 = this.f6844r;
        if (str3 == null) {
            if (m12.f6844r != null) {
                return false;
            }
        } else if (!str3.equals(m12.f6844r)) {
            return false;
        }
        String str4 = this.f6845s;
        if (str4 == null) {
            if (m12.f6845s != null) {
                return false;
            }
        } else if (!str4.equals(m12.f6845s)) {
            return false;
        }
        String str5 = this.f6846t;
        if (str5 == null) {
            if (m12.f6846t != null) {
                return false;
            }
        } else if (!str5.equals(m12.f6846t)) {
            return false;
        }
        if (this.f6847u != m12.f6847u || !Arrays.equals(this.f6848v, m12.f6848v)) {
            return false;
        }
        String str6 = this.f6849w;
        if (str6 == null) {
            if (m12.f6849w != null) {
                return false;
            }
        } else if (!str6.equals(m12.f6849w)) {
            return false;
        }
        if (!C0476x1.a(this.f6851y, m12.f6851y)) {
            return false;
        }
        D1 d12 = this.f6830A;
        if (d12 == null) {
            if (m12.f6830A != null) {
                return false;
            }
        } else if (!d12.equals(m12.f6830A)) {
            return false;
        }
        return this.f6831B == m12.f6831B;
    }

    public final int g() {
        int[] iArr;
        int g4 = super.g();
        long j4 = this.f6832f;
        if (j4 != 0) {
            g4 += C0467u1.k(1, j4);
        }
        String str = this.f6835i;
        if (str != null && !str.equals("")) {
            g4 += C0467u1.f(2, this.f6835i);
        }
        N1[] n1Arr = this.f6840n;
        int i4 = 0;
        if (n1Arr != null && n1Arr.length > 0) {
            int i5 = 0;
            while (true) {
                N1[] n1Arr2 = this.f6840n;
                if (i5 >= n1Arr2.length) {
                    break;
                }
                N1 n12 = n1Arr2[i5];
                i5++;
            }
        }
        byte[] bArr = this.f6841o;
        byte[] bArr2 = B1.f6711h;
        if (!Arrays.equals(bArr, bArr2)) {
            g4 += C0467u1.g(4, this.f6841o);
        }
        if (!Arrays.equals(this.f6843q, bArr2)) {
            g4 += C0467u1.g(6, this.f6843q);
        }
        String str2 = this.f6844r;
        if (str2 != null && !str2.equals("")) {
            g4 += C0467u1.f(8, this.f6844r);
        }
        C1 c12 = this.f6842p;
        if (c12 != null) {
            g4 += K.L(9, c12);
        }
        int i6 = this.f6836j;
        if (i6 != 0) {
            g4 += C0467u1.v(11) + C0467u1.w(i6);
        }
        String str3 = this.f6845s;
        if (str3 != null && !str3.equals("")) {
            g4 += C0467u1.f(13, this.f6845s);
        }
        String str4 = this.f6846t;
        if (str4 != null && !str4.equals("")) {
            g4 += C0467u1.f(14, this.f6846t);
        }
        long j5 = this.f6847u;
        if (j5 != 180000) {
            g4 += C0467u1.v(15) + C0467u1.u(C0467u1.s(j5));
        }
        long j6 = this.f6833g;
        if (j6 != 0) {
            g4 += C0467u1.k(17, j6);
        }
        if (!Arrays.equals(this.f6848v, bArr2)) {
            g4 += C0467u1.g(18, this.f6848v);
        }
        int[] iArr2 = this.f6851y;
        if (iArr2 != null && iArr2.length > 0) {
            int i7 = 0;
            while (true) {
                iArr = this.f6851y;
                if (i4 >= iArr.length) {
                    break;
                }
                i7 += C0467u1.w(iArr[i4]);
                i4++;
            }
            g4 = g4 + i7 + (iArr.length * 2);
        }
        D1 d12 = this.f6830A;
        if (d12 != null) {
            g4 += K.L(23, d12);
        }
        String str5 = this.f6849w;
        if (str5 != null && !str5.equals("")) {
            g4 += C0467u1.f(24, this.f6849w);
        }
        if (this.f6831B) {
            g4 += C0467u1.v(25) + 1;
        }
        String str6 = this.f6837k;
        return (str6 == null || str6.equals("")) ? g4 : g4 + C0467u1.f(26, this.f6837k);
    }

    public final int hashCode() {
        long j4 = this.f6832f;
        long j5 = this.f6833g;
        int hashCode = (((((M1.class.getName().hashCode() + 527) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 961;
        String str = this.f6835i;
        int i4 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f6836j) * 31;
        String str2 = this.f6837k;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        int i5 = 1237;
        int d4 = ((((((hashCode2 + hashCode3) * 961) + 1237) * 31) + C0476x1.d(this.f6840n)) * 31) + Arrays.hashCode(this.f6841o);
        C1 c12 = this.f6842p;
        int hashCode4 = ((((d4 * 31) + (c12 == null ? 0 : c12.hashCode())) * 31) + Arrays.hashCode(this.f6843q)) * 31;
        String str3 = this.f6844r;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f6845s;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 961;
        String str5 = this.f6846t;
        int hashCode7 = str5 == null ? 0 : str5.hashCode();
        long j6 = this.f6847u;
        int hashCode8 = (((((hashCode6 + hashCode7) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 961) + Arrays.hashCode(this.f6848v)) * 31;
        String str6 = this.f6849w;
        int hashCode9 = ((hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 961) + C0476x1.c(this.f6851y);
        D1 d12 = this.f6830A;
        int i6 = hashCode9 * 961;
        if (d12 != null) {
            i4 = d12.hashCode();
        }
        int i7 = (i6 + i4) * 31;
        if (this.f6831B) {
            i5 = 1231;
        }
        return (i7 + i5) * 31;
    }

    /* renamed from: l */
    public final M1 clone() {
        try {
            M1 m12 = (M1) super.k();
            N1[] n1Arr = this.f6840n;
            if (n1Arr != null && n1Arr.length > 0) {
                m12.f6840n = new N1[n1Arr.length];
                int i4 = 0;
                while (true) {
                    N1[] n1Arr2 = this.f6840n;
                    if (i4 >= n1Arr2.length) {
                        break;
                    }
                    N1 n12 = n1Arr2[i4];
                    i4++;
                }
            }
            C1 c12 = this.f6842p;
            if (c12 != null) {
                m12.f6842p = c12;
            }
            int[] iArr = this.f6851y;
            if (iArr != null && iArr.length > 0) {
                m12.f6851y = (int[]) iArr.clone();
            }
            D1 d12 = this.f6830A;
            if (d12 != null) {
                m12.f6830A = d12;
            }
            return m12;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }
}
