package Q;

import android.text.TextUtils;
import java.util.Locale;

public abstract class e {
    public static int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
