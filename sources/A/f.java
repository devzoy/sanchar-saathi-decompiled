package A;

import A.e;
import B.b;
import B.e;
import java.util.ArrayList;
import java.util.Arrays;
import z.d;

public class f extends k {

    /* renamed from: A0  reason: collision with root package name */
    public boolean f124A0 = false;

    /* renamed from: B0  reason: collision with root package name */
    public d f125B0 = new d();

    /* renamed from: C0  reason: collision with root package name */
    public int f126C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f127D0;

    /* renamed from: E0  reason: collision with root package name */
    public int f128E0;

    /* renamed from: F0  reason: collision with root package name */
    public int f129F0;

    /* renamed from: G0  reason: collision with root package name */
    public int f130G0 = 0;

    /* renamed from: H0  reason: collision with root package name */
    public int f131H0 = 0;

    /* renamed from: I0  reason: collision with root package name */
    public c[] f132I0 = new c[4];

    /* renamed from: J0  reason: collision with root package name */
    public c[] f133J0 = new c[4];

    /* renamed from: K0  reason: collision with root package name */
    public boolean f134K0 = false;

    /* renamed from: L0  reason: collision with root package name */
    public boolean f135L0 = false;

    /* renamed from: M0  reason: collision with root package name */
    public boolean f136M0 = false;

    /* renamed from: N0  reason: collision with root package name */
    public int f137N0 = 0;

    /* renamed from: O0  reason: collision with root package name */
    public int f138O0 = 0;

    /* renamed from: P0  reason: collision with root package name */
    public int f139P0 = 263;

    /* renamed from: Q0  reason: collision with root package name */
    public boolean f140Q0 = false;

    /* renamed from: R0  reason: collision with root package name */
    public boolean f141R0 = false;

    /* renamed from: S0  reason: collision with root package name */
    public boolean f142S0 = false;

    /* renamed from: T0  reason: collision with root package name */
    public int f143T0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public b f144x0 = new b(this);

    /* renamed from: y0  reason: collision with root package name */
    public e f145y0 = new e(this);

    /* renamed from: z0  reason: collision with root package name */
    public b.C0001b f146z0 = null;

    public void E0(boolean z4, boolean z5) {
        super.E0(z4, z5);
        int size = this.f157w0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((e) this.f157w0.get(i4)).E0(z4, z5);
        }
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* JADX WARNING: type inference failed for: r11v12 */
    public void G0() {
        boolean z4;
        ? r11;
        boolean z5;
        this.f62S = 0;
        this.f63T = 0;
        int max = Math.max(0, N());
        int max2 = Math.max(0, t());
        this.f141R0 = false;
        this.f142S0 = false;
        boolean z6 = Y0(64) || Y0(128);
        d dVar = this.f125B0;
        dVar.f12762g = false;
        dVar.f12763h = false;
        if (this.f139P0 != 0 && z6) {
            dVar.f12763h = true;
        }
        e.b[] bVarArr = this.f56M;
        e.b bVar = bVarArr[1];
        e.b bVar2 = bVarArr[0];
        ArrayList arrayList = this.f157w0;
        e.b w4 = w();
        e.b bVar3 = e.b.WRAP_CONTENT;
        boolean z7 = w4 == bVar3 || K() == bVar3;
        Z0();
        int size = this.f157w0.size();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = (e) this.f157w0.get(i4);
            if (eVar instanceof k) {
                ((k) eVar).G0();
            }
        }
        int i5 = 0;
        boolean z8 = false;
        boolean z9 = true;
        while (z9) {
            int i6 = i5 + 1;
            try {
                this.f125B0.D();
                Z0();
                j(this.f125B0);
                for (int i7 = 0; i7 < size; i7++) {
                    ((e) this.f157w0.get(i7)).j(this.f125B0);
                }
                z9 = K0(this.f125B0);
                if (z9) {
                    this.f125B0.z();
                }
            } catch (Exception e4) {
                e4.printStackTrace();
                System.out.println("EXCEPTION : " + e4);
            }
            if (z9) {
                d1(this.f125B0, j.f156a);
            } else {
                F0(this.f125B0);
                for (int i8 = 0; i8 < size; i8++) {
                    ((e) this.f157w0.get(i8)).F0(this.f125B0);
                }
            }
            if (!z7 || i6 >= 8 || !j.f156a[2]) {
                z4 = false;
            } else {
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    e eVar2 = (e) this.f157w0.get(i11);
                    i9 = Math.max(i9, eVar2.f62S + eVar2.N());
                    i10 = Math.max(i10, eVar2.f63T + eVar2.t());
                }
                int max3 = Math.max(this.f69Z, i9);
                int max4 = Math.max(this.f71a0, i10);
                e.b bVar4 = e.b.WRAP_CONTENT;
                if (bVar2 != bVar4 || N() >= max3) {
                    z4 = false;
                } else {
                    A0(max3);
                    this.f56M[0] = bVar4;
                    z4 = true;
                    z8 = true;
                }
                if (bVar == bVar4 && t() < max4) {
                    e0(max4);
                    this.f56M[1] = bVar4;
                    z4 = true;
                    z8 = true;
                }
            }
            int max5 = Math.max(this.f69Z, N());
            if (max5 > N()) {
                A0(max5);
                this.f56M[0] = e.b.FIXED;
                z4 = true;
                z8 = true;
            }
            int max6 = Math.max(this.f71a0, t());
            if (max6 > t()) {
                e0(max6);
                r11 = 1;
                this.f56M[1] = e.b.FIXED;
                z4 = true;
                z5 = true;
            } else {
                r11 = 1;
                z5 = z8;
            }
            if (!z5) {
                e.b bVar5 = this.f56M[0];
                e.b bVar6 = e.b.WRAP_CONTENT;
                if (bVar5 == bVar6 && max > 0 && N() > max) {
                    this.f141R0 = r11;
                    this.f56M[0] = e.b.FIXED;
                    A0(max);
                    z4 = r11;
                    z5 = z4;
                }
                if (this.f56M[r11] == bVar6 && max2 > 0 && t() > max2) {
                    this.f142S0 = r11;
                    this.f56M[r11] = e.b.FIXED;
                    e0(max2);
                    z9 = true;
                    z8 = true;
                    i5 = i6;
                }
            }
            z9 = z4;
            z8 = z5;
            i5 = i6;
        }
        this.f157w0 = arrayList;
        if (z8) {
            e.b[] bVarArr2 = this.f56M;
            bVarArr2[0] = bVar2;
            bVarArr2[1] = bVar;
        }
        X(this.f125B0.v());
    }

    public void J0(e eVar, int i4) {
        if (i4 == 0) {
            L0(eVar);
        } else if (i4 == 1) {
            M0(eVar);
        }
    }

    public boolean K0(d dVar) {
        f(dVar);
        int size = this.f157w0.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = (e) this.f157w0.get(i4);
            eVar.l0(0, false);
            eVar.l0(1, false);
            if (eVar instanceof a) {
                z4 = true;
            }
        }
        if (z4) {
            for (int i5 = 0; i5 < size; i5++) {
                e eVar2 = (e) this.f157w0.get(i5);
                if (eVar2 instanceof a) {
                    ((a) eVar2).J0();
                }
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            e eVar3 = (e) this.f157w0.get(i6);
            if (eVar3.e()) {
                eVar3.f(dVar);
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            e eVar4 = (e) this.f157w0.get(i7);
            if (eVar4 instanceof f) {
                e.b[] bVarArr = eVar4.f56M;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                e.b bVar3 = e.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    eVar4.i0(e.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    eVar4.w0(e.b.FIXED);
                }
                eVar4.f(dVar);
                if (bVar == bVar3) {
                    eVar4.i0(bVar);
                }
                if (bVar2 == bVar3) {
                    eVar4.w0(bVar2);
                }
            } else {
                j.a(this, dVar, eVar4);
                if (!eVar4.e()) {
                    eVar4.f(dVar);
                }
            }
        }
        if (this.f130G0 > 0) {
            b.a(this, dVar, 0);
        }
        if (this.f131H0 > 0) {
            b.a(this, dVar, 1);
        }
        return true;
    }

    public final void L0(e eVar) {
        int i4 = this.f130G0 + 1;
        c[] cVarArr = this.f133J0;
        if (i4 >= cVarArr.length) {
            this.f133J0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f133J0[this.f130G0] = new c(eVar, 0, V0());
        this.f130G0++;
    }

    public final void M0(e eVar) {
        int i4 = this.f131H0 + 1;
        c[] cVarArr = this.f132I0;
        if (i4 >= cVarArr.length) {
            this.f132I0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f132I0[this.f131H0] = new c(eVar, 1, V0());
        this.f131H0++;
    }

    public boolean N0(boolean z4) {
        return this.f145y0.f(z4);
    }

    public boolean O0(boolean z4) {
        return this.f145y0.g(z4);
    }

    public boolean P0(boolean z4, int i4) {
        return this.f145y0.h(z4, i4);
    }

    public b.C0001b Q0() {
        return this.f146z0;
    }

    public int R0() {
        return this.f139P0;
    }

    public void S0() {
        this.f145y0.j();
    }

    public void T0() {
        this.f145y0.k();
    }

    public boolean U0() {
        return this.f142S0;
    }

    public boolean V0() {
        return this.f124A0;
    }

    public void W() {
        this.f125B0.D();
        this.f126C0 = 0;
        this.f128E0 = 0;
        this.f127D0 = 0;
        this.f129F0 = 0;
        this.f140Q0 = false;
        super.W();
    }

    public boolean W0() {
        return this.f141R0;
    }

    public long X0(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13 = i11;
        this.f126C0 = i13;
        int i14 = i12;
        this.f127D0 = i14;
        return this.f144x0.d(this, i4, i13, i14, i5, i6, i7, i8, i9, i10);
    }

    public boolean Y0(int i4) {
        return (this.f139P0 & i4) == i4;
    }

    public final void Z0() {
        this.f130G0 = 0;
        this.f131H0 = 0;
    }

    public void a1(b.C0001b bVar) {
        this.f146z0 = bVar;
        this.f145y0.n(bVar);
    }

    public void b1(int i4) {
        this.f139P0 = i4;
        d.f12753r = j.b(i4, 256);
    }

    public void c1(boolean z4) {
        this.f124A0 = z4;
    }

    public void d1(d dVar, boolean[] zArr) {
        zArr[2] = false;
        F0(dVar);
        int size = this.f157w0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((e) this.f157w0.get(i4)).F0(dVar);
        }
    }

    public void e1() {
        this.f144x0.e(this);
    }
}
