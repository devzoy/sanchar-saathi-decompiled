package n3;

import h3.C0667h;
import h3.C0668i;
import java.io.Serializable;
import l3.e;
import m3.C0795c;
import v3.l;

/* renamed from: n3.a  reason: case insensitive filesystem */
public abstract class C0807a implements e, e, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public final e f11267e;

    public C0807a(e eVar) {
        this.f11267e = eVar;
    }

    public e j(Object obj, e eVar) {
        l.e(eVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public e l() {
        e eVar = this.f11267e;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    public final e m() {
        return this.f11267e;
    }

    public StackTraceElement n() {
        return g.d(this);
    }

    public abstract Object o(Object obj);

    public void p() {
    }

    public final void q(Object obj) {
        e eVar = this;
        while (true) {
            h.b(eVar);
            C0807a aVar = (C0807a) eVar;
            e eVar2 = aVar.f11267e;
            l.b(eVar2);
            try {
                Object o4 = aVar.o(obj);
                if (o4 != C0795c.c()) {
                    obj = C0667h.a(o4);
                    aVar.p();
                    if (eVar2 instanceof C0807a) {
                        eVar = eVar2;
                    } else {
                        eVar2.q(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                C0667h.a aVar2 = C0667h.f9633e;
                obj = C0667h.a(C0668i.a(th));
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object n4 = n();
        if (n4 == null) {
            n4 = getClass().getName();
        }
        sb.append(n4);
        return sb.toString();
    }
}
