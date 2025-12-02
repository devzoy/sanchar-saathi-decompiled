package K1;

import java.util.Objects;

public final class m extends k {

    /* renamed from: i  reason: collision with root package name */
    public static final k f1694i = new m(new Object[0], 0);

    /* renamed from: g  reason: collision with root package name */
    public final transient Object[] f1695g;

    /* renamed from: h  reason: collision with root package name */
    public final transient int f1696h;

    public m(Object[] objArr, int i4) {
        this.f1695g = objArr;
        this.f1696h = i4;
    }

    public final Object get(int i4) {
        w.b(i4, this.f1696h, "index");
        Object obj = this.f1695g[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] s() {
        return this.f1695g;
    }

    public final int size() {
        return this.f1696h;
    }

    public final int t() {
        return 0;
    }

    public final int u() {
        return this.f1696h;
    }

    public final int v(Object[] objArr, int i4) {
        Object[] objArr2 = this.f1695g;
        int i5 = this.f1696h;
        System.arraycopy(objArr2, 0, objArr, 0, i5);
        return i5;
    }
}
