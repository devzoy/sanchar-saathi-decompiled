package i3;

import java.util.Collection;
import v3.f;
import v3.l;

/* renamed from: i3.b  reason: case insensitive filesystem */
public abstract class C0725b implements Collection {
    public static final CharSequence u(C0725b bVar, Object obj) {
        return obj == bVar ? "(this Collection)" : String.valueOf(obj);
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object a4 : this) {
            if (l.a(a4, obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        l.e(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return size() == 0;
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

    public final /* bridge */ int size() {
        return t();
    }

    public abstract int t();

    public Object[] toArray() {
        return f.a(this);
    }

    public String toString() {
        return C0746w.A(this, ", ", "[", "]", 0, (CharSequence) null, new C0724a(this), 24, (Object) null);
    }

    public Object[] toArray(Object[] objArr) {
        l.e(objArr, "array");
        return f.b(this, objArr);
    }
}
