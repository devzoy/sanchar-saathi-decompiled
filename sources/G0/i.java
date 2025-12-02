package g0;

import c0.h;
import h3.C0668i;
import h3.C0673n;
import l3.e;
import m3.C0795c;
import n3.k;
import u3.p;

public abstract class i {

    public static final class a extends k implements p {

        /* renamed from: i  reason: collision with root package name */
        public int f9057i;

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f9058j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ p f9059k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p pVar, e eVar) {
            super(2, eVar);
            this.f9059k = pVar;
        }

        public final e j(Object obj, e eVar) {
            a aVar = new a(this.f9059k, eVar);
            aVar.f9058j = obj;
            return aVar;
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f9057i;
            if (i4 == 0) {
                C0668i.b(obj);
                c c5 = ((f) this.f9058j).c();
                p pVar = this.f9059k;
                this.f9058j = c5;
                this.f9057i = 1;
                return pVar.g(c5, this) == c4 ? c4 : c5;
            } else if (i4 == 1) {
                c cVar = (c) this.f9058j;
                C0668i.b(obj);
                return cVar;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: s */
        public final Object g(f fVar, e eVar) {
            return ((a) j(fVar, eVar)).o(C0673n.f9639a);
        }
    }

    public static final Object a(h hVar, p pVar, e eVar) {
        return hVar.a(new a(pVar, (e) null), eVar);
    }
}
