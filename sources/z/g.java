package z;

public class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f12773a;

    /* renamed from: b  reason: collision with root package name */
    public int f12774b;

    public g(int i4) {
        if (i4 > 0) {
            this.f12773a = new Object[i4];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public boolean a(Object obj) {
        int i4 = this.f12774b;
        Object[] objArr = this.f12773a;
        if (i4 >= objArr.length) {
            return false;
        }
        objArr[i4] = obj;
        this.f12774b = i4 + 1;
        return true;
    }

    public Object b() {
        int i4 = this.f12774b;
        if (i4 <= 0) {
            return null;
        }
        int i5 = i4 - 1;
        Object[] objArr = this.f12773a;
        Object obj = objArr[i5];
        objArr[i5] = null;
        this.f12774b = i4 - 1;
        return obj;
    }

    public void c(Object[] objArr, int i4) {
        if (i4 > objArr.length) {
            i4 = objArr.length;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            Object obj = objArr[i5];
            int i6 = this.f12774b;
            Object[] objArr2 = this.f12773a;
            if (i6 < objArr2.length) {
                objArr2[i6] = obj;
                this.f12774b = i6 + 1;
            }
        }
    }
}
