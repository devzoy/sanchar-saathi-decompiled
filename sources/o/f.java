package O;

import android.os.LocaleList;
import java.util.Locale;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f2018a;

    public f(Object obj) {
        this.f2018a = (LocaleList) obj;
    }

    public Object a() {
        return this.f2018a;
    }

    public boolean equals(Object obj) {
        return this.f2018a.equals(((e) obj).a());
    }

    public Locale get(int i4) {
        return this.f2018a.get(i4);
    }

    public int hashCode() {
        return this.f2018a.hashCode();
    }

    public String toString() {
        return this.f2018a.toString();
    }
}
