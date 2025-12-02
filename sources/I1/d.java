package I1;

import android.content.SharedPreferences;
import android.util.Log;

public abstract class d extends a {
    public static Integer a(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) L1.d.a(new e(sharedPreferences, str, num));
        } catch (Exception e4) {
            String valueOf = String.valueOf(e4.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return num;
        }
    }
}
