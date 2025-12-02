package Z0;

import Q0.s;
import Z0.u;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u0.C0935A;
import u0.u;
import u0.x;
import w0.C0959a;
import w0.C0960b;

public final class w implements v {

    /* renamed from: a  reason: collision with root package name */
    public final u f3856a;

    /* renamed from: b  reason: collision with root package name */
    public final u0.i f3857b;

    /* renamed from: c  reason: collision with root package name */
    public final u0.h f3858c;

    /* renamed from: d  reason: collision with root package name */
    public final C0935A f3859d;

    /* renamed from: e  reason: collision with root package name */
    public final C0935A f3860e;

    /* renamed from: f  reason: collision with root package name */
    public final C0935A f3861f;

    /* renamed from: g  reason: collision with root package name */
    public final C0935A f3862g;

    /* renamed from: h  reason: collision with root package name */
    public final C0935A f3863h;

    /* renamed from: i  reason: collision with root package name */
    public final C0935A f3864i;

    /* renamed from: j  reason: collision with root package name */
    public final C0935A f3865j;

    /* renamed from: k  reason: collision with root package name */
    public final C0935A f3866k;

    /* renamed from: l  reason: collision with root package name */
    public final C0935A f3867l;

    /* renamed from: m  reason: collision with root package name */
    public final C0935A f3868m;

    /* renamed from: n  reason: collision with root package name */
    public final C0935A f3869n;

    public class a extends C0935A {
        public a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    public class b extends C0935A {
        public b(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public class c extends C0935A {
        public c(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public class d extends C0935A {
        public d(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    public class e extends u0.i {
        public e(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: k */
        public void i(y0.k kVar, u uVar) {
            String str = uVar.f3834a;
            if (str == null) {
                kVar.bindNull(1);
            } else {
                kVar.bindString(1, str);
            }
            B b4 = B.f3792a;
            kVar.bindLong(2, (long) B.j(uVar.f3835b));
            String str2 = uVar.f3836c;
            if (str2 == null) {
                kVar.bindNull(3);
            } else {
                kVar.bindString(3, str2);
            }
            String str3 = uVar.f3837d;
            if (str3 == null) {
                kVar.bindNull(4);
            } else {
                kVar.bindString(4, str3);
            }
            byte[] k4 = androidx.work.b.k(uVar.f3838e);
            if (k4 == null) {
                kVar.bindNull(5);
            } else {
                kVar.bindBlob(5, k4);
            }
            byte[] k5 = androidx.work.b.k(uVar.f3839f);
            if (k5 == null) {
                kVar.bindNull(6);
            } else {
                kVar.bindBlob(6, k5);
            }
            kVar.bindLong(7, uVar.f3840g);
            kVar.bindLong(8, uVar.f3841h);
            kVar.bindLong(9, uVar.f3842i);
            kVar.bindLong(10, (long) uVar.f3844k);
            kVar.bindLong(11, (long) B.a(uVar.f3845l));
            kVar.bindLong(12, uVar.f3846m);
            kVar.bindLong(13, uVar.f3847n);
            kVar.bindLong(14, uVar.f3848o);
            kVar.bindLong(15, uVar.f3849p);
            kVar.bindLong(16, uVar.f3850q ? 1 : 0);
            kVar.bindLong(17, (long) B.h(uVar.f3851r));
            kVar.bindLong(18, (long) uVar.e());
            kVar.bindLong(19, (long) uVar.d());
            Q0.b bVar = uVar.f3843j;
            if (bVar != null) {
                kVar.bindLong(20, (long) B.g(bVar.d()));
                kVar.bindLong(21, bVar.g() ? 1 : 0);
                kVar.bindLong(22, bVar.h() ? 1 : 0);
                kVar.bindLong(23, bVar.f() ? 1 : 0);
                kVar.bindLong(24, bVar.i() ? 1 : 0);
                kVar.bindLong(25, bVar.b());
                kVar.bindLong(26, bVar.a());
                byte[] i4 = B.i(bVar.c());
                if (i4 == null) {
                    kVar.bindNull(27);
                } else {
                    kVar.bindBlob(27, i4);
                }
            } else {
                kVar.bindNull(20);
                kVar.bindNull(21);
                kVar.bindNull(22);
                kVar.bindNull(23);
                kVar.bindNull(24);
                kVar.bindNull(25);
                kVar.bindNull(26);
                kVar.bindNull(27);
            }
        }
    }

    public class f extends u0.h {
        public f(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        /* renamed from: k */
        public void i(y0.k kVar, u uVar) {
            String str = uVar.f3834a;
            if (str == null) {
                kVar.bindNull(1);
            } else {
                kVar.bindString(1, str);
            }
            B b4 = B.f3792a;
            kVar.bindLong(2, (long) B.j(uVar.f3835b));
            String str2 = uVar.f3836c;
            if (str2 == null) {
                kVar.bindNull(3);
            } else {
                kVar.bindString(3, str2);
            }
            String str3 = uVar.f3837d;
            if (str3 == null) {
                kVar.bindNull(4);
            } else {
                kVar.bindString(4, str3);
            }
            byte[] k4 = androidx.work.b.k(uVar.f3838e);
            if (k4 == null) {
                kVar.bindNull(5);
            } else {
                kVar.bindBlob(5, k4);
            }
            byte[] k5 = androidx.work.b.k(uVar.f3839f);
            if (k5 == null) {
                kVar.bindNull(6);
            } else {
                kVar.bindBlob(6, k5);
            }
            kVar.bindLong(7, uVar.f3840g);
            kVar.bindLong(8, uVar.f3841h);
            kVar.bindLong(9, uVar.f3842i);
            kVar.bindLong(10, (long) uVar.f3844k);
            kVar.bindLong(11, (long) B.a(uVar.f3845l));
            kVar.bindLong(12, uVar.f3846m);
            kVar.bindLong(13, uVar.f3847n);
            kVar.bindLong(14, uVar.f3848o);
            kVar.bindLong(15, uVar.f3849p);
            kVar.bindLong(16, uVar.f3850q ? 1 : 0);
            kVar.bindLong(17, (long) B.h(uVar.f3851r));
            kVar.bindLong(18, (long) uVar.e());
            kVar.bindLong(19, (long) uVar.d());
            Q0.b bVar = uVar.f3843j;
            if (bVar != null) {
                kVar.bindLong(20, (long) B.g(bVar.d()));
                kVar.bindLong(21, bVar.g() ? 1 : 0);
                kVar.bindLong(22, bVar.h() ? 1 : 0);
                kVar.bindLong(23, bVar.f() ? 1 : 0);
                kVar.bindLong(24, bVar.i() ? 1 : 0);
                kVar.bindLong(25, bVar.b());
                kVar.bindLong(26, bVar.a());
                byte[] i4 = B.i(bVar.c());
                if (i4 == null) {
                    kVar.bindNull(27);
                } else {
                    kVar.bindBlob(27, i4);
                }
            } else {
                kVar.bindNull(20);
                kVar.bindNull(21);
                kVar.bindNull(22);
                kVar.bindNull(23);
                kVar.bindNull(24);
                kVar.bindNull(25);
                kVar.bindNull(26);
                kVar.bindNull(27);
            }
            String str4 = uVar.f3834a;
            if (str4 == null) {
                kVar.bindNull(28);
            } else {
                kVar.bindString(28, str4);
            }
        }
    }

    public class g extends C0935A {
        public g(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    public class h extends C0935A {
        public h(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    public class i extends C0935A {
        public i(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    public class j extends C0935A {
        public j(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    public class k extends C0935A {
        public k(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    public class l extends C0935A {
        public l(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public class m extends C0935A {
        public m(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public w(u uVar) {
        this.f3856a = uVar;
        this.f3857b = new e(uVar);
        this.f3858c = new f(uVar);
        this.f3859d = new g(uVar);
        this.f3860e = new h(uVar);
        this.f3861f = new i(uVar);
        this.f3862g = new j(uVar);
        this.f3863h = new k(uVar);
        this.f3864i = new l(uVar);
        this.f3865j = new m(uVar);
        this.f3866k = new a(uVar);
        this.f3867l = new b(uVar);
        this.f3868m = new c(uVar);
        this.f3869n = new d(uVar);
    }

    public static List w() {
        return Collections.emptyList();
    }

    public void a(String str) {
        this.f3856a.d();
        y0.k b4 = this.f3859d.b();
        if (str == null) {
            b4.bindNull(1);
        } else {
            b4.bindString(1, str);
        }
        this.f3856a.e();
        try {
            b4.executeUpdateDelete();
            this.f3856a.B();
        } finally {
            this.f3856a.i();
            this.f3859d.h(b4);
        }
    }

    public List b() {
        x xVar;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        boolean z7;
        int i7;
        boolean z8;
        int i8;
        x e4 = x.e("SELECT * FROM workspec WHERE state=1", 0);
        this.f3856a.d();
        Cursor b4 = C0960b.b(this.f3856a, e4, false, (CancellationSignal) null);
        try {
            int d4 = C0959a.d(b4, "id");
            int d5 = C0959a.d(b4, "state");
            int d6 = C0959a.d(b4, "worker_class_name");
            int d7 = C0959a.d(b4, "input_merger_class_name");
            int d8 = C0959a.d(b4, "input");
            int d9 = C0959a.d(b4, "output");
            int d10 = C0959a.d(b4, "initial_delay");
            int d11 = C0959a.d(b4, "interval_duration");
            int d12 = C0959a.d(b4, "flex_duration");
            int d13 = C0959a.d(b4, "run_attempt_count");
            int d14 = C0959a.d(b4, "backoff_policy");
            int d15 = C0959a.d(b4, "backoff_delay_duration");
            int d16 = C0959a.d(b4, "last_enqueue_time");
            int d17 = C0959a.d(b4, "minimum_retention_duration");
            xVar = e4;
            try {
                int d18 = C0959a.d(b4, "schedule_requested_at");
                int d19 = C0959a.d(b4, "run_in_foreground");
                int d20 = C0959a.d(b4, "out_of_quota_policy");
                int d21 = C0959a.d(b4, "period_count");
                int d22 = C0959a.d(b4, "generation");
                int d23 = C0959a.d(b4, "required_network_type");
                int d24 = C0959a.d(b4, "requires_charging");
                int d25 = C0959a.d(b4, "requires_device_idle");
                int d26 = C0959a.d(b4, "requires_battery_not_low");
                int d27 = C0959a.d(b4, "requires_storage_not_low");
                int d28 = C0959a.d(b4, "trigger_content_update_delay");
                int d29 = C0959a.d(b4, "trigger_max_content_delay");
                int d30 = C0959a.d(b4, "content_uri_triggers");
                int i9 = d17;
                ArrayList arrayList = new ArrayList(b4.getCount());
                while (b4.moveToNext()) {
                    String string = b4.isNull(d4) ? null : b4.getString(d4);
                    s f4 = B.f(b4.getInt(d5));
                    String string2 = b4.isNull(d6) ? null : b4.getString(d6);
                    String string3 = b4.isNull(d7) ? null : b4.getString(d7);
                    androidx.work.b g4 = androidx.work.b.g(b4.isNull(d8) ? null : b4.getBlob(d8));
                    androidx.work.b g5 = androidx.work.b.g(b4.isNull(d9) ? null : b4.getBlob(d9));
                    long j4 = b4.getLong(d10);
                    long j5 = b4.getLong(d11);
                    long j6 = b4.getLong(d12);
                    int i10 = b4.getInt(d13);
                    Q0.a c4 = B.c(b4.getInt(d14));
                    long j7 = b4.getLong(d15);
                    long j8 = b4.getLong(d16);
                    int i11 = i9;
                    long j9 = b4.getLong(i11);
                    int i12 = d4;
                    int i13 = d18;
                    long j10 = b4.getLong(i13);
                    d18 = i13;
                    int i14 = d19;
                    if (b4.getInt(i14) != 0) {
                        d19 = i14;
                        i4 = d20;
                        z4 = true;
                    } else {
                        d19 = i14;
                        i4 = d20;
                        z4 = false;
                    }
                    Q0.m e5 = B.e(b4.getInt(i4));
                    d20 = i4;
                    int i15 = d21;
                    int i16 = b4.getInt(i15);
                    d21 = i15;
                    int i17 = d22;
                    int i18 = b4.getInt(i17);
                    d22 = i17;
                    int i19 = d23;
                    Q0.j d31 = B.d(b4.getInt(i19));
                    d23 = i19;
                    int i20 = d24;
                    if (b4.getInt(i20) != 0) {
                        d24 = i20;
                        i5 = d25;
                        z5 = true;
                    } else {
                        d24 = i20;
                        i5 = d25;
                        z5 = false;
                    }
                    if (b4.getInt(i5) != 0) {
                        d25 = i5;
                        i6 = d26;
                        z6 = true;
                    } else {
                        d25 = i5;
                        i6 = d26;
                        z6 = false;
                    }
                    if (b4.getInt(i6) != 0) {
                        d26 = i6;
                        i7 = d27;
                        z7 = true;
                    } else {
                        d26 = i6;
                        i7 = d27;
                        z7 = false;
                    }
                    if (b4.getInt(i7) != 0) {
                        d27 = i7;
                        i8 = d28;
                        z8 = true;
                    } else {
                        d27 = i7;
                        i8 = d28;
                        z8 = false;
                    }
                    long j11 = b4.getLong(i8);
                    d28 = i8;
                    int i21 = d29;
                    long j12 = b4.getLong(i21);
                    d29 = i21;
                    int i22 = d30;
                    d30 = i22;
                    arrayList.add(new u(string, f4, string2, string3, g4, g5, j4, j5, j6, new Q0.b(d31, z5, z6, z7, z8, j11, j12, B.b(b4.isNull(i22) ? null : b4.getBlob(i22))), i10, c4, j7, j8, j9, j10, z4, e5, i16, i18));
                    d4 = i12;
                    i9 = i11;
                }
                b4.close();
                xVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b4.close();
                xVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xVar = e4;
            b4.close();
            xVar.g();
            throw th;
        }
    }

    public void c(u uVar) {
        this.f3856a.d();
        this.f3856a.e();
        try {
            this.f3858c.j(uVar);
            this.f3856a.B();
        } finally {
            this.f3856a.i();
        }
    }

    public void d(String str) {
        this.f3856a.d();
        y0.k b4 = this.f3861f.b();
        if (str == null) {
            b4.bindNull(1);
        } else {
            b4.bindString(1, str);
        }
        this.f3856a.e();
        try {
            b4.executeUpdateDelete();
            this.f3856a.B();
        } finally {
            this.f3856a.i();
            this.f3861f.h(b4);
        }
    }

    public boolean e() {
        boolean z4 = false;
        x e4 = x.e("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f3856a.d();
        Cursor b4 = C0960b.b(this.f3856a, e4, false, (CancellationSignal) null);
        try {
            if (b4.moveToFirst() && b4.getInt(0) != 0) {
                z4 = true;
            }
            return z4;
        } finally {
            b4.close();
            e4.g();
        }
    }

    public int f(String str, long j4) {
        this.f3856a.d();
        y0.k b4 = this.f3866k.b();
        b4.bindLong(1, j4);
        if (str == null) {
            b4.bindNull(2);
        } else {
            b4.bindString(2, str);
        }
        this.f3856a.e();
        try {
            int executeUpdateDelete = b4.executeUpdateDelete();
            this.f3856a.B();
            return executeUpdateDelete;
        } finally {
            this.f3856a.i();
            this.f3866k.h(b4);
        }
    }

    public List g(String str) {
        x e4 = x.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            e4.bindNull(1);
        } else {
            e4.bindString(1, str);
        }
        this.f3856a.d();
        Cursor b4 = C0960b.b(this.f3856a, e4, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b4.getCount());
            while (b4.moveToNext()) {
                arrayList.add(b4.isNull(0) ? null : b4.getString(0));
            }
            return arrayList;
        } finally {
            b4.close();
            e4.g();
        }
    }

    public List h(String str) {
        x e4 = x.e("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            e4.bindNull(1);
        } else {
            e4.bindString(1, str);
        }
        this.f3856a.d();
        Cursor b4 = C0960b.b(this.f3856a, e4, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b4.getCount());
            while (b4.moveToNext()) {
                arrayList.add(new u.b(b4.isNull(0) ? null : b4.getString(0), B.f(b4.getInt(1))));
            }
            return arrayList;
        } finally {
            b4.close();
            e4.g();
        }
    }

    public List i(long j4) {
        x xVar;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        boolean z7;
        int i7;
        boolean z8;
        int i8;
        x e4 = x.e("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        e4.bindLong(1, j4);
        this.f3856a.d();
        Cursor b4 = C0960b.b(this.f3856a, e4, false, (CancellationSignal) null);
        try {
            int d4 = C0959a.d(b4, "id");
            int d5 = C0959a.d(b4, "state");
            int d6 = C0959a.d(b4, "worker_class_name");
            int d7 = C0959a.d(b4, "input_merger_class_name");
            int d8 = C0959a.d(b4, "input");
            int d9 = C0959a.d(b4, "output");
            int d10 = C0959a.d(b4, "initial_delay");
            int d11 = C0959a.d(b4, "interval_duration");
            int d12 = C0959a.d(b4, "flex_duration");
            int d13 = C0959a.d(b4, "run_attempt_count");
            int d14 = C0959a.d(b4, "backoff_policy");
            int d15 = C0959a.d(b4, "backoff_delay_duration");
            int d16 = C0959a.d(b4, "last_enqueue_time");
            int d17 = C0959a.d(b4, "minimum_retention_duration");
            xVar = e4;
            try {
                int d18 = C0959a.d(b4, "schedule_requested_at");
                int d19 = C0959a.d(b4, "run_in_foreground");
                int d20 = C0959a.d(b4, "out_of_quota_policy");
                int d21 = C0959a.d(b4, "period_count");
                int d22 = C0959a.d(b4, "generation");
                int d23 = C0959a.d(b4, "required_network_type");
                int d24 = C0959a.d(b4, "requires_charging");
                int d25 = C0959a.d(b4, "requires_device_idle");
                int d26 = C0959a.d(b4, "requires_battery_not_low");
                int d27 = C0959a.d(b4, "requires_storage_not_low");
                int d28 = C0959a.d(b4, "trigger_content_update_delay");
                int d29 = C0959a.d(b4, "trigger_max_content_delay");
                int d30 = C0959a.d(b4, "content_uri_triggers");
                int i9 = d17;
                ArrayList arrayList = new ArrayList(b4.getCount());
                while (b4.moveToNext()) {
                    String string = b4.isNull(d4) ? null : b4.getString(d4);
                    s f4 = B.f(b4.getInt(d5));
                    String string2 = b4.isNull(d6) ? null : b4.getString(d6);
                    String string3 = b4.isNull(d7) ? null : b4.getString(d7);
                    androidx.work.b g4 = androidx.work.b.g(b4.isNull(d8) ? null : b4.getBlob(d8));
                    androidx.work.b g5 = androidx.work.b.g(b4.isNull(d9) ? null : b4.getBlob(d9));
                    long j5 = b4.getLong(d10);
                    long j6 = b4.getLong(d11);
                    long j7 = b4.getLong(d12);
                    int i10 = b4.getInt(d13);
                    Q0.a c4 = B.c(b4.getInt(d14));
                    long j8 = b4.getLong(d15);
                    long j9 = b4.getLong(d16);
                    int i11 = i9;
                    long j10 = b4.getLong(i11);
                    int i12 = d4;
                    int i13 = d18;
                    long j11 = b4.getLong(i13);
                    d18 = i13;
                    int i14 = d19;
                    if (b4.getInt(i14) != 0) {
                        d19 = i14;
                        i4 = d20;
                        z4 = true;
                    } else {
                        d19 = i14;
                        i4 = d20;
                        z4 = false;
                    }
                    Q0.m e5 = B.e(b4.getInt(i4));
                    d20 = i4;
                    int i15 = d21;
                    int i16 = b4.getInt(i15);
                    d21 = i15;
                    int i17 = d22;
                    int i18 = b4.getInt(i17);
                    d22 = i17;
                    int i19 = d23;
                    Q0.j d31 = B.d(b4.getInt(i19));
                    d23 = i19;
                    int i20 = d24;
                    if (b4.getInt(i20) != 0) {
                        d24 = i20;
                        i5 = d25;
                        z5 = true;
                    } else {
                        d24 = i20;
                        i5 = d25;
                        z5 = false;
                    }
                    if (b4.getInt(i5) != 0) {
                        d25 = i5;
                        i6 = d26;
                        z6 = true;
                    } else {
                        d25 = i5;
                        i6 = d26;
                        z6 = false;
                    }
                    if (b4.getInt(i6) != 0) {
                        d26 = i6;
                        i7 = d27;
                        z7 = true;
                    } else {
                        d26 = i6;
                        i7 = d27;
                        z7 = false;
                    }
                    if (b4.getInt(i7) != 0) {
                        d27 = i7;
                        i8 = d28;
                        z8 = true;
                    } else {
                        d27 = i7;
                        i8 = d28;
                        z8 = false;
                    }
                    long j12 = b4.getLong(i8);
                    d28 = i8;
                    int i21 = d29;
                    long j13 = b4.getLong(i21);
                    d29 = i21;
                    int i22 = d30;
                    d30 = i22;
                    arrayList.add(new u(string, f4, string2, string3, g4, g5, j5, j6, j7, new Q0.b(d31, z5, z6, z7, z8, j12, j13, B.b(b4.isNull(i22) ? null : b4.getBlob(i22))), i10, c4, j8, j9, j10, j11, z4, e5, i16, i18));
                    d4 = i12;
                    i9 = i11;
                }
                b4.close();
                xVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b4.close();
                xVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xVar = e4;
            b4.close();
            xVar.g();
            throw th;
        }
    }

    public void j(u uVar) {
        this.f3856a.d();
        this.f3856a.e();
        try {
            this.f3857b.j(uVar);
            this.f3856a.B();
        } finally {
            this.f3856a.i();
        }
    }

    public s k(String str) {
        x e4 = x.e("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            e4.bindNull(1);
        } else {
            e4.bindString(1, str);
        }
        this.f3856a.d();
        s sVar = null;
        Cursor b4 = C0960b.b(this.f3856a, e4, false, (CancellationSignal) null);
        try {
            if (b4.moveToFirst()) {
                Integer valueOf = b4.isNull(0) ? null : Integer.valueOf(b4.getInt(0));
                if (valueOf != null) {
                    B b5 = B.f3792a;
                    sVar = B.f(valueOf.intValue());
                }
            }
            return sVar;
        } finally {
            b4.close();
            e4.g();
        }
    }

    public List l(int i4) {
        x xVar;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        boolean z7;
        int i8;
        boolean z8;
        int i9;
        x e4 = x.e("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        e4.bindLong(1, (long) i4);
        this.f3856a.d();
        Cursor b4 = C0960b.b(this.f3856a, e4, false, (CancellationSignal) null);
        try {
            int d4 = C0959a.d(b4, "id");
            int d5 = C0959a.d(b4, "state");
            int d6 = C0959a.d(b4, "worker_class_name");
            int d7 = C0959a.d(b4, "input_merger_class_name");
            int d8 = C0959a.d(b4, "input");
            int d9 = C0959a.d(b4, "output");
            int d10 = C0959a.d(b4, "initial_delay");
            int d11 = C0959a.d(b4, "interval_duration");
            int d12 = C0959a.d(b4, "flex_duration");
            int d13 = C0959a.d(b4, "run_attempt_count");
            int d14 = C0959a.d(b4, "backoff_policy");
            int d15 = C0959a.d(b4, "backoff_delay_duration");
            int d16 = C0959a.d(b4, "last_enqueue_time");
            int d17 = C0959a.d(b4, "minimum_retention_duration");
            xVar = e4;
            try {
                int d18 = C0959a.d(b4, "schedule_requested_at");
                int d19 = C0959a.d(b4, "run_in_foreground");
                int d20 = C0959a.d(b4, "out_of_quota_policy");
                int d21 = C0959a.d(b4, "period_count");
                int d22 = C0959a.d(b4, "generation");
                int d23 = C0959a.d(b4, "required_network_type");
                int d24 = C0959a.d(b4, "requires_charging");
                int d25 = C0959a.d(b4, "requires_device_idle");
                int d26 = C0959a.d(b4, "requires_battery_not_low");
                int d27 = C0959a.d(b4, "requires_storage_not_low");
                int d28 = C0959a.d(b4, "trigger_content_update_delay");
                int d29 = C0959a.d(b4, "trigger_max_content_delay");
                int d30 = C0959a.d(b4, "content_uri_triggers");
                int i10 = d17;
                ArrayList arrayList = new ArrayList(b4.getCount());
                while (b4.moveToNext()) {
                    String string = b4.isNull(d4) ? null : b4.getString(d4);
                    s f4 = B.f(b4.getInt(d5));
                    String string2 = b4.isNull(d6) ? null : b4.getString(d6);
                    String string3 = b4.isNull(d7) ? null : b4.getString(d7);
                    androidx.work.b g4 = androidx.work.b.g(b4.isNull(d8) ? null : b4.getBlob(d8));
                    androidx.work.b g5 = androidx.work.b.g(b4.isNull(d9) ? null : b4.getBlob(d9));
                    long j4 = b4.getLong(d10);
                    long j5 = b4.getLong(d11);
                    long j6 = b4.getLong(d12);
                    int i11 = b4.getInt(d13);
                    Q0.a c4 = B.c(b4.getInt(d14));
                    long j7 = b4.getLong(d15);
                    long j8 = b4.getLong(d16);
                    int i12 = i10;
                    long j9 = b4.getLong(i12);
                    int i13 = d4;
                    int i14 = d18;
                    long j10 = b4.getLong(i14);
                    d18 = i14;
                    int i15 = d19;
                    if (b4.getInt(i15) != 0) {
                        d19 = i15;
                        i5 = d20;
                        z4 = true;
                    } else {
                        d19 = i15;
                        i5 = d20;
                        z4 = false;
                    }
                    Q0.m e5 = B.e(b4.getInt(i5));
                    d20 = i5;
                    int i16 = d21;
                    int i17 = b4.getInt(i16);
                    d21 = i16;
                    int i18 = d22;
                    int i19 = b4.getInt(i18);
                    d22 = i18;
                    int i20 = d23;
                    Q0.j d31 = B.d(b4.getInt(i20));
                    d23 = i20;
                    int i21 = d24;
                    if (b4.getInt(i21) != 0) {
                        d24 = i21;
                        i6 = d25;
                        z5 = true;
                    } else {
                        d24 = i21;
                        i6 = d25;
                        z5 = false;
                    }
                    if (b4.getInt(i6) != 0) {
                        d25 = i6;
                        i7 = d26;
                        z6 = true;
                    } else {
                        d25 = i6;
                        i7 = d26;
                        z6 = false;
                    }
                    if (b4.getInt(i7) != 0) {
                        d26 = i7;
                        i8 = d27;
                        z7 = true;
                    } else {
                        d26 = i7;
                        i8 = d27;
                        z7 = false;
                    }
                    if (b4.getInt(i8) != 0) {
                        d27 = i8;
                        i9 = d28;
                        z8 = true;
                    } else {
                        d27 = i8;
                        i9 = d28;
                        z8 = false;
                    }
                    long j11 = b4.getLong(i9);
                    d28 = i9;
                    int i22 = d29;
                    long j12 = b4.getLong(i22);
                    d29 = i22;
                    int i23 = d30;
                    d30 = i23;
                    arrayList.add(new u(string, f4, string2, string3, g4, g5, j4, j5, j6, new Q0.b(d31, z5, z6, z7, z8, j11, j12, B.b(b4.isNull(i23) ? null : b4.getBlob(i23))), i11, c4, j7, j8, j9, j10, z4, e5, i17, i19));
                    d4 = i13;
                    i10 = i12;
                }
                b4.close();
                xVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b4.close();
                xVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xVar = e4;
            b4.close();
            xVar.g();
            throw th;
        }
    }

    public u m(String str) {
        x xVar;
        u uVar;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        boolean z7;
        int i7;
        boolean z8;
        int i8;
        String str2 = str;
        x e4 = x.e("SELECT * FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            e4.bindNull(1);
        } else {
            e4.bindString(1, str2);
        }
        this.f3856a.d();
        Cursor b4 = C0960b.b(this.f3856a, e4, false, (CancellationSignal) null);
        try {
            int d4 = C0959a.d(b4, "id");
            int d5 = C0959a.d(b4, "state");
            int d6 = C0959a.d(b4, "worker_class_name");
            int d7 = C0959a.d(b4, "input_merger_class_name");
            int d8 = C0959a.d(b4, "input");
            int d9 = C0959a.d(b4, "output");
            int d10 = C0959a.d(b4, "initial_delay");
            int d11 = C0959a.d(b4, "interval_duration");
            int d12 = C0959a.d(b4, "flex_duration");
            int d13 = C0959a.d(b4, "run_attempt_count");
            int d14 = C0959a.d(b4, "backoff_policy");
            int d15 = C0959a.d(b4, "backoff_delay_duration");
            int d16 = C0959a.d(b4, "last_enqueue_time");
            int d17 = C0959a.d(b4, "minimum_retention_duration");
            xVar = e4;
            try {
                int d18 = C0959a.d(b4, "schedule_requested_at");
                int d19 = C0959a.d(b4, "run_in_foreground");
                int d20 = C0959a.d(b4, "out_of_quota_policy");
                int d21 = C0959a.d(b4, "period_count");
                int d22 = C0959a.d(b4, "generation");
                int d23 = C0959a.d(b4, "required_network_type");
                int d24 = C0959a.d(b4, "requires_charging");
                int d25 = C0959a.d(b4, "requires_device_idle");
                int d26 = C0959a.d(b4, "requires_battery_not_low");
                int d27 = C0959a.d(b4, "requires_storage_not_low");
                int d28 = C0959a.d(b4, "trigger_content_update_delay");
                int d29 = C0959a.d(b4, "trigger_max_content_delay");
                int d30 = C0959a.d(b4, "content_uri_triggers");
                if (b4.moveToFirst()) {
                    String string = b4.isNull(d4) ? null : b4.getString(d4);
                    s f4 = B.f(b4.getInt(d5));
                    String string2 = b4.isNull(d6) ? null : b4.getString(d6);
                    String string3 = b4.isNull(d7) ? null : b4.getString(d7);
                    androidx.work.b g4 = androidx.work.b.g(b4.isNull(d8) ? null : b4.getBlob(d8));
                    androidx.work.b g5 = androidx.work.b.g(b4.isNull(d9) ? null : b4.getBlob(d9));
                    long j4 = b4.getLong(d10);
                    long j5 = b4.getLong(d11);
                    long j6 = b4.getLong(d12);
                    int i9 = b4.getInt(d13);
                    Q0.a c4 = B.c(b4.getInt(d14));
                    long j7 = b4.getLong(d15);
                    long j8 = b4.getLong(d16);
                    long j9 = b4.getLong(d17);
                    long j10 = b4.getLong(d18);
                    if (b4.getInt(d19) != 0) {
                        i4 = d20;
                        z4 = true;
                    } else {
                        i4 = d20;
                        z4 = false;
                    }
                    Q0.m e5 = B.e(b4.getInt(i4));
                    int i10 = b4.getInt(d21);
                    int i11 = b4.getInt(d22);
                    Q0.j d31 = B.d(b4.getInt(d23));
                    if (b4.getInt(d24) != 0) {
                        i5 = d25;
                        z5 = true;
                    } else {
                        i5 = d25;
                        z5 = false;
                    }
                    if (b4.getInt(i5) != 0) {
                        i6 = d26;
                        z6 = true;
                    } else {
                        i6 = d26;
                        z6 = false;
                    }
                    if (b4.getInt(i6) != 0) {
                        i7 = d27;
                        z7 = true;
                    } else {
                        i7 = d27;
                        z7 = false;
                    }
                    if (b4.getInt(i7) != 0) {
                        i8 = d28;
                        z8 = true;
                    } else {
                        i8 = d28;
                        z8 = false;
                    }
                    uVar = new u(string, f4, string2, string3, g4, g5, j4, j5, j6, new Q0.b(d31, z5, z6, z7, z8, b4.getLong(i8), b4.getLong(d29), B.b(b4.isNull(d30) ? null : b4.getBlob(d30))), i9, c4, j7, j8, j9, j10, z4, e5, i10, i11);
                } else {
                    uVar = null;
                }
                b4.close();
                xVar.g();
                return uVar;
            } catch (Throwable th) {
                th = th;
                b4.close();
                xVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xVar = e4;
            b4.close();
            xVar.g();
            throw th;
        }
    }

    public int n(s sVar, String str) {
        this.f3856a.d();
        y0.k b4 = this.f3860e.b();
        b4.bindLong(1, (long) B.j(sVar));
        if (str == null) {
            b4.bindNull(2);
        } else {
            b4.bindString(2, str);
        }
        this.f3856a.e();
        try {
            int executeUpdateDelete = b4.executeUpdateDelete();
            this.f3856a.B();
            return executeUpdateDelete;
        } finally {
            this.f3856a.i();
            this.f3860e.h(b4);
        }
    }

    public int o(String str) {
        this.f3856a.d();
        y0.k b4 = this.f3865j.b();
        if (str == null) {
            b4.bindNull(1);
        } else {
            b4.bindString(1, str);
        }
        this.f3856a.e();
        try {
            int executeUpdateDelete = b4.executeUpdateDelete();
            this.f3856a.B();
            return executeUpdateDelete;
        } finally {
            this.f3856a.i();
            this.f3865j.h(b4);
        }
    }

    public void p(String str, long j4) {
        this.f3856a.d();
        y0.k b4 = this.f3863h.b();
        b4.bindLong(1, j4);
        if (str == null) {
            b4.bindNull(2);
        } else {
            b4.bindString(2, str);
        }
        this.f3856a.e();
        try {
            b4.executeUpdateDelete();
            this.f3856a.B();
        } finally {
            this.f3856a.i();
            this.f3863h.h(b4);
        }
    }

    public List q(String str) {
        x e4 = x.e("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            e4.bindNull(1);
        } else {
            e4.bindString(1, str);
        }
        this.f3856a.d();
        Cursor b4 = C0960b.b(this.f3856a, e4, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b4.getCount());
            while (b4.moveToNext()) {
                arrayList.add(androidx.work.b.g(b4.isNull(0) ? null : b4.getBlob(0)));
            }
            return arrayList;
        } finally {
            b4.close();
            e4.g();
        }
    }

    public int r(String str) {
        this.f3856a.d();
        y0.k b4 = this.f3864i.b();
        if (str == null) {
            b4.bindNull(1);
        } else {
            b4.bindString(1, str);
        }
        this.f3856a.e();
        try {
            int executeUpdateDelete = b4.executeUpdateDelete();
            this.f3856a.B();
            return executeUpdateDelete;
        } finally {
            this.f3856a.i();
            this.f3864i.h(b4);
        }
    }

    public List s() {
        x xVar;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        boolean z7;
        int i7;
        boolean z8;
        int i8;
        x e4 = x.e("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f3856a.d();
        Cursor b4 = C0960b.b(this.f3856a, e4, false, (CancellationSignal) null);
        try {
            int d4 = C0959a.d(b4, "id");
            int d5 = C0959a.d(b4, "state");
            int d6 = C0959a.d(b4, "worker_class_name");
            int d7 = C0959a.d(b4, "input_merger_class_name");
            int d8 = C0959a.d(b4, "input");
            int d9 = C0959a.d(b4, "output");
            int d10 = C0959a.d(b4, "initial_delay");
            int d11 = C0959a.d(b4, "interval_duration");
            int d12 = C0959a.d(b4, "flex_duration");
            int d13 = C0959a.d(b4, "run_attempt_count");
            int d14 = C0959a.d(b4, "backoff_policy");
            int d15 = C0959a.d(b4, "backoff_delay_duration");
            int d16 = C0959a.d(b4, "last_enqueue_time");
            int d17 = C0959a.d(b4, "minimum_retention_duration");
            xVar = e4;
            try {
                int d18 = C0959a.d(b4, "schedule_requested_at");
                int d19 = C0959a.d(b4, "run_in_foreground");
                int d20 = C0959a.d(b4, "out_of_quota_policy");
                int d21 = C0959a.d(b4, "period_count");
                int d22 = C0959a.d(b4, "generation");
                int d23 = C0959a.d(b4, "required_network_type");
                int d24 = C0959a.d(b4, "requires_charging");
                int d25 = C0959a.d(b4, "requires_device_idle");
                int d26 = C0959a.d(b4, "requires_battery_not_low");
                int d27 = C0959a.d(b4, "requires_storage_not_low");
                int d28 = C0959a.d(b4, "trigger_content_update_delay");
                int d29 = C0959a.d(b4, "trigger_max_content_delay");
                int d30 = C0959a.d(b4, "content_uri_triggers");
                int i9 = d17;
                ArrayList arrayList = new ArrayList(b4.getCount());
                while (b4.moveToNext()) {
                    String string = b4.isNull(d4) ? null : b4.getString(d4);
                    s f4 = B.f(b4.getInt(d5));
                    String string2 = b4.isNull(d6) ? null : b4.getString(d6);
                    String string3 = b4.isNull(d7) ? null : b4.getString(d7);
                    androidx.work.b g4 = androidx.work.b.g(b4.isNull(d8) ? null : b4.getBlob(d8));
                    androidx.work.b g5 = androidx.work.b.g(b4.isNull(d9) ? null : b4.getBlob(d9));
                    long j4 = b4.getLong(d10);
                    long j5 = b4.getLong(d11);
                    long j6 = b4.getLong(d12);
                    int i10 = b4.getInt(d13);
                    Q0.a c4 = B.c(b4.getInt(d14));
                    long j7 = b4.getLong(d15);
                    long j8 = b4.getLong(d16);
                    int i11 = i9;
                    long j9 = b4.getLong(i11);
                    int i12 = d4;
                    int i13 = d18;
                    long j10 = b4.getLong(i13);
                    d18 = i13;
                    int i14 = d19;
                    if (b4.getInt(i14) != 0) {
                        d19 = i14;
                        i4 = d20;
                        z4 = true;
                    } else {
                        d19 = i14;
                        i4 = d20;
                        z4 = false;
                    }
                    Q0.m e5 = B.e(b4.getInt(i4));
                    d20 = i4;
                    int i15 = d21;
                    int i16 = b4.getInt(i15);
                    d21 = i15;
                    int i17 = d22;
                    int i18 = b4.getInt(i17);
                    d22 = i17;
                    int i19 = d23;
                    Q0.j d31 = B.d(b4.getInt(i19));
                    d23 = i19;
                    int i20 = d24;
                    if (b4.getInt(i20) != 0) {
                        d24 = i20;
                        i5 = d25;
                        z5 = true;
                    } else {
                        d24 = i20;
                        i5 = d25;
                        z5 = false;
                    }
                    if (b4.getInt(i5) != 0) {
                        d25 = i5;
                        i6 = d26;
                        z6 = true;
                    } else {
                        d25 = i5;
                        i6 = d26;
                        z6 = false;
                    }
                    if (b4.getInt(i6) != 0) {
                        d26 = i6;
                        i7 = d27;
                        z7 = true;
                    } else {
                        d26 = i6;
                        i7 = d27;
                        z7 = false;
                    }
                    if (b4.getInt(i7) != 0) {
                        d27 = i7;
                        i8 = d28;
                        z8 = true;
                    } else {
                        d27 = i7;
                        i8 = d28;
                        z8 = false;
                    }
                    long j11 = b4.getLong(i8);
                    d28 = i8;
                    int i21 = d29;
                    long j12 = b4.getLong(i21);
                    d29 = i21;
                    int i22 = d30;
                    d30 = i22;
                    arrayList.add(new u(string, f4, string2, string3, g4, g5, j4, j5, j6, new Q0.b(d31, z5, z6, z7, z8, j11, j12, B.b(b4.isNull(i22) ? null : b4.getBlob(i22))), i10, c4, j7, j8, j9, j10, z4, e5, i16, i18));
                    d4 = i12;
                    i9 = i11;
                }
                b4.close();
                xVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b4.close();
                xVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xVar = e4;
            b4.close();
            xVar.g();
            throw th;
        }
    }

    public List t(int i4) {
        x xVar;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        boolean z7;
        int i8;
        boolean z8;
        int i9;
        x e4 = x.e("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        e4.bindLong(1, (long) i4);
        this.f3856a.d();
        Cursor b4 = C0960b.b(this.f3856a, e4, false, (CancellationSignal) null);
        try {
            int d4 = C0959a.d(b4, "id");
            int d5 = C0959a.d(b4, "state");
            int d6 = C0959a.d(b4, "worker_class_name");
            int d7 = C0959a.d(b4, "input_merger_class_name");
            int d8 = C0959a.d(b4, "input");
            int d9 = C0959a.d(b4, "output");
            int d10 = C0959a.d(b4, "initial_delay");
            int d11 = C0959a.d(b4, "interval_duration");
            int d12 = C0959a.d(b4, "flex_duration");
            int d13 = C0959a.d(b4, "run_attempt_count");
            int d14 = C0959a.d(b4, "backoff_policy");
            int d15 = C0959a.d(b4, "backoff_delay_duration");
            int d16 = C0959a.d(b4, "last_enqueue_time");
            int d17 = C0959a.d(b4, "minimum_retention_duration");
            xVar = e4;
            try {
                int d18 = C0959a.d(b4, "schedule_requested_at");
                int d19 = C0959a.d(b4, "run_in_foreground");
                int d20 = C0959a.d(b4, "out_of_quota_policy");
                int d21 = C0959a.d(b4, "period_count");
                int d22 = C0959a.d(b4, "generation");
                int d23 = C0959a.d(b4, "required_network_type");
                int d24 = C0959a.d(b4, "requires_charging");
                int d25 = C0959a.d(b4, "requires_device_idle");
                int d26 = C0959a.d(b4, "requires_battery_not_low");
                int d27 = C0959a.d(b4, "requires_storage_not_low");
                int d28 = C0959a.d(b4, "trigger_content_update_delay");
                int d29 = C0959a.d(b4, "trigger_max_content_delay");
                int d30 = C0959a.d(b4, "content_uri_triggers");
                int i10 = d17;
                ArrayList arrayList = new ArrayList(b4.getCount());
                while (b4.moveToNext()) {
                    String string = b4.isNull(d4) ? null : b4.getString(d4);
                    s f4 = B.f(b4.getInt(d5));
                    String string2 = b4.isNull(d6) ? null : b4.getString(d6);
                    String string3 = b4.isNull(d7) ? null : b4.getString(d7);
                    androidx.work.b g4 = androidx.work.b.g(b4.isNull(d8) ? null : b4.getBlob(d8));
                    androidx.work.b g5 = androidx.work.b.g(b4.isNull(d9) ? null : b4.getBlob(d9));
                    long j4 = b4.getLong(d10);
                    long j5 = b4.getLong(d11);
                    long j6 = b4.getLong(d12);
                    int i11 = b4.getInt(d13);
                    Q0.a c4 = B.c(b4.getInt(d14));
                    long j7 = b4.getLong(d15);
                    long j8 = b4.getLong(d16);
                    int i12 = i10;
                    long j9 = b4.getLong(i12);
                    int i13 = d4;
                    int i14 = d18;
                    long j10 = b4.getLong(i14);
                    d18 = i14;
                    int i15 = d19;
                    if (b4.getInt(i15) != 0) {
                        d19 = i15;
                        i5 = d20;
                        z4 = true;
                    } else {
                        d19 = i15;
                        i5 = d20;
                        z4 = false;
                    }
                    Q0.m e5 = B.e(b4.getInt(i5));
                    d20 = i5;
                    int i16 = d21;
                    int i17 = b4.getInt(i16);
                    d21 = i16;
                    int i18 = d22;
                    int i19 = b4.getInt(i18);
                    d22 = i18;
                    int i20 = d23;
                    Q0.j d31 = B.d(b4.getInt(i20));
                    d23 = i20;
                    int i21 = d24;
                    if (b4.getInt(i21) != 0) {
                        d24 = i21;
                        i6 = d25;
                        z5 = true;
                    } else {
                        d24 = i21;
                        i6 = d25;
                        z5 = false;
                    }
                    if (b4.getInt(i6) != 0) {
                        d25 = i6;
                        i7 = d26;
                        z6 = true;
                    } else {
                        d25 = i6;
                        i7 = d26;
                        z6 = false;
                    }
                    if (b4.getInt(i7) != 0) {
                        d26 = i7;
                        i8 = d27;
                        z7 = true;
                    } else {
                        d26 = i7;
                        i8 = d27;
                        z7 = false;
                    }
                    if (b4.getInt(i8) != 0) {
                        d27 = i8;
                        i9 = d28;
                        z8 = true;
                    } else {
                        d27 = i8;
                        i9 = d28;
                        z8 = false;
                    }
                    long j11 = b4.getLong(i9);
                    d28 = i9;
                    int i22 = d29;
                    long j12 = b4.getLong(i22);
                    d29 = i22;
                    int i23 = d30;
                    d30 = i23;
                    arrayList.add(new u(string, f4, string2, string3, g4, g5, j4, j5, j6, new Q0.b(d31, z5, z6, z7, z8, j11, j12, B.b(b4.isNull(i23) ? null : b4.getBlob(i23))), i11, c4, j7, j8, j9, j10, z4, e5, i17, i19));
                    d4 = i13;
                    i10 = i12;
                }
                b4.close();
                xVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b4.close();
                xVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xVar = e4;
            b4.close();
            xVar.g();
            throw th;
        }
    }

    public void u(String str, androidx.work.b bVar) {
        this.f3856a.d();
        y0.k b4 = this.f3862g.b();
        byte[] k4 = androidx.work.b.k(bVar);
        if (k4 == null) {
            b4.bindNull(1);
        } else {
            b4.bindBlob(1, k4);
        }
        if (str == null) {
            b4.bindNull(2);
        } else {
            b4.bindString(2, str);
        }
        this.f3856a.e();
        try {
            b4.executeUpdateDelete();
            this.f3856a.B();
        } finally {
            this.f3856a.i();
            this.f3862g.h(b4);
        }
    }

    public int v() {
        this.f3856a.d();
        y0.k b4 = this.f3867l.b();
        this.f3856a.e();
        try {
            int executeUpdateDelete = b4.executeUpdateDelete();
            this.f3856a.B();
            return executeUpdateDelete;
        } finally {
            this.f3856a.i();
            this.f3867l.h(b4);
        }
    }
}
