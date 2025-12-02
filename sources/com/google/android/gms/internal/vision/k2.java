package com.google.android.gms.internal.vision;

public abstract class k2 {

    /* renamed from: a  reason: collision with root package name */
    public static final l2 f7485a = ((!h2.m() || !h2.r() || Z.b()) ? new o2() : new q2());

    public static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && charSequence.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i5);
            if (charAt < 2048) {
                i6 += (127 - charAt) >>> 31;
                i5++;
            } else {
                int length2 = charSequence.length();
                while (i5 < length2) {
                    char charAt2 = charSequence.charAt(i5);
                    if (charAt2 < 2048) {
                        i4 += (127 - charAt2) >>> 31;
                    } else {
                        i4 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i5) >= 65536) {
                                i5++;
                            } else {
                                throw new n2(i5, length2);
                            }
                        }
                    }
                    i5++;
                }
                i6 += i4;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i6) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int e(CharSequence charSequence, byte[] bArr, int i4, int i5) {
        return f7485a.b(charSequence, bArr, i4, i5);
    }

    public static boolean f(byte[] bArr) {
        return f7485a.c(bArr, 0, bArr.length);
    }

    public static boolean g(byte[] bArr, int i4, int i5) {
        return f7485a.c(bArr, i4, i5);
    }

    public static int h(int i4) {
        if (i4 > -12) {
            return -1;
        }
        return i4;
    }

    public static int i(int i4, int i5) {
        if (i4 > -12 || i5 > -65) {
            return -1;
        }
        return i4 ^ (i5 << 8);
    }

    public static int j(int i4, int i5, int i6) {
        if (i4 > -12 || i5 > -65 || i6 > -65) {
            return -1;
        }
        return (i4 ^ (i5 << 8)) ^ (i6 << 16);
    }

    public static String k(byte[] bArr, int i4, int i5) {
        return f7485a.d(bArr, i4, i5);
    }

    public static int m(byte[] bArr, int i4, int i5) {
        byte b4 = bArr[i4 - 1];
        int i6 = i5 - i4;
        if (i6 == 0) {
            return h(b4);
        }
        if (i6 == 1) {
            return i(b4, bArr[i4]);
        }
        if (i6 == 2) {
            return j(b4, bArr[i4], bArr[i4 + 1]);
        }
        throw new AssertionError();
    }
}
