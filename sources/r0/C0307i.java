package R0;

import v0.C0946b;
import v3.l;
import y0.g;

/* renamed from: R0.i  reason: case insensitive filesystem */
public final class C0307i extends C0946b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0307i f2515c = new C0307i();

    public C0307i() {
        super(1, 2);
    }

    public void a(g gVar) {
        l.e(gVar, "db");
        gVar.execSQL("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        gVar.execSQL("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        gVar.execSQL("DROP TABLE IF EXISTS alarmInfo");
        gVar.execSQL("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
