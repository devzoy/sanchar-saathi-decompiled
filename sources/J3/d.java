package j3;

import i3.C0726c;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import v3.g;
import v3.l;

public final class d implements Map, Serializable {

    /* renamed from: r  reason: collision with root package name */
    public static final a f10933r = new a((g) null);

    /* renamed from: s  reason: collision with root package name */
    public static final d f10934s;

    /* renamed from: e  reason: collision with root package name */
    public Object[] f10935e;

    /* renamed from: f  reason: collision with root package name */
    public Object[] f10936f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f10937g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f10938h;

    /* renamed from: i  reason: collision with root package name */
    public int f10939i;

    /* renamed from: j  reason: collision with root package name */
    public int f10940j;

    /* renamed from: k  reason: collision with root package name */
    public int f10941k;

    /* renamed from: l  reason: collision with root package name */
    public int f10942l;

    /* renamed from: m  reason: collision with root package name */
    public int f10943m;

    /* renamed from: n  reason: collision with root package name */
    public f f10944n;

    /* renamed from: o  reason: collision with root package name */
    public g f10945o;

    /* renamed from: p  reason: collision with root package name */
    public e f10946p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f10947q;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final int c(int i4) {
            return Integer.highestOneBit(z3.e.a(i4, 1) * 3);
        }

        public final int d(int i4) {
            return Integer.numberOfLeadingZeros(i4) + 1;
        }

        public final d e() {
            return d.f10934s;
        }

        public a() {
        }
    }

    public static final class b extends C0183d implements Iterator {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(dVar);
            l.e(dVar, "map");
        }

        /* renamed from: j */
        public c next() {
            c();
            if (d() < f().f10940j) {
                int d4 = d();
                h(d4 + 1);
                i(d4);
                c cVar = new c(f(), e());
                g();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void k(StringBuilder sb) {
            l.e(sb, "sb");
            if (d() < f().f10940j) {
                int d4 = d();
                h(d4 + 1);
                i(d4);
                Object obj = f().f10935e[e()];
                if (obj == f()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] g4 = f().f10936f;
                l.b(g4);
                Object obj2 = g4[e()];
                if (obj2 == f()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                g();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int l() {
            if (d() < f().f10940j) {
                int d4 = d();
                h(d4 + 1);
                i(d4);
                Object obj = f().f10935e[e()];
                int i4 = 0;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] g4 = f().f10936f;
                l.b(g4);
                Object obj2 = g4[e()];
                if (obj2 != null) {
                    i4 = obj2.hashCode();
                }
                int i5 = hashCode ^ i4;
                g();
                return i5;
            }
            throw new NoSuchElementException();
        }
    }

    public static final class c implements Map.Entry {

        /* renamed from: e  reason: collision with root package name */
        public final d f10948e;

        /* renamed from: f  reason: collision with root package name */
        public final int f10949f;

        /* renamed from: g  reason: collision with root package name */
        public final int f10950g;

        public c(d dVar, int i4) {
            l.e(dVar, "map");
            this.f10948e = dVar;
            this.f10949f = i4;
            this.f10950g = dVar.f10942l;
        }

        public final void a() {
            if (this.f10948e.f10942l != this.f10950g) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return l.a(entry.getKey(), getKey()) && l.a(entry.getValue(), getValue());
            }
        }

        public Object getKey() {
            a();
            return this.f10948e.f10935e[this.f10949f];
        }

        public Object getValue() {
            a();
            Object[] g4 = this.f10948e.f10936f;
            l.b(g4);
            return g4[this.f10949f];
        }

        public int hashCode() {
            Object key = getKey();
            int i4 = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i4 = value.hashCode();
            }
            return hashCode ^ i4;
        }

        public Object setValue(Object obj) {
            a();
            this.f10948e.l();
            Object[] a4 = this.f10948e.j();
            int i4 = this.f10949f;
            Object obj2 = a4[i4];
            a4[i4] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: j3.d$d  reason: collision with other inner class name */
    public static class C0183d {

        /* renamed from: e  reason: collision with root package name */
        public final d f10951e;

        /* renamed from: f  reason: collision with root package name */
        public int f10952f;

        /* renamed from: g  reason: collision with root package name */
        public int f10953g = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f10954h;

        public C0183d(d dVar) {
            l.e(dVar, "map");
            this.f10951e = dVar;
            this.f10954h = dVar.f10942l;
            g();
        }

        public final void c() {
            if (this.f10951e.f10942l != this.f10954h) {
                throw new ConcurrentModificationException();
            }
        }

        public final int d() {
            return this.f10952f;
        }

        public final int e() {
            return this.f10953g;
        }

        public final d f() {
            return this.f10951e;
        }

        public final void g() {
            while (this.f10952f < this.f10951e.f10940j) {
                int[] f4 = this.f10951e.f10937g;
                int i4 = this.f10952f;
                if (f4[i4] < 0) {
                    this.f10952f = i4 + 1;
                } else {
                    return;
                }
            }
        }

        public final void h(int i4) {
            this.f10952f = i4;
        }

        public final boolean hasNext() {
            return this.f10952f < this.f10951e.f10940j;
        }

        public final void i(int i4) {
            this.f10953g = i4;
        }

        public final void remove() {
            c();
            if (this.f10953g != -1) {
                this.f10951e.l();
                this.f10951e.J(this.f10953g);
                this.f10953g = -1;
                this.f10954h = this.f10951e.f10942l;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
    }

    public static final class e extends C0183d implements Iterator {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(dVar);
            l.e(dVar, "map");
        }

        public Object next() {
            c();
            if (d() < f().f10940j) {
                int d4 = d();
                h(d4 + 1);
                i(d4);
                Object obj = f().f10935e[e()];
                g();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    public static final class f extends C0183d implements Iterator {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(d dVar) {
            super(dVar);
            l.e(dVar, "map");
        }

        public Object next() {
            c();
            if (d() < f().f10940j) {
                int d4 = d();
                h(d4 + 1);
                i(d4);
                Object[] g4 = f().f10936f;
                l.b(g4);
                Object obj = g4[e()];
                g();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        d dVar = new d(0);
        dVar.f10947q = true;
        f10934s = dVar;
    }

    public d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i4, int i5) {
        this.f10935e = objArr;
        this.f10936f = objArr2;
        this.f10937g = iArr;
        this.f10938h = iArr2;
        this.f10939i = i4;
        this.f10940j = i5;
        this.f10941k = f10933r.d(x());
    }

    public Collection A() {
        g gVar = this.f10945o;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f10945o = gVar2;
        return gVar2;
    }

    public final int B(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * -1640531527) >>> this.f10941k;
    }

    public final e C() {
        return new e(this);
    }

    public final boolean D(Collection collection) {
        boolean z4 = false;
        if (collection.isEmpty()) {
            return false;
        }
        r(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (E((Map.Entry) it.next())) {
                z4 = true;
            }
        }
        return z4;
    }

    public final boolean E(Map.Entry entry) {
        int i4 = i(entry.getKey());
        Object[] j4 = j();
        if (i4 >= 0) {
            j4[i4] = entry.getValue();
            return true;
        }
        int i5 = (-i4) - 1;
        if (l.a(entry.getValue(), j4[i5])) {
            return false;
        }
        j4[i5] = entry.getValue();
        return true;
    }

    public final boolean F(int i4) {
        int B4 = B(this.f10935e[i4]);
        int i5 = this.f10939i;
        while (true) {
            int[] iArr = this.f10938h;
            if (iArr[B4] == 0) {
                iArr[B4] = i4 + 1;
                this.f10937g[i4] = B4;
                return true;
            }
            i5--;
            if (i5 < 0) {
                return false;
            }
            B4 = B4 == 0 ? x() - 1 : B4 - 1;
        }
    }

    public final void G() {
        this.f10942l++;
    }

    public final void H(int i4) {
        G();
        int i5 = 0;
        if (this.f10940j > size()) {
            m(false);
        }
        this.f10938h = new int[i4];
        this.f10941k = f10933r.d(i4);
        while (i5 < this.f10940j) {
            int i6 = i5 + 1;
            if (F(i5)) {
                i5 = i6;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    public final boolean I(Map.Entry entry) {
        l.e(entry, "entry");
        l();
        int t4 = t(entry.getKey());
        if (t4 < 0) {
            return false;
        }
        Object[] objArr = this.f10936f;
        l.b(objArr);
        if (!l.a(objArr[t4], entry.getValue())) {
            return false;
        }
        J(t4);
        return true;
    }

    public final void J(int i4) {
        c.f(this.f10935e, i4);
        Object[] objArr = this.f10936f;
        if (objArr != null) {
            c.f(objArr, i4);
        }
        K(this.f10937g[i4]);
        this.f10937g[i4] = -1;
        this.f10943m = size() - 1;
        G();
    }

    public final void K(int i4) {
        int c4 = z3.e.c(this.f10939i * 2, x() / 2);
        int i5 = 0;
        int i6 = i4;
        do {
            i4 = i4 == 0 ? x() - 1 : i4 - 1;
            i5++;
            if (i5 > this.f10939i) {
                this.f10938h[i6] = 0;
                return;
            }
            int[] iArr = this.f10938h;
            int i7 = iArr[i4];
            if (i7 == 0) {
                iArr[i6] = 0;
                return;
            }
            if (i7 < 0) {
                iArr[i6] = -1;
            } else {
                int i8 = i7 - 1;
                if (((B(this.f10935e[i8]) - i4) & (x() - 1)) >= i5) {
                    this.f10938h[i6] = i7;
                    this.f10937g[i8] = i6;
                }
                c4--;
            }
            i6 = i4;
            i5 = 0;
            c4--;
        } while (c4 >= 0);
        this.f10938h[i6] = -1;
    }

    public final boolean L(Object obj) {
        l();
        int t4 = t(obj);
        if (t4 < 0) {
            return false;
        }
        J(t4);
        return true;
    }

    public final boolean M(Object obj) {
        l();
        int u4 = u(obj);
        if (u4 < 0) {
            return false;
        }
        J(u4);
        return true;
    }

    public final boolean N(int i4) {
        int v4 = v();
        int i5 = this.f10940j;
        int i6 = v4 - i5;
        int size = i5 - size();
        return i6 < i4 && i6 + size >= i4 && size >= v() / 4;
    }

    public final f O() {
        return new f(this);
    }

    public void clear() {
        l();
        int i4 = this.f10940j - 1;
        if (i4 >= 0) {
            int i5 = 0;
            while (true) {
                int[] iArr = this.f10937g;
                int i6 = iArr[i5];
                if (i6 >= 0) {
                    this.f10938h[i6] = 0;
                    iArr[i5] = -1;
                }
                if (i5 == i4) {
                    break;
                }
                i5++;
            }
        }
        c.g(this.f10935e, 0, this.f10940j);
        Object[] objArr = this.f10936f;
        if (objArr != null) {
            c.g(objArr, 0, this.f10940j);
        }
        this.f10943m = 0;
        this.f10940j = 0;
        G();
    }

    public boolean containsKey(Object obj) {
        return t(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return u(obj) >= 0;
    }

    public final /* bridge */ Set entrySet() {
        return w();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && p((Map) obj));
    }

    public Object get(Object obj) {
        int t4 = t(obj);
        if (t4 < 0) {
            return null;
        }
        Object[] objArr = this.f10936f;
        l.b(objArr);
        return objArr[t4];
    }

    public int hashCode() {
        b s4 = s();
        int i4 = 0;
        while (s4.hasNext()) {
            i4 += s4.l();
        }
        return i4;
    }

    public final int i(Object obj) {
        l();
        while (true) {
            int B4 = B(obj);
            int c4 = z3.e.c(this.f10939i * 2, x() / 2);
            int i4 = 0;
            while (true) {
                int i5 = this.f10938h[B4];
                if (i5 <= 0) {
                    if (this.f10940j >= v()) {
                        r(1);
                    } else {
                        int i6 = this.f10940j;
                        int i7 = i6 + 1;
                        this.f10940j = i7;
                        this.f10935e[i6] = obj;
                        this.f10937g[i6] = B4;
                        this.f10938h[B4] = i7;
                        this.f10943m = size() + 1;
                        G();
                        if (i4 > this.f10939i) {
                            this.f10939i = i4;
                        }
                        return i6;
                    }
                } else if (l.a(this.f10935e[i5 - 1], obj)) {
                    return -i5;
                } else {
                    i4++;
                    if (i4 > c4) {
                        H(x() * 2);
                        break;
                    }
                    B4 = B4 == 0 ? x() - 1 : B4 - 1;
                }
            }
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.f10936f;
        if (objArr != null) {
            return objArr;
        }
        Object[] d4 = c.d(v());
        this.f10936f = d4;
        return d4;
    }

    public final Map k() {
        l();
        this.f10947q = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f10934s;
        l.c(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final /* bridge */ Set keySet() {
        return y();
    }

    public final void l() {
        if (this.f10947q) {
            throw new UnsupportedOperationException();
        }
    }

    public final void m(boolean z4) {
        int i4;
        Object[] objArr = this.f10936f;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i4 = this.f10940j;
            if (i5 >= i4) {
                break;
            }
            int[] iArr = this.f10937g;
            int i7 = iArr[i5];
            if (i7 >= 0) {
                Object[] objArr2 = this.f10935e;
                objArr2[i6] = objArr2[i5];
                if (objArr != null) {
                    objArr[i6] = objArr[i5];
                }
                if (z4) {
                    iArr[i6] = i7;
                    this.f10938h[i7] = i6 + 1;
                }
                i6++;
            }
            i5++;
        }
        c.g(this.f10935e, i6, i4);
        if (objArr != null) {
            c.g(objArr, i6, this.f10940j);
        }
        this.f10940j = i6;
    }

    public final boolean n(Collection collection) {
        l.e(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!o((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean o(Map.Entry entry) {
        l.e(entry, "entry");
        int t4 = t(entry.getKey());
        if (t4 < 0) {
            return false;
        }
        Object[] objArr = this.f10936f;
        l.b(objArr);
        return l.a(objArr[t4], entry.getValue());
    }

    public final boolean p(Map map) {
        return size() == map.size() && n(map.entrySet());
    }

    public Object put(Object obj, Object obj2) {
        l();
        int i4 = i(obj);
        Object[] j4 = j();
        if (i4 < 0) {
            int i5 = (-i4) - 1;
            Object obj3 = j4[i5];
            j4[i5] = obj2;
            return obj3;
        }
        j4[i4] = obj2;
        return null;
    }

    public void putAll(Map map) {
        l.e(map, "from");
        l();
        D(map.entrySet());
    }

    public final void q(int i4) {
        if (i4 < 0) {
            throw new OutOfMemoryError();
        } else if (i4 > v()) {
            int d4 = C0726c.f10289e.d(v(), i4);
            this.f10935e = c.e(this.f10935e, d4);
            Object[] objArr = this.f10936f;
            this.f10936f = objArr != null ? c.e(objArr, d4) : null;
            int[] copyOf = Arrays.copyOf(this.f10937g, d4);
            l.d(copyOf, "copyOf(...)");
            this.f10937g = copyOf;
            int a4 = f10933r.c(d4);
            if (a4 > x()) {
                H(a4);
            }
        }
    }

    public final void r(int i4) {
        if (N(i4)) {
            m(true);
        } else {
            q(this.f10940j + i4);
        }
    }

    public Object remove(Object obj) {
        l();
        int t4 = t(obj);
        if (t4 < 0) {
            return null;
        }
        Object[] objArr = this.f10936f;
        l.b(objArr);
        Object obj2 = objArr[t4];
        J(t4);
        return obj2;
    }

    public final b s() {
        return new b(this);
    }

    public final /* bridge */ int size() {
        return z();
    }

    public final int t(Object obj) {
        int B4 = B(obj);
        int i4 = this.f10939i;
        while (true) {
            int i5 = this.f10938h[B4];
            if (i5 == 0) {
                return -1;
            }
            if (i5 > 0) {
                int i6 = i5 - 1;
                if (l.a(this.f10935e[i6], obj)) {
                    return i6;
                }
            }
            i4--;
            if (i4 < 0) {
                return -1;
            }
            B4 = B4 == 0 ? x() - 1 : B4 - 1;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b s4 = s();
        int i4 = 0;
        while (s4.hasNext()) {
            if (i4 > 0) {
                sb.append(", ");
            }
            s4.k(sb);
            i4++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        l.d(sb2, "toString(...)");
        return sb2;
    }

    public final int u(Object obj) {
        int i4 = this.f10940j;
        while (true) {
            i4--;
            if (i4 < 0) {
                return -1;
            }
            if (this.f10937g[i4] >= 0) {
                Object[] objArr = this.f10936f;
                l.b(objArr);
                if (l.a(objArr[i4], obj)) {
                    return i4;
                }
            }
        }
    }

    public final int v() {
        return this.f10935e.length;
    }

    public final /* bridge */ Collection values() {
        return A();
    }

    public Set w() {
        e eVar = this.f10946p;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f10946p = eVar2;
        return eVar2;
    }

    public final int x() {
        return this.f10938h.length;
    }

    public Set y() {
        f fVar = this.f10944n;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this);
        this.f10944n = fVar2;
        return fVar2;
    }

    public int z() {
        return this.f10943m;
    }

    public d() {
        this(8);
    }

    public d(int i4) {
        this(c.d(i4), (Object[]) null, new int[i4], new int[f10933r.c(i4)], 2, 0);
    }
}
