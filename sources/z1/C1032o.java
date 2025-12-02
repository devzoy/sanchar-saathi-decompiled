package z1;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: z1.o  reason: case insensitive filesystem */
public abstract class C1032o {
    public static void a(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 35 + String.valueOf(name).length() + 1);
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static String e(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static Object f(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    public static Object g(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void h(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void i(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
