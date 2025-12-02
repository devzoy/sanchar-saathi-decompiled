package D1;

import android.content.Context;
import android.util.Log;
import z1.C1032o;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f728a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th) {
        try {
            C1032o.f(context);
            C1032o.f(th);
            return false;
        } catch (Exception e4) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e4);
            return false;
        }
    }
}
