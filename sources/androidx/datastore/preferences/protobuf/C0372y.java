package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.y  reason: case insensitive filesystem */
public abstract class C0372y {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f5329a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f5330b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f5331c = Charset.forName("ISO-8859-1");

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f5332d;

    /* renamed from: e  reason: collision with root package name */
    public static final ByteBuffer f5333e;

    /* renamed from: f  reason: collision with root package name */
    public static final C0356h f5334f;

    /* renamed from: androidx.datastore.preferences.protobuf.y$a */
    public interface a {
        boolean a(int i4);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$b */
    public interface b extends List, RandomAccess {
        void i();

        b k(int i4);

        boolean r();
    }

    static {
        byte[] bArr = new byte[0];
        f5332d = bArr;
        f5333e = ByteBuffer.wrap(bArr);
        f5334f = C0356h.i(bArr);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z4) {
        return z4 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i4, int i5) {
        int g4 = g(i5, bArr, i4, i5);
        if (g4 == 0) {
            return 1;
        }
        return g4;
    }

    public static int f(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    public static int g(int i4, byte[] bArr, int i5, int i6) {
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            i4 = (i4 * 31) + bArr[i7];
        }
        return i4;
    }
}
