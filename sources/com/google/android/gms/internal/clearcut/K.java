package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class K extends C0474x {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f6805b = Logger.getLogger(K.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f6806c = C0423f1.x();

    /* renamed from: a  reason: collision with root package name */
    public M f6807a;

    public static class a extends K {

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f6808d;

        /* renamed from: e  reason: collision with root package name */
        public final int f6809e;

        /* renamed from: f  reason: collision with root package name */
        public final int f6810f;

        /* renamed from: g  reason: collision with root package name */
        public int f6811g;

        public a(byte[] bArr, int i4, int i5) {
            super();
            if (bArr != null) {
                int i6 = i4 + i5;
                if ((i4 | i5 | (bArr.length - i6)) >= 0) {
                    this.f6808d = bArr;
                    this.f6809e = i4;
                    this.f6811g = i4;
                    this.f6810f = i6;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void D(int i4, int i5) {
            s0((i4 << 3) | i5);
        }

        public final int D0() {
            return this.f6811g - this.f6809e;
        }

        public final void F(int i4, C0477y yVar) {
            D(1, 3);
            V(2, i4);
            k(3, yVar);
            D(1, 4);
        }

        public final void G(int i4, B0 b02) {
            D(1, 3);
            V(2, i4);
            l(3, b02);
            D(1, 4);
        }

        public final void H(int i4, boolean z4) {
            D(i4, 0);
            e(z4 ? (byte) 1 : 0);
        }

        public final void I(long j4) {
            if (!K.f6806c || s() < 10) {
                while ((j4 & -128) != 0) {
                    byte[] bArr = this.f6808d;
                    int i4 = this.f6811g;
                    this.f6811g = i4 + 1;
                    bArr[i4] = (byte) ((((int) j4) & 127) | 128);
                    j4 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f6808d;
                    int i5 = this.f6811g;
                    this.f6811g = i5 + 1;
                    bArr2[i5] = (byte) ((int) j4);
                } catch (IndexOutOfBoundsException e4) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6811g), Integer.valueOf(this.f6810f), 1}), e4);
                }
            } else {
                while ((j4 & -128) != 0) {
                    byte[] bArr3 = this.f6808d;
                    int i6 = this.f6811g;
                    this.f6811g = i6 + 1;
                    C0423f1.k(bArr3, (long) i6, (byte) ((((int) j4) & 127) | 128));
                    j4 >>>= 7;
                }
                byte[] bArr4 = this.f6808d;
                int i7 = this.f6811g;
                this.f6811g = i7 + 1;
                C0423f1.k(bArr4, (long) i7, (byte) ((int) j4));
            }
        }

        public final void J(B0 b02) {
            s0(b02.g());
            b02.a(this);
        }

        public final void Q(int i4, int i5) {
            D(i4, 0);
            r0(i5);
        }

        public final void R(int i4, long j4) {
            D(i4, 1);
            W(j4);
        }

        public final void V(int i4, int i5) {
            D(i4, 0);
            s0(i5);
        }

        public final void W(long j4) {
            try {
                byte[] bArr = this.f6808d;
                int i4 = this.f6811g;
                int i5 = i4 + 1;
                this.f6811g = i5;
                bArr[i4] = (byte) ((int) j4);
                int i6 = i4 + 2;
                this.f6811g = i6;
                bArr[i5] = (byte) ((int) (j4 >> 8));
                int i7 = i4 + 3;
                this.f6811g = i7;
                bArr[i6] = (byte) ((int) (j4 >> 16));
                int i8 = i4 + 4;
                this.f6811g = i8;
                bArr[i7] = (byte) ((int) (j4 >> 24));
                int i9 = i4 + 5;
                this.f6811g = i9;
                bArr[i8] = (byte) ((int) (j4 >> 32));
                int i10 = i4 + 6;
                this.f6811g = i10;
                bArr[i9] = (byte) ((int) (j4 >> 40));
                int i11 = i4 + 7;
                this.f6811g = i11;
                bArr[i10] = (byte) ((int) (j4 >> 48));
                this.f6811g = i4 + 8;
                bArr[i11] = (byte) ((int) (j4 >> 56));
            } catch (IndexOutOfBoundsException e4) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6811g), Integer.valueOf(this.f6810f), 1}), e4);
            }
        }

        public final void a(byte[] bArr, int i4, int i5) {
            c(bArr, i4, i5);
        }

        public void b() {
        }

        public final void c(byte[] bArr, int i4, int i5) {
            try {
                System.arraycopy(bArr, i4, this.f6808d, this.f6811g, i5);
                this.f6811g += i5;
            } catch (IndexOutOfBoundsException e4) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6811g), Integer.valueOf(this.f6810f), Integer.valueOf(i5)}), e4);
            }
        }

        public final void c0(int i4, int i5) {
            D(i4, 5);
            u0(i5);
        }

        public final void e(byte b4) {
            try {
                byte[] bArr = this.f6808d;
                int i4 = this.f6811g;
                this.f6811g = i4 + 1;
                bArr[i4] = b4;
            } catch (IndexOutOfBoundsException e4) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6811g), Integer.valueOf(this.f6810f), 1}), e4);
            }
        }

        public final void g0(String str) {
            int i4 = this.f6811g;
            try {
                int x02 = K.x0(str.length() * 3);
                int x03 = K.x0(str.length());
                if (x03 == x02) {
                    int i5 = i4 + x03;
                    this.f6811g = i5;
                    int b4 = C0429h1.b(str, this.f6808d, i5, s());
                    this.f6811g = i4;
                    s0((b4 - i4) - x03);
                    this.f6811g = b4;
                    return;
                }
                s0(C0429h1.a(str));
                this.f6811g = C0429h1.b(str, this.f6808d, this.f6811g, s());
            } catch (C0438k1 e4) {
                this.f6811g = i4;
                q(str, e4);
            } catch (IndexOutOfBoundsException e5) {
                throw new c((Throwable) e5);
            }
        }

        public final void j(int i4, long j4) {
            D(i4, 0);
            I(j4);
        }

        public final void k(int i4, C0477y yVar) {
            D(i4, 2);
            o(yVar);
        }

        public final void l(int i4, B0 b02) {
            D(i4, 2);
            J(b02);
        }

        public final void m(int i4, B0 b02, R0 r02) {
            D(i4, 2);
            C0451p pVar = (C0451p) b02;
            int d4 = pVar.d();
            if (d4 == -1) {
                d4 = r02.i(pVar);
                pVar.c(d4);
            }
            s0(d4);
            r02.f(b02, this.f6807a);
        }

        public final void n(int i4, String str) {
            D(i4, 2);
            g0(str);
        }

        public final void o(C0477y yVar) {
            s0(yVar.size());
            yVar.v(this);
        }

        public final void p(B0 b02, R0 r02) {
            C0451p pVar = (C0451p) b02;
            int d4 = pVar.d();
            if (d4 == -1) {
                d4 = r02.i(pVar);
                pVar.c(d4);
            }
            s0(d4);
            r02.f(b02, this.f6807a);
        }

        public final void r0(int i4) {
            if (i4 >= 0) {
                s0(i4);
            } else {
                I((long) i4);
            }
        }

        public final int s() {
            return this.f6810f - this.f6811g;
        }

        public final void s0(int i4) {
            if (!K.f6806c || s() < 10) {
                while ((i4 & -128) != 0) {
                    byte[] bArr = this.f6808d;
                    int i5 = this.f6811g;
                    this.f6811g = i5 + 1;
                    bArr[i5] = (byte) ((i4 & 127) | 128);
                    i4 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f6808d;
                    int i6 = this.f6811g;
                    this.f6811g = i6 + 1;
                    bArr2[i6] = (byte) i4;
                } catch (IndexOutOfBoundsException e4) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6811g), Integer.valueOf(this.f6810f), 1}), e4);
                }
            } else {
                while ((i4 & -128) != 0) {
                    byte[] bArr3 = this.f6808d;
                    int i7 = this.f6811g;
                    this.f6811g = i7 + 1;
                    C0423f1.k(bArr3, (long) i7, (byte) ((i4 & 127) | 128));
                    i4 >>>= 7;
                }
                byte[] bArr4 = this.f6808d;
                int i8 = this.f6811g;
                this.f6811g = i8 + 1;
                C0423f1.k(bArr4, (long) i8, (byte) i4);
            }
        }

        public final void u0(int i4) {
            try {
                byte[] bArr = this.f6808d;
                int i5 = this.f6811g;
                int i6 = i5 + 1;
                this.f6811g = i6;
                bArr[i5] = (byte) i4;
                int i7 = i5 + 2;
                this.f6811g = i7;
                bArr[i6] = (byte) (i4 >> 8);
                int i8 = i5 + 3;
                this.f6811g = i8;
                bArr[i7] = (byte) (i4 >> 16);
                this.f6811g = i5 + 4;
                bArr[i8] = i4 >> 24;
            } catch (IndexOutOfBoundsException e4) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6811g), Integer.valueOf(this.f6810f), 1}), e4);
            }
        }
    }

    public static final class b extends a {

        /* renamed from: h  reason: collision with root package name */
        public final ByteBuffer f6812h;

        /* renamed from: i  reason: collision with root package name */
        public int f6813i;

        public b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f6812h = byteBuffer;
            this.f6813i = byteBuffer.position();
        }

        public final void b() {
            this.f6812h.position(this.f6813i + D0());
        }
    }

    public static class c extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(java.lang.String r3) {
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
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.K.c.<init>(java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(java.lang.String r3, java.lang.Throwable r4) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.K.c.<init>(java.lang.String, java.lang.Throwable):void");
        }

        public c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    public static final class d extends K {

        /* renamed from: d  reason: collision with root package name */
        public final ByteBuffer f6814d;

        /* renamed from: e  reason: collision with root package name */
        public final ByteBuffer f6815e;

        /* renamed from: f  reason: collision with root package name */
        public final int f6816f;

        public d(ByteBuffer byteBuffer) {
            super();
            this.f6814d = byteBuffer;
            this.f6815e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f6816f = byteBuffer.position();
        }

        public final void D(int i4, int i5) {
            s0((i4 << 3) | i5);
        }

        public final void D0(String str) {
            try {
                C0429h1.c(str, this.f6815e);
            } catch (IndexOutOfBoundsException e4) {
                throw new c((Throwable) e4);
            }
        }

        public final void F(int i4, C0477y yVar) {
            D(1, 3);
            V(2, i4);
            k(3, yVar);
            D(1, 4);
        }

        public final void G(int i4, B0 b02) {
            D(1, 3);
            V(2, i4);
            l(3, b02);
            D(1, 4);
        }

        public final void H(int i4, boolean z4) {
            D(i4, 0);
            e(z4 ? (byte) 1 : 0);
        }

        public final void I(long j4) {
            while ((-128 & j4) != 0) {
                this.f6815e.put((byte) ((((int) j4) & 127) | 128));
                j4 >>>= 7;
            }
            try {
                this.f6815e.put((byte) ((int) j4));
            } catch (BufferOverflowException e4) {
                throw new c((Throwable) e4);
            }
        }

        public final void J(B0 b02) {
            s0(b02.g());
            b02.a(this);
        }

        public final void Q(int i4, int i5) {
            D(i4, 0);
            r0(i5);
        }

        public final void R(int i4, long j4) {
            D(i4, 1);
            W(j4);
        }

        public final void V(int i4, int i5) {
            D(i4, 0);
            s0(i5);
        }

        public final void W(long j4) {
            try {
                this.f6815e.putLong(j4);
            } catch (BufferOverflowException e4) {
                throw new c((Throwable) e4);
            }
        }

        public final void a(byte[] bArr, int i4, int i5) {
            c(bArr, i4, i5);
        }

        public final void b() {
            this.f6814d.position(this.f6815e.position());
        }

        public final void c(byte[] bArr, int i4, int i5) {
            try {
                this.f6815e.put(bArr, i4, i5);
            } catch (IndexOutOfBoundsException e4) {
                throw new c((Throwable) e4);
            } catch (BufferOverflowException e5) {
                throw new c((Throwable) e5);
            }
        }

        public final void c0(int i4, int i5) {
            D(i4, 5);
            u0(i5);
        }

        public final void e(byte b4) {
            try {
                this.f6815e.put(b4);
            } catch (BufferOverflowException e4) {
                throw new c((Throwable) e4);
            }
        }

        public final void g0(String str) {
            int position = this.f6815e.position();
            try {
                int x02 = K.x0(str.length() * 3);
                int x03 = K.x0(str.length());
                if (x03 == x02) {
                    int position2 = this.f6815e.position() + x03;
                    this.f6815e.position(position2);
                    D0(str);
                    int position3 = this.f6815e.position();
                    this.f6815e.position(position);
                    s0(position3 - position2);
                    this.f6815e.position(position3);
                    return;
                }
                s0(C0429h1.a(str));
                D0(str);
            } catch (C0438k1 e4) {
                this.f6815e.position(position);
                q(str, e4);
            } catch (IllegalArgumentException e5) {
                throw new c((Throwable) e5);
            }
        }

        public final void j(int i4, long j4) {
            D(i4, 0);
            I(j4);
        }

        public final void k(int i4, C0477y yVar) {
            D(i4, 2);
            o(yVar);
        }

        public final void l(int i4, B0 b02) {
            D(i4, 2);
            J(b02);
        }

        public final void m(int i4, B0 b02, R0 r02) {
            D(i4, 2);
            p(b02, r02);
        }

        public final void n(int i4, String str) {
            D(i4, 2);
            g0(str);
        }

        public final void o(C0477y yVar) {
            s0(yVar.size());
            yVar.v(this);
        }

        public final void p(B0 b02, R0 r02) {
            C0451p pVar = (C0451p) b02;
            int d4 = pVar.d();
            if (d4 == -1) {
                d4 = r02.i(pVar);
                pVar.c(d4);
            }
            s0(d4);
            r02.f(b02, this.f6807a);
        }

        public final void r0(int i4) {
            if (i4 >= 0) {
                s0(i4);
            } else {
                I((long) i4);
            }
        }

        public final int s() {
            return this.f6815e.remaining();
        }

        public final void s0(int i4) {
            while ((i4 & -128) != 0) {
                this.f6815e.put((byte) ((i4 & 127) | 128));
                i4 >>>= 7;
            }
            try {
                this.f6815e.put((byte) i4);
            } catch (BufferOverflowException e4) {
                throw new c((Throwable) e4);
            }
        }

        public final void u0(int i4) {
            try {
                this.f6815e.putInt(i4);
            } catch (BufferOverflowException e4) {
                throw new c((Throwable) e4);
            }
        }
    }

    public static final class e extends K {

        /* renamed from: d  reason: collision with root package name */
        public final ByteBuffer f6817d;

        /* renamed from: e  reason: collision with root package name */
        public final ByteBuffer f6818e;

        /* renamed from: f  reason: collision with root package name */
        public final long f6819f;

        /* renamed from: g  reason: collision with root package name */
        public final long f6820g;

        /* renamed from: h  reason: collision with root package name */
        public final long f6821h;

        /* renamed from: i  reason: collision with root package name */
        public final long f6822i;

        /* renamed from: j  reason: collision with root package name */
        public long f6823j;

        public e(ByteBuffer byteBuffer) {
            super();
            this.f6817d = byteBuffer;
            this.f6818e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long o4 = C0423f1.o(byteBuffer);
            this.f6819f = o4;
            long position = ((long) byteBuffer.position()) + o4;
            this.f6820g = position;
            long limit = o4 + ((long) byteBuffer.limit());
            this.f6821h = limit;
            this.f6822i = limit - 10;
            this.f6823j = position;
        }

        public final void D(int i4, int i5) {
            s0((i4 << 3) | i5);
        }

        public final void D0(long j4) {
            this.f6818e.position((int) (j4 - this.f6819f));
        }

        public final void F(int i4, C0477y yVar) {
            D(1, 3);
            V(2, i4);
            k(3, yVar);
            D(1, 4);
        }

        public final void G(int i4, B0 b02) {
            D(1, 3);
            V(2, i4);
            l(3, b02);
            D(1, 4);
        }

        public final void H(int i4, boolean z4) {
            D(i4, 0);
            e(z4 ? (byte) 1 : 0);
        }

        public final void I(long j4) {
            if (this.f6823j <= this.f6822i) {
                while ((j4 & -128) != 0) {
                    long j5 = this.f6823j;
                    this.f6823j = j5 + 1;
                    C0423f1.c(j5, (byte) ((((int) j4) & 127) | 128));
                    j4 >>>= 7;
                }
                long j6 = this.f6823j;
                this.f6823j = 1 + j6;
                C0423f1.c(j6, (byte) ((int) j4));
                return;
            }
            while (true) {
                long j7 = this.f6823j;
                if (j7 >= this.f6821h) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f6823j), Long.valueOf(this.f6821h), 1}));
                } else if ((j4 & -128) == 0) {
                    this.f6823j = 1 + j7;
                    C0423f1.c(j7, (byte) ((int) j4));
                    return;
                } else {
                    this.f6823j = j7 + 1;
                    C0423f1.c(j7, (byte) ((((int) j4) & 127) | 128));
                    j4 >>>= 7;
                }
            }
        }

        public final void J(B0 b02) {
            s0(b02.g());
            b02.a(this);
        }

        public final void Q(int i4, int i5) {
            D(i4, 0);
            r0(i5);
        }

        public final void R(int i4, long j4) {
            D(i4, 1);
            W(j4);
        }

        public final void V(int i4, int i5) {
            D(i4, 0);
            s0(i5);
        }

        public final void W(long j4) {
            this.f6818e.putLong((int) (this.f6823j - this.f6819f), j4);
            this.f6823j += 8;
        }

        public final void a(byte[] bArr, int i4, int i5) {
            c(bArr, i4, i5);
        }

        public final void b() {
            this.f6817d.position((int) (this.f6823j - this.f6819f));
        }

        public final void c(byte[] bArr, int i4, int i5) {
            if (bArr != null && i4 >= 0 && i5 >= 0 && bArr.length - i5 >= i4) {
                long j4 = (long) i5;
                long j5 = this.f6823j;
                if (this.f6821h - j4 >= j5) {
                    C0423f1.l(bArr, (long) i4, j5, j4);
                    this.f6823j += j4;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f6823j), Long.valueOf(this.f6821h), Integer.valueOf(i5)}));
        }

        public final void c0(int i4, int i5) {
            D(i4, 5);
            u0(i5);
        }

        public final void e(byte b4) {
            long j4 = this.f6823j;
            if (j4 < this.f6821h) {
                this.f6823j = 1 + j4;
                C0423f1.c(j4, b4);
                return;
            }
            throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f6823j), Long.valueOf(this.f6821h), 1}));
        }

        public final void g0(String str) {
            long j4 = this.f6823j;
            try {
                int x02 = K.x0(str.length() * 3);
                int x03 = K.x0(str.length());
                if (x03 == x02) {
                    int i4 = ((int) (this.f6823j - this.f6819f)) + x03;
                    this.f6818e.position(i4);
                    C0429h1.c(str, this.f6818e);
                    int position = this.f6818e.position() - i4;
                    s0(position);
                    this.f6823j += (long) position;
                    return;
                }
                int a4 = C0429h1.a(str);
                s0(a4);
                D0(this.f6823j);
                C0429h1.c(str, this.f6818e);
                this.f6823j += (long) a4;
            } catch (C0438k1 e4) {
                this.f6823j = j4;
                D0(j4);
                q(str, e4);
            } catch (IllegalArgumentException e5) {
                throw new c((Throwable) e5);
            } catch (IndexOutOfBoundsException e6) {
                throw new c((Throwable) e6);
            }
        }

        public final void j(int i4, long j4) {
            D(i4, 0);
            I(j4);
        }

        public final void k(int i4, C0477y yVar) {
            D(i4, 2);
            o(yVar);
        }

        public final void l(int i4, B0 b02) {
            D(i4, 2);
            J(b02);
        }

        public final void m(int i4, B0 b02, R0 r02) {
            D(i4, 2);
            p(b02, r02);
        }

        public final void n(int i4, String str) {
            D(i4, 2);
            g0(str);
        }

        public final void o(C0477y yVar) {
            s0(yVar.size());
            yVar.v(this);
        }

        public final void p(B0 b02, R0 r02) {
            C0451p pVar = (C0451p) b02;
            int d4 = pVar.d();
            if (d4 == -1) {
                d4 = r02.i(pVar);
                pVar.c(d4);
            }
            s0(d4);
            r02.f(b02, this.f6807a);
        }

        public final void r0(int i4) {
            if (i4 >= 0) {
                s0(i4);
            } else {
                I((long) i4);
            }
        }

        public final int s() {
            return (int) (this.f6821h - this.f6823j);
        }

        public final void s0(int i4) {
            long j4;
            if (this.f6823j <= this.f6822i) {
                while (true) {
                    int i5 = i4 & -128;
                    j4 = this.f6823j;
                    if (i5 == 0) {
                        break;
                    }
                    this.f6823j = j4 + 1;
                    C0423f1.c(j4, (byte) ((i4 & 127) | 128));
                    i4 >>>= 7;
                }
            } else {
                while (true) {
                    j4 = this.f6823j;
                    if (j4 >= this.f6821h) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f6823j), Long.valueOf(this.f6821h), 1}));
                    } else if ((i4 & -128) == 0) {
                        break;
                    } else {
                        this.f6823j = j4 + 1;
                        C0423f1.c(j4, (byte) ((i4 & 127) | 128));
                        i4 >>>= 7;
                    }
                }
            }
            this.f6823j = 1 + j4;
            C0423f1.c(j4, (byte) i4);
        }

        public final void u0(int i4) {
            this.f6818e.putInt((int) (this.f6823j - this.f6819f), i4);
            this.f6823j += 4;
        }
    }

    public K() {
    }

    public static int A(C0477y yVar) {
        int size = yVar.size();
        return x0(size) + size;
    }

    public static int A0(int i4) {
        return 4;
    }

    public static int B(B0 b02, R0 r02) {
        C0451p pVar = (C0451p) b02;
        int d4 = pVar.d();
        if (d4 == -1) {
            d4 = r02.i(pVar);
            pVar.c(d4);
        }
        return x0(d4) + d4;
    }

    public static int B0(int i4) {
        return w0(i4);
    }

    public static int C(boolean z4) {
        return 1;
    }

    public static int C0(int i4) {
        return (i4 >> 31) ^ (i4 << 1);
    }

    public static int K(int i4, C0477y yVar) {
        int v02 = v0(i4);
        int size = yVar.size();
        return v02 + x0(size) + size;
    }

    public static int L(int i4, B0 b02) {
        return v0(i4) + O(b02);
    }

    public static int M(int i4, B0 b02, R0 r02) {
        int v02 = v0(i4) << 1;
        C0451p pVar = (C0451p) b02;
        int d4 = pVar.d();
        if (d4 == -1) {
            d4 = r02.i(pVar);
            pVar.c(d4);
        }
        return v02 + d4;
    }

    public static int N(int i4, boolean z4) {
        return v0(i4) + 1;
    }

    public static int O(B0 b02) {
        int g4 = b02.g();
        return x0(g4) + g4;
    }

    public static K P(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int T(int i4, long j4) {
        return v0(i4) + b0(j4);
    }

    public static int U(int i4, C0477y yVar) {
        return (v0(1) << 1) + h0(2, i4) + K(3, yVar);
    }

    public static int X(int i4, long j4) {
        return v0(i4) + b0(j4);
    }

    public static int Y(long j4) {
        return b0(j4);
    }

    public static int a0(int i4, long j4) {
        return v0(i4) + b0(o0(j4));
    }

    public static int b0(long j4) {
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

    public static K d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            return C0423f1.y() ? new e(byteBuffer) : new d(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    public static int d0(int i4, int i5) {
        return v0(i4) + w0(i5);
    }

    public static int e0(int i4, long j4) {
        return v0(i4) + 8;
    }

    public static int f0(long j4) {
        return b0(o0(j4));
    }

    public static int h0(int i4, int i5) {
        return v0(i4) + x0(i5);
    }

    public static int i0(int i4, long j4) {
        return v0(i4) + 8;
    }

    public static int j0(long j4) {
        return 8;
    }

    public static int k0(String str) {
        int i4;
        try {
            i4 = C0429h1.a(str);
        } catch (C0438k1 unused) {
            i4 = str.getBytes(C0413c0.f7045a).length;
        }
        return x0(i4) + i4;
    }

    public static int l0(int i4, int i5) {
        return v0(i4) + x0(C0(i5));
    }

    public static int m0(long j4) {
        return 8;
    }

    public static int n0(int i4, int i5) {
        return v0(i4) + 4;
    }

    public static long o0(long j4) {
        return (j4 >> 63) ^ (j4 << 1);
    }

    public static int p0(int i4, int i5) {
        return v0(i4) + 4;
    }

    public static int q0(int i4, int i5) {
        return v0(i4) + w0(i5);
    }

    public static int u(double d4) {
        return 8;
    }

    public static int v(float f4) {
        return 4;
    }

    public static int v0(int i4) {
        return x0(i4 << 3);
    }

    public static int w(int i4, double d4) {
        return v0(i4) + 8;
    }

    public static int w0(int i4) {
        if (i4 >= 0) {
            return x0(i4);
        }
        return 10;
    }

    public static int x(int i4, float f4) {
        return v0(i4) + 4;
    }

    public static int x0(int i4) {
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

    public static int y(int i4, B0 b02, R0 r02) {
        return v0(i4) + B(b02, r02);
    }

    public static int y0(int i4) {
        return x0(C0(i4));
    }

    public static int z(int i4, String str) {
        return v0(i4) + k0(str);
    }

    public static int z0(int i4) {
        return 4;
    }

    public abstract void D(int i4, int i5);

    public final void E(int i4, long j4) {
        j(i4, o0(j4));
    }

    public abstract void F(int i4, C0477y yVar);

    public abstract void G(int i4, B0 b02);

    public abstract void H(int i4, boolean z4);

    public abstract void I(long j4);

    public abstract void J(B0 b02);

    public abstract void Q(int i4, int i5);

    public abstract void R(int i4, long j4);

    public final void S(long j4) {
        I(o0(j4));
    }

    public abstract void V(int i4, int i5);

    public abstract void W(long j4);

    public final void Z(int i4, int i5) {
        V(i4, C0(i5));
    }

    public abstract void b();

    public abstract void c(byte[] bArr, int i4, int i5);

    public abstract void c0(int i4, int i5);

    public abstract void e(byte b4);

    public final void f(double d4) {
        W(Double.doubleToRawLongBits(d4));
    }

    public final void g(float f4) {
        u0(Float.floatToRawIntBits(f4));
    }

    public abstract void g0(String str);

    public final void h(int i4, double d4) {
        R(i4, Double.doubleToRawLongBits(d4));
    }

    public final void i(int i4, float f4) {
        c0(i4, Float.floatToRawIntBits(f4));
    }

    public abstract void j(int i4, long j4);

    public abstract void k(int i4, C0477y yVar);

    public abstract void l(int i4, B0 b02);

    public abstract void m(int i4, B0 b02, R0 r02);

    public abstract void n(int i4, String str);

    public abstract void o(C0477y yVar);

    public abstract void p(B0 b02, R0 r02);

    public final void q(String str, C0438k1 k1Var) {
        f6805b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", k1Var);
        byte[] bytes = str.getBytes(C0413c0.f7045a);
        try {
            s0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e4) {
            throw new c((Throwable) e4);
        } catch (c e5) {
            throw e5;
        }
    }

    public final void r(boolean z4) {
        e(z4 ? (byte) 1 : 0);
    }

    public abstract void r0(int i4);

    public abstract int s();

    public abstract void s0(int i4);

    public final void t0(int i4) {
        s0(C0(i4));
    }

    public abstract void u0(int i4);
}
