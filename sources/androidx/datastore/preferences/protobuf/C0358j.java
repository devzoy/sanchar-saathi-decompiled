package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.j  reason: case insensitive filesystem */
public abstract class C0358j extends C0354f {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f5152c = Logger.getLogger(C0358j.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f5153d = p0.B();

    /* renamed from: a  reason: collision with root package name */
    public C0359k f5154a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5155b;

    /* renamed from: androidx.datastore.preferences.protobuf.j$b */
    public static abstract class b extends C0358j {

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f5156e;

        /* renamed from: f  reason: collision with root package name */
        public final int f5157f;

        /* renamed from: g  reason: collision with root package name */
        public int f5158g;

        /* renamed from: h  reason: collision with root package name */
        public int f5159h;

        public b(int i4) {
            super();
            if (i4 >= 0) {
                byte[] bArr = new byte[Math.max(i4, 20)];
                this.f5156e = bArr;
                this.f5157f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        public final void R0(byte b4) {
            byte[] bArr = this.f5156e;
            int i4 = this.f5158g;
            this.f5158g = i4 + 1;
            bArr[i4] = b4;
            this.f5159h++;
        }

        public final void S0(int i4) {
            byte[] bArr = this.f5156e;
            int i5 = this.f5158g;
            int i6 = i5 + 1;
            this.f5158g = i6;
            bArr[i5] = (byte) (i4 & 255);
            int i7 = i5 + 2;
            this.f5158g = i7;
            bArr[i6] = (byte) ((i4 >> 8) & 255);
            int i8 = i5 + 3;
            this.f5158g = i8;
            bArr[i7] = (byte) ((i4 >> 16) & 255);
            this.f5158g = i5 + 4;
            bArr[i8] = (byte) ((i4 >> 24) & 255);
            this.f5159h += 4;
        }

        public final void T0(long j4) {
            byte[] bArr = this.f5156e;
            int i4 = this.f5158g;
            int i5 = i4 + 1;
            this.f5158g = i5;
            bArr[i4] = (byte) ((int) (j4 & 255));
            int i6 = i4 + 2;
            this.f5158g = i6;
            bArr[i5] = (byte) ((int) ((j4 >> 8) & 255));
            int i7 = i4 + 3;
            this.f5158g = i7;
            bArr[i6] = (byte) ((int) ((j4 >> 16) & 255));
            int i8 = i4 + 4;
            this.f5158g = i8;
            bArr[i7] = (byte) ((int) (255 & (j4 >> 24)));
            int i9 = i4 + 5;
            this.f5158g = i9;
            bArr[i8] = (byte) (((int) (j4 >> 32)) & 255);
            int i10 = i4 + 6;
            this.f5158g = i10;
            bArr[i9] = (byte) (((int) (j4 >> 40)) & 255);
            int i11 = i4 + 7;
            this.f5158g = i11;
            bArr[i10] = (byte) (((int) (j4 >> 48)) & 255);
            this.f5158g = i4 + 8;
            bArr[i11] = (byte) (((int) (j4 >> 56)) & 255);
            this.f5159h += 8;
        }

        public final void U0(int i4) {
            if (i4 >= 0) {
                W0(i4);
            } else {
                X0((long) i4);
            }
        }

        public final void V0(int i4, int i5) {
            W0(r0.c(i4, i5));
        }

        public final void W0(int i4) {
            if (C0358j.f5153d) {
                long j4 = (long) this.f5158g;
                while ((i4 & -128) != 0) {
                    byte[] bArr = this.f5156e;
                    int i5 = this.f5158g;
                    this.f5158g = i5 + 1;
                    p0.H(bArr, (long) i5, (byte) ((i4 | 128) & 255));
                    i4 >>>= 7;
                }
                byte[] bArr2 = this.f5156e;
                int i6 = this.f5158g;
                this.f5158g = i6 + 1;
                p0.H(bArr2, (long) i6, (byte) i4);
                this.f5159h += (int) (((long) this.f5158g) - j4);
                return;
            }
            while ((i4 & -128) != 0) {
                byte[] bArr3 = this.f5156e;
                int i7 = this.f5158g;
                this.f5158g = i7 + 1;
                bArr3[i7] = (byte) ((i4 | 128) & 255);
                this.f5159h++;
                i4 >>>= 7;
            }
            byte[] bArr4 = this.f5156e;
            int i8 = this.f5158g;
            this.f5158g = i8 + 1;
            bArr4[i8] = (byte) i4;
            this.f5159h++;
        }

        public final void X0(long j4) {
            if (C0358j.f5153d) {
                long j5 = (long) this.f5158g;
                while ((j4 & -128) != 0) {
                    byte[] bArr = this.f5156e;
                    int i4 = this.f5158g;
                    this.f5158g = i4 + 1;
                    p0.H(bArr, (long) i4, (byte) ((((int) j4) | 128) & 255));
                    j4 >>>= 7;
                }
                byte[] bArr2 = this.f5156e;
                int i5 = this.f5158g;
                this.f5158g = i5 + 1;
                p0.H(bArr2, (long) i5, (byte) ((int) j4));
                this.f5159h += (int) (((long) this.f5158g) - j5);
                return;
            }
            while ((j4 & -128) != 0) {
                byte[] bArr3 = this.f5156e;
                int i6 = this.f5158g;
                this.f5158g = i6 + 1;
                bArr3[i6] = (byte) ((((int) j4) | 128) & 255);
                this.f5159h++;
                j4 >>>= 7;
            }
            byte[] bArr4 = this.f5156e;
            int i7 = this.f5158g;
            this.f5158g = i7 + 1;
            bArr4[i7] = (byte) ((int) j4);
            this.f5159h++;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j$c */
    public static class c extends IOException {
        public c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j$d */
    public static final class d extends b {

        /* renamed from: i  reason: collision with root package name */
        public final OutputStream f5160i;

        public d(OutputStream outputStream, int i4) {
            super(i4);
            if (outputStream != null) {
                this.f5160i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        public void A0(int i4, P p4) {
            M0(1, 3);
            N0(2, i4);
            b1(3, p4);
            M0(1, 4);
        }

        public void B0(int i4, C0355g gVar) {
            M0(1, 3);
            N0(2, i4);
            e0(3, gVar);
            M0(1, 4);
        }

        public void K0(int i4, String str) {
            M0(i4, 2);
            L0(str);
        }

        public void L0(String str) {
            int i4;
            int i5;
            try {
                int length = str.length() * 3;
                int Q4 = C0358j.Q(length);
                int i6 = Q4 + length;
                int i7 = this.f5157f;
                if (i6 > i7) {
                    byte[] bArr = new byte[length];
                    int b4 = q0.b(str, bArr, 0, length);
                    O0(b4);
                    a(bArr, 0, b4);
                    return;
                }
                if (i6 > i7 - this.f5158g) {
                    Y0();
                }
                int Q5 = C0358j.Q(str.length());
                i4 = this.f5158g;
                if (Q5 == Q4) {
                    int i8 = i4 + Q5;
                    this.f5158g = i8;
                    int b5 = q0.b(str, this.f5156e, i8, this.f5157f - i8);
                    this.f5158g = i4;
                    i5 = (b5 - i4) - Q5;
                    W0(i5);
                    this.f5158g = b5;
                } else {
                    i5 = q0.c(str);
                    W0(i5);
                    this.f5158g = q0.b(str, this.f5156e, this.f5158g, i5);
                }
                this.f5159h += i5;
            } catch (q0.d e4) {
                this.f5159h -= this.f5158g - i4;
                this.f5158g = i4;
                throw e4;
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new c(e5);
            } catch (q0.d e6) {
                W(str, e6);
            }
        }

        public void M0(int i4, int i5) {
            O0(r0.c(i4, i5));
        }

        public void N0(int i4, int i5) {
            Z0(20);
            V0(i4, 0);
            W0(i5);
        }

        public void O0(int i4) {
            Z0(5);
            W0(i4);
        }

        public void P0(int i4, long j4) {
            Z0(20);
            V0(i4, 0);
            X0(j4);
        }

        public void Q0(long j4) {
            Z0(10);
            X0(j4);
        }

        public void V() {
            if (this.f5158g > 0) {
                Y0();
            }
        }

        public final void Y0() {
            this.f5160i.write(this.f5156e, 0, this.f5158g);
            this.f5158g = 0;
        }

        public void Z(byte b4) {
            if (this.f5158g == this.f5157f) {
                Y0();
            }
            R0(b4);
        }

        public final void Z0(int i4) {
            if (this.f5157f - this.f5158g < i4) {
                Y0();
            }
        }

        public void a(byte[] bArr, int i4, int i5) {
            a1(bArr, i4, i5);
        }

        public void a0(int i4, boolean z4) {
            Z0(11);
            V0(i4, 0);
            R0(z4 ? (byte) 1 : 0);
        }

        public void a1(byte[] bArr, int i4, int i5) {
            int i6 = this.f5157f;
            int i7 = this.f5158g;
            if (i6 - i7 >= i5) {
                System.arraycopy(bArr, i4, this.f5156e, i7, i5);
                this.f5158g += i5;
                this.f5159h += i5;
                return;
            }
            int i8 = i6 - i7;
            System.arraycopy(bArr, i4, this.f5156e, i7, i8);
            int i9 = i4 + i8;
            int i10 = i5 - i8;
            this.f5158g = this.f5157f;
            this.f5159h += i8;
            Y0();
            if (i10 <= this.f5157f) {
                System.arraycopy(bArr, i9, this.f5156e, 0, i10);
                this.f5158g = i10;
            } else {
                this.f5160i.write(bArr, i9, i10);
            }
            this.f5159h += i10;
        }

        public void b1(int i4, P p4) {
            M0(i4, 2);
            z0(p4);
        }

        public void c1(P p4, f0 f0Var) {
            O0(((C0349a) p4).d(f0Var));
            f0Var.g(p4, this.f5154a);
        }

        public void d0(byte[] bArr, int i4, int i5) {
            O0(i5);
            a1(bArr, i4, i5);
        }

        public void e0(int i4, C0355g gVar) {
            M0(i4, 2);
            f0(gVar);
        }

        public void f0(C0355g gVar) {
            O0(gVar.size());
            gVar.K(this);
        }

        public void k0(int i4, int i5) {
            Z0(14);
            V0(i4, 5);
            S0(i5);
        }

        public void l0(int i4) {
            Z0(4);
            S0(i4);
        }

        public void m0(int i4, long j4) {
            Z0(18);
            V0(i4, 1);
            T0(j4);
        }

        public void n0(long j4) {
            Z0(8);
            T0(j4);
        }

        public void u0(int i4, int i5) {
            Z0(20);
            V0(i4, 0);
            U0(i5);
        }

        public void v0(int i4) {
            if (i4 >= 0) {
                O0(i4);
            } else {
                Q0((long) i4);
            }
        }

        public void y0(int i4, P p4, f0 f0Var) {
            M0(i4, 2);
            c1(p4, f0Var);
        }

        public void z0(P p4) {
            O0(p4.a());
            p4.e(this);
        }
    }

    public static int A(P p4) {
        return y(p4.a());
    }

    public static int B(P p4, f0 f0Var) {
        return y(((C0349a) p4).d(f0Var));
    }

    public static int C(int i4) {
        if (i4 > 4096) {
            return 4096;
        }
        return i4;
    }

    public static int D(int i4, C0355g gVar) {
        return (O(1) * 2) + P(2, i4) + f(3, gVar);
    }

    public static int E(int i4, int i5) {
        return O(i4) + F(i5);
    }

    public static int F(int i4) {
        return 4;
    }

    public static int G(int i4, long j4) {
        return O(i4) + H(j4);
    }

    public static int H(long j4) {
        return 8;
    }

    public static int I(int i4, int i5) {
        return O(i4) + J(i5);
    }

    public static int J(int i4) {
        return Q(T(i4));
    }

    public static int K(int i4, long j4) {
        return O(i4) + L(j4);
    }

    public static int L(long j4) {
        return S(U(j4));
    }

    public static int M(int i4, String str) {
        return O(i4) + N(str);
    }

    public static int N(String str) {
        int i4;
        try {
            i4 = q0.c(str);
        } catch (q0.d unused) {
            i4 = str.getBytes(C0372y.f5330b).length;
        }
        return y(i4);
    }

    public static int O(int i4) {
        return Q(r0.c(i4, 0));
    }

    public static int P(int i4, int i5) {
        return O(i4) + Q(i5);
    }

    public static int Q(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public static int R(int i4, long j4) {
        return O(i4) + S(j4);
    }

    public static int S(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    public static int T(int i4) {
        return (i4 >> 31) ^ (i4 << 1);
    }

    public static long U(long j4) {
        return (j4 >> 63) ^ (j4 << 1);
    }

    public static C0358j Y(OutputStream outputStream, int i4) {
        return new d(outputStream, i4);
    }

    public static int c(int i4, boolean z4) {
        return O(i4) + d(z4);
    }

    public static int d(boolean z4) {
        return 1;
    }

    public static int e(byte[] bArr) {
        return y(bArr.length);
    }

    public static int f(int i4, C0355g gVar) {
        return O(i4) + g(gVar);
    }

    public static int g(C0355g gVar) {
        return y(gVar.size());
    }

    public static int h(int i4, double d4) {
        return O(i4) + i(d4);
    }

    public static int i(double d4) {
        return 8;
    }

    public static int j(int i4, int i5) {
        return O(i4) + k(i5);
    }

    public static int k(int i4) {
        return v(i4);
    }

    public static int l(int i4, int i5) {
        return O(i4) + m(i5);
    }

    public static int m(int i4) {
        return 4;
    }

    public static int n(int i4, long j4) {
        return O(i4) + o(j4);
    }

    public static int o(long j4) {
        return 8;
    }

    public static int p(int i4, float f4) {
        return O(i4) + q(f4);
    }

    public static int q(float f4) {
        return 4;
    }

    public static int r(int i4, P p4, f0 f0Var) {
        return (O(i4) * 2) + t(p4, f0Var);
    }

    public static int s(P p4) {
        return p4.a();
    }

    public static int t(P p4, f0 f0Var) {
        return ((C0349a) p4).d(f0Var);
    }

    public static int u(int i4, int i5) {
        return O(i4) + v(i5);
    }

    public static int v(int i4) {
        return S((long) i4);
    }

    public static int w(int i4, long j4) {
        return O(i4) + x(j4);
    }

    public static int x(long j4) {
        return S(j4);
    }

    public static int y(int i4) {
        return Q(i4) + i4;
    }

    public static int z(int i4, P p4, f0 f0Var) {
        return O(i4) + B(p4, f0Var);
    }

    public abstract void A0(int i4, P p4);

    public abstract void B0(int i4, C0355g gVar);

    public final void C0(int i4, int i5) {
        k0(i4, i5);
    }

    public final void D0(int i4) {
        l0(i4);
    }

    public final void E0(int i4, long j4) {
        m0(i4, j4);
    }

    public final void F0(long j4) {
        n0(j4);
    }

    public final void G0(int i4, int i5) {
        N0(i4, T(i5));
    }

    public final void H0(int i4) {
        O0(T(i4));
    }

    public final void I0(int i4, long j4) {
        P0(i4, U(j4));
    }

    public final void J0(long j4) {
        Q0(U(j4));
    }

    public abstract void K0(int i4, String str);

    public abstract void L0(String str);

    public abstract void M0(int i4, int i5);

    public abstract void N0(int i4, int i5);

    public abstract void O0(int i4);

    public abstract void P0(int i4, long j4);

    public abstract void Q0(long j4);

    public abstract void V();

    public final void W(String str, q0.d dVar) {
        f5152c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(C0372y.f5330b);
        try {
            O0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e4) {
            throw new c(e4);
        }
    }

    public boolean X() {
        return this.f5155b;
    }

    public abstract void Z(byte b4);

    public abstract void a(byte[] bArr, int i4, int i5);

    public abstract void a0(int i4, boolean z4);

    public final void b0(boolean z4) {
        Z(z4 ? (byte) 1 : 0);
    }

    public final void c0(byte[] bArr) {
        d0(bArr, 0, bArr.length);
    }

    public abstract void d0(byte[] bArr, int i4, int i5);

    public abstract void e0(int i4, C0355g gVar);

    public abstract void f0(C0355g gVar);

    public final void g0(int i4, double d4) {
        m0(i4, Double.doubleToRawLongBits(d4));
    }

    public final void h0(double d4) {
        n0(Double.doubleToRawLongBits(d4));
    }

    public final void i0(int i4, int i5) {
        u0(i4, i5);
    }

    public final void j0(int i4) {
        v0(i4);
    }

    public abstract void k0(int i4, int i5);

    public abstract void l0(int i4);

    public abstract void m0(int i4, long j4);

    public abstract void n0(long j4);

    public final void o0(int i4, float f4) {
        k0(i4, Float.floatToRawIntBits(f4));
    }

    public final void p0(float f4) {
        l0(Float.floatToRawIntBits(f4));
    }

    public final void q0(int i4, P p4) {
        M0(i4, 3);
        s0(p4);
        M0(i4, 4);
    }

    public final void r0(int i4, P p4, f0 f0Var) {
        M0(i4, 3);
        t0(p4, f0Var);
        M0(i4, 4);
    }

    public final void s0(P p4) {
        p4.e(this);
    }

    public final void t0(P p4, f0 f0Var) {
        f0Var.g(p4, this.f5154a);
    }

    public abstract void u0(int i4, int i5);

    public abstract void v0(int i4);

    public final void w0(int i4, long j4) {
        P0(i4, j4);
    }

    public final void x0(long j4) {
        Q0(j4);
    }

    public abstract void y0(int i4, P p4, f0 f0Var);

    public abstract void z0(P p4);

    public C0358j() {
    }
}
