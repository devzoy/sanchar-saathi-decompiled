package y0;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import v3.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f12711a = new c();

    public static final Uri a(Cursor cursor) {
        l.e(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        l.d(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean b(ActivityManager activityManager) {
        l.e(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
