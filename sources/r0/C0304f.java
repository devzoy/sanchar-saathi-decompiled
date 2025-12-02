package R0;

import v0.C0946b;
import v3.l;
import y0.g;

/* renamed from: R0.f  reason: case insensitive filesystem */
public final class C0304f extends C0946b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0304f f2512c = new C0304f();

    public C0304f() {
        super(11, 12);
    }

    public void a(g gVar) {
        l.e(gVar, "db");
        gVar.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
