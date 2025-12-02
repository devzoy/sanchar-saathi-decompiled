package i3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import v3.f;
import v3.l;

/* renamed from: i3.y  reason: case insensitive filesystem */
public final class C0748y implements List, Serializable, RandomAccess {

    /* renamed from: e  reason: collision with root package name */
    public static final C0748y f10304e = new C0748y();

    public /* bridge */ /* synthetic */ void add(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return s((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        l.e(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return v((Void) obj);
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C0747x.f10303e;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return w((Void) obj);
    }

    public ListIterator listIterator() {
        return C0747x.f10303e;
    }

    public /* bridge */ /* synthetic */ Object remove(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean s(Void voidR) {
        l.e(voidR, "element");
        return false;
    }

    public /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return u();
    }

    public List subList(int i4, int i5) {
        if (i4 == 0 && i5 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i4 + ", toIndex: " + i5);
    }

    /* renamed from: t */
    public Void get(int i4) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i4 + '.');
    }

    public Object[] toArray() {
        return f.a(this);
    }

    public String toString() {
        return "[]";
    }

    public int u() {
        return 0;
    }

    public int v(Void voidR) {
        l.e(voidR, "element");
        return -1;
    }

    public int w(Void voidR) {
        l.e(voidR, "element");
        return -1;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i4) {
        if (i4 == 0) {
            return C0747x.f10303e;
        }
        throw new IndexOutOfBoundsException("Index: " + i4);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        l.e(objArr, "array");
        return f.b(this, objArr);
    }
}
