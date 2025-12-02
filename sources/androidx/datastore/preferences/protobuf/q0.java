package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

public abstract class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f5202a = ((!e.c() || C0352d.c()) ? new c() : new e());

    public static class a {
        public static void h(byte b4, byte b5, byte b6, byte b7, char[] cArr, int i4) {
            if (m(b5) || (((b4 << 28) + (b5 + 112)) >> 30) != 0 || m(b6) || m(b7)) {
                throw C0373z.d();
            }
            int r4 = ((b4 & 7) << 18) | (r(b5) << 12) | (r(b6) << 6) | r(b7);
            cArr[i4] = l(r4);
            cArr[i4 + 1] = q(r4);
        }

        public static void i(byte b4, char[] cArr, int i4) {
            cArr[i4] = (char) b4;
        }

        public static void j(byte b4, byte b5, byte b6, char[] cArr, int i4) {
            if (m(b5) || ((b4 == -32 && b5 < -96) || ((b4 == -19 && b5 >= -96) || m(b6)))) {
                throw C0373z.d();
            }
            cArr[i4] = (char) (((b4 & 15) << 12) | (r(b5) << 6) | r(b6));
        }

        public static void k(byte b4, byte b5, char[] cArr, int i4) {
            if (b4 < -62 || m(b5)) {
                throw C0373z.d();
            }
            cArr[i4] = (char) (((b4 & 31) << 6) | r(b5));
        }

        public static char l(int i4) {
            return (char) ((i4 >>> 10) + 55232);
        }

        public static boolean m(byte b4) {
            return b4 > -65;
        }

        public static boolean n(byte b4) {
            return b4 >= 0;
        }

        public static boolean o(byte b4) {
            return b4 < -16;
        }

        public static boolean p(byte b4) {
            return b4 < -32;
        }

        public static char q(int i4) {
            return (char) ((i4 & 1023) + 56320);
        }

        public static int r(byte b4) {
            return b4 & 63;
        }
    }

    public static abstract class b {
        public abstract String a(byte[] bArr, int i4, int i5);

        public abstract int b(String str, byte[] bArr, int i4, int i5);
    }

    public static final class c extends b {
        public String a(byte[] bArr, int i4, int i5) {
            if ((i4 | i5 | ((bArr.length - i4) - i5)) >= 0) {
                int i6 = i4 + i5;
                char[] cArr = new char[i5];
                int i7 = 0;
                while (r11 < i6) {
                    byte b4 = bArr[r11];
                    if (!a.n(b4)) {
                        break;
                    }
                    i4 = r11 + 1;
                    a.i(b4, cArr, i7);
                    i7++;
                }
                int i8 = i7;
                while (r11 < i6) {
                    int i9 = r11 + 1;
                    byte b5 = bArr[r11];
                    if (a.n(b5)) {
                        int i10 = i8 + 1;
                        a.i(b5, cArr, i8);
                        while (i9 < i6) {
                            byte b6 = bArr[i9];
                            if (!a.n(b6)) {
                                break;
                            }
                            i9++;
                            a.i(b6, cArr, i10);
                            i10++;
                        }
                        i8 = i10;
                        r11 = i9;
                    } else if (a.p(b5)) {
                        if (i9 < i6) {
                            r11 += 2;
                            a.k(b5, bArr[i9], cArr, i8);
                            i8++;
                        } else {
                            throw C0373z.d();
                        }
                    } else if (a.o(b5)) {
                        if (i9 < i6 - 1) {
                            int i11 = r11 + 2;
                            r11 += 3;
                            a.j(b5, bArr[i9], bArr[i11], cArr, i8);
                            i8++;
                        } else {
                            throw C0373z.d();
                        }
                    } else if (i9 < i6 - 2) {
                        byte b7 = bArr[i9];
                        int i12 = r11 + 3;
                        byte b8 = bArr[r11 + 2];
                        r11 += 4;
                        a.h(b5, b7, b8, bArr[i12], cArr, i8);
                        i8 += 2;
                    } else {
                        throw C0373z.d();
                    }
                }
                return new String(cArr, 0, i8);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)}));
        }

        public int b(String str, byte[] bArr, int i4, int i5) {
            int i6;
            int i7;
            char charAt;
            int length = str.length();
            int i8 = i5 + i4;
            int i9 = 0;
            while (i9 < length && (i7 = i9 + i4) < i8 && (charAt = str.charAt(i9)) < 128) {
                bArr[i7] = (byte) charAt;
                i9++;
            }
            if (i9 == length) {
                return i4 + length;
            }
            int i10 = i4 + i9;
            while (i9 < length) {
                char charAt2 = str.charAt(i9);
                if (charAt2 < 128 && i10 < i8) {
                    bArr[i10] = (byte) charAt2;
                    i10++;
                } else if (charAt2 < 2048 && i10 <= i8 - 2) {
                    int i11 = i10 + 1;
                    bArr[i10] = (byte) ((charAt2 >>> 6) | 960);
                    i10 += 2;
                    bArr[i11] = (byte) ((charAt2 & '?') | 128);
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i10 <= i8 - 3) {
                    bArr[i10] = (byte) ((charAt2 >>> 12) | 480);
                    int i12 = i10 + 2;
                    bArr[i10 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i10 += 3;
                    bArr[i12] = (byte) ((charAt2 & '?') | 128);
                } else if (i10 <= i8 - 4) {
                    int i13 = i9 + 1;
                    if (i13 != str.length()) {
                        char charAt3 = str.charAt(i13);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i14 = i10 + 3;
                            bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i10 += 4;
                            bArr[i14] = (byte) ((codePoint & 63) | 128);
                            i9 = i13;
                        } else {
                            i9 = i13;
                        }
                    }
                    throw new d(i9 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i6 = i9 + 1) != str.length() && Character.isSurrogatePair(charAt2, str.charAt(i6)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i10);
                } else {
                    throw new d(i9, length);
                }
                i9++;
            }
            return i10;
        }
    }

    public static class d extends IllegalArgumentException {
        public d(int i4, int i5) {
            super("Unpaired surrogate at index " + i4 + " of " + i5);
        }
    }

    public static final class e extends b {
        public static boolean c() {
            return p0.B() && p0.C();
        }

        public String a(byte[] bArr, int i4, int i5) {
            Charset charset = C0372y.f5330b;
            String str = new String(bArr, i4, i5, charset);
            if (str.indexOf(65533) < 0 || Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i4, i5 + i4))) {
                return str;
            }
            throw C0373z.d();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00f8, LOOP_START, PHI: r2 r4 r6 r9 r10 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v4 long) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r6v3 long) = (r6v1 long), (r6v4 long) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v2 java.lang.String) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v2 java.lang.String) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int b(java.lang.String r25, byte[] r26, int r27, int r28) {
            /*
                r24 = this;
                r0 = r25
                r1 = r26
                r2 = r27
                r3 = r28
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r25.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0144
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0144
                r2 = 0
            L_0x001a:
                r11 = 1
                r3 = 128(0x80, float:1.794E-43)
                if (r2 >= r8) goto L_0x002f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x002f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                androidx.datastore.preferences.protobuf.p0.H(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001a
            L_0x002f:
                if (r2 != r8) goto L_0x0033
                int r0 = (int) r4
                return r0
            L_0x0033:
                if (r2 >= r8) goto L_0x0142
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x004f
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L_0x004f
                long r14 = r4 + r11
                byte r13 = (byte) r13
                androidx.datastore.preferences.protobuf.p0.H(r1, r4, r13)
                r22 = r6
                r17 = r10
                r20 = r11
                r4 = r14
                r14 = r9
                goto L_0x00f8
            L_0x004f:
                r14 = 2048(0x800, float:2.87E-42)
                r15 = 2
                if (r13 >= r14) goto L_0x0076
                long r17 = r6 - r15
                int r14 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
                if (r14 > 0) goto L_0x0076
                r14 = r9
                r17 = r10
                long r9 = r4 + r11
                int r11 = r13 >>> 6
                r11 = r11 | 960(0x3c0, float:1.345E-42)
                byte r11 = (byte) r11
                androidx.datastore.preferences.protobuf.p0.H(r1, r4, r11)
                long r4 = r4 + r15
                r11 = r13 & 63
                r11 = r11 | r3
                byte r11 = (byte) r11
                androidx.datastore.preferences.protobuf.p0.H(r1, r9, r11)
            L_0x0070:
                r22 = r6
                r20 = 1
                goto L_0x00f8
            L_0x0076:
                r14 = r9
                r17 = r10
                r9 = 57343(0xdfff, float:8.0355E-41)
                r10 = 55296(0xd800, float:7.7486E-41)
                r11 = 3
                if (r13 < r10) goto L_0x0085
                if (r9 >= r13) goto L_0x00ad
            L_0x0085:
                long r18 = r6 - r11
                int r18 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
                if (r18 > 0) goto L_0x00ad
                r18 = 1
                long r9 = r4 + r18
                int r11 = r13 >>> 12
                r11 = r11 | 480(0x1e0, float:6.73E-43)
                byte r11 = (byte) r11
                androidx.datastore.preferences.protobuf.p0.H(r1, r4, r11)
                long r11 = r4 + r15
                int r15 = r13 >>> 6
                r15 = r15 & 63
                r15 = r15 | r3
                byte r15 = (byte) r15
                androidx.datastore.preferences.protobuf.p0.H(r1, r9, r15)
                r9 = 3
                long r4 = r4 + r9
                r9 = r13 & 63
                r9 = r9 | r3
                byte r9 = (byte) r9
                androidx.datastore.preferences.protobuf.p0.H(r1, r11, r9)
                goto L_0x0070
            L_0x00ad:
                r11 = 4
                long r20 = r6 - r11
                int r20 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
                if (r20 > 0) goto L_0x010c
                int r9 = r2 + 1
                if (r9 == r8) goto L_0x0104
                char r2 = r0.charAt(r9)
                boolean r10 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r10 == 0) goto L_0x0103
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r20 = 1
                long r11 = r4 + r20
                int r10 = r2 >>> 18
                r10 = r10 | 240(0xf0, float:3.36E-43)
                byte r10 = (byte) r10
                androidx.datastore.preferences.protobuf.p0.H(r1, r4, r10)
                r22 = r6
                long r6 = r4 + r15
                int r10 = r2 >>> 12
                r10 = r10 & 63
                r10 = r10 | r3
                byte r10 = (byte) r10
                androidx.datastore.preferences.protobuf.p0.H(r1, r11, r10)
                r10 = 3
                long r11 = r4 + r10
                int r10 = r2 >>> 6
                r10 = r10 & 63
                r10 = r10 | r3
                byte r10 = (byte) r10
                androidx.datastore.preferences.protobuf.p0.H(r1, r6, r10)
                r6 = 4
                long r4 = r4 + r6
                r2 = r2 & 63
                r2 = r2 | r3
                byte r2 = (byte) r2
                androidx.datastore.preferences.protobuf.p0.H(r1, r11, r2)
                r2 = r9
            L_0x00f8:
                int r2 = r2 + 1
                r9 = r14
                r10 = r17
                r11 = r20
                r6 = r22
                goto L_0x0033
            L_0x0103:
                r2 = r9
            L_0x0104:
                androidx.datastore.preferences.protobuf.q0$d r0 = new androidx.datastore.preferences.protobuf.q0$d
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x010c:
                if (r10 > r13) goto L_0x0124
                if (r13 > r9) goto L_0x0124
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x011e
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0124
            L_0x011e:
                androidx.datastore.preferences.protobuf.q0$d r0 = new androidx.datastore.preferences.protobuf.q0$d
                r0.<init>(r2, r8)
                throw r0
            L_0x0124:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r6 = r17
                r1.append(r6)
                r1.append(r13)
                r7 = r14
                r1.append(r7)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0142:
                int r0 = (int) r4
                return r0
            L_0x0144:
                r7 = r9
                r6 = r10
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r6)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r7)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q0.e.b(java.lang.String, byte[], int, int):int");
        }
    }

    public static String a(byte[] bArr, int i4, int i5) {
        return f5202a.a(bArr, i4, i5);
    }

    public static int b(String str, byte[] bArr, int i4, int i5) {
        return f5202a.b(str, bArr, i4, i5);
    }

    public static int c(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length && str.charAt(i4) < 128) {
            i4++;
        }
        int i5 = length;
        while (true) {
            if (i4 < length) {
                char charAt = str.charAt(i4);
                if (charAt >= 2048) {
                    i5 += d(str, i4);
                    break;
                }
                i5 += (127 - charAt) >>> 31;
                i4++;
            } else {
                break;
            }
        }
        if (i5 >= length) {
            return i5;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i5) + 4294967296L));
    }

    public static int d(String str, int i4) {
        int length = str.length();
        int i5 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt < 2048) {
                i5 += (127 - charAt) >>> 31;
            } else {
                i5 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(str, i4) >= 65536) {
                        i4++;
                    } else {
                        throw new d(i4, length);
                    }
                }
            }
            i4++;
        }
        return i5;
    }
}
