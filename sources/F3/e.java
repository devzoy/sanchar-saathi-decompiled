package F3;

import D3.C0232a;
import D3.q0;
import D3.w0;
import java.util.concurrent.CancellationException;
import l3.i;
import u3.l;

public abstract class e extends C0232a implements d {

    /* renamed from: h  reason: collision with root package name */
    public final d f1078h;

    public e(i iVar, d dVar, boolean z4, boolean z5) {
        super(iVar, z4, z5);
        this.f1078h = dVar;
    }

    public void A(l lVar) {
        this.f1078h.A(lVar);
    }

    public Object C() {
        return this.f1078h.C();
    }

    public Object E(Object obj) {
        return this.f1078h.E(obj);
    }

    public boolean G() {
        return this.f1078h.G();
    }

    public final d T0() {
        return this.f1078h;
    }

    public void U(Throwable th) {
        CancellationException I02 = w0.I0(this, th, (String) null, 1, (Object) null);
        this.f1078h.c(I02);
        S(I02);
    }

    public final void c(CancellationException cancellationException) {
        if (!o0()) {
            if (cancellationException == null) {
                cancellationException = new q0(X(), (Throwable) null, this);
            }
            U(cancellationException);
        }
    }

    public Object f(l3.e eVar) {
        return this.f1078h.f(eVar);
    }

    public f iterator() {
        return this.f1078h.iterator();
    }

    public Object n(Object obj, l3.e eVar) {
        return this.f1078h.n(obj, eVar);
    }

    public boolean o(Throwable th) {
        return this.f1078h.o(th);
    }
}
