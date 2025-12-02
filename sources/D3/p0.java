package D3;

import java.util.concurrent.CancellationException;
import l3.i;
import u3.l;
import u3.p;

public interface p0 extends i.b {

    /* renamed from: b  reason: collision with root package name */
    public static final b f838b = b.f839e;

    public static final class a {
        public static /* synthetic */ void a(p0 p0Var, CancellationException cancellationException, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    cancellationException = null;
                }
                p0Var.c(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static Object b(p0 p0Var, Object obj, p pVar) {
            return i.b.a.a(p0Var, obj, pVar);
        }

        public static i.b c(p0 p0Var, i.c cVar) {
            return i.b.a.b(p0Var, cVar);
        }

        public static /* synthetic */ W d(p0 p0Var, boolean z4, boolean z5, l lVar, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    z4 = false;
                }
                if ((i4 & 2) != 0) {
                    z5 = true;
                }
                return p0Var.w(z4, z5, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static i e(p0 p0Var, i.c cVar) {
            return i.b.a.c(p0Var, cVar);
        }

        public static i f(p0 p0Var, i iVar) {
            return i.b.a.d(p0Var, iVar);
        }
    }

    public static final class b implements i.c {

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ b f839e = new b();
    }

    boolean D();

    boolean b();

    void c(CancellationException cancellationException);

    r g(C0265t tVar);

    p0 getParent();

    boolean i();

    W j(l lVar);

    W w(boolean z4, boolean z5, l lVar);

    CancellationException z();
}
