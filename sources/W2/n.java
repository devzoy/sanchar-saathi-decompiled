package w2;

public final class n extends j {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t f12665f;

    public n(t tVar) {
        this.f12665f = tVar;
    }

    public final void a() {
        synchronized (this.f12665f.f12676f) {
            try {
                if (this.f12665f.f12681k.get() <= 0 || this.f12665f.f12681k.decrementAndGet() <= 0) {
                    t tVar = this.f12665f;
                    if (tVar.f12683m != null) {
                        tVar.f12672b.c("Unbind from service.", new Object[0]);
                        t tVar2 = this.f12665f;
                        tVar2.f12671a.unbindService(tVar2.f12682l);
                        this.f12665f.f12677g = false;
                        this.f12665f.f12683m = null;
                        this.f12665f.f12682l = null;
                    }
                    this.f12665f.w();
                    return;
                }
                this.f12665f.f12672b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
