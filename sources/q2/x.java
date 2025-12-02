package q2;

public final class x extends t {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ D f11920f;

    public x(D d4) {
        this.f11920f = d4;
    }

    public final void a() {
        synchronized (this.f11920f.f11885f) {
            try {
                if (this.f11920f.f11890k.get() > 0) {
                    if (this.f11920f.f11890k.decrementAndGet() > 0) {
                        this.f11920f.f11881b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                D d4 = this.f11920f;
                if (d4.f11892m != null) {
                    d4.f11881b.d("Unbind from service.", new Object[0]);
                    D d5 = this.f11920f;
                    d5.f11880a.unbindService(d5.f11891l);
                    this.f11920f.f11886g = false;
                    this.f11920f.f11892m = null;
                    this.f11920f.f11891l = null;
                }
                this.f11920f.w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
