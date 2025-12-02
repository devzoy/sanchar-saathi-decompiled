package F3;

import D3.N0;
import F3.h;
import I3.F;
import I3.O;
import h3.C0660a;
import h3.C0673n;
import l3.e;
import u3.l;
import v3.x;

public class o extends b {

    /* renamed from: q  reason: collision with root package name */
    public final int f1084q;

    /* renamed from: r  reason: collision with root package name */
    public final a f1085r;

    public o(int i4, a aVar, l lVar) {
        super(i4, lVar);
        this.f1084q = i4;
        this.f1085r = aVar;
        if (aVar == a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + x.b(b.class).c() + " instead").toString());
        } else if (i4 < 1) {
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i4 + " was specified").toString());
        }
    }

    public static /* synthetic */ Object H0(o oVar, Object obj, e eVar) {
        O d4;
        Object K02 = oVar.K0(obj, true);
        if (!(K02 instanceof h.a)) {
            return C0673n.f9639a;
        }
        h.c(K02);
        l lVar = oVar.f1047f;
        if (lVar == null || (d4 = I3.x.d(lVar, obj, (O) null, 2, (Object) null)) == null) {
            throw oVar.N();
        }
        C0660a.a(d4, oVar.N());
        throw d4;
    }

    public Object E(Object obj) {
        return K0(obj, false);
    }

    public final Object I0(Object obj, boolean z4) {
        l lVar;
        O d4;
        Object E4 = super.E(obj);
        if (h.f(E4) || h.e(E4)) {
            return E4;
        }
        if (!z4 || (lVar = this.f1047f) == null || (d4 = I3.x.d(lVar, obj, (O) null, 2, (Object) null)) == null) {
            return h.f1079a.c(C0673n.f9639a);
        }
        throw d4;
    }

    public final Object J0(Object obj) {
        j jVar;
        F f4 = c.f1058d;
        j jVar2 = (j) b.f1041l.get(this);
        while (true) {
            long andIncrement = b.f1037h.getAndIncrement(this);
            long j4 = andIncrement & 1152921504606846975L;
            boolean j5 = X(andIncrement);
            int i4 = c.f1056b;
            long j6 = j4 / ((long) i4);
            int i5 = (int) (j4 % ((long) i4));
            if (jVar2.f1526g != j6) {
                j b4 = I(j6, jVar2);
                if (b4 != null) {
                    jVar = b4;
                } else if (j5) {
                    return h.f1079a.a(N());
                }
            } else {
                jVar = jVar2;
            }
            int r4 = C0(jVar, i5, obj, j4, f4, j5);
            if (r4 == 0) {
                jVar.b();
                return h.f1079a.c(C0673n.f9639a);
            } else if (r4 == 1) {
                return h.f1079a.c(C0673n.f9639a);
            } else {
                if (r4 != 2) {
                    if (r4 == 3) {
                        throw new IllegalStateException("unexpected");
                    } else if (r4 != 4) {
                        if (r4 == 5) {
                            jVar.b();
                        }
                        jVar2 = jVar;
                    } else {
                        if (j4 < M()) {
                            jVar.b();
                        }
                        return h.f1079a.a(N());
                    }
                } else if (j5) {
                    jVar.p();
                    return h.f1079a.a(N());
                } else {
                    N0 n02 = f4 instanceof N0 ? (N0) f4 : null;
                    if (n02 != null) {
                        m0(n02, jVar, i5);
                    }
                    B((jVar.f1526g * ((long) i4)) + ((long) i5));
                    return h.f1079a.c(C0673n.f9639a);
                }
            }
        }
    }

    public final Object K0(Object obj, boolean z4) {
        return this.f1085r == a.DROP_LATEST ? I0(obj, z4) : J0(obj);
    }

    public boolean Y() {
        return this.f1085r == a.DROP_OLDEST;
    }

    public Object n(Object obj, e eVar) {
        return H0(this, obj, eVar);
    }
}
