package p3;

import i3.C0735l;
import java.lang.reflect.Method;
import v3.l;
import x3.b;
import x3.c;

/* renamed from: p3.a  reason: case insensitive filesystem */
public abstract class C0877a {

    /* renamed from: p3.a$a  reason: collision with other inner class name */
    public static final class C0191a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0191a f11741a = new C0191a();

        /* renamed from: b  reason: collision with root package name */
        public static final Method f11742b;

        /* renamed from: c  reason: collision with root package name */
        public static final Method f11743c;

        static {
            Method method;
            Method method2;
            Class<Throwable> cls = Throwable.class;
            Method[] methods = cls.getMethods();
            l.b(methods);
            int length = methods.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                method = null;
                if (i5 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i5];
                if (l.a(method2.getName(), "addSuppressed")) {
                    Class[] parameterTypes = method2.getParameterTypes();
                    l.d(parameterTypes, "getParameterTypes(...)");
                    if (l.a(C0735l.A(parameterTypes), cls)) {
                        break;
                    }
                }
                i5++;
            }
            f11742b = method2;
            int length2 = methods.length;
            while (true) {
                if (i4 >= length2) {
                    break;
                }
                Method method3 = methods[i4];
                if (l.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i4++;
            }
            f11743c = method;
        }
    }

    public void a(Throwable th, Throwable th2) {
        l.e(th, "cause");
        l.e(th2, "exception");
        Method method = C0191a.f11742b;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    public c b() {
        return new b();
    }
}
