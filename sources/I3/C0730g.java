package i3;

import java.util.Collection;
import java.util.Iterator;
import v3.b;
import v3.f;
import v3.l;

/* renamed from: i3.g  reason: case insensitive filesystem */
public final class C0730g implements Collection {

    /* renamed from: e  reason: collision with root package name */
    public final Object[] f10296e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10297f;

    public C0730g(Object[] objArr, boolean z4) {
        l.e(objArr, "values");
        this.f10296e = objArr;
        this.f10297f = z4;
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
        return C0735l.m(this.f10296e, obj);
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
        return this.f10296e.length == 0;
    }

    public Iterator iterator() {
        return b.a(this.f10296e);
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

    public int s() {
        return this.f10296e.length;
    }

    public final /* bridge */ int size() {
        return s();
    }

    public Object[] toArray(Object[] objArr) {
        l.e(objArr, "array");
        return f.b(this, objArr);
    }

    public final Object[] toArray() {
        return C0737n.b(this.f10296e, this.f10297f);
    }
}
