package R;

import v3.l;

public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f2435a;

    /* renamed from: b  reason: collision with root package name */
    public int f2436b;

    public e(int i4) {
        if (i4 > 0) {
            this.f2435a = new Object[i4];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public boolean a(Object obj) {
        l.e(obj, "instance");
        if (!c(obj)) {
            int i4 = this.f2436b;
            Object[] objArr = this.f2435a;
            if (i4 >= objArr.length) {
                return false;
            }
            objArr[i4] = obj;
            this.f2436b = i4 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public Object b() {
        int i4 = this.f2436b;
        if (i4 <= 0) {
            return null;
        }
        int i5 = i4 - 1;
        Object obj = this.f2435a[i5];
        l.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f2435a[i5] = null;
        this.f2436b--;
        return obj;
    }

    public final boolean c(Object obj) {
        int i4 = this.f2436b;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.f2435a[i5] == obj) {
                return true;
            }
        }
        return false;
    }
}
