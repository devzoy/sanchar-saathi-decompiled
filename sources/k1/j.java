package K1;

import java.util.List;
import java.util.Objects;

public final class j extends k {

    /* renamed from: g  reason: collision with root package name */
    public final transient int f1690g;

    /* renamed from: h  reason: collision with root package name */
    public final transient int f1691h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ k f1692i;

    public j(k kVar, int i4, int i5) {
        Objects.requireNonNull(kVar);
        this.f1692i = kVar;
        this.f1690g = i4;
        this.f1691h = i5;
    }

    public final Object get(int i4) {
        w.b(i4, this.f1691h, "index");
        return this.f1692i.get(i4 + this.f1690g);
    }

    public final Object[] s() {
        return this.f1692i.s();
    }

    public final int size() {
        return this.f1691h;
    }

    public final /* bridge */ /* synthetic */ List subList(int i4, int i5) {
        return subList(i4, i5);
    }

    public final int t() {
        return this.f1692i.t() + this.f1690g;
    }

    public final int u() {
        return this.f1692i.t() + this.f1690g + this.f1691h;
    }

    public final k x(int i4, int i5) {
        w.d(i4, i5, this.f1691h);
        int i6 = this.f1690g;
        return this.f1692i.subList(i4 + i6, i5 + i6);
    }
}
