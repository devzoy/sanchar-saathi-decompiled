package g1;

import android.content.Context;

/* renamed from: g1.a  reason: case insensitive filesystem */
public abstract class C0635a {
    public static int a(Context context, int i4) {
        return Math.round(((float) i4) * (context.getResources().getDisplayMetrics().xdpi / 160.0f));
    }
}
