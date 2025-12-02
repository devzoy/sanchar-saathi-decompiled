package v3;

import h3.C0661b;
import u3.a;
import u3.l;
import u3.p;
import u3.q;
import u3.r;

public abstract class z {
    public static Object a(Object obj, int i4) {
        if (obj != null && !c(obj, i4)) {
            f(obj, "kotlin.jvm.functions.Function" + i4);
        }
        return obj;
    }

    public static int b(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).d();
        }
        if (obj instanceof a) {
            return 0;
        }
        if (obj instanceof l) {
            return 1;
        }
        if (obj instanceof p) {
            return 2;
        }
        if (obj instanceof q) {
            return 3;
        }
        return obj instanceof r ? 4 : -1;
    }

    public static boolean c(Object obj, int i4) {
        return (obj instanceof C0661b) && b(obj) == i4;
    }

    public static Throwable d(Throwable th) {
        return l.i(th, z.class.getName());
    }

    public static ClassCastException e(ClassCastException classCastException) {
        throw ((ClassCastException) d(classCastException));
    }

    public static void f(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        g(name + " cannot be cast to " + str);
    }

    public static void g(String str) {
        throw e(new ClassCastException(str));
    }
}
