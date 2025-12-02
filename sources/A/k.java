package A;

import java.util.ArrayList;
import z.c;

public abstract class k extends e {

    /* renamed from: w0  reason: collision with root package name */
    public ArrayList f157w0 = new ArrayList();

    public abstract void G0();

    public void H0(e eVar) {
        this.f157w0.remove(eVar);
        eVar.s0((e) null);
    }

    public void I0() {
        this.f157w0.clear();
    }

    public void W() {
        this.f157w0.clear();
        super.W();
    }

    public void X(c cVar) {
        super.X(cVar);
        int size = this.f157w0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((e) this.f157w0.get(i4)).X(cVar);
        }
    }

    public void a(e eVar) {
        this.f157w0.add(eVar);
        if (eVar.E() != null) {
            ((k) eVar.E()).H0(eVar);
        }
        eVar.s0(this);
    }
}
