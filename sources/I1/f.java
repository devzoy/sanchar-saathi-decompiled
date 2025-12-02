package I1;

import L1.d;
import android.content.SharedPreferences;
import android.util.Log;

public abstract class f extends a {
    public static Long a(SharedPreferences sharedPreferences, String str, Long l4) {
        try {
            return (Long) d.a(new g(sharedPreferences, str, l4));
        } catch (Exception e4) {
            String valueOf = String.valueOf(e4.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return l4;
        }
    }
}
