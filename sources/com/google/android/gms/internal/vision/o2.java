package com.google.android.gms.internal.vision;

public final class o2 extends l2 {
    public final int a(int i4, byte[] bArr, int i5, int i6) {
        while (r10 < i6 && bArr[r10] >= 0) {
            i5 = r10 + 1;
        }
        if (r10 >= i6) {
            return 0;
        }
        while (r10 < i6) {
            int i7 = r10 + 1;
            byte b4 = bArr[r10];
            if (b4 >= 0) {
                r10 = i7;
            } else if (b4 < -32) {
                if (i7 >= i6) {
                    return b4;
                }
                if (b4 >= -62) {
                    r10 += 2;
                    if (bArr[i7] > -65) {
                    }
                }
                return -1;
            } else if (b4 < -16) {
                if (i7 >= i6 - 1) {
                    return k2.m(bArr, i7, i6);
                }
                int i8 = r10 + 2;
                byte b5 = bArr[i7];
                if (b5 <= -65 && ((b4 != -32 || b5 >= -96) && (b4 != -19 || b5 < -96))) {
                    r10 += 3;
                    if (bArr[i8] > -65) {
                    }
                }
                return -1;
            } else if (i7 >= i6 - 2) {
                return k2.m(bArr, i7, i6);
            } else {
                int i9 = r10 + 2;
                byte b6 = bArr[i7];
                if (b6 <= -65 && (((b4 << 28) + (b6 + 112)) >> 30) == 0) {
                    int i10 = r10 + 3;
                    if (bArr[i9] <= -65) {
                        r10 += 4;
                        if (bArr[i10] > -65) {
                        }
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    public final int b(CharSequence charSequence, byte[] bArr, int i4, int i5) {
        int i6;
        int i7;
        char charAt;
        int length = charSequence.length();
        int i8 = i5 + i4;
        int i9 = 0;
        while (i9 < length && (i7 = i9 + i4) < i8 && (charAt = charSequence.charAt(i9)) < 128) {
            bArr[i7] = (byte) charAt;
            i9++;
        }
        if (i9 == length) {
            return i4 + length;
        }
        int i10 = i4 + i9;
        while (i9 < length) {
            char charAt2 = charSequence.charAt(i9);
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
                if (i13 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i13);
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
                throw new n2(i9 - 1, length);
            } else if (55296 > charAt2 || charAt2 > 57343 || ((i6 = i9 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i6)))) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(i10);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            } else {
                throw new n2(i9, length);
            }
            i9++;
        }
        return i10;
    }

    public final String d(byte[] bArr, int i4, int i5) {
        if ((i4 | i5 | ((bArr.length - i4) - i5)) >= 0) {
            int i6 = i4 + i5;
            char[] cArr = new char[i5];
            int i7 = 0;
            while (r11 < i6) {
                byte b4 = bArr[r11];
                if (!m2.l(b4)) {
                    break;
                }
                i4 = r11 + 1;
                m2.i(b4, cArr, i7);
                i7++;
            }
            int i8 = i7;
            while (r11 < i6) {
                int i9 = r11 + 1;
                byte b5 = bArr[r11];
                if (m2.l(b5)) {
                    int i10 = i8 + 1;
                    m2.i(b5, cArr, i8);
                    while (i9 < i6) {
                        byte b6 = bArr[i9];
                        if (!m2.l(b6)) {
                            break;
                        }
                        i9++;
                        m2.i(b6, cArr, i10);
                        i10++;
                    }
                    i8 = i10;
                    r11 = i9;
                } else if (m2.m(b5)) {
                    if (i9 < i6) {
                        r11 += 2;
                        m2.h(b5, bArr[i9], cArr, i8);
                        i8++;
                    } else {
                        throw W0.f();
                    }
                } else if (m2.n(b5)) {
                    if (i9 < i6 - 1) {
                        int i11 = r11 + 2;
                        r11 += 3;
                        m2.g(b5, bArr[i9], bArr[i11], cArr, i8);
                        i8++;
                    } else {
                        throw W0.f();
                    }
                } else if (i9 < i6 - 2) {
                    byte b7 = bArr[i9];
                    int i12 = r11 + 3;
                    byte b8 = bArr[r11 + 2];
                    r11 += 4;
                    m2.f(b5, b7, b8, bArr[i12], cArr, i8);
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
