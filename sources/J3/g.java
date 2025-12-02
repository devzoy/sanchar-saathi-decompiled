package j3;

import i3.C0727d;
import java.util.Collection;
import java.util.Iterator;
import v3.l;

public final class g extends C0727d implements Collection {

    /* renamed from: e  reason: collision with root package name */
    public final d f10957e;

    public g(d dVar) {
        l.e(dVar, "backing");
        this.f10957e = dVar;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        l.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f10957e.clear();
    }

    public boolean contains(Object obj) {
        return this.f10957e.containsValue(obj);
    }

    public boolean isEmpty() {
        return this.f10957e.isEmpty();
    }

    public Iterator iterator() {
        return this.f10957e.O();
    }

    public boolean remove(Object obj) {
        return this.f10957e.M(obj);
    }

    public boolean removeAll(Collection collection) {
        l.e(collection, "elements");
        this.f10957e.l();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        l.e(collection, "elements");
        this.f10957e.l();
        return super.retainAll(collection);
    }

    public int s() {
        return this.f10957e.size();
    }
}
