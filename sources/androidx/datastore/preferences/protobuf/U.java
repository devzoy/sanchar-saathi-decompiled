package androidx.datastore.preferences.protobuf;

import android.support.v4.media.session.b;
import java.util.Iterator;
import java.util.Map;

public final class U implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final P f5067a;

    /* renamed from: b  reason: collision with root package name */
    public final m0 f5068b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5069c;

    /* renamed from: d  reason: collision with root package name */
    public final C0364p f5070d;

    public U(m0 m0Var, C0364p pVar, P p4) {
        this.f5068b = m0Var;
        this.f5069c = pVar.e(p4);
        this.f5070d = pVar;
        this.f5067a = p4;
    }

    private int c(m0 m0Var, Object obj) {
        return m0Var.i(m0Var.g(obj));
    }

    private void k(m0 m0Var, C0364p pVar, Object obj, e0 e0Var, C0363o oVar) {
        Object f4 = m0Var.f(obj);
        C0366s d4 = pVar.d(obj);
        do {
            try {
                if (e0Var.r() == Integer.MAX_VALUE) {
                    m0Var.o(obj, f4);
                    return;
                }
            } finally {
                m0Var.o(obj, f4);
            }
        } while (m(e0Var, oVar, pVar, d4, m0Var, f4));
    }

    public static U l(m0 m0Var, C0364p pVar, P p4) {
        return new U(m0Var, pVar, p4);
    }

    public void a(Object obj, Object obj2) {
        h0.F(this.f5068b, obj, obj2);
        if (this.f5069c) {
            h0.D(this.f5070d, obj, obj2);
        }
    }

    public boolean b(Object obj, Object obj2) {
        if (!this.f5068b.g(obj).equals(this.f5068b.g(obj2))) {
            return false;
        }
        if (this.f5069c) {
            return this.f5070d.c(obj).equals(this.f5070d.c(obj2));
        }
        return true;
    }

    public Object d() {
        P p4 = this.f5067a;
        return p4 instanceof C0370w ? ((C0370w) p4).I() : p4.g().f();
    }

    public int e(Object obj) {
        int hashCode = this.f5068b.g(obj).hashCode();
        return this.f5069c ? (hashCode * 53) + this.f5070d.c(obj).hashCode() : hashCode;
    }

    public void f(Object obj, e0 e0Var, C0363o oVar) {
        k(this.f5068b, this.f5070d, obj, e0Var, oVar);
    }

    public void g(Object obj, s0 s0Var) {
        Iterator n4 = this.f5070d.c(obj).n();
        if (!n4.hasNext()) {
            n(this.f5068b, obj, s0Var);
        } else {
            b.a(((Map.Entry) n4.next()).getKey());
            throw null;
        }
    }

    public void h(Object obj) {
        this.f5068b.j(obj);
        this.f5070d.f(obj);
    }

    public final boolean i(Object obj) {
        return this.f5070d.c(obj).k();
    }

    public int j(Object obj) {
        int c4 = c(this.f5068b, obj);
        return this.f5069c ? c4 + this.f5070d.c(obj).f() : c4;
    }

    public final boolean m(e0 e0Var, C0363o oVar, C0364p pVar, C0366s sVar, m0 m0Var, Object obj) {
        int e4 = e0Var.e();
        int i4 = 0;
        if (e4 == r0.f5205a) {
            Object obj2 = null;
            C0355g gVar = null;
            while (e0Var.r() != Integer.MAX_VALUE) {
                int e5 = e0Var.e();
                if (e5 == r0.f5207c) {
                    i4 = e0Var.y();
                    obj2 = pVar.b(oVar, this.f5067a, i4);
                } else if (e5 == r0.f5208d) {
                    if (obj2 != null) {
                        pVar.h(e0Var, obj2, oVar, sVar);
                    } else {
                        gVar = e0Var.w();
                    }
                } else if (!e0Var.B()) {
                    break;
                }
            }
            if (e0Var.e() == r0.f5206b) {
                if (gVar != null) {
                    if (obj2 != null) {
                        pVar.i(gVar, obj2, oVar, sVar);
                    } else {
                        m0Var.d(obj, i4, gVar);
                    }
                }
                return true;
            }
            throw C0373z.b();
        } else if (r0.b(e4) != 2) {
            return e0Var.B();
        } else {
            Object b4 = pVar.b(oVar, this.f5067a, r0.a(e4));
            if (b4 == null) {
                return m0Var.m(obj, e0Var, 0);
            }
            pVar.h(e0Var, b4, oVar, sVar);
            return true;
        }
    }

    public final void n(m0 m0Var, Object obj, s0 s0Var) {
        m0Var.s(m0Var.g(obj), s0Var);
    }
}
