package O;

import android.os.LocaleList;
import java.util.Locale;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final d f2016b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    public final e f2017a;

    public static class a {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public d(e eVar) {
        this.f2017a = eVar;
    }

    public static d a(Locale... localeArr) {
        return d(a.a(localeArr));
    }

    public static d d(LocaleList localeList) {
        return new d(new f(localeList));
    }

    public Locale b(int i4) {
        return this.f2017a.get(i4);
    }

    public Object c() {
        return this.f2017a.a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && this.f2017a.equals(((d) obj).f2017a);
    }

    public int hashCode() {
        return this.f2017a.hashCode();
    }

    public String toString() {
        return this.f2017a.toString();
    }
}
