package androidx.work.impl.background.systemalarm;

import Q0.i;
import R0.v;
import T0.b;
import V0.e;
import X0.n;
import Z0.m;
import Z0.u;
import Z0.x;
import a1.C0343C;
import a1.w;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public class c implements V0.c, C0343C.a {

    /* renamed from: o  reason: collision with root package name */
    public static final String f6165o = i.i("DelayMetCommandHandler");

    /* renamed from: c  reason: collision with root package name */
    public final Context f6166c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6167d;

    /* renamed from: e  reason: collision with root package name */
    public final m f6168e;

    /* renamed from: f  reason: collision with root package name */
    public final d f6169f;

    /* renamed from: g  reason: collision with root package name */
    public final e f6170g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f6171h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public int f6172i = 0;

    /* renamed from: j  reason: collision with root package name */
    public final Executor f6173j;

    /* renamed from: k  reason: collision with root package name */
    public final Executor f6174k;

    /* renamed from: l  reason: collision with root package name */
    public PowerManager.WakeLock f6175l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6176m = false;

    /* renamed from: n  reason: collision with root package name */
    public final v f6177n;

    public c(Context context, int i4, d dVar, v vVar) {
        this.f6166c = context;
        this.f6167d = i4;
        this.f6169f = dVar;
        this.f6168e = vVar.a();
        this.f6177n = vVar;
        n p4 = dVar.g().p();
        this.f6173j = dVar.f().b();
        this.f6174k = dVar.f().a();
        this.f6170g = new e(p4, (V0.c) this);
    }

    public void a(m mVar) {
        i e4 = i.e();
        String str = f6165o;
        e4.a(str, "Exceeded time limits on execution for " + mVar);
        this.f6173j.execute(new b(this));
    }

    public void b(List list) {
        this.f6173j.execute(new b(this));
    }

    public void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (x.a((u) it.next()).equals(this.f6168e)) {
                this.f6173j.execute(new T0.c(this));
                return;
            }
        }
    }

    public final void f() {
        synchronized (this.f6171h) {
            try {
                this.f6170g.d();
                this.f6169f.h().b(this.f6168e);
                PowerManager.WakeLock wakeLock = this.f6175l;
                if (wakeLock != null && wakeLock.isHeld()) {
                    i e4 = i.e();
                    String str = f6165o;
                    e4.a(str, "Releasing wakelock " + this.f6175l + "for WorkSpec " + this.f6168e);
                    this.f6175l.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g() {
        String b4 = this.f6168e.b();
        Context context = this.f6166c;
        this.f6175l = w.b(context, b4 + " (" + this.f6167d + ")");
        i e4 = i.e();
        String str = f6165o;
        e4.a(str, "Acquiring wakelock " + this.f6175l + "for WorkSpec " + b4);
        this.f6175l.acquire();
        u m4 = this.f6169f.g().q().J().m(b4);
        if (m4 == null) {
            this.f6173j.execute(new b(this));
            return;
        }
        boolean f4 = m4.f();
        this.f6176m = f4;
        if (!f4) {
            i e5 = i.e();
            e5.a(str, "No constraints for " + b4);
            e(Collections.singletonList(m4));
            return;
        }
        this.f6170g.a(Collections.singletonList(m4));
    }

    public void h(boolean z4) {
        i e4 = i.e();
        String str = f6165o;
        e4.a(str, "onExecuted " + this.f6168e + ", " + z4);
        f();
        if (z4) {
            this.f6174k.execute(new d.b(this.f6169f, a.e(this.f6166c, this.f6168e), this.f6167d));
        }
        if (this.f6176m) {
            this.f6174k.execute(new d.b(this.f6169f, a.a(this.f6166c), this.f6167d));
        }
    }

    public final void i() {
        if (this.f6172i == 0) {
            this.f6172i = 1;
            i e4 = i.e();
            String str = f6165o;
            e4.a(str, "onAllConstraintsMet for " + this.f6168e);
            if (this.f6169f.e().p(this.f6177n)) {
                this.f6169f.h().a(this.f6168e, 600000, this);
            } else {
                f();
            }
        } else {
            i e5 = i.e();
            String str2 = f6165o;
            e5.a(str2, "Already started work for " + this.f6168e);
        }
    }

    public final void j() {
        String b4 = this.f6168e.b();
        if (this.f6172i < 2) {
            this.f6172i = 2;
            i e4 = i.e();
            String str = f6165o;
            e4.a(str, "Stopping work for WorkSpec " + b4);
            this.f6174k.execute(new d.b(this.f6169f, a.f(this.f6166c, this.f6168e), this.f6167d));
            if (this.f6169f.e().k(this.f6168e.b())) {
                i e5 = i.e();
                e5.a(str, "WorkSpec " + b4 + " needs to be rescheduled");
                this.f6174k.execute(new d.b(this.f6169f, a.e(this.f6166c, this.f6168e), this.f6167d));
                return;
            }
            i e6 = i.e();
            e6.a(str, "Processor does not have WorkSpec " + b4 + ". No need to reschedule");
            return;
        }
        i e7 = i.e();
        String str2 = f6165o;
        e7.a(str2, "Already stopped work for " + b4);
    }
}
