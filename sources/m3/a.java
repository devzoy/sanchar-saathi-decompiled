package M3;

import l3.e;

public interface a {

    /* renamed from: M3.a$a  reason: collision with other inner class name */
    public static final class C0036a {
        public static /* synthetic */ boolean a(a aVar, Object obj, int i4, Object obj2) {
            if (obj2 == null) {
                if ((i4 & 1) != 0) {
                    obj = null;
                }
                return aVar.c(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        public static /* synthetic */ void b(a aVar, Object obj, int i4, Object obj2) {
            if (obj2 == null) {
                if ((i4 & 1) != 0) {
                    obj = null;
                }
                aVar.a(obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
    }

    void a(Object obj);

    Object b(Object obj, e eVar);

    boolean c(Object obj);
}
