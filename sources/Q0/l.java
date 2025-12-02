package Q0;

public interface l {

    /* renamed from: a  reason: collision with root package name */
    public static final b.c f2390a = new b.c();

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0053b f2391b = new b.C0053b();

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public final Throwable f2392a;

            public a(Throwable th) {
                this.f2392a = th;
            }

            public Throwable a() {
                return this.f2392a;
            }

            public String toString() {
                return "FAILURE (" + this.f2392a.getMessage() + ")";
            }
        }

        /* renamed from: Q0.l$b$b  reason: collision with other inner class name */
        public static final class C0053b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0053b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }
    }
}
