package q0;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: q0.b  reason: case insensitive filesystem */
public abstract class C0886b {
    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences(c(context), b());
    }

    public static int b() {
        return 0;
    }

    public static String c(Context context) {
        return context.getPackageName() + "_preferences";
    }
}
