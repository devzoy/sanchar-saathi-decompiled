package I1;

import L1.d;
import android.content.Context;
import android.content.SharedPreferences;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f1520a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f1520a == null) {
                    f1520a = (SharedPreferences) d.a(new k(context));
                }
                sharedPreferences = f1520a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }
}
