package B;

import A.d;
import A.e;
import A.h;
import B.f;
import B.m;

public class l extends m {

    /* renamed from: k  reason: collision with root package name */
    public f f221k;

    /* renamed from: l  reason: collision with root package name */
    public g f222l = null;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f223a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                B.m$b[] r0 = B.m.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f223a = r0
                B.m$b r1 = B.m.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f223a     // Catch:{ NoSuchFieldError -> 0x001d }
                B.m$b r1 = B.m.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f223a     // Catch:{ NoSuchFieldError -> 0x0028 }
                B.m$b r1 = B.m.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: B.l.a.<clinit>():void");
        }
    }

    public l(e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f221k = fVar;
        this.f231h.f193e = f.a.TOP;
        this.f232i.f193e = f.a.BOTTOM;
        fVar.f193e = f.a.BASELINE;
        this.f229f = 1;
    }

    public void a(d dVar) {
        int i4;
        float f4;
        float r4;
        float f5;
        int i5 = a.f223a[this.f233j.ordinal()];
        if (i5 == 1) {
            p(dVar);
        } else if (i5 == 2) {
            o(dVar);
        } else if (i5 == 3) {
            e eVar = this.f225b;
            n(dVar, eVar.f46C, eVar.f48E, 1);
            return;
        }
        g gVar = this.f228e;
        if (gVar.f191c && !gVar.f198j && this.f227d == e.b.MATCH_CONSTRAINT) {
            e eVar2 = this.f225b;
            int i6 = eVar2.f94m;
            if (i6 == 2) {
                e E4 = eVar2.E();
                if (E4 != null) {
                    g gVar2 = E4.f80f.f228e;
                    if (gVar2.f198j) {
                        this.f228e.d((int) ((((float) gVar2.f195g) * this.f225b.f108t) + 0.5f));
                    }
                }
            } else if (i6 == 3 && eVar2.f78e.f228e.f198j) {
                int s4 = eVar2.s();
                if (s4 == -1) {
                    e eVar3 = this.f225b;
                    f4 = (float) eVar3.f78e.f228e.f195g;
                    r4 = eVar3.r();
                } else if (s4 == 0) {
                    e eVar4 = this.f225b;
                    f5 = ((float) eVar4.f78e.f228e.f195g) * eVar4.r();
                    i4 = (int) (f5 + 0.5f);
                    this.f228e.d(i4);
                } else if (s4 != 1) {
                    i4 = 0;
                    this.f228e.d(i4);
                } else {
                    e eVar5 = this.f225b;
                    f4 = (float) eVar5.f78e.f228e.f195g;
                    r4 = eVar5.r();
                }
                f5 = f4 / r4;
                i4 = (int) (f5 + 0.5f);
                this.f228e.d(i4);
            }
        }
        f fVar = this.f231h;
        if (fVar.f191c) {
            f fVar2 = this.f232i;
            if (fVar2.f191c) {
                if (!fVar.f198j || !fVar2.f198j || !this.f228e.f198j) {
                    if (!this.f228e.f198j && this.f227d == e.b.MATCH_CONSTRAINT) {
                        e eVar6 = this.f225b;
                        if (eVar6.f92l == 0 && !eVar6.V()) {
                            int i7 = ((f) this.f231h.f200l.get(0)).f195g;
                            f fVar3 = this.f231h;
                            int i8 = i7 + fVar3.f194f;
                            int i9 = ((f) this.f232i.f200l.get(0)).f195g + this.f232i.f194f;
                            fVar3.d(i8);
                            this.f232i.d(i9);
                            this.f228e.d(i9 - i8);
                            return;
                        }
                    }
                    if (!this.f228e.f198j && this.f227d == e.b.MATCH_CONSTRAINT && this.f224a == 1 && this.f231h.f200l.size() > 0 && this.f232i.f200l.size() > 0) {
                        int i10 = (((f) this.f232i.f200l.get(0)).f195g + this.f232i.f194f) - (((f) this.f231h.f200l.get(0)).f195g + this.f231h.f194f);
                        g gVar3 = this.f228e;
                        int i11 = gVar3.f210m;
                        if (i10 < i11) {
                            gVar3.d(i10);
                        } else {
                            gVar3.d(i11);
                        }
                    }
                    if (this.f228e.f198j && this.f231h.f200l.size() > 0 && this.f232i.f200l.size() > 0) {
                        f fVar4 = (f) this.f231h.f200l.get(0);
                        f fVar5 = (f) this.f232i.f200l.get(0);
                        int i12 = fVar4.f195g + this.f231h.f194f;
                        int i13 = fVar5.f195g + this.f232i.f194f;
                        float I4 = this.f225b.I();
                        if (fVar4 == fVar5) {
                            i12 = fVar4.f195g;
                            i13 = fVar5.f195g;
                            I4 = 0.5f;
                        }
                        this.f231h.d((int) (((float) i12) + 0.5f + (((float) ((i13 - i12) - this.f228e.f195g)) * I4)));
                        this.f232i.d(this.f231h.f195g + this.f228e.f195g);
                    }
                }
            }
        }
    }

    public void d() {
        e E4;
        e E5;
        e eVar = this.f225b;
        if (eVar.f70a) {
            this.f228e.d(eVar.t());
        }
        if (!this.f228e.f198j) {
            this.f227d = this.f225b.K();
            if (this.f225b.Q()) {
                this.f222l = new a(this);
            }
            e.b bVar = this.f227d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (E5 = this.f225b.E()) != null && E5.K() == e.b.FIXED) {
                    int t4 = (E5.t() - this.f225b.f46C.b()) - this.f225b.f48E.b();
                    b(this.f231h, E5.f80f.f231h, this.f225b.f46C.b());
                    b(this.f232i, E5.f80f.f232i, -this.f225b.f48E.b());
                    this.f228e.d(t4);
                    return;
                } else if (this.f227d == e.b.FIXED) {
                    this.f228e.d(this.f225b.t());
                }
            }
        } else if (this.f227d == e.b.MATCH_PARENT && (E4 = this.f225b.E()) != null && E4.K() == e.b.FIXED) {
            b(this.f231h, E4.f80f.f231h, this.f225b.f46C.b());
            b(this.f232i, E4.f80f.f232i, -this.f225b.f48E.b());
            return;
        }
        g gVar = this.f228e;
        boolean z4 = gVar.f198j;
        if (z4) {
            e eVar2 = this.f225b;
            if (eVar2.f70a) {
                d[] dVarArr = eVar2.f53J;
                d dVar = dVarArr[2];
                d dVar2 = dVar.f28d;
                if (dVar2 != null && dVarArr[3].f28d != null) {
                    if (eVar2.V()) {
                        this.f231h.f194f = this.f225b.f53J[2].b();
                        this.f232i.f194f = -this.f225b.f53J[3].b();
                    } else {
                        f h4 = h(this.f225b.f53J[2]);
                        if (h4 != null) {
                            b(this.f231h, h4, this.f225b.f53J[2].b());
                        }
                        f h5 = h(this.f225b.f53J[3]);
                        if (h5 != null) {
                            b(this.f232i, h5, -this.f225b.f53J[3].b());
                        }
                        this.f231h.f190b = true;
                        this.f232i.f190b = true;
                    }
                    if (this.f225b.Q()) {
                        b(this.f221k, this.f231h, this.f225b.l());
                        return;
                    }
                    return;
                } else if (dVar2 != null) {
                    f h6 = h(dVar);
                    if (h6 != null) {
                        b(this.f231h, h6, this.f225b.f53J[2].b());
                        b(this.f232i, this.f231h, this.f228e.f195g);
                        if (this.f225b.Q()) {
                            b(this.f221k, this.f231h, this.f225b.l());
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    d dVar3 = dVarArr[3];
                    if (dVar3.f28d != null) {
                        f h7 = h(dVar3);
                        if (h7 != null) {
                            b(this.f232i, h7, -this.f225b.f53J[3].b());
                            b(this.f231h, this.f232i, -this.f228e.f195g);
                        }
                        if (this.f225b.Q()) {
                            b(this.f221k, this.f231h, this.f225b.l());
                            return;
                        }
                        return;
                    }
                    d dVar4 = dVarArr[4];
                    if (dVar4.f28d != null) {
                        f h8 = h(dVar4);
                        if (h8 != null) {
                            b(this.f221k, h8, 0);
                            b(this.f231h, this.f221k, -this.f225b.l());
                            b(this.f232i, this.f231h, this.f228e.f195g);
                            return;
                        }
                        return;
                    } else if (!(eVar2 instanceof h) && eVar2.E() != null && this.f225b.k(d.b.CENTER).f28d == null) {
                        b(this.f231h, this.f225b.E().f80f.f231h, this.f225b.P());
                        b(this.f232i, this.f231h, this.f228e.f195g);
                        if (this.f225b.Q()) {
                            b(this.f221k, this.f231h, this.f225b.l());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (z4 || this.f227d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            e eVar3 = this.f225b;
            int i4 = eVar3.f94m;
            if (i4 == 2) {
                e E6 = eVar3.E();
                if (E6 != null) {
                    g gVar2 = E6.f80f.f228e;
                    this.f228e.f200l.add(gVar2);
                    gVar2.f199k.add(this.f228e);
                    g gVar3 = this.f228e;
                    gVar3.f190b = true;
                    gVar3.f199k.add(this.f231h);
                    this.f228e.f199k.add(this.f232i);
                }
            } else if (i4 == 3 && !eVar3.V()) {
                e eVar4 = this.f225b;
                if (eVar4.f92l != 3) {
                    g gVar4 = eVar4.f78e.f228e;
                    this.f228e.f200l.add(gVar4);
                    gVar4.f199k.add(this.f228e);
                    g gVar5 = this.f228e;
                    gVar5.f190b = true;
                    gVar5.f199k.add(this.f231h);
                    this.f228e.f199k.add(this.f232i);
                }
            }
        }
        e eVar5 = this.f225b;
        d[] dVarArr2 = eVar5.f53J;
        d dVar5 = dVarArr2[2];
        d dVar6 = dVar5.f28d;
        if (dVar6 != null && dVarArr2[3].f28d != null) {
            if (eVar5.V()) {
                this.f231h.f194f = this.f225b.f53J[2].b();
                this.f232i.f194f = -this.f225b.f53J[3].b();
            } else {
                f h9 = h(this.f225b.f53J[2]);
                f h10 = h(this.f225b.f53J[3]);
                h9.b(this);
                h10.b(this);
                this.f233j = m.b.CENTER;
            }
            if (this.f225b.Q()) {
                c(this.f221k, this.f231h, 1, this.f222l);
            }
        } else if (dVar6 != null) {
            f h11 = h(dVar5);
            if (h11 != null) {
                b(this.f231h, h11, this.f225b.f53J[2].b());
                c(this.f232i, this.f231h, 1, this.f228e);
                if (this.f225b.Q()) {
                    c(this.f221k, this.f231h, 1, this.f222l);
                }
                e.b bVar2 = this.f227d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f225b.r() > 0.0f) {
                    j jVar = this.f225b.f78e;
                    if (jVar.f227d == bVar3) {
                        jVar.f228e.f199k.add(this.f228e);
                        this.f228e.f200l.add(this.f225b.f78e.f228e);
                        this.f228e.f189a = this;
                    }
                }
            }
        } else {
            d dVar7 = dVarArr2[3];
            if (dVar7.f28d != null) {
                f h12 = h(dVar7);
                if (h12 != null) {
                    b(this.f232i, h12, -this.f225b.f53J[3].b());
                    c(this.f231h, this.f232i, -1, this.f228e);
                    if (this.f225b.Q()) {
                        c(this.f221k, this.f231h, 1, this.f222l);
                    }
                }
            } else {
                d dVar8 = dVarArr2[4];
                if (dVar8.f28d != null) {
                    f h13 = h(dVar8);
                    if (h13 != null) {
                        b(this.f221k, h13, 0);
                        c(this.f231h, this.f221k, -1, this.f222l);
                        c(this.f232i, this.f231h, 1, this.f228e);
                    }
                } else if (!(eVar5 instanceof h) && eVar5.E() != null) {
                    b(this.f231h, this.f225b.E().f80f.f231h, this.f225b.P());
                    c(this.f232i, this.f231h, 1, this.f228e);
                    if (this.f225b.Q()) {
                        c(this.f221k, this.f231h, 1, this.f222l);
                    }
                    e.b bVar4 = this.f227d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f225b.r() > 0.0f) {
                        j jVar2 = this.f225b.f78e;
                        if (jVar2.f227d == bVar5) {
                            jVar2.f228e.f199k.add(this.f228e);
                            this.f228e.f200l.add(this.f225b.f78e.f228e);
                            this.f228e.f189a = this;
                        }
                    }
                }
            }
        }
        if (this.f228e.f200l.size() == 0) {
            this.f228e.f191c = true;
        }
    }

    public void e() {
        f fVar = this.f231h;
        if (fVar.f198j) {
            this.f225b.C0(fVar.f195g);
        }
    }

    public void f() {
        this.f226c = null;
        this.f231h.c();
        this.f232i.c();
        this.f221k.c();
        this.f228e.c();
        this.f230g = false;
    }

    public boolean m() {
        return this.f227d != e.b.MATCH_CONSTRAINT || this.f225b.f94m == 0;
    }

    public void q() {
        this.f230g = false;
        this.f231h.c();
        this.f231h.f198j = false;
        this.f232i.c();
        this.f232i.f198j = false;
        this.f221k.c();
        this.f221k.f198j = false;
        this.f228e.f198j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f225b.p();
    }
}
