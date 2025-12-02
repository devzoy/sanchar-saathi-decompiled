package y0;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;
import v3.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f12714a = new f();

    public static final List a(Cursor cursor) {
        l.e(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        l.b(notificationUris);
        return notificationUris;
    }

    public static final void b(Cursor cursor, ContentResolver contentResolver, List list) {
        l.e(cursor, "cursor");
        l.e(contentResolver, "cr");
        l.e(list, "uris");
        cursor.setNotificationUris(contentResolver, list);
    }
}
