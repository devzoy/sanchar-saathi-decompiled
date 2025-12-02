package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.vision.v0  reason: case insensitive filesystem */
public abstract class C0551v0 extends C0496d0 {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f7568b = Logger.getLogger(C0551v0.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f7569c = h2.m();

    /* renamed from: a  reason: collision with root package name */
    public C0557x0 f7570a;

    /* renamed from: com.google.android.gms.internal.vision.v0$a */
    public static class a extends C0551v0 {

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f7571d;

        /* renamed from: e  reason: collision with root package name */
        public final int f7572e;

        /* renamed from: f  reason: collision with root package name */
        public final int f7573f;

        /* renamed from: g  reason: collision with root package name */
        public int f7574g;

        public a(byte[] bArr, int i4, int i5) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if (((bArr.length - i5) | i5) >= 0) {
                this.f7571d = bArr;
                this.f7572e = 0;
                this.f7574g = 0;
                this.f7573f = i5;
            } else {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i5)}));
            }
        }

        public final void B0(byte[] bArr, int i4, int i5) {
            try {
                System.arraycopy(bArr, i4, this.f7571d, this.f7574g, i5);
                this.f7574g += i5;
            } catch (IndexOutOfBoundsException e4) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7574g), Integer.valueOf(this.f7573f), Integer.valueOf(i5)}), e4);
            }
        }

        public final void K(int i4) {
            if (!C0551v0.f7569c || Z.b() || b() < 5) {
                while ((i4 & -128) != 0) {
                    byte[] bArr = this.f7571d;
                    int i5 = this.f7574g;
                    this.f7574g = i5 + 1;
                    bArr[i5] = (byte) ((i4 & 127) | 128);
                    i4 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f7571d;
                    int i6 = this.f7574g;
                    this.f7574g = i6 + 1;
                    bArr2[i6] = (byte) i4;
                } catch (IndexOutOfBoundsException e4) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7574g), Integer.valueOf(this.f7573f), 1}), e4);
                }
            } else if ((i4 & -128) == 0) {
                byte[] bArr3 = this.f7571d;
                int i7 = this.f7574g;
                this.f7574g = i7 + 1;
                h2.l(bArr3, (long) i7, (byte) i4);
            } else {
                byte[] bArr4 = this.f7571d;
                int i8 = this.f7574g;
                this.f7574g = i8 + 1;
                h2.l(bArr4, (long) i8, (byte) (i4 | 128));
                int i9 = i4 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr5 = this.f7571d;
                    int i10 = this.f7574g;
                    this.f7574g = i10 + 1;
                    h2.l(bArr5, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr6 = this.f7571d;
                int i11 = this.f7574g;
                this.f7574g = i11 + 1;
                h2.l(bArr6, (long) i11, (byte) (i9 | 128));
                int i12 = i4 >>> 14;
                if ((i12 & -128) == 0) {
                    byte[] bArr7 = this.f7571d;
                    int i13 = this.f7574g;
                    this.f7574g = i13 + 1;
                    h2.l(bArr7, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr8 = this.f7571d;
                int i14 = this.f7574g;
                this.f7574g = i14 + 1;
                h2.l(bArr8, (long) i14, (byte) (i12 | 128));
                int i15 = i4 >>> 21;
                if ((i15 & -128) == 0) {
                    byte[] bArr9 = this.f7571d;
                    int i16 = this.f7574g;
                    this.f7574g = i16 + 1;
                    h2.l(bArr9, (long) i16, (byte) i15);
                    return;
                }
                byte[] bArr10 = this.f7571d;
                int i17 = this.f7574g;
                this.f7574g = i17 + 1;
                h2.l(bArr10, (long) i17, (byte) (i15 | 128));
                byte[] bArr11 = this.f7571d;
                int i18 = this.f7574g;
                this.f7574g = i18 + 1;
                h2.l(bArr11, (long) i18, (byte) (i4 >>> 28));
            }
        }

        public final void L(int i4, int i5) {
            k(i4, 0);
            h(i5);
        }

        public final void N(int i4, C0507g0 g0Var) {
            k(1, 3);
            T(2, i4);
            m(3, g0Var);
            k(1, 4);
        }

        public final void T(int i4, int i5) {
            k(i4, 0);
            K(i5);
        }

        public final void U(int i4, long j4) {
            k(i4, 1);
            V(j4);
        }

        public final void V(long j4) {
            try {
                byte[] bArr = this.f7571d;
                int i4 = this.f7574g;
                int i5 = i4 + 1;
                this.f7574g = i5;
                bArr[i4] = (byte) ((int) j4);
                int i6 = i4 + 2;
                this.f7574g = i6;
                bArr[i5] = (byte) ((int) (j4 >> 8));
                int i7 = i4 + 3;
                this.f7574g = i7;
                bArr[i6] = (byte) ((int) (j4 >> 16));
                int i8 = i4 + 4;
                this.f7574g = i8;
                bArr[i7] = (byte) ((int) (j4 >> 24));
                int i9 = i4 + 5;
                this.f7574g = i9;
                bArr[i8] = (byte) ((int) (j4 >> 32));
                int i10 = i4 + 6;
                this.f7574g = i10;
                bArr[i9] = (byte) ((int) (j4 >> 40));
                int i11 = i4 + 7;
                this.f7574g = i11;
                bArr[i10] = (byte) ((int) (j4 >> 48));
                this.f7574g = i4 + 8;
                bArr[i11] = (byte) ((int) (j4 >> 56));
            } catch (IndexOutOfBoundsException e4) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7574g), Integer.valueOf(this.f7573f), 1}), e4);
            }
        }

        public final void a(byte[] bArr, int i4, int i5) {
            B0(bArr, i4, i5);
        }

        public final void a0(int i4) {
            try {
                byte[] bArr = this.f7571d;
                int i5 = this.f7574g;
                int i6 = i5 + 1;
                this.f7574g = i6;
                bArr[i5] = (byte) i4;
                int i7 = i5 + 2;
                this.f7574g = i7;
                bArr[i6] = (byte) (i4 >> 8);
                int i8 = i5 + 3;
                this.f7574g = i8;
                bArr[i7] = (byte) (i4 >> 16);
                this.f7574g = i5 + 4;
                bArr[i8] = (byte) (i4 >>> 24);
            } catch (IndexOutOfBoundsException e4) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7574g), Integer.valueOf(this.f7573f), 1}), e4);
            }
        }

        public final int b() {
            return this.f7573f - this.f7574g;
        }

        public final void e(byte b4) {
            try {
                byte[] bArr = this.f7571d;
                int i4 = this.f7574g;
                this.f7574g = i4 + 1;
                bArr[i4] = b4;
            } catch (IndexOutOfBoundsException e4) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7574g), Integer.valueOf(this.f7573f), 1}), e4);
            }
        }

        public final void f0(int i4, int i5) {
            k(i4, 5);
            a0(i5);
        }

        public final void h(int i4) {
            if (i4 >= 0) {
                K(i4);
            } else {
                r((long) i4);
            }
        }

        public final void k(int i4, int i5) {
            K((i4 << 3) | i5);
        }

        public final void l(int i4, long j4) {
            k(i4, 0);
            r(j4);
        }

        public final void m(int i4, C0507g0 g0Var) {
            k(i4, 2);
            s(g0Var);
        }

        public final void n(int i4, C0546t1 t1Var) {
            k(1, 3);
            T(2, i4);
            k(3, 2);
            t(t1Var);
            k(1, 4);
        }

        public final void o(int i4, C0546t1 t1Var, K1 k12) {
            k(i4, 2);
            X x4 = (X) t1Var;
            int k4 = x4.k();
            if (k4 == -1) {
                k4 = k12.g(x4);
                x4.i(k4);
            }
            K(k4);
            k12.h(t1Var, this.f7570a);
        }

        public final void p(int i4, String str) {
            k(i4, 2);
            u(str);
        }

        public final void q(int i4, boolean z4) {
            k(i4, 0);
            e(z4 ? (byte) 1 : 0);
        }

        public final void r(long j4) {
            if (!C0551v0.f7569c || b() < 10) {
                while ((j4 & -128) != 0) {
                    byte[] bArr = this.f7571d;
                    int i4 = this.f7574g;
                    this.f7574g = i4 + 1;
                    bArr[i4] = (byte) ((((int) j4) & 127) | 128);
                    j4 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f7571d;
                    int i5 = this.f7574g;
                    this.f7574g = i5 + 1;
                    bArr2[i5] = (byte) ((int) j4);
                } catch (IndexOutOfBoundsException e4) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7574g), Integer.valueOf(this.f7573f), 1}), e4);
                }
            } else {
                while ((j4 & -128) != 0) {
                    byte[] bArr3 = this.f7571d;
                    int i6 = this.f7574g;
                    this.f7574g = i6 + 1;
                    h2.l(bArr3, (long) i6, (byte) ((((int) j4) & 127) | 128));
                    j4 >>>= 7;
                }
                byte[] bArr4 = this.f7571d;
                int i7 = this.f7574g;
                this.f7574g = i7 + 1;
                h2.l(bArr4, (long) i7, (byte) ((int) j4));
            }
        }

        public final void s(C0507g0 g0Var) {
            K(g0Var.t());
            g0Var.A(this);
        }

        public final void t(C0546t1 t1Var) {
            K(t1Var.g());
            t1Var.b(this);
        }

        public final void u(String str) {
            int i4 = this.f7574g;
            try {
                int k02 = C0551v0.k0(str.length() * 3);
                int k03 = C0551v0.k0(str.length());
                if (k03 == k02) {
                    int i5 = i4 + k03;
                    this.f7574g = i5;
                    int e4 = k2.e(str, this.f7571d, i5, b());
                    this.f7574g = i4;
                    K((e4 - i4) - k03);
                    this.f7574g = e4;
                    return;
                }
                K(k2.d(str));
                this.f7574g = k2.e(str, this.f7571d, this.f7574g, b());
            } catch (n2 e5) {
                this.f7574g = i4;
                v(str, e5);
            } catch (IndexOutOfBoundsException e6) {
                throw new b(e6);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.v0$b */
    public static class b extends IOException {
        public b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C0551v0.b.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    public C0551v0() {
    }

    public static int A(int i4, float f4) {
        return k0(i4 << 3) + 4;
    }

    public static int A0(int i4) {
        return (i4 >> 31) ^ (i4 << 1);
    }

    public static int B(int i4, C0546t1 t1Var, K1 k12) {
        return k0(i4 << 3) + c(t1Var, k12);
    }

    public static int C(int i4, String str) {
        return k0(i4 << 3) + G(str);
    }

    public static int D(int i4, boolean z4) {
        return k0(i4 << 3) + 1;
    }

    public static int E(C0507g0 g0Var) {
        int t4 = g0Var.t();
        return k0(t4) + t4;
    }

    public static int F(C0546t1 t1Var) {
        int g4 = t1Var.g();
        return k0(g4) + g4;
    }

    public static int G(String str) {
        int i4;
        try {
            i4 = k2.d(str);
        } catch (n2 unused) {
            i4 = str.getBytes(R0.f7357a).length;
        }
        return k0(i4) + i4;
    }

    public static int H(boolean z4) {
        return 1;
    }

    public static int I(byte[] bArr) {
        int length = bArr.length;
        return k0(length) + length;
    }

    public static int P(int i4, C0507g0 g0Var) {
        int k02 = k0(i4 << 3);
        int t4 = g0Var.t();
        return k02 + k0(t4) + t4;
    }

    public static int Q(int i4, C0546t1 t1Var, K1 k12) {
        int k02 = k0(i4 << 3) << 1;
        X x4 = (X) t1Var;
        int k4 = x4.k();
        if (k4 == -1) {
            k4 = k12.g(x4);
            x4.i(k4);
        }
        return k02 + k4;
    }

    public static int R(C0546t1 t1Var) {
        return t1Var.g();
    }

    public static int X(int i4, long j4) {
        return k0(i4 << 3) + e0(j4);
    }

    public static int Y(int i4, C0507g0 g0Var) {
        return (k0(8) << 1) + l0(2, i4) + P(3, g0Var);
    }

    public static int Z(long j4) {
        return e0(j4);
    }

    public static int c(C0546t1 t1Var, K1 k12) {
        X x4 = (X) t1Var;
        int k4 = x4.k();
        if (k4 == -1) {
            k4 = k12.g(x4);
            x4.i(k4);
        }
        return k0(k4) + k4;
    }

    public static int c0(int i4) {
        return k0(i4 << 3);
    }

    public static C0551v0 d(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int d0(int i4, long j4) {
        return k0(i4 << 3) + e0(j4);
    }

    public static int e0(long j4) {
        int i4;
        if ((-128 & j4) == 0) {
            return 1;
        }
        if (j4 < 0) {
            return 10;
        }
        if ((-34359738368L & j4) != 0) {
            j4 >>>= 28;
            i4 = 6;
        } else {
            i4 = 2;
        }
        if ((-2097152 & j4) != 0) {
            i4 += 2;
            j4 >>>= 14;
        }
        return (j4 & -16384) != 0 ? i4 + 1 : i4;
    }

    public static int g0(int i4) {
        if (i4 >= 0) {
            return k0(i4);
        }
        return 10;
    }

    public static int h0(int i4, int i5) {
        return k0(i4 << 3) + g0(i5);
    }

    public static int i0(int i4, long j4) {
        return k0(i4 << 3) + e0(u0(j4));
    }

    public static int j0(long j4) {
        return e0(u0(j4));
    }

    public static int k0(int i4) {
        if ((i4 & -128) == 0) {
            return 1;
        }
        if ((i4 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i4) == 0) {
            return 3;
        }
        return (i4 & -268435456) == 0 ? 4 : 5;
    }

    public static int l0(int i4, int i5) {
        return k0(i4 << 3) + k0(i5);
    }

    public static int m0(int i4, long j4) {
        return k0(i4 << 3) + 8;
    }

    public static int n0(long j4) {
        return 8;
    }

    public static int o0(int i4) {
        return k0(A0(i4));
    }

    public static int p0(int i4, int i5) {
        return k0(i4 << 3) + k0(A0(i5));
    }

    public static int q0(int i4, long j4) {
        return k0(i4 << 3) + 8;
    }

    public static int r0(long j4) {
        return 8;
    }

    public static int s0(int i4) {
        return 4;
    }

    public static int t0(int i4, int i5) {
        return k0(i4 << 3) + 4;
    }

    public static long u0(long j4) {
        return (j4 >> 63) ^ (j4 << 1);
    }

    public static int v0(int i4) {
        return 4;
    }

    public static int w0(int i4, int i5) {
        return k0(i4 << 3) + 4;
    }

    public static int x(double d4) {
        return 8;
    }

    public static int x0(int i4) {
        return g0(i4);
    }

    public static int y(float f4) {
        return 4;
    }

    public static int y0(int i4, int i5) {
        return k0(i4 << 3) + g0(i5);
    }

    public static int z(int i4, double d4) {
        return k0(i4 << 3) + 8;
    }

    public static int z0(int i4) {
        return k0(i4);
    }

    public final void J() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void K(int i4);

    public abstract void L(int i4, int i5);

    public final void M(int i4, long j4) {
        l(i4, u0(j4));
    }

    public abstract void N(int i4, C0507g0 g0Var);

    public final void O(long j4) {
        r(u0(j4));
    }

    public final void S(int i4) {
        K(A0(i4));
    }

    public abstract void T(int i4, int i5);

    public abstract void U(int i4, long j4);

    public abstract void V(long j4);

    public abstract void a0(int i4);

    public abstract int b();

    public final void b0(int i4, int i5) {
        T(i4, A0(i5));
    }

    public abstract void e(byte b4);

    public final void f(double d4) {
        V(Double.doubleToRawLongBits(d4));
    }

    public abstract void f0(int i4, int i5);

    public final void g(float f4) {
        a0(Float.floatToRawIntBits(f4));
    }

    public abstract void h(int i4);

    public final void i(int i4, double d4) {
        U(i4, Double.doubleToRawLongBits(d4));
    }

    public final void j(int i4, float f4) {
        f0(i4, Float.floatToRawIntBits(f4));
    }

    public abstract void k(int i4, int i5);

    public abstract void l(int i4, long j4);

    public abstract void m(int i4, C0507g0 g0Var);

    public abstract void n(int i4, C0546t1 t1Var);

    public abstract void o(int i4, C0546t1 t1Var, K1 k12);

    public abstract void p(int i4, String str);

    public abstract void q(int i4, boolean z4);

    public abstract void r(long j4);

    public abstract void s(C0507g0 g0Var);

    public abstract void t(C0546t1 t1Var);

    public abstract void u(String str);

    public final void v(String str, n2 n2Var) {
        f7568b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", n2Var);
        byte[] bytes = str.getBytes(R0.f7357a);
        try {
            K(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e4) {
            throw new b(e4);
        } catch (b e5) {
            throw e5;
        }
    }

    public final void w(boolean z4) {
        e(z4 ? (byte) 1 : 0);
    }
}
