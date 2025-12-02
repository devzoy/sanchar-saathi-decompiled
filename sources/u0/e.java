package u0;

import v3.l;
import y0.h;

public final class e implements h.c {

    /* renamed from: a  reason: collision with root package name */
    public final h.c f12151a;

    /* renamed from: b  reason: collision with root package name */
    public final C0940c f12152b;

    public e(h.c cVar, C0940c cVar2) {
        l.e(cVar, "delegate");
        l.e(cVar2, "autoCloser");
        this.f12151a = cVar;
        this.f12152b = cVar2;
    }

    /* renamed from: a */
    public d create(h.b bVar) {
        l.e(bVar, "configuration");
        return new d(this.f12151a.create(bVar), this.f12152b);
    }
}
