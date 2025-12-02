package e3;

import i3.C0738o;
import java.util.List;
import v3.g;
import v3.l;

public final class M {

    /* renamed from: c  reason: collision with root package name */
    public static final a f8928c = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f8929a;

    /* renamed from: b  reason: collision with root package name */
    public final K f8930b;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final M a(List list) {
            l.e(list, "pigeonVar_list");
            Object obj = list.get(1);
            l.c(obj, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
            return new M((String) list.get(0), (K) obj);
        }

        public a() {
        }
    }

    public M(String str, K k4) {
        l.e(k4, "type");
        this.f8929a = str;
        this.f8930b = k4;
    }

    public final List a() {
        return C0738o.j(this.f8929a, this.f8930b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m4 = (M) obj;
        return l.a(this.f8929a, m4.f8929a) && this.f8930b == m4.f8930b;
    }

    public int hashCode() {
        String str = this.f8929a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f8930b.hashCode();
    }

    public String toString() {
        String str = this.f8929a;
        K k4 = this.f8930b;
        return "StringListResult(jsonEncodedValue=" + str + ", type=" + k4 + ")";
    }
}
