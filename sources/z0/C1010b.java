package z0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import u3.r;

/* renamed from: z0.b  reason: case insensitive filesystem */
public final /* synthetic */ class C1010b implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f12821a;

    public /* synthetic */ C1010b(r rVar) {
        this.f12821a = rVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return C1011c.e(this.f12821a, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
