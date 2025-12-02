package B;

import A.d;
import A.e;
import A.f;
import A.g;
import A.h;
import A.j;
import java.util.ArrayList;
import z.d;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f165a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public a f166b = new a();

    /* renamed from: c  reason: collision with root package name */
    public f f167c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public e.b f168a;

        /* renamed from: b  reason: collision with root package name */
        public e.b f169b;

        /* renamed from: c  reason: collision with root package name */
        public int f170c;

        /* renamed from: d  reason: collision with root package name */
        public int f171d;

        /* renamed from: e  reason: collision with root package name */
        public int f172e;

        /* renamed from: f  reason: collision with root package name */
        public int f173f;

        /* renamed from: g  reason: collision with root package name */
        public int f174g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f175h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f176i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f177j;
    }

    /* renamed from: B.b$b  reason: collision with other inner class name */
    public interface C0001b {
        void a();

        void b(e eVar, a aVar);
    }

    public b(f fVar) {
        this.f167c = fVar;
    }

    public final boolean a(C0001b bVar, e eVar, boolean z4) {
        this.f166b.f168a = eVar.w();
        this.f166b.f169b = eVar.K();
        this.f166b.f170c = eVar.N();
        this.f166b.f171d = eVar.t();
        a aVar = this.f166b;
        aVar.f176i = false;
        aVar.f177j = z4;
        e.b bVar2 = aVar.f168a;
        e.b bVar3 = e.b.MATCH_CONSTRAINT;
        boolean z5 = bVar2 == bVar3;
        boolean z6 = aVar.f169b == bVar3;
        boolean z7 = z5 && eVar.f60Q > 0.0f;
        boolean z8 = z6 && eVar.f60Q > 0.0f;
        if (z7 && eVar.f96n[0] == 4) {
            aVar.f168a = e.b.FIXED;
        }
        if (z8 && eVar.f96n[1] == 4) {
            aVar.f169b = e.b.FIXED;
        }
        bVar.b(eVar, aVar);
        eVar.A0(this.f166b.f172e);
        eVar.e0(this.f166b.f173f);
        eVar.d0(this.f166b.f175h);
        eVar.Y(this.f166b.f174g);
        a aVar2 = this.f166b;
        aVar2.f177j = false;
        return aVar2.f176i;
    }

    public final void b(f fVar) {
        int size = fVar.f157w0.size();
        C0001b Q02 = fVar.Q0();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = (e) fVar.f157w0.get(i4);
            if (!(eVar instanceof g) && (!eVar.f78e.f228e.f198j || !eVar.f80f.f228e.f198j)) {
                e.b q4 = eVar.q(0);
                e.b q5 = eVar.q(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (q4 != bVar || eVar.f92l == 1 || q5 != bVar || eVar.f94m == 1) {
                    a(Q02, eVar, false);
                }
            }
        }
        Q02.a();
    }

    public final void c(f fVar, String str, int i4, int i5) {
        int C4 = fVar.C();
        int B4 = fVar.B();
        fVar.q0(0);
        fVar.p0(0);
        fVar.A0(i4);
        fVar.e0(i5);
        fVar.q0(C4);
        fVar.p0(B4);
        this.f167c.G0();
    }

    public long d(f fVar, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13;
        boolean z4;
        boolean z5;
        int i14;
        int i15;
        C0001b bVar;
        int i16;
        int i17;
        int i18;
        int i19;
        f fVar2 = fVar;
        int i20 = i4;
        int i21 = i7;
        int i22 = i9;
        C0001b Q02 = fVar.Q0();
        int size = fVar2.f157w0.size();
        int N4 = fVar.N();
        int t4 = fVar.t();
        boolean b4 = j.b(i20, 128);
        int i23 = 1;
        boolean z6 = b4 || j.b(i20, 64);
        if (z6) {
            int i24 = 0;
            while (true) {
                if (i24 >= size) {
                    break;
                }
                e eVar = (e) fVar2.f157w0.get(i24);
                e.b w4 = eVar.w();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z7 = (w4 == bVar2) && (eVar.K() == bVar2) && eVar.r() > 0.0f;
                if ((!eVar.T() || !z7) && ((!eVar.V() || !z7) && !eVar.T() && !eVar.V())) {
                    i24++;
                }
            }
            z6 = false;
        }
        if (z6) {
            int i25 = d.f12752q;
        }
        int i26 = 2;
        if (z6 && ((i21 == 1073741824 && i22 == 1073741824) || b4)) {
            int min = Math.min(fVar.A(), i8);
            int min2 = Math.min(fVar.z(), i10);
            if (i21 == 1073741824 && fVar.N() != min) {
                fVar2.A0(min);
                fVar.S0();
            }
            if (i22 == 1073741824 && fVar.t() != min2) {
                fVar2.e0(min2);
                fVar.S0();
            }
            if (i21 == 1073741824 && i22 == 1073741824) {
                z5 = fVar2.N0(b4);
                i13 = 2;
                z4 = false;
            } else {
                z5 = fVar2.O0(b4);
                z4 = false;
                if (i21 == 1073741824) {
                    z5 &= fVar2.P0(b4, 0);
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                if (i22 == 1073741824) {
                    z5 &= fVar2.P0(b4, 1);
                    i13++;
                }
            }
            if (z5) {
                fVar2.E0(i21 == 1073741824 ? true : z4, i22 == 1073741824 ? true : z4);
            }
        } else {
            z4 = false;
            z5 = false;
            i13 = 0;
        }
        if (z5 && i13 == 2) {
            return 0;
        }
        if (size > 0) {
            b(fVar);
        }
        int R02 = fVar.R0();
        int size2 = this.f165a.size();
        if (size > 0) {
            c(fVar2, "First pass", N4, t4);
        }
        if (size2 > 0) {
            e.b w5 = fVar.w();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z8 = w5 == bVar3 ? true : z4;
            boolean z9 = fVar.K() == bVar3 ? true : z4;
            int max = Math.max(fVar.N(), this.f167c.C());
            int max2 = Math.max(fVar.t(), this.f167c.B());
            for (int i27 = z4; i27 < size2; i27++) {
                e eVar2 = (e) this.f165a.get(i27);
            }
            int i28 = z4;
            boolean z10 = i28;
            while (i28 < i26) {
                int i29 = z4;
                while (i29 < size2) {
                    e eVar3 = (e) this.f165a.get(i29);
                    if (!(eVar3 instanceof h) && !(eVar3 instanceof g)) {
                        i18 = size2;
                        if (eVar3.M() != 8 && (!eVar3.f78e.f228e.f198j || !eVar3.f80f.f228e.f198j)) {
                            int N5 = eVar3.N();
                            int t5 = eVar3.t();
                            i17 = R02;
                            int l4 = eVar3.l();
                            i16 = i28;
                            boolean a4 = z10 | a(Q02, eVar3, true);
                            int N6 = eVar3.N();
                            bVar = Q02;
                            int t6 = eVar3.t();
                            if (N6 != N5) {
                                eVar3.A0(N6);
                                if (z8 && eVar3.G() > max) {
                                    max = Math.max(max, eVar3.G() + eVar3.k(d.b.RIGHT).b());
                                }
                                a4 = true;
                            }
                            if (t6 != t5) {
                                eVar3.e0(t6);
                                if (z9 && eVar3.n() > max2) {
                                    max2 = Math.max(max2, eVar3.n() + eVar3.k(d.b.BOTTOM).b());
                                }
                                a4 = true;
                            }
                            if (!eVar3.Q() || l4 == eVar3.l()) {
                                z10 = a4;
                                i19 = 1;
                                i29 += i19;
                                size2 = i18;
                                i28 = i16;
                                Q02 = bVar;
                                i23 = i19;
                                R02 = i17;
                            } else {
                                i19 = 1;
                                z10 = 1;
                                i29 += i19;
                                size2 = i18;
                                i28 = i16;
                                Q02 = bVar;
                                i23 = i19;
                                R02 = i17;
                            }
                        }
                    } else {
                        i18 = size2;
                    }
                    i17 = R02;
                    bVar = Q02;
                    i16 = i28;
                    i19 = 1;
                    i29 += i19;
                    size2 = i18;
                    i28 = i16;
                    Q02 = bVar;
                    i23 = i19;
                    R02 = i17;
                }
                int i30 = R02;
                int i31 = size2;
                C0001b bVar4 = Q02;
                int i32 = i23;
                int i33 = i28;
                if (z10 != 0) {
                    c(fVar2, "intermediate pass", N4, t4);
                    z10 = 0;
                }
                i28 = i33 + 1;
                size2 = i31;
                Q02 = bVar4;
                i23 = i32;
                i26 = 2;
                z4 = false;
                R02 = i30;
            }
            int i34 = R02;
            int i35 = i23;
            if (z10 != 0) {
                c(fVar2, "2nd pass", N4, t4);
                if (fVar.N() < max) {
                    fVar2.A0(max);
                    i14 = i35;
                } else {
                    i14 = 0;
                }
                if (fVar.t() < max2) {
                    fVar2.e0(max2);
                    i15 = i35;
                } else {
                    i15 = i14;
                }
                if (i15 != 0) {
                    c(fVar2, "3rd pass", N4, t4);
                }
            }
            R02 = i34;
        }
        fVar2.b1(R02);
        return 0;
    }

    public void e(f fVar) {
        e.b bVar;
        this.f165a.clear();
        int size = fVar.f157w0.size();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = (e) fVar.f157w0.get(i4);
            e.b w4 = eVar.w();
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (w4 == bVar2 || eVar.w() == (bVar = e.b.MATCH_PARENT) || eVar.K() == bVar2 || eVar.K() == bVar) {
                this.f165a.add(eVar);
            }
        }
        fVar.S0();
    }
}
