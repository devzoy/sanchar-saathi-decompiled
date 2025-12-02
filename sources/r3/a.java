package r3;

import q3.C0900a;
import x3.c;

public class a extends C0900a {

    /* renamed from: r3.a$a  reason: collision with other inner class name */
    public static final class C0194a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0194a f11983a = new C0194a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f11984b;

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
                    f11984b = num2;
                }
            } catch (Throwable unused) {
            }
            num = null;
            num2 = num;
            f11984b = num2;
        }
    }

    public c b() {
        return c(34) ? new y3.a() : super.b();
    }

    public final boolean c(int i4) {
        Integer num = C0194a.f11984b;
        return num == null || num.intValue() >= i4;
    }
}
