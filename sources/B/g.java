package B;

import B.f;

public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f210m;

    public g(m mVar) {
        super(mVar);
        if (mVar instanceof j) {
            this.f193e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f193e = f.a.VERTICAL_DIMENSION;
        }
    }

    public void d(int i4) {
        if (!this.f198j) {
            this.f198j = true;
            this.f195g = i4;
            for (d dVar : this.f199k) {
                dVar.a(dVar);
            }
        }
    }
}
