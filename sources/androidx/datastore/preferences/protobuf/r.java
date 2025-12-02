package androidx.datastore.preferences.protobuf;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final C0364p f5203a = new C0365q();

    /* renamed from: b  reason: collision with root package name */
    public static final C0364p f5204b = c();

    public static C0364p a() {
        C0364p pVar = f5204b;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static C0364p b() {
        return f5203a;
    }

    public static C0364p c() {
        if (b0.f5079d) {
            return null;
        }
        try {
            return (C0364p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
