package W0;

import X0.h;
import Z0.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import v3.l;

public abstract class c implements V0.a {

    /* renamed from: a  reason: collision with root package name */
    public final h f3387a;

    /* renamed from: b  reason: collision with root package name */
    public final List f3388b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final List f3389c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public Object f3390d;

    /* renamed from: e  reason: collision with root package name */
    public a f3391e;

    public interface a {
        void b(List list);

        void c(List list);
    }

    public c(h hVar) {
        l.e(hVar, "tracker");
        this.f3387a = hVar;
    }

    public void a(Object obj) {
        this.f3390d = obj;
        h(this.f3391e, obj);
    }

    public abstract boolean b(u uVar);

    public abstract boolean c(Object obj);

    public final boolean d(String str) {
        l.e(str, "workSpecId");
        Object obj = this.f3390d;
        return obj != null && c(obj) && this.f3389c.contains(str);
    }

    public final void e(Iterable iterable) {
        l.e(iterable, "workSpecs");
        this.f3388b.clear();
        this.f3389c.clear();
        Collection collection = this.f3388b;
        for (Object next : iterable) {
            if (b((u) next)) {
                collection.add(next);
            }
        }
        Collection collection2 = this.f3389c;
        for (u uVar : this.f3388b) {
            collection2.add(uVar.f3834a);
        }
        if (this.f3388b.isEmpty()) {
            this.f3387a.f(this);
        } else {
            this.f3387a.c(this);
        }
        h(this.f3391e, this.f3390d);
    }

    public final void f() {
        if (!this.f3388b.isEmpty()) {
            this.f3388b.clear();
            this.f3387a.f(this);
        }
    }

    public final void g(a aVar) {
        if (this.f3391e != aVar) {
            this.f3391e = aVar;
            h(aVar, this.f3390d);
        }
    }

    public final void h(a aVar, Object obj) {
        if (!this.f3388b.isEmpty() && aVar != null) {
            if (obj == null || c(obj)) {
                aVar.c(this.f3388b);
            } else {
                aVar.b(this.f3388b);
            }
        }
    }
}
