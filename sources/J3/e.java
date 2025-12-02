package j3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import v3.l;

public final class e extends C0762a {

    /* renamed from: e  reason: collision with root package name */
    public final d f10955e;

    public e(d dVar) {
        l.e(dVar, "backing");
        this.f10955e = dVar;
    }

    public boolean addAll(Collection collection) {
        l.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f10955e.clear();
    }

    public boolean containsAll(Collection collection) {
        l.e(collection, "elements");
        return this.f10955e.n(collection);
    }

    public boolean isEmpty() {
        return this.f10955e.isEmpty();
    }

    public Iterator iterator() {
        return this.f10955e.s();
    }

    public boolean removeAll(Collection collection) {
        l.e(collection, "elements");
        this.f10955e.l();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        l.e(collection, "elements");
        this.f10955e.l();
        return super.retainAll(collection);
    }

    public int s() {
        return this.f10955e.size();
    }

    public boolean u(Map.Entry entry) {
        l.e(entry, "element");
        return this.f10955e.o(entry);
    }

    public boolean v(Map.Entry entry) {
        l.e(entry, "element");
        return this.f10955e.I(entry);
    }

    /* renamed from: w */
    public boolean add(Map.Entry entry) {
        l.e(entry, "element");
        throw new UnsupportedOperationException();
    }
}
