package K1;

import java.util.List;

public final class i extends k {

    /* renamed from: g  reason: collision with root package name */
    public final transient k f1689g;

    public i(k kVar) {
        this.f1689g = kVar;
    }

    public final int D(int i4) {
        return (this.f1689g.size() - 1) - i4;
    }

    public final boolean contains(Object obj) {
        return this.f1689g.contains(obj);
    }

    public final Object get(int i4) {
        k kVar = this.f1689g;
        w.b(i4, kVar.size(), "index");
        return kVar.get(D(i4));
    }

    public final int indexOf(Object obj) {
        int lastIndexOf = this.f1689g.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return D(lastIndexOf);
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        int indexOf = this.f1689g.indexOf(obj);
        if (indexOf >= 0) {
            return D(indexOf);
        }
        return -1;
    }

    public final int size() {
        return this.f1689g.size();
    }

    public final /* bridge */ /* synthetic */ List subList(int i4, int i5) {
        return subList(i4, i5);
    }

    public final k w() {
        return this.f1689g;
    }

    public final k x(int i4, int i5) {
        k kVar = this.f1689g;
        w.d(i4, i5, kVar.size());
        return kVar.subList(kVar.size() - i5, kVar.size() - i4).w();
    }
}
