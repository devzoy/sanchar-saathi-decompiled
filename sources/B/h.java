package B;

import A.e;
import A.g;

public class h extends m {
    public h(e eVar) {
        super(eVar);
        eVar.f78e.f();
        eVar.f80f.f();
        this.f229f = ((g) eVar).G0();
    }

    public void a(d dVar) {
        f fVar = this.f231h;
        if (fVar.f191c && !fVar.f198j) {
            this.f231h.d((int) ((((float) ((f) fVar.f200l.get(0)).f195g) * ((g) this.f225b).J0()) + 0.5f));
        }
    }

    public void d() {
        g gVar = (g) this.f225b;
        int H02 = gVar.H0();
        int I02 = gVar.I0();
        gVar.J0();
        if (gVar.G0() == 1) {
            if (H02 != -1) {
                this.f231h.f200l.add(this.f225b.f57N.f78e.f231h);
                this.f225b.f57N.f78e.f231h.f199k.add(this.f231h);
                this.f231h.f194f = H02;
            } else if (I02 != -1) {
                this.f231h.f200l.add(this.f225b.f57N.f78e.f232i);
                this.f225b.f57N.f78e.f232i.f199k.add(this.f231h);
                this.f231h.f194f = -I02;
            } else {
                f fVar = this.f231h;
                fVar.f190b = true;
                fVar.f200l.add(this.f225b.f57N.f78e.f232i);
                this.f225b.f57N.f78e.f232i.f199k.add(this.f231h);
            }
            q(this.f225b.f78e.f231h);
            q(this.f225b.f78e.f232i);
            return;
        }
        if (H02 != -1) {
            this.f231h.f200l.add(this.f225b.f57N.f80f.f231h);
            this.f225b.f57N.f80f.f231h.f199k.add(this.f231h);
            this.f231h.f194f = H02;
        } else if (I02 != -1) {
            this.f231h.f200l.add(this.f225b.f57N.f80f.f232i);
            this.f225b.f57N.f80f.f232i.f199k.add(this.f231h);
            this.f231h.f194f = -I02;
        } else {
            f fVar2 = this.f231h;
            fVar2.f190b = true;
            fVar2.f200l.add(this.f225b.f57N.f80f.f232i);
            this.f225b.f57N.f80f.f232i.f199k.add(this.f231h);
        }
        q(this.f225b.f80f.f231h);
        q(this.f225b.f80f.f232i);
    }

    public void e() {
        if (((g) this.f225b).G0() == 1) {
            this.f225b.B0(this.f231h.f195g);
        } else {
            this.f225b.C0(this.f231h.f195g);
        }
    }

    public void f() {
        this.f231h.c();
    }

    public boolean m() {
        return false;
    }

    public final void q(f fVar) {
        this.f231h.f199k.add(fVar);
        fVar.f200l.add(this.f231h);
    }
}
