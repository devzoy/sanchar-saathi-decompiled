package androidx.work.impl;

import R0.C;
import R0.D;
import Z0.A;
import Z0.C0336b;
import Z0.c;
import Z0.e;
import Z0.f;
import Z0.j;
import Z0.k;
import Z0.o;
import Z0.p;
import Z0.r;
import Z0.s;
import Z0.v;
import Z0.z;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u0.u;
import u0.w;
import v0.C0946b;
import w0.C0960b;
import w0.C0962d;
import y0.g;
import y0.h;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: q  reason: collision with root package name */
    public volatile v f6137q;

    /* renamed from: r  reason: collision with root package name */
    public volatile C0336b f6138r;

    /* renamed from: s  reason: collision with root package name */
    public volatile z f6139s;

    /* renamed from: t  reason: collision with root package name */
    public volatile j f6140t;

    /* renamed from: u  reason: collision with root package name */
    public volatile o f6141u;

    /* renamed from: v  reason: collision with root package name */
    public volatile r f6142v;

    /* renamed from: w  reason: collision with root package name */
    public volatile e f6143w;

    public class a extends w.b {
        public a(int i4) {
            super(i4);
        }

        public void a(g gVar) {
            gVar.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            gVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            gVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            gVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        public void b(g gVar) {
            gVar.execSQL("DROP TABLE IF EXISTS `Dependency`");
            gVar.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            gVar.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.execSQL("DROP TABLE IF EXISTS `WorkName`");
            gVar.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.execSQL("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f12237h != null) {
                int size = WorkDatabase_Impl.this.f12237h.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((u.b) WorkDatabase_Impl.this.f12237h.get(i4)).b(gVar);
                }
            }
        }

        public void c(g gVar) {
            if (WorkDatabase_Impl.this.f12237h != null) {
                int size = WorkDatabase_Impl.this.f12237h.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((u.b) WorkDatabase_Impl.this.f12237h.get(i4)).a(gVar);
                }
            }
        }

        public void d(g gVar) {
            g unused = WorkDatabase_Impl.this.f12230a = gVar;
            gVar.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.u(gVar);
            if (WorkDatabase_Impl.this.f12237h != null) {
                int size = WorkDatabase_Impl.this.f12237h.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((u.b) WorkDatabase_Impl.this.f12237h.get(i4)).c(gVar);
                }
            }
        }

        public void e(g gVar) {
        }

        public void f(g gVar) {
            C0960b.a(gVar);
        }

        public w.c g(g gVar) {
            g gVar2 = gVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C0962d.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new C0962d.a("prerequisite_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C0962d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new C0962d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C0962d.e("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            hashSet2.add(new C0962d.e("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"ASC"})));
            C0962d dVar = new C0962d("Dependency", hashMap, hashSet, hashSet2);
            C0962d a4 = C0962d.a(gVar2, "Dependency");
            if (!dVar.equals(a4)) {
                return new w.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + dVar + "\n Found:\n" + a4);
            }
            HashMap hashMap2 = new HashMap(27);
            hashMap2.put("id", new C0962d.a("id", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("state", new C0962d.a("state", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new C0962d.a("worker_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new C0962d.a("input_merger_class_name", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("input", new C0962d.a("input", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new C0962d.a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new C0962d.a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new C0962d.a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new C0962d.a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new C0962d.a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new C0962d.a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new C0962d.a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("last_enqueue_time", new C0962d.a("last_enqueue_time", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("minimum_retention_duration", new C0962d.a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new C0962d.a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new C0962d.a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("out_of_quota_policy", new C0962d.a("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_count", new C0962d.a("period_count", "INTEGER", true, 0, "0", 1));
            hashMap2.put("generation", new C0962d.a("generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("required_network_type", new C0962d.a("required_network_type", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_charging", new C0962d.a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new C0962d.a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new C0962d.a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new C0962d.a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new C0962d.a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new C0962d.a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new C0962d.a("content_uri_triggers", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C0962d.e("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"}), Arrays.asList(new String[]{"ASC"})));
            hashSet4.add(new C0962d.e("index_WorkSpec_last_enqueue_time", false, Arrays.asList(new String[]{"last_enqueue_time"}), Arrays.asList(new String[]{"ASC"})));
            C0962d dVar2 = new C0962d("WorkSpec", hashMap2, hashSet3, hashSet4);
            C0962d a5 = C0962d.a(gVar2, "WorkSpec");
            if (!dVar2.equals(a5)) {
                return new w.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + dVar2 + "\n Found:\n" + a5);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C0962d.a("tag", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new C0962d.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C0962d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C0962d.e("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            C0962d dVar3 = new C0962d("WorkTag", hashMap3, hashSet5, hashSet6);
            C0962d a6 = C0962d.a(gVar2, "WorkTag");
            if (!dVar3.equals(a6)) {
                return new w.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + dVar3 + "\n Found:\n" + a6);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new C0962d.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("generation", new C0962d.a("generation", "INTEGER", true, 2, "0", 1));
            hashMap4.put("system_id", new C0962d.a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C0962d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C0962d dVar4 = new C0962d("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C0962d a7 = C0962d.a(gVar2, "SystemIdInfo");
            if (!dVar4.equals(a7)) {
                return new w.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + dVar4 + "\n Found:\n" + a7);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new C0962d.a("name", "TEXT", true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new C0962d.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C0962d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C0962d.e("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            C0962d dVar5 = new C0962d("WorkName", hashMap5, hashSet8, hashSet9);
            C0962d a8 = C0962d.a(gVar2, "WorkName");
            if (!dVar5.equals(a8)) {
                return new w.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + dVar5 + "\n Found:\n" + a8);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C0962d.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("progress", new C0962d.a("progress", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C0962d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C0962d dVar6 = new C0962d("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C0962d a9 = C0962d.a(gVar2, "WorkProgress");
            if (!dVar6.equals(a9)) {
                return new w.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + dVar6 + "\n Found:\n" + a9);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new C0962d.a("key", "TEXT", true, 1, (String) null, 1));
            hashMap7.put("long_value", new C0962d.a("long_value", "INTEGER", false, 0, (String) null, 1));
            C0962d dVar7 = new C0962d("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C0962d a10 = C0962d.a(gVar2, "Preference");
            if (dVar7.equals(a10)) {
                return new w.c(true, (String) null);
            }
            return new w.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + dVar7 + "\n Found:\n" + a10);
        }
    }

    public C0336b E() {
        C0336b bVar;
        if (this.f6138r != null) {
            return this.f6138r;
        }
        synchronized (this) {
            try {
                if (this.f6138r == null) {
                    this.f6138r = new c(this);
                }
                bVar = this.f6138r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public e F() {
        e eVar;
        if (this.f6143w != null) {
            return this.f6143w;
        }
        synchronized (this) {
            try {
                if (this.f6143w == null) {
                    this.f6143w = new f(this);
                }
                eVar = this.f6143w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public j G() {
        j jVar;
        if (this.f6140t != null) {
            return this.f6140t;
        }
        synchronized (this) {
            try {
                if (this.f6140t == null) {
                    this.f6140t = new k(this);
                }
                jVar = this.f6140t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public o H() {
        o oVar;
        if (this.f6141u != null) {
            return this.f6141u;
        }
        synchronized (this) {
            try {
                if (this.f6141u == null) {
                    this.f6141u = new p(this);
                }
                oVar = this.f6141u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    public r I() {
        r rVar;
        if (this.f6142v != null) {
            return this.f6142v;
        }
        synchronized (this) {
            try {
                if (this.f6142v == null) {
                    this.f6142v = new s(this);
                }
                rVar = this.f6142v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public v J() {
        v vVar;
        if (this.f6137q != null) {
            return this.f6137q;
        }
        synchronized (this) {
            try {
                if (this.f6137q == null) {
                    this.f6137q = new Z0.w(this);
                }
                vVar = this.f6137q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public z K() {
        z zVar;
        if (this.f6139s != null) {
            return this.f6139s;
        }
        synchronized (this) {
            try {
                if (this.f6139s == null) {
                    this.f6139s = new A(this);
                }
                zVar = this.f6139s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zVar;
    }

    public u0.o g() {
        return new u0.o(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    public h h(u0.f fVar) {
        return fVar.f12155c.create(h.b.a(fVar.f12153a).d(fVar.f12154b).c(new w(fVar, new a(16), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e")).b());
    }

    public List j(Map map) {
        return Arrays.asList(new C0946b[]{new C(), new D()});
    }

    public Set o() {
        return new HashSet();
    }

    public Map p() {
        HashMap hashMap = new HashMap();
        hashMap.put(v.class, Z0.w.w());
        hashMap.put(C0336b.class, c.e());
        hashMap.put(z.class, A.e());
        hashMap.put(j.class, k.h());
        hashMap.put(o.class, p.c());
        hashMap.put(r.class, s.c());
        hashMap.put(e.class, f.c());
        hashMap.put(Z0.g.class, Z0.h.a());
        return hashMap;
    }
}
