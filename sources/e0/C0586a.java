package e0;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: e0.a  reason: case insensitive filesystem */
public final class C0586a {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f8708a;

    public C0586a(boolean z4) {
        this.f8708a = new AtomicBoolean(z4);
    }

    public final boolean a() {
        return this.f8708a.get();
    }

    public final void b(boolean z4) {
        this.f8708a.set(z4);
    }
}
