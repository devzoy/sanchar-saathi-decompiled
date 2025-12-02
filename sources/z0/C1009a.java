package z0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import y0.j;

/* renamed from: z0.a  reason: case insensitive filesystem */
public final /* synthetic */ class C1009a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f12820a;

    public /* synthetic */ C1009a(j jVar) {
        this.f12820a = jVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return C1011c.f(this.f12820a, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
