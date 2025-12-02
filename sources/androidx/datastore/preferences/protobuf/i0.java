package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public abstract class i0 extends AbstractMap {

    /* renamed from: e  reason: collision with root package name */
    public List f5134e;

    /* renamed from: f  reason: collision with root package name */
    public Map f5135f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5136g;

    /* renamed from: h  reason: collision with root package name */
    public volatile f f5137h;

    /* renamed from: i  reason: collision with root package name */
    public Map f5138i;

    /* renamed from: j  reason: collision with root package name */
    public volatile c f5139j;

    public class a extends i0 {
        public a() {
            super((a) null);
        }

        public void p() {
            if (!o()) {
                if (k() <= 0) {
                    Iterator it = m().iterator();
                    if (it.hasNext()) {
                        android.support.v4.media.session.b.a(((Map.Entry) it.next()).getKey());
                        throw null;
                    }
                } else {
                    android.support.v4.media.session.b.a(j(0).getKey());
                    throw null;
                }
            }
            i0.super.p();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return i0.super.r((Comparable) obj, obj2);
        }
    }

    public class c extends f {
        public c() {
            super(i0.this, (a) null);
        }

        public Iterator iterator() {
            return new b(i0.this, (a) null);
        }

        public /* synthetic */ c(i0 i0Var, a aVar) {
            this();
        }
    }

    public class d implements Map.Entry, Comparable {

        /* renamed from: e  reason: collision with root package name */
        public final Comparable f5144e;

        /* renamed from: f  reason: collision with root package name */
        public Object f5145f;

        public d(i0 i0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: b */
        public int compareTo(d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return f(this.f5144e, entry.getKey()) && f(this.f5145f, entry.getValue());
        }

        public final boolean f(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        public Object getValue() {
            return this.f5145f;
        }

        public int hashCode() {
            Comparable comparable = this.f5144e;
            int i4 = 0;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f5145f;
            if (obj != null) {
                i4 = obj.hashCode();
            }
            return hashCode ^ i4;
        }

        /* renamed from: k */
        public Comparable getKey() {
            return this.f5144e;
        }

        public Object setValue(Object obj) {
            i0.this.g();
            Object obj2 = this.f5145f;
            this.f5145f = obj;
            return obj2;
        }

        public String toString() {
            return this.f5144e + "=" + this.f5145f;
        }

        public d(Comparable comparable, Object obj) {
            this.f5144e = comparable;
            this.f5145f = obj;
        }
    }

    public class f extends AbstractSet {
        public f() {
        }

        public void clear() {
            i0.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = i0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator iterator() {
            return new e(i0.this, (a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            i0.this.remove(entry.getKey());
            return true;
        }

        /* renamed from: s */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            i0.this.r((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public int size() {
            return i0.this.size();
        }

        public /* synthetic */ f(i0 i0Var, a aVar) {
            this();
        }
    }

    public /* synthetic */ i0(a aVar) {
        this();
    }

    public static i0 q() {
        return new a();
    }

    public void clear() {
        g();
        if (!this.f5134e.isEmpty()) {
            this.f5134e.clear();
        }
        if (!this.f5135f.isEmpty()) {
            this.f5135f.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f5135f.containsKey(comparable);
    }

    public Set entrySet() {
        if (this.f5137h == null) {
            this.f5137h = new f(this, (a) null);
        }
        return this.f5137h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        int size = size();
        if (size != i0Var.size()) {
            return false;
        }
        int k4 = k();
        if (k4 != i0Var.k()) {
            return entrySet().equals(i0Var.entrySet());
        }
        for (int i4 = 0; i4 < k4; i4++) {
            if (!j(i4).equals(i0Var.j(i4))) {
                return false;
            }
        }
        if (k4 != size) {
            return this.f5135f.equals(i0Var.f5135f);
        }
        return true;
    }

    public final int f(Comparable comparable) {
        int i4;
        int size = this.f5134e.size();
        int i5 = size - 1;
        if (i5 >= 0) {
            int compareTo = comparable.compareTo(((d) this.f5134e.get(i5)).getKey());
            if (compareTo > 0) {
                i4 = size + 1;
                return -i4;
            } else if (compareTo == 0) {
                return i5;
            }
        }
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) / 2;
            int compareTo2 = comparable.compareTo(((d) this.f5134e.get(i7)).getKey());
            if (compareTo2 < 0) {
                i5 = i7 - 1;
            } else if (compareTo2 <= 0) {
                return i7;
            } else {
                i6 = i7 + 1;
            }
        }
        i4 = i6 + 1;
        return -i4;
    }

    public final void g() {
        if (this.f5136g) {
            throw new UnsupportedOperationException();
        }
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f4 = f(comparable);
        return f4 >= 0 ? ((d) this.f5134e.get(f4)).getValue() : this.f5135f.get(comparable);
    }

    public Set h() {
        if (this.f5139j == null) {
            this.f5139j = new c(this, (a) null);
        }
        return this.f5139j;
    }

    public int hashCode() {
        int k4 = k();
        int i4 = 0;
        for (int i5 = 0; i5 < k4; i5++) {
            i4 += ((d) this.f5134e.get(i5)).hashCode();
        }
        return l() > 0 ? i4 + this.f5135f.hashCode() : i4;
    }

    public final void i() {
        g();
        if (this.f5134e.isEmpty() && !(this.f5134e instanceof ArrayList)) {
            this.f5134e = new ArrayList(16);
        }
    }

    public Map.Entry j(int i4) {
        return (Map.Entry) this.f5134e.get(i4);
    }

    public int k() {
        return this.f5134e.size();
    }

    public int l() {
        return this.f5135f.size();
    }

    public Iterable m() {
        return this.f5135f.isEmpty() ? Collections.emptySet() : this.f5135f.entrySet();
    }

    public final SortedMap n() {
        g();
        if (this.f5135f.isEmpty() && !(this.f5135f instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f5135f = treeMap;
            this.f5138i = treeMap.descendingMap();
        }
        return (SortedMap) this.f5135f;
    }

    public boolean o() {
        return this.f5136g;
    }

    public void p() {
        if (!this.f5136g) {
            this.f5135f = this.f5135f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f5135f);
            this.f5138i = this.f5138i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f5138i);
            this.f5136g = true;
        }
    }

    public Object r(Comparable comparable, Object obj) {
        g();
        int f4 = f(comparable);
        if (f4 >= 0) {
            return ((d) this.f5134e.get(f4)).setValue(obj);
        }
        i();
        int i4 = -(f4 + 1);
        if (i4 >= 16) {
            return n().put(comparable, obj);
        }
        if (this.f5134e.size() == 16) {
            d dVar = (d) this.f5134e.remove(15);
            n().put(dVar.getKey(), dVar.getValue());
        }
        this.f5134e.add(i4, new d(comparable, obj));
        return null;
    }

    public Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f4 = f(comparable);
        if (f4 >= 0) {
            return s(f4);
        }
        if (this.f5135f.isEmpty()) {
            return null;
        }
        return this.f5135f.remove(comparable);
    }

    public final Object s(int i4) {
        g();
        Object value = ((d) this.f5134e.remove(i4)).getValue();
        if (!this.f5135f.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f5134e.add(new d(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public int size() {
        return this.f5134e.size() + this.f5135f.size();
    }

    public class b implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        public int f5140e;

        /* renamed from: f  reason: collision with root package name */
        public Iterator f5141f;

        public b() {
            this.f5140e = i0.this.f5134e.size();
        }

        public final Iterator c() {
            if (this.f5141f == null) {
                this.f5141f = i0.this.f5138i.entrySet().iterator();
            }
            return this.f5141f;
        }

        /* renamed from: d */
        public Map.Entry next() {
            if (c().hasNext()) {
                return (Map.Entry) c().next();
            }
            List b4 = i0.this.f5134e;
            int i4 = this.f5140e - 1;
            this.f5140e = i4;
            return (Map.Entry) b4.get(i4);
        }

        public boolean hasNext() {
            int i4 = this.f5140e;
            return (i4 > 0 && i4 <= i0.this.f5134e.size()) || c().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(i0 i0Var, a aVar) {
            this();
        }
    }

    public class e implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        public int f5147e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5148f;

        /* renamed from: g  reason: collision with root package name */
        public Iterator f5149g;

        public e() {
            this.f5147e = -1;
        }

        public final Iterator c() {
            if (this.f5149g == null) {
                this.f5149g = i0.this.f5135f.entrySet().iterator();
            }
            return this.f5149g;
        }

        /* renamed from: d */
        public Map.Entry next() {
            this.f5148f = true;
            int i4 = this.f5147e + 1;
            this.f5147e = i4;
            return i4 < i0.this.f5134e.size() ? (Map.Entry) i0.this.f5134e.get(this.f5147e) : (Map.Entry) c().next();
        }

        public boolean hasNext() {
            if (this.f5147e + 1 >= i0.this.f5134e.size()) {
                return !i0.this.f5135f.isEmpty() && c().hasNext();
            }
            return true;
        }

        public void remove() {
            if (this.f5148f) {
                this.f5148f = false;
                i0.this.g();
                if (this.f5147e < i0.this.f5134e.size()) {
                    i0 i0Var = i0.this;
                    int i4 = this.f5147e;
                    this.f5147e = i4 - 1;
                    Object unused = i0Var.s(i4);
                    return;
                }
                c().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        public /* synthetic */ e(i0 i0Var, a aVar) {
            this();
        }
    }

    public i0() {
        this.f5134e = Collections.emptyList();
        this.f5135f = Collections.emptyMap();
        this.f5138i = Collections.emptyMap();
    }
}
