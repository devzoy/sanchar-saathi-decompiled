package com.google.android.gms.internal.vision;

public final class q2 extends l2 {
    public static int e(byte[] bArr, int i4, long j4, int i5) {
        if (i5 == 0) {
            return k2.h(i4);
        }
        if (i5 == 1) {
            return k2.i(i4, h2.a(bArr, j4));
        }
        if (i5 == 2) {
            return k2.j(i4, h2.a(bArr, j4), h2.a(bArr, j4 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ba, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r16, byte[] r17, int r18, int r19) {
        /*
            r15 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r1 | r2
            int r4 = r0.length
            int r4 = r4 - r2
            r3 = r3 | r4
            if (r3 < 0) goto L_0x00bb
            long r3 = (long) r1
            long r1 = (long) r2
            long r1 = r1 - r3
            int r1 = (int) r1
            r2 = 16
            r5 = 0
            r6 = 1
            if (r1 >= r2) goto L_0x001a
            r2 = r5
            goto L_0x002c
        L_0x001a:
            r8 = r3
            r2 = r5
        L_0x001c:
            if (r2 >= r1) goto L_0x002b
            long r10 = r8 + r6
            byte r8 = com.google.android.gms.internal.vision.h2.a(r0, r8)
            if (r8 >= 0) goto L_0x0027
            goto L_0x002c
        L_0x0027:
            int r2 = r2 + 1
            r8 = r10
            goto L_0x001c
        L_0x002b:
            r2 = r1
        L_0x002c:
            int r1 = r1 - r2
            long r8 = (long) r2
            long r3 = r3 + r8
        L_0x002f:
            r2 = r5
        L_0x0030:
            if (r1 <= 0) goto L_0x003f
            long r8 = r3 + r6
            byte r2 = com.google.android.gms.internal.vision.h2.a(r0, r3)
            if (r2 < 0) goto L_0x003e
            int r1 = r1 + -1
            r3 = r8
            goto L_0x0030
        L_0x003e:
            r3 = r8
        L_0x003f:
            if (r1 != 0) goto L_0x0042
            return r5
        L_0x0042:
            int r8 = r1 + -1
            r9 = -32
            r10 = -1
            r11 = -65
            if (r2 >= r9) goto L_0x0060
            if (r8 != 0) goto L_0x004e
            return r2
        L_0x004e:
            int r1 = r1 + -2
            r8 = -62
            if (r2 < r8) goto L_0x005f
            long r8 = r3 + r6
            byte r2 = com.google.android.gms.internal.vision.h2.a(r0, r3)
            if (r2 <= r11) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r3 = r8
            goto L_0x002f
        L_0x005f:
            return r10
        L_0x0060:
            r12 = -16
            if (r2 >= r12) goto L_0x008c
            r12 = 2
            if (r8 >= r12) goto L_0x006c
            int r0 = e(r0, r2, r3, r8)
            return r0
        L_0x006c:
            int r1 = r1 + -3
            long r13 = r3 + r6
            byte r8 = com.google.android.gms.internal.vision.h2.a(r0, r3)
            if (r8 > r11) goto L_0x008b
            r12 = -96
            if (r2 != r9) goto L_0x007c
            if (r8 < r12) goto L_0x008b
        L_0x007c:
            r9 = -19
            if (r2 != r9) goto L_0x0082
            if (r8 >= r12) goto L_0x008b
        L_0x0082:
            r8 = 2
            long r3 = r3 + r8
            byte r2 = com.google.android.gms.internal.vision.h2.a(r0, r13)
            if (r2 <= r11) goto L_0x002f
        L_0x008b:
            return r10
        L_0x008c:
            r9 = 3
            if (r8 >= r9) goto L_0x0094
            int r0 = e(r0, r2, r3, r8)
            return r0
        L_0x0094:
            int r1 = r1 + -4
            long r8 = r3 + r6
            byte r12 = com.google.android.gms.internal.vision.h2.a(r0, r3)
            if (r12 > r11) goto L_0x00ba
            int r2 = r2 << 28
            int r12 = r12 + 112
            int r2 = r2 + r12
            int r2 = r2 >> 30
            if (r2 != 0) goto L_0x00ba
            r12 = 2
            long r13 = r3 + r12
            byte r2 = com.google.android.gms.internal.vision.h2.a(r0, r8)
            if (r2 > r11) goto L_0x00ba
            r8 = 3
            long r3 = r3 + r8
            byte r2 = com.google.android.gms.internal.vision.h2.a(r0, r13)
            if (r2 <= r11) goto L_0x002f
        L_0x00ba:
            return r10
        L_0x00bb:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            java.lang.String r1 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.q2.a(int, byte[], int, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00f8, LOOP_START, PHI: r2 r4 r6 r9 r10 r11 
      PHI: (r2v4 int) = (r2v3 int), (r2v6 int) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v3 long) = (r4v2 long), (r4v4 long) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v3 long) = (r6v1 long), (r6v4 long) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v2 java.lang.String) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v2 java.lang.String) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(java.lang.CharSequence r25, byte[] r26, int r27, int r28) {
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
            if (r8 > r3) goto L_0x0146
            int r11 = r1.length
            int r11 = r11 - r3
            if (r11 < r2) goto L_0x0146
            r2 = 0
        L_0x001a:
            r11 = 1
            r3 = 128(0x80, float:1.794E-43)
            if (r2 >= r8) goto L_0x002f
            char r13 = r0.charAt(r2)
            if (r13 >= r3) goto L_0x002f
            long r11 = r11 + r4
            byte r3 = (byte) r13
            com.google.android.gms.internal.vision.h2.l(r1, r4, r3)
            int r2 = r2 + 1
            r4 = r11
            goto L_0x001a
        L_0x002f:
            if (r2 != r8) goto L_0x0033
            int r0 = (int) r4
            return r0
        L_0x0033:
            if (r2 >= r8) goto L_0x0144
            char r13 = r0.charAt(r2)
            if (r13 >= r3) goto L_0x004f
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 >= 0) goto L_0x004f
            long r14 = r4 + r11
            byte r13 = (byte) r13
            com.google.android.gms.internal.vision.h2.l(r1, r4, r13)
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
            com.google.android.gms.internal.vision.h2.l(r1, r4, r11)
            long r4 = r4 + r15
            r11 = r13 & 63
            r11 = r11 | r3
            byte r11 = (byte) r11
            com.google.android.gms.internal.vision.h2.l(r1, r9, r11)
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
            com.google.android.gms.internal.vision.h2.l(r1, r4, r11)
            long r11 = r4 + r15
            int r15 = r13 >>> 6
            r15 = r15 & 63
            r15 = r15 | r3
            byte r15 = (byte) r15
            com.google.android.gms.internal.vision.h2.l(r1, r9, r15)
            r9 = 3
            long r4 = r4 + r9
            r9 = r13 & 63
            r9 = r9 | r3
            byte r9 = (byte) r9
            com.google.android.gms.internal.vision.h2.l(r1, r11, r9)
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
            com.google.android.gms.internal.vision.h2.l(r1, r4, r10)
            r22 = r6
            long r6 = r4 + r15
            int r10 = r2 >>> 12
            r10 = r10 & 63
            r10 = r10 | r3
            byte r10 = (byte) r10
            com.google.android.gms.internal.vision.h2.l(r1, r11, r10)
            r10 = 3
            long r11 = r4 + r10
            int r10 = r2 >>> 6
            r10 = r10 & 63
            r10 = r10 | r3
            byte r10 = (byte) r10
            com.google.android.gms.internal.vision.h2.l(r1, r6, r10)
            r6 = 4
            long r4 = r4 + r6
            r2 = r2 & 63
            r2 = r2 | r3
            byte r2 = (byte) r2
            com.google.android.gms.internal.vision.h2.l(r1, r11, r2)
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
            com.google.android.gms.internal.vision.n2 r0 = new com.google.android.gms.internal.vision.n2
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
            com.google.android.gms.internal.vision.n2 r0 = new com.google.android.gms.internal.vision.n2
            r0.<init>(r2, r8)
            throw r0
        L_0x0124:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 46
            r1.<init>(r2)
            r6 = r17
            r1.append(r6)
            r1.append(r13)
            r7 = r14
            r1.append(r7)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0144:
            int r0 = (int) r4
            return r0
        L_0x0146:
            r7 = r9
            r6 = r10
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            int r8 = r8 + -1
            char r0 = r0.charAt(r8)
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 37
            r3.<init>(r4)
            r3.append(r6)
            r3.append(r0)
            r3.append(r7)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.q2.b(java.lang.CharSequence, byte[], int, int):int");
    }

    public final String d(byte[] bArr, int i4, int i5) {
        if ((i4 | i5 | ((bArr.length - i4) - i5)) >= 0) {
            int i6 = i4 + i5;
            char[] cArr = new char[i5];
            int i7 = 0;
            while (r11 < i6) {
                byte a4 = h2.a(bArr, (long) r11);
                if (!m2.l(a4)) {
                    break;
                }
                i4 = r11 + 1;
                m2.i(a4, cArr, i7);
                i7++;
            }
            int i8 = i7;
            while (r11 < i6) {
                int i9 = r11 + 1;
                byte a5 = h2.a(bArr, (long) r11);
                if (m2.l(a5)) {
                    int i10 = i8 + 1;
                    m2.i(a5, cArr, i8);
                    while (i9 < i6) {
                        byte a6 = h2.a(bArr, (long) i9);
                        if (!m2.l(a6)) {
                            break;
                        }
                        i9++;
                        m2.i(a6, cArr, i10);
                        i10++;
                    }
                    i8 = i10;
                    r11 = i9;
                } else if (m2.m(a5)) {
                    if (i9 < i6) {
                        r11 += 2;
                        m2.h(a5, h2.a(bArr, (long) i9), cArr, i8);
                        i8++;
                    } else {
                        throw W0.f();
                    }
                } else if (m2.n(a5)) {
                    if (i9 < i6 - 1) {
                        int i11 = r11 + 2;
                        r11 += 3;
                        m2.g(a5, h2.a(bArr, (long) i9), h2.a(bArr, (long) i11), cArr, i8);
                        i8++;
                    } else {
                        throw W0.f();
                    }
                } else if (i9 < i6 - 2) {
                    byte a7 = h2.a(bArr, (long) i9);
                    int i12 = r11 + 3;
                    r11 += 4;
                    m2.f(a5, a7, h2.a(bArr, (long) (r11 + 2)), h2.a(bArr, (long) i12), cArr, i8);
                    i8 += 2;
                } else {
                    throw W0.f();
                }
            }
            return new String(cArr, 0, i8);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)}));
    }
}
