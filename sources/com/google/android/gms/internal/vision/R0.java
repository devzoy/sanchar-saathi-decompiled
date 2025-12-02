package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class R0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f7357a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f7358b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f7359c;

    /* renamed from: d  reason: collision with root package name */
    public static final ByteBuffer f7360d;

    /* renamed from: e  reason: collision with root package name */
    public static final C0545t0 f7361e;

    static {
        byte[] bArr = new byte[0];
        f7359c = bArr;
        f7360d = ByteBuffer.wrap(bArr);
        f7361e = C0545t0.b(bArr, 0, bArr.length, false);
    }

    public static int a(int i4, byte[] bArr, int i5, int i6) {
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            i4 = (i4 * 31) + bArr[i7];
        }
        return i4;
    }

    public static int b(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    public static int c(boolean z4) {
        return z4 ? 1231 : 1237;
    }

    public static Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object e(Object obj, Object obj2) {
        return ((C0546t1) obj).a().d((C0546t1) obj2).c();
    }

    public static Object f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static boolean g(C0546t1 t1Var) {
        return false;
    }

    public static boolean h(byte[] bArr) {
        return k2.f(bArr);
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f7357a);
    }

    public static int j(byte[] bArr) {
        int length = bArr.length;
        int a4 = a(length, bArr, 0, length);
        if (a4 == 0) {
            return 1;
        }
        return a4;
    }
}
