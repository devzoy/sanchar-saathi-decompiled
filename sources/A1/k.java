package a1;

import androidx.work.impl.WorkDatabase;
import v3.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final WorkDatabase f3966a;

    public k(WorkDatabase workDatabase) {
        l.e(workDatabase, "workDatabase");
        this.f3966a = workDatabase;
    }

    public static final Integer d(k kVar) {
        l.e(kVar, "this$0");
        return Integer.valueOf(l.d(kVar.f3966a, "next_alarm_manager_id"));
    }

    public static final Integer f(k kVar, int i4, int i5) {
        l.e(kVar, "this$0");
        int a4 = l.d(kVar.f3966a, "next_job_scheduler_id");
        if (i4 > a4 || a4 > i5) {
            l.e(kVar.f3966a, "next_job_scheduler_id", i4 + 1);
        } else {
            i4 = a4;
        }
        return Integer.valueOf(i4);
    }

    public final int c() {
        Object z4 = this.f3966a.z(new i(this));
        l.d(z4, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) z4).intValue();
    }

    public final int e(int i4, int i5) {
        Object z4 = this.f3966a.z(new j(this, i4, i5));
        l.d(z4, "workDatabase.runInTransa…            id\n        })");
        return ((Number) z4).intValue();
    }
}
