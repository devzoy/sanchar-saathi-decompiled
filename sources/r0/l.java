package R0;

import v0.C0946b;
import y0.g;

public final class l extends C0946b {

    /* renamed from: c  reason: collision with root package name */
    public static final l f2518c = new l();

    public l() {
        super(6, 7);
    }

    public void a(g gVar) {
        v3.l.e(gVar, "db");
        gVar.execSQL("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
