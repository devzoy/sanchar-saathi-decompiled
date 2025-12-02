package j3;

import i3.C0729f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import v3.l;

public final class f extends C0729f implements Set {

    /* renamed from: e  reason: collision with root package name */
    public final d f10956e;

    public f(d dVar) {
        l.e(dVar, "backing");
        this.f10956e = dVar;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        l.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f10956e.clear();
    }

    public boolean contains(Object obj) {
        return this.f10956e.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.f10956e.isEmpty();
    }

    public Iterator iterator() {
        return this.f10956e.C();
    }

    public boolean remove(Object obj) {
        return this.f10956e.L(obj);
    }

    public boolean removeAll(Collection collection) {
        l.e(collection, "elements");
        this.f10956e.l();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        l.e(collection, "elements");
        this.f10956e.l();
        return super.retainAll(collection);
    }

    public int s() {
        return this.f10956e.size();
    }
}
