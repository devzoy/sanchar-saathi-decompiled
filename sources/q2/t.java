package q2;

import R1.g;

public abstract class t implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final g f11913e;

    public t() {
        this.f11913e = null;
    }

    public abstract void a();

    public final g b() {
        return this.f11913e;
    }

    public final void c(Exception exc) {
        g gVar = this.f11913e;
        if (gVar != null) {
            gVar.c(exc);
        }
    }

    public final void run() {
        try {
            a();
        } catch (Exception e4) {
            c(e4);
        }
    }

    public t(g gVar) {
        this.f11913e = gVar;
    }
}
