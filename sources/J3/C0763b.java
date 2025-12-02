package j3;

import i3.C0726c;
import i3.C0728e;
import i3.C0734k;
import i3.C0737n;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import v3.g;
import v3.l;

/* renamed from: j3.b  reason: case insensitive filesystem */
public final class C0763b extends C0728e implements List, RandomAccess, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final C0182b f10915h = new C0182b((g) null);

    /* renamed from: i  reason: collision with root package name */
    public static final C0763b f10916i;

    /* renamed from: e  reason: collision with root package name */
    public Object[] f10917e;

    /* renamed from: f  reason: collision with root package name */
    public int f10918f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10919g;

    /* renamed from: j3.b$a */
    public static final class a extends C0728e implements List, RandomAccess, Serializable {

        /* renamed from: e  reason: collision with root package name */
        public Object[] f10920e;

        /* renamed from: f  reason: collision with root package name */
        public final int f10921f;

        /* renamed from: g  reason: collision with root package name */
        public int f10922g;

        /* renamed from: h  reason: collision with root package name */
        public final a f10923h;

        /* renamed from: i  reason: collision with root package name */
        public final C0763b f10924i;

        /* renamed from: j3.b$a$a  reason: collision with other inner class name */
        public static final class C0181a implements ListIterator {

            /* renamed from: e  reason: collision with root package name */
            public final a f10925e;

            /* renamed from: f  reason: collision with root package name */
            public int f10926f;

            /* renamed from: g  reason: collision with root package name */
            public int f10927g = -1;

            /* renamed from: h  reason: collision with root package name */
            public int f10928h;

            public C0181a(a aVar, int i4) {
                l.e(aVar, "list");
                this.f10925e = aVar;
                this.f10926f = i4;
                this.f10928h = aVar.modCount;
            }

            public void add(Object obj) {
                c();
                a aVar = this.f10925e;
                int i4 = this.f10926f;
                this.f10926f = i4 + 1;
                aVar.add(i4, obj);
                this.f10927g = -1;
                this.f10928h = this.f10925e.modCount;
            }

            public final void c() {
                if (this.f10925e.f10924i.modCount != this.f10928h) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                return this.f10926f < this.f10925e.f10922g;
            }

            public boolean hasPrevious() {
                return this.f10926f > 0;
            }

            public Object next() {
                c();
                if (this.f10926f < this.f10925e.f10922g) {
                    int i4 = this.f10926f;
                    this.f10926f = i4 + 1;
                    this.f10927g = i4;
                    return this.f10925e.f10920e[this.f10925e.f10921f + this.f10927g];
                }
                throw new NoSuchElementException();
            }

            public int nextIndex() {
                return this.f10926f;
            }

            public Object previous() {
                c();
                int i4 = this.f10926f;
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    this.f10926f = i5;
                    this.f10927g = i5;
                    return this.f10925e.f10920e[this.f10925e.f10921f + this.f10927g];
                }
                throw new NoSuchElementException();
            }

            public int previousIndex() {
                return this.f10926f - 1;
            }

            public void remove() {
                c();
                int i4 = this.f10927g;
                if (i4 != -1) {
                    this.f10925e.remove(i4);
                    this.f10926f = this.f10927g;
                    this.f10927g = -1;
                    this.f10928h = this.f10925e.modCount;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }

            public void set(Object obj) {
                c();
                int i4 = this.f10927g;
                if (i4 != -1) {
                    this.f10925e.set(i4, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
        }

        public a(Object[] objArr, int i4, int i5, a aVar, C0763b bVar) {
            l.e(objArr, "backing");
            l.e(bVar, "root");
            this.f10920e = objArr;
            this.f10921f = i4;
            this.f10922g = i5;
            this.f10923h = aVar;
            this.f10924i = bVar;
            this.modCount = bVar.modCount;
        }

        private final void F() {
            this.modCount++;
        }

        public final void A(int i4, Object obj) {
            F();
            a aVar = this.f10923h;
            if (aVar != null) {
                aVar.A(i4, obj);
            } else {
                this.f10924i.E(i4, obj);
            }
            this.f10920e = this.f10924i.f10917e;
            this.f10922g++;
        }

        public final void B() {
            if (this.f10924i.modCount != this.modCount) {
                throw new ConcurrentModificationException();
            }
        }

        public final void C() {
            if (E()) {
                throw new UnsupportedOperationException();
            }
        }

        public final boolean D(List list) {
            return c.h(this.f10920e, this.f10921f, this.f10922g, list);
        }

        public final boolean E() {
            return this.f10924i.f10919g;
        }

        public final Object G(int i4) {
            F();
            a aVar = this.f10923h;
            this.f10922g--;
            return aVar != null ? aVar.G(i4) : this.f10924i.M(i4);
        }

        public final void H(int i4, int i5) {
            if (i5 > 0) {
                F();
            }
            a aVar = this.f10923h;
            if (aVar != null) {
                aVar.H(i4, i5);
            } else {
                this.f10924i.N(i4, i5);
            }
            this.f10922g -= i5;
        }

        public final int I(int i4, int i5, Collection collection, boolean z4) {
            a aVar = this.f10923h;
            int I4 = aVar != null ? aVar.I(i4, i5, collection, z4) : this.f10924i.O(i4, i5, collection, z4);
            if (I4 > 0) {
                F();
            }
            this.f10922g -= I4;
            return I4;
        }

        public boolean add(Object obj) {
            C();
            B();
            A(this.f10921f + this.f10922g, obj);
            return true;
        }

        public boolean addAll(Collection collection) {
            l.e(collection, "elements");
            C();
            B();
            int size = collection.size();
            z(this.f10921f + this.f10922g, collection, size);
            return size > 0;
        }

        public void clear() {
            C();
            B();
            H(this.f10921f, this.f10922g);
        }

        public boolean equals(Object obj) {
            B();
            return obj == this || ((obj instanceof List) && D((List) obj));
        }

        public Object get(int i4) {
            B();
            C0726c.f10289e.a(i4, this.f10922g);
            return this.f10920e[this.f10921f + i4];
        }

        public int hashCode() {
            B();
            return c.i(this.f10920e, this.f10921f, this.f10922g);
        }

        public int indexOf(Object obj) {
            B();
            for (int i4 = 0; i4 < this.f10922g; i4++) {
                if (l.a(this.f10920e[this.f10921f + i4], obj)) {
                    return i4;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            B();
            return this.f10922g == 0;
        }

        public Iterator iterator() {
            return listIterator(0);
        }

        public int lastIndexOf(Object obj) {
            B();
            for (int i4 = this.f10922g - 1; i4 >= 0; i4--) {
                if (l.a(this.f10920e[this.f10921f + i4], obj)) {
                    return i4;
                }
            }
            return -1;
        }

        public ListIterator listIterator() {
            return listIterator(0);
        }

        public boolean remove(Object obj) {
            C();
            B();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                remove(indexOf);
            }
            return indexOf >= 0;
        }

        public boolean removeAll(Collection collection) {
            l.e(collection, "elements");
            C();
            B();
            return I(this.f10921f, this.f10922g, collection, false) > 0;
        }

        public boolean retainAll(Collection collection) {
            l.e(collection, "elements");
            C();
            B();
            return I(this.f10921f, this.f10922g, collection, true) > 0;
        }

        public int s() {
            B();
            return this.f10922g;
        }

        public Object set(int i4, Object obj) {
            C();
            B();
            C0726c.f10289e.a(i4, this.f10922g);
            Object[] objArr = this.f10920e;
            int i5 = this.f10921f;
            Object obj2 = objArr[i5 + i4];
            objArr[i5 + i4] = obj;
            return obj2;
        }

        public List subList(int i4, int i5) {
            C0726c.f10289e.c(i4, i5, this.f10922g);
            return new a(this.f10920e, this.f10921f + i4, i5 - i4, this, this.f10924i);
        }

        public Object t(int i4) {
            C();
            B();
            C0726c.f10289e.a(i4, this.f10922g);
            return G(this.f10921f + i4);
        }

        public Object[] toArray(Object[] objArr) {
            l.e(objArr, "array");
            B();
            int length = objArr.length;
            int i4 = this.f10922g;
            if (length < i4) {
                Object[] objArr2 = this.f10920e;
                int i5 = this.f10921f;
                Object[] copyOfRange = Arrays.copyOfRange(objArr2, i5, i4 + i5, objArr.getClass());
                l.d(copyOfRange, "copyOfRange(...)");
                return copyOfRange;
            }
            Object[] objArr3 = this.f10920e;
            int i6 = this.f10921f;
            C0734k.e(objArr3, objArr, 0, i6, i4 + i6);
            return C0737n.e(this.f10922g, objArr);
        }

        public String toString() {
            B();
            return c.j(this.f10920e, this.f10921f, this.f10922g, this);
        }

        public final void z(int i4, Collection collection, int i5) {
            F();
            a aVar = this.f10923h;
            if (aVar != null) {
                aVar.z(i4, collection, i5);
            } else {
                this.f10924i.D(i4, collection, i5);
            }
            this.f10920e = this.f10924i.f10917e;
            this.f10922g += i5;
        }

        public ListIterator listIterator(int i4) {
            B();
            C0726c.f10289e.b(i4, this.f10922g);
            return new C0181a(this, i4);
        }

        public void add(int i4, Object obj) {
            C();
            B();
            C0726c.f10289e.b(i4, this.f10922g);
            A(this.f10921f + i4, obj);
        }

        public boolean addAll(int i4, Collection collection) {
            l.e(collection, "elements");
            C();
            B();
            C0726c.f10289e.b(i4, this.f10922g);
            int size = collection.size();
            z(this.f10921f + i4, collection, size);
            return size > 0;
        }

        public Object[] toArray() {
            B();
            Object[] objArr = this.f10920e;
            int i4 = this.f10921f;
            return C0734k.i(objArr, i4, this.f10922g + i4);
        }
    }

    /* renamed from: j3.b$b  reason: collision with other inner class name */
    public static final class C0182b {
        public /* synthetic */ C0182b(g gVar) {
            this();
        }

        public C0182b() {
        }
    }

    /* renamed from: j3.b$c */
    public static final class c implements ListIterator {

        /* renamed from: e  reason: collision with root package name */
        public final C0763b f10929e;

        /* renamed from: f  reason: collision with root package name */
        public int f10930f;

        /* renamed from: g  reason: collision with root package name */
        public int f10931g = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f10932h;

        public c(C0763b bVar, int i4) {
            l.e(bVar, "list");
            this.f10929e = bVar;
            this.f10930f = i4;
            this.f10932h = bVar.modCount;
        }

        public void add(Object obj) {
            c();
            C0763b bVar = this.f10929e;
            int i4 = this.f10930f;
            this.f10930f = i4 + 1;
            bVar.add(i4, obj);
            this.f10931g = -1;
            this.f10932h = this.f10929e.modCount;
        }

        public final void c() {
            if (this.f10929e.modCount != this.f10932h) {
                throw new ConcurrentModificationException();
            }
        }

        public boolean hasNext() {
            return this.f10930f < this.f10929e.f10918f;
        }

        public boolean hasPrevious() {
            return this.f10930f > 0;
        }

        public Object next() {
            c();
            if (this.f10930f < this.f10929e.f10918f) {
                int i4 = this.f10930f;
                this.f10930f = i4 + 1;
                this.f10931g = i4;
                return this.f10929e.f10917e[this.f10931g];
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.f10930f;
        }

        public Object previous() {
            c();
            int i4 = this.f10930f;
            if (i4 > 0) {
                int i5 = i4 - 1;
                this.f10930f = i5;
                this.f10931g = i5;
                return this.f10929e.f10917e[this.f10931g];
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f10930f - 1;
        }

        public void remove() {
            c();
            int i4 = this.f10931g;
            if (i4 != -1) {
                this.f10929e.remove(i4);
                this.f10930f = this.f10931g;
                this.f10931g = -1;
                this.f10932h = this.f10929e.modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }

        public void set(Object obj) {
            c();
            int i4 = this.f10931g;
            if (i4 != -1) {
                this.f10929e.set(i4, obj);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
    }

    static {
        C0763b bVar = new C0763b(0);
        bVar.f10919g = true;
        f10916i = bVar;
    }

    public C0763b(int i4) {
        this.f10917e = c.d(i4);
    }

    /* access modifiers changed from: private */
    public final void D(int i4, Collection collection, int i5) {
        L();
        K(i4, i5);
        Iterator it = collection.iterator();
        for (int i6 = 0; i6 < i5; i6++) {
            this.f10917e[i4 + i6] = it.next();
        }
    }

    /* access modifiers changed from: private */
    public final void E(int i4, Object obj) {
        L();
        K(i4, 1);
        this.f10917e[i4] = obj;
    }

    private final void G() {
        if (this.f10919g) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean H(List list) {
        return c.h(this.f10917e, 0, this.f10918f, list);
    }

    private final void L() {
        this.modCount++;
    }

    /* access modifiers changed from: private */
    public final Object M(int i4) {
        L();
        Object[] objArr = this.f10917e;
        Object obj = objArr[i4];
        C0734k.e(objArr, objArr, i4, i4 + 1, this.f10918f);
        c.f(this.f10917e, this.f10918f - 1);
        this.f10918f--;
        return obj;
    }

    /* access modifiers changed from: private */
    public final void N(int i4, int i5) {
        if (i5 > 0) {
            L();
        }
        Object[] objArr = this.f10917e;
        C0734k.e(objArr, objArr, i4, i4 + i5, this.f10918f);
        Object[] objArr2 = this.f10917e;
        int i6 = this.f10918f;
        c.g(objArr2, i6 - i5, i6);
        this.f10918f -= i5;
    }

    /* access modifiers changed from: private */
    public final int O(int i4, int i5, Collection collection, boolean z4) {
        int i6 = 0;
        int i7 = 0;
        while (i6 < i5) {
            int i8 = i4 + i6;
            if (collection.contains(this.f10917e[i8]) == z4) {
                Object[] objArr = this.f10917e;
                i6++;
                objArr[i7 + i4] = objArr[i8];
                i7++;
            } else {
                i6++;
            }
        }
        int i9 = i5 - i7;
        Object[] objArr2 = this.f10917e;
        C0734k.e(objArr2, objArr2, i4 + i7, i5 + i4, this.f10918f);
        Object[] objArr3 = this.f10917e;
        int i10 = this.f10918f;
        c.g(objArr3, i10 - i9, i10);
        if (i9 > 0) {
            L();
        }
        this.f10918f -= i9;
        return i9;
    }

    public final List F() {
        G();
        this.f10919g = true;
        return this.f10918f > 0 ? this : f10916i;
    }

    public final void I(int i4) {
        if (i4 >= 0) {
            Object[] objArr = this.f10917e;
            if (i4 > objArr.length) {
                this.f10917e = c.e(this.f10917e, C0726c.f10289e.d(objArr.length, i4));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    public final void J(int i4) {
        I(this.f10918f + i4);
    }

    public final void K(int i4, int i5) {
        J(i5);
        Object[] objArr = this.f10917e;
        C0734k.e(objArr, objArr, i4 + i5, i4, this.f10918f);
        this.f10918f += i5;
    }

    public boolean add(Object obj) {
        G();
        E(this.f10918f, obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        l.e(collection, "elements");
        G();
        int size = collection.size();
        D(this.f10918f, collection, size);
        return size > 0;
    }

    public void clear() {
        G();
        N(0, this.f10918f);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && H((List) obj));
    }

    public Object get(int i4) {
        C0726c.f10289e.a(i4, this.f10918f);
        return this.f10917e[i4];
    }

    public int hashCode() {
        return c.i(this.f10917e, 0, this.f10918f);
    }

    public int indexOf(Object obj) {
        for (int i4 = 0; i4 < this.f10918f; i4++) {
            if (l.a(this.f10917e[i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f10918f == 0;
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        for (int i4 = this.f10918f - 1; i4 >= 0; i4--) {
            if (l.a(this.f10917e[i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public boolean remove(Object obj) {
        G();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    public boolean removeAll(Collection collection) {
        l.e(collection, "elements");
        G();
        return O(0, this.f10918f, collection, false) > 0;
    }

    public boolean retainAll(Collection collection) {
        l.e(collection, "elements");
        G();
        return O(0, this.f10918f, collection, true) > 0;
    }

    public int s() {
        return this.f10918f;
    }

    public Object set(int i4, Object obj) {
        G();
        C0726c.f10289e.a(i4, this.f10918f);
        Object[] objArr = this.f10917e;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    public List subList(int i4, int i5) {
        C0726c.f10289e.c(i4, i5, this.f10918f);
        return new a(this.f10917e, i4, i5 - i4, (a) null, this);
    }

    public Object t(int i4) {
        G();
        C0726c.f10289e.a(i4, this.f10918f);
        return M(i4);
    }

    public Object[] toArray(Object[] objArr) {
        l.e(objArr, "array");
        int length = objArr.length;
        int i4 = this.f10918f;
        if (length < i4) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f10917e, 0, i4, objArr.getClass());
            l.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        C0734k.e(this.f10917e, objArr, 0, 0, i4);
        return C0737n.e(this.f10918f, objArr);
    }

    public String toString() {
        return c.j(this.f10917e, 0, this.f10918f, this);
    }

    public ListIterator listIterator(int i4) {
        C0726c.f10289e.b(i4, this.f10918f);
        return new c(this, i4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0763b(int i4, int i5, g gVar) {
        this((i5 & 1) != 0 ? 10 : i4);
    }

    public void add(int i4, Object obj) {
        G();
        C0726c.f10289e.b(i4, this.f10918f);
        E(i4, obj);
    }

    public boolean addAll(int i4, Collection collection) {
        l.e(collection, "elements");
        G();
        C0726c.f10289e.b(i4, this.f10918f);
        int size = collection.size();
        D(i4, collection, size);
        return size > 0;
    }

    public Object[] toArray() {
        return C0734k.i(this.f10917e, 0, this.f10918f);
    }
}
