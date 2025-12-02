package z1;

import android.os.Bundle;
import java.util.Objects;
import u1.C0941a;

public final class U extends I {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C1021d f12892g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U(C1021d dVar, int i4, Bundle bundle) {
        super(dVar, i4, bundle);
        Objects.requireNonNull(dVar);
        this.f12892g = dVar;
    }

    public final boolean e() {
        this.f12892g.f12939p.a(C0941a.f12304i);
        return true;
    }

    public final void f(C0941a aVar) {
        C1021d dVar = this.f12892g;
        if (!dVar.s() || !dVar.Y()) {
            dVar.f12939p.a(aVar);
            dVar.K(aVar);
            return;
        }
        dVar.X(16);
    }
}
