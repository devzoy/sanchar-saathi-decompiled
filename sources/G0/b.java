package g0;

import java.util.concurrent.atomic.AtomicBoolean;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f9046a;

    public b(boolean z4) {
        this.f9046a = new AtomicBoolean(z4);
    }

    public final boolean a() {
        return this.f9046a.get();
    }

    public final void b(boolean z4) {
        this.f9046a.set(z4);
    }
}
