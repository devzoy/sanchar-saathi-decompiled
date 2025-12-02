package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d  reason: case insensitive filesystem */
public abstract class C0352d {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f5086a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f5087b = a("libcore.io.Memory");

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f5088c = (!f5086a && a("org.robolectric.Robolectric") != null);

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return f5087b;
    }

    public static boolean c() {
        return f5086a || (f5087b != null && !f5088c);
    }
}
