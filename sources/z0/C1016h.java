package z0;

import android.database.sqlite.SQLiteStatement;
import v3.l;
import y0.k;

/* renamed from: z0.h  reason: case insensitive filesystem */
public final class C1016h extends C1015g implements k {

    /* renamed from: f  reason: collision with root package name */
    public final SQLiteStatement f12858f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1016h(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        l.e(sQLiteStatement, "delegate");
        this.f12858f = sQLiteStatement;
    }

    public long executeInsert() {
        return this.f12858f.executeInsert();
    }

    public int executeUpdateDelete() {
        return this.f12858f.executeUpdateDelete();
    }
}
