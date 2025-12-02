package h3;

import h3.C0667h;
import v3.l;

/* renamed from: h3.i  reason: case insensitive filesystem */
public abstract class C0668i {
    public static final Object a(Throwable th) {
        l.e(th, "exception");
        return new C0667h.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof C0667h.b) {
            throw ((C0667h.b) obj).f9634e;
        }
    }
}
