package i3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import v3.g;
import v3.l;

/* renamed from: i3.c  reason: case insensitive filesystem */
public abstract class C0726c extends C0725b implements List {

    /* renamed from: e  reason: collision with root package name */
    public static final a f10289e = new a((g) null);

    /* renamed from: i3.c$a */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(int i4, int i5) {
            if (i4 < 0 || i4 >= i5) {
                throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
            }
        }

        public final void b(int i4, int i5) {
            if (i4 < 0 || i4 > i5) {
                throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
            }
        }

        public final void c(int i4, int i5, int i6) {
            if (i4 < 0 || i5 > i6) {
                throw new IndexOutOfBoundsException("fromIndex: " + i4 + ", toIndex: " + i5 + ", size: " + i6);
            } else if (i4 > i5) {
                throw new IllegalArgumentException("fromIndex: " + i4 + " > toIndex: " + i5);
            }
        }

        public final int d(int i4, int i5) {
            int i6 = i4 + (i4 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            return i6 - 2147483639 > 0 ? i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i6;
        }

        public final boolean e(Collection collection, Collection collection2) {
            l.e(collection, "c");
            l.e(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            for (Object a4 : collection) {
                if (!l.a(a4, it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int f(Collection collection) {
            l.e(collection, "c");
            Iterator it = collection.iterator();
            int i4 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i4 = (i4 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i4;
        }

        public a() {
        }
    }

    /* renamed from: i3.c$b */
    public class b implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        public int f10290e;

        public b() {
        }

        public final int c() {
            return this.f10290e;
        }

        public final void d(int i4) {
            this.f10290e = i4;
        }

        public boolean hasNext() {
            return this.f10290e < C0726c.this.size();
        }

        public Object next() {
            if (hasNext()) {
                C0726c cVar = C0726c.this;
                int i4 = this.f10290e;
                this.f10290e = i4 + 1;
                return cVar.get(i4);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: i3.c$c  reason: collision with other inner class name */
    public class C0172c extends b implements ListIterator {
        public C0172c(int i4) {
            super();
            C0726c.f10289e.b(i4, C0726c.this.size());
            d(i4);
        }

        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return c() > 0;
        }

        public int nextIndex() {
            return c();
        }

        public Object previous() {
            if (hasPrevious()) {
                C0726c cVar = C0726c.this;
                d(c() - 1);
                return cVar.get(c());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return c() - 1;
        }

        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: i3.c$d */
    public static final class d extends C0726c implements RandomAccess {

        /* renamed from: f  reason: collision with root package name */
        public final C0726c f10293f;

        /* renamed from: g  reason: collision with root package name */
        public final int f10294g;

        /* renamed from: h  reason: collision with root package name */
        public int f10295h;

        public d(C0726c cVar, int i4, int i5) {
            l.e(cVar, "list");
            this.f10293f = cVar;
            this.f10294g = i4;
            C0726c.f10289e.c(i4, i5, cVar.size());
            this.f10295h = i5 - i4;
        }

        public Object get(int i4) {
            C0726c.f10289e.a(i4, this.f10295h);
            return this.f10293f.get(this.f10294g + i4);
        }

        public int t() {
            return this.f10295h;
        }
    }

    public void add(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f10289e.e(this, (Collection) obj);
    }

    public abstract Object get(int i4);

    public int hashCode() {
        return f10289e.f(this);
    }

    public int indexOf(Object obj) {
        int i4 = 0;
        for (Object a4 : this) {
            if (l.a(a4, obj)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public Iterator iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (l.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new C0172c(0);
    }

    public Object remove(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i4, int i5) {
        return new d(this, i4, i5);
    }

    public ListIterator listIterator(int i4) {
        return new C0172c(i4);
    }
}
