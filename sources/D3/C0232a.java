package D3;

import l3.e;
import l3.i;
import u3.l;
import u3.p;

/* renamed from: D3.a  reason: case insensitive filesystem */
public abstract class C0232a extends w0 implements p0, e, I {

    /* renamed from: g  reason: collision with root package name */
    public final i f811g;

    public C0232a(i iVar, boolean z4, boolean z5) {
        super(z5);
        if (z4) {
            n0((p0) iVar.d(p0.f838b));
        }
        this.f811g = iVar.h(this);
    }

    public void P0(Object obj) {
        P(obj);
    }

    public void Q0(Throwable th, boolean z4) {
    }

    public void R0(Object obj) {
    }

    public final void S0(K k4, Object obj, p pVar) {
        k4.f(pVar, obj, this);
    }

    public String X() {
        return M.a(this) + " was cancelled";
    }

    public final i a() {
        return this.f811g;
    }

    public boolean b() {
        return super.b();
    }

    public final void m0(Throwable th) {
        H.a(this.f811g, th);
    }

    public i p() {
        return this.f811g;
    }

    public final void q(Object obj) {
        Object s02 = s0(D.d(obj, (l) null, 1, (Object) null));
        if (s02 != x0.f859b) {
            P0(s02);
        }
    }

    public String u0() {
        String b4 = E.b(this.f811g);
        if (b4 == null) {
            return super.u0();
        }
        return '\"' + b4 + "\":" + super.u0();
    }

    public final void z0(Object obj) {
        if (obj instanceof C0271z) {
            C0271z zVar = (C0271z) obj;
            Q0(zVar.f872a, zVar.a());
            return;
        }
        R0(obj);
    }
}
