package F3;

import l3.e;
import u3.l;

public interface t {

    public static final class a {
        public static /* synthetic */ boolean a(t tVar, Throwable th, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    th = null;
                }
                return tVar.o(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    void A(l lVar);

    Object E(Object obj);

    boolean G();

    Object n(Object obj, e eVar);

    boolean o(Throwable th);
}
