package H3;

import D3.E;
import F3.r;
import G3.d;
import h3.C0668i;
import h3.C0673n;
import l3.e;
import l3.f;
import l3.i;
import m3.C0795c;
import n3.k;
import u3.p;
import v3.l;

public abstract class g extends e {

    /* renamed from: h  reason: collision with root package name */
    public final d f1452h;

    public static final class a extends k implements p {

        /* renamed from: i  reason: collision with root package name */
        public int f1453i;

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f1454j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ g f1455k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar, e eVar) {
            super(2, eVar);
            this.f1455k = gVar;
        }

        public final e j(Object obj, e eVar) {
            a aVar = new a(this.f1455k, eVar);
            aVar.f1454j = obj;
            return aVar;
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f1453i;
            if (i4 == 0) {
                C0668i.b(obj);
                g gVar = this.f1455k;
                this.f1453i = 1;
                if (gVar.n((G3.e) this.f1454j, this) == c4) {
                    return c4;
                }
            } else if (i4 == 1) {
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C0673n.f9639a;
        }

        /* renamed from: s */
        public final Object g(G3.e eVar, e eVar2) {
            return ((a) j(eVar, eVar2)).o(C0673n.f9639a);
        }
    }

    public g(d dVar, i iVar, int i4, F3.a aVar) {
        super(iVar, i4, aVar);
        this.f1452h = dVar;
    }

    public static /* synthetic */ Object k(g gVar, G3.e eVar, e eVar2) {
        if (gVar.f1443f == -3) {
            i a4 = eVar2.a();
            i e4 = E.e(a4, gVar.f1442e);
            if (l.a(e4, a4)) {
                Object n4 = gVar.n(eVar, eVar2);
                return n4 == C0795c.c() ? n4 : C0673n.f9639a;
            }
            f.b bVar = f.f11129d;
            if (l.a(e4.d(bVar), a4.d(bVar))) {
                Object m4 = gVar.m(eVar, e4, eVar2);
                return m4 == C0795c.c() ? m4 : C0673n.f9639a;
            }
        }
        Object c4 = super.c(eVar, eVar2);
        return c4 == C0795c.c() ? c4 : C0673n.f9639a;
    }

    public static /* synthetic */ Object l(g gVar, r rVar, e eVar) {
        Object n4 = gVar.n(new q(rVar), eVar);
        return n4 == C0795c.c() ? n4 : C0673n.f9639a;
    }

    public Object c(G3.e eVar, e eVar2) {
        return k(this, eVar, eVar2);
    }

    public Object f(r rVar, e eVar) {
        return l(this, rVar, eVar);
    }

    public final Object m(G3.e eVar, i iVar, e eVar2) {
        Object c4 = f.c(iVar, f.d(eVar, eVar2.a()), (Object) null, new a(this, (e) null), eVar2, 4, (Object) null);
        return c4 == C0795c.c() ? c4 : C0673n.f9639a;
    }

    public abstract Object n(G3.e eVar, e eVar2);

    public String toString() {
        return this.f1452h + " -> " + super.toString();
    }
}
