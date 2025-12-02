package H3;

import D3.p0;
import I3.B;
import l3.i;
import v3.l;
import v3.m;

public abstract class p {

    public static final class a extends m implements u3.p {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ n f1471f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(n nVar) {
            super(2);
            this.f1471f = nVar;
        }

        public final Integer a(int i4, i.b bVar) {
            i.c key = bVar.getKey();
            i.b d4 = this.f1471f.f1464i.d(key);
            if (key != p0.f838b) {
                return Integer.valueOf(bVar != d4 ? Integer.MIN_VALUE : i4 + 1);
            }
            p0 p0Var = (p0) d4;
            l.c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            p0 b4 = p.b((p0) bVar, p0Var);
            if (b4 == p0Var) {
                if (p0Var != null) {
                    i4++;
                }
                return Integer.valueOf(i4);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b4 + ", expected child of " + p0Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (i.b) obj2);
        }
    }

    public static final void a(n nVar, i iVar) {
        if (((Number) iVar.H(0, new a(nVar))).intValue() != nVar.f1465j) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + nVar.f1464i + ",\n\t\tbut emission happened in " + iVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    public static final p0 b(p0 p0Var, p0 p0Var2) {
        while (p0Var != null) {
            if (p0Var == p0Var2 || !(p0Var instanceof B)) {
                return p0Var;
            }
            p0Var = p0Var.getParent();
        }
        return null;
    }
}
