package F3;

import v3.g;
import v3.l;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final b f1079a = new b((g) null);

    /* renamed from: b  reason: collision with root package name */
    public static final c f1080b = new c();

    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f1081a;

        public a(Throwable th) {
            this.f1081a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && l.a(this.f1081a, ((a) obj).f1081a);
        }

        public int hashCode() {
            Throwable th = this.f1081a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.f1081a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public final Object a(Throwable th) {
            return h.b(new a(th));
        }

        public final Object b() {
            return h.b(h.f1080b);
        }

        public final Object c(Object obj) {
            return h.b(obj);
        }

        public b() {
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public static Object b(Object obj) {
        return obj;
    }

    public static final Throwable c(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f1081a;
        }
        return null;
    }

    public static final Object d(Object obj) {
        if (!(obj instanceof c)) {
            return obj;
        }
        return null;
    }

    public static final boolean e(Object obj) {
        return obj instanceof a;
    }

    public static final boolean f(Object obj) {
        return !(obj instanceof c);
    }
}
