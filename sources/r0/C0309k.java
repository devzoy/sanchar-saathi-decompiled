package R0;

import v0.C0946b;
import v3.l;
import y0.g;

/* renamed from: R0.k  reason: case insensitive filesystem */
public final class C0309k extends C0946b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0309k f2517c = new C0309k();

    public C0309k() {
        super(4, 5);
    }

    public void a(g gVar) {
        l.e(gVar, "db");
        gVar.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        gVar.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
