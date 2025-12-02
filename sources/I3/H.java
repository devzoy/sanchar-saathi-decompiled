package I3;

public abstract /* synthetic */ class H {

    /* renamed from: a  reason: collision with root package name */
    public static final int f1531a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f1531a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
