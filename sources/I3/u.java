package I3;

import B3.e;
import B3.g;
import D3.z0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f1583a;

    /* renamed from: b  reason: collision with root package name */
    public static final z0 f1584b;

    static {
        u uVar = new u();
        f1583a = uVar;
        G.f("kotlinx.coroutines.fast.service.loader", true);
        f1584b = uVar.a();
    }

    public final z0 a() {
        Object obj;
        Class<t> cls = t.class;
        try {
            List c4 = g.c(e.a(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            Iterator it = c4.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int c5 = ((t) obj).c();
                    do {
                        Object next = it.next();
                        int c6 = ((t) next).c();
                        if (c5 < c6) {
                            obj = next;
                            c5 = c6;
                        }
                    } while (it.hasNext());
                }
            }
            t tVar = (t) obj;
            if (tVar != null) {
                z0 e4 = v.e(tVar, c4);
                if (e4 != null) {
                    return e4;
                }
            }
            return v.b((Throwable) null, (String) null, 3, (Object) null);
        } catch (Throwable th) {
            return v.b(th, (String) null, 2, (Object) null);
        }
    }
}
