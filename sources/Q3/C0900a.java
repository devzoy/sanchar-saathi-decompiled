package q3;

import p3.C0877a;
import v3.l;

/* renamed from: q3.a  reason: case insensitive filesystem */
public abstract class C0900a extends C0877a {

    /* renamed from: q3.a$a  reason: collision with other inner class name */
    public static final class C0192a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0192a f11923a = new C0192a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f11924b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                    if (num != null && num.intValue() > 0) {
                        num2 = num;
                    }
                    f11924b = num2;
                }
            } catch (Throwable unused) {
            }
            num = null;
            num2 = num;
            f11924b = num2;
        }
    }

    private final boolean c(int i4) {
        Integer num = C0192a.f11924b;
        return num == null || num.intValue() >= i4;
    }

    public void a(Throwable th, Throwable th2) {
        l.e(th, "cause");
        l.e(th2, "exception");
        if (c(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
