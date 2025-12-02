package androidx.work.impl.background.systemalarm;

import Q0.i;
import R0.C0303e;
import R0.v;
import R0.w;
import Z0.m;
import Z0.u;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a implements C0303e {

    /* renamed from: g  reason: collision with root package name */
    public static final String f6155g = i.i("CommandHandler");

    /* renamed from: c  reason: collision with root package name */
    public final Context f6156c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f6157d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final Object f6158e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public final w f6159f;

    public a(Context context, w wVar) {
        this.f6156c = context;
        this.f6159f = wVar;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent b(Context context, m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return q(intent, mVar);
    }

    public static Intent c(Context context, m mVar, boolean z4) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z4);
        return q(intent, mVar);
    }

    public static Intent e(Context context, m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return q(intent, mVar);
    }

    public static Intent f(Context context, m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return q(intent, mVar);
    }

    public static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    public static m p(Intent intent) {
        return new m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static Intent q(Intent intent, m mVar) {
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", mVar.a());
        return intent;
    }

    public void d(m mVar, boolean z4) {
        synchronized (this.f6158e) {
            try {
                c cVar = (c) this.f6157d.remove(mVar);
                this.f6159f.b(mVar);
                if (cVar != null) {
                    cVar.h(z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Intent intent, int i4, d dVar) {
        i e4 = i.e();
        String str = f6155g;
        e4.a(str, "Handling constraints changed " + intent);
        new b(this.f6156c, i4, dVar).a();
    }

    public final void h(Intent intent, int i4, d dVar) {
        synchronized (this.f6158e) {
            try {
                m p4 = p(intent);
                i e4 = i.e();
                String str = f6155g;
                e4.a(str, "Handing delay met for " + p4);
                if (!this.f6157d.containsKey(p4)) {
                    c cVar = new c(this.f6156c, i4, dVar, this.f6159f.d(p4));
                    this.f6157d.put(p4, cVar);
                    cVar.g();
                } else {
                    i e5 = i.e();
                    e5.a(str, "WorkSpec " + p4 + " is is already being handled for ACTION_DELAY_MET");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(Intent intent, int i4) {
        m p4 = p(intent);
        boolean z4 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        i e4 = i.e();
        String str = f6155g;
        e4.a(str, "Handling onExecutionCompleted " + intent + ", " + i4);
        d(p4, z4);
    }

    public final void j(Intent intent, int i4, d dVar) {
        i e4 = i.e();
        String str = f6155g;
        e4.a(str, "Handling reschedule " + intent + ", " + i4);
        dVar.g().u();
    }

    public final void k(Intent intent, int i4, d dVar) {
        m p4 = p(intent);
        i e4 = i.e();
        String str = f6155g;
        e4.a(str, "Handling schedule work for " + p4);
        WorkDatabase q4 = dVar.g().q();
        q4.e();
        try {
            u m4 = q4.J().m(p4.b());
            if (m4 == null) {
                i e5 = i.e();
                e5.k(str, "Skipping scheduling " + p4 + " because it's no longer in the DB");
            } else if (m4.f3835b.f()) {
                i e6 = i.e();
                e6.k(str, "Skipping scheduling " + p4 + "because it is finished.");
                q4.i();
            } else {
                long a4 = m4.a();
                if (!m4.f()) {
                    i e7 = i.e();
                    e7.a(str, "Setting up Alarms for " + p4 + "at " + a4);
                    T0.a.c(this.f6156c, q4, p4, a4);
                } else {
                    i e8 = i.e();
                    e8.a(str, "Opportunistically setting an alarm for " + p4 + "at " + a4);
                    T0.a.c(this.f6156c, q4, p4, a4);
                    dVar.f().a().execute(new d.b(dVar, a(this.f6156c), i4));
                }
                q4.B();
                q4.i();
            }
        } finally {
            q4.i();
        }
    }

    public final void l(Intent intent, d dVar) {
        List<v> list;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i4 = extras.getInt("KEY_WORKSPEC_GENERATION");
            list = new ArrayList<>(1);
            v b4 = this.f6159f.b(new m(string, i4));
            if (b4 != null) {
                list.add(b4);
            }
        } else {
            list = this.f6159f.c(string);
        }
        for (v vVar : list) {
            i e4 = i.e();
            String str = f6155g;
            e4.a(str, "Handing stopWork work for " + string);
            dVar.g().z(vVar);
            T0.a.a(this.f6156c, dVar.g().q(), vVar.a());
            dVar.d(vVar.a(), false);
        }
    }

    public boolean n() {
        boolean z4;
        synchronized (this.f6158e) {
            z4 = !this.f6157d.isEmpty();
        }
        return z4;
    }

    public void o(Intent intent, int i4, d dVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i4, dVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i4, dVar);
        } else if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            i e4 = i.e();
            String str = f6155g;
            e4.c(str, "Invalid request for " + action + " , requires " + "KEY_WORKSPEC_ID" + " .");
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i4, dVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i4, dVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, dVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i4);
        } else {
            i e5 = i.e();
            String str2 = f6155g;
            e5.k(str2, "Ignoring intent " + intent);
        }
    }
}
