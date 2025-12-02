package R0;

import u0.u;
import v3.l;
import y0.g;

/* renamed from: R0.c  reason: case insensitive filesystem */
public final class C0301c extends u.b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0301c f2510a = new C0301c();

    public void c(g gVar) {
        l.e(gVar, "db");
        super.c(gVar);
        gVar.beginTransaction();
        try {
            gVar.execSQL(e());
            gVar.setTransactionSuccessful();
        } finally {
            gVar.endTransaction();
        }
    }

    public final long d() {
        return System.currentTimeMillis() - z.f2561a;
    }

    public final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
