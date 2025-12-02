package androidx.datastore.preferences.protobuf;

public abstract class F {

    /* renamed from: a  reason: collision with root package name */
    public static final D f5030a = c();

    /* renamed from: b  reason: collision with root package name */
    public static final D f5031b = new E();

    public static D a() {
        return f5030a;
    }

    public static D b() {
        return f5031b;
    }

    public static D c() {
        if (b0.f5079d) {
            return null;
        }
        try {
            return (D) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
