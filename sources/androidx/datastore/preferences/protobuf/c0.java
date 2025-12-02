package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

public final class c0 extends C0351c implements RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    public static final c0 f5083h = new c0(new Object[0], 0, false);

    /* renamed from: f  reason: collision with root package name */
    public Object[] f5084f;

    /* renamed from: g  reason: collision with root package name */
    public int f5085g;

    public c0(Object[] objArr, int i4, boolean z4) {
        super(z4);
        this.f5084f = objArr;
        this.f5085g = i4;
    }

    public static Object[] t(int i4) {
        return new Object[i4];
    }

    public static c0 u() {
        return f5083h;
    }

    public boolean add(Object obj) {
        s();
        int i4 = this.f5085g;
        Object[] objArr = this.f5084f;
        if (i4 == objArr.length) {
            this.f5084f = Arrays.copyOf(objArr, ((i4 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f5084f;
        int i5 = this.f5085g;
        this.f5085g = i5 + 1;
        objArr2[i5] = obj;
        this.modCount++;
        return true;
    }

    public Object get(int i4) {
        v(i4);
        return this.f5084f[i4];
    }

    public Object remove(int i4) {
        s();
        v(i4);
        Object[] objArr = this.f5084f;
        Object obj = objArr[i4];
        int i5 = this.f5085g;
        if (i4 < i5 - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (i5 - i4) - 1);
        }
        this.f5085g--;
        this.modCount++;
        return obj;
    }

    public Object set(int i4, Object obj) {
        s();
        v(i4);
        Object[] objArr = this.f5084f;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        this.modCount++;
        return obj2;
    }

    public int size() {
        return this.f5085g;
    }

    public final void v(int i4) {
        if (i4 < 0 || i4 >= this.f5085g) {
            throw new IndexOutOfBoundsException(w(i4));
        }
    }

    public final String w(int i4) {
        return "Index:" + i4 + ", Size:" + this.f5085g;
    }

    /* renamed from: x */
    public c0 k(int i4) {
        if (i4 >= this.f5085g) {
            return new c0(Arrays.copyOf(this.f5084f, i4), this.f5085g, true);
        }
        throw new IllegalArgumentException();
    }

    public void add(int i4, Object obj) {
        int i5;
        s();
        if (i4 < 0 || i4 > (i5 = this.f5085g)) {
            throw new IndexOutOfBoundsException(w(i4));
        }
        Object[] objArr = this.f5084f;
        if (i5 < objArr.length) {
            System.arraycopy(objArr, i4, objArr, i4 + 1, i5 - i4);
        } else {
            Object[] t4 = t(((i5 * 3) / 2) + 1);
            System.arraycopy(this.f5084f, 0, t4, 0, i4);
            System.arraycopy(this.f5084f, i4, t4, i4 + 1, this.f5085g - i4);
            this.f5084f = t4;
        }
        this.f5084f[i4] = obj;
        this.f5085g++;
        this.modCount++;
    }
}
