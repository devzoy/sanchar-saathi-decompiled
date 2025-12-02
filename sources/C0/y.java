package c0;

import h3.C0668i;
import h3.C0673n;
import l3.e;
import m3.C0795c;
import n3.k;
import u3.q;

public abstract class y {

    public static final class a extends k implements q {

        /* renamed from: i  reason: collision with root package name */
        public int f6500i;

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f6501j;

        public a(e eVar) {
            super(3, eVar);
        }

        public /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3) {
            return s((r) obj, ((Boolean) obj2).booleanValue(), (e) obj3);
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f6500i;
            if (i4 == 0) {
                C0668i.b(obj);
                this.f6500i = 1;
                obj = ((r) this.f6501j).e(this);
                if (obj == c4) {
                    return c4;
                }
            } else if (i4 == 1) {
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object s(r rVar, boolean z4, e eVar) {
            a aVar = new a(eVar);
            aVar.f6501j = rVar;
            return aVar.o(C0673n.f9639a);
        }
    }

    public static final Object a(x xVar, e eVar) {
        return xVar.d(new a((e) null), eVar);
    }
}
