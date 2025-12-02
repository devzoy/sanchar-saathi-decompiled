package z3;

import v3.g;

public final class c extends a {

    /* renamed from: i  reason: collision with root package name */
    public static final a f13040i = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    public static final c f13041j = new c(1, 0);

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    public c(int i4, int i5) {
        super(i4, i5, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(s() == cVar.s() && t() == cVar.t())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (s() * 31) + t();
    }

    public boolean isEmpty() {
        return s() > t();
    }

    public String toString() {
        return s() + ".." + t();
    }
}
