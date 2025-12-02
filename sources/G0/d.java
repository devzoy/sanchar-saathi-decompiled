package g0;

import c0.h;
import h3.C0668i;
import h3.C0673n;
import l3.e;
import m3.C0795c;
import n3.k;
import u3.p;
import v3.l;

public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public final h f9050a;

    public static final class a extends k implements p {

        /* renamed from: i  reason: collision with root package name */
        public int f9051i;

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f9052j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ p f9053k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p pVar, e eVar) {
            super(2, eVar);
            this.f9053k = pVar;
        }

        public final e j(Object obj, e eVar) {
            a aVar = new a(this.f9053k, eVar);
            aVar.f9052j = obj;
            return aVar;
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f9051i;
            if (i4 == 0) {
                C0668i.b(obj);
                p pVar = this.f9053k;
                this.f9051i = 1;
                obj = pVar.g((f) this.f9052j, this);
                if (obj == c4) {
                    return c4;
                }
            } else if (i4 == 1) {
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f fVar = (f) obj;
            l.c(fVar, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((c) fVar).g();
            return fVar;
        }

        /* renamed from: s */
        public final Object g(f fVar, e eVar) {
            return ((a) j(fVar, eVar)).o(C0673n.f9639a);
        }
    }

    public d(h hVar) {
        l.e(hVar, "delegate");
        this.f9050a = hVar;
    }

    public Object a(p pVar, e eVar) {
        return this.f9050a.a(new a(pVar, (e) null), eVar);
    }

    public G3.d b() {
        return this.f9050a.b();
    }
}
