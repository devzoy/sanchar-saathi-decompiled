package R0;

import Q0.i;
import U0.c;
import Z0.v;
import a1.p;
import android.content.Context;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;

public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2546a = i.i("Schedulers");

    public static t a(Context context, E e4) {
        c cVar = new c(context, e4);
        p.a(context, SystemJobService.class, true);
        i.e().a(f2546a, "Created SystemJobScheduler and enabled SystemJobService");
        return cVar;
    }

    public static void b(a aVar, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            v J4 = workDatabase.J();
            workDatabase.e();
            try {
                List<Z0.u> l4 = J4.l(aVar.h());
                List t4 = J4.t(200);
                if (l4 != null && l4.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (Z0.u uVar : l4) {
                        J4.f(uVar.f3834a, currentTimeMillis);
                    }
                }
                workDatabase.B();
                workDatabase.i();
                if (l4 != null && l4.size() > 0) {
                    Z0.u[] uVarArr = (Z0.u[]) l4.toArray(new Z0.u[l4.size()]);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        t tVar = (t) it.next();
                        if (tVar.f()) {
                            tVar.c(uVarArr);
                        }
                    }
                }
                if (t4 != null && t4.size() > 0) {
                    Z0.u[] uVarArr2 = (Z0.u[]) t4.toArray(new Z0.u[t4.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        t tVar2 = (t) it2.next();
                        if (!tVar2.f()) {
                            tVar2.c(uVarArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.i();
                throw th;
            }
        }
    }
}
