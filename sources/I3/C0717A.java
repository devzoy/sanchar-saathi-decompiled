package i3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import v3.f;
import v3.l;

/* renamed from: i3.A  reason: case insensitive filesystem */
public final class C0717A implements Set, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final C0717A f10287e = new C0717A();

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
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
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C0747x.f10303e;
    }

    public boolean remove(Object obj) {
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

    public final /* bridge */ int size() {
        return t();
    }

    public int t() {
        return 0;
    }

    public Object[] toArray() {
        return f.a(this);
    }

    public String toString() {
        return "[]";
    }

    public Object[] toArray(Object[] objArr) {
        l.e(objArr, "array");
        return f.b(this, objArr);
    }
}
