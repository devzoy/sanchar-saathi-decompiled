package androidx.work.impl.workers;

import Q0.i;
import R0.E;
import V0.e;
import X0.n;
import Z0.u;
import Z0.v;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import b1.C0392c;
import d1.C0570a;
import d1.C0571b;
import d1.C0572c;
import h3.C0673n;
import i3.C0737n;
import java.util.List;
import v3.l;
import y2.C1007a;

public final class ConstraintTrackingWorker extends c implements V0.c {

    /* renamed from: g  reason: collision with root package name */
    public final WorkerParameters f6234g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f6235h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f6236i;

    /* renamed from: j  reason: collision with root package name */
    public final C0392c f6237j = C0392c.t();

    /* renamed from: k  reason: collision with root package name */
    public c f6238k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.e(context, "appContext");
        l.e(workerParameters, "workerParameters");
        this.f6234g = workerParameters;
    }

    public static final void r(ConstraintTrackingWorker constraintTrackingWorker, C1007a aVar) {
        l.e(constraintTrackingWorker, "this$0");
        l.e(aVar, "$innerFuture");
        synchronized (constraintTrackingWorker.f6235h) {
            try {
                if (constraintTrackingWorker.f6236i) {
                    C0392c cVar = constraintTrackingWorker.f6237j;
                    l.d(cVar, "future");
                    boolean unused = C0572c.e(cVar);
                } else {
                    constraintTrackingWorker.f6237j.r(aVar);
                }
                C0673n nVar = C0673n.f9639a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void s(ConstraintTrackingWorker constraintTrackingWorker) {
        l.e(constraintTrackingWorker, "this$0");
        constraintTrackingWorker.q();
    }

    public void b(List list) {
        l.e(list, "workSpecs");
        i e4 = i.e();
        String a4 = C0572c.f8675a;
        e4.a(a4, "Constraints changed for " + list);
        synchronized (this.f6235h) {
            this.f6236i = true;
            C0673n nVar = C0673n.f9639a;
        }
    }

    public void e(List list) {
        l.e(list, "workSpecs");
    }

    public void k() {
        super.k();
        c cVar = this.f6238k;
        if (cVar != null && !cVar.i()) {
            cVar.n();
        }
    }

    public C1007a m() {
        c().execute(new C0570a(this));
        C0392c cVar = this.f6237j;
        l.d(cVar, "future");
        return cVar;
    }

    public final void q() {
        if (!this.f6237j.isCancelled()) {
            String i4 = g().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            i e4 = i.e();
            l.d(e4, "get()");
            if (i4 == null || i4.length() == 0) {
                e4.c(C0572c.f8675a, "No worker to delegate to.");
                C0392c cVar = this.f6237j;
                l.d(cVar, "future");
                boolean unused = C0572c.d(cVar);
                return;
            }
            c b4 = h().b(a(), i4, this.f6234g);
            this.f6238k = b4;
            if (b4 == null) {
                e4.a(C0572c.f8675a, "No worker to delegate to.");
                C0392c cVar2 = this.f6237j;
                l.d(cVar2, "future");
                boolean unused2 = C0572c.d(cVar2);
                return;
            }
            E l4 = E.l(a());
            l.d(l4, "getInstance(applicationContext)");
            v J4 = l4.q().J();
            String uuid = f().toString();
            l.d(uuid, "id.toString()");
            u m4 = J4.m(uuid);
            if (m4 == null) {
                C0392c cVar3 = this.f6237j;
                l.d(cVar3, "future");
                boolean unused3 = C0572c.d(cVar3);
                return;
            }
            n p4 = l4.p();
            l.d(p4, "workManagerImpl.trackers");
            e eVar = new e(p4, (V0.c) this);
            eVar.a(C0737n.d(m4));
            String uuid2 = f().toString();
            l.d(uuid2, "id.toString()");
            if (eVar.e(uuid2)) {
                String a4 = C0572c.f8675a;
                e4.a(a4, "Constraints met for delegate " + i4);
                try {
                    c cVar4 = this.f6238k;
                    l.b(cVar4);
                    C1007a m5 = cVar4.m();
                    l.d(m5, "delegate!!.startWork()");
                    m5.a(new C0571b(this, m5), c());
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                String a5 = C0572c.f8675a;
                e4.a(a5, "Constraints not met for delegate " + i4 + ". Requesting retry.");
                C0392c cVar5 = this.f6237j;
                l.d(cVar5, "future");
                boolean unused4 = C0572c.e(cVar5);
            }
        }
    }
}
