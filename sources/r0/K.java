package R0;

import Q0.g;
import Q0.i;
import Q0.s;
import Z0.C0336b;
import Z0.m;
import Z0.u;
import Z0.v;
import Z0.x;
import a1.C0341A;
import a1.C0342B;
import a1.p;
import a1.z;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import b1.C0392c;
import c1.C0403b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import y2.C1007a;

public class K implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public static final String f2476w = i.i("WorkerWrapper");

    /* renamed from: e  reason: collision with root package name */
    public Context f2477e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2478f;

    /* renamed from: g  reason: collision with root package name */
    public List f2479g;

    /* renamed from: h  reason: collision with root package name */
    public WorkerParameters.a f2480h;

    /* renamed from: i  reason: collision with root package name */
    public u f2481i;

    /* renamed from: j  reason: collision with root package name */
    public androidx.work.c f2482j;

    /* renamed from: k  reason: collision with root package name */
    public C0403b f2483k;

    /* renamed from: l  reason: collision with root package name */
    public c.a f2484l = c.a.a();

    /* renamed from: m  reason: collision with root package name */
    public androidx.work.a f2485m;

    /* renamed from: n  reason: collision with root package name */
    public Y0.a f2486n;

    /* renamed from: o  reason: collision with root package name */
    public WorkDatabase f2487o;

    /* renamed from: p  reason: collision with root package name */
    public v f2488p;

    /* renamed from: q  reason: collision with root package name */
    public C0336b f2489q;

    /* renamed from: r  reason: collision with root package name */
    public List f2490r;

    /* renamed from: s  reason: collision with root package name */
    public String f2491s;

    /* renamed from: t  reason: collision with root package name */
    public C0392c f2492t = C0392c.t();

    /* renamed from: u  reason: collision with root package name */
    public final C0392c f2493u = C0392c.t();

    /* renamed from: v  reason: collision with root package name */
    public volatile boolean f2494v;

    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ C1007a f2495e;

        public a(C1007a aVar) {
            this.f2495e = aVar;
        }

        public void run() {
            if (!K.this.f2493u.isCancelled()) {
                try {
                    this.f2495e.get();
                    i e4 = i.e();
                    String str = K.f2476w;
                    e4.a(str, "Starting work for " + K.this.f2481i.f3836c);
                    K k4 = K.this;
                    k4.f2493u.r(k4.f2482j.m());
                } catch (Throwable th) {
                    K.this.f2493u.q(th);
                }
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f2497e;

        public b(String str) {
            this.f2497e = str;
        }

        public void run() {
            try {
                c.a aVar = (c.a) K.this.f2493u.get();
                if (aVar == null) {
                    i e4 = i.e();
                    String str = K.f2476w;
                    e4.c(str, K.this.f2481i.f3836c + " returned a null result. Treating it as a failure.");
                } else {
                    i e5 = i.e();
                    String str2 = K.f2476w;
                    e5.a(str2, K.this.f2481i.f3836c + " returned a " + aVar + ".");
                    K.this.f2484l = aVar;
                }
            } catch (CancellationException e6) {
                i e7 = i.e();
                String str3 = K.f2476w;
                e7.g(str3, this.f2497e + " was cancelled", e6);
            } catch (InterruptedException e8) {
                e = e8;
                i e9 = i.e();
                String str4 = K.f2476w;
                e9.d(str4, this.f2497e + " failed because it threw an exception/error", e);
            } catch (ExecutionException e10) {
                e = e10;
                i e92 = i.e();
                String str42 = K.f2476w;
                e92.d(str42, this.f2497e + " failed because it threw an exception/error", e);
            } catch (Throwable th) {
                K.this.j();
                throw th;
            }
            K.this.j();
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public Context f2499a;

        /* renamed from: b  reason: collision with root package name */
        public androidx.work.c f2500b;

        /* renamed from: c  reason: collision with root package name */
        public Y0.a f2501c;

        /* renamed from: d  reason: collision with root package name */
        public C0403b f2502d;

        /* renamed from: e  reason: collision with root package name */
        public androidx.work.a f2503e;

        /* renamed from: f  reason: collision with root package name */
        public WorkDatabase f2504f;

        /* renamed from: g  reason: collision with root package name */
        public u f2505g;

        /* renamed from: h  reason: collision with root package name */
        public List f2506h;

        /* renamed from: i  reason: collision with root package name */
        public final List f2507i;

        /* renamed from: j  reason: collision with root package name */
        public WorkerParameters.a f2508j = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, C0403b bVar, Y0.a aVar2, WorkDatabase workDatabase, u uVar, List list) {
            this.f2499a = context.getApplicationContext();
            this.f2502d = bVar;
            this.f2501c = aVar2;
            this.f2503e = aVar;
            this.f2504f = workDatabase;
            this.f2505g = uVar;
            this.f2507i = list;
        }

        public K b() {
            return new K(this);
        }

        public c c(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f2508j = aVar;
            }
            return this;
        }

        public c d(List list) {
            this.f2506h = list;
            return this;
        }
    }

    public K(c cVar) {
        this.f2477e = cVar.f2499a;
        this.f2483k = cVar.f2502d;
        this.f2486n = cVar.f2501c;
        u uVar = cVar.f2505g;
        this.f2481i = uVar;
        this.f2478f = uVar.f3834a;
        this.f2479g = cVar.f2506h;
        this.f2480h = cVar.f2508j;
        this.f2482j = cVar.f2500b;
        this.f2485m = cVar.f2503e;
        WorkDatabase workDatabase = cVar.f2504f;
        this.f2487o = workDatabase;
        this.f2488p = workDatabase.J();
        this.f2489q = this.f2487o.E();
        this.f2490r = cVar.f2507i;
    }

    public final String b(List list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f2478f);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    public C1007a c() {
        return this.f2492t;
    }

    public m d() {
        return x.a(this.f2481i);
    }

    public u e() {
        return this.f2481i;
    }

    public final void f(c.a aVar) {
        if (aVar instanceof c.a.C0106c) {
            i e4 = i.e();
            String str = f2476w;
            e4.f(str, "Worker result SUCCESS for " + this.f2491s);
            if (this.f2481i.h()) {
                l();
            } else {
                q();
            }
        } else if (aVar instanceof c.a.b) {
            i e5 = i.e();
            String str2 = f2476w;
            e5.f(str2, "Worker result RETRY for " + this.f2491s);
            k();
        } else {
            i e6 = i.e();
            String str3 = f2476w;
            e6.f(str3, "Worker result FAILURE for " + this.f2491s);
            if (this.f2481i.h()) {
                l();
            } else {
                p();
            }
        }
    }

    public void g() {
        this.f2494v = true;
        r();
        this.f2493u.cancel(true);
        if (this.f2482j == null || !this.f2493u.isCancelled()) {
            i.e().a(f2476w, "WorkSpec " + this.f2481i + " is already done. Not interrupting.");
            return;
        }
        this.f2482j.n();
    }

    public final void h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f2488p.k(str2) != s.CANCELLED) {
                this.f2488p.n(s.FAILED, str2);
            }
            linkedList.addAll(this.f2489q.c(str2));
        }
    }

    public final /* synthetic */ void i(C1007a aVar) {
        if (this.f2493u.isCancelled()) {
            aVar.cancel(true);
        }
    }

    public void j() {
        if (!r()) {
            this.f2487o.e();
            try {
                s k4 = this.f2488p.k(this.f2478f);
                this.f2487o.I().a(this.f2478f);
                if (k4 == null) {
                    m(false);
                } else if (k4 == s.RUNNING) {
                    f(this.f2484l);
                } else if (!k4.f()) {
                    k();
                }
                this.f2487o.B();
                this.f2487o.i();
            } catch (Throwable th) {
                this.f2487o.i();
                throw th;
            }
        }
        List<t> list = this.f2479g;
        if (list != null) {
            for (t a4 : list) {
                a4.a(this.f2478f);
            }
            u.b(this.f2485m, this.f2487o, this.f2479g);
        }
    }

    public final void k() {
        this.f2487o.e();
        try {
            this.f2488p.n(s.ENQUEUED, this.f2478f);
            this.f2488p.p(this.f2478f, System.currentTimeMillis());
            this.f2488p.f(this.f2478f, -1);
            this.f2487o.B();
        } finally {
            this.f2487o.i();
            m(true);
        }
    }

    public final void l() {
        this.f2487o.e();
        try {
            this.f2488p.p(this.f2478f, System.currentTimeMillis());
            this.f2488p.n(s.ENQUEUED, this.f2478f);
            this.f2488p.o(this.f2478f);
            this.f2488p.d(this.f2478f);
            this.f2488p.f(this.f2478f, -1);
            this.f2487o.B();
        } finally {
            this.f2487o.i();
            m(false);
        }
    }

    public final void m(boolean z4) {
        this.f2487o.e();
        try {
            if (!this.f2487o.J().e()) {
                p.a(this.f2477e, RescheduleReceiver.class, false);
            }
            if (z4) {
                this.f2488p.n(s.ENQUEUED, this.f2478f);
                this.f2488p.f(this.f2478f, -1);
            }
            if (!(this.f2481i == null || this.f2482j == null || !this.f2486n.c(this.f2478f))) {
                this.f2486n.a(this.f2478f);
            }
            this.f2487o.B();
            this.f2487o.i();
            this.f2492t.p(Boolean.valueOf(z4));
        } catch (Throwable th) {
            this.f2487o.i();
            throw th;
        }
    }

    public final void n() {
        s k4 = this.f2488p.k(this.f2478f);
        if (k4 == s.RUNNING) {
            i e4 = i.e();
            String str = f2476w;
            e4.a(str, "Status for " + this.f2478f + " is RUNNING; not doing any work and rescheduling for later execution");
            m(true);
            return;
        }
        i e5 = i.e();
        String str2 = f2476w;
        e5.a(str2, "Status for " + this.f2478f + " is " + k4 + " ; not doing any work");
        m(false);
    }

    public final void o() {
        androidx.work.b b4;
        if (!r()) {
            this.f2487o.e();
            try {
                u uVar = this.f2481i;
                if (uVar.f3835b != s.ENQUEUED) {
                    n();
                    this.f2487o.B();
                    i e4 = i.e();
                    String str = f2476w;
                    e4.a(str, this.f2481i.f3836c + " is not in ENQUEUED state. Nothing more to do");
                } else if ((uVar.h() || this.f2481i.g()) && System.currentTimeMillis() < this.f2481i.a()) {
                    i.e().a(f2476w, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f2481i.f3836c}));
                    m(true);
                    this.f2487o.B();
                    this.f2487o.i();
                } else {
                    this.f2487o.B();
                    this.f2487o.i();
                    if (this.f2481i.h()) {
                        b4 = this.f2481i.f3838e;
                    } else {
                        g b5 = this.f2485m.f().b(this.f2481i.f3837d);
                        if (b5 == null) {
                            i e5 = i.e();
                            String str2 = f2476w;
                            e5.c(str2, "Could not create Input Merger " + this.f2481i.f3837d);
                            p();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f2481i.f3838e);
                        arrayList.addAll(this.f2488p.q(this.f2478f));
                        b4 = b5.b(arrayList);
                    }
                    androidx.work.b bVar = b4;
                    UUID fromString = UUID.fromString(this.f2478f);
                    List list = this.f2490r;
                    WorkerParameters.a aVar = this.f2480h;
                    u uVar2 = this.f2481i;
                    WorkerParameters workerParameters = new WorkerParameters(fromString, bVar, list, aVar, uVar2.f3844k, uVar2.d(), this.f2485m.d(), this.f2483k, this.f2485m.n(), new C0342B(this.f2487o, this.f2483k), new C0341A(this.f2487o, this.f2486n, this.f2483k));
                    if (this.f2482j == null) {
                        this.f2482j = this.f2485m.n().b(this.f2477e, this.f2481i.f3836c, workerParameters);
                    }
                    androidx.work.c cVar = this.f2482j;
                    if (cVar == null) {
                        i e6 = i.e();
                        String str3 = f2476w;
                        e6.c(str3, "Could not create Worker " + this.f2481i.f3836c);
                        p();
                    } else if (cVar.j()) {
                        i e7 = i.e();
                        String str4 = f2476w;
                        e7.c(str4, "Received an already-used Worker " + this.f2481i.f3836c + "; Worker Factory should return new instances");
                        p();
                    } else {
                        this.f2482j.l();
                        if (!s()) {
                            n();
                        } else if (!r()) {
                            z zVar = new z(this.f2477e, this.f2481i, this.f2482j, workerParameters.b(), this.f2483k);
                            this.f2483k.a().execute(zVar);
                            C1007a b6 = zVar.b();
                            this.f2493u.a(new J(this, b6), new a1.v());
                            b6.a(new a(b6), this.f2483k.a());
                            this.f2493u.a(new b(this.f2491s), this.f2483k.b());
                        }
                    }
                }
            } finally {
                this.f2487o.i();
            }
        }
    }

    public void p() {
        this.f2487o.e();
        try {
            h(this.f2478f);
            this.f2488p.u(this.f2478f, ((c.a.C0105a) this.f2484l).e());
            this.f2487o.B();
        } finally {
            this.f2487o.i();
            m(false);
        }
    }

    public final void q() {
        this.f2487o.e();
        try {
            this.f2488p.n(s.SUCCEEDED, this.f2478f);
            this.f2488p.u(this.f2478f, ((c.a.C0106c) this.f2484l).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f2489q.c(this.f2478f)) {
                if (this.f2488p.k(str) == s.BLOCKED && this.f2489q.a(str)) {
                    i e4 = i.e();
                    String str2 = f2476w;
                    e4.f(str2, "Setting status to enqueued for " + str);
                    this.f2488p.n(s.ENQUEUED, str);
                    this.f2488p.p(str, currentTimeMillis);
                }
            }
            this.f2487o.B();
            this.f2487o.i();
            m(false);
        } catch (Throwable th) {
            this.f2487o.i();
            m(false);
            throw th;
        }
    }

    public final boolean r() {
        if (!this.f2494v) {
            return false;
        }
        i e4 = i.e();
        String str = f2476w;
        e4.a(str, "Work interrupted for " + this.f2491s);
        s k4 = this.f2488p.k(this.f2478f);
        if (k4 == null) {
            m(false);
        } else {
            m(!k4.f());
        }
        return true;
    }

    public void run() {
        this.f2491s = b(this.f2490r);
        o();
    }

    public final boolean s() {
        boolean z4;
        this.f2487o.e();
        try {
            if (this.f2488p.k(this.f2478f) == s.ENQUEUED) {
                this.f2488p.n(s.RUNNING, this.f2478f);
                this.f2488p.r(this.f2478f);
                z4 = true;
            } else {
                z4 = false;
            }
            this.f2487o.B();
            this.f2487o.i();
            return z4;
        } catch (Throwable th) {
            this.f2487o.i();
            throw th;
        }
    }
}
