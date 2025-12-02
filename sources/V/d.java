package v;

public class d implements Cloneable {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f12364i = new Object();

    /* renamed from: e  reason: collision with root package name */
    public boolean f12365e;

    /* renamed from: f  reason: collision with root package name */
    public long[] f12366f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f12367g;

    /* renamed from: h  reason: collision with root package name */
    public int f12368h;

    public d() {
        this(10);
    }

    public void a() {
        int i4 = this.f12368h;
        Object[] objArr = this.f12367g;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f12368h = 0;
        this.f12365e = false;
    }

    /* renamed from: b */
    public d clone() {
        try {
            d dVar = (d) super.clone();
            dVar.f12366f = (long[]) this.f12366f.clone();
            dVar.f12367g = (Object[]) this.f12367g.clone();
            return dVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public final void e() {
        int i4 = this.f12368h;
        long[] jArr = this.f12366f;
        Object[] objArr = this.f12367g;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f12364i) {
                if (i6 != i5) {
                    jArr[i5] = jArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f12365e = false;
        this.f12368h = i5;
    }

    public Object g(long j4) {
        return h(j4, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f12367g[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h(long r3, java.lang.Object r5) {
        /*
            r2 = this;
            long[] r0 = r2.f12366f
            int r1 = r2.f12368h
            int r3 = v.c.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r4 = r2.f12367g
            r3 = r4[r3]
            java.lang.Object r4 = f12364i
            if (r3 != r4) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v.d.h(long, java.lang.Object):java.lang.Object");
    }

    public int k(long j4) {
        if (this.f12365e) {
            e();
        }
        return c.b(this.f12366f, this.f12368h, j4);
    }

    public long l(int i4) {
        if (this.f12365e) {
            e();
        }
        return this.f12366f[i4];
    }

    public void m(long j4, Object obj) {
        int b4 = c.b(this.f12366f, this.f12368h, j4);
        if (b4 >= 0) {
            this.f12367g[b4] = obj;
            return;
        }
        int i4 = ~b4;
        int i5 = this.f12368h;
        if (i4 < i5) {
            Object[] objArr = this.f12367g;
            if (objArr[i4] == f12364i) {
                this.f12366f[i4] = j4;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f12365e && i5 >= this.f12366f.length) {
            e();
            i4 = ~c.b(this.f12366f, this.f12368h, j4);
        }
        int i6 = this.f12368h;
        if (i6 >= this.f12366f.length) {
            int f4 = c.f(i6 + 1);
            long[] jArr = new long[f4];
            Object[] objArr2 = new Object[f4];
            long[] jArr2 = this.f12366f;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f12367g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f12366f = jArr;
            this.f12367g = objArr2;
        }
        int i7 = this.f12368h;
        if (i7 - i4 != 0) {
            long[] jArr3 = this.f12366f;
            int i8 = i4 + 1;
            System.arraycopy(jArr3, i4, jArr3, i8, i7 - i4);
            Object[] objArr4 = this.f12367g;
            System.arraycopy(objArr4, i4, objArr4, i8, this.f12368h - i4);
        }
        this.f12366f[i4] = j4;
        this.f12367g[i4] = obj;
        this.f12368h++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f12367g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f12366f
            int r1 = r2.f12368h
            int r3 = v.c.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f12367g
            r0 = r4[r3]
            java.lang.Object r1 = f12364i
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f12365e = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.d.n(long):void");
    }

    public void o(int i4) {
        Object[] objArr = this.f12367g;
        Object obj = objArr[i4];
        Object obj2 = f12364i;
        if (obj != obj2) {
            objArr[i4] = obj2;
            this.f12365e = true;
        }
    }

    public int p() {
        if (this.f12365e) {
            e();
        }
        return this.f12368h;
    }

    public Object q(int i4) {
        if (this.f12365e) {
            e();
        }
        return this.f12367g[i4];
    }

    public String toString() {
        if (p() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12368h * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f12368h; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(l(i4));
            sb.append('=');
            Object q4 = q(i4);
            if (q4 != this) {
                sb.append(q4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public d(int i4) {
        this.f12365e = false;
        if (i4 == 0) {
            this.f12366f = c.f12362b;
            this.f12367g = c.f12363c;
            return;
        }
        int f4 = c.f(i4);
        this.f12366f = new long[f4];
        this.f12367g = new Object[f4];
    }
}
