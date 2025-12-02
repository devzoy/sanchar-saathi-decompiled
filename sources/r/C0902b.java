package r;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: r.b  reason: case insensitive filesystem */
public class C0902b implements Iterable {

    /* renamed from: e  reason: collision with root package name */
    public c f11926e;

    /* renamed from: f  reason: collision with root package name */
    public c f11927f;

    /* renamed from: g  reason: collision with root package name */
    public final WeakHashMap f11928g = new WeakHashMap();

    /* renamed from: h  reason: collision with root package name */
    public int f11929h = 0;

    /* renamed from: r.b$a */
    public static class a extends e {
        public a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        public c d(c cVar) {
            return cVar.f11933h;
        }

        public c e(c cVar) {
            return cVar.f11932g;
        }
    }

    /* renamed from: r.b$b  reason: collision with other inner class name */
    public static class C0193b extends e {
        public C0193b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        public c d(c cVar) {
            return cVar.f11932g;
        }

        public c e(c cVar) {
            return cVar.f11933h;
        }
    }

    /* renamed from: r.b$c */
    public static class c implements Map.Entry {

        /* renamed from: e  reason: collision with root package name */
        public final Object f11930e;

        /* renamed from: f  reason: collision with root package name */
        public final Object f11931f;

        /* renamed from: g  reason: collision with root package name */
        public c f11932g;

        /* renamed from: h  reason: collision with root package name */
        public c f11933h;

        public c(Object obj, Object obj2) {
            this.f11930e = obj;
            this.f11931f = obj2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f11930e.equals(cVar.f11930e) && this.f11931f.equals(cVar.f11931f);
        }

        public Object getKey() {
            return this.f11930e;
        }

        public Object getValue() {
            return this.f11931f;
        }

        public int hashCode() {
            return this.f11930e.hashCode() ^ this.f11931f.hashCode();
        }

        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f11930e + "=" + this.f11931f;
        }
    }

    /* renamed from: r.b$d */
    public class d extends f implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        public c f11934e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f11935f = true;

        public d() {
        }

        public void c(c cVar) {
            c cVar2 = this.f11934e;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f11933h;
                this.f11934e = cVar3;
                this.f11935f = cVar3 == null;
            }
        }

        /* renamed from: d */
        public Map.Entry next() {
            if (this.f11935f) {
                this.f11935f = false;
                this.f11934e = C0902b.this.f11926e;
            } else {
                c cVar = this.f11934e;
                this.f11934e = cVar != null ? cVar.f11932g : null;
            }
            return this.f11934e;
        }

        public boolean hasNext() {
            if (this.f11935f) {
                return C0902b.this.f11926e != null;
            }
            c cVar = this.f11934e;
            return (cVar == null || cVar.f11932g == null) ? false : true;
        }
    }

    /* renamed from: r.b$e */
    public static abstract class e extends f implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        public c f11937e;

        /* renamed from: f  reason: collision with root package name */
        public c f11938f;

        public e(c cVar, c cVar2) {
            this.f11937e = cVar2;
            this.f11938f = cVar;
        }

        public void c(c cVar) {
            if (this.f11937e == cVar && cVar == this.f11938f) {
                this.f11938f = null;
                this.f11937e = null;
            }
            c cVar2 = this.f11937e;
            if (cVar2 == cVar) {
                this.f11937e = d(cVar2);
            }
            if (this.f11938f == cVar) {
                this.f11938f = g();
            }
        }

        public abstract c d(c cVar);

        public abstract c e(c cVar);

        /* renamed from: f */
        public Map.Entry next() {
            c cVar = this.f11938f;
            this.f11938f = g();
            return cVar;
        }

        public final c g() {
            c cVar = this.f11938f;
            c cVar2 = this.f11937e;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return e(cVar);
        }

        public boolean hasNext() {
            return this.f11938f != null;
        }
    }

    /* renamed from: r.b$f */
    public static abstract class f {
        public abstract void c(c cVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0902b)) {
            return false;
        }
        C0902b bVar = (C0902b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public int hashCode() {
        Iterator it = iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((Map.Entry) it.next()).hashCode();
        }
        return i4;
    }

    public Iterator iterator() {
        a aVar = new a(this.f11926e, this.f11927f);
        this.f11928g.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Iterator s() {
        C0193b bVar = new C0193b(this.f11927f, this.f11926e);
        this.f11928g.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public int size() {
        return this.f11929h;
    }

    public Map.Entry t() {
        return this.f11926e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public c u(Object obj) {
        c cVar = this.f11926e;
        while (cVar != null && !cVar.f11930e.equals(obj)) {
            cVar = cVar.f11932g;
        }
        return cVar;
    }

    public d v() {
        d dVar = new d();
        this.f11928g.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry w() {
        return this.f11927f;
    }

    public c x(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f11929h++;
        c cVar2 = this.f11927f;
        if (cVar2 == null) {
            this.f11926e = cVar;
            this.f11927f = cVar;
            return cVar;
        }
        cVar2.f11932g = cVar;
        cVar.f11933h = cVar2;
        this.f11927f = cVar;
        return cVar;
    }

    public Object y(Object obj, Object obj2) {
        c u4 = u(obj);
        if (u4 != null) {
            return u4.f11931f;
        }
        x(obj, obj2);
        return null;
    }

    public Object z(Object obj) {
        c u4 = u(obj);
        if (u4 == null) {
            return null;
        }
        this.f11929h--;
        if (!this.f11928g.isEmpty()) {
            for (f c4 : this.f11928g.keySet()) {
                c4.c(u4);
            }
        }
        c cVar = u4.f11933h;
        if (cVar != null) {
            cVar.f11932g = u4.f11932g;
        } else {
            this.f11926e = u4.f11932g;
        }
        c cVar2 = u4.f11932g;
        if (cVar2 != null) {
            cVar2.f11933h = cVar;
        } else {
            this.f11927f = cVar;
        }
        u4.f11932g = null;
        u4.f11933h = null;
        return u4.f11931f;
    }
}
