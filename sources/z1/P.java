package z1;

import android.util.Log;
import java.util.Objects;

public abstract class P {

    /* renamed from: a  reason: collision with root package name */
    public Object f12883a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12884b = false;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C1021d f12885c;

    public P(C1021d dVar, Object obj) {
        Objects.requireNonNull(dVar);
        this.f12885c = dVar;
        this.f12883a = obj;
    }

    public abstract void a(Object obj);

    public final void b() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f12883a;
                if (this.f12884b) {
                    String obj2 = toString();
                    StringBuilder sb = new StringBuilder(obj2.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(obj2);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f12884b = true;
        }
        c();
    }

    public final void c() {
        d();
        C1021d dVar = this.f12885c;
        synchronized (dVar.b0()) {
            dVar.b0().remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f12883a = null;
        }
    }
}
