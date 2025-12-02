package R0;

import v0.C0946b;
import v3.l;
import y0.g;

public final class n extends C0946b {

    /* renamed from: c  reason: collision with root package name */
    public static final n f2520c = new n();

    public n() {
        super(8, 9);
    }

    public void a(g gVar) {
        l.e(gVar, "db");
        gVar.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
