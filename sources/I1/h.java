package I1;

import L1.d;
import android.content.SharedPreferences;
import android.util.Log;

public abstract class h extends a {
    public static String a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) d.a(new i(sharedPreferences, str, str2));
        } catch (Exception e4) {
            String valueOf = String.valueOf(e4.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }
}
