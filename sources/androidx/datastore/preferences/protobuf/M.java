package androidx.datastore.preferences.protobuf;

public abstract class M {

    /* renamed from: a  reason: collision with root package name */
    public static final K f5045a = c();

    /* renamed from: b  reason: collision with root package name */
    public static final K f5046b = new L();

    public static K a() {
        return f5045a;
    }

    public static K b() {
        return f5046b;
    }

    public static K c() {
        if (b0.f5079d) {
            return null;
        }
        try {
            return (K) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
