package v;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public b f12377a;

    /* renamed from: b  reason: collision with root package name */
    public c f12378b;

    /* renamed from: c  reason: collision with root package name */
    public e f12379c;

    public final class a implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        public final int f12380e;

        /* renamed from: f  reason: collision with root package name */
        public int f12381f;

        /* renamed from: g  reason: collision with root package name */
        public int f12382g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f12383h = false;

        public a(int i4) {
            this.f12380e = i4;
            this.f12381f = f.this.d();
        }

        public boolean hasNext() {
            return this.f12382g < this.f12381f;
        }

        public Object next() {
            if (hasNext()) {
                Object b4 = f.this.b(this.f12382g, this.f12380e);
                this.f12382g++;
                this.f12383h = true;
                return b4;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f12383h) {
                int i4 = this.f12382g - 1;
                this.f12382g = i4;
                this.f12381f--;
                this.f12383h = false;
                f.this.h(i4);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final class b implements Set {
        public b() {
        }

        public boolean addAll(Collection collection) {
            int d4 = f.this.d();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                f.this.g(entry.getKey(), entry.getValue());
            }
            return d4 != f.this.d();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e4 = f.this.e(entry.getKey());
            if (e4 < 0) {
                return false;
            }
            return c.c(f.this.b(e4, 1), entry.getValue());
        }

        public boolean containsAll(Collection collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        public int hashCode() {
            int i4 = 0;
            for (int d4 = f.this.d() - 1; d4 >= 0; d4--) {
                Object b4 = f.this.b(d4, 0);
                Object b5 = f.this.b(d4, 1);
                i4 += (b4 == null ? 0 : b4.hashCode()) ^ (b5 == null ? 0 : b5.hashCode());
            }
            return i4;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: s */
        public boolean add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public Object[] toArray(Object[] objArr) {
            throw new UnsupportedOperationException();
        }
    }

    public final class c implements Set {
        public c() {
        }

        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            return f.this.e(obj) >= 0;
        }

        public boolean containsAll(Collection collection) {
            return f.j(f.this.c(), collection);
        }

        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        public int hashCode() {
            int i4 = 0;
            for (int d4 = f.this.d() - 1; d4 >= 0; d4--) {
                Object b4 = f.this.b(d4, 0);
                i4 += b4 == null ? 0 : b4.hashCode();
            }
            return i4;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int e4 = f.this.e(obj);
            if (e4 < 0) {
                return false;
            }
            f.this.h(e4);
            return true;
        }

        public boolean removeAll(Collection collection) {
            return f.o(f.this.c(), collection);
        }

        public boolean retainAll(Collection collection) {
            return f.p(f.this.c(), collection);
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(0);
        }

        public Object[] toArray(Object[] objArr) {
            return f.this.r(objArr, 0);
        }
    }

    public final class d implements Iterator, Map.Entry {

        /* renamed from: e  reason: collision with root package name */
        public int f12387e;

        /* renamed from: f  reason: collision with root package name */
        public int f12388f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f12389g = false;

        public d() {
            this.f12387e = f.this.d() - 1;
            this.f12388f = -1;
        }

        /* renamed from: c */
        public Map.Entry next() {
            if (hasNext()) {
                this.f12388f++;
                this.f12389g = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f12389g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return c.c(entry.getKey(), f.this.b(this.f12388f, 0)) && c.c(entry.getValue(), f.this.b(this.f12388f, 1));
            }
        }

        public Object getKey() {
            if (this.f12389g) {
                return f.this.b(this.f12388f, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Object getValue() {
            if (this.f12389g) {
                return f.this.b(this.f12388f, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f12388f < this.f12387e;
        }

        public int hashCode() {
            if (this.f12389g) {
                int i4 = 0;
                Object b4 = f.this.b(this.f12388f, 0);
                Object b5 = f.this.b(this.f12388f, 1);
                int hashCode = b4 == null ? 0 : b4.hashCode();
                if (b5 != null) {
                    i4 = b5.hashCode();
                }
                return hashCode ^ i4;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f12389g) {
                f.this.h(this.f12388f);
                this.f12388f--;
                this.f12387e--;
                this.f12389g = false;
                return;
            }
            throw new IllegalStateException();
        }

        public Object setValue(Object obj) {
            if (this.f12389g) {
                return f.this.i(this.f12388f, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class e implements Collection {
        public e() {
        }

        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            return f.this.f(obj) >= 0;
        }

        public boolean containsAll(Collection collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int f4 = f.this.f(obj);
            if (f4 < 0) {
                return false;
            }
            f.this.h(f4);
            return true;
        }

        public boolean removeAll(Collection collection) {
            int d4 = f.this.d();
            int i4 = 0;
            boolean z4 = false;
            while (i4 < d4) {
                if (collection.contains(f.this.b(i4, 1))) {
                    f.this.h(i4);
                    i4--;
                    d4--;
                    z4 = true;
                }
                i4++;
            }
            return z4;
        }

        public boolean retainAll(Collection collection) {
            int d4 = f.this.d();
            int i4 = 0;
            boolean z4 = false;
            while (i4 < d4) {
                if (!collection.contains(f.this.b(i4, 1))) {
                    f.this.h(i4);
                    i4--;
                    d4--;
                    z4 = true;
                }
                i4++;
            }
            return z4;
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(1);
        }

        public Object[] toArray(Object[] objArr) {
            return f.this.r(objArr, 1);
        }
    }

    public static boolean j(Map map, Collection collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean o(Map map, Collection collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static boolean p(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i4, int i5);

    public abstract Map c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(Object obj, Object obj2);

    public abstract void h(int i4);

    public abstract Object i(int i4, Object obj);

    public Set l() {
        if (this.f12377a == null) {
            this.f12377a = new b();
        }
        return this.f12377a;
    }

    public Set m() {
        if (this.f12378b == null) {
            this.f12378b = new c();
        }
        return this.f12378b;
    }

    public Collection n() {
        if (this.f12379c == null) {
            this.f12379c = new e();
        }
        return this.f12379c;
    }

    public Object[] q(int i4) {
        int d4 = d();
        Object[] objArr = new Object[d4];
        for (int i5 = 0; i5 < d4; i5++) {
            objArr[i5] = b(i5, i4);
        }
        return objArr;
    }

    public Object[] r(Object[] objArr, int i4) {
        int d4 = d();
        if (objArr.length < d4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d4);
        }
        for (int i5 = 0; i5 < d4; i5++) {
            objArr[i5] = b(i5, i4);
        }
        if (objArr.length > d4) {
            objArr[d4] = null;
        }
        return objArr;
    }
}
