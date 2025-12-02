package K0;

import v3.g;

public interface c extends a {

    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0028a f1631b = new C0028a((g) null);

        /* renamed from: c  reason: collision with root package name */
        public static final a f1632c = new a("NONE");

        /* renamed from: d  reason: collision with root package name */
        public static final a f1633d = new a("FULL");

        /* renamed from: a  reason: collision with root package name */
        public final String f1634a;

        /* renamed from: K0.c$a$a  reason: collision with other inner class name */
        public static final class C0028a {
            public /* synthetic */ C0028a(g gVar) {
                this();
            }

            public C0028a() {
            }
        }

        public a(String str) {
            this.f1634a = str;
        }

        public String toString() {
            return this.f1634a;
        }
    }

    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final a f1635b = new a((g) null);

        /* renamed from: c  reason: collision with root package name */
        public static final b f1636c = new b("FLAT");

        /* renamed from: d  reason: collision with root package name */
        public static final b f1637d = new b("HALF_OPENED");

        /* renamed from: a  reason: collision with root package name */
        public final String f1638a;

        public static final class a {
            public /* synthetic */ a(g gVar) {
                this();
            }

            public a() {
            }
        }

        public b(String str) {
            this.f1638a = str;
        }

        public String toString() {
            return this.f1638a;
        }
    }

    a b();

    b getState();
}
