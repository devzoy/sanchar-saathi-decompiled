package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.h  reason: case insensitive filesystem */
public abstract class C0356h {

    /* renamed from: f  reason: collision with root package name */
    public static volatile int f5103f = 100;

    /* renamed from: a  reason: collision with root package name */
    public int f5104a;

    /* renamed from: b  reason: collision with root package name */
    public int f5105b;

    /* renamed from: c  reason: collision with root package name */
    public int f5106c;

    /* renamed from: d  reason: collision with root package name */
    public C0357i f5107d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5108e;

    /* renamed from: androidx.datastore.preferences.protobuf.h$b */
    public static final class b extends C0356h {

        /* renamed from: g  reason: collision with root package name */
        public final byte[] f5109g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f5110h;

        /* renamed from: i  reason: collision with root package name */
        public int f5111i;

        /* renamed from: j  reason: collision with root package name */
        public int f5112j;

        /* renamed from: k  reason: collision with root package name */
        public int f5113k;

        /* renamed from: l  reason: collision with root package name */
        public int f5114l;

        /* renamed from: m  reason: collision with root package name */
        public int f5115m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f5116n;

        /* renamed from: o  reason: collision with root package name */
        public int f5117o;

        public String A() {
            int L4 = L();
            if (L4 > 0) {
                int i4 = this.f5111i;
                int i5 = this.f5113k;
                if (L4 <= i4 - i5) {
                    String str = new String(this.f5109g, i5, L4, C0372y.f5330b);
                    this.f5113k += L4;
                    return str;
                }
            }
            if (L4 == 0) {
                return "";
            }
            if (L4 < 0) {
                throw C0373z.g();
            }
            throw C0373z.m();
        }

        public String B() {
            int L4 = L();
            if (L4 > 0) {
                int i4 = this.f5111i;
                int i5 = this.f5113k;
                if (L4 <= i4 - i5) {
                    String a4 = q0.a(this.f5109g, i5, L4);
                    this.f5113k += L4;
                    return a4;
                }
            }
            if (L4 == 0) {
                return "";
            }
            if (L4 <= 0) {
                throw C0373z.g();
            }
            throw C0373z.m();
        }

        public int C() {
            if (f()) {
                this.f5115m = 0;
                return 0;
            }
            int L4 = L();
            this.f5115m = L4;
            if (r0.a(L4) != 0) {
                return this.f5115m;
            }
            throw C0373z.c();
        }

        public int D() {
            return L();
        }

        public long E() {
            return M();
        }

        public boolean F(int i4) {
            int b4 = r0.b(i4);
            if (b4 == 0) {
                Q();
                return true;
            } else if (b4 == 1) {
                P(8);
                return true;
            } else if (b4 == 2) {
                P(L());
                return true;
            } else if (b4 == 3) {
                G();
                a(r0.c(r0.a(i4), 4));
                return true;
            } else if (b4 == 4) {
                return false;
            } else {
                if (b4 == 5) {
                    P(4);
                    return true;
                }
                throw C0373z.e();
            }
        }

        public byte H() {
            int i4 = this.f5113k;
            if (i4 != this.f5111i) {
                byte[] bArr = this.f5109g;
                this.f5113k = i4 + 1;
                return bArr[i4];
            }
            throw C0373z.m();
        }

        public byte[] I(int i4) {
            if (i4 > 0) {
                int i5 = this.f5111i;
                int i6 = this.f5113k;
                if (i4 <= i5 - i6) {
                    int i7 = i4 + i6;
                    this.f5113k = i7;
                    return Arrays.copyOfRange(this.f5109g, i6, i7);
                }
            }
            if (i4 > 0) {
                throw C0373z.m();
            } else if (i4 == 0) {
                return C0372y.f5332d;
            } else {
                throw C0373z.g();
            }
        }

        public int J() {
            int i4 = this.f5113k;
            if (this.f5111i - i4 >= 4) {
                byte[] bArr = this.f5109g;
                this.f5113k = i4 + 4;
                return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
            }
            throw C0373z.m();
        }

        public long K() {
            int i4 = this.f5113k;
            if (this.f5111i - i4 >= 8) {
                byte[] bArr = this.f5109g;
                this.f5113k = i4 + 8;
                return ((((long) bArr[i4 + 7]) & 255) << 56) | (((long) bArr[i4]) & 255) | ((((long) bArr[i4 + 1]) & 255) << 8) | ((((long) bArr[i4 + 2]) & 255) << 16) | ((((long) bArr[i4 + 3]) & 255) << 24) | ((((long) bArr[i4 + 4]) & 255) << 32) | ((((long) bArr[i4 + 5]) & 255) << 40) | ((((long) bArr[i4 + 6]) & 255) << 48);
            }
            throw C0373z.m();
        }

        public int L() {
            byte b4;
            byte b5;
            int i4 = this.f5113k;
            int i5 = this.f5111i;
            if (i5 != i4) {
                byte[] bArr = this.f5109g;
                int i6 = i4 + 1;
                byte b6 = bArr[i4];
                if (b6 >= 0) {
                    this.f5113k = i6;
                    return b6;
                } else if (i5 - i6 >= 9) {
                    int i7 = i4 + 2;
                    byte b7 = (bArr[i6] << 7) ^ b6;
                    if (b7 < 0) {
                        b4 = b7 ^ Byte.MIN_VALUE;
                    } else {
                        int i8 = i4 + 3;
                        byte b8 = (bArr[i7] << 14) ^ b7;
                        if (b8 >= 0) {
                            b5 = b8 ^ 16256;
                        } else {
                            int i9 = i4 + 4;
                            byte b9 = b8 ^ (bArr[i8] << 21);
                            if (b9 < 0) {
                                b4 = -2080896 ^ b9;
                            } else {
                                i8 = i4 + 5;
                                byte b10 = bArr[i9];
                                byte b11 = (b9 ^ (b10 << 28)) ^ 266354560;
                                if (b10 < 0) {
                                    i9 = i4 + 6;
                                    if (bArr[i8] < 0) {
                                        i8 = i4 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i4 + 8;
                                            if (bArr[i8] < 0) {
                                                i8 = i4 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i10 = i4 + 10;
                                                    if (bArr[i8] >= 0) {
                                                        byte b12 = b11;
                                                        i7 = i10;
                                                        b4 = b12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    b4 = b11;
                                }
                                b5 = b11;
                            }
                            i7 = i9;
                        }
                        i7 = i8;
                    }
                    this.f5113k = i7;
                    return b4;
                }
            }
            return (int) N();
        }

        public long M() {
            long j4;
            long j5;
            long j6;
            int i4 = this.f5113k;
            int i5 = this.f5111i;
            if (i5 != i4) {
                byte[] bArr = this.f5109g;
                int i6 = i4 + 1;
                byte b4 = bArr[i4];
                if (b4 >= 0) {
                    this.f5113k = i6;
                    return (long) b4;
                } else if (i5 - i6 >= 9) {
                    int i7 = i4 + 2;
                    byte b5 = (bArr[i6] << 7) ^ b4;
                    if (b5 < 0) {
                        j4 = (long) (b5 ^ Byte.MIN_VALUE);
                    } else {
                        int i8 = i4 + 3;
                        byte b6 = (bArr[i7] << 14) ^ b5;
                        if (b6 >= 0) {
                            j4 = (long) (b6 ^ 16256);
                            i7 = i8;
                        } else {
                            int i9 = i4 + 4;
                            byte b7 = b6 ^ (bArr[i8] << 21);
                            if (b7 < 0) {
                                i7 = i9;
                                j4 = (long) (-2080896 ^ b7);
                            } else {
                                long j7 = (long) b7;
                                int i10 = i4 + 5;
                                long j8 = j7 ^ (((long) bArr[i9]) << 28);
                                if (j8 >= 0) {
                                    j6 = 266354560;
                                } else {
                                    int i11 = i4 + 6;
                                    long j9 = j8 ^ (((long) bArr[i10]) << 35);
                                    if (j9 < 0) {
                                        j5 = -34093383808L;
                                    } else {
                                        i10 = i4 + 7;
                                        j8 = j9 ^ (((long) bArr[i11]) << 42);
                                        if (j8 >= 0) {
                                            j6 = 4363953127296L;
                                        } else {
                                            i11 = i4 + 8;
                                            j9 = j8 ^ (((long) bArr[i10]) << 49);
                                            if (j9 < 0) {
                                                j5 = -558586000294016L;
                                            } else {
                                                i7 = i4 + 9;
                                                long j10 = (j9 ^ (((long) bArr[i11]) << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    int i12 = i4 + 10;
                                                    if (((long) bArr[i7]) >= 0) {
                                                        i7 = i12;
                                                    }
                                                }
                                                j4 = j10;
                                            }
                                        }
                                    }
                                    j4 = j9 ^ j5;
                                    i7 = i11;
                                }
                                j4 = j8 ^ j6;
                            }
                        }
                    }
                    this.f5113k = i7;
                    return j4;
                }
            }
            return N();
        }

        public long N() {
            long j4 = 0;
            for (int i4 = 0; i4 < 64; i4 += 7) {
                byte H4 = H();
                j4 |= ((long) (H4 & Byte.MAX_VALUE)) << i4;
                if ((H4 & 128) == 0) {
                    return j4;
                }
            }
            throw C0373z.f();
        }

        public final void O() {
            int i4 = this.f5111i + this.f5112j;
            this.f5111i = i4;
            int i5 = i4 - this.f5114l;
            int i6 = this.f5117o;
            if (i5 > i6) {
                int i7 = i5 - i6;
                this.f5112j = i7;
                this.f5111i = i4 - i7;
                return;
            }
            this.f5112j = 0;
        }

        public void P(int i4) {
            if (i4 >= 0) {
                int i5 = this.f5111i;
                int i6 = this.f5113k;
                if (i4 <= i5 - i6) {
                    this.f5113k = i6 + i4;
                    return;
                }
            }
            if (i4 < 0) {
                throw C0373z.g();
            }
            throw C0373z.m();
        }

        public final void Q() {
            if (this.f5111i - this.f5113k >= 10) {
                R();
            } else {
                S();
            }
        }

        public final void R() {
            int i4 = 0;
            while (i4 < 10) {
                byte[] bArr = this.f5109g;
                int i5 = this.f5113k;
                this.f5113k = i5 + 1;
                if (bArr[i5] < 0) {
                    i4++;
                } else {
                    return;
                }
            }
            throw C0373z.f();
        }

        public final void S() {
            int i4 = 0;
            while (i4 < 10) {
                if (H() < 0) {
                    i4++;
                } else {
                    return;
                }
            }
            throw C0373z.f();
        }

        public void a(int i4) {
            if (this.f5115m != i4) {
                throw C0373z.b();
            }
        }

        public int e() {
            return this.f5113k - this.f5114l;
        }

        public boolean f() {
            return this.f5113k == this.f5111i;
        }

        public void l(int i4) {
            this.f5117o = i4;
            O();
        }

        public int m(int i4) {
            if (i4 >= 0) {
                int e4 = i4 + e();
                if (e4 >= 0) {
                    int i5 = this.f5117o;
                    if (e4 <= i5) {
                        this.f5117o = e4;
                        O();
                        return i5;
                    }
                    throw C0373z.m();
                }
                throw C0373z.h();
            }
            throw C0373z.g();
        }

        public boolean n() {
            return M() != 0;
        }

        public C0355g o() {
            int L4 = L();
            if (L4 > 0) {
                int i4 = this.f5111i;
                int i5 = this.f5113k;
                if (L4 <= i4 - i5) {
                    C0355g x4 = (!this.f5110h || !this.f5116n) ? C0355g.x(this.f5109g, i5, L4) : C0355g.J(this.f5109g, i5, L4);
                    this.f5113k += L4;
                    return x4;
                }
            }
            return L4 == 0 ? C0355g.f5093f : C0355g.I(I(L4));
        }

        public double p() {
            return Double.longBitsToDouble(K());
        }

        public int q() {
            return L();
        }

        public int r() {
            return J();
        }

        public long s() {
            return K();
        }

        public float t() {
            return Float.intBitsToFloat(J());
        }

        public int u() {
            return L();
        }

        public long v() {
            return M();
        }

        public int w() {
            return J();
        }

        public long x() {
            return K();
        }

        public int y() {
            return C0356h.c(L());
        }

        public long z() {
            return C0356h.d(M());
        }

        public b(byte[] bArr, int i4, int i5, boolean z4) {
            super();
            this.f5117o = Integer.MAX_VALUE;
            this.f5109g = bArr;
            this.f5111i = i5 + i4;
            this.f5113k = i4;
            this.f5114l = i4;
            this.f5110h = z4;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$c */
    public static final class c extends C0356h {

        /* renamed from: g  reason: collision with root package name */
        public final InputStream f5118g;

        /* renamed from: h  reason: collision with root package name */
        public final byte[] f5119h;

        /* renamed from: i  reason: collision with root package name */
        public int f5120i;

        /* renamed from: j  reason: collision with root package name */
        public int f5121j;

        /* renamed from: k  reason: collision with root package name */
        public int f5122k;

        /* renamed from: l  reason: collision with root package name */
        public int f5123l;

        /* renamed from: m  reason: collision with root package name */
        public int f5124m;

        /* renamed from: n  reason: collision with root package name */
        public int f5125n;

        public static int H(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (C0373z e4) {
                e4.j();
                throw e4;
            }
        }

        public static int I(InputStream inputStream, byte[] bArr, int i4, int i5) {
            try {
                return inputStream.read(bArr, i4, i5);
            } catch (C0373z e4) {
                e4.j();
                throw e4;
            }
        }

        private void T() {
            int i4 = this.f5120i + this.f5121j;
            this.f5120i = i4;
            int i5 = this.f5124m + i4;
            int i6 = this.f5125n;
            if (i5 > i6) {
                int i7 = i5 - i6;
                this.f5121j = i7;
                this.f5120i = i4 - i7;
                return;
            }
            this.f5121j = 0;
        }

        public static long V(InputStream inputStream, long j4) {
            try {
                return inputStream.skip(j4);
            } catch (C0373z e4) {
                e4.j();
                throw e4;
            }
        }

        private void Y() {
            if (this.f5120i - this.f5122k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() {
            int i4 = 0;
            while (i4 < 10) {
                byte[] bArr = this.f5119h;
                int i5 = this.f5122k;
                this.f5122k = i5 + 1;
                if (bArr[i5] < 0) {
                    i4++;
                } else {
                    return;
                }
            }
            throw C0373z.f();
        }

        private void a0() {
            int i4 = 0;
            while (i4 < 10) {
                if (K() < 0) {
                    i4++;
                } else {
                    return;
                }
            }
            throw C0373z.f();
        }

        public String A() {
            int Q4 = Q();
            if (Q4 > 0) {
                int i4 = this.f5120i;
                int i5 = this.f5122k;
                if (Q4 <= i4 - i5) {
                    String str = new String(this.f5119h, i5, Q4, C0372y.f5330b);
                    this.f5122k += Q4;
                    return str;
                }
            }
            if (Q4 == 0) {
                return "";
            }
            if (Q4 < 0) {
                throw C0373z.g();
            } else if (Q4 > this.f5120i) {
                return new String(L(Q4, false), C0372y.f5330b);
            } else {
                U(Q4);
                String str2 = new String(this.f5119h, this.f5122k, Q4, C0372y.f5330b);
                this.f5122k += Q4;
                return str2;
            }
        }

        public String B() {
            byte[] bArr;
            int Q4 = Q();
            int i4 = this.f5122k;
            int i5 = this.f5120i;
            if (Q4 <= i5 - i4 && Q4 > 0) {
                bArr = this.f5119h;
                this.f5122k = i4 + Q4;
            } else if (Q4 == 0) {
                return "";
            } else {
                if (Q4 >= 0) {
                    i4 = 0;
                    if (Q4 <= i5) {
                        U(Q4);
                        bArr = this.f5119h;
                        this.f5122k = Q4;
                    } else {
                        bArr = L(Q4, false);
                    }
                } else {
                    throw C0373z.g();
                }
            }
            return q0.a(bArr, i4, Q4);
        }

        public int C() {
            if (f()) {
                this.f5123l = 0;
                return 0;
            }
            int Q4 = Q();
            this.f5123l = Q4;
            if (r0.a(Q4) != 0) {
                return this.f5123l;
            }
            throw C0373z.c();
        }

        public int D() {
            return Q();
        }

        public long E() {
            return R();
        }

        public boolean F(int i4) {
            int b4 = r0.b(i4);
            if (b4 == 0) {
                Y();
                return true;
            } else if (b4 == 1) {
                W(8);
                return true;
            } else if (b4 == 2) {
                W(Q());
                return true;
            } else if (b4 == 3) {
                G();
                a(r0.c(r0.a(i4), 4));
                return true;
            } else if (b4 == 4) {
                return false;
            } else {
                if (b4 == 5) {
                    W(4);
                    return true;
                }
                throw C0373z.e();
            }
        }

        public final C0355g J(int i4) {
            byte[] M4 = M(i4);
            if (M4 != null) {
                return C0355g.w(M4);
            }
            int i5 = this.f5122k;
            int i6 = this.f5120i;
            int i7 = i6 - i5;
            this.f5124m += i6;
            this.f5122k = 0;
            this.f5120i = 0;
            List<byte[]> N4 = N(i4 - i7);
            byte[] bArr = new byte[i4];
            System.arraycopy(this.f5119h, i5, bArr, 0, i7);
            for (byte[] bArr2 : N4) {
                System.arraycopy(bArr2, 0, bArr, i7, bArr2.length);
                i7 += bArr2.length;
            }
            return C0355g.I(bArr);
        }

        public byte K() {
            if (this.f5122k == this.f5120i) {
                U(1);
            }
            byte[] bArr = this.f5119h;
            int i4 = this.f5122k;
            this.f5122k = i4 + 1;
            return bArr[i4];
        }

        public final byte[] L(int i4, boolean z4) {
            byte[] M4 = M(i4);
            if (M4 != null) {
                return z4 ? (byte[]) M4.clone() : M4;
            }
            int i5 = this.f5122k;
            int i6 = this.f5120i;
            int i7 = i6 - i5;
            this.f5124m += i6;
            this.f5122k = 0;
            this.f5120i = 0;
            List<byte[]> N4 = N(i4 - i7);
            byte[] bArr = new byte[i4];
            System.arraycopy(this.f5119h, i5, bArr, 0, i7);
            for (byte[] bArr2 : N4) {
                System.arraycopy(bArr2, 0, bArr, i7, bArr2.length);
                i7 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] M(int i4) {
            if (i4 == 0) {
                return C0372y.f5332d;
            }
            if (i4 >= 0) {
                int i5 = this.f5124m;
                int i6 = this.f5122k;
                int i7 = i5 + i6 + i4;
                if (i7 - this.f5106c <= 0) {
                    int i8 = this.f5125n;
                    if (i7 <= i8) {
                        int i9 = this.f5120i - i6;
                        int i10 = i4 - i9;
                        if (i10 >= 4096 && i10 > H(this.f5118g)) {
                            return null;
                        }
                        byte[] bArr = new byte[i4];
                        System.arraycopy(this.f5119h, this.f5122k, bArr, 0, i9);
                        this.f5124m += this.f5120i;
                        this.f5122k = 0;
                        this.f5120i = 0;
                        while (i9 < i4) {
                            int I4 = I(this.f5118g, bArr, i9, i4 - i9);
                            if (I4 != -1) {
                                this.f5124m += I4;
                                i9 += I4;
                            } else {
                                throw C0373z.m();
                            }
                        }
                        return bArr;
                    }
                    W((i8 - i5) - i6);
                    throw C0373z.m();
                }
                throw C0373z.l();
            }
            throw C0373z.g();
        }

        public final List N(int i4) {
            ArrayList arrayList = new ArrayList();
            while (i4 > 0) {
                int min = Math.min(i4, 4096);
                byte[] bArr = new byte[min];
                int i5 = 0;
                while (i5 < min) {
                    int read = this.f5118g.read(bArr, i5, min - i5);
                    if (read != -1) {
                        this.f5124m += read;
                        i5 += read;
                    } else {
                        throw C0373z.m();
                    }
                }
                i4 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int O() {
            int i4 = this.f5122k;
            if (this.f5120i - i4 < 4) {
                U(4);
                i4 = this.f5122k;
            }
            byte[] bArr = this.f5119h;
            this.f5122k = i4 + 4;
            return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
        }

        public long P() {
            int i4 = this.f5122k;
            if (this.f5120i - i4 < 8) {
                U(8);
                i4 = this.f5122k;
            }
            byte[] bArr = this.f5119h;
            this.f5122k = i4 + 8;
            return ((((long) bArr[i4 + 7]) & 255) << 56) | (((long) bArr[i4]) & 255) | ((((long) bArr[i4 + 1]) & 255) << 8) | ((((long) bArr[i4 + 2]) & 255) << 16) | ((((long) bArr[i4 + 3]) & 255) << 24) | ((((long) bArr[i4 + 4]) & 255) << 32) | ((((long) bArr[i4 + 5]) & 255) << 40) | ((((long) bArr[i4 + 6]) & 255) << 48);
        }

        public int Q() {
            byte b4;
            byte b5;
            int i4 = this.f5122k;
            int i5 = this.f5120i;
            if (i5 != i4) {
                byte[] bArr = this.f5119h;
                int i6 = i4 + 1;
                byte b6 = bArr[i4];
                if (b6 >= 0) {
                    this.f5122k = i6;
                    return b6;
                } else if (i5 - i6 >= 9) {
                    int i7 = i4 + 2;
                    byte b7 = (bArr[i6] << 7) ^ b6;
                    if (b7 < 0) {
                        b4 = b7 ^ Byte.MIN_VALUE;
                    } else {
                        int i8 = i4 + 3;
                        byte b8 = (bArr[i7] << 14) ^ b7;
                        if (b8 >= 0) {
                            b5 = b8 ^ 16256;
                        } else {
                            int i9 = i4 + 4;
                            byte b9 = b8 ^ (bArr[i8] << 21);
                            if (b9 < 0) {
                                b4 = -2080896 ^ b9;
                            } else {
                                i8 = i4 + 5;
                                byte b10 = bArr[i9];
                                byte b11 = (b9 ^ (b10 << 28)) ^ 266354560;
                                if (b10 < 0) {
                                    i9 = i4 + 6;
                                    if (bArr[i8] < 0) {
                                        i8 = i4 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i4 + 8;
                                            if (bArr[i8] < 0) {
                                                i8 = i4 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i10 = i4 + 10;
                                                    if (bArr[i8] >= 0) {
                                                        byte b12 = b11;
                                                        i7 = i10;
                                                        b4 = b12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    b4 = b11;
                                }
                                b5 = b11;
                            }
                            i7 = i9;
                        }
                        i7 = i8;
                    }
                    this.f5122k = i7;
                    return b4;
                }
            }
            return (int) S();
        }

        public long R() {
            long j4;
            long j5;
            long j6;
            int i4 = this.f5122k;
            int i5 = this.f5120i;
            if (i5 != i4) {
                byte[] bArr = this.f5119h;
                int i6 = i4 + 1;
                byte b4 = bArr[i4];
                if (b4 >= 0) {
                    this.f5122k = i6;
                    return (long) b4;
                } else if (i5 - i6 >= 9) {
                    int i7 = i4 + 2;
                    byte b5 = (bArr[i6] << 7) ^ b4;
                    if (b5 < 0) {
                        j4 = (long) (b5 ^ Byte.MIN_VALUE);
                    } else {
                        int i8 = i4 + 3;
                        byte b6 = (bArr[i7] << 14) ^ b5;
                        if (b6 >= 0) {
                            j4 = (long) (b6 ^ 16256);
                            i7 = i8;
                        } else {
                            int i9 = i4 + 4;
                            byte b7 = b6 ^ (bArr[i8] << 21);
                            if (b7 < 0) {
                                i7 = i9;
                                j4 = (long) (-2080896 ^ b7);
                            } else {
                                long j7 = (long) b7;
                                int i10 = i4 + 5;
                                long j8 = j7 ^ (((long) bArr[i9]) << 28);
                                if (j8 >= 0) {
                                    j6 = 266354560;
                                } else {
                                    int i11 = i4 + 6;
                                    long j9 = j8 ^ (((long) bArr[i10]) << 35);
                                    if (j9 < 0) {
                                        j5 = -34093383808L;
                                    } else {
                                        i10 = i4 + 7;
                                        j8 = j9 ^ (((long) bArr[i11]) << 42);
                                        if (j8 >= 0) {
                                            j6 = 4363953127296L;
                                        } else {
                                            i11 = i4 + 8;
                                            j9 = j8 ^ (((long) bArr[i10]) << 49);
                                            if (j9 < 0) {
                                                j5 = -558586000294016L;
                                            } else {
                                                i7 = i4 + 9;
                                                long j10 = (j9 ^ (((long) bArr[i11]) << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    int i12 = i4 + 10;
                                                    if (((long) bArr[i7]) >= 0) {
                                                        i7 = i12;
                                                    }
                                                }
                                                j4 = j10;
                                            }
                                        }
                                    }
                                    j4 = j9 ^ j5;
                                    i7 = i11;
                                }
                                j4 = j8 ^ j6;
                            }
                        }
                    }
                    this.f5122k = i7;
                    return j4;
                }
            }
            return S();
        }

        public long S() {
            long j4 = 0;
            for (int i4 = 0; i4 < 64; i4 += 7) {
                byte K4 = K();
                j4 |= ((long) (K4 & Byte.MAX_VALUE)) << i4;
                if ((K4 & 128) == 0) {
                    return j4;
                }
            }
            throw C0373z.f();
        }

        public final void U(int i4) {
            if (b0(i4)) {
                return;
            }
            if (i4 > (this.f5106c - this.f5124m) - this.f5122k) {
                throw C0373z.l();
            }
            throw C0373z.m();
        }

        public void W(int i4) {
            int i5 = this.f5120i;
            int i6 = this.f5122k;
            if (i4 > i5 - i6 || i4 < 0) {
                X(i4);
            } else {
                this.f5122k = i6 + i4;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
            throw new java.lang.IllegalStateException(r7.f5118g.getClass() + "#skip returned invalid result: " + r1 + "\nThe InputStream implementation is buggy.");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void X(int r8) {
            /*
                r7 = this;
                if (r8 < 0) goto L_0x0092
                int r0 = r7.f5124m
                int r1 = r7.f5122k
                int r2 = r0 + r1
                int r2 = r2 + r8
                int r3 = r7.f5125n
                if (r2 > r3) goto L_0x0088
                int r0 = r0 + r1
                r7.f5124m = r0
                int r0 = r7.f5120i
                int r0 = r0 - r1
                r1 = 0
                r7.f5120i = r1
                r7.f5122k = r1
            L_0x0018:
                if (r0 >= r8) goto L_0x0062
                int r1 = r8 - r0
                java.io.InputStream r2 = r7.f5118g     // Catch:{ all -> 0x0058 }
                long r3 = (long) r1     // Catch:{ all -> 0x0058 }
                long r1 = V(r2, r3)     // Catch:{ all -> 0x0058 }
                r5 = 0
                int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r5 < 0) goto L_0x0033
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 > 0) goto L_0x0033
                if (r5 != 0) goto L_0x0030
                goto L_0x0062
            L_0x0030:
                int r1 = (int) r1     // Catch:{ all -> 0x0058 }
                int r0 = r0 + r1
                goto L_0x0018
            L_0x0033:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0058 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
                r3.<init>()     // Catch:{ all -> 0x0058 }
                java.io.InputStream r4 = r7.f5118g     // Catch:{ all -> 0x0058 }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x0058 }
                r3.append(r4)     // Catch:{ all -> 0x0058 }
                java.lang.String r4 = "#skip returned invalid result: "
                r3.append(r4)     // Catch:{ all -> 0x0058 }
                r3.append(r1)     // Catch:{ all -> 0x0058 }
                java.lang.String r1 = "\nThe InputStream implementation is buggy."
                r3.append(r1)     // Catch:{ all -> 0x0058 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0058 }
                r8.<init>(r1)     // Catch:{ all -> 0x0058 }
                throw r8     // Catch:{ all -> 0x0058 }
            L_0x0058:
                r8 = move-exception
                int r1 = r7.f5124m
                int r1 = r1 + r0
                r7.f5124m = r1
                r7.T()
                throw r8
            L_0x0062:
                int r1 = r7.f5124m
                int r1 = r1 + r0
                r7.f5124m = r1
                r7.T()
                if (r0 >= r8) goto L_0x0087
                int r0 = r7.f5120i
                int r1 = r7.f5122k
                int r1 = r0 - r1
                r7.f5122k = r0
                r0 = 1
                r7.U(r0)
            L_0x0078:
                int r2 = r8 - r1
                int r3 = r7.f5120i
                if (r2 <= r3) goto L_0x0085
                int r1 = r1 + r3
                r7.f5122k = r3
                r7.U(r0)
                goto L_0x0078
            L_0x0085:
                r7.f5122k = r2
            L_0x0087:
                return
            L_0x0088:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r7.W(r3)
                androidx.datastore.preferences.protobuf.z r8 = androidx.datastore.preferences.protobuf.C0373z.m()
                throw r8
            L_0x0092:
                androidx.datastore.preferences.protobuf.z r8 = androidx.datastore.preferences.protobuf.C0373z.g()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0356h.c.X(int):void");
        }

        public void a(int i4) {
            if (this.f5123l != i4) {
                throw C0373z.b();
            }
        }

        public final boolean b0(int i4) {
            int i5 = this.f5122k;
            int i6 = i5 + i4;
            int i7 = this.f5120i;
            if (i6 > i7) {
                int i8 = this.f5106c;
                int i9 = this.f5124m;
                if (i4 > (i8 - i9) - i5 || i9 + i5 + i4 > this.f5125n) {
                    return false;
                }
                if (i5 > 0) {
                    if (i7 > i5) {
                        byte[] bArr = this.f5119h;
                        System.arraycopy(bArr, i5, bArr, 0, i7 - i5);
                    }
                    this.f5124m += i5;
                    this.f5120i -= i5;
                    this.f5122k = 0;
                }
                InputStream inputStream = this.f5118g;
                byte[] bArr2 = this.f5119h;
                int i10 = this.f5120i;
                int I4 = I(inputStream, bArr2, i10, Math.min(bArr2.length - i10, (this.f5106c - this.f5124m) - i10));
                if (I4 == 0 || I4 < -1 || I4 > this.f5119h.length) {
                    throw new IllegalStateException(this.f5118g.getClass() + "#read(byte[]) returned invalid result: " + I4 + "\nThe InputStream implementation is buggy.");
                } else if (I4 <= 0) {
                    return false;
                } else {
                    this.f5120i += I4;
                    T();
                    if (this.f5120i >= i4) {
                        return true;
                    }
                    return b0(i4);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i4 + " bytes were already available in buffer");
            }
        }

        public int e() {
            return this.f5124m + this.f5122k;
        }

        public boolean f() {
            return this.f5122k == this.f5120i && !b0(1);
        }

        public void l(int i4) {
            this.f5125n = i4;
            T();
        }

        public int m(int i4) {
            if (i4 >= 0) {
                int i5 = i4 + this.f5124m + this.f5122k;
                if (i5 >= 0) {
                    int i6 = this.f5125n;
                    if (i5 <= i6) {
                        this.f5125n = i5;
                        T();
                        return i6;
                    }
                    throw C0373z.m();
                }
                throw C0373z.h();
            }
            throw C0373z.g();
        }

        public boolean n() {
            return R() != 0;
        }

        public C0355g o() {
            int Q4 = Q();
            int i4 = this.f5120i;
            int i5 = this.f5122k;
            if (Q4 <= i4 - i5 && Q4 > 0) {
                C0355g x4 = C0355g.x(this.f5119h, i5, Q4);
                this.f5122k += Q4;
                return x4;
            } else if (Q4 == 0) {
                return C0355g.f5093f;
            } else {
                if (Q4 >= 0) {
                    return J(Q4);
                }
                throw C0373z.g();
            }
        }

        public double p() {
            return Double.longBitsToDouble(P());
        }

        public int q() {
            return Q();
        }

        public int r() {
            return O();
        }

        public long s() {
            return P();
        }

        public float t() {
            return Float.intBitsToFloat(O());
        }

        public int u() {
            return Q();
        }

        public long v() {
            return R();
        }

        public int w() {
            return O();
        }

        public long x() {
            return P();
        }

        public int y() {
            return C0356h.c(Q());
        }

        public long z() {
            return C0356h.d(R());
        }

        public c(InputStream inputStream, int i4) {
            super();
            this.f5125n = Integer.MAX_VALUE;
            C0372y.b(inputStream, "input");
            this.f5118g = inputStream;
            this.f5119h = new byte[i4];
            this.f5120i = 0;
            this.f5122k = 0;
            this.f5124m = 0;
        }
    }

    public static int c(int i4) {
        return (-(i4 & 1)) ^ (i4 >>> 1);
    }

    public static long d(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    public static C0356h g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static C0356h h(InputStream inputStream, int i4) {
        if (i4 > 0) {
            return inputStream == null ? i(C0372y.f5332d) : new c(inputStream, i4);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static C0356h i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static C0356h j(byte[] bArr, int i4, int i5) {
        return k(bArr, i4, i5, false);
    }

    public static C0356h k(byte[] bArr, int i4, int i5, boolean z4) {
        b bVar = new b(bArr, i4, i5, z4);
        try {
            bVar.m(i5);
            return bVar;
        } catch (C0373z e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i4);

    public void G() {
        int C4;
        do {
            C4 = C();
            if (C4 != 0) {
                b();
                this.f5104a++;
                this.f5104a--;
            } else {
                return;
            }
        } while (F(C4));
    }

    public abstract void a(int i4);

    public void b() {
        if (this.f5104a >= this.f5105b) {
            throw C0373z.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i4);

    public abstract int m(int i4);

    public abstract boolean n();

    public abstract C0355g o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();

    public C0356h() {
        this.f5105b = f5103f;
        this.f5106c = Integer.MAX_VALUE;
        this.f5108e = false;
    }
}
