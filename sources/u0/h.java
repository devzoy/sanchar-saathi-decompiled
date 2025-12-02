package u0;

import v3.l;
import y0.k;

public abstract class h extends C0935A {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(u uVar) {
        super(uVar);
        l.e(uVar, "database");
    }

    public abstract void i(k kVar, Object obj);

    public final int j(Object obj) {
        k b4 = b();
        try {
            i(b4, obj);
            return b4.executeUpdateDelete();
        } finally {
            h(b4);
        }
    }
}
