package n0;

import h3.C0673n;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: n0.b  reason: case insensitive filesystem */
public final class C0798b {

    /* renamed from: a  reason: collision with root package name */
    public final C0797a f11225a = new C0797a();

    /* renamed from: b  reason: collision with root package name */
    public final Map f11226b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Set f11227c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f11228d;

    public final void d() {
        if (!this.f11228d) {
            this.f11228d = true;
            synchronized (this.f11225a) {
                try {
                    for (AutoCloseable a4 : this.f11226b.values()) {
                        e(a4);
                    }
                    for (AutoCloseable a5 : this.f11227c) {
                        e(a5);
                    }
                    this.f11227c.clear();
                    C0673n nVar = C0673n.f9639a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
    }
}
