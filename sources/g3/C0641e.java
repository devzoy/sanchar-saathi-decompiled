package g3;

import C0.a;

/* renamed from: g3.e  reason: case insensitive filesystem */
public final class C0641e implements AutoCloseable {
    public C0641e(String str) {
        b(str);
    }

    public static void b(String str) {
        a.c(d(str));
    }

    public static void c(String str, int i4) {
        a.a(d(str), i4);
    }

    public static String d(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void e() {
        a.f();
    }

    public static void f(String str, int i4) {
        a.d(d(str), i4);
    }

    public static C0641e g(String str) {
        return new C0641e(str);
    }

    public void close() {
        e();
    }
}
