package androidx.datastore.preferences.protobuf;

public abstract class X {

    /* renamed from: a  reason: collision with root package name */
    public static final V f5071a = c();

    /* renamed from: b  reason: collision with root package name */
    public static final V f5072b = new W();

    public static V a() {
        return f5071a;
    }

    public static V b() {
        return f5072b;
    }

    public static V c() {
        if (b0.f5079d) {
            return null;
        }
        try {
            return (V) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
