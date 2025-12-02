package O3;

import i3.C0734k;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import v3.l;

/* renamed from: O3.b  reason: case insensitive filesystem */
public final class C0298b implements d, c, Cloneable, ByteChannel {

    /* renamed from: e  reason: collision with root package name */
    public u f2082e;

    /* renamed from: f  reason: collision with root package name */
    public long f2083f;

    /* renamed from: O3.b$a */
    public static final class a implements Closeable {

        /* renamed from: e  reason: collision with root package name */
        public C0298b f2084e;

        /* renamed from: f  reason: collision with root package name */
        public u f2085f;

        /* renamed from: g  reason: collision with root package name */
        public long f2086g = -1;

        /* renamed from: h  reason: collision with root package name */
        public byte[] f2087h;

        /* renamed from: i  reason: collision with root package name */
        public int f2088i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f2089j = -1;

        public final void b(u uVar) {
            this.f2085f = uVar;
        }

        public void close() {
            if (this.f2084e != null) {
                this.f2084e = null;
                b((u) null);
                this.f2086g = -1;
                this.f2087h = null;
                this.f2088i = -1;
                this.f2089j = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }
    }

    /* renamed from: O3.b$c */
    public static final class c extends OutputStream {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ C0298b f2091e;

        public c(C0298b bVar) {
            this.f2091e = bVar;
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return this.f2091e + ".outputStream()";
        }

        public void write(int i4) {
            this.f2091e.P(i4);
        }

        public void write(byte[] bArr, int i4, int i5) {
            l.e(bArr, "data");
            this.f2091e.N(bArr, i4, i5);
        }
    }

    public void A(long j4) {
        if (this.f2083f < j4) {
            throw new EOFException();
        }
    }

    public long B() {
        if (H() >= 8) {
            u uVar = this.f2082e;
            l.b(uVar);
            int i4 = uVar.f2141b;
            int i5 = uVar.f2142c;
            if (((long) (i5 - i4)) < 8) {
                return ((((long) z()) & 4294967295L) << 32) | (4294967295L & ((long) z()));
            }
            byte[] bArr = uVar.f2140a;
            long j4 = ((((long) bArr[i4]) & 255) << 56) | ((((long) bArr[i4 + 1]) & 255) << 48) | ((((long) bArr[i4 + 2]) & 255) << 40);
            int i6 = i4 + 7;
            int i7 = i4 + 8;
            long j5 = j4 | ((((long) bArr[i4 + 3]) & 255) << 32) | ((((long) bArr[i4 + 4]) & 255) << 24) | ((((long) bArr[i4 + 5]) & 255) << 16) | ((((long) bArr[i4 + 6]) & 255) << 8) | (((long) bArr[i6]) & 255);
            F(H() - 8);
            if (i7 == i5) {
                this.f2082e = uVar.b();
                v.b(uVar);
            } else {
                uVar.f2141b = i7;
            }
            return j5;
        }
        throw new EOFException();
    }

    public short C() {
        if (H() >= 2) {
            u uVar = this.f2082e;
            l.b(uVar);
            int i4 = uVar.f2141b;
            int i5 = uVar.f2142c;
            if (i5 - i4 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = uVar.f2140a;
            int i6 = i4 + 1;
            int i7 = i4 + 2;
            byte b4 = (bArr[i6] & 255) | ((bArr[i4] & 255) << 8);
            F(H() - 2);
            if (i7 == i5) {
                this.f2082e = uVar.b();
                v.b(uVar);
            } else {
                uVar.f2141b = i7;
            }
            return (short) b4;
        }
        throw new EOFException();
    }

    public String D(long j4, Charset charset) {
        l.e(charset, "charset");
        int i4 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        } else if (this.f2083f < j4) {
            throw new EOFException();
        } else if (i4 == 0) {
            return "";
        } else {
            u uVar = this.f2082e;
            l.b(uVar);
            int i5 = uVar.f2141b;
            if (((long) i5) + j4 > ((long) uVar.f2142c)) {
                return new String(t(j4), charset);
            }
            int i6 = (int) j4;
            String str = new String(uVar.f2140a, i5, i6, charset);
            int i7 = uVar.f2141b + i6;
            uVar.f2141b = i7;
            this.f2083f -= j4;
            if (i7 == uVar.f2142c) {
                this.f2082e = uVar.b();
                v.b(uVar);
            }
            return str;
        }
    }

    public OutputStream E() {
        return new c(this);
    }

    public final void F(long j4) {
        this.f2083f = j4;
    }

    public InputStream G() {
        return new C0044b(this);
    }

    public final long H() {
        return this.f2083f;
    }

    public void I(C0298b bVar, long j4) {
        u uVar;
        l.e(bVar, "source");
        if (bVar != this) {
            C0297a.b(bVar.H(), 0, j4);
            while (j4 > 0) {
                u uVar2 = bVar.f2082e;
                l.b(uVar2);
                int i4 = uVar2.f2142c;
                u uVar3 = bVar.f2082e;
                l.b(uVar3);
                if (j4 < ((long) (i4 - uVar3.f2141b))) {
                    u uVar4 = this.f2082e;
                    if (uVar4 != null) {
                        l.b(uVar4);
                        uVar = uVar4.f2146g;
                    } else {
                        uVar = null;
                    }
                    if (uVar != null && uVar.f2144e) {
                        if ((((long) uVar.f2142c) + j4) - ((long) (uVar.f2143d ? 0 : uVar.f2141b)) <= 8192) {
                            u uVar5 = bVar.f2082e;
                            l.b(uVar5);
                            uVar5.f(uVar, (int) j4);
                            bVar.F(bVar.H() - j4);
                            F(H() + j4);
                            return;
                        }
                    }
                    u uVar6 = bVar.f2082e;
                    l.b(uVar6);
                    bVar.f2082e = uVar6.e((int) j4);
                }
                u uVar7 = bVar.f2082e;
                l.b(uVar7);
                long j5 = (long) (uVar7.f2142c - uVar7.f2141b);
                bVar.f2082e = uVar7.b();
                u uVar8 = this.f2082e;
                if (uVar8 == null) {
                    this.f2082e = uVar7;
                    uVar7.f2146g = uVar7;
                    uVar7.f2145f = uVar7;
                } else {
                    l.b(uVar8);
                    u uVar9 = uVar8.f2146g;
                    l.b(uVar9);
                    uVar9.c(uVar7).a();
                }
                bVar.F(bVar.H() - j5);
                F(H() + j5);
                j4 -= j5;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public final e J() {
        if (H() <= 2147483647L) {
            return K((int) H());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + H()).toString());
    }

    public final e K(int i4) {
        if (i4 == 0) {
            return e.f2093i;
        }
        C0297a.b(H(), 0, (long) i4);
        u uVar = this.f2082e;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            l.b(uVar);
            int i8 = uVar.f2142c;
            int i9 = uVar.f2141b;
            if (i8 != i9) {
                i6 += i8 - i9;
                i7++;
                uVar = uVar.f2145f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i7][];
        int[] iArr = new int[(i7 * 2)];
        u uVar2 = this.f2082e;
        int i10 = 0;
        while (i5 < i4) {
            l.b(uVar2);
            bArr[i10] = uVar2.f2140a;
            i5 += uVar2.f2142c - uVar2.f2141b;
            iArr[i10] = Math.min(i5, i4);
            iArr[i10 + i7] = uVar2.f2141b;
            uVar2.f2143d = true;
            i10++;
            uVar2 = uVar2.f2145f;
        }
        return new w(bArr, iArr);
    }

    public final u L(int i4) {
        if (i4 < 1 || i4 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        u uVar = this.f2082e;
        if (uVar == null) {
            u c4 = v.c();
            this.f2082e = c4;
            c4.f2146g = c4;
            c4.f2145f = c4;
            return c4;
        }
        l.b(uVar);
        u uVar2 = uVar.f2146g;
        l.b(uVar2);
        return (uVar2.f2142c + i4 > 8192 || !uVar2.f2144e) ? uVar2.c(v.c()) : uVar2;
    }

    public C0298b M(e eVar) {
        l.e(eVar, "byteString");
        eVar.H(this, 0, eVar.C());
        return this;
    }

    public C0298b N(byte[] bArr, int i4, int i5) {
        l.e(bArr, "source");
        long j4 = (long) i5;
        C0297a.b((long) bArr.length, (long) i4, j4);
        int i6 = i5 + i4;
        while (i4 < i6) {
            u L4 = L(1);
            int min = Math.min(i6 - i4, 8192 - L4.f2142c);
            int i7 = i4 + min;
            C0734k.d(bArr, L4.f2140a, L4.f2142c, i4, i7);
            L4.f2142c += min;
            i4 = i7;
        }
        F(H() + j4);
        return this;
    }

    public long O(y yVar) {
        l.e(yVar, "source");
        long j4 = 0;
        while (true) {
            long v4 = yVar.v(this, 8192);
            if (v4 == -1) {
                return j4;
            }
            j4 += v4;
        }
    }

    public C0298b P(int i4) {
        u L4 = L(1);
        byte[] bArr = L4.f2140a;
        int i5 = L4.f2142c;
        L4.f2142c = i5 + 1;
        bArr[i5] = (byte) i4;
        F(H() + 1);
        return this;
    }

    public C0298b Q(String str) {
        l.e(str, "string");
        return R(str, 0, str.length());
    }

    public C0298b R(String str, int i4, int i5) {
        char charAt;
        l.e(str, "string");
        if (i4 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i4).toString());
        } else if (i5 < i4) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i5 + " < " + i4).toString());
        } else if (i5 <= str.length()) {
            while (i4 < i5) {
                char charAt2 = str.charAt(i4);
                if (charAt2 < 128) {
                    u L4 = L(1);
                    byte[] bArr = L4.f2140a;
                    int i6 = L4.f2142c - i4;
                    int min = Math.min(i5, 8192 - i6);
                    int i7 = i4 + 1;
                    bArr[i4 + i6] = (byte) charAt2;
                    while (true) {
                        i4 = i7;
                        if (i4 >= min || (charAt = str.charAt(i4)) >= 128) {
                            int i8 = L4.f2142c;
                            int i9 = (i6 + i4) - i8;
                            L4.f2142c = i8 + i9;
                            F(H() + ((long) i9));
                        } else {
                            i7 = i4 + 1;
                            bArr[i4 + i6] = (byte) charAt;
                        }
                    }
                    int i82 = L4.f2142c;
                    int i92 = (i6 + i4) - i82;
                    L4.f2142c = i82 + i92;
                    F(H() + ((long) i92));
                } else {
                    if (charAt2 < 2048) {
                        u L5 = L(2);
                        byte[] bArr2 = L5.f2140a;
                        int i10 = L5.f2142c;
                        bArr2[i10] = (byte) ((charAt2 >> 6) | 192);
                        bArr2[i10 + 1] = (byte) ((charAt2 & '?') | 128);
                        L5.f2142c = i10 + 2;
                        F(H() + 2);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        u L6 = L(3);
                        byte[] bArr3 = L6.f2140a;
                        int i11 = L6.f2142c;
                        bArr3[i11] = (byte) ((charAt2 >> 12) | 224);
                        bArr3[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                        bArr3[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                        L6.f2142c = i11 + 3;
                        F(H() + 3);
                    } else {
                        int i12 = i4 + 1;
                        char charAt3 = i12 < i5 ? str.charAt(i12) : 0;
                        if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                            P(63);
                            i4 = i12;
                        } else {
                            int i13 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 0;
                            u L7 = L(4);
                            byte[] bArr4 = L7.f2140a;
                            int i14 = L7.f2142c;
                            bArr4[i14] = (byte) ((i13 >> 18) | 240);
                            bArr4[i14 + 1] = (byte) (((i13 >> 12) & 63) | 128);
                            bArr4[i14 + 2] = (byte) (((i13 >> 6) & 63) | 128);
                            bArr4[i14 + 3] = (byte) ((i13 & 63) | 128);
                            L7.f2142c = i14 + 4;
                            F(H() + 4);
                            i4 += 2;
                        }
                    }
                    i4++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException(("endIndex > string.length: " + i5 + " > " + str.length()).toString());
        }
    }

    public String a(long j4) {
        return D(j4, C3.c.f534b);
    }

    public final void b() {
        skip(H());
    }

    public void close() {
    }

    /* renamed from: e */
    public C0298b clone() {
        return h();
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r0 != r1) goto L_0x0009
            goto L_0x0081
        L_0x0009:
            boolean r3 = r1 instanceof O3.C0298b
            r4 = 0
            if (r3 != 0) goto L_0x0011
        L_0x000e:
            r2 = r4
            goto L_0x0081
        L_0x0011:
            long r5 = r18.H()
            O3.b r1 = (O3.C0298b) r1
            long r7 = r1.H()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0020
            goto L_0x000e
        L_0x0020:
            long r5 = r18.H()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x002b
            goto L_0x0081
        L_0x002b:
            O3.u r3 = r0.f2082e
            v3.l.b(r3)
            O3.u r1 = r1.f2082e
            v3.l.b(r1)
            int r5 = r3.f2141b
            int r6 = r1.f2141b
            r9 = r7
        L_0x003a:
            long r11 = r18.H()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0081
            int r11 = r3.f2142c
            int r11 = r11 - r5
            int r12 = r1.f2142c
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L_0x004e:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0069
            byte[] r15 = r3.f2140a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f2140a
            int r17 = r6 + 1
            byte r6 = r15[r6]
            if (r5 == r6) goto L_0x0061
            goto L_0x000e
        L_0x0061:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L_0x004e
        L_0x0069:
            int r13 = r3.f2142c
            if (r5 != r13) goto L_0x0074
            O3.u r3 = r3.f2145f
            v3.l.b(r3)
            int r5 = r3.f2141b
        L_0x0074:
            int r13 = r1.f2142c
            if (r6 != r13) goto L_0x007f
            O3.u r1 = r1.f2145f
            v3.l.b(r1)
            int r6 = r1.f2141b
        L_0x007f:
            long r9 = r9 + r11
            goto L_0x003a
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0298b.equals(java.lang.Object):boolean");
    }

    public void flush() {
    }

    public final long g() {
        long H4 = H();
        if (H4 == 0) {
            return 0;
        }
        u uVar = this.f2082e;
        l.b(uVar);
        u uVar2 = uVar.f2146g;
        l.b(uVar2);
        int i4 = uVar2.f2142c;
        if (i4 < 8192 && uVar2.f2144e) {
            H4 -= (long) (i4 - uVar2.f2141b);
        }
        return H4;
    }

    public final C0298b h() {
        C0298b bVar = new C0298b();
        if (H() != 0) {
            u uVar = this.f2082e;
            l.b(uVar);
            u d4 = uVar.d();
            bVar.f2082e = d4;
            d4.f2146g = d4;
            d4.f2145f = d4;
            for (u uVar2 = uVar.f2145f; uVar2 != uVar; uVar2 = uVar2.f2145f) {
                u uVar3 = d4.f2146g;
                l.b(uVar3);
                l.b(uVar2);
                uVar3.c(uVar2.d());
            }
            bVar.F(H());
        }
        return bVar;
    }

    public int hashCode() {
        u uVar = this.f2082e;
        if (uVar == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i5 = uVar.f2142c;
            for (int i6 = uVar.f2141b; i6 < i5; i6++) {
                i4 = (i4 * 31) + uVar.f2140a[i6];
            }
            uVar = uVar.f2145f;
            l.b(uVar);
        } while (uVar != this.f2082e);
        return i4;
    }

    public boolean isOpen() {
        return true;
    }

    public final byte k(long j4) {
        C0297a.b(H(), j4, 1);
        u uVar = this.f2082e;
        if (uVar == null) {
            l.b((Object) null);
            throw null;
        } else if (H() - j4 < j4) {
            long H4 = H();
            while (H4 > j4) {
                uVar = uVar.f2146g;
                l.b(uVar);
                H4 -= (long) (uVar.f2142c - uVar.f2141b);
            }
            l.b(uVar);
            return uVar.f2140a[(int) ((((long) uVar.f2141b) + j4) - H4)];
        } else {
            long j5 = 0;
            while (true) {
                long j6 = ((long) (uVar.f2142c - uVar.f2141b)) + j5;
                if (j6 <= j4) {
                    uVar = uVar.f2145f;
                    l.b(uVar);
                    j5 = j6;
                } else {
                    l.b(uVar);
                    return uVar.f2140a[(int) ((((long) uVar.f2141b) + j4) - j5)];
                }
            }
        }
    }

    public long l(e eVar) {
        l.e(eVar, "targetBytes");
        return m(eVar, 0);
    }

    public long m(e eVar, long j4) {
        long j5;
        int i4;
        int i5;
        int i6;
        l.e(eVar, "targetBytes");
        long j6 = 0;
        if (j4 >= 0) {
            u uVar = this.f2082e;
            if (uVar == null) {
                return -1;
            }
            if (H() - j4 < j4) {
                j5 = H();
                while (j5 > j4) {
                    uVar = uVar.f2146g;
                    l.b(uVar);
                    j5 -= (long) (uVar.f2142c - uVar.f2141b);
                }
                if (eVar.C() == 2) {
                    byte k4 = eVar.k(0);
                    byte k5 = eVar.k(1);
                    while (j5 < H()) {
                        byte[] bArr = uVar.f2140a;
                        i5 = (int) ((((long) uVar.f2141b) + j4) - j5);
                        int i7 = uVar.f2142c;
                        while (i5 < i7) {
                            byte b4 = bArr[i5];
                            if (!(b4 == k4 || b4 == k5)) {
                                i5++;
                            }
                        }
                        j5 += (long) (uVar.f2142c - uVar.f2141b);
                        uVar = uVar.f2145f;
                        l.b(uVar);
                        j4 = j5;
                    }
                    return -1;
                }
                byte[] t4 = eVar.t();
                while (j5 < H()) {
                    byte[] bArr2 = uVar.f2140a;
                    i4 = (int) ((((long) uVar.f2141b) + j4) - j5);
                    int i8 = uVar.f2142c;
                    while (i4 < i8) {
                        byte b5 = bArr2[i4];
                        for (byte b6 : t4) {
                            if (b5 == b6) {
                                i6 = uVar.f2141b;
                                return ((long) (i5 - i6)) + j5;
                            }
                        }
                        i4++;
                    }
                    j5 += (long) (uVar.f2142c - uVar.f2141b);
                    uVar = uVar.f2145f;
                    l.b(uVar);
                    j4 = j5;
                }
                return -1;
            }
            while (true) {
                long j7 = ((long) (uVar.f2142c - uVar.f2141b)) + j6;
                if (j7 > j4) {
                    break;
                }
                uVar = uVar.f2145f;
                l.b(uVar);
                j6 = j7;
            }
            if (eVar.C() == 2) {
                byte k6 = eVar.k(0);
                byte k7 = eVar.k(1);
                while (j5 < H()) {
                    byte[] bArr3 = uVar.f2140a;
                    int i9 = (int) ((((long) uVar.f2141b) + j4) - j5);
                    int i10 = uVar.f2142c;
                    while (i5 < i10) {
                        byte b7 = bArr3[i5];
                        if (!(b7 == k6 || b7 == k7)) {
                            i9 = i5 + 1;
                        }
                    }
                    j6 = j5 + ((long) (uVar.f2142c - uVar.f2141b));
                    uVar = uVar.f2145f;
                    l.b(uVar);
                    j4 = j6;
                }
                return -1;
            }
            byte[] t5 = eVar.t();
            while (j5 < H()) {
                byte[] bArr4 = uVar.f2140a;
                int i11 = (int) ((((long) uVar.f2141b) + j4) - j5);
                int i12 = uVar.f2142c;
                while (i4 < i12) {
                    byte b8 = bArr4[i4];
                    for (byte b9 : t5) {
                        if (b8 == b9) {
                            i6 = uVar.f2141b;
                            return ((long) (i5 - i6)) + j5;
                        }
                    }
                    i11 = i4 + 1;
                }
                j6 = j5 + ((long) (uVar.f2142c - uVar.f2141b));
                uVar = uVar.f2145f;
                l.b(uVar);
                j4 = j6;
            }
            return -1;
            i6 = uVar.f2141b;
            return ((long) (i5 - i6)) + j5;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j4).toString());
    }

    public int n() {
        return C0297a.e(z());
    }

    public C0298b o() {
        return this;
    }

    public boolean p() {
        return this.f2083f == 0;
    }

    public short q() {
        return C0297a.g(C());
    }

    public boolean r(long j4, e eVar) {
        l.e(eVar, "bytes");
        return s(j4, eVar, 0, eVar.C());
    }

    public int read(ByteBuffer byteBuffer) {
        l.e(byteBuffer, "sink");
        u uVar = this.f2082e;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), uVar.f2142c - uVar.f2141b);
        byteBuffer.put(uVar.f2140a, uVar.f2141b, min);
        int i4 = uVar.f2141b + min;
        uVar.f2141b = i4;
        this.f2083f -= (long) min;
        if (i4 == uVar.f2142c) {
            this.f2082e = uVar.b();
            v.b(uVar);
        }
        return min;
    }

    public byte readByte() {
        if (H() != 0) {
            u uVar = this.f2082e;
            l.b(uVar);
            int i4 = uVar.f2141b;
            int i5 = uVar.f2142c;
            int i6 = i4 + 1;
            byte b4 = uVar.f2140a[i4];
            F(H() - 1);
            if (i6 == i5) {
                this.f2082e = uVar.b();
                v.b(uVar);
            } else {
                uVar.f2141b = i6;
            }
            return b4;
        }
        throw new EOFException();
    }

    public boolean s(long j4, e eVar, int i4, int i5) {
        l.e(eVar, "bytes");
        if (j4 < 0 || i4 < 0 || i5 < 0 || H() - j4 < ((long) i5) || eVar.C() - i4 < i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (k(((long) i6) + j4) != eVar.k(i4 + i6)) {
                return false;
            }
        }
        return true;
    }

    public void skip(long j4) {
        while (j4 > 0) {
            u uVar = this.f2082e;
            if (uVar != null) {
                int min = (int) Math.min(j4, (long) (uVar.f2142c - uVar.f2141b));
                long j5 = (long) min;
                F(H() - j5);
                j4 -= j5;
                int i4 = uVar.f2141b + min;
                uVar.f2141b = i4;
                if (i4 == uVar.f2142c) {
                    this.f2082e = uVar.b();
                    v.b(uVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public byte[] t(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        } else if (H() >= j4) {
            byte[] bArr = new byte[((int) j4)];
            y(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public String toString() {
        return J().toString();
    }

    public long u() {
        return C0297a.f(B());
    }

    public long v(C0298b bVar, long j4) {
        l.e(bVar, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        } else if (H() == 0) {
            return -1;
        } else {
            if (j4 > H()) {
                j4 = H();
            }
            bVar.I(this, j4);
            return j4;
        }
    }

    public e w() {
        return x(H());
    }

    public int write(ByteBuffer byteBuffer) {
        l.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i4 = remaining;
        while (i4 > 0) {
            u L4 = L(1);
            int min = Math.min(i4, 8192 - L4.f2142c);
            byteBuffer.get(L4.f2140a, L4.f2142c, min);
            i4 -= min;
            L4.f2142c += min;
        }
        this.f2083f += (long) remaining;
        return remaining;
    }

    public e x(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        } else if (H() < j4) {
            throw new EOFException();
        } else if (j4 < 4096) {
            return new e(t(j4));
        } else {
            e K4 = K((int) j4);
            skip(j4);
            return K4;
        }
    }

    public void y(byte[] bArr) {
        l.e(bArr, "sink");
        int i4 = 0;
        while (i4 < bArr.length) {
            int read = read(bArr, i4, bArr.length - i4);
            if (read != -1) {
                i4 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int z() {
        if (H() >= 4) {
            u uVar = this.f2082e;
            l.b(uVar);
            int i4 = uVar.f2141b;
            int i5 = uVar.f2142c;
            if (((long) (i5 - i4)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = uVar.f2140a;
            byte b4 = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24);
            int i6 = i4 + 3;
            int i7 = i4 + 4;
            byte b5 = (bArr[i6] & 255) | b4 | ((bArr[i4 + 2] & 255) << 8);
            F(H() - 4);
            if (i7 == i5) {
                this.f2082e = uVar.b();
                v.b(uVar);
            } else {
                uVar.f2141b = i7;
            }
            return b5;
        }
        throw new EOFException();
    }

    /* renamed from: O3.b$b  reason: collision with other inner class name */
    public static final class C0044b extends InputStream {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ C0298b f2090e;

        public C0044b(C0298b bVar) {
            this.f2090e = bVar;
        }

        public int available() {
            return (int) Math.min(this.f2090e.H(), (long) Integer.MAX_VALUE);
        }

        public void close() {
        }

        public int read() {
            if (this.f2090e.H() > 0) {
                return this.f2090e.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return this.f2090e + ".inputStream()";
        }

        public int read(byte[] bArr, int i4, int i5) {
            l.e(bArr, "sink");
            return this.f2090e.read(bArr, i4, i5);
        }
    }

    public int read(byte[] bArr, int i4, int i5) {
        l.e(bArr, "sink");
        C0297a.b((long) bArr.length, (long) i4, (long) i5);
        u uVar = this.f2082e;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i5, uVar.f2142c - uVar.f2141b);
        byte[] bArr2 = uVar.f2140a;
        int i6 = uVar.f2141b;
        C0734k.d(bArr2, bArr, i4, i6, i6 + min);
        uVar.f2141b += min;
        F(H() - ((long) min));
        if (uVar.f2141b == uVar.f2142c) {
            this.f2082e = uVar.b();
            v.b(uVar);
        }
        return min;
    }
}
