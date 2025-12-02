package v2;

import android.content.Context;

public abstract class d {
    public static c a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new h(new m(context));
    }
}
