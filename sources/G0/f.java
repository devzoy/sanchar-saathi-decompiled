package g0;

import i3.C0721E;
import java.util.Map;
import v3.l;

public abstract class f {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f9056a;

        public a(String str) {
            l.e(str, "name");
            this.f9056a = str;
        }

        public final String a() {
            return this.f9056a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return l.a(this.f9056a, ((a) obj).f9056a);
            }
            return false;
        }

        public int hashCode() {
            return this.f9056a.hashCode();
        }

        public String toString() {
            return this.f9056a;
        }
    }

    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final c c() {
        return new c(C0721E.s(a()), false);
    }

    public final f d() {
        return new c(C0721E.s(a()), true);
    }
}
