package com.google.android.gms.internal.vision;

public abstract class m2 {
    public static void f(byte b4, byte b5, byte b6, byte b7, char[] cArr, int i4) {
        if (o(b5) || (((b4 << 28) + (b5 + 112)) >> 30) != 0 || o(b6) || o(b7)) {
            throw W0.f();
        }
        byte b8 = ((b4 & 7) << 18) | ((b5 & 63) << 12) | ((b6 & 63) << 6) | (b7 & 63);
        cArr[i4] = (char) ((b8 >>> 10) + 55232);
        cArr[i4 + 1] = (char) ((b8 & 1023) + 56320);
    }

    public static void g(byte b4, byte b5, byte b6, char[] cArr, int i4) {
        if (o(b5) || ((b4 == -32 && b5 < -96) || ((b4 == -19 && b5 >= -96) || o(b6)))) {
            throw W0.f();
        }
        cArr[i4] = (char) (((b4 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
    }

    public static void h(byte b4, byte b5, char[] cArr, int i4) {
        if (b4 < -62 || o(b5)) {
            throw W0.f();
        }
        cArr[i4] = (char) (((b4 & 31) << 6) | (b5 & 63));
    }

    public static void i(byte b4, char[] cArr, int i4) {
        cArr[i4] = (char) b4;
    }

    public static boolean l(byte b4) {
        return b4 >= 0;
    }

    public static boolean m(byte b4) {
        return b4 < -32;
    }

    public static boolean n(byte b4) {
        return b4 < -16;
    }

    public static boolean o(byte b4) {
        return b4 > -65;
    }
}
