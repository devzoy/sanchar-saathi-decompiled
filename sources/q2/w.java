package q2;

import R1.g;

public final class w extends t {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f11917f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ t f11918g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ D f11919h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(D d4, g gVar, g gVar2, t tVar) {
        super(gVar);
        this.f11919h = d4;
        this.f11917f = gVar2;
        this.f11918g = tVar;
    }

    public final void a() {
        synchronized (this.f11919h.f11885f) {
            try {
                D.n(this.f11919h, this.f11917f);
                if (this.f11919h.f11890k.getAndIncrement() > 0) {
                    this.f11919h.f11881b.d("Already connected to the service.", new Object[0]);
                }
                D.p(this.f11919h, this.f11918g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
