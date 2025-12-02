package w2;

import R1.g;

public final class m extends j {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f12662f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j f12663g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ t f12664h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(t tVar, g gVar, g gVar2, j jVar) {
        super(gVar);
        this.f12662f = gVar2;
        this.f12663g = jVar;
        this.f12664h = tVar;
    }

    public final void a() {
        synchronized (this.f12664h.f12676f) {
            try {
                t.n(this.f12664h, this.f12662f);
                if (this.f12664h.f12681k.getAndIncrement() > 0) {
                    this.f12664h.f12672b.c("Already connected to the service.", new Object[0]);
                }
                t.p(this.f12664h, this.f12663g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
