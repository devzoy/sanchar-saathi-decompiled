package O3;

import C3.c;
import java.util.concurrent.locks.ReentrantLock;
import v3.l;

public abstract class B {
    public static final byte[] a(String str) {
        l.e(str, "<this>");
        byte[] bytes = str.getBytes(c.f534b);
        l.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    public static final String c(byte[] bArr) {
        l.e(bArr, "<this>");
        return new String(bArr, c.f534b);
    }
}
