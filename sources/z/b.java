package z;

import java.util.ArrayList;
import java.util.Iterator;
import z.d;
import z.i;

public class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public i f12742a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f12743b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12744c = false;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f12745d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public a f12746e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12747f = false;

    public interface a {
        float a(int i4);

        void b(i iVar, float f4);

        void c(i iVar, float f4, boolean z4);

        void clear();

        float d(i iVar, boolean z4);

        int e();

        boolean f(i iVar);

        i g(int i4);

        void h(float f4);

        float i(b bVar, boolean z4);

        float j(i iVar);

        void k();
    }

    public b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
        r7 = r10.f12746e.a(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A() {
        /*
            r10 = this;
            z.i r0 = r10.f12742a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            z.i r1 = r10.f12742a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f12743b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f12743b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L_0x0057
        L_0x0056:
            r1 = r3
        L_0x0057:
            z.b$a r5 = r10.f12746e
            int r5 = r5.e()
        L_0x005d:
            if (r3 >= r5) goto L_0x00ec
            z.b$a r6 = r10.f12746e
            z.i r6 = r6.g(r3)
            if (r6 != 0) goto L_0x0069
            goto L_0x00e8
        L_0x0069:
            z.b$a r7 = r10.f12746e
            float r7 = r7.a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0075
            goto L_0x00e8
        L_0x0075:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0094
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0092:
            float r7 = r7 * r9
            goto L_0x00ba
        L_0x0094:
            if (r8 <= 0) goto L_0x00a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ba
        L_0x00a8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0092
        L_0x00ba:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00d0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e7
        L_0x00d0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e7:
            r1 = r4
        L_0x00e8:
            int r3 = r3 + 1
            goto L_0x005d
        L_0x00ec:
            if (r1 != 0) goto L_0x00ff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00ff:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.b.A():java.lang.String");
    }

    public void B(d dVar, i iVar, boolean z4) {
        if (iVar.f12792g) {
            this.f12743b += iVar.f12791f * this.f12746e.j(iVar);
            this.f12746e.d(iVar, z4);
            if (z4) {
                iVar.c(this);
            }
        }
    }

    public void C(b bVar, boolean z4) {
        this.f12743b += bVar.f12743b * this.f12746e.i(bVar, z4);
        if (z4) {
            bVar.f12742a.c(this);
        }
    }

    public void D(d dVar) {
        if (dVar.f12761f.length != 0) {
            boolean z4 = false;
            while (!z4) {
                int e4 = this.f12746e.e();
                for (int i4 = 0; i4 < e4; i4++) {
                    i g4 = this.f12746e.g(i4);
                    if (g4.f12789d != -1 || g4.f12792g) {
                        this.f12745d.add(g4);
                    }
                }
                if (this.f12745d.size() > 0) {
                    Iterator it = this.f12745d.iterator();
                    while (it.hasNext()) {
                        i iVar = (i) it.next();
                        if (iVar.f12792g) {
                            B(dVar, iVar, true);
                        } else {
                            C(dVar.f12761f[iVar.f12789d], true);
                        }
                    }
                    this.f12745d.clear();
                } else {
                    z4 = true;
                }
            }
        }
    }

    public i a(d dVar, boolean[] zArr) {
        return x(zArr, (i) null);
    }

    public void b(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f12742a = null;
            this.f12746e.clear();
            for (int i4 = 0; i4 < bVar.f12746e.e(); i4++) {
                this.f12746e.c(bVar.f12746e.g(i4), bVar.f12746e.a(i4), true);
            }
        }
    }

    public void c(i iVar) {
        int i4 = iVar.f12790e;
        float f4 = 1.0f;
        if (i4 != 1) {
            if (i4 == 2) {
                f4 = 1000.0f;
            } else if (i4 == 3) {
                f4 = 1000000.0f;
            } else if (i4 == 4) {
                f4 = 1.0E9f;
            } else if (i4 == 5) {
                f4 = 1.0E12f;
            }
        }
        this.f12746e.b(iVar, f4);
    }

    public void clear() {
        this.f12746e.clear();
        this.f12742a = null;
        this.f12743b = 0.0f;
    }

    public b d(d dVar, int i4) {
        this.f12746e.b(dVar.o(i4, "ep"), 1.0f);
        this.f12746e.b(dVar.o(i4, "em"), -1.0f);
        return this;
    }

    public b e(i iVar, int i4) {
        this.f12746e.b(iVar, (float) i4);
        return this;
    }

    public boolean f(d dVar) {
        boolean z4;
        i g4 = g(dVar);
        if (g4 == null) {
            z4 = true;
        } else {
            y(g4);
            z4 = false;
        }
        if (this.f12746e.e() == 0) {
            this.f12747f = true;
        }
        return z4;
    }

    public i g(d dVar) {
        boolean v4;
        boolean v5;
        int e4 = this.f12746e.e();
        i iVar = null;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean z4 = false;
        boolean z5 = false;
        i iVar2 = null;
        for (int i4 = 0; i4 < e4; i4++) {
            float a4 = this.f12746e.a(i4);
            i g4 = this.f12746e.g(i4);
            if (g4.f12795j == i.a.UNRESTRICTED) {
                if (iVar == null) {
                    v5 = v(g4, dVar);
                } else if (f4 > a4) {
                    v5 = v(g4, dVar);
                } else if (!z4 && v(g4, dVar)) {
                    f4 = a4;
                    iVar = g4;
                    z4 = true;
                }
                z4 = v5;
                f4 = a4;
                iVar = g4;
            } else if (iVar == null && a4 < 0.0f) {
                if (iVar2 == null) {
                    v4 = v(g4, dVar);
                } else if (f5 > a4) {
                    v4 = v(g4, dVar);
                } else if (!z5 && v(g4, dVar)) {
                    f5 = a4;
                    iVar2 = g4;
                    z5 = true;
                }
                z5 = v4;
                f5 = a4;
                iVar2 = g4;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    public i getKey() {
        return this.f12742a;
    }

    public b h(i iVar, i iVar2, int i4, float f4, i iVar3, i iVar4, int i5) {
        if (iVar2 == iVar3) {
            this.f12746e.b(iVar, 1.0f);
            this.f12746e.b(iVar4, 1.0f);
            this.f12746e.b(iVar2, -2.0f);
            return this;
        }
        if (f4 == 0.5f) {
            this.f12746e.b(iVar, 1.0f);
            this.f12746e.b(iVar2, -1.0f);
            this.f12746e.b(iVar3, -1.0f);
            this.f12746e.b(iVar4, 1.0f);
            if (i4 > 0 || i5 > 0) {
                this.f12743b = (float) ((-i4) + i5);
            }
        } else if (f4 <= 0.0f) {
            this.f12746e.b(iVar, -1.0f);
            this.f12746e.b(iVar2, 1.0f);
            this.f12743b = (float) i4;
        } else if (f4 >= 1.0f) {
            this.f12746e.b(iVar4, -1.0f);
            this.f12746e.b(iVar3, 1.0f);
            this.f12743b = (float) (-i5);
        } else {
            float f5 = 1.0f - f4;
            this.f12746e.b(iVar, f5 * 1.0f);
            this.f12746e.b(iVar2, f5 * -1.0f);
            this.f12746e.b(iVar3, -1.0f * f4);
            this.f12746e.b(iVar4, 1.0f * f4);
            if (i4 > 0 || i5 > 0) {
                this.f12743b = (((float) (-i4)) * f5) + (((float) i5) * f4);
            }
        }
        return this;
    }

    public b i(i iVar, int i4) {
        this.f12742a = iVar;
        float f4 = (float) i4;
        iVar.f12791f = f4;
        this.f12743b = f4;
        this.f12747f = true;
        return this;
    }

    public b j(i iVar, i iVar2, float f4) {
        this.f12746e.b(iVar, -1.0f);
        this.f12746e.b(iVar2, f4);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f4) {
        this.f12746e.b(iVar, -1.0f);
        this.f12746e.b(iVar2, 1.0f);
        this.f12746e.b(iVar3, f4);
        this.f12746e.b(iVar4, -f4);
        return this;
    }

    public b l(float f4, float f5, float f6, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f12743b = 0.0f;
        if (f5 == 0.0f || f4 == f6) {
            this.f12746e.b(iVar, 1.0f);
            this.f12746e.b(iVar2, -1.0f);
            this.f12746e.b(iVar4, 1.0f);
            this.f12746e.b(iVar3, -1.0f);
        } else if (f4 == 0.0f) {
            this.f12746e.b(iVar, 1.0f);
            this.f12746e.b(iVar2, -1.0f);
        } else if (f6 == 0.0f) {
            this.f12746e.b(iVar3, 1.0f);
            this.f12746e.b(iVar4, -1.0f);
        } else {
            float f7 = (f4 / f5) / (f6 / f5);
            this.f12746e.b(iVar, 1.0f);
            this.f12746e.b(iVar2, -1.0f);
            this.f12746e.b(iVar4, f7);
            this.f12746e.b(iVar3, -f7);
        }
        return this;
    }

    public b m(i iVar, int i4) {
        if (i4 < 0) {
            this.f12743b = (float) (i4 * -1);
            this.f12746e.b(iVar, 1.0f);
        } else {
            this.f12743b = (float) i4;
            this.f12746e.b(iVar, -1.0f);
        }
        return this;
    }

    public b n(i iVar, i iVar2, int i4) {
        boolean z4 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z4 = true;
            }
            this.f12743b = (float) i4;
        }
        if (!z4) {
            this.f12746e.b(iVar, -1.0f);
            this.f12746e.b(iVar2, 1.0f);
        } else {
            this.f12746e.b(iVar, 1.0f);
            this.f12746e.b(iVar2, -1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i4) {
        boolean z4 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z4 = true;
            }
            this.f12743b = (float) i4;
        }
        if (!z4) {
            this.f12746e.b(iVar, -1.0f);
            this.f12746e.b(iVar2, 1.0f);
            this.f12746e.b(iVar3, 1.0f);
        } else {
            this.f12746e.b(iVar, 1.0f);
            this.f12746e.b(iVar2, -1.0f);
            this.f12746e.b(iVar3, -1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i4) {
        boolean z4 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z4 = true;
            }
            this.f12743b = (float) i4;
        }
        if (!z4) {
            this.f12746e.b(iVar, -1.0f);
            this.f12746e.b(iVar2, 1.0f);
            this.f12746e.b(iVar3, -1.0f);
        } else {
            this.f12746e.b(iVar, 1.0f);
            this.f12746e.b(iVar2, -1.0f);
            this.f12746e.b(iVar3, 1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f4) {
        this.f12746e.b(iVar3, 0.5f);
        this.f12746e.b(iVar4, 0.5f);
        this.f12746e.b(iVar, -0.5f);
        this.f12746e.b(iVar2, -0.5f);
        this.f12743b = -f4;
        return this;
    }

    public void r() {
        float f4 = this.f12743b;
        if (f4 < 0.0f) {
            this.f12743b = f4 * -1.0f;
            this.f12746e.k();
        }
    }

    public boolean s() {
        i iVar = this.f12742a;
        return iVar != null && (iVar.f12795j == i.a.UNRESTRICTED || this.f12743b >= 0.0f);
    }

    public boolean t(i iVar) {
        return this.f12746e.f(iVar);
    }

    public String toString() {
        return A();
    }

    public boolean u() {
        return this.f12742a == null && this.f12743b == 0.0f && this.f12746e.e() == 0;
    }

    public final boolean v(i iVar, d dVar) {
        return iVar.f12798m <= 1;
    }

    public i w(i iVar) {
        return x((boolean[]) null, iVar);
    }

    public final i x(boolean[] zArr, i iVar) {
        i.a aVar;
        int e4 = this.f12746e.e();
        i iVar2 = null;
        float f4 = 0.0f;
        for (int i4 = 0; i4 < e4; i4++) {
            float a4 = this.f12746e.a(i4);
            if (a4 < 0.0f) {
                i g4 = this.f12746e.g(i4);
                if ((zArr == null || !zArr[g4.f12788c]) && g4 != iVar && (((aVar = g4.f12795j) == i.a.SLACK || aVar == i.a.ERROR) && a4 < f4)) {
                    f4 = a4;
                    iVar2 = g4;
                }
            }
        }
        return iVar2;
    }

    public void y(i iVar) {
        i iVar2 = this.f12742a;
        if (iVar2 != null) {
            this.f12746e.b(iVar2, -1.0f);
            this.f12742a = null;
        }
        float d4 = this.f12746e.d(iVar, true) * -1.0f;
        this.f12742a = iVar;
        if (d4 != 1.0f) {
            this.f12743b /= d4;
            this.f12746e.h(d4);
        }
    }

    public void z() {
        this.f12742a = null;
        this.f12746e.clear();
        this.f12743b = 0.0f;
        this.f12747f = false;
    }

    public b(c cVar) {
        this.f12746e = new C1008a(this, cVar);
    }
}
