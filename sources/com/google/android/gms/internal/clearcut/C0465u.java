package com.google.android.gms.internal.clearcut;

import android.support.v4.media.session.b;

/* renamed from: com.google.android.gms.internal.clearcut.u  reason: case insensitive filesystem */
public abstract class C0465u {
    public static int a(int i4, byte[] bArr, int i5, int i6, C0468v vVar) {
        if ((i4 >>> 3) != 0) {
            int i7 = i4 & 7;
            if (i7 == 0) {
                return g(bArr, i5, vVar);
            }
            if (i7 == 1) {
                return i5 + 8;
            }
            if (i7 == 2) {
                return e(bArr, i5, vVar) + vVar.f7173a;
            }
            if (i7 == 3) {
                int i8 = (i4 & -8) | 4;
                int i9 = 0;
                while (i5 < i6) {
                    i5 = e(bArr, i5, vVar);
                    i9 = vVar.f7173a;
                    if (i9 == i8) {
                        break;
                    }
                    i5 = a(i9, bArr, i5, i6, vVar);
                }
                if (i5 <= i6 && i9 == i8) {
                    return i5;
                }
                throw C0425g0.d();
            } else if (i7 == 5) {
                return i5 + 4;
            } else {
                throw C0425g0.b();
            }
        } else {
            throw C0425g0.b();
        }
    }

    public static int b(int i4, byte[] bArr, int i5, int i6, C0422f0 f0Var, C0468v vVar) {
        b.a(f0Var);
        e(bArr, i5, vVar);
        int i7 = vVar.f7173a;
        throw null;
    }

    public static int c(int i4, byte[] bArr, int i5, int i6, Z0 z02, C0468v vVar) {
        if ((i4 >>> 3) != 0) {
            int i7 = i4 & 7;
            if (i7 == 0) {
                int g4 = g(bArr, i5, vVar);
                z02.e(i4, Long.valueOf(vVar.f7174b));
                return g4;
            } else if (i7 == 1) {
                z02.e(i4, Long.valueOf(k(bArr, i5)));
                return i5 + 8;
            } else if (i7 == 2) {
                int e4 = e(bArr, i5, vVar);
                int i8 = vVar.f7173a;
                z02.e(i4, i8 == 0 ? C0477y.f7181f : C0477y.z(bArr, e4, i8));
                return e4 + i8;
            } else if (i7 == 3) {
                Z0 i9 = Z0.i();
                int i10 = (i4 & -8) | 4;
                int i11 = 0;
                while (true) {
                    if (i5 >= i6) {
                        break;
                    }
                    int e5 = e(bArr, i5, vVar);
                    int i12 = vVar.f7173a;
                    i11 = i12;
                    if (i12 == i10) {
                        i5 = e5;
                        break;
                    }
                    int c4 = c(i11, bArr, e5, i6, i9, vVar);
                    i11 = i12;
                    i5 = c4;
                }
                if (i5 > i6 || i11 != i10) {
                    throw C0425g0.d();
                }
                z02.e(i4, i9);
                return i5;
            } else if (i7 == 5) {
                z02.e(i4, Integer.valueOf(h(bArr, i5)));
                return i5 + 4;
            } else {
                throw C0425g0.b();
            }
        } else {
            throw C0425g0.b();
        }
    }

    public static int d(int i4, byte[] bArr, int i5, C0468v vVar) {
        int i6;
        int i7 = i4 & 127;
        int i8 = i5 + 1;
        byte b4 = bArr[i5];
        if (b4 >= 0) {
            i6 = b4 << 7;
        } else {
            int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 7);
            int i10 = i5 + 2;
            byte b5 = bArr[i8];
            if (b5 >= 0) {
                vVar.f7173a = i9 | (b5 << 14);
                return i10;
            }
            i7 = i9 | ((b5 & Byte.MAX_VALUE) << 14);
            i8 = i5 + 3;
            byte b6 = bArr[i10];
            if (b6 >= 0) {
                i6 = b6 << 21;
            } else {
                int i11 = i7 | ((b6 & Byte.MAX_VALUE) << 21);
                int i12 = i5 + 4;
                byte b7 = bArr[i8];
                if (b7 >= 0) {
                    vVar.f7173a = i11 | (b7 << 28);
                    return i12;
                }
                int i13 = i11 | ((b7 & Byte.MAX_VALUE) << 28);
                while (true) {
                    int i14 = i12 + 1;
                    if (bArr[i12] >= 0) {
                        vVar.f7173a = i13;
                        return i14;
                    }
                    i12 = i14;
                }
            }
        }
        vVar.f7173a = i7 | i6;
        return i8;
    }

    public static int e(byte[] bArr, int i4, C0468v vVar) {
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        if (b4 < 0) {
            return d(b4, bArr, i5, vVar);
        }
        vVar.f7173a = b4;
        return i5;
    }

    public static int f(byte[] bArr, int i4, C0422f0 f0Var, C0468v vVar) {
        b.a(f0Var);
        int e4 = e(bArr, i4, vVar);
        int i5 = vVar.f7173a + e4;
        if (e4 < i5) {
            e(bArr, e4, vVar);
            throw null;
        } else if (e4 == i5) {
            return e4;
        } else {
            throw C0425g0.a();
        }
    }

    public static int g(byte[] bArr, int i4, C0468v vVar) {
        int i5 = i4 + 1;
        long j4 = (long) bArr[i4];
        if (j4 >= 0) {
            vVar.f7174b = j4;
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
        vVar.f7174b = j5;
        return i6;
    }

    public static int h(byte[] bArr, int i4) {
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    public static int i(byte[] bArr, int i4, C0468v vVar) {
        int e4 = e(bArr, i4, vVar);
        int i5 = vVar.f7173a;
        if (i5 == 0) {
            vVar.f7175c = "";
            return e4;
        }
        vVar.f7175c = new String(bArr, e4, i5, C0413c0.f7045a);
        return e4 + i5;
    }

    public static int j(byte[] bArr, int i4, C0468v vVar) {
        int e4 = e(bArr, i4, vVar);
        int i5 = vVar.f7173a;
        if (i5 == 0) {
            vVar.f7175c = "";
            return e4;
        }
        int i6 = e4 + i5;
        if (C0429h1.i(bArr, e4, i6)) {
            vVar.f7175c = new String(bArr, e4, i5, C0413c0.f7045a);
            return i6;
        }
        throw C0425g0.e();
    }

    public static long k(byte[] bArr, int i4) {
        return ((((long) bArr[i4 + 7]) & 255) << 56) | (((long) bArr[i4]) & 255) | ((((long) bArr[i4 + 1]) & 255) << 8) | ((((long) bArr[i4 + 2]) & 255) << 16) | ((((long) bArr[i4 + 3]) & 255) << 24) | ((((long) bArr[i4 + 4]) & 255) << 32) | ((((long) bArr[i4 + 5]) & 255) << 40) | ((((long) bArr[i4 + 6]) & 255) << 48);
    }

    public static double l(byte[] bArr, int i4) {
        return Double.longBitsToDouble(k(bArr, i4));
    }

    public static int m(byte[] bArr, int i4, C0468v vVar) {
        int e4 = e(bArr, i4, vVar);
        int i5 = vVar.f7173a;
        if (i5 == 0) {
            vVar.f7175c = C0477y.f7181f;
            return e4;
        }
        vVar.f7175c = C0477y.z(bArr, e4, i5);
        return e4 + i5;
    }

    public static float n(byte[] bArr, int i4) {
        return Float.intBitsToFloat(h(bArr, i4));
    }
}
