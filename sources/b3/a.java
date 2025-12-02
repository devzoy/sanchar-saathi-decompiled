package B3;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import v3.l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f255a;

    public a(b bVar) {
        l.e(bVar, "sequence");
        this.f255a = new AtomicReference(bVar);
    }

    public Iterator iterator() {
        b bVar = (b) this.f255a.getAndSet((Object) null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
