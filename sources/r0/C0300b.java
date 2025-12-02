package R0;

import android.content.ContentValues;
import v0.C0945a;
import v3.l;
import y0.g;

/* renamed from: R0.b  reason: case insensitive filesystem */
public final class C0300b implements C0945a {
    public void a(g gVar) {
        l.e(gVar, "db");
        gVar.execSQL("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        gVar.update("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
