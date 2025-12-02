package m0;

import m0.C0785a;
import v3.g;
import v3.l;

/* renamed from: m0.b  reason: case insensitive filesystem */
public final class C0786b extends C0785a {
    public C0786b() {
        this((C0785a) null, 1, (g) null);
    }

    public final void b(C0785a.b bVar, Object obj) {
        l.e(bVar, "key");
        a().put(bVar, obj);
    }

    public C0786b(C0785a aVar) {
        l.e(aVar, "initialExtras");
        a().putAll(aVar.a());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0786b(C0785a aVar, int i4, g gVar) {
        this((i4 & 1) != 0 ? C0785a.C0184a.f11134b : aVar);
    }
}
