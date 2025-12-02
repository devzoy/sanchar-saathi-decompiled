package v;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: v.a  reason: case insensitive filesystem */
public class C0944a extends g implements Map {

    /* renamed from: l  reason: collision with root package name */
    public f f12348l;

    /* renamed from: v.a$a  reason: collision with other inner class name */
    public class C0203a extends f {
        public C0203a() {
        }

        public void a() {
            C0944a.this.clear();
        }

        public Object b(int i4, int i5) {
            return C0944a.this.f12397f[(i4 << 1) + i5];
        }

        public Map c() {
            return C0944a.this;
        }

        public int d() {
            return C0944a.this.f12398g;
        }

        public int e(Object obj) {
            return C0944a.this.f(obj);
        }

        public int f(Object obj) {
            return C0944a.this.h(obj);
        }

        public void g(Object obj, Object obj2) {
            C0944a.this.put(obj, obj2);
        }

        public void h(int i4) {
            C0944a.this.k(i4);
        }

        public Object i(int i4, Object obj) {
            return C0944a.this.l(i4, obj);
        }
    }

    public C0944a() {
    }

    public Set entrySet() {
        return n().l();
    }

    public Set keySet() {
        return n().m();
    }

    public final f n() {
        if (this.f12348l == null) {
            this.f12348l = new C0203a();
        }
        return this.f12348l;
    }

    public boolean o(Collection collection) {
        return f.p(this, collection);
    }

    public void putAll(Map map) {
        c(this.f12398g + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection values() {
        return n().n();
    }

    public C0944a(int i4) {
        super(i4);
    }

    public C0944a(g gVar) {
        super(gVar);
    }
}
