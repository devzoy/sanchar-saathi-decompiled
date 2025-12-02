package V0;

import Q0.i;
import W0.a;
import W0.b;
import W0.c;
import W0.d;
import W0.f;
import W0.g;
import W0.h;
import X0.n;
import Z0.u;
import h3.C0673n;
import java.util.ArrayList;
import java.util.List;
import v3.l;

public final class e implements d, c.a {

    /* renamed from: a  reason: collision with root package name */
    public final c f2959a;

    /* renamed from: b  reason: collision with root package name */
    public final c[] f2960b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2961c;

    public e(c cVar, c[] cVarArr) {
        l.e(cVarArr, "constraintControllers");
        this.f2959a = cVar;
        this.f2960b = cVarArr;
        this.f2961c = new Object();
    }

    public void a(Iterable iterable) {
        l.e(iterable, "workSpecs");
        synchronized (this.f2961c) {
            try {
                for (c g4 : this.f2960b) {
                    g4.g((c.a) null);
                }
                for (c e4 : this.f2960b) {
                    e4.e(iterable);
                }
                for (c g5 : this.f2960b) {
                    g5.g(this);
                }
                C0673n nVar = C0673n.f9639a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(List list) {
        l.e(list, "workSpecs");
        synchronized (this.f2961c) {
            try {
                ArrayList<u> arrayList = new ArrayList<>();
                for (Object next : list) {
                    if (e(((u) next).f3834a)) {
                        arrayList.add(next);
                    }
                }
                for (u uVar : arrayList) {
                    i e4 = i.e();
                    String a4 = f.f2962a;
                    e4.a(a4, "Constraints met for " + uVar);
                }
                c cVar = this.f2959a;
                if (cVar != null) {
                    cVar.e(arrayList);
                    C0673n nVar = C0673n.f9639a;
                }
            } finally {
            }
        }
    }

    public void c(List list) {
        l.e(list, "workSpecs");
        synchronized (this.f2961c) {
            c cVar = this.f2959a;
            if (cVar != null) {
                cVar.b(list);
                C0673n nVar = C0673n.f9639a;
            }
        }
    }

    public void d() {
        synchronized (this.f2961c) {
            try {
                for (c f4 : this.f2960b) {
                    f4.f();
                }
                C0673n nVar = C0673n.f9639a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(String str) {
        boolean z4;
        c cVar;
        l.e(str, "workSpecId");
        synchronized (this.f2961c) {
            try {
                c[] cVarArr = this.f2960b;
                int length = cVarArr.length;
                z4 = false;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        cVar = null;
                        break;
                    }
                    cVar = cVarArr[i4];
                    if (cVar.d(str)) {
                        break;
                    }
                    i4++;
                }
                if (cVar != null) {
                    i.e().a(f.f2962a, "Work " + str + " constrained by " + cVar.getClass().getSimpleName());
                }
                if (cVar == null) {
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(n nVar, c cVar) {
        this(cVar, new c[]{new a(nVar.a()), new b(nVar.b()), new h(nVar.d()), new d(nVar.c()), new g(nVar.c()), new f(nVar.c()), new W0.e(nVar.c())});
        l.e(nVar, "trackers");
    }
}
