package H1;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static c f1406c;

    /* renamed from: a  reason: collision with root package name */
    public final b f1407a = new b();

    /* renamed from: b  reason: collision with root package name */
    public final e f1408b = new e();

    static {
        c cVar = new c();
        synchronized (c.class) {
            f1406c = cVar;
        }
    }

    public static b a() {
        return b().f1407a;
    }

    public static c b() {
        c cVar;
        synchronized (c.class) {
            cVar = f1406c;
        }
        return cVar;
    }
}
