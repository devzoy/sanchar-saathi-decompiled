package S0;

import Q0.i;
import Q0.s;
import R0.C0303e;
import R0.E;
import R0.t;
import R0.v;
import R0.w;
import V0.c;
import V0.d;
import V0.e;
import X0.n;
import Z0.m;
import Z0.u;
import Z0.x;
import a1.r;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class b implements t, c, C0303e {

    /* renamed from: l  reason: collision with root package name */
    public static final String f2724l = i.i("GreedyScheduler");

    /* renamed from: c  reason: collision with root package name */
    public final Context f2725c;

    /* renamed from: d  reason: collision with root package name */
    public final E f2726d;

    /* renamed from: e  reason: collision with root package name */
    public final d f2727e;

    /* renamed from: f  reason: collision with root package name */
    public final Set f2728f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    public a f2729g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2730h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f2731i;

    /* renamed from: j  reason: collision with root package name */
    public final w f2732j = new w();

    /* renamed from: k  reason: collision with root package name */
    public Boolean f2733k;

    public b(Context context, a aVar, n nVar, E e4) {
        this.f2725c = context;
        this.f2726d = e4;
        this.f2727e = new e(nVar, (c) this);
        this.f2729g = new a(this, aVar.k());
        this.f2731i = new Object();
    }

    public void a(String str) {
        if (this.f2733k == null) {
            g();
        }
        if (!this.f2733k.booleanValue()) {
            i.e().f(f2724l, "Ignoring schedule request in non-main process");
            return;
        }
        h();
        i e4 = i.e();
        String str2 = f2724l;
        e4.a(str2, "Cancelling work ID " + str);
        a aVar = this.f2729g;
        if (aVar != null) {
            aVar.b(str);
        }
        for (v z4 : this.f2732j.c(str)) {
            this.f2726d.z(z4);
        }
    }

    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m a4 = x.a((u) it.next());
            i e4 = i.e();
            String str = f2724l;
            e4.a(str, "Constraints not met: Cancelling work ID " + a4);
            v b4 = this.f2732j.b(a4);
            if (b4 != null) {
                this.f2726d.z(b4);
            }
        }
    }

    public void c(u... uVarArr) {
        if (this.f2733k == null) {
            g();
        }
        if (!this.f2733k.booleanValue()) {
            i.e().f(f2724l, "Ignoring schedule request in a secondary process");
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (u uVar : uVarArr) {
            if (!this.f2732j.a(x.a(uVar))) {
                long a4 = uVar.a();
                long currentTimeMillis = System.currentTimeMillis();
                if (uVar.f3835b == s.ENQUEUED) {
                    if (currentTimeMillis < a4) {
                        a aVar = this.f2729g;
                        if (aVar != null) {
                            aVar.a(uVar);
                        }
                    } else if (uVar.f()) {
                        if (uVar.f3843j.h()) {
                            i.e().a(f2724l, "Ignoring " + uVar + ". Requires device idle.");
                        } else if (uVar.f3843j.e()) {
                            i.e().a(f2724l, "Ignoring " + uVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(uVar);
                            hashSet2.add(uVar.f3834a);
                        }
                    } else if (!this.f2732j.a(x.a(uVar))) {
                        i.e().a(f2724l, "Starting work for " + uVar.f3834a);
                        this.f2726d.w(this.f2732j.e(uVar));
                    }
                }
            }
        }
        synchronized (this.f2731i) {
            try {
                if (!hashSet.isEmpty()) {
                    String join = TextUtils.join(",", hashSet2);
                    i.e().a(f2724l, "Starting tracking for " + join);
                    this.f2728f.addAll(hashSet);
                    this.f2727e.a(this.f2728f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(m mVar, boolean z4) {
        this.f2732j.b(mVar);
        i(mVar);
    }

    public void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m a4 = x.a((u) it.next());
            if (!this.f2732j.a(a4)) {
                i e4 = i.e();
                String str = f2724l;
                e4.a(str, "Constraints met: Scheduling work ID " + a4);
                this.f2726d.w(this.f2732j.d(a4));
            }
        }
    }

    public boolean f() {
        return false;
    }

    public final void g() {
        this.f2733k = Boolean.valueOf(r.b(this.f2725c, this.f2726d.j()));
    }

    public final void h() {
        if (!this.f2730h) {
            this.f2726d.n().g(this);
            this.f2730h = true;
        }
    }

    public final void i(m mVar) {
        synchronized (this.f2731i) {
            try {
                Iterator it = this.f2728f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    u uVar = (u) it.next();
                    if (x.a(uVar).equals(mVar)) {
                        i e4 = i.e();
                        String str = f2724l;
                        e4.a(str, "Stopping tracking for " + mVar);
                        this.f2728f.remove(uVar);
                        this.f2727e.a(this.f2728f);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
