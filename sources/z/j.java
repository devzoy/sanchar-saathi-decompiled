package z;

import java.util.Arrays;
import z.b;

public class j implements b.a {

    /* renamed from: n  reason: collision with root package name */
    public static float f12806n = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    public final int f12807a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f12808b = 16;

    /* renamed from: c  reason: collision with root package name */
    public int f12809c = 16;

    /* renamed from: d  reason: collision with root package name */
    public int[] f12810d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    public int[] f12811e = new int[16];

    /* renamed from: f  reason: collision with root package name */
    public int[] f12812f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    public float[] f12813g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    public int[] f12814h = new int[16];

    /* renamed from: i  reason: collision with root package name */
    public int[] f12815i = new int[16];

    /* renamed from: j  reason: collision with root package name */
    public int f12816j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f12817k = -1;

    /* renamed from: l  reason: collision with root package name */
    public final b f12818l;

    /* renamed from: m  reason: collision with root package name */
    public final c f12819m;

    public j(b bVar, c cVar) {
        this.f12818l = bVar;
        this.f12819m = cVar;
        clear();
    }

    public float a(int i4) {
        int i5 = this.f12816j;
        int i6 = this.f12817k;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 == i4) {
                return this.f12813g[i6];
            }
            i6 = this.f12815i[i6];
            if (i6 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public void b(i iVar, float f4) {
        float f5 = f12806n;
        if (f4 <= (-f5) || f4 >= f5) {
            if (this.f12816j == 0) {
                m(0, iVar, f4);
                l(iVar, 0);
                this.f12817k = 0;
                return;
            }
            int p4 = p(iVar);
            if (p4 != -1) {
                this.f12813g[p4] = f4;
                return;
            }
            if (this.f12816j + 1 >= this.f12808b) {
                o();
            }
            int i4 = this.f12816j;
            int i5 = this.f12817k;
            int i6 = -1;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = this.f12812f[i5];
                int i9 = iVar.f12788c;
                if (i8 == i9) {
                    this.f12813g[i5] = f4;
                    return;
                }
                if (i8 < i9) {
                    i6 = i5;
                }
                i5 = this.f12815i[i5];
                if (i5 == -1) {
                    break;
                }
            }
            q(i6, iVar, f4);
            return;
        }
        d(iVar, true);
    }

    public void c(i iVar, float f4, boolean z4) {
        float f5 = f12806n;
        if (f4 <= (-f5) || f4 >= f5) {
            int p4 = p(iVar);
            if (p4 == -1) {
                b(iVar, f4);
                return;
            }
            float[] fArr = this.f12813g;
            float f6 = fArr[p4] + f4;
            fArr[p4] = f6;
            float f7 = f12806n;
            if (f6 > (-f7) && f6 < f7) {
                fArr[p4] = 0.0f;
                d(iVar, z4);
            }
        }
    }

    public void clear() {
        int i4 = this.f12816j;
        for (int i5 = 0; i5 < i4; i5++) {
            i g4 = g(i5);
            if (g4 != null) {
                g4.c(this.f12818l);
            }
        }
        for (int i6 = 0; i6 < this.f12808b; i6++) {
            this.f12812f[i6] = -1;
            this.f12811e[i6] = -1;
        }
        for (int i7 = 0; i7 < this.f12809c; i7++) {
            this.f12810d[i7] = -1;
        }
        this.f12816j = 0;
        this.f12817k = -1;
    }

    public float d(i iVar, boolean z4) {
        int p4 = p(iVar);
        if (p4 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f4 = this.f12813g[p4];
        if (this.f12817k == p4) {
            this.f12817k = this.f12815i[p4];
        }
        this.f12812f[p4] = -1;
        int[] iArr = this.f12814h;
        int i4 = iArr[p4];
        if (i4 != -1) {
            int[] iArr2 = this.f12815i;
            iArr2[i4] = iArr2[p4];
        }
        int i5 = this.f12815i[p4];
        if (i5 != -1) {
            iArr[i5] = iArr[p4];
        }
        this.f12816j--;
        iVar.f12798m--;
        if (z4) {
            iVar.c(this.f12818l);
        }
        return f4;
    }

    public int e() {
        return this.f12816j;
    }

    public boolean f(i iVar) {
        return p(iVar) != -1;
    }

    public i g(int i4) {
        int i5 = this.f12816j;
        if (i5 == 0) {
            return null;
        }
        int i6 = this.f12817k;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 == i4 && i6 != -1) {
                return this.f12819m.f12751d[this.f12812f[i6]];
            }
            i6 = this.f12815i[i6];
            if (i6 == -1) {
                break;
            }
        }
        return null;
    }

    public void h(float f4) {
        int i4 = this.f12816j;
        int i5 = this.f12817k;
        int i6 = 0;
        while (i6 < i4) {
            float[] fArr = this.f12813g;
            fArr[i5] = fArr[i5] / f4;
            i5 = this.f12815i[i5];
            if (i5 != -1) {
                i6++;
            } else {
                return;
            }
        }
    }

    public float i(b bVar, boolean z4) {
        float j4 = j(bVar.f12742a);
        d(bVar.f12742a, z4);
        j jVar = (j) bVar.f12746e;
        int e4 = jVar.e();
        int i4 = 0;
        int i5 = 0;
        while (i4 < e4) {
            int i6 = jVar.f12812f[i5];
            if (i6 != -1) {
                c(this.f12819m.f12751d[i6], jVar.f12813g[i5] * j4, z4);
                i4++;
            }
            i5++;
        }
        return j4;
    }

    public float j(i iVar) {
        int p4 = p(iVar);
        if (p4 != -1) {
            return this.f12813g[p4];
        }
        return 0.0f;
    }

    public void k() {
        int i4 = this.f12816j;
        int i5 = this.f12817k;
        int i6 = 0;
        while (i6 < i4) {
            float[] fArr = this.f12813g;
            fArr[i5] = fArr[i5] * -1.0f;
            i5 = this.f12815i[i5];
            if (i5 != -1) {
                i6++;
            } else {
                return;
            }
        }
    }

    public final void l(i iVar, int i4) {
        int[] iArr;
        int i5 = iVar.f12788c % this.f12809c;
        int[] iArr2 = this.f12810d;
        int i6 = iArr2[i5];
        if (i6 == -1) {
            iArr2[i5] = i4;
        } else {
            while (true) {
                iArr = this.f12811e;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    break;
                }
                i6 = i7;
            }
            iArr[i6] = i4;
        }
        this.f12811e[i4] = -1;
    }

    public final void m(int i4, i iVar, float f4) {
        this.f12812f[i4] = iVar.f12788c;
        this.f12813g[i4] = f4;
        this.f12814h[i4] = -1;
        this.f12815i[i4] = -1;
        iVar.a(this.f12818l);
        iVar.f12798m++;
        this.f12816j++;
    }

    public final int n() {
        for (int i4 = 0; i4 < this.f12808b; i4++) {
            if (this.f12812f[i4] == -1) {
                return i4;
            }
        }
        return -1;
    }

    public final void o() {
        int i4 = this.f12808b * 2;
        this.f12812f = Arrays.copyOf(this.f12812f, i4);
        this.f12813g = Arrays.copyOf(this.f12813g, i4);
        this.f12814h = Arrays.copyOf(this.f12814h, i4);
        this.f12815i = Arrays.copyOf(this.f12815i, i4);
        this.f12811e = Arrays.copyOf(this.f12811e, i4);
        for (int i5 = this.f12808b; i5 < i4; i5++) {
            this.f12812f[i5] = -1;
            this.f12811e[i5] = -1;
        }
        this.f12808b = i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int p(z.i r4) {
        /*
            r3 = this;
            int r0 = r3.f12816j
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r4 = r4.f12788c
            int r0 = r3.f12809c
            int r0 = r4 % r0
            int[] r2 = r3.f12810d
            r0 = r2[r0]
            if (r0 != r1) goto L_0x0013
            return r1
        L_0x0013:
            int[] r2 = r3.f12812f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x001a
            return r0
        L_0x001a:
            int[] r2 = r3.f12811e
            r0 = r2[r0]
            if (r0 == r1) goto L_0x0027
            int[] r2 = r3.f12812f
            r2 = r2[r0]
            if (r2 == r4) goto L_0x0027
            goto L_0x001a
        L_0x0027:
            if (r0 != r1) goto L_0x002a
            return r1
        L_0x002a:
            int[] r2 = r3.f12812f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x0031
            return r0
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.j.p(z.i):int");
    }

    public final void q(int i4, i iVar, float f4) {
        int n4 = n();
        m(n4, iVar, f4);
        if (i4 != -1) {
            this.f12814h[n4] = i4;
            int[] iArr = this.f12815i;
            iArr[n4] = iArr[i4];
            iArr[i4] = n4;
        } else {
            this.f12814h[n4] = -1;
            if (this.f12816j > 0) {
                this.f12815i[n4] = this.f12817k;
                this.f12817k = n4;
            } else {
                this.f12815i[n4] = -1;
            }
        }
        int i5 = this.f12815i[n4];
        if (i5 != -1) {
            this.f12814h[i5] = n4;
        }
        l(iVar, n4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(z.i r6) {
        /*
            r5 = this;
            int r6 = r6.f12788c
            int r0 = r5.f12809c
            int r0 = r6 % r0
            int[] r1 = r5.f12810d
            r2 = r1[r0]
            r3 = -1
            if (r2 != r3) goto L_0x000e
            return
        L_0x000e:
            int[] r4 = r5.f12812f
            r4 = r4[r2]
            if (r4 != r6) goto L_0x001d
            int[] r6 = r5.f12811e
            r4 = r6[r2]
            r1[r0] = r4
            r6[r2] = r3
            goto L_0x0039
        L_0x001d:
            int[] r0 = r5.f12811e
            r1 = r0[r2]
            if (r1 == r3) goto L_0x002b
            int[] r4 = r5.f12812f
            r4 = r4[r1]
            if (r4 == r6) goto L_0x002b
            r2 = r1
            goto L_0x001d
        L_0x002b:
            if (r1 == r3) goto L_0x0039
            int[] r4 = r5.f12812f
            r4 = r4[r1]
            if (r4 != r6) goto L_0x0039
            r6 = r0[r1]
            r0[r2] = r6
            r0[r1] = r3
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.j.r(z.i):void");
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i4 = this.f12816j;
        for (int i5 = 0; i5 < i4; i5++) {
            i g4 = g(i5);
            if (g4 != null) {
                String str4 = str3 + g4 + " = " + a(i5) + " ";
                int p4 = p(g4);
                String str5 = str4 + "[p: ";
                if (this.f12814h[p4] != -1) {
                    str = str5 + this.f12819m.f12751d[this.f12812f[this.f12814h[p4]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.f12815i[p4] != -1) {
                    str2 = str6 + this.f12819m.f12751d[this.f12812f[this.f12815i[p4]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}
