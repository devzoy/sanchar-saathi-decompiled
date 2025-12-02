package androidx.lifecycle;

import androidx.lifecycle.C0380g;
import v3.l;

public final class z implements C0382i {

    /* renamed from: c  reason: collision with root package name */
    public final B f5436c;

    public z(B b4) {
        l.e(b4, "provider");
        this.f5436c = b4;
    }

    public void d(C0384k kVar, C0380g.a aVar) {
        l.e(kVar, "source");
        l.e(aVar, "event");
        if (aVar == C0380g.a.ON_CREATE) {
            kVar.b().c(this);
            this.f5436c.c();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
    }
}
