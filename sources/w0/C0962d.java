package w0;

import C3.o;
import C3.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import v3.g;
import v3.l;

/* renamed from: w0.d  reason: case insensitive filesystem */
public final class C0962d {

    /* renamed from: e  reason: collision with root package name */
    public static final b f12496e = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f12497a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f12498b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f12499c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f12500d;

    /* renamed from: w0.d$a */
    public static final class a {

        /* renamed from: h  reason: collision with root package name */
        public static final C0207a f12501h = new C0207a((g) null);

        /* renamed from: a  reason: collision with root package name */
        public final String f12502a;

        /* renamed from: b  reason: collision with root package name */
        public final String f12503b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f12504c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12505d;

        /* renamed from: e  reason: collision with root package name */
        public final String f12506e;

        /* renamed from: f  reason: collision with root package name */
        public final int f12507f;

        /* renamed from: g  reason: collision with root package name */
        public final int f12508g;

        /* renamed from: w0.d$a$a  reason: collision with other inner class name */
        public static final class C0207a {
            public /* synthetic */ C0207a(g gVar) {
                this();
            }

            public final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i4 < str.length()) {
                    char charAt = str.charAt(i4);
                    int i7 = i6 + 1;
                    if (i6 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i5++;
                    } else if (charAt == ')' && i5 - 1 == 0 && i6 != str.length() - 1) {
                        return false;
                    }
                    i4++;
                    i6 = i7;
                }
                return i5 == 0;
            }

            public final boolean b(String str, String str2) {
                l.e(str, "current");
                if (l.a(str, str2)) {
                    return true;
                }
                if (!a(str)) {
                    return false;
                }
                String substring = str.substring(1, str.length() - 1);
                l.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return l.a(p.X(substring).toString(), str2);
            }

            public C0207a() {
            }
        }

        public a(String str, String str2, boolean z4, int i4, String str3, int i5) {
            l.e(str, "name");
            l.e(str2, "type");
            this.f12502a = str;
            this.f12503b = str2;
            this.f12504c = z4;
            this.f12505d = i4;
            this.f12506e = str3;
            this.f12507f = i5;
            this.f12508g = a(str2);
        }

        public final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale locale = Locale.US;
            l.d(locale, "US");
            String upperCase = str.toUpperCase(locale);
            l.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (p.z(upperCase, "INT", false, 2, (Object) null)) {
                return 3;
            }
            if (p.z(upperCase, "CHAR", false, 2, (Object) null) || p.z(upperCase, "CLOB", false, 2, (Object) null) || p.z(upperCase, "TEXT", false, 2, (Object) null)) {
                return 2;
            }
            if (p.z(upperCase, "BLOB", false, 2, (Object) null)) {
                return 5;
            }
            return (p.z(upperCase, "REAL", false, 2, (Object) null) || p.z(upperCase, "FLOA", false, 2, (Object) null) || p.z(upperCase, "DOUB", false, 2, (Object) null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f12505d != ((a) obj).f12505d) {
                return false;
            }
            a aVar = (a) obj;
            if (!l.a(this.f12502a, aVar.f12502a) || this.f12504c != aVar.f12504c) {
                return false;
            }
            if (this.f12507f == 1 && aVar.f12507f == 2 && (str3 = this.f12506e) != null && !f12501h.b(str3, aVar.f12506e)) {
                return false;
            }
            if (this.f12507f == 2 && aVar.f12507f == 1 && (str2 = aVar.f12506e) != null && !f12501h.b(str2, this.f12506e)) {
                return false;
            }
            int i4 = this.f12507f;
            if (i4 == 0 || i4 != aVar.f12507f || ((str = this.f12506e) == null ? aVar.f12506e == null : f12501h.b(str, aVar.f12506e))) {
                return this.f12508g == aVar.f12508g;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f12502a.hashCode() * 31) + this.f12508g) * 31) + (this.f12504c ? 1231 : 1237)) * 31) + this.f12505d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.f12502a);
            sb.append("', type='");
            sb.append(this.f12503b);
            sb.append("', affinity='");
            sb.append(this.f12508g);
            sb.append("', notNull=");
            sb.append(this.f12504c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f12505d);
            sb.append(", defaultValue='");
            String str = this.f12506e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }
    }

    /* renamed from: w0.d$b */
    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public final C0962d a(y0.g gVar, String str) {
            l.e(gVar, "database");
            l.e(str, "tableName");
            return C0963e.f(gVar, str);
        }

        public b() {
        }
    }

    /* renamed from: w0.d$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f12509a;

        /* renamed from: b  reason: collision with root package name */
        public final String f12510b;

        /* renamed from: c  reason: collision with root package name */
        public final String f12511c;

        /* renamed from: d  reason: collision with root package name */
        public final List f12512d;

        /* renamed from: e  reason: collision with root package name */
        public final List f12513e;

        public c(String str, String str2, String str3, List list, List list2) {
            l.e(str, "referenceTable");
            l.e(str2, "onDelete");
            l.e(str3, "onUpdate");
            l.e(list, "columnNames");
            l.e(list2, "referenceColumnNames");
            this.f12509a = str;
            this.f12510b = str2;
            this.f12511c = str3;
            this.f12512d = list;
            this.f12513e = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (l.a(this.f12509a, cVar.f12509a) && l.a(this.f12510b, cVar.f12510b) && l.a(this.f12511c, cVar.f12511c) && l.a(this.f12512d, cVar.f12512d)) {
                return l.a(this.f12513e, cVar.f12513e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f12509a.hashCode() * 31) + this.f12510b.hashCode()) * 31) + this.f12511c.hashCode()) * 31) + this.f12512d.hashCode()) * 31) + this.f12513e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f12509a + "', onDelete='" + this.f12510b + " +', onUpdate='" + this.f12511c + "', columnNames=" + this.f12512d + ", referenceColumnNames=" + this.f12513e + '}';
        }
    }

    /* renamed from: w0.d$d  reason: collision with other inner class name */
    public static final class C0208d implements Comparable {

        /* renamed from: e  reason: collision with root package name */
        public final int f12514e;

        /* renamed from: f  reason: collision with root package name */
        public final int f12515f;

        /* renamed from: g  reason: collision with root package name */
        public final String f12516g;

        /* renamed from: h  reason: collision with root package name */
        public final String f12517h;

        public C0208d(int i4, int i5, String str, String str2) {
            l.e(str, "from");
            l.e(str2, "to");
            this.f12514e = i4;
            this.f12515f = i5;
            this.f12516g = str;
            this.f12517h = str2;
        }

        /* renamed from: b */
        public int compareTo(C0208d dVar) {
            l.e(dVar, "other");
            int i4 = this.f12514e - dVar.f12514e;
            return i4 == 0 ? this.f12515f - dVar.f12515f : i4;
        }

        public final String f() {
            return this.f12516g;
        }

        public final int k() {
            return this.f12514e;
        }

        public final String l() {
            return this.f12517h;
        }
    }

    /* renamed from: w0.d$e */
    public static final class e {

        /* renamed from: e  reason: collision with root package name */
        public static final a f12518e = new a((g) null);

        /* renamed from: a  reason: collision with root package name */
        public final String f12519a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12520b;

        /* renamed from: c  reason: collision with root package name */
        public final List f12521c;

        /* renamed from: d  reason: collision with root package name */
        public List f12522d;

        /* renamed from: w0.d$e$a */
        public static final class a {
            public /* synthetic */ a(g gVar) {
                this();
            }

            public a() {
            }
        }

        public e(String str, boolean z4, List list, List list2) {
            l.e(str, "name");
            l.e(list, "columns");
            l.e(list2, "orders");
            this.f12519a = str;
            this.f12520b = z4;
            this.f12521c = list;
            this.f12522d = list2;
            Collection collection = list2;
            boolean isEmpty = collection.isEmpty();
            ArrayList arrayList = collection;
            if (isEmpty) {
                int size = list.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add(u0.l.ASC.name());
                }
                arrayList = arrayList2;
            }
            this.f12522d = (List) arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f12520b == eVar.f12520b && l.a(this.f12521c, eVar.f12521c) && l.a(this.f12522d, eVar.f12522d)) {
                return o.v(this.f12519a, "index_", false, 2, (Object) null) ? o.v(eVar.f12519a, "index_", false, 2, (Object) null) : l.a(this.f12519a, eVar.f12519a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((o.v(this.f12519a, "index_", false, 2, (Object) null) ? -1184239155 : this.f12519a.hashCode()) * 31) + (this.f12520b ? 1 : 0)) * 31) + this.f12521c.hashCode()) * 31) + this.f12522d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f12519a + "', unique=" + this.f12520b + ", columns=" + this.f12521c + ", orders=" + this.f12522d + "'}";
        }
    }

    public C0962d(String str, Map map, Set set, Set set2) {
        l.e(str, "name");
        l.e(map, "columns");
        l.e(set, "foreignKeys");
        this.f12497a = str;
        this.f12498b = map;
        this.f12499c = set;
        this.f12500d = set2;
    }

    public static final C0962d a(y0.g gVar, String str) {
        return f12496e.a(gVar, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0962d)) {
            return false;
        }
        C0962d dVar = (C0962d) obj;
        if (!l.a(this.f12497a, dVar.f12497a) || !l.a(this.f12498b, dVar.f12498b) || !l.a(this.f12499c, dVar.f12499c)) {
            return false;
        }
        Set set2 = this.f12500d;
        if (set2 == null || (set = dVar.f12500d) == null) {
            return true;
        }
        return l.a(set2, set);
    }

    public int hashCode() {
        return (((this.f12497a.hashCode() * 31) + this.f12498b.hashCode()) * 31) + this.f12499c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f12497a + "', columns=" + this.f12498b + ", foreignKeys=" + this.f12499c + ", indices=" + this.f12500d + '}';
    }
}
