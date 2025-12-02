package K0;

import i3.C0746w;
import java.util.List;
import v3.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final List f1670a;

    public j(List list) {
        l.e(list, "displayFeatures");
        this.f1670a = list;
    }

    public final List a() {
        return this.f1670a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!l.a(j.class, obj.getClass())) {
            return false;
        }
        return l.a(this.f1670a, ((j) obj).f1670a);
    }

    public int hashCode() {
        return this.f1670a.hashCode();
    }

    public String toString() {
        return C0746w.A(this.f1670a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, (CharSequence) null, (u3.l) null, 56, (Object) null);
    }
}
