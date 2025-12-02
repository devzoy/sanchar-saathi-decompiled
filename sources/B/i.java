package B;

import A.a;
import A.e;
import B.f;

public class i extends m {
    public i(e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f231h.f199k.add(fVar);
        fVar.f200l.add(this.f231h);
    }

    public void a(d dVar) {
        a aVar = (a) this.f225b;
        int H02 = aVar.H0();
        int i4 = 0;
        int i5 = -1;
        for (f fVar : this.f231h.f200l) {
            int i6 = fVar.f195g;
            if (i5 == -1 || i6 < i5) {
                i5 = i6;
            }
            if (i4 < i6) {
                i4 = i6;
            }
        }
        if (H02 == 0 || H02 == 2) {
            this.f231h.d(i5 + aVar.I0());
        } else {
            this.f231h.d(i4 + aVar.I0());
        }
    }

    public void d() {
        e eVar = this.f225b;
        if (eVar instanceof a) {
            this.f231h.f190b = true;
            a aVar = (a) eVar;
            int H02 = aVar.H0();
            boolean G02 = aVar.G0();
            int i4 = 0;
            if (H02 == 0) {
                this.f231h.f193e = f.a.LEFT;
                while (i4 < aVar.f155x0) {
                    e eVar2 = aVar.f154w0[i4];
                    if (G02 || eVar2.M() != 8) {
                        f fVar = eVar2.f78e.f231h;
                        fVar.f199k.add(this.f231h);
                        this.f231h.f200l.add(fVar);
                    }
                    i4++;
                }
                q(this.f225b.f78e.f231h);
                q(this.f225b.f78e.f232i);
            } else if (H02 == 1) {
                this.f231h.f193e = f.a.RIGHT;
                while (i4 < aVar.f155x0) {
                    e eVar3 = aVar.f154w0[i4];
                    if (G02 || eVar3.M() != 8) {
                        f fVar2 = eVar3.f78e.f232i;
                        fVar2.f199k.add(this.f231h);
                        this.f231h.f200l.add(fVar2);
                    }
                    i4++;
                }
                q(this.f225b.f78e.f231h);
                q(this.f225b.f78e.f232i);
            } else if (H02 == 2) {
                this.f231h.f193e = f.a.TOP;
                while (i4 < aVar.f155x0) {
                    e eVar4 = aVar.f154w0[i4];
                    if (G02 || eVar4.M() != 8) {
                        f fVar3 = eVar4.f80f.f231h;
                        fVar3.f199k.add(this.f231h);
                        this.f231h.f200l.add(fVar3);
                    }
                    i4++;
                }
                q(this.f225b.f80f.f231h);
                q(this.f225b.f80f.f232i);
            } else if (H02 == 3) {
                this.f231h.f193e = f.a.BOTTOM;
                while (i4 < aVar.f155x0) {
                    e eVar5 = aVar.f154w0[i4];
                    if (G02 || eVar5.M() != 8) {
                        f fVar4 = eVar5.f80f.f232i;
                        fVar4.f199k.add(this.f231h);
                        this.f231h.f200l.add(fVar4);
                    }
                    i4++;
                }
                q(this.f225b.f80f.f231h);
                q(this.f225b.f80f.f232i);
            }
        }
    }

    public void e() {
        e eVar = this.f225b;
        if (eVar instanceof a) {
            int H02 = ((a) eVar).H0();
            if (H02 == 0 || H02 == 1) {
                this.f225b.B0(this.f231h.f195g);
            } else {
                this.f225b.C0(this.f231h.f195g);
            }
        }
    }

    public void f() {
        this.f226c = null;
        this.f231h.c();
    }

    public boolean m() {
        return false;
    }
}
