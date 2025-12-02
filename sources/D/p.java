package d;

import java.util.concurrent.CopyOnWriteArrayList;
import u3.a;
import v3.l;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8641a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f8642b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public a f8643c;

    public p(boolean z4) {
        this.f8641a = z4;
    }

    public final void a(C0567c cVar) {
        l.e(cVar, "cancellable");
        this.f8642b.add(cVar);
    }

    public final a b() {
        return this.f8643c;
    }

    public abstract void c();

    public abstract void d();

    public abstract void e(C0566b bVar);

    public abstract void f(C0566b bVar);

    public final boolean g() {
        return this.f8641a;
    }

    public final void h() {
        for (C0567c cancel : this.f8642b) {
            cancel.cancel();
        }
    }

    public final void i(C0567c cVar) {
        l.e(cVar, "cancellable");
        this.f8642b.remove(cVar);
    }

    public final void j(boolean z4) {
        this.f8641a = z4;
        a aVar = this.f8643c;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final void k(a aVar) {
        this.f8643c = aVar;
    }
}
