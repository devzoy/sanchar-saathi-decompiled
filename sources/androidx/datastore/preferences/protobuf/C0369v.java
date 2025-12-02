package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.v  reason: case insensitive filesystem */
public class C0369v implements O {

    /* renamed from: a  reason: collision with root package name */
    public static final C0369v f5317a = new C0369v();

    public static C0369v c() {
        return f5317a;
    }

    public N a(Class cls) {
        Class<C0370w> cls2 = C0370w.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (N) C0370w.u(cls.asSubclass(cls2)).j();
            } catch (Exception e4) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e4);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
    }

    public boolean b(Class cls) {
        return C0370w.class.isAssignableFrom(cls);
    }
}
