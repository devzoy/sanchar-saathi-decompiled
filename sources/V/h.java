package v;

public class h implements Cloneable {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f12399i = new Object();

    /* renamed from: e  reason: collision with root package name */
    public boolean f12400e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f12401f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f12402g;

    /* renamed from: h  reason: collision with root package name */
    public int f12403h;

    public h() {
        this(10);
    }

    public void a(int i4, Object obj) {
        int i5 = this.f12403h;
        if (i5 == 0 || i4 > this.f12401f[i5 - 1]) {
            if (this.f12400e && i5 >= this.f12401f.length) {
                g();
            }
            int i6 = this.f12403h;
            if (i6 >= this.f12401f.length) {
                int e4 = c.e(i6 + 1);
                int[] iArr = new int[e4];
                Object[] objArr = new Object[e4];
                int[] iArr2 = this.f12401f;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f12402g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f12401f = iArr;
                this.f12402g = objArr;
            }
            this.f12401f[i6] = i4;
            this.f12402g[i6] = obj;
            this.f12403h = i6 + 1;
            return;
        }
        n(i4, obj);
    }

    public void b() {
        int i4 = this.f12403h;
        Object[] objArr = this.f12402g;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f12403h = 0;
        this.f12400e = false;
    }

    /* renamed from: e */
    public h clone() {
        try {
            h hVar = (h) super.clone();
            hVar.f12401f = (int[]) this.f12401f.clone();
            hVar.f12402g = (Object[]) this.f12402g.clone();
            return hVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public final void g() {
        int i4 = this.f12403h;
        int[] iArr = this.f12401f;
        Object[] objArr = this.f12402g;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f12399i) {
                if (i6 != i5) {
                    iArr[i5] = iArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f12400e = false;
        this.f12403h = i5;
    }

    public Object h(int i4) {
        return k(i4, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f12402g[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object k(int r3, java.lang.Object r4) {
        /*
            r2 = this;
            int[] r0 = r2.f12401f
            int r1 = r2.f12403h
            int r3 = v.c.a(r0, r1, r3)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r0 = r2.f12402g
            r3 = r0[r3]
            java.lang.Object r0 = f12399i
            if (r3 != r0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v.h.k(int, java.lang.Object):java.lang.Object");
    }

    public int l(Object obj) {
        if (this.f12400e) {
            g();
        }
        for (int i4 = 0; i4 < this.f12403h; i4++) {
            if (this.f12402g[i4] == obj) {
                return i4;
            }
        }
        return -1;
    }

    public int m(int i4) {
        if (this.f12400e) {
            g();
        }
        return this.f12401f[i4];
    }

    public void n(int i4, Object obj) {
        int a4 = c.a(this.f12401f, this.f12403h, i4);
        if (a4 >= 0) {
            this.f12402g[a4] = obj;
            return;
        }
        int i5 = ~a4;
        int i6 = this.f12403h;
        if (i5 < i6) {
            Object[] objArr = this.f12402g;
            if (objArr[i5] == f12399i) {
                this.f12401f[i5] = i4;
                objArr[i5] = obj;
                return;
            }
        }
        if (this.f12400e && i6 >= this.f12401f.length) {
            g();
            i5 = ~c.a(this.f12401f, this.f12403h, i4);
        }
        int i7 = this.f12403h;
        if (i7 >= this.f12401f.length) {
            int e4 = c.e(i7 + 1);
            int[] iArr = new int[e4];
            Object[] objArr2 = new Object[e4];
            int[] iArr2 = this.f12401f;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f12402g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f12401f = iArr;
            this.f12402g = objArr2;
        }
        int i8 = this.f12403h;
        if (i8 - i5 != 0) {
            int[] iArr3 = this.f12401f;
            int i9 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i9, i8 - i5);
            Object[] objArr4 = this.f12402g;
            System.arraycopy(objArr4, i5, objArr4, i9, this.f12403h - i5);
        }
        this.f12401f[i5] = i4;
        this.f12402g[i5] = obj;
        this.f12403h++;
    }

    public int o() {
        if (this.f12400e) {
            g();
        }
        return this.f12403h;
    }

    public Object p(int i4) {
        if (this.f12400e) {
            g();
        }
        return this.f12402g[i4];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12403h * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f12403h; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(m(i4));
            sb.append('=');
            Object p4 = p(i4);
            if (p4 != this) {
                sb.append(p4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public h(int i4) {
        this.f12400e = false;
        if (i4 == 0) {
            this.f12401f = c.f12361a;
            this.f12402g = c.f12363c;
            return;
        }
        int e4 = c.e(i4);
        this.f12401f = new int[e4];
        this.f12402g = new Object[e4];
    }
}
