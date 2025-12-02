package u0;

import v3.l;
import y0.k;

public abstract class i extends C0935A {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(u uVar) {
        super(uVar);
        l.e(uVar, "database");
    }

    public abstract void i(k kVar, Object obj);

    public final void j(Object obj) {
        k b4 = b();
        try {
            i(b4, obj);
            b4.executeInsert();
        } finally {
            h(b4);
        }
    }
}
