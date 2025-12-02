package A;

import A.e;
import java.util.ArrayList;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public e f3a;

    /* renamed from: b  reason: collision with root package name */
    public e f4b;

    /* renamed from: c  reason: collision with root package name */
    public e f5c;

    /* renamed from: d  reason: collision with root package name */
    public e f6d;

    /* renamed from: e  reason: collision with root package name */
    public e f7e;

    /* renamed from: f  reason: collision with root package name */
    public e f8f;

    /* renamed from: g  reason: collision with root package name */
    public e f9g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f10h;

    /* renamed from: i  reason: collision with root package name */
    public int f11i;

    /* renamed from: j  reason: collision with root package name */
    public int f12j;

    /* renamed from: k  reason: collision with root package name */
    public float f13k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    public int f14l;

    /* renamed from: m  reason: collision with root package name */
    public int f15m;

    /* renamed from: n  reason: collision with root package name */
    public int f16n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f17o;

    /* renamed from: p  reason: collision with root package name */
    public int f18p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f19q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f20r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f21s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f22t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f23u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f24v;

    public c(e eVar, int i4, boolean z4) {
        this.f3a = eVar;
        this.f18p = i4;
        this.f19q = z4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r2 = r2.f96n[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(A.e r2, int r3) {
        /*
            int r0 = r2.M()
            r1 = 8
            if (r0 == r1) goto L_0x001b
            A.e$b[] r0 = r2.f56M
            r0 = r0[r3]
            A.e$b r1 = A.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x001b
            int[] r2 = r2.f96n
            r2 = r2[r3]
            if (r2 == 0) goto L_0x0019
            r3 = 3
            if (r2 != r3) goto L_0x001b
        L_0x0019:
            r2 = 1
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: A.c.c(A.e, int):boolean");
    }

    public void a() {
        if (!this.f24v) {
            b();
        }
        this.f24v = true;
    }

    public final void b() {
        int i4 = this.f18p * 2;
        e eVar = this.f3a;
        boolean z4 = true;
        this.f17o = true;
        e eVar2 = eVar;
        boolean z5 = false;
        while (!z5) {
            this.f11i++;
            e[] eVarArr = eVar.f107s0;
            int i5 = this.f18p;
            e eVar3 = null;
            eVarArr[i5] = null;
            eVar.f105r0[i5] = null;
            if (eVar.M() != 8) {
                this.f14l++;
                e.b q4 = eVar.q(this.f18p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (q4 != bVar) {
                    this.f15m += eVar.y(this.f18p);
                }
                int b4 = this.f15m + eVar.f53J[i4].b();
                this.f15m = b4;
                int i6 = i4 + 1;
                this.f15m = b4 + eVar.f53J[i6].b();
                int b5 = this.f16n + eVar.f53J[i4].b();
                this.f16n = b5;
                this.f16n = b5 + eVar.f53J[i6].b();
                if (this.f4b == null) {
                    this.f4b = eVar;
                }
                this.f6d = eVar;
                e.b[] bVarArr = eVar.f56M;
                int i7 = this.f18p;
                if (bVarArr[i7] == bVar) {
                    int i8 = eVar.f96n[i7];
                    if (i8 == 0 || i8 == 3 || i8 == 2) {
                        this.f12j++;
                        float f4 = eVar.f103q0[i7];
                        if (f4 > 0.0f) {
                            this.f13k += f4;
                        }
                        if (c(eVar, i7)) {
                            if (f4 < 0.0f) {
                                this.f20r = true;
                            } else {
                                this.f21s = true;
                            }
                            if (this.f10h == null) {
                                this.f10h = new ArrayList();
                            }
                            this.f10h.add(eVar);
                        }
                        if (this.f8f == null) {
                            this.f8f = eVar;
                        }
                        e eVar4 = this.f9g;
                        if (eVar4 != null) {
                            eVar4.f105r0[this.f18p] = eVar;
                        }
                        this.f9g = eVar;
                    }
                    if (this.f18p == 0) {
                        if (eVar.f92l != 0) {
                            this.f17o = false;
                        } else if (!(eVar.f98o == 0 && eVar.f100p == 0)) {
                            this.f17o = false;
                        }
                    } else if (eVar.f94m != 0) {
                        this.f17o = false;
                    } else if (!(eVar.f104r == 0 && eVar.f106s == 0)) {
                        this.f17o = false;
                    }
                    if (eVar.f60Q != 0.0f) {
                        this.f17o = false;
                        this.f23u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f107s0[this.f18p] = eVar;
            }
            d dVar = eVar.f53J[i4 + 1].f28d;
            if (dVar != null) {
                e eVar5 = dVar.f26b;
                d dVar2 = eVar5.f53J[i4].f28d;
                if (dVar2 != null && dVar2.f26b == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z5 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f4b;
        if (eVar6 != null) {
            this.f15m -= eVar6.f53J[i4].b();
        }
        e eVar7 = this.f6d;
        if (eVar7 != null) {
            this.f15m -= eVar7.f53J[i4 + 1].b();
        }
        this.f5c = eVar;
        if (this.f18p != 0 || !this.f19q) {
            this.f7e = this.f3a;
        } else {
            this.f7e = eVar;
        }
        if (!this.f21s || !this.f20r) {
            z4 = false;
        }
        this.f22t = z4;
    }
}
