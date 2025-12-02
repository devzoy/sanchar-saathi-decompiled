package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.n  reason: case insensitive filesystem */
public abstract class C0362n {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f5166a = c();

    public static C0363o a() {
        C0363o b4 = b("getEmptyRegistry");
        return b4 != null ? b4 : C0363o.f5174c;
    }

    public static final C0363o b(String str) {
        Class cls = f5166a;
        if (cls == null) {
            return null;
        }
        try {
            return (C0363o) cls.getDeclaredMethod(str, (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
