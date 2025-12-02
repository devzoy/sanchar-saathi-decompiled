package G;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public abstract class p {
    public static int a(boolean z4, int i4) {
        int i5;
        if (!z4) {
            i5 = 67108864;
        } else if (Build.VERSION.SDK_INT < 31) {
            return i4;
        } else {
            i5 = 33554432;
        }
        return i4 | i5;
    }

    public static PendingIntent b(Context context, int i4, Intent intent, int i5, boolean z4) {
        return PendingIntent.getActivity(context, i4, intent, a(z4, i5));
    }
}
