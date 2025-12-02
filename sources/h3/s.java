package H3;

import G3.e;
import I3.J;
import h3.C0668i;
import h3.C0673n;
import l3.i;
import m3.C0795c;
import n3.k;
import u3.p;

public final class s implements e {

    /* renamed from: e  reason: collision with root package name */
    public final i f1475e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f1476f;

    /* renamed from: g  reason: collision with root package name */
    public final p f1477g;

    public static final class a extends k implements p {

        /* renamed from: i  reason: collision with root package name */
        public int f1478i;

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f1479j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ e f1480k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, l3.e eVar2) {
            super(2, eVar2);
            this.f1480k = eVar;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            a aVar = new a(this.f1480k, eVar);
            aVar.f1479j = obj;
            return aVar;
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f1478i;
            if (i4 == 0) {
                C0668i.b(obj);
                Object obj2 = this.f1479j;
                e eVar = this.f1480k;
                this.f1478i = 1;
                if (eVar.b(obj2, this) == c4) {
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
        public final Object g(Object obj, l3.e eVar) {
            return ((a) j(obj, eVar)).o(C0673n.f9639a);
        }
    }

    public s(e eVar, i iVar) {
        this.f1475e = iVar;
        this.f1476f = J.b(iVar);
        this.f1477g = new a(eVar, (l3.e) null);
    }

    public Object b(Object obj, l3.e eVar) {
        Object b4 = f.b(this.f1475e, obj, this.f1476f, this.f1477g, eVar);
        return b4 == C0795c.c() ? b4 : C0673n.f9639a;
    }
}
