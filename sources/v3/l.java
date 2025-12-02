package v3;

import h3.C0672m;
import java.util.Arrays;

public abstract class l {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj == null) {
            j();
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            k(str);
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) h(new NullPointerException(str + " must not be null")));
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            l(str);
        }
    }

    public static int f(int i4, int i5) {
        if (i4 < i5) {
            return -1;
        }
        return i4 == i5 ? 0 : 1;
    }

    public static String g(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = l.class.getName();
        int i4 = 0;
        while (!stackTrace[i4].getClassName().equals(name)) {
            i4++;
        }
        while (stackTrace[i4].getClassName().equals(name)) {
            i4++;
        }
        StackTraceElement stackTraceElement = stackTrace[i4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static Throwable h(Throwable th) {
        return i(th, l.class.getName());
    }

    public static Throwable i(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i4 = -1;
        for (int i5 = 0; i5 < length; i5++) {
            if (str.equals(stackTrace[i5].getClassName())) {
                i4 = i5;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i4 + 1, length));
        return th;
    }

    public static void j() {
        throw ((NullPointerException) h(new NullPointerException()));
    }

    public static void k(String str) {
        throw ((NullPointerException) h(new NullPointerException(str)));
    }

    public static void l(String str) {
        throw ((NullPointerException) h(new NullPointerException(g(str))));
    }

    public static void m(String str) {
        throw ((C0672m) h(new C0672m(str)));
    }

    public static void n(String str) {
        m("lateinit property " + str + " has not been initialized");
    }
}
