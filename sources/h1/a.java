package H1;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f1400a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1401b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1402c;

    /* renamed from: H1.a$a  reason: collision with other inner class name */
    public static class C0021a extends a {
        public C0021a(int i4, String str, Boolean bool) {
            super(i4, str, bool);
        }
    }

    public a(int i4, String str, Object obj) {
        this.f1400a = i4;
        this.f1401b = str;
        this.f1402c = obj;
        c.a().a(this);
    }

    public static C0021a a(int i4, String str, Boolean bool) {
        return new C0021a(i4, str, bool);
    }
}
