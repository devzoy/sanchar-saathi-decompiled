package g2;

import android.os.Build;
import java.util.Locale;

public abstract class e {
    public static boolean a() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }
}
