package z0;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import y0.h;
import z0.C1012d;

/* renamed from: z0.e  reason: case insensitive filesystem */
public final /* synthetic */ class C1013e implements DatabaseErrorHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h.a f12855a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1012d.b f12856b;

    public /* synthetic */ C1013e(h.a aVar, C1012d.b bVar) {
        this.f12855a = aVar;
        this.f12856b = bVar;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        C1012d.c.c(this.f12855a, this.f12856b, sQLiteDatabase);
    }
}
