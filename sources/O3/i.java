package O3;

import v3.l;

public abstract class i implements y {

    /* renamed from: e  reason: collision with root package name */
    public final y f2119e;

    public i(y yVar) {
        l.e(yVar, "delegate");
        this.f2119e = yVar;
    }

    public void close() {
        this.f2119e.close();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f2119e + ')';
    }

    public long v(C0298b bVar, long j4) {
        l.e(bVar, "sink");
        return this.f2119e.v(bVar, j4);
    }
}
