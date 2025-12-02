package I1;

import L1.d;
import android.content.SharedPreferences;
import android.util.Log;

public abstract class b extends a {
    public static Boolean a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) d.a(new c(sharedPreferences, str, bool));
        } catch (Exception e4) {
            String valueOf = String.valueOf(e4.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return bool;
        }
    }
}
