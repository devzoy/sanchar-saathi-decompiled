package C0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f523a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f524b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f525c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f526d;

    public static void a(String str, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.a(j(str), i4);
        } else {
            b(j(str), i4);
        }
    }

    public static void b(String str, int i4) {
        try {
            if (f525c == null) {
                f525c = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f525c.invoke((Object) null, new Object[]{Long.valueOf(f523a), str, Integer.valueOf(i4)});
        } catch (Exception e4) {
            g("asyncTraceBegin", e4);
        }
    }

    public static void c(String str) {
        b.a(j(str));
    }

    public static void d(String str, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.b(j(str), i4);
        } else {
            e(j(str), i4);
        }
    }

    public static void e(String str, int i4) {
        try {
            if (f526d == null) {
                f526d = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f526d.invoke((Object) null, new Object[]{Long.valueOf(f523a), str, Integer.valueOf(i4)});
        } catch (Exception e4) {
            g("asyncTraceEnd", e4);
        }
    }

    public static void f() {
        b.b();
    }

    public static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29 ? c.c() : i();
    }

    public static boolean i() {
        Class<Trace> cls = Trace.class;
        try {
            if (f524b == null) {
                f523a = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                f524b = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f524b.invoke((Object) null, new Object[]{Long.valueOf(f523a)})).booleanValue();
        } catch (Exception e4) {
            g("isTagEnabled", e4);
            return false;
        }
    }

    public static String j(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
