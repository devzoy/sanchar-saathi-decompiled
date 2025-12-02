package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.clearcut.c0  reason: case insensitive filesystem */
public abstract class C0413c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f7045a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f7046b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f7047c;

    /* renamed from: d  reason: collision with root package name */
    public static final ByteBuffer f7048d;

    /* renamed from: e  reason: collision with root package name */
    public static final H f7049e;

    static {
        byte[] bArr = new byte[0];
        f7047c = bArr;
        f7048d = ByteBuffer.wrap(bArr);
        f7049e = H.b(bArr, 0, bArr.length, false);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int c4 = c(length, bArr, 0, length);
        if (c4 == 0) {
            return 1;
        }
        return c4;
    }

    public static int c(int i4, byte[] bArr, int i5, int i6) {
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            i4 = (i4 * 31) + bArr[i7];
        }
        return i4;
    }

    public static Object d(Object obj, Object obj2) {
        return ((B0) obj).b().j((B0) obj2).i();
    }

    public static Object e(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int f(boolean z4) {
        return z4 ? 1231 : 1237;
    }

    public static boolean g(byte[] bArr) {
        return C0429h1.h(bArr);
    }

    public static String h(byte[] bArr) {
        return new String(bArr, f7045a);
    }

    public static int i(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }
}
