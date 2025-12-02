package R0;

import Q0.d;
import Q0.l;
import Q0.s;
import Q0.t;
import Q0.u;
import Z0.u;
import Z0.v;
import Z0.z;
import a1.C0346c;
import androidx.work.impl.WorkDatabase;
import h3.C0673n;
import i3.C0737n;
import i3.C0746w;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import u3.l;
import v3.m;

public abstract class I {

    public static final class a extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ u f2469f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ E f2470g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ String f2471h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ o f2472i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(u uVar, E e4, String str, o oVar) {
            super(0);
            this.f2469f = uVar;
            this.f2470g = e4;
            this.f2471h = str;
            this.f2472i = oVar;
        }

        public final void a() {
            new C0346c(new x(this.f2470g, this.f2471h, d.KEEP, C0737n.d(this.f2469f)), this.f2472i).run();
        }

        public /* bridge */ /* synthetic */ Object c() {
            a();
            return C0673n.f9639a;
        }
    }

    public static final class b extends m implements l {

        /* renamed from: f  reason: collision with root package name */
        public static final b f2473f = new b();

        public b() {
            super(1);
        }

        /* renamed from: a */
        public final String i(Z0.u uVar) {
            v3.l.e(uVar, "spec");
            return uVar.h() ? "Periodic" : "OneTime";
        }
    }

    public static final Q0.l c(E e4, String str, u uVar) {
        v3.l.e(e4, "<this>");
        v3.l.e(str, "name");
        v3.l.e(uVar, "workRequest");
        o oVar = new o();
        e4.r().b().execute(new G(e4, str, oVar, new a(uVar, e4, str, oVar), uVar));
        return oVar;
    }

    public static final void d(E e4, String str, o oVar, u3.a aVar, u uVar) {
        String str2 = str;
        o oVar2 = oVar;
        v3.l.e(e4, "$this_enqueueUniquelyNamedPeriodic");
        v3.l.e(str2, "$name");
        v3.l.e(oVar2, "$operation");
        v3.l.e(aVar, "$enqueueNew");
        v3.l.e(uVar, "$workRequest");
        v J4 = e4.q().J();
        List h4 = J4.h(str2);
        if (h4.size() > 1) {
            e(oVar2, "Can't apply UPDATE policy to the chains of work.");
            return;
        }
        u.b bVar = (u.b) C0746w.v(h4);
        if (bVar == null) {
            aVar.c();
            return;
        }
        Z0.u m4 = J4.m(bVar.f3854a);
        if (m4 == null) {
            oVar2.a(new l.b.a(new IllegalStateException("WorkSpec with " + bVar.f3854a + ", that matches a name \"" + str2 + "\", wasn't found")));
        } else if (!m4.h()) {
            e(oVar2, "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
        } else if (bVar.f3855b == s.CANCELLED) {
            J4.a(bVar.f3854a);
            aVar.c();
        } else {
            Z0.u c4 = Z0.u.c(uVar.d(), bVar.f3854a, (s) null, (String) null, (String) null, (androidx.work.b) null, (androidx.work.b) null, 0, 0, 0, (Q0.b) null, 0, (Q0.a) null, 0, 0, 0, 0, false, (Q0.m) null, 0, 0, 1048574, (Object) null);
            try {
                r n4 = e4.n();
                v3.l.d(n4, "processor");
                WorkDatabase q4 = e4.q();
                v3.l.d(q4, "workDatabase");
                androidx.work.a j4 = e4.j();
                v3.l.d(j4, "configuration");
                List o4 = e4.o();
                v3.l.d(o4, "schedulers");
                f(n4, q4, j4, o4, c4, uVar.c());
                oVar2.a(Q0.l.f2390a);
            } catch (Throwable th) {
                oVar2.a(new l.b.a(th));
            }
        }
    }

    public static final void e(o oVar, String str) {
        oVar.a(new l.b.a(new UnsupportedOperationException(str)));
    }

    public static final t.a f(r rVar, WorkDatabase workDatabase, androidx.work.a aVar, List list, Z0.u uVar, Set set) {
        String str = uVar.f3834a;
        Z0.u m4 = workDatabase.J().m(str);
        if (m4 == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        } else if (m4.f3835b.f()) {
            return t.a.NOT_APPLIED;
        } else {
            if (!(m4.h() ^ uVar.h())) {
                boolean k4 = rVar.k(str);
                if (!k4) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((t) it.next()).a(str);
                    }
                }
                workDatabase.A(new H(workDatabase, uVar, m4, list, str, set, k4));
                if (!k4) {
                    u.b(aVar, workDatabase, list);
                }
                return k4 ? t.a.APPLIED_FOR_NEXT_RUN : t.a.APPLIED_IMMEDIATELY;
            }
            b bVar = b.f2473f;
            throw new UnsupportedOperationException("Can't update " + ((String) bVar.i(m4)) + " Worker to " + ((String) bVar.i(uVar)) + " Worker. Update operation must preserve worker's type.");
        }
    }

    public static final void g(WorkDatabase workDatabase, Z0.u uVar, Z0.u uVar2, List list, String str, Set set, boolean z4) {
        Z0.u uVar3 = uVar2;
        List list2 = list;
        String str2 = str;
        Set set2 = set;
        v3.l.e(workDatabase, "$workDatabase");
        v3.l.e(uVar, "$newWorkSpec");
        v3.l.e(uVar3, "$oldWorkSpec");
        v3.l.e(list2, "$schedulers");
        v3.l.e(str2, "$workSpecId");
        v3.l.e(set2, "$tags");
        v J4 = workDatabase.J();
        z K4 = workDatabase.K();
        v vVar = J4;
        vVar.c(a1.d.a(list2, Z0.u.c(uVar, (String) null, uVar3.f3835b, (String) null, (String) null, (androidx.work.b) null, (androidx.work.b) null, 0, 0, 0, (Q0.b) null, uVar3.f3844k, (Q0.a) null, 0, uVar3.f3847n, 0, 0, false, (Q0.m) null, 0, uVar2.d() + 1, 515069, (Object) null)));
        z zVar = K4;
        zVar.c(str2);
        zVar.b(str2, set2);
        if (!z4) {
            vVar.f(str2, -1);
            workDatabase.I().a(str2);
        }
    }
}
