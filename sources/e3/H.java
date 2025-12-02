package e3;

import i3.C0738o;
import java.util.List;
import v3.g;
import v3.l;

public final class H {

    /* renamed from: c  reason: collision with root package name */
    public static final a f8791c = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f8792a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8793b;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final H a(List list) {
            l.e(list, "pigeonVar_list");
            Object obj = list.get(1);
            l.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new H((String) list.get(0), ((Boolean) obj).booleanValue());
        }

        public a() {
        }
    }

    public H(String str, boolean z4) {
        this.f8792a = str;
        this.f8793b = z4;
    }

    public final String a() {
        return this.f8792a;
    }

    public final List b() {
        return C0738o.j(this.f8792a, Boolean.valueOf(this.f8793b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h4 = (H) obj;
        return l.a(this.f8792a, h4.f8792a) && this.f8793b == h4.f8793b;
    }

    public int hashCode() {
        String str = this.f8792a;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f8793b);
    }

    public String toString() {
        String str = this.f8792a;
        boolean z4 = this.f8793b;
        return "SharedPreferencesPigeonOptions(fileName=" + str + ", useDataStore=" + z4 + ")";
    }
}
