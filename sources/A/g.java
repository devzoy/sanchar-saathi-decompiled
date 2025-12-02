package A;

import A.d;
import A.e;
import net.sqlcipher.IBulkCursor;
import z.d;
import z.i;

public class g extends e {

    /* renamed from: A0  reason: collision with root package name */
    public int f147A0;

    /* renamed from: B0  reason: collision with root package name */
    public int f148B0;

    /* renamed from: w0  reason: collision with root package name */
    public float f149w0 = -1.0f;

    /* renamed from: x0  reason: collision with root package name */
    public int f150x0 = -1;

    /* renamed from: y0  reason: collision with root package name */
    public int f151y0 = -1;

    /* renamed from: z0  reason: collision with root package name */
    public d f152z0 = this.f46C;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f153a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                A.d$b[] r0 = A.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f153a = r0
                A.d$b r1 = A.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f153a     // Catch:{ NoSuchFieldError -> 0x001d }
                A.d$b r1 = A.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f153a     // Catch:{ NoSuchFieldError -> 0x0028 }
                A.d$b r1 = A.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f153a     // Catch:{ NoSuchFieldError -> 0x0033 }
                A.d$b r1 = A.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f153a     // Catch:{ NoSuchFieldError -> 0x003e }
                A.d$b r1 = A.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f153a     // Catch:{ NoSuchFieldError -> 0x0049 }
                A.d$b r1 = A.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f153a     // Catch:{ NoSuchFieldError -> 0x0054 }
                A.d$b r1 = A.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f153a     // Catch:{ NoSuchFieldError -> 0x0060 }
                A.d$b r1 = A.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f153a     // Catch:{ NoSuchFieldError -> 0x006c }
                A.d$b r1 = A.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: A.g.a.<clinit>():void");
        }
    }

    public g() {
        this.f147A0 = 0;
        this.f148B0 = 0;
        this.f54K.clear();
        this.f54K.add(this.f152z0);
        int length = this.f53J.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f53J[i4] = this.f152z0;
        }
    }

    public void F0(d dVar) {
        if (E() != null) {
            int x4 = dVar.x(this.f152z0);
            if (this.f147A0 == 1) {
                B0(x4);
                C0(0);
                e0(E().t());
                A0(0);
                return;
            }
            B0(0);
            C0(x4);
            A0(E().N());
            e0(0);
        }
    }

    public int G0() {
        return this.f147A0;
    }

    public int H0() {
        return this.f150x0;
    }

    public int I0() {
        return this.f151y0;
    }

    public float J0() {
        return this.f149w0;
    }

    public void K0(int i4) {
        if (i4 > -1) {
            this.f149w0 = -1.0f;
            this.f150x0 = i4;
            this.f151y0 = -1;
        }
    }

    public void L0(int i4) {
        if (i4 > -1) {
            this.f149w0 = -1.0f;
            this.f150x0 = -1;
            this.f151y0 = i4;
        }
    }

    public void M0(float f4) {
        if (f4 > -1.0f) {
            this.f149w0 = f4;
            this.f150x0 = -1;
            this.f151y0 = -1;
        }
    }

    public void N0(int i4) {
        if (this.f147A0 != i4) {
            this.f147A0 = i4;
            this.f54K.clear();
            if (this.f147A0 == 1) {
                this.f152z0 = this.f45B;
            } else {
                this.f152z0 = this.f46C;
            }
            this.f54K.add(this.f152z0);
            int length = this.f53J.length;
            for (int i5 = 0; i5 < length; i5++) {
                this.f53J[i5] = this.f152z0;
            }
        }
    }

    public void f(d dVar) {
        f fVar = (f) E();
        if (fVar != null) {
            d k4 = fVar.k(d.b.LEFT);
            d k5 = fVar.k(d.b.RIGHT);
            e eVar = this.f57N;
            boolean z4 = true;
            boolean z5 = eVar != null && eVar.f56M[0] == e.b.WRAP_CONTENT;
            if (this.f147A0 == 0) {
                k4 = fVar.k(d.b.TOP);
                k5 = fVar.k(d.b.BOTTOM);
                e eVar2 = this.f57N;
                if (eVar2 == null || eVar2.f56M[1] != e.b.WRAP_CONTENT) {
                    z4 = false;
                }
                z5 = z4;
            }
            if (this.f150x0 != -1) {
                i q4 = dVar.q(this.f152z0);
                dVar.e(q4, dVar.q(k4), this.f150x0, 8);
                if (z5) {
                    dVar.h(dVar.q(k5), q4, 0, 5);
                }
            } else if (this.f151y0 != -1) {
                i q5 = dVar.q(this.f152z0);
                i q6 = dVar.q(k5);
                dVar.e(q5, q6, -this.f151y0, 8);
                if (z5) {
                    dVar.h(q5, dVar.q(k4), 0, 5);
                    dVar.h(q6, q5, 0, 5);
                }
            } else if (this.f149w0 != -1.0f) {
                dVar.d(z.d.s(dVar, dVar.q(this.f152z0), dVar.q(k5), this.f149w0));
            }
        }
    }

    public boolean g() {
        return true;
    }

    public d k(d.b bVar) {
        switch (a.f153a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f147A0 == 1) {
                    return this.f152z0;
                }
                break;
            case 3:
            case 4:
                if (this.f147A0 == 0) {
                    return this.f152z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
