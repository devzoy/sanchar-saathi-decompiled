package O3;

import P3.c;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import v3.g;
import v3.l;

public final class r implements Comparable {

    /* renamed from: f  reason: collision with root package name */
    public static final a f2128f = new a((g) null);

    /* renamed from: g  reason: collision with root package name */
    public static final String f2129g;

    /* renamed from: e  reason: collision with root package name */
    public final e f2130e;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public static /* synthetic */ r d(a aVar, File file, boolean z4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z4 = false;
            }
            return aVar.a(file, z4);
        }

        public static /* synthetic */ r e(a aVar, String str, boolean z4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z4 = false;
            }
            return aVar.b(str, z4);
        }

        public static /* synthetic */ r f(a aVar, Path path, boolean z4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z4 = false;
            }
            return aVar.c(path, z4);
        }

        public final r a(File file, boolean z4) {
            l.e(file, "<this>");
            String file2 = file.toString();
            l.d(file2, "toString()");
            return b(file2, z4);
        }

        public final r b(String str, boolean z4) {
            l.e(str, "<this>");
            return c.k(str, z4);
        }

        public final r c(Path path, boolean z4) {
            l.e(path, "<this>");
            return b(path.toString(), z4);
        }

        public a() {
        }
    }

    static {
        String str = File.separator;
        l.d(str, "separator");
        f2129g = str;
    }

    public r(e eVar) {
        l.e(eVar, "bytes");
        this.f2130e = eVar;
    }

    /* renamed from: b */
    public int compareTo(r rVar) {
        l.e(rVar, "other");
        return f().compareTo(rVar.f());
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && l.a(((r) obj).f(), f());
    }

    public final e f() {
        return this.f2130e;
    }

    public int hashCode() {
        return f().hashCode();
    }

    public final r k() {
        int h4 = c.o(this);
        if (h4 == -1) {
            return null;
        }
        return new r(f().E(0, h4));
    }

    public final List l() {
        ArrayList arrayList = new ArrayList();
        int h4 = c.o(this);
        if (h4 == -1) {
            h4 = 0;
        } else if (h4 < f().C() && f().k(h4) == 92) {
            h4++;
        }
        int C4 = f().C();
        int i4 = h4;
        while (h4 < C4) {
            if (f().k(h4) == 47 || f().k(h4) == 92) {
                arrayList.add(f().E(i4, h4));
                i4 = h4 + 1;
            }
            h4++;
        }
        if (i4 < f().C()) {
            arrayList.add(f().E(i4, f().C()));
        }
        return arrayList;
    }

    public final boolean m() {
        return c.o(this) != -1;
    }

    public final String n() {
        return o().G();
    }

    public final e o() {
        int d4 = c.l(this);
        return d4 != -1 ? e.F(f(), d4 + 1, 0, 2, (Object) null) : (w() == null || f().C() != 2) ? f() : e.f2093i;
    }

    public final r p() {
        return f2128f.b(toString(), true);
    }

    public final r q() {
        r rVar;
        if (l.a(f(), c.f2274d) || l.a(f(), c.f2271a) || l.a(f(), c.f2272b) || c.n(this)) {
            return null;
        }
        int d4 = c.l(this);
        if (d4 != 2 || w() == null) {
            if (d4 == 1 && f().D(c.f2272b)) {
                return null;
            }
            if (d4 != -1 || w() == null) {
                if (d4 == -1) {
                    return new r(c.f2274d);
                }
                if (d4 != 0) {
                    return new r(e.F(f(), 0, d4, 1, (Object) null));
                }
                rVar = new r(e.F(f(), 0, 1, 1, (Object) null));
            } else if (f().C() == 2) {
                return null;
            } else {
                rVar = new r(e.F(f(), 0, 2, 1, (Object) null));
            }
        } else if (f().C() == 3) {
            return null;
        } else {
            rVar = new r(e.F(f(), 0, 3, 1, (Object) null));
        }
        return rVar;
    }

    public final r r(r rVar) {
        l.e(rVar, "other");
        if (l.a(k(), rVar.k())) {
            List l4 = l();
            List l5 = rVar.l();
            int min = Math.min(l4.size(), l5.size());
            int i4 = 0;
            while (i4 < min && l.a(l4.get(i4), l5.get(i4))) {
                i4++;
            }
            if (i4 == min && f().C() == rVar.f().C()) {
                return a.e(f2128f, ".", false, 1, (Object) null);
            }
            if (l5.subList(i4, l5.size()).indexOf(c.f2275e) == -1) {
                C0298b bVar = new C0298b();
                e f4 = c.m(rVar);
                if (f4 == null && (f4 = c.m(this)) == null) {
                    f4 = c.s(f2129g);
                }
                int size = l5.size();
                for (int i5 = i4; i5 < size; i5++) {
                    bVar.M(c.f2275e);
                    bVar.M(f4);
                }
                int size2 = l4.size();
                while (i4 < size2) {
                    bVar.M((e) l4.get(i4));
                    bVar.M(f4);
                    i4++;
                }
                return c.q(bVar, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + rVar).toString());
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + rVar).toString());
    }

    public final r s(r rVar, boolean z4) {
        l.e(rVar, "child");
        return c.j(this, rVar, z4);
    }

    public final r t(String str) {
        l.e(str, "child");
        return c.j(this, c.q(new C0298b().Q(str), false), false);
    }

    public String toString() {
        return f().G();
    }

    public final File u() {
        return new File(toString());
    }

    public final Path v() {
        Path path = Paths.get(toString(), new String[0]);
        l.d(path, "get(toString())");
        return path;
    }

    public final Character w() {
        if (e.s(f(), c.f2271a, 0, 2, (Object) null) != -1 || f().C() < 2 || f().k(1) != 58) {
            return null;
        }
        char k4 = (char) f().k(0);
        if (('a' > k4 || k4 >= '{') && ('A' > k4 || k4 >= '[')) {
            return null;
        }
        return Character.valueOf(k4);
    }
}
