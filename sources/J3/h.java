package j3;

import i3.C0729f;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import v3.g;
import v3.l;

public final class h extends C0729f implements Set, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public static final a f10958f = new a((g) null);

    /* renamed from: g  reason: collision with root package name */
    public static final h f10959g = new h(d.f10933r.e());

    /* renamed from: e  reason: collision with root package name */
    public final d f10960e;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    public h(d dVar) {
        l.e(dVar, "backing");
        this.f10960e = dVar;
    }

    public boolean add(Object obj) {
        return this.f10960e.i(obj) >= 0;
    }

    public boolean addAll(Collection collection) {
        l.e(collection, "elements");
        this.f10960e.l();
        return super.addAll(collection);
    }

    public void clear() {
        this.f10960e.clear();
    }

    public boolean contains(Object obj) {
        return this.f10960e.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.f10960e.isEmpty();
    }

    public Iterator iterator() {
        return this.f10960e.C();
    }

    public boolean remove(Object obj) {
        return this.f10960e.L(obj);
    }

    public boolean removeAll(Collection collection) {
        l.e(collection, "elements");
        this.f10960e.l();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        l.e(collection, "elements");
        this.f10960e.l();
        return super.retainAll(collection);
    }

    public int s() {
        return this.f10960e.size();
    }

    public final Set t() {
        this.f10960e.k();
        return size() > 0 ? this : f10959g;
    }

    public h() {
        this(new d());
    }
}
