package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.clearcut.h1  reason: case insensitive filesystem */
public abstract class C0429h1 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0432i1 f7100a = ((!C0423f1.x() || !C0423f1.y()) ? new C0435j1() : new C0441l1());

    public static int a(CharSequence charSequence) {
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
                                throw new C0438k1(i5, length2);
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

    public static int b(CharSequence charSequence, byte[] bArr, int i4, int i5) {
        return f7100a.b(charSequence, bArr, i4, i5);
    }

    public static void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        C0432i1 i1Var = f7100a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(b(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            i1Var.c(charSequence, byteBuffer);
        } else {
            C0432i1.d(charSequence, byteBuffer);
        }
    }

    public static int d(int i4) {
        if (i4 > -12) {
            return -1;
        }
        return i4;
    }

    public static int f(int i4, int i5, int i6) {
        if (i4 > -12 || i5 > -65 || i6 > -65) {
            return -1;
        }
        return (i4 ^ (i5 << 8)) ^ (i6 << 16);
    }

    public static boolean h(byte[] bArr) {
        return f7100a.e(bArr, 0, bArr.length);
    }

    public static boolean i(byte[] bArr, int i4, int i5) {
        return f7100a.e(bArr, i4, i5);
    }

    public static int j(byte[] bArr, int i4, int i5) {
        byte b4 = bArr[i4 - 1];
        int i6 = i5 - i4;
        if (i6 == 0) {
            return d(b4);
        }
        if (i6 == 1) {
            return l(b4, bArr[i4]);
        }
        if (i6 == 2) {
            return f(b4, bArr[i4], bArr[i4 + 1]);
        }
        throw new AssertionError();
    }

    public static int l(int i4, int i5) {
        if (i4 > -12 || i5 > -65) {
            return -1;
        }
        return i4 ^ (i5 << 8);
    }
}
