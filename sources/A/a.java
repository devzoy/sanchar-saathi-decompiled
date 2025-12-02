package A;

import A.e;
import z.d;
import z.i;

public class a extends i {

    /* renamed from: A0  reason: collision with root package name */
    public int f0A0 = 0;

    /* renamed from: y0  reason: collision with root package name */
    public int f1y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f2z0 = true;

    public boolean G0() {
        return this.f2z0;
    }

    public int H0() {
        return this.f1y0;
    }

    public int I0() {
        return this.f0A0;
    }

    public void J0() {
        for (int i4 = 0; i4 < this.f155x0; i4++) {
            e eVar = this.f154w0[i4];
            int i5 = this.f1y0;
            if (i5 == 0 || i5 == 1) {
                eVar.l0(0, true);
            } else if (i5 == 2 || i5 == 3) {
                eVar.l0(1, true);
            }
        }
    }

    public void K0(boolean z4) {
        this.f2z0 = z4;
    }

    public void L0(int i4) {
        this.f1y0 = i4;
    }

    public void M0(int i4) {
        this.f0A0 = i4;
    }

    public void f(d dVar) {
        d[] dVarArr;
        boolean z4;
        int i4;
        int i5;
        int i6;
        d[] dVarArr2 = this.f53J;
        dVarArr2[0] = this.f45B;
        dVarArr2[2] = this.f46C;
        dVarArr2[1] = this.f47D;
        dVarArr2[3] = this.f48E;
        int i7 = 0;
        while (true) {
            dVarArr = this.f53J;
            if (i7 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i7];
            dVar2.f31g = dVar.q(dVar2);
            i7++;
        }
        int i8 = this.f1y0;
        if (i8 >= 0 && i8 < 4) {
            d dVar3 = dVarArr[i8];
            int i9 = 0;
            while (true) {
                if (i9 >= this.f155x0) {
                    z4 = false;
                    break;
                }
                e eVar = this.f154w0[i9];
                if ((this.f2z0 || eVar.g()) && ((((i5 = this.f1y0) == 0 || i5 == 1) && eVar.w() == e.b.MATCH_CONSTRAINT && eVar.f45B.f28d != null && eVar.f47D.f28d != null) || (((i6 = this.f1y0) == 2 || i6 == 3) && eVar.K() == e.b.MATCH_CONSTRAINT && eVar.f46C.f28d != null && eVar.f48E.f28d != null))) {
                    z4 = true;
                } else {
                    i9++;
                }
            }
            z4 = true;
            boolean z5 = this.f45B.h() || this.f47D.h();
            boolean z6 = this.f46C.h() || this.f48E.h();
            int i10 = !(!z4 && (((i4 = this.f1y0) == 0 && z5) || ((i4 == 2 && z6) || ((i4 == 1 && z5) || (i4 == 3 && z6))))) ? 4 : 5;
            for (int i11 = 0; i11 < this.f155x0; i11++) {
                e eVar2 = this.f154w0[i11];
                if (this.f2z0 || eVar2.g()) {
                    i q4 = dVar.q(eVar2.f53J[this.f1y0]);
                    d[] dVarArr3 = eVar2.f53J;
                    int i12 = this.f1y0;
                    d dVar4 = dVarArr3[i12];
                    dVar4.f31g = q4;
                    d dVar5 = dVar4.f28d;
                    int i13 = (dVar5 == null || dVar5.f26b != this) ? 0 : dVar4.f29e;
                    if (i12 == 0 || i12 == 2) {
                        dVar.i(dVar3.f31g, q4, this.f0A0 - i13, z4);
                    } else {
                        dVar.g(dVar3.f31g, q4, this.f0A0 + i13, z4);
                    }
                    dVar.e(dVar3.f31g, q4, this.f0A0 + i13, i10);
                }
            }
            int i14 = this.f1y0;
            if (i14 == 0) {
                dVar.e(this.f47D.f31g, this.f45B.f31g, 0, 8);
                dVar.e(this.f45B.f31g, this.f57N.f47D.f31g, 0, 4);
                dVar.e(this.f45B.f31g, this.f57N.f45B.f31g, 0, 0);
            } else if (i14 == 1) {
                dVar.e(this.f45B.f31g, this.f47D.f31g, 0, 8);
                dVar.e(this.f45B.f31g, this.f57N.f45B.f31g, 0, 4);
                dVar.e(this.f45B.f31g, this.f57N.f47D.f31g, 0, 0);
            } else if (i14 == 2) {
                dVar.e(this.f48E.f31g, this.f46C.f31g, 0, 8);
                dVar.e(this.f46C.f31g, this.f57N.f48E.f31g, 0, 4);
                dVar.e(this.f46C.f31g, this.f57N.f46C.f31g, 0, 0);
            } else if (i14 == 3) {
                dVar.e(this.f46C.f31g, this.f48E.f31g, 0, 8);
                dVar.e(this.f46C.f31g, this.f57N.f46C.f31g, 0, 4);
                dVar.e(this.f46C.f31g, this.f57N.f48E.f31g, 0, 0);
            }
        }
    }

    public boolean g() {
        return true;
    }

    public String toString() {
        String str = "[Barrier] " + p() + " {";
        for (int i4 = 0; i4 < this.f155x0; i4++) {
            e eVar = this.f154w0[i4];
            if (i4 > 0) {
                str = str + ", ";
            }
            str = str + eVar.p();
        }
        return str + "}";
    }
}
