package D3;

import I3.F;
import I3.K;

public final class J0 {

    /* renamed from: a  reason: collision with root package name */
    public static final J0 f784a = new J0();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f785b = K.a(new F("ThreadLocalEventLoop"));

    public final Z a() {
        return (Z) f785b.get();
    }

    public final Z b() {
        ThreadLocal threadLocal = f785b;
        Z z4 = (Z) threadLocal.get();
        if (z4 != null) {
            return z4;
        }
        Z a4 = C0237c0.a();
        threadLocal.set(a4);
        return a4;
    }

    public final void c() {
        f785b.set((Object) null);
    }

    public final void d(Z z4) {
        f785b.set(z4);
    }
}
