package D3;

import I3.C0281j;
import I3.C0284m;
import I3.C0285n;
import l3.C0783a;
import l3.b;
import l3.e;
import l3.f;
import l3.i;
import u3.l;
import v3.g;
import v3.m;

public abstract class F extends C0783a implements f {

    /* renamed from: f  reason: collision with root package name */
    public static final a f780f = new a((g) null);

    public static final class a extends b {

        /* renamed from: D3.F$a$a  reason: collision with other inner class name */
        public static final class C0007a extends m implements l {

            /* renamed from: f  reason: collision with root package name */
            public static final C0007a f781f = new C0007a();

            public C0007a() {
                super(1);
            }

            /* renamed from: a */
            public final F i(i.b bVar) {
                if (bVar instanceof F) {
                    return (F) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
            super(f.f11129d, C0007a.f781f);
        }
    }

    public F() {
        super(f.f11129d);
    }

    public i B(i.c cVar) {
        return f.a.b(this, cVar);
    }

    public final e J(e eVar) {
        return new C0281j(this, eVar);
    }

    public abstract void K(i iVar, Runnable runnable);

    public boolean L(i iVar) {
        return true;
    }

    public F M(int i4) {
        C0285n.a(i4);
        return new C0284m(this, i4);
    }

    public i.b d(i.c cVar) {
        return f.a.a(this, cVar);
    }

    public final void e(e eVar) {
        v3.l.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C0281j) eVar).o();
    }

    public String toString() {
        return M.a(this) + '@' + M.b(this);
    }
}
