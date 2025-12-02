package R0;

import v0.C0946b;
import v3.l;
import y0.g;

public final class m extends C0946b {

    /* renamed from: c  reason: collision with root package name */
    public static final m f2519c = new m();

    public m() {
        super(7, 8);
    }

    public void a(g gVar) {
        l.e(gVar, "db");
        gVar.execSQL("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
