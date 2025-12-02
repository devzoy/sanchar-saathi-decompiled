package A;

import java.util.Arrays;

public abstract class i extends e implements h {

    /* renamed from: w0  reason: collision with root package name */
    public e[] f154w0 = new e[4];

    /* renamed from: x0  reason: collision with root package name */
    public int f155x0 = 0;

    public void a(e eVar) {
        if (eVar != this && eVar != null) {
            int i4 = this.f155x0 + 1;
            e[] eVarArr = this.f154w0;
            if (i4 > eVarArr.length) {
                this.f154w0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            e[] eVarArr2 = this.f154w0;
            int i5 = this.f155x0;
            eVarArr2[i5] = eVar;
            this.f155x0 = i5 + 1;
        }
    }

    public void b() {
        this.f155x0 = 0;
        Arrays.fill(this.f154w0, (Object) null);
    }

    public void c(f fVar) {
    }
}
