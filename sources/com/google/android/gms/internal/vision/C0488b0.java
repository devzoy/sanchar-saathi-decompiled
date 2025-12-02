package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.b0  reason: case insensitive filesystem */
public abstract class C0488b0 {
    public static int a(int i4, byte[] bArr, int i5, int i6, X0 x02, C0492c0 c0Var) {
        P0 p02 = (P0) x02;
        int h4 = h(bArr, i5, c0Var);
        p02.u(c0Var.f7421a);
        while (h4 < i6) {
            int h5 = h(bArr, h4, c0Var);
            if (i4 != c0Var.f7421a) {
                break;
            }
            h4 = h(bArr, h5, c0Var);
            p02.u(c0Var.f7421a);
        }
        return h4;
    }

    public static int b(int i4, byte[] bArr, int i5, int i6, C0498d2 d2Var, C0492c0 c0Var) {
        if ((i4 >>> 3) != 0) {
            int i7 = i4 & 7;
            if (i7 == 0) {
                int j4 = j(bArr, i5, c0Var);
                d2Var.c(i4, Long.valueOf(c0Var.f7422b));
                return j4;
            } else if (i7 == 1) {
                d2Var.c(i4, Long.valueOf(k(bArr, i5)));
                return i5 + 8;
            } else if (i7 == 2) {
                int h4 = h(bArr, i5, c0Var);
                int i8 = c0Var.f7421a;
                if (i8 < 0) {
                    throw W0.b();
                } else if (i8 <= bArr.length - h4) {
                    if (i8 == 0) {
                        d2Var.c(i4, C0507g0.f7445f);
                    } else {
                        d2Var.c(i4, C0507g0.y(bArr, h4, i8));
                    }
                    return h4 + i8;
                } else {
                    throw W0.a();
                }
            } else if (i7 == 3) {
                C0498d2 g4 = C0498d2.g();
                int i9 = (i4 & -8) | 4;
                int i10 = 0;
                while (true) {
                    if (i5 >= i6) {
                        break;
                    }
                    int h5 = h(bArr, i5, c0Var);
                    int i11 = c0Var.f7421a;
                    i10 = i11;
                    if (i11 == i9) {
                        i5 = h5;
                        break;
                    }
                    int b4 = b(i10, bArr, h5, i6, g4, c0Var);
                    i10 = i11;
                    i5 = b4;
                }
                if (i5 > i6 || i10 != i9) {
                    throw W0.e();
                }
                d2Var.c(i4, g4);
                return i5;
            } else if (i7 == 5) {
                d2Var.c(i4, Integer.valueOf(g(bArr, i5)));
                return i5 + 4;
            } else {
                throw W0.c();
            }
        } else {
            throw W0.c();
        }
    }

    public static int c(int i4, byte[] bArr, int i5, C0492c0 c0Var) {
        int i6 = i4 & 127;
        int i7 = i5 + 1;
        byte b4 = bArr[i5];
        if (b4 >= 0) {
            c0Var.f7421a = i6 | (b4 << 7);
            return i7;
        }
        int i8 = i6 | ((b4 & Byte.MAX_VALUE) << 7);
        int i9 = i5 + 2;
        byte b5 = bArr[i7];
        if (b5 >= 0) {
            c0Var.f7421a = i8 | (b5 << 14);
            return i9;
        }
        int i10 = i8 | ((b5 & Byte.MAX_VALUE) << 14);
        int i11 = i5 + 3;
        byte b6 = bArr[i9];
        if (b6 >= 0) {
            c0Var.f7421a = i10 | (b6 << 21);
            return i11;
        }
        int i12 = i10 | ((b6 & Byte.MAX_VALUE) << 21);
        int i13 = i5 + 4;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            c0Var.f7421a = i12 | (b7 << 28);
            return i13;
        }
        int i14 = i12 | ((b7 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                c0Var.f7421a = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    public static int d(K1 k12, int i4, byte[] bArr, int i5, int i6, X0 x02, C0492c0 c0Var) {
        int f4 = f(k12, bArr, i5, i6, c0Var);
        x02.add(c0Var.f7423c);
        while (f4 < i6) {
            int h4 = h(bArr, f4, c0Var);
            if (i4 != c0Var.f7421a) {
                break;
            }
            f4 = f(k12, bArr, h4, i6, c0Var);
            x02.add(c0Var.f7423c);
        }
        return f4;
    }

    public static int e(K1 k12, byte[] bArr, int i4, int i5, int i6, C0492c0 c0Var) {
        C0558x1 x1Var = (C0558x1) k12;
        Object a4 = x1Var.a();
        int o4 = x1Var.o(a4, bArr, i4, i5, i6, c0Var);
        x1Var.c(a4);
        c0Var.f7423c = a4;
        return o4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int f(com.google.android.gms.internal.vision.K1 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.vision.C0492c0 r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = c(r8, r7, r0, r10)
            int r8 = r10.f7421a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.i(r1, r2, r3, r4, r5)
            r6.c(r9)
            r10.f7423c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.vision.W0 r6 = com.google.android.gms.internal.vision.W0.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C0488b0.f(com.google.android.gms.internal.vision.K1, byte[], int, int, com.google.android.gms.internal.vision.c0):int");
    }

    public static int g(byte[] bArr, int i4) {
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    public static int h(byte[] bArr, int i4, C0492c0 c0Var) {
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        if (b4 < 0) {
            return c(b4, bArr, i5, c0Var);
        }
        c0Var.f7421a = b4;
        return i5;
    }

    public static int i(byte[] bArr, int i4, X0 x02, C0492c0 c0Var) {
        P0 p02 = (P0) x02;
        int h4 = h(bArr, i4, c0Var);
        int i5 = c0Var.f7421a + h4;
        while (h4 < i5) {
            h4 = h(bArr, h4, c0Var);
            p02.u(c0Var.f7421a);
        }
        if (h4 == i5) {
            return h4;
        }
        throw W0.a();
    }

    public static int j(byte[] bArr, int i4, C0492c0 c0Var) {
        int i5 = i4 + 1;
        long j4 = (long) bArr[i4];
        if (j4 >= 0) {
            c0Var.f7422b = j4;
            return i5;
        }
        int i6 = i4 + 2;
        byte b4 = bArr[i5];
        long j5 = (j4 & 127) | (((long) (b4 & Byte.MAX_VALUE)) << 7);
        int i7 = 7;
        while (b4 < 0) {
            int i8 = i6 + 1;
            byte b5 = bArr[i6];
            i7 += 7;
            j5 |= ((long) (b5 & Byte.MAX_VALUE)) << i7;
            int i9 = i8;
            b4 = b5;
            i6 = i9;
        }
        c0Var.f7422b = j5;
        return i6;
    }

    public static long k(byte[] bArr, int i4) {
        return ((((long) bArr[i4 + 7]) & 255) << 56) | (((long) bArr[i4]) & 255) | ((((long) bArr[i4 + 1]) & 255) << 8) | ((((long) bArr[i4 + 2]) & 255) << 16) | ((((long) bArr[i4 + 3]) & 255) << 24) | ((((long) bArr[i4 + 4]) & 255) << 32) | ((((long) bArr[i4 + 5]) & 255) << 40) | ((((long) bArr[i4 + 6]) & 255) << 48);
    }

    public static double l(byte[] bArr, int i4) {
        return Double.longBitsToDouble(k(bArr, i4));
    }

    public static int m(byte[] bArr, int i4, C0492c0 c0Var) {
        int h4 = h(bArr, i4, c0Var);
        int i5 = c0Var.f7421a;
        if (i5 < 0) {
            throw W0.b();
        } else if (i5 == 0) {
            c0Var.f7423c = "";
            return h4;
        } else {
            c0Var.f7423c = new String(bArr, h4, i5, R0.f7357a);
            return h4 + i5;
        }
    }

    public static float n(byte[] bArr, int i4) {
        return Float.intBitsToFloat(g(bArr, i4));
    }

    public static int o(byte[] bArr, int i4, C0492c0 c0Var) {
        int h4 = h(bArr, i4, c0Var);
        int i5 = c0Var.f7421a;
        if (i5 < 0) {
            throw W0.b();
        } else if (i5 == 0) {
            c0Var.f7423c = "";
            return h4;
        } else {
            c0Var.f7423c = k2.k(bArr, h4, i5);
            return h4 + i5;
        }
    }

    public static int p(byte[] bArr, int i4, C0492c0 c0Var) {
        int h4 = h(bArr, i4, c0Var);
        int i5 = c0Var.f7421a;
        if (i5 < 0) {
            throw W0.b();
        } else if (i5 > bArr.length - h4) {
            throw W0.a();
        } else if (i5 == 0) {
            c0Var.f7423c = C0507g0.f7445f;
            return h4;
        } else {
            c0Var.f7423c = C0507g0.y(bArr, h4, i5);
            return h4 + i5;
        }
    }
}
