package A;

import A.d;
import B.c;
import B.f;
import B.j;
import B.l;
import B.m;
import java.util.ArrayList;
import net.sqlcipher.IBulkCursor;

public class e {

    /* renamed from: v0  reason: collision with root package name */
    public static float f43v0 = 0.5f;

    /* renamed from: A  reason: collision with root package name */
    public boolean f44A = false;

    /* renamed from: B  reason: collision with root package name */
    public d f45B = new d(this, d.b.LEFT);

    /* renamed from: C  reason: collision with root package name */
    public d f46C = new d(this, d.b.TOP);

    /* renamed from: D  reason: collision with root package name */
    public d f47D = new d(this, d.b.RIGHT);

    /* renamed from: E  reason: collision with root package name */
    public d f48E = new d(this, d.b.BOTTOM);

    /* renamed from: F  reason: collision with root package name */
    public d f49F = new d(this, d.b.BASELINE);

    /* renamed from: G  reason: collision with root package name */
    public d f50G = new d(this, d.b.CENTER_X);

    /* renamed from: H  reason: collision with root package name */
    public d f51H = new d(this, d.b.CENTER_Y);

    /* renamed from: I  reason: collision with root package name */
    public d f52I;

    /* renamed from: J  reason: collision with root package name */
    public d[] f53J;

    /* renamed from: K  reason: collision with root package name */
    public ArrayList f54K;

    /* renamed from: L  reason: collision with root package name */
    public boolean[] f55L;

    /* renamed from: M  reason: collision with root package name */
    public b[] f56M;

    /* renamed from: N  reason: collision with root package name */
    public e f57N;

    /* renamed from: O  reason: collision with root package name */
    public int f58O;

    /* renamed from: P  reason: collision with root package name */
    public int f59P;

    /* renamed from: Q  reason: collision with root package name */
    public float f60Q;

    /* renamed from: R  reason: collision with root package name */
    public int f61R;

    /* renamed from: S  reason: collision with root package name */
    public int f62S;

    /* renamed from: T  reason: collision with root package name */
    public int f63T;

    /* renamed from: U  reason: collision with root package name */
    public int f64U;

    /* renamed from: V  reason: collision with root package name */
    public int f65V;

    /* renamed from: W  reason: collision with root package name */
    public int f66W;

    /* renamed from: X  reason: collision with root package name */
    public int f67X;

    /* renamed from: Y  reason: collision with root package name */
    public int f68Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f69Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f70a = false;

    /* renamed from: a0  reason: collision with root package name */
    public int f71a0;

    /* renamed from: b  reason: collision with root package name */
    public m[] f72b = new m[2];

    /* renamed from: b0  reason: collision with root package name */
    public float f73b0;

    /* renamed from: c  reason: collision with root package name */
    public c f74c;

    /* renamed from: c0  reason: collision with root package name */
    public float f75c0;

    /* renamed from: d  reason: collision with root package name */
    public c f76d;

    /* renamed from: d0  reason: collision with root package name */
    public Object f77d0;

    /* renamed from: e  reason: collision with root package name */
    public j f78e = new j(this);

    /* renamed from: e0  reason: collision with root package name */
    public int f79e0;

    /* renamed from: f  reason: collision with root package name */
    public l f80f = new l(this);

    /* renamed from: f0  reason: collision with root package name */
    public int f81f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f82g = {true, true};

    /* renamed from: g0  reason: collision with root package name */
    public String f83g0;

    /* renamed from: h  reason: collision with root package name */
    public int[] f84h = {0, 0, 0, 0};

    /* renamed from: h0  reason: collision with root package name */
    public String f85h0;

    /* renamed from: i  reason: collision with root package name */
    public boolean f86i = false;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f87i0;

    /* renamed from: j  reason: collision with root package name */
    public int f88j = -1;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f89j0;

    /* renamed from: k  reason: collision with root package name */
    public int f90k = -1;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f91k0;

    /* renamed from: l  reason: collision with root package name */
    public int f92l = 0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f93l0;

    /* renamed from: m  reason: collision with root package name */
    public int f94m = 0;

    /* renamed from: m0  reason: collision with root package name */
    public int f95m0;

    /* renamed from: n  reason: collision with root package name */
    public int[] f96n = new int[2];

    /* renamed from: n0  reason: collision with root package name */
    public int f97n0;

    /* renamed from: o  reason: collision with root package name */
    public int f98o = 0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f99o0;

    /* renamed from: p  reason: collision with root package name */
    public int f100p = 0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f101p0;

    /* renamed from: q  reason: collision with root package name */
    public float f102q = 1.0f;

    /* renamed from: q0  reason: collision with root package name */
    public float[] f103q0;

    /* renamed from: r  reason: collision with root package name */
    public int f104r = 0;

    /* renamed from: r0  reason: collision with root package name */
    public e[] f105r0;

    /* renamed from: s  reason: collision with root package name */
    public int f106s = 0;

    /* renamed from: s0  reason: collision with root package name */
    public e[] f107s0;

    /* renamed from: t  reason: collision with root package name */
    public float f108t = 1.0f;

    /* renamed from: t0  reason: collision with root package name */
    public e f109t0;

    /* renamed from: u  reason: collision with root package name */
    public int f110u = -1;

    /* renamed from: u0  reason: collision with root package name */
    public e f111u0;

    /* renamed from: v  reason: collision with root package name */
    public float f112v = 1.0f;

    /* renamed from: w  reason: collision with root package name */
    public int[] f113w = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: x  reason: collision with root package name */
    public float f114x = 0.0f;

    /* renamed from: y  reason: collision with root package name */
    public boolean f115y = false;

    /* renamed from: z  reason: collision with root package name */
    public boolean f116z;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f117a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f118b;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                A.e$b[] r0 = A.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f118b = r0
                r1 = 1
                A.e$b r2 = A.e.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f118b     // Catch:{ NoSuchFieldError -> 0x001d }
                A.e$b r3 = A.e.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f118b     // Catch:{ NoSuchFieldError -> 0x0028 }
                A.e$b r4 = A.e.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f118b     // Catch:{ NoSuchFieldError -> 0x0033 }
                A.e$b r5 = A.e.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                A.d$b[] r4 = A.d.b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f117a = r4
                A.d$b r5 = A.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f117a     // Catch:{ NoSuchFieldError -> 0x004e }
                A.d$b r4 = A.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f117a     // Catch:{ NoSuchFieldError -> 0x0058 }
                A.d$b r1 = A.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f117a     // Catch:{ NoSuchFieldError -> 0x0062 }
                A.d$b r1 = A.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f117a     // Catch:{ NoSuchFieldError -> 0x006d }
                A.d$b r1 = A.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f117a     // Catch:{ NoSuchFieldError -> 0x0078 }
                A.d$b r1 = A.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f117a     // Catch:{ NoSuchFieldError -> 0x0083 }
                A.d$b r1 = A.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f117a     // Catch:{ NoSuchFieldError -> 0x008f }
                A.d$b r1 = A.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f117a     // Catch:{ NoSuchFieldError -> 0x009b }
                A.d$b r1 = A.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: A.e.a.<clinit>():void");
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.f52I = dVar;
        this.f53J = new d[]{this.f45B, this.f47D, this.f46C, this.f48E, this.f49F, dVar};
        this.f54K = new ArrayList();
        this.f55L = new boolean[2];
        b bVar = b.FIXED;
        this.f56M = new b[]{bVar, bVar};
        this.f57N = null;
        this.f58O = 0;
        this.f59P = 0;
        this.f60Q = 0.0f;
        this.f61R = -1;
        this.f62S = 0;
        this.f63T = 0;
        this.f64U = 0;
        this.f65V = 0;
        this.f66W = 0;
        this.f67X = 0;
        this.f68Y = 0;
        float f4 = f43v0;
        this.f73b0 = f4;
        this.f75c0 = f4;
        this.f79e0 = 0;
        this.f81f0 = 0;
        this.f83g0 = null;
        this.f85h0 = null;
        this.f91k0 = false;
        this.f93l0 = false;
        this.f95m0 = 0;
        this.f97n0 = 0;
        this.f103q0 = new float[]{-1.0f, -1.0f};
        this.f105r0 = new e[]{null, null};
        this.f107s0 = new e[]{null, null};
        this.f109t0 = null;
        this.f111u0 = null;
        d();
    }

    public int A() {
        return this.f113w[0];
    }

    public void A0(int i4) {
        this.f58O = i4;
        int i5 = this.f69Z;
        if (i4 < i5) {
            this.f58O = i5;
        }
    }

    public int B() {
        return this.f71a0;
    }

    public void B0(int i4) {
        this.f62S = i4;
    }

    public int C() {
        return this.f69Z;
    }

    public void C0(int i4) {
        this.f63T = i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f48E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public A.e D(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            A.d r3 = r2.f47D
            A.d r0 = r3.f28d
            if (r0 == 0) goto L_0x001f
            A.d r1 = r0.f28d
            if (r1 != r3) goto L_0x001f
            A.e r3 = r0.f26b
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            A.d r3 = r2.f48E
            A.d r0 = r3.f28d
            if (r0 == 0) goto L_0x001f
            A.d r1 = r0.f28d
            if (r1 != r3) goto L_0x001f
            A.e r3 = r0.f26b
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: A.e.D(int):A.e");
    }

    public void D0(boolean z4, boolean z5, boolean z6, boolean z7) {
        if (this.f110u == -1) {
            if (z6 && !z7) {
                this.f110u = 0;
            } else if (!z6 && z7) {
                this.f110u = 1;
                if (this.f61R == -1) {
                    this.f112v = 1.0f / this.f112v;
                }
            }
        }
        if (this.f110u == 0 && (!this.f46C.i() || !this.f48E.i())) {
            this.f110u = 1;
        } else if (this.f110u == 1 && (!this.f45B.i() || !this.f47D.i())) {
            this.f110u = 0;
        }
        if (this.f110u == -1 && (!this.f46C.i() || !this.f48E.i() || !this.f45B.i() || !this.f47D.i())) {
            if (this.f46C.i() && this.f48E.i()) {
                this.f110u = 0;
            } else if (this.f45B.i() && this.f47D.i()) {
                this.f112v = 1.0f / this.f112v;
                this.f110u = 1;
            }
        }
        if (this.f110u == -1) {
            int i4 = this.f98o;
            if (i4 > 0 && this.f104r == 0) {
                this.f110u = 0;
            } else if (i4 == 0 && this.f104r > 0) {
                this.f112v = 1.0f / this.f112v;
                this.f110u = 1;
            }
        }
    }

    public e E() {
        return this.f57N;
    }

    public void E0(boolean z4, boolean z5) {
        int i4;
        int i5;
        boolean k4 = z4 & this.f78e.k();
        boolean k5 = z5 & this.f80f.k();
        j jVar = this.f78e;
        int i6 = jVar.f231h.f195g;
        l lVar = this.f80f;
        int i7 = lVar.f231h.f195g;
        int i8 = jVar.f232i.f195g;
        int i9 = lVar.f232i.f195g;
        int i10 = i9 - i7;
        if (i8 - i6 < 0 || i10 < 0 || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE || i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE || i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE) {
            i8 = 0;
            i6 = 0;
            i9 = 0;
            i7 = 0;
        }
        int i11 = i8 - i6;
        int i12 = i9 - i7;
        if (k4) {
            this.f62S = i6;
        }
        if (k5) {
            this.f63T = i7;
        }
        if (this.f81f0 == 8) {
            this.f58O = 0;
            this.f59P = 0;
            return;
        }
        if (k4) {
            if (this.f56M[0] == b.FIXED && i11 < (i5 = this.f58O)) {
                i11 = i5;
            }
            this.f58O = i11;
            int i13 = this.f69Z;
            if (i11 < i13) {
                this.f58O = i13;
            }
        }
        if (k5) {
            if (this.f56M[1] == b.FIXED && i12 < (i4 = this.f59P)) {
                i12 = i4;
            }
            this.f59P = i12;
            int i14 = this.f71a0;
            if (i12 < i14) {
                this.f59P = i14;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f46C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public A.e F(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            A.d r3 = r2.f45B
            A.d r0 = r3.f28d
            if (r0 == 0) goto L_0x001f
            A.d r1 = r0.f28d
            if (r1 != r3) goto L_0x001f
            A.e r3 = r0.f26b
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            A.d r3 = r2.f46C
            A.d r0 = r3.f28d
            if (r0 == 0) goto L_0x001f
            A.d r1 = r0.f28d
            if (r1 != r3) goto L_0x001f
            A.e r3 = r0.f26b
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: A.e.F(int):A.e");
    }

    public void F0(z.d dVar) {
        int x4 = dVar.x(this.f45B);
        int x5 = dVar.x(this.f46C);
        int x6 = dVar.x(this.f47D);
        int x7 = dVar.x(this.f48E);
        j jVar = this.f78e;
        f fVar = jVar.f231h;
        if (fVar.f198j) {
            f fVar2 = jVar.f232i;
            if (fVar2.f198j) {
                x4 = fVar.f195g;
                x6 = fVar2.f195g;
            }
        }
        l lVar = this.f80f;
        f fVar3 = lVar.f231h;
        if (fVar3.f198j) {
            f fVar4 = lVar.f232i;
            if (fVar4.f198j) {
                x5 = fVar3.f195g;
                x7 = fVar4.f195g;
            }
        }
        int i4 = x7 - x5;
        if (x6 - x4 < 0 || i4 < 0 || x4 == Integer.MIN_VALUE || x4 == Integer.MAX_VALUE || x5 == Integer.MIN_VALUE || x5 == Integer.MAX_VALUE || x6 == Integer.MIN_VALUE || x6 == Integer.MAX_VALUE || x7 == Integer.MIN_VALUE || x7 == Integer.MAX_VALUE) {
            x4 = 0;
            x7 = 0;
            x5 = 0;
            x6 = 0;
        }
        c0(x4, x5, x6, x7);
    }

    public int G() {
        return O() + this.f58O;
    }

    public m H(int i4) {
        if (i4 == 0) {
            return this.f78e;
        }
        if (i4 == 1) {
            return this.f80f;
        }
        return null;
    }

    public float I() {
        return this.f75c0;
    }

    public int J() {
        return this.f97n0;
    }

    public b K() {
        return this.f56M[1];
    }

    public int L() {
        int i4 = this.f45B != null ? this.f46C.f29e : 0;
        return this.f47D != null ? i4 + this.f48E.f29e : i4;
    }

    public int M() {
        return this.f81f0;
    }

    public int N() {
        if (this.f81f0 == 8) {
            return 0;
        }
        return this.f58O;
    }

    public int O() {
        e eVar = this.f57N;
        return (eVar == null || !(eVar instanceof f)) ? this.f62S : ((f) eVar).f126C0 + this.f62S;
    }

    public int P() {
        e eVar = this.f57N;
        return (eVar == null || !(eVar instanceof f)) ? this.f63T : ((f) eVar).f127D0 + this.f63T;
    }

    public boolean Q() {
        return this.f115y;
    }

    public void R(d.b bVar, e eVar, d.b bVar2, int i4, int i5) {
        k(bVar).a(eVar.k(bVar2), i4, i5, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r4 = r0[r4 + 1];
        r0 = r4.f28d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean S(int r4) {
        /*
            r3 = this;
            int r4 = r4 * 2
            A.d[] r0 = r3.f53J
            r1 = r0[r4]
            A.d r2 = r1.f28d
            if (r2 == 0) goto L_0x001b
            A.d r2 = r2.f28d
            if (r2 == r1) goto L_0x001b
            r1 = 1
            int r4 = r4 + r1
            r4 = r0[r4]
            A.d r0 = r4.f28d
            if (r0 == 0) goto L_0x001b
            A.d r0 = r0.f28d
            if (r0 != r4) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A.e.S(int):boolean");
    }

    public boolean T() {
        d dVar = this.f45B;
        d dVar2 = dVar.f28d;
        if (dVar2 != null && dVar2.f28d == dVar) {
            return true;
        }
        d dVar3 = this.f47D;
        d dVar4 = dVar3.f28d;
        return dVar4 != null && dVar4.f28d == dVar3;
    }

    public boolean U() {
        return this.f116z;
    }

    public boolean V() {
        d dVar = this.f46C;
        d dVar2 = dVar.f28d;
        if (dVar2 != null && dVar2.f28d == dVar) {
            return true;
        }
        d dVar3 = this.f48E;
        d dVar4 = dVar3.f28d;
        return dVar4 != null && dVar4.f28d == dVar3;
    }

    public void W() {
        this.f45B.k();
        this.f46C.k();
        this.f47D.k();
        this.f48E.k();
        this.f49F.k();
        this.f50G.k();
        this.f51H.k();
        this.f52I.k();
        this.f57N = null;
        this.f114x = 0.0f;
        this.f58O = 0;
        this.f59P = 0;
        this.f60Q = 0.0f;
        this.f61R = -1;
        this.f62S = 0;
        this.f63T = 0;
        this.f66W = 0;
        this.f67X = 0;
        this.f68Y = 0;
        this.f69Z = 0;
        this.f71a0 = 0;
        float f4 = f43v0;
        this.f73b0 = f4;
        this.f75c0 = f4;
        b[] bVarArr = this.f56M;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f77d0 = null;
        this.f79e0 = 0;
        this.f81f0 = 0;
        this.f85h0 = null;
        this.f87i0 = false;
        this.f89j0 = false;
        this.f95m0 = 0;
        this.f97n0 = 0;
        this.f99o0 = false;
        this.f101p0 = false;
        float[] fArr = this.f103q0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f88j = -1;
        this.f90k = -1;
        int[] iArr = this.f113w;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f92l = 0;
        this.f94m = 0;
        this.f102q = 1.0f;
        this.f108t = 1.0f;
        this.f100p = Integer.MAX_VALUE;
        this.f106s = Integer.MAX_VALUE;
        this.f98o = 0;
        this.f104r = 0;
        this.f86i = false;
        this.f110u = -1;
        this.f112v = 1.0f;
        this.f91k0 = false;
        this.f93l0 = false;
        boolean[] zArr = this.f82g;
        zArr[0] = true;
        zArr[1] = true;
        this.f44A = false;
        boolean[] zArr2 = this.f55L;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public void X(z.c cVar) {
        this.f45B.l(cVar);
        this.f46C.l(cVar);
        this.f47D.l(cVar);
        this.f48E.l(cVar);
        this.f49F.l(cVar);
        this.f52I.l(cVar);
        this.f50G.l(cVar);
        this.f51H.l(cVar);
    }

    public void Y(int i4) {
        this.f68Y = i4;
        this.f115y = i4 > 0;
    }

    public void Z(Object obj) {
        this.f77d0 = obj;
    }

    public void a0(String str) {
        this.f83g0 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0090
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x0090
        L_0x000b:
            int r1 = r9.length()
            r2 = 44
            int r2 = r9.indexOf(r2)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 <= 0) goto L_0x0039
            int r6 = r1 + -1
            if (r2 >= r6) goto L_0x0039
            java.lang.String r6 = r9.substring(r3, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002b
            goto L_0x0036
        L_0x002b:
            java.lang.String r3 = "H"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0035
            r3 = r4
            goto L_0x0036
        L_0x0035:
            r3 = r5
        L_0x0036:
            int r2 = r2 + r4
            r5 = r3
            r3 = r2
        L_0x0039:
            r2 = 58
            int r2 = r9.indexOf(r2)
            if (r2 < 0) goto L_0x0077
            int r1 = r1 - r4
            if (r2 >= r1) goto L_0x0077
            java.lang.String r1 = r9.substring(r3, r2)
            int r2 = r2 + r4
            java.lang.String r9 = r9.substring(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x0086
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0086
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x0086 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0086 }
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0086
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0086
            if (r5 != r4) goto L_0x0071
            float r9 = r9 / r1
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0087
        L_0x0071:
            float r1 = r1 / r9
            float r9 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0087
        L_0x0077:
            java.lang.String r9 = r9.substring(r3)
            int r1 = r9.length()
            if (r1 <= 0) goto L_0x0086
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0087
        L_0x0086:
            r9 = r0
        L_0x0087:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008f
            r8.f60Q = r9
            r8.f61R = r5
        L_0x008f:
            return
        L_0x0090:
            r8.f60Q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A.e.b0(java.lang.String):void");
    }

    public void c0(int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10 = i6 - i4;
        int i11 = i7 - i5;
        this.f62S = i4;
        this.f63T = i5;
        if (this.f81f0 == 8) {
            this.f58O = 0;
            this.f59P = 0;
            return;
        }
        b[] bVarArr = this.f56M;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i10 < (i9 = this.f58O)) {
            i10 = i9;
        }
        if (bVarArr[1] == bVar2 && i11 < (i8 = this.f59P)) {
            i11 = i8;
        }
        this.f58O = i10;
        this.f59P = i11;
        int i12 = this.f71a0;
        if (i11 < i12) {
            this.f59P = i12;
        }
        int i13 = this.f69Z;
        if (i10 < i13) {
            this.f58O = i13;
        }
    }

    public final void d() {
        this.f54K.add(this.f45B);
        this.f54K.add(this.f46C);
        this.f54K.add(this.f47D);
        this.f54K.add(this.f48E);
        this.f54K.add(this.f50G);
        this.f54K.add(this.f51H);
        this.f54K.add(this.f52I);
        this.f54K.add(this.f49F);
    }

    public void d0(boolean z4) {
        this.f115y = z4;
    }

    public boolean e() {
        return this instanceof g;
    }

    public void e0(int i4) {
        this.f59P = i4;
        int i5 = this.f71a0;
        if (i4 < i5) {
            this.f59P = i5;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(z.d r48) {
        /*
            r47 = this;
            r13 = r47
            r9 = r48
            A.d r0 = r13.f45B
            z.i r7 = r9.q(r0)
            A.d r0 = r13.f47D
            z.i r6 = r9.q(r0)
            A.d r0 = r13.f46C
            z.i r4 = r9.q(r0)
            A.d r0 = r13.f48E
            z.i r3 = r9.q(r0)
            A.d r0 = r13.f49F
            z.i r1 = r9.q(r0)
            int r0 = z.d.f12752q
            B.j r0 = r13.f78e
            B.f r2 = r0.f231h
            boolean r5 = r2.f198j
            r15 = 8
            r14 = 1
            r12 = 0
            if (r5 == 0) goto L_0x00be
            B.f r0 = r0.f232i
            boolean r0 = r0.f198j
            if (r0 == 0) goto L_0x00be
            B.l r0 = r13.f80f
            B.f r5 = r0.f231h
            boolean r5 = r5.f198j
            if (r5 == 0) goto L_0x00be
            B.f r0 = r0.f232i
            boolean r0 = r0.f198j
            if (r0 == 0) goto L_0x00be
            int r0 = r2.f195g
            r9.f(r7, r0)
            B.j r0 = r13.f78e
            B.f r0 = r0.f232i
            int r0 = r0.f195g
            r9.f(r6, r0)
            B.l r0 = r13.f80f
            B.f r0 = r0.f231h
            int r0 = r0.f195g
            r9.f(r4, r0)
            B.l r0 = r13.f80f
            B.f r0 = r0.f232i
            int r0 = r0.f195g
            r9.f(r3, r0)
            B.l r0 = r13.f80f
            B.f r0 = r0.f221k
            int r0 = r0.f195g
            r9.f(r1, r0)
            A.e r0 = r13.f57N
            if (r0 == 0) goto L_0x00bd
            if (r0 == 0) goto L_0x007d
            A.e$b[] r1 = r0.f56M
            r1 = r1[r12]
            A.e$b r2 = A.e.b.WRAP_CONTENT
            if (r1 != r2) goto L_0x007d
            r1 = r14
            goto L_0x007e
        L_0x007d:
            r1 = r12
        L_0x007e:
            if (r0 == 0) goto L_0x008a
            A.e$b[] r0 = r0.f56M
            r0 = r0[r14]
            A.e$b r2 = A.e.b.WRAP_CONTENT
            if (r0 != r2) goto L_0x008a
            r0 = r14
            goto L_0x008b
        L_0x008a:
            r0 = r12
        L_0x008b:
            if (r1 == 0) goto L_0x00a4
            boolean[] r1 = r13.f82g
            boolean r1 = r1[r12]
            if (r1 == 0) goto L_0x00a4
            boolean r1 = r47.T()
            if (r1 != 0) goto L_0x00a4
            A.e r1 = r13.f57N
            A.d r1 = r1.f47D
            z.i r1 = r9.q(r1)
            r9.h(r1, r6, r12, r15)
        L_0x00a4:
            if (r0 == 0) goto L_0x00bd
            boolean[] r0 = r13.f82g
            boolean r0 = r0[r14]
            if (r0 == 0) goto L_0x00bd
            boolean r0 = r47.V()
            if (r0 != 0) goto L_0x00bd
            A.e r0 = r13.f57N
            A.d r0 = r0.f48E
            z.i r0 = r9.q(r0)
            r9.h(r0, r3, r12, r15)
        L_0x00bd:
            return
        L_0x00be:
            A.e r0 = r13.f57N
            if (r0 == 0) goto L_0x0149
            if (r0 == 0) goto L_0x00ce
            A.e$b[] r2 = r0.f56M
            r2 = r2[r12]
            A.e$b r5 = A.e.b.WRAP_CONTENT
            if (r2 != r5) goto L_0x00ce
            r2 = r14
            goto L_0x00cf
        L_0x00ce:
            r2 = r12
        L_0x00cf:
            if (r0 == 0) goto L_0x00db
            A.e$b[] r0 = r0.f56M
            r0 = r0[r14]
            A.e$b r5 = A.e.b.WRAP_CONTENT
            if (r0 != r5) goto L_0x00db
            r0 = r14
            goto L_0x00dc
        L_0x00db:
            r0 = r12
        L_0x00dc:
            boolean r5 = r13.S(r12)
            if (r5 == 0) goto L_0x00eb
            A.e r5 = r13.f57N
            A.f r5 = (A.f) r5
            r5.J0(r13, r12)
            r5 = r14
            goto L_0x00ef
        L_0x00eb:
            boolean r5 = r47.T()
        L_0x00ef:
            boolean r8 = r13.S(r14)
            if (r8 == 0) goto L_0x00fe
            A.e r8 = r13.f57N
            A.f r8 = (A.f) r8
            r8.J0(r13, r14)
            r8 = r14
            goto L_0x0102
        L_0x00fe:
            boolean r8 = r47.V()
        L_0x0102:
            if (r5 != 0) goto L_0x0121
            if (r2 == 0) goto L_0x0121
            int r10 = r13.f81f0
            if (r10 == r15) goto L_0x0121
            A.d r10 = r13.f45B
            A.d r10 = r10.f28d
            if (r10 != 0) goto L_0x0121
            A.d r10 = r13.f47D
            A.d r10 = r10.f28d
            if (r10 != 0) goto L_0x0121
            A.e r10 = r13.f57N
            A.d r10 = r10.f47D
            z.i r10 = r9.q(r10)
            r9.h(r10, r6, r12, r14)
        L_0x0121:
            if (r8 != 0) goto L_0x0144
            if (r0 == 0) goto L_0x0144
            int r10 = r13.f81f0
            if (r10 == r15) goto L_0x0144
            A.d r10 = r13.f46C
            A.d r10 = r10.f28d
            if (r10 != 0) goto L_0x0144
            A.d r10 = r13.f48E
            A.d r10 = r10.f28d
            if (r10 != 0) goto L_0x0144
            A.d r10 = r13.f49F
            if (r10 != 0) goto L_0x0144
            A.e r10 = r13.f57N
            A.d r10 = r10.f48E
            z.i r10 = r9.q(r10)
            r9.h(r10, r3, r12, r14)
        L_0x0144:
            r28 = r5
            r27 = r8
            goto L_0x014f
        L_0x0149:
            r0 = r12
            r2 = r0
            r27 = r2
            r28 = r27
        L_0x014f:
            int r5 = r13.f58O
            int r8 = r13.f69Z
            if (r5 >= r8) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            r8 = r5
        L_0x0157:
            int r10 = r13.f59P
            int r11 = r13.f71a0
            if (r10 >= r11) goto L_0x015e
            goto L_0x015f
        L_0x015e:
            r11 = r10
        L_0x015f:
            A.e$b[] r15 = r13.f56M
            r14 = r15[r12]
            A.e$b r12 = A.e.b.MATCH_CONSTRAINT
            r19 = r1
            if (r14 == r12) goto L_0x016d
            r1 = 1
        L_0x016a:
            r17 = 1
            goto L_0x016f
        L_0x016d:
            r1 = 0
            goto L_0x016a
        L_0x016f:
            r15 = r15[r17]
            r20 = r3
            r21 = r4
            if (r15 == r12) goto L_0x0179
            r3 = 1
            goto L_0x017a
        L_0x0179:
            r3 = 0
        L_0x017a:
            int r4 = r13.f61R
            r13.f110u = r4
            r22 = r8
            float r8 = r13.f60Q
            r13.f112v = r8
            r23 = r11
            int r11 = r13.f92l
            r26 = r6
            int r6 = r13.f94m
            r24 = 0
            int r24 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            r29 = r7
            if (r24 <= 0) goto L_0x01fd
            int r7 = r13.f81f0
            r9 = 8
            if (r7 == r9) goto L_0x01fd
            r7 = 3
            if (r14 != r12) goto L_0x01a0
            if (r11 != 0) goto L_0x01a0
            r11 = r7
        L_0x01a0:
            if (r15 != r12) goto L_0x01a5
            if (r6 != 0) goto L_0x01a5
            r6 = r7
        L_0x01a5:
            if (r14 != r12) goto L_0x01b1
            if (r15 != r12) goto L_0x01b1
            if (r11 != r7) goto L_0x01b1
            if (r6 != r7) goto L_0x01b1
            r13.D0(r2, r0, r1, r3)
            goto L_0x01f6
        L_0x01b1:
            r1 = 4
            if (r14 != r12) goto L_0x01ce
            if (r11 != r7) goto L_0x01ce
            r3 = 0
            r13.f110u = r3
            float r3 = (float) r10
            float r8 = r8 * r3
            int r8 = (int) r8
            if (r15 == r12) goto L_0x01c6
            r33 = r1
            r32 = r6
        L_0x01c2:
            r31 = r23
        L_0x01c4:
            r9 = 0
            goto L_0x0204
        L_0x01c6:
            r32 = r6
            r33 = r11
        L_0x01ca:
            r31 = r23
        L_0x01cc:
            r9 = 1
            goto L_0x0204
        L_0x01ce:
            if (r15 != r12) goto L_0x01f6
            if (r6 != r7) goto L_0x01f6
            r3 = 1
            r13.f110u = r3
            r3 = -1
            if (r4 != r3) goto L_0x01dd
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 / r8
            r13.f112v = r3
        L_0x01dd:
            float r3 = r13.f112v
            float r4 = (float) r5
            float r3 = r3 * r4
            int r3 = (int) r3
            if (r14 == r12) goto L_0x01ed
            r32 = r1
            r31 = r3
            r33 = r11
            r8 = r22
            goto L_0x01c4
        L_0x01ed:
            r31 = r3
            r32 = r6
            r33 = r11
            r8 = r22
            goto L_0x01cc
        L_0x01f6:
            r32 = r6
            r33 = r11
            r8 = r22
            goto L_0x01ca
        L_0x01fd:
            r32 = r6
            r33 = r11
            r8 = r22
            goto L_0x01c2
        L_0x0204:
            int[] r1 = r13.f96n
            r3 = 0
            r1[r3] = r33
            r3 = 1
            r1[r3] = r32
            r13.f86i = r9
            if (r9 == 0) goto L_0x021a
            int r1 = r13.f110u
            r7 = -1
            if (r1 == 0) goto L_0x0217
            if (r1 != r7) goto L_0x021b
        L_0x0217:
            r22 = 1
            goto L_0x021d
        L_0x021a:
            r7 = -1
        L_0x021b:
            r22 = 0
        L_0x021d:
            A.e$b[] r1 = r13.f56M
            r3 = 0
            r1 = r1[r3]
            A.e$b r6 = A.e.b.WRAP_CONTENT
            if (r1 != r6) goto L_0x022d
            boolean r1 = r13 instanceof A.f
            if (r1 == 0) goto L_0x022d
            r30 = 1
            goto L_0x022f
        L_0x022d:
            r30 = 0
        L_0x022f:
            if (r30 == 0) goto L_0x0234
            r34 = 0
            goto L_0x0236
        L_0x0234:
            r34 = r8
        L_0x0236:
            A.d r1 = r13.f52I
            boolean r1 = r1.i()
            r3 = 1
            r35 = r1 ^ 1
            boolean[] r1 = r13.f55L
            r4 = 0
            boolean r36 = r1[r4]
            boolean r37 = r1[r3]
            int r1 = r13.f88j
            r4 = 2
            r38 = 0
            if (r1 == r4) goto L_0x0330
            B.j r1 = r13.f78e
            B.f r5 = r1.f231h
            boolean r8 = r5.f198j
            if (r8 == 0) goto L_0x025b
            B.f r1 = r1.f232i
            boolean r1 = r1.f198j
            if (r1 != 0) goto L_0x0264
        L_0x025b:
            r15 = r48
            r12 = r26
            r14 = r29
            r11 = 8
            goto L_0x02ac
        L_0x0264:
            int r1 = r5.f195g
            r15 = r48
            r14 = r29
            r15.f(r14, r1)
            B.j r1 = r13.f78e
            B.f r1 = r1.f232i
            int r1 = r1.f195g
            r12 = r26
            r15.f(r12, r1)
            A.e r1 = r13.f57N
            if (r1 == 0) goto L_0x0298
            if (r2 == 0) goto L_0x0298
            boolean[] r1 = r13.f82g
            r5 = 0
            boolean r1 = r1[r5]
            if (r1 == 0) goto L_0x0298
            boolean r1 = r47.T()
            if (r1 != 0) goto L_0x0298
            A.e r1 = r13.f57N
            A.d r1 = r1.f47D
            z.i r1 = r15.q(r1)
            r11 = 8
            r15.h(r1, r12, r5, r11)
        L_0x0298:
            r41 = r0
            r29 = r2
            r45 = r6
            r46 = r9
            r39 = r12
            r40 = r14
            r42 = r19
            r43 = r20
            r44 = r21
            goto L_0x0343
        L_0x02ac:
            A.e r1 = r13.f57N
            if (r1 == 0) goto L_0x02b9
            A.d r1 = r1.f47D
            z.i r1 = r15.q(r1)
            r17 = r1
            goto L_0x02bb
        L_0x02b9:
            r17 = r38
        L_0x02bb:
            A.e r1 = r13.f57N
            if (r1 == 0) goto L_0x02c8
            A.d r1 = r1.f45B
            z.i r1 = r15.q(r1)
            r26 = r1
            goto L_0x02ca
        L_0x02c8:
            r26 = r38
        L_0x02ca:
            boolean[] r1 = r13.f82g
            r16 = 0
            boolean r5 = r1[r16]
            A.e$b[] r1 = r13.f56M
            r8 = r1[r16]
            A.d r10 = r13.f45B
            A.d r1 = r13.f47D
            r18 = r11
            r11 = r1
            int r1 = r13.f62S
            r29 = r2
            r39 = r12
            r2 = r16
            r12 = r1
            int r1 = r13.f69Z
            r40 = r14
            r14 = r1
            int[] r1 = r13.f113w
            r1 = r1[r2]
            r15 = r1
            float r1 = r13.f73b0
            r16 = r1
            int r1 = r13.f98o
            r23 = r1
            int r1 = r13.f100p
            r24 = r1
            float r1 = r13.f102q
            r25 = r1
            r1 = 1
            r2 = r1
            r41 = r0
            r0 = r47
            r42 = r19
            r1 = r48
            r43 = r20
            r3 = r29
            r44 = r21
            r4 = r41
            r45 = r6
            r6 = r26
            r7 = r17
            r46 = r9
            r9 = r30
            r13 = r34
            r17 = r22
            r18 = r28
            r19 = r27
            r20 = r36
            r21 = r33
            r22 = r32
            r26 = r35
            r0.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x032d:
            r13 = r47
            goto L_0x0343
        L_0x0330:
            r41 = r0
            r45 = r6
            r46 = r9
            r42 = r19
            r43 = r20
            r44 = r21
            r39 = r26
            r40 = r29
            r29 = r2
            goto L_0x032d
        L_0x0343:
            B.l r0 = r13.f80f
            B.f r1 = r0.f231h
            boolean r2 = r1.f198j
            if (r2 == 0) goto L_0x0396
            B.f r0 = r0.f232i
            boolean r0 = r0.f198j
            if (r0 == 0) goto L_0x0396
            int r0 = r1.f195g
            r9 = r48
            r7 = r44
            r9.f(r7, r0)
            B.l r0 = r13.f80f
            B.f r0 = r0.f232i
            int r0 = r0.f195g
            r6 = r43
            r9.f(r6, r0)
            B.l r0 = r13.f80f
            B.f r0 = r0.f221k
            int r0 = r0.f195g
            r1 = r42
            r9.f(r1, r0)
            A.e r0 = r13.f57N
            if (r0 == 0) goto L_0x0390
            if (r27 != 0) goto L_0x0390
            if (r41 == 0) goto L_0x0390
            boolean[] r2 = r13.f82g
            r4 = 1
            boolean r2 = r2[r4]
            if (r2 == 0) goto L_0x038c
            A.d r0 = r0.f48E
            z.i r0 = r9.q(r0)
            r2 = 8
            r3 = 0
            r9.h(r0, r6, r3, r2)
            goto L_0x0394
        L_0x038c:
            r2 = 8
            r3 = 0
            goto L_0x0394
        L_0x0390:
            r2 = 8
            r3 = 0
            r4 = 1
        L_0x0394:
            r14 = r3
            goto L_0x03a3
        L_0x0396:
            r9 = r48
            r1 = r42
            r6 = r43
            r7 = r44
            r2 = 8
            r3 = 0
            r4 = 1
            r14 = r4
        L_0x03a3:
            int r0 = r13.f90k
            r5 = 2
            if (r0 != r5) goto L_0x03aa
            r12 = r3
            goto L_0x03ab
        L_0x03aa:
            r12 = r14
        L_0x03ab:
            if (r12 == 0) goto L_0x0468
            A.e$b[] r0 = r13.f56M
            r0 = r0[r4]
            r5 = r45
            if (r0 != r5) goto L_0x03bc
            boolean r0 = r13 instanceof A.f
            if (r0 == 0) goto L_0x03bc
            r17 = r4
            goto L_0x03be
        L_0x03bc:
            r17 = r3
        L_0x03be:
            if (r17 == 0) goto L_0x03c2
            r31 = r3
        L_0x03c2:
            if (r46 == 0) goto L_0x03ce
            int r0 = r13.f110u
            if (r0 == r4) goto L_0x03cb
            r5 = -1
            if (r0 != r5) goto L_0x03ce
        L_0x03cb:
            r18 = r4
            goto L_0x03d0
        L_0x03ce:
            r18 = r3
        L_0x03d0:
            A.e r0 = r13.f57N
            if (r0 == 0) goto L_0x03db
            A.d r0 = r0.f48E
            z.i r0 = r9.q(r0)
            goto L_0x03dd
        L_0x03db:
            r0 = r38
        L_0x03dd:
            A.e r5 = r13.f57N
            if (r5 == 0) goto L_0x03e9
            A.d r5 = r5.f46C
            z.i r5 = r9.q(r5)
            r38 = r5
        L_0x03e9:
            int r5 = r13.f68Y
            if (r5 > 0) goto L_0x03f1
            int r5 = r13.f81f0
            if (r5 != r2) goto L_0x041b
        L_0x03f1:
            int r5 = r47.l()
            r9.e(r1, r7, r5, r2)
            A.d r5 = r13.f49F
            A.d r5 = r5.f28d
            if (r5 == 0) goto L_0x0414
            z.i r5 = r9.q(r5)
            r9.e(r1, r5, r3, r2)
            if (r41 == 0) goto L_0x0411
            A.d r1 = r13.f48E
            z.i r1 = r9.q(r1)
            r2 = 5
            r9.h(r0, r1, r3, r2)
        L_0x0411:
            r26 = r3
            goto L_0x041d
        L_0x0414:
            int r5 = r13.f81f0
            if (r5 != r2) goto L_0x041b
            r9.e(r1, r7, r3, r2)
        L_0x041b:
            r26 = r35
        L_0x041d:
            boolean[] r1 = r13.f82g
            boolean r5 = r1[r4]
            A.e$b[] r1 = r13.f56M
            r8 = r1[r4]
            A.d r10 = r13.f46C
            A.d r11 = r13.f48E
            int r12 = r13.f63T
            int r14 = r13.f71a0
            int[] r1 = r13.f113w
            r15 = r1[r4]
            float r1 = r13.f75c0
            r16 = r1
            int r1 = r13.f104r
            r23 = r1
            int r1 = r13.f106s
            r24 = r1
            float r1 = r13.f108t
            r25 = r1
            r2 = 0
            r19 = r0
            r0 = r47
            r1 = r48
            r3 = r41
            r4 = r29
            r29 = r6
            r6 = r38
            r30 = r7
            r7 = r19
            r9 = r17
            r13 = r31
            r17 = r18
            r18 = r27
            r19 = r28
            r20 = r37
            r21 = r32
            r22 = r33
            r0.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x046c
        L_0x0468:
            r29 = r6
            r30 = r7
        L_0x046c:
            r7 = r47
            if (r46 == 0) goto L_0x0496
            int r0 = r7.f110u
            r6 = 8
            r1 = 1
            if (r0 != r1) goto L_0x0487
            float r5 = r7.f112v
            r0 = r48
            r1 = r29
            r2 = r30
            r3 = r39
            r4 = r40
            r0.k(r1, r2, r3, r4, r5, r6)
            goto L_0x0496
        L_0x0487:
            float r5 = r7.f112v
            r0 = r48
            r1 = r39
            r2 = r40
            r3 = r29
            r4 = r30
            r0.k(r1, r2, r3, r4, r5, r6)
        L_0x0496:
            A.d r0 = r7.f52I
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x04be
            A.d r0 = r7.f52I
            A.d r0 = r0.f()
            A.e r0 = r0.d()
            float r1 = r7.f114x
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            A.d r2 = r7.f52I
            int r2 = r2.b()
            r3 = r48
            r3.b(r7, r0, r1, r2)
        L_0x04be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A.e.f(z.d):void");
    }

    public void f0(float f4) {
        this.f73b0 = f4;
    }

    public boolean g() {
        return this.f81f0 != 8;
    }

    public void g0(int i4) {
        this.f95m0 = i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:166:0x02d8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0331 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0424 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:284:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(z.d r32, boolean r33, boolean r34, boolean r35, boolean r36, z.i r37, z.i r38, A.e.b r39, boolean r40, A.d r41, A.d r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            r31 = this;
            r0 = r31
            r10 = r32
            r11 = r37
            r12 = r38
            r13 = r41
            r14 = r42
            r15 = r45
            r1 = r46
            r2 = r53
            r3 = r54
            r4 = r55
            z.i r9 = r10.q(r13)
            z.i r8 = r10.q(r14)
            A.d r5 = r41.f()
            z.i r7 = r10.q(r5)
            A.d r5 = r42.f()
            z.i r6 = r10.q(r5)
            z.d.w()
            boolean r16 = r41.i()
            boolean r17 = r42.i()
            A.d r5 = r0.f52I
            boolean r18 = r5.i()
            if (r17 == 0) goto L_0x0044
            int r5 = r16 + 1
            goto L_0x0046
        L_0x0044:
            r5 = r16
        L_0x0046:
            if (r18 == 0) goto L_0x004a
            int r5 = r5 + 1
        L_0x004a:
            if (r48 == 0) goto L_0x004f
            r19 = 3
            goto L_0x0051
        L_0x004f:
            r19 = r52
        L_0x0051:
            int[] r20 = A.e.a.f118b
            int r21 = r39.ordinal()
            r12 = r20[r21]
            r2 = 1
            if (r12 == r2) goto L_0x0065
            r2 = 2
            if (r12 == r2) goto L_0x0065
            r2 = 3
            if (r12 == r2) goto L_0x0065
            r2 = 4
            if (r12 == r2) goto L_0x006a
        L_0x0065:
            r12 = r19
        L_0x0067:
            r19 = 0
            goto L_0x0071
        L_0x006a:
            r12 = r19
            if (r12 != r2) goto L_0x006f
            goto L_0x0067
        L_0x006f:
            r19 = 1
        L_0x0071:
            int r2 = r0.f81f0
            r14 = 8
            if (r2 != r14) goto L_0x007b
            r2 = 0
            r19 = 0
            goto L_0x007d
        L_0x007b:
            r2 = r44
        L_0x007d:
            if (r57 == 0) goto L_0x009f
            if (r16 != 0) goto L_0x008f
            if (r17 != 0) goto L_0x008f
            if (r18 != 0) goto L_0x008f
            r14 = r43
            r10.f(r9, r14)
        L_0x008a:
            r23 = r6
            r6 = 8
            goto L_0x00a2
        L_0x008f:
            if (r16 == 0) goto L_0x008a
            if (r17 != 0) goto L_0x008a
            int r14 = r41.b()
            r23 = r6
            r6 = 8
            r10.e(r9, r7, r14, r6)
            goto L_0x00a2
        L_0x009f:
            r23 = r6
            r6 = r14
        L_0x00a2:
            if (r19 != 0) goto L_0x00cd
            if (r40 == 0) goto L_0x00bb
            r6 = 0
            r14 = 3
            r10.e(r8, r9, r6, r14)
            r6 = 8
            if (r15 <= 0) goto L_0x00b2
            r10.h(r8, r9, r15, r6)
        L_0x00b2:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r2) goto L_0x00be
            r10.j(r8, r9, r1, r6)
            goto L_0x00be
        L_0x00bb:
            r10.e(r8, r9, r2, r6)
        L_0x00be:
            r24 = r3
            r1 = r4
            r15 = r7
            r2 = r8
        L_0x00c3:
            r25 = r19
            r14 = r23
            r19 = r36
        L_0x00c9:
            r23 = r5
            goto L_0x01b1
        L_0x00cd:
            r1 = 2
            if (r5 == r1) goto L_0x00f2
            if (r48 != 0) goto L_0x00f2
            r1 = 1
            if (r12 == r1) goto L_0x00d7
            if (r12 != 0) goto L_0x00f2
        L_0x00d7:
            int r1 = java.lang.Math.max(r3, r2)
            if (r4 <= 0) goto L_0x00e1
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00e1:
            r2 = 8
            r10.e(r8, r9, r1, r2)
            r19 = r36
            r24 = r3
            r1 = r4
            r15 = r7
            r2 = r8
            r14 = r23
            r25 = 0
            goto L_0x00c9
        L_0x00f2:
            r1 = -2
            if (r3 != r1) goto L_0x00f7
            r14 = r2
            goto L_0x00f8
        L_0x00f7:
            r14 = r3
        L_0x00f8:
            if (r4 != r1) goto L_0x00fc
            r1 = r2
            goto L_0x00fd
        L_0x00fc:
            r1 = r4
        L_0x00fd:
            if (r2 <= 0) goto L_0x0103
            r3 = 1
            if (r12 == r3) goto L_0x0103
            r2 = 0
        L_0x0103:
            r3 = 8
            if (r14 <= 0) goto L_0x010e
            r10.h(r8, r9, r14, r3)
            int r2 = java.lang.Math.max(r2, r14)
        L_0x010e:
            r4 = 1
            if (r1 <= 0) goto L_0x011d
            if (r34 == 0) goto L_0x0116
            if (r12 != r4) goto L_0x0116
            goto L_0x0119
        L_0x0116:
            r10.j(r8, r9, r1, r3)
        L_0x0119:
            int r2 = java.lang.Math.min(r2, r1)
        L_0x011d:
            if (r12 != r4) goto L_0x013b
            if (r34 == 0) goto L_0x0125
            r10.e(r8, r9, r2, r3)
            goto L_0x0136
        L_0x0125:
            if (r49 == 0) goto L_0x012f
            r4 = 5
            r10.e(r8, r9, r2, r4)
            r10.j(r8, r9, r2, r3)
            goto L_0x0136
        L_0x012f:
            r4 = 5
            r10.e(r8, r9, r2, r4)
            r10.j(r8, r9, r2, r3)
        L_0x0136:
            r15 = r7
            r2 = r8
            r24 = r14
            goto L_0x00c3
        L_0x013b:
            r2 = 2
            if (r12 != r2) goto L_0x01a3
            A.d$b r3 = r41.g()
            A.d$b r4 = A.d.b.TOP
            if (r3 == r4) goto L_0x016b
            A.d$b r3 = r41.g()
            A.d$b r6 = A.d.b.BOTTOM
            if (r3 != r6) goto L_0x014f
            goto L_0x016b
        L_0x014f:
            A.e r3 = r0.f57N
            A.d$b r4 = A.d.b.LEFT
            A.d r3 = r3.k(r4)
            z.i r3 = r10.q(r3)
            A.e r4 = r0.f57N
            A.d$b r6 = A.d.b.RIGHT
            A.d r4 = r4.k(r6)
            z.i r4 = r10.q(r4)
        L_0x0167:
            r19 = r3
            r6 = r4
            goto L_0x0182
        L_0x016b:
            A.e r3 = r0.f57N
            A.d r3 = r3.k(r4)
            z.i r3 = r10.q(r3)
            A.e r4 = r0.f57N
            A.d$b r6 = A.d.b.BOTTOM
            A.d r4 = r4.k(r6)
            z.i r4 = r10.q(r4)
            goto L_0x0167
        L_0x0182:
            z.b r3 = r32.r()
            r4 = r8
            r2 = r5
            r5 = r9
            r40 = r14
            r14 = r23
            r15 = r7
            r7 = r19
            r23 = r2
            r2 = r8
            r8 = r56
            z.b r3 = r3.k(r4, r5, r6, r7, r8)
            r10.d(r3)
            r19 = r36
            r24 = r40
            r25 = 0
            goto L_0x01b1
        L_0x01a3:
            r15 = r7
            r2 = r8
            r40 = r14
            r14 = r23
            r23 = r5
            r24 = r40
            r25 = r19
            r19 = 1
        L_0x01b1:
            if (r57 == 0) goto L_0x0416
            if (r49 == 0) goto L_0x01c3
            r3 = r38
            r5 = r2
            r4 = r9
            r1 = r11
            r6 = r23
            r2 = 8
            r7 = 2
            r22 = 1
            goto L_0x0422
        L_0x01c3:
            if (r16 != 0) goto L_0x01cc
            if (r17 != 0) goto L_0x01cc
            if (r18 != 0) goto L_0x01cc
        L_0x01c9:
            r5 = r2
            goto L_0x03fb
        L_0x01cc:
            if (r16 == 0) goto L_0x01d1
            if (r17 != 0) goto L_0x01d1
            goto L_0x01c9
        L_0x01d1:
            if (r16 != 0) goto L_0x01e7
            if (r17 == 0) goto L_0x01e7
            int r1 = r42.b()
            int r1 = -r1
            r3 = 8
            r10.e(r2, r14, r1, r3)
            if (r34 == 0) goto L_0x01c9
            r1 = 5
            r6 = 0
            r10.h(r9, r11, r6, r1)
            goto L_0x01c9
        L_0x01e7:
            r3 = 8
            r6 = 0
            if (r16 == 0) goto L_0x01c9
            if (r17 == 0) goto L_0x01c9
            A.d r4 = r13.f28d
            A.e r8 = r4.f26b
            r5 = r42
            r7 = r3
            A.d r3 = r5.f28d
            A.e r4 = r3.f26b
            A.e r3 = r31.E()
            r16 = 6
            if (r25 == 0) goto L_0x02cb
            if (r12 != 0) goto L_0x0237
            if (r1 != 0) goto L_0x020f
            if (r24 != 0) goto L_0x020f
            r18 = r6
            r1 = r7
            r17 = r1
            r20 = 1
            goto L_0x0216
        L_0x020f:
            r20 = r6
            r1 = 5
            r17 = 5
            r18 = 1
        L_0x0216:
            boolean r6 = r8 instanceof A.a
            if (r6 != 0) goto L_0x022b
            boolean r6 = r4 instanceof A.a
            if (r6 == 0) goto L_0x021f
            goto L_0x022b
        L_0x021f:
            r23 = r1
            r1 = r16
            r21 = r18
            r6 = 0
            r7 = 1
            r18 = r17
            goto L_0x02d6
        L_0x022b:
            r23 = r1
            r1 = r16
            r21 = r18
            r6 = 0
            r7 = 1
        L_0x0233:
            r18 = 4
            goto L_0x02d6
        L_0x0237:
            r6 = 1
            if (r12 != r6) goto L_0x0248
            r23 = r7
            r1 = r16
            r6 = 1
            r7 = 1
            r18 = 4
            r20 = 0
            r21 = 1
            goto L_0x02d6
        L_0x0248:
            r6 = 3
            if (r12 != r6) goto L_0x02c0
            int r6 = r0.f110u
            r7 = -1
            if (r6 != r7) goto L_0x0266
            if (r50 == 0) goto L_0x0263
            if (r34 == 0) goto L_0x0261
            r1 = 5
        L_0x0255:
            r6 = 1
            r7 = 1
            r18 = 5
            r20 = 1
            r21 = 1
            r23 = 8
            goto L_0x02d6
        L_0x0261:
            r1 = 4
            goto L_0x0255
        L_0x0263:
            r1 = 8
            goto L_0x0255
        L_0x0266:
            if (r48 == 0) goto L_0x0285
            r6 = r53
            r7 = 2
            if (r6 == r7) goto L_0x0275
            r7 = 1
            if (r6 != r7) goto L_0x0271
            goto L_0x0276
        L_0x0271:
            r1 = 8
            r6 = 5
            goto L_0x0278
        L_0x0275:
            r7 = 1
        L_0x0276:
            r1 = 5
            r6 = 4
        L_0x0278:
            r23 = r1
            r18 = r6
            r6 = r7
            r20 = r6
            r21 = r20
            r1 = r16
            goto L_0x02d6
        L_0x0285:
            r7 = 1
            if (r1 <= 0) goto L_0x0294
            r6 = r7
            r20 = r6
            r21 = r20
            r1 = r16
            r18 = 5
        L_0x0291:
            r23 = 5
            goto L_0x02d6
        L_0x0294:
            if (r1 != 0) goto L_0x02b6
            if (r24 != 0) goto L_0x02b6
            if (r50 != 0) goto L_0x02a4
            r6 = r7
            r20 = r6
            r21 = r20
            r1 = r16
            r18 = 8
            goto L_0x0291
        L_0x02a4:
            if (r8 == r3) goto L_0x02aa
            if (r4 == r3) goto L_0x02aa
            r1 = 4
            goto L_0x02ab
        L_0x02aa:
            r1 = 5
        L_0x02ab:
            r23 = r1
            r6 = r7
            r20 = r6
            r21 = r20
            r1 = r16
            goto L_0x0233
        L_0x02b6:
            r6 = r7
            r20 = r6
            r21 = r20
            r1 = r16
            r18 = 4
            goto L_0x0291
        L_0x02c0:
            r7 = 1
            r1 = r16
            r6 = 0
            r18 = 4
            r20 = 0
            r21 = 0
            goto L_0x0291
        L_0x02cb:
            r7 = 1
            r6 = r7
            r21 = r6
            r1 = r16
            r18 = 4
            r20 = 0
            goto L_0x0291
        L_0x02d6:
            if (r6 == 0) goto L_0x02e1
            if (r15 != r14) goto L_0x02e1
            if (r8 == r3) goto L_0x02e1
            r26 = 0
            r27 = 0
            goto L_0x02e5
        L_0x02e1:
            r26 = r6
            r27 = r7
        L_0x02e5:
            if (r21 == 0) goto L_0x031d
            int r6 = r0.f81f0
            r7 = 8
            if (r6 != r7) goto L_0x02f0
            r17 = 4
            goto L_0x02f2
        L_0x02f0:
            r17 = r1
        L_0x02f2:
            int r6 = r41.b()
            int r28 = r42.b()
            r1 = r32
            r36 = r2
            r13 = 0
            r21 = 4
            r22 = 1
            r2 = r9
            r13 = r3
            r3 = r15
            r52 = r12
            r12 = r4
            r4 = r6
            r6 = r5
            r5 = r47
            r6 = r14
            r11 = r7
            r7 = r36
            r29 = r8
            r8 = r28
            r30 = r9
            r9 = r17
            r1.c(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x032d
        L_0x031d:
            r36 = r2
            r13 = r3
            r22 = r7
            r29 = r8
            r30 = r9
            r52 = r12
            r11 = 8
            r21 = 4
            r12 = r4
        L_0x032d:
            int r1 = r0.f81f0
            if (r1 != r11) goto L_0x0332
            return
        L_0x0332:
            if (r26 == 0) goto L_0x0361
            if (r34 == 0) goto L_0x0347
            if (r15 == r14) goto L_0x0347
            if (r25 != 0) goto L_0x0347
            r1 = r29
            boolean r2 = r1 instanceof A.a
            if (r2 != 0) goto L_0x0344
            boolean r2 = r12 instanceof A.a
            if (r2 == 0) goto L_0x0349
        L_0x0344:
            r2 = r16
            goto L_0x034b
        L_0x0347:
            r1 = r29
        L_0x0349:
            r2 = r23
        L_0x034b:
            int r3 = r41.b()
            r4 = r30
            r10.h(r4, r15, r3, r2)
            int r3 = r42.b()
            int r3 = -r3
            r5 = r36
            r10.j(r5, r14, r3, r2)
            r23 = r2
            goto L_0x0367
        L_0x0361:
            r5 = r36
            r1 = r29
            r4 = r30
        L_0x0367:
            if (r34 == 0) goto L_0x0379
            if (r51 == 0) goto L_0x0379
            boolean r2 = r1 instanceof A.a
            if (r2 != 0) goto L_0x0379
            boolean r2 = r12 instanceof A.a
            if (r2 != 0) goto L_0x0379
            r3 = r16
            r6 = r3
            r2 = r22
            goto L_0x037f
        L_0x0379:
            r3 = r18
            r6 = r23
            r2 = r27
        L_0x037f:
            if (r2 == 0) goto L_0x03cd
            if (r20 == 0) goto L_0x03ad
            if (r50 == 0) goto L_0x0387
            if (r35 == 0) goto L_0x03ad
        L_0x0387:
            if (r1 == r13) goto L_0x038e
            if (r12 != r13) goto L_0x038c
            goto L_0x038e
        L_0x038c:
            r16 = r3
        L_0x038e:
            boolean r2 = r1 instanceof A.g
            if (r2 != 0) goto L_0x0396
            boolean r2 = r12 instanceof A.g
            if (r2 == 0) goto L_0x0398
        L_0x0396:
            r16 = 5
        L_0x0398:
            boolean r2 = r1 instanceof A.a
            if (r2 != 0) goto L_0x03a0
            boolean r2 = r12 instanceof A.a
            if (r2 == 0) goto L_0x03a2
        L_0x03a0:
            r16 = 5
        L_0x03a2:
            if (r50 == 0) goto L_0x03a6
            r2 = 5
            goto L_0x03a8
        L_0x03a6:
            r2 = r16
        L_0x03a8:
            int r2 = java.lang.Math.max(r2, r3)
            goto L_0x03ae
        L_0x03ad:
            r2 = r3
        L_0x03ae:
            if (r34 == 0) goto L_0x03be
            int r2 = java.lang.Math.min(r6, r2)
            if (r48 == 0) goto L_0x03be
            if (r50 != 0) goto L_0x03be
            if (r1 == r13) goto L_0x03bc
            if (r12 != r13) goto L_0x03be
        L_0x03bc:
            r2 = r21
        L_0x03be:
            int r1 = r41.b()
            r10.e(r4, r15, r1, r2)
            int r1 = r42.b()
            int r1 = -r1
            r10.e(r5, r14, r1, r2)
        L_0x03cd:
            if (r34 == 0) goto L_0x03e1
            r1 = r37
            r2 = r11
            if (r1 != r15) goto L_0x03d9
            int r3 = r41.b()
            goto L_0x03da
        L_0x03d9:
            r3 = 0
        L_0x03da:
            if (r15 == r1) goto L_0x03e2
            r6 = 5
            r10.h(r4, r1, r3, r6)
            goto L_0x03e2
        L_0x03e1:
            r2 = r11
        L_0x03e2:
            if (r34 == 0) goto L_0x03fb
            if (r25 == 0) goto L_0x03fb
            if (r45 != 0) goto L_0x03fb
            if (r24 != 0) goto L_0x03fb
            if (r25 == 0) goto L_0x03f6
            r12 = r52
            r1 = 3
            if (r12 != r1) goto L_0x03f6
            r1 = 0
            r10.h(r5, r4, r1, r2)
            goto L_0x03fb
        L_0x03f6:
            r1 = 0
            r2 = 5
            r10.h(r5, r4, r1, r2)
        L_0x03fb:
            if (r34 == 0) goto L_0x0415
            if (r19 == 0) goto L_0x0415
            r1 = r42
            A.d r2 = r1.f28d
            if (r2 == 0) goto L_0x040c
            int r2 = r42.b()
            r3 = r38
            goto L_0x040f
        L_0x040c:
            r3 = r38
            r2 = 0
        L_0x040f:
            if (r14 == r3) goto L_0x0415
            r1 = 5
            r10.h(r3, r5, r2, r1)
        L_0x0415:
            return
        L_0x0416:
            r3 = r38
            r5 = r2
            r4 = r9
            r1 = r11
            r2 = 8
            r7 = 2
            r22 = 1
            r6 = r23
        L_0x0422:
            if (r6 >= r7) goto L_0x0463
            if (r34 == 0) goto L_0x0463
            if (r19 == 0) goto L_0x0463
            r6 = 0
            r10.h(r4, r1, r6, r2)
            if (r33 != 0) goto L_0x0437
            A.d r1 = r0.f49F
            A.d r1 = r1.f28d
            if (r1 != 0) goto L_0x0435
            goto L_0x0437
        L_0x0435:
            r1 = 0
            goto L_0x0439
        L_0x0437:
            r1 = r22
        L_0x0439:
            if (r33 != 0) goto L_0x045b
            A.d r4 = r0.f49F
            A.d r4 = r4.f28d
            if (r4 == 0) goto L_0x045b
            A.e r1 = r4.f26b
            float r4 = r1.f60Q
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0458
            A.e$b[] r1 = r1.f56M
            r4 = 0
            r6 = r1[r4]
            A.e$b r4 = A.e.b.MATCH_CONSTRAINT
            if (r6 != r4) goto L_0x0458
            r1 = r1[r22]
            if (r1 != r4) goto L_0x0458
            goto L_0x045d
        L_0x0458:
            r22 = 0
            goto L_0x045d
        L_0x045b:
            r22 = r1
        L_0x045d:
            if (r22 == 0) goto L_0x0463
            r1 = 0
            r10.h(r3, r5, r1, r2)
        L_0x0463:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A.e.h(z.d, boolean, boolean, boolean, boolean, z.i, z.i, A.e$b, boolean, A.d, A.d, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void h0(int i4, int i5) {
        this.f62S = i4;
        int i6 = i5 - i4;
        this.f58O = i6;
        int i7 = this.f69Z;
        if (i6 < i7) {
            this.f58O = i7;
        }
    }

    public void i(e eVar, float f4, int i4) {
        d.b bVar = d.b.CENTER;
        R(bVar, eVar, bVar, i4, 0);
        this.f114x = f4;
    }

    public void i0(b bVar) {
        this.f56M[0] = bVar;
    }

    public void j(z.d dVar) {
        dVar.q(this.f45B);
        dVar.q(this.f46C);
        dVar.q(this.f47D);
        dVar.q(this.f48E);
        if (this.f68Y > 0) {
            dVar.q(this.f49F);
        }
    }

    public void j0(int i4, int i5, int i6, float f4) {
        this.f92l = i4;
        this.f98o = i5;
        if (i6 == Integer.MAX_VALUE) {
            i6 = 0;
        }
        this.f100p = i6;
        this.f102q = f4;
        if (f4 > 0.0f && f4 < 1.0f && i4 == 0) {
            this.f92l = 2;
        }
    }

    public d k(d.b bVar) {
        switch (a.f117a[bVar.ordinal()]) {
            case 1:
                return this.f45B;
            case 2:
                return this.f46C;
            case 3:
                return this.f47D;
            case 4:
                return this.f48E;
            case 5:
                return this.f49F;
            case 6:
                return this.f52I;
            case 7:
                return this.f50G;
            case 8:
                return this.f51H;
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void k0(float f4) {
        this.f103q0[0] = f4;
    }

    public int l() {
        return this.f68Y;
    }

    public void l0(int i4, boolean z4) {
        this.f55L[i4] = z4;
    }

    public float m(int i4) {
        if (i4 == 0) {
            return this.f73b0;
        }
        if (i4 == 1) {
            return this.f75c0;
        }
        return -1.0f;
    }

    public void m0(boolean z4) {
        this.f116z = z4;
    }

    public int n() {
        return P() + this.f59P;
    }

    public void n0(int i4) {
        this.f113w[1] = i4;
    }

    public Object o() {
        return this.f77d0;
    }

    public void o0(int i4) {
        this.f113w[0] = i4;
    }

    public String p() {
        return this.f83g0;
    }

    public void p0(int i4) {
        if (i4 < 0) {
            this.f71a0 = 0;
        } else {
            this.f71a0 = i4;
        }
    }

    public b q(int i4) {
        if (i4 == 0) {
            return w();
        }
        if (i4 == 1) {
            return K();
        }
        return null;
    }

    public void q0(int i4) {
        if (i4 < 0) {
            this.f69Z = 0;
        } else {
            this.f69Z = i4;
        }
    }

    public float r() {
        return this.f60Q;
    }

    public void r0(int i4, int i5) {
        this.f62S = i4;
        this.f63T = i5;
    }

    public int s() {
        return this.f61R;
    }

    public void s0(e eVar) {
        this.f57N = eVar;
    }

    public int t() {
        if (this.f81f0 == 8) {
            return 0;
        }
        return this.f59P;
    }

    public void t0(float f4) {
        this.f75c0 = f4;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f85h0 != null) {
            str = "type: " + this.f85h0 + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.f83g0 != null) {
            str2 = "id: " + this.f83g0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f62S);
        sb.append(", ");
        sb.append(this.f63T);
        sb.append(") - (");
        sb.append(this.f58O);
        sb.append(" x ");
        sb.append(this.f59P);
        sb.append(")");
        return sb.toString();
    }

    public float u() {
        return this.f73b0;
    }

    public void u0(int i4) {
        this.f97n0 = i4;
    }

    public int v() {
        return this.f95m0;
    }

    public void v0(int i4, int i5) {
        this.f63T = i4;
        int i6 = i5 - i4;
        this.f59P = i6;
        int i7 = this.f71a0;
        if (i6 < i7) {
            this.f59P = i7;
        }
    }

    public b w() {
        return this.f56M[0];
    }

    public void w0(b bVar) {
        this.f56M[1] = bVar;
    }

    public int x() {
        d dVar = this.f45B;
        int i4 = dVar != null ? dVar.f29e : 0;
        d dVar2 = this.f47D;
        return dVar2 != null ? i4 + dVar2.f29e : i4;
    }

    public void x0(int i4, int i5, int i6, float f4) {
        this.f94m = i4;
        this.f104r = i5;
        if (i6 == Integer.MAX_VALUE) {
            i6 = 0;
        }
        this.f106s = i6;
        this.f108t = f4;
        if (f4 > 0.0f && f4 < 1.0f && i4 == 0) {
            this.f94m = 2;
        }
    }

    public int y(int i4) {
        if (i4 == 0) {
            return N();
        }
        if (i4 == 1) {
            return t();
        }
        return 0;
    }

    public void y0(float f4) {
        this.f103q0[1] = f4;
    }

    public int z() {
        return this.f113w[1];
    }

    public void z0(int i4) {
        this.f81f0 = i4;
    }
}
