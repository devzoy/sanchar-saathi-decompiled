package R0;

import Q0.d;
import Q0.i;
import Q0.l;
import Q0.p;
import Q0.t;
import S0.b;
import X0.n;
import Z0.m;
import a1.C0345b;
import a1.q;
import a1.u;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import c1.C0403b;
import c1.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class E extends t {

    /* renamed from: k  reason: collision with root package name */
    public static final String f2442k = i.i("WorkManagerImpl");

    /* renamed from: l  reason: collision with root package name */
    public static E f2443l = null;

    /* renamed from: m  reason: collision with root package name */
    public static E f2444m = null;

    /* renamed from: n  reason: collision with root package name */
    public static final Object f2445n = new Object();

    /* renamed from: a  reason: collision with root package name */
    public Context f2446a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.work.a f2447b;

    /* renamed from: c  reason: collision with root package name */
    public WorkDatabase f2448c;

    /* renamed from: d  reason: collision with root package name */
    public C0403b f2449d;

    /* renamed from: e  reason: collision with root package name */
    public List f2450e;

    /* renamed from: f  reason: collision with root package name */
    public r f2451f;

    /* renamed from: g  reason: collision with root package name */
    public q f2452g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2453h;

    /* renamed from: i  reason: collision with root package name */
    public BroadcastReceiver.PendingResult f2454i;

    /* renamed from: j  reason: collision with root package name */
    public final n f2455j;

    public static class a {
        public static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public E(Context context, androidx.work.a aVar, C0403b bVar) {
        this(context, aVar, bVar, context.getResources().getBoolean(p.f2397a));
    }

    public static void e(Context context, androidx.work.a aVar) {
        synchronized (f2445n) {
            try {
                E e4 = f2443l;
                if (e4 != null) {
                    if (f2444m != null) {
                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                }
                if (e4 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f2444m == null) {
                        f2444m = new E(applicationContext, aVar, new c(aVar.m()));
                    }
                    f2443l = f2444m;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static E k() {
        synchronized (f2445n) {
            try {
                E e4 = f2443l;
                if (e4 != null) {
                    return e4;
                }
                E e5 = f2444m;
                return e5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static E l(Context context) {
        E k4;
        synchronized (f2445n) {
            try {
                k4 = k();
                if (k4 == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k4;
    }

    public l b(List list) {
        if (!list.isEmpty()) {
            return new x(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public l c(String str, Q0.c cVar, Q0.n nVar) {
        return cVar == Q0.c.UPDATE ? I.c(this, str, nVar) : h(str, cVar, nVar).a();
    }

    public l f(UUID uuid) {
        C0345b b4 = C0345b.b(uuid, this);
        this.f2449d.c(b4);
        return b4.d();
    }

    public List g(Context context, androidx.work.a aVar, n nVar) {
        return Arrays.asList(new t[]{u.a(context, this), new b(context, aVar, nVar, this)});
    }

    public x h(String str, Q0.c cVar, Q0.n nVar) {
        return new x(this, str, cVar == Q0.c.KEEP ? d.KEEP : d.REPLACE, Collections.singletonList(nVar));
    }

    public Context i() {
        return this.f2446a;
    }

    public androidx.work.a j() {
        return this.f2447b;
    }

    public q m() {
        return this.f2452g;
    }

    public r n() {
        return this.f2451f;
    }

    public List o() {
        return this.f2450e;
    }

    public n p() {
        return this.f2455j;
    }

    public WorkDatabase q() {
        return this.f2448c;
    }

    public C0403b r() {
        return this.f2449d;
    }

    public final void s(Context context, androidx.work.a aVar, C0403b bVar, WorkDatabase workDatabase, List list, r rVar) {
        Context applicationContext = context.getApplicationContext();
        this.f2446a = applicationContext;
        this.f2447b = aVar;
        this.f2449d = bVar;
        this.f2448c = workDatabase;
        this.f2450e = list;
        this.f2451f = rVar;
        this.f2452g = new q(workDatabase);
        this.f2453h = false;
        if (!a.a(applicationContext)) {
            this.f2449d.c(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public void t() {
        synchronized (f2445n) {
            try {
                this.f2453h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f2454i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f2454i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u() {
        U0.c.b(i());
        q().J().v();
        u.b(j(), q(), o());
    }

    public void v(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f2445n) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f2454i;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f2454i = pendingResult;
                if (this.f2453h) {
                    pendingResult.finish();
                    this.f2454i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void w(v vVar) {
        x(vVar, (WorkerParameters.a) null);
    }

    public void x(v vVar, WorkerParameters.a aVar) {
        this.f2449d.c(new a1.t(this, vVar, aVar));
    }

    public void y(m mVar) {
        this.f2449d.c(new u(this, new v(mVar), true));
    }

    public void z(v vVar) {
        this.f2449d.c(new u(this, vVar, false));
    }

    public E(Context context, androidx.work.a aVar, C0403b bVar, boolean z4) {
        this(context, aVar, bVar, WorkDatabase.D(context.getApplicationContext(), bVar.b(), z4));
    }

    public E(Context context, androidx.work.a aVar, C0403b bVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        i.h(new i.a(aVar.j()));
        n nVar = new n(applicationContext, bVar);
        this.f2455j = nVar;
        Context context2 = context;
        androidx.work.a aVar2 = aVar;
        C0403b bVar2 = bVar;
        WorkDatabase workDatabase2 = workDatabase;
        List g4 = g(applicationContext, aVar, nVar);
        s(context2, aVar2, bVar2, workDatabase2, g4, new r(context2, aVar2, bVar2, workDatabase2, g4));
    }
}
