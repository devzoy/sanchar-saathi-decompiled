package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class b0 {

    /* renamed from: c  reason: collision with root package name */
    public static final b0 f5078c = new b0();

    /* renamed from: d  reason: collision with root package name */
    public static boolean f5079d = false;

    /* renamed from: a  reason: collision with root package name */
    public final g0 f5080a = new H();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap f5081b = new ConcurrentHashMap();

    public static b0 a() {
        return f5078c;
    }

    public f0 b(Class cls, f0 f0Var) {
        C0372y.b(cls, "messageType");
        C0372y.b(f0Var, "schema");
        return (f0) this.f5081b.putIfAbsent(cls, f0Var);
    }

    public f0 c(Class cls) {
        C0372y.b(cls, "messageType");
        f0 f0Var = (f0) this.f5081b.get(cls);
        if (f0Var != null) {
            return f0Var;
        }
        f0 a4 = this.f5080a.a(cls);
        f0 b4 = b(cls, a4);
        return b4 != null ? b4 : a4;
    }

    public f0 d(Object obj) {
        return c(obj.getClass());
    }
}
