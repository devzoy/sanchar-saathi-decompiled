package w1;

import java.util.Objects;
import u1.C0941a;

public final class J implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ M f12540e;

    public J(M m4) {
        Objects.requireNonNull(m4);
        this.f12540e = m4;
    }

    public final void run() {
        this.f12540e.L().b(new C0941a(4));
    }
}
