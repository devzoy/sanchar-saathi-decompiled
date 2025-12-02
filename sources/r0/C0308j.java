package R0;

import v0.C0946b;
import v3.l;
import y0.g;

/* renamed from: R0.j  reason: case insensitive filesystem */
public final class C0308j extends C0946b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0308j f2516c = new C0308j();

    public C0308j() {
        super(3, 4);
    }

    public void a(g gVar) {
        l.e(gVar, "db");
        gVar.execSQL("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
