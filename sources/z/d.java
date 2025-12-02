package z;

import A.d;
import A.e;
import java.util.Arrays;
import java.util.HashMap;
import z.i;

public class d {

    /* renamed from: q  reason: collision with root package name */
    public static int f12752q = 1000;

    /* renamed from: r  reason: collision with root package name */
    public static boolean f12753r = true;

    /* renamed from: s  reason: collision with root package name */
    public static long f12754s;

    /* renamed from: t  reason: collision with root package name */
    public static long f12755t;

    /* renamed from: a  reason: collision with root package name */
    public int f12756a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap f12757b;

    /* renamed from: c  reason: collision with root package name */
    public a f12758c;

    /* renamed from: d  reason: collision with root package name */
    public int f12759d;

    /* renamed from: e  reason: collision with root package name */
    public int f12760e;

    /* renamed from: f  reason: collision with root package name */
    public b[] f12761f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12762g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12763h;

    /* renamed from: i  reason: collision with root package name */
    public boolean[] f12764i;

    /* renamed from: j  reason: collision with root package name */
    public int f12765j;

    /* renamed from: k  reason: collision with root package name */
    public int f12766k;

    /* renamed from: l  reason: collision with root package name */
    public int f12767l;

    /* renamed from: m  reason: collision with root package name */
    public final c f12768m;

    /* renamed from: n  reason: collision with root package name */
    public i[] f12769n;

    /* renamed from: o  reason: collision with root package name */
    public int f12770o;

    /* renamed from: p  reason: collision with root package name */
    public a f12771p;

    public interface a {
        i a(d dVar, boolean[] zArr);

        void b(a aVar);

        void c(i iVar);

        void clear();

        i getKey();
    }

    public class b extends b {
        public b(c cVar) {
            this.f12746e = new j(this, cVar);
        }
    }

    public d() {
        this.f12756a = 0;
        this.f12757b = null;
        this.f12759d = 32;
        this.f12760e = 32;
        this.f12761f = null;
        this.f12762g = false;
        this.f12763h = false;
        this.f12764i = new boolean[32];
        this.f12765j = 1;
        this.f12766k = 0;
        this.f12767l = 32;
        this.f12769n = new i[f12752q];
        this.f12770o = 0;
        this.f12761f = new b[32];
        C();
        c cVar = new c();
        this.f12768m = cVar;
        this.f12758c = new h(cVar);
        if (f12753r) {
            this.f12771p = new b(cVar);
        } else {
            this.f12771p = new b(cVar);
        }
    }

    public static b s(d dVar, i iVar, i iVar2, float f4) {
        return dVar.r().j(iVar, iVar2, f4);
    }

    public static e w() {
        return null;
    }

    public void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public final int B(a aVar, boolean z4) {
        for (int i4 = 0; i4 < this.f12765j; i4++) {
            this.f12764i[i4] = false;
        }
        boolean z5 = false;
        int i5 = 0;
        while (!z5) {
            i5++;
            if (i5 >= this.f12765j * 2) {
                return i5;
            }
            if (aVar.getKey() != null) {
                this.f12764i[aVar.getKey().f12788c] = true;
            }
            i a4 = aVar.a(this, this.f12764i);
            if (a4 != null) {
                boolean[] zArr = this.f12764i;
                int i6 = a4.f12788c;
                if (zArr[i6]) {
                    return i5;
                }
                zArr[i6] = true;
            }
            if (a4 != null) {
                float f4 = Float.MAX_VALUE;
                int i7 = -1;
                for (int i8 = 0; i8 < this.f12766k; i8++) {
                    b bVar = this.f12761f[i8];
                    if (bVar.f12742a.f12795j != i.a.UNRESTRICTED && !bVar.f12747f && bVar.t(a4)) {
                        float j4 = bVar.f12746e.j(a4);
                        if (j4 < 0.0f) {
                            float f5 = (-bVar.f12743b) / j4;
                            if (f5 < f4) {
                                i7 = i8;
                                f4 = f5;
                            }
                        }
                    }
                }
                if (i7 > -1) {
                    b bVar2 = this.f12761f[i7];
                    bVar2.f12742a.f12789d = -1;
                    bVar2.y(a4);
                    i iVar = bVar2.f12742a;
                    iVar.f12789d = i7;
                    iVar.g(bVar2);
                }
            } else {
                z5 = true;
            }
        }
        return i5;
    }

    public final void C() {
        int i4 = 0;
        if (f12753r) {
            while (true) {
                b[] bVarArr = this.f12761f;
                if (i4 < bVarArr.length) {
                    b bVar = bVarArr[i4];
                    if (bVar != null) {
                        this.f12768m.f12748a.a(bVar);
                    }
                    this.f12761f[i4] = null;
                    i4++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                b[] bVarArr2 = this.f12761f;
                if (i4 < bVarArr2.length) {
                    b bVar2 = bVarArr2[i4];
                    if (bVar2 != null) {
                        this.f12768m.f12749b.a(bVar2);
                    }
                    this.f12761f[i4] = null;
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public void D() {
        c cVar;
        int i4 = 0;
        while (true) {
            cVar = this.f12768m;
            i[] iVarArr = cVar.f12751d;
            if (i4 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i4];
            if (iVar != null) {
                iVar.d();
            }
            i4++;
        }
        cVar.f12750c.c(this.f12769n, this.f12770o);
        this.f12770o = 0;
        Arrays.fill(this.f12768m.f12751d, (Object) null);
        HashMap hashMap = this.f12757b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f12756a = 0;
        this.f12758c.clear();
        this.f12765j = 1;
        for (int i5 = 0; i5 < this.f12766k; i5++) {
            this.f12761f[i5].f12744c = false;
        }
        C();
        this.f12766k = 0;
        if (f12753r) {
            this.f12771p = new b(this.f12768m);
        } else {
            this.f12771p = new b(this.f12768m);
        }
    }

    public final i a(i.a aVar, String str) {
        i iVar = (i) this.f12768m.f12750c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
            iVar.f(aVar, str);
        } else {
            iVar.d();
            iVar.f(aVar, str);
        }
        int i4 = this.f12770o;
        int i5 = f12752q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f12752q = i6;
            this.f12769n = (i[]) Arrays.copyOf(this.f12769n, i6);
        }
        i[] iVarArr = this.f12769n;
        int i7 = this.f12770o;
        this.f12770o = i7 + 1;
        iVarArr[i7] = iVar;
        return iVar;
    }

    public void b(e eVar, e eVar2, float f4, int i4) {
        e eVar3 = eVar;
        e eVar4 = eVar2;
        d.b bVar = d.b.LEFT;
        i q4 = q(eVar3.k(bVar));
        d.b bVar2 = d.b.TOP;
        i q5 = q(eVar3.k(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q6 = q(eVar3.k(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q7 = q(eVar3.k(bVar4));
        i q8 = q(eVar4.k(bVar));
        i q9 = q(eVar4.k(bVar2));
        i q10 = q(eVar4.k(bVar3));
        i q11 = q(eVar4.k(bVar4));
        b r4 = r();
        double d4 = (double) f4;
        i iVar = q10;
        double d5 = (double) i4;
        r4.q(q5, q7, q9, q11, (float) (Math.sin(d4) * d5));
        d(r4);
        b r5 = r();
        r5.q(q4, q6, q8, iVar, (float) (Math.cos(d4) * d5));
        d(r5);
    }

    public void c(i iVar, i iVar2, int i4, float f4, i iVar3, i iVar4, int i5, int i6) {
        int i7 = i6;
        b r4 = r();
        r4.h(iVar, iVar2, i4, f4, iVar3, iVar4, i5);
        if (i7 != 8) {
            r4.d(this, i7);
        }
        d(r4);
    }

    public void d(b bVar) {
        i w4;
        if (bVar != null) {
            boolean z4 = true;
            if (this.f12766k + 1 >= this.f12767l || this.f12765j + 1 >= this.f12760e) {
                y();
            }
            boolean z5 = false;
            if (!bVar.f12747f) {
                bVar.D(this);
                if (!bVar.u()) {
                    bVar.r();
                    if (bVar.f(this)) {
                        i p4 = p();
                        bVar.f12742a = p4;
                        l(bVar);
                        this.f12771p.b(bVar);
                        B(this.f12771p, true);
                        if (p4.f12789d == -1) {
                            if (bVar.f12742a == p4 && (w4 = bVar.w(p4)) != null) {
                                bVar.y(w4);
                            }
                            if (!bVar.f12747f) {
                                bVar.f12742a.g(bVar);
                            }
                            this.f12766k--;
                        }
                    } else {
                        z4 = false;
                    }
                    if (bVar.s()) {
                        z5 = z4;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z5) {
                l(bVar);
            }
        }
    }

    public b e(i iVar, i iVar2, int i4, int i5) {
        if (i5 == 8 && iVar2.f12792g && iVar.f12789d == -1) {
            iVar.e(this, iVar2.f12791f + ((float) i4));
            return null;
        }
        b r4 = r();
        r4.n(iVar, iVar2, i4);
        if (i5 != 8) {
            r4.d(this, i5);
        }
        d(r4);
        return r4;
    }

    public void f(i iVar, int i4) {
        int i5 = iVar.f12789d;
        if (i5 == -1) {
            iVar.e(this, (float) i4);
        } else if (i5 != -1) {
            b bVar = this.f12761f[i5];
            if (bVar.f12747f) {
                bVar.f12743b = (float) i4;
            } else if (bVar.f12746e.e() == 0) {
                bVar.f12747f = true;
                bVar.f12743b = (float) i4;
            } else {
                b r4 = r();
                r4.m(iVar, i4);
                d(r4);
            }
        } else {
            b r5 = r();
            r5.i(iVar, i4);
            d(r5);
        }
    }

    public void g(i iVar, i iVar2, int i4, boolean z4) {
        b r4 = r();
        i t4 = t();
        t4.f12790e = 0;
        r4.o(iVar, iVar2, t4, i4);
        d(r4);
    }

    public void h(i iVar, i iVar2, int i4, int i5) {
        b r4 = r();
        i t4 = t();
        t4.f12790e = 0;
        r4.o(iVar, iVar2, t4, i4);
        if (i5 != 8) {
            m(r4, (int) (r4.f12746e.j(t4) * -1.0f), i5);
        }
        d(r4);
    }

    public void i(i iVar, i iVar2, int i4, boolean z4) {
        b r4 = r();
        i t4 = t();
        t4.f12790e = 0;
        r4.p(iVar, iVar2, t4, i4);
        d(r4);
    }

    public void j(i iVar, i iVar2, int i4, int i5) {
        b r4 = r();
        i t4 = t();
        t4.f12790e = 0;
        r4.p(iVar, iVar2, t4, i4);
        if (i5 != 8) {
            m(r4, (int) (r4.f12746e.j(t4) * -1.0f), i5);
        }
        d(r4);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f4, int i4) {
        b r4 = r();
        r4.k(iVar, iVar2, iVar3, iVar4, f4);
        if (i4 != 8) {
            r4.d(this, i4);
        }
        d(r4);
    }

    public final void l(b bVar) {
        if (f12753r) {
            b bVar2 = this.f12761f[this.f12766k];
            if (bVar2 != null) {
                this.f12768m.f12748a.a(bVar2);
            }
        } else {
            b bVar3 = this.f12761f[this.f12766k];
            if (bVar3 != null) {
                this.f12768m.f12749b.a(bVar3);
            }
        }
        b[] bVarArr = this.f12761f;
        int i4 = this.f12766k;
        bVarArr[i4] = bVar;
        i iVar = bVar.f12742a;
        iVar.f12789d = i4;
        this.f12766k = i4 + 1;
        iVar.g(bVar);
    }

    public void m(b bVar, int i4, int i5) {
        bVar.e(o(i5, (String) null), i4);
    }

    public final void n() {
        for (int i4 = 0; i4 < this.f12766k; i4++) {
            b bVar = this.f12761f[i4];
            bVar.f12742a.f12791f = bVar.f12743b;
        }
    }

    public i o(int i4, String str) {
        if (this.f12765j + 1 >= this.f12760e) {
            y();
        }
        i a4 = a(i.a.ERROR, str);
        int i5 = this.f12756a + 1;
        this.f12756a = i5;
        this.f12765j++;
        a4.f12788c = i5;
        a4.f12790e = i4;
        this.f12768m.f12751d[i5] = a4;
        this.f12758c.c(a4);
        return a4;
    }

    public i p() {
        if (this.f12765j + 1 >= this.f12760e) {
            y();
        }
        i a4 = a(i.a.SLACK, (String) null);
        int i4 = this.f12756a + 1;
        this.f12756a = i4;
        this.f12765j++;
        a4.f12788c = i4;
        this.f12768m.f12751d[i4] = a4;
        return a4;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f12765j + 1 >= this.f12760e) {
            y();
        }
        if (obj instanceof A.d) {
            A.d dVar = (A.d) obj;
            iVar = dVar.e();
            if (iVar == null) {
                dVar.l(this.f12768m);
                iVar = dVar.e();
            }
            int i4 = iVar.f12788c;
            if (i4 == -1 || i4 > this.f12756a || this.f12768m.f12751d[i4] == null) {
                if (i4 != -1) {
                    iVar.d();
                }
                int i5 = this.f12756a + 1;
                this.f12756a = i5;
                this.f12765j++;
                iVar.f12788c = i5;
                iVar.f12795j = i.a.UNRESTRICTED;
                this.f12768m.f12751d[i5] = iVar;
            }
        }
        return iVar;
    }

    public b r() {
        b bVar;
        if (f12753r) {
            bVar = (b) this.f12768m.f12748a.b();
            if (bVar == null) {
                bVar = new b(this.f12768m);
                f12755t++;
            } else {
                bVar.z();
            }
        } else {
            bVar = (b) this.f12768m.f12749b.b();
            if (bVar == null) {
                bVar = new b(this.f12768m);
                f12754s++;
            } else {
                bVar.z();
            }
        }
        i.b();
        return bVar;
    }

    public i t() {
        if (this.f12765j + 1 >= this.f12760e) {
            y();
        }
        i a4 = a(i.a.SLACK, (String) null);
        int i4 = this.f12756a + 1;
        this.f12756a = i4;
        this.f12765j++;
        a4.f12788c = i4;
        this.f12768m.f12751d[i4] = a4;
        return a4;
    }

    public final int u(a aVar) {
        for (int i4 = 0; i4 < this.f12766k; i4++) {
            b bVar = this.f12761f[i4];
            if (bVar.f12742a.f12795j != i.a.UNRESTRICTED && bVar.f12743b < 0.0f) {
                boolean z4 = false;
                int i5 = 0;
                while (!z4) {
                    i5++;
                    float f4 = Float.MAX_VALUE;
                    int i6 = -1;
                    int i7 = -1;
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        if (i8 >= this.f12766k) {
                            break;
                        }
                        b bVar2 = this.f12761f[i8];
                        if (bVar2.f12742a.f12795j != i.a.UNRESTRICTED && !bVar2.f12747f && bVar2.f12743b < 0.0f) {
                            for (int i10 = 1; i10 < this.f12765j; i10++) {
                                i iVar = this.f12768m.f12751d[i10];
                                float j4 = bVar2.f12746e.j(iVar);
                                if (j4 > 0.0f) {
                                    for (int i11 = 0; i11 < 9; i11++) {
                                        float f5 = iVar.f12793h[i11] / j4;
                                        if ((f5 < f4 && i11 == i9) || i11 > i9) {
                                            f4 = f5;
                                            i6 = i8;
                                            i7 = i10;
                                            i9 = i11;
                                        }
                                    }
                                }
                            }
                        }
                        i8++;
                    }
                    if (i6 != -1) {
                        b bVar3 = this.f12761f[i6];
                        bVar3.f12742a.f12789d = -1;
                        bVar3.y(this.f12768m.f12751d[i7]);
                        i iVar2 = bVar3.f12742a;
                        iVar2.f12789d = i6;
                        iVar2.g(bVar3);
                    } else {
                        z4 = true;
                    }
                    if (i5 > this.f12765j / 2) {
                        z4 = true;
                    }
                }
                return i5;
            }
        }
        return 0;
    }

    public c v() {
        return this.f12768m;
    }

    public int x(Object obj) {
        i e4 = ((A.d) obj).e();
        if (e4 != null) {
            return (int) (e4.f12791f + 0.5f);
        }
        return 0;
    }

    public final void y() {
        int i4 = this.f12759d * 2;
        this.f12759d = i4;
        this.f12761f = (b[]) Arrays.copyOf(this.f12761f, i4);
        c cVar = this.f12768m;
        cVar.f12751d = (i[]) Arrays.copyOf(cVar.f12751d, this.f12759d);
        int i5 = this.f12759d;
        this.f12764i = new boolean[i5];
        this.f12760e = i5;
        this.f12767l = i5;
    }

    public void z() {
        if (this.f12762g || this.f12763h) {
            for (int i4 = 0; i4 < this.f12766k; i4++) {
                if (!this.f12761f[i4].f12747f) {
                    A(this.f12758c);
                    return;
                }
            }
            n();
            return;
        }
        A(this.f12758c);
    }
}
