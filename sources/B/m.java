package B;

import A.d;
import A.e;

public abstract class m implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f224a;

    /* renamed from: b  reason: collision with root package name */
    public e f225b;

    /* renamed from: c  reason: collision with root package name */
    public k f226c;

    /* renamed from: d  reason: collision with root package name */
    public e.b f227d;

    /* renamed from: e  reason: collision with root package name */
    public g f228e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f229f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f230g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f231h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f232i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public b f233j = b.NONE;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f234a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                A.d$b[] r0 = A.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f234a = r0
                A.d$b r1 = A.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f234a     // Catch:{ NoSuchFieldError -> 0x001d }
                A.d$b r1 = A.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f234a     // Catch:{ NoSuchFieldError -> 0x0028 }
                A.d$b r1 = A.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f234a     // Catch:{ NoSuchFieldError -> 0x0033 }
                A.d$b r1 = A.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f234a     // Catch:{ NoSuchFieldError -> 0x003e }
                A.d$b r1 = A.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: B.m.a.<clinit>():void");
        }
    }

    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public m(e eVar) {
        this.f225b = eVar;
    }

    public abstract void a(d dVar);

    public final void b(f fVar, f fVar2, int i4) {
        fVar.f200l.add(fVar2);
        fVar.f194f = i4;
        fVar2.f199k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i4, g gVar) {
        fVar.f200l.add(fVar2);
        fVar.f200l.add(this.f228e);
        fVar.f196h = i4;
        fVar.f197i = gVar;
        fVar2.f199k.add(fVar);
        gVar.f199k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i4, int i5) {
        int i6;
        if (i5 == 0) {
            e eVar = this.f225b;
            int i7 = eVar.f100p;
            i6 = Math.max(eVar.f98o, i4);
            if (i7 > 0) {
                i6 = Math.min(i7, i4);
            }
            if (i6 == i4) {
                return i4;
            }
        } else {
            e eVar2 = this.f225b;
            int i8 = eVar2.f106s;
            int max = Math.max(eVar2.f104r, i4);
            if (i8 > 0) {
                max = Math.min(i8, i4);
            }
            if (i6 == i4) {
                return i4;
            }
        }
        return i6;
    }

    public final f h(d dVar) {
        d dVar2 = dVar.f28d;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f26b;
        int i4 = a.f234a[dVar2.f27c.ordinal()];
        if (i4 == 1) {
            return eVar.f78e.f231h;
        }
        if (i4 == 2) {
            return eVar.f78e.f232i;
        }
        if (i4 == 3) {
            return eVar.f80f.f231h;
        }
        if (i4 == 4) {
            return eVar.f80f.f221k;
        }
        if (i4 != 5) {
            return null;
        }
        return eVar.f80f.f232i;
    }

    public final f i(d dVar, int i4) {
        d dVar2 = dVar.f28d;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f26b;
        m mVar = i4 == 0 ? eVar.f78e : eVar.f80f;
        int i5 = a.f234a[dVar2.f27c.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f232i;
        }
        return mVar.f231h;
    }

    public long j() {
        g gVar = this.f228e;
        if (gVar.f198j) {
            return (long) gVar.f195g;
        }
        return 0;
    }

    public boolean k() {
        return this.f230g;
    }

    public final void l(int i4, int i5) {
        int i6 = this.f224a;
        if (i6 == 0) {
            this.f228e.d(g(i5, i4));
        } else if (i6 == 1) {
            this.f228e.d(Math.min(g(this.f228e.f210m, i4), i5));
        } else if (i6 == 2) {
            e E4 = this.f225b.E();
            if (E4 != null) {
                g gVar = (i4 == 0 ? E4.f78e : E4.f80f).f228e;
                if (gVar.f198j) {
                    e eVar = this.f225b;
                    this.f228e.d(g((int) ((((float) gVar.f195g) * (i4 == 0 ? eVar.f102q : eVar.f108t)) + 0.5f), i4));
                }
            }
        } else if (i6 == 3) {
            e eVar2 = this.f225b;
            m mVar = eVar2.f78e;
            e.b bVar = mVar.f227d;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && mVar.f224a == 3) {
                l lVar = eVar2.f80f;
                if (lVar.f227d == bVar2 && lVar.f224a == 3) {
                    return;
                }
            }
            if (i4 == 0) {
                mVar = eVar2.f80f;
            }
            if (mVar.f228e.f198j) {
                float r4 = eVar2.r();
                this.f228e.d(i4 == 1 ? (int) ((((float) mVar.f228e.f195g) / r4) + 0.5f) : (int) ((r4 * ((float) mVar.f228e.f195g)) + 0.5f));
            }
        }
    }

    public abstract boolean m();

    public void n(d dVar, d dVar2, d dVar3, int i4) {
        f h4 = h(dVar2);
        f h5 = h(dVar3);
        if (h4.f198j && h5.f198j) {
            int b4 = h4.f195g + dVar2.b();
            int b5 = h5.f195g - dVar3.b();
            int i5 = b5 - b4;
            if (!this.f228e.f198j && this.f227d == e.b.MATCH_CONSTRAINT) {
                l(i4, i5);
            }
            g gVar = this.f228e;
            if (gVar.f198j) {
                if (gVar.f195g == i5) {
                    this.f231h.d(b4);
                    this.f232i.d(b5);
                    return;
                }
                e eVar = this.f225b;
                float u4 = i4 == 0 ? eVar.u() : eVar.I();
                if (h4 == h5) {
                    b4 = h4.f195g;
                    b5 = h5.f195g;
                    u4 = 0.5f;
                }
                this.f231h.d((int) (((float) b4) + 0.5f + (((float) ((b5 - b4) - this.f228e.f195g)) * u4)));
                this.f232i.d(this.f231h.f195g + this.f228e.f195g);
            }
        }
    }

    public void o(d dVar) {
    }

    public void p(d dVar) {
    }
}
