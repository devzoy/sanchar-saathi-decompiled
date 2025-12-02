package y0;

import android.database.Cursor;
import android.os.Bundle;
import v3.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f12713a = new e();

    public static final void a(Cursor cursor, Bundle bundle) {
        l.e(cursor, "cursor");
        l.e(bundle, "extras");
        cursor.setExtras(bundle);
    }
}
