package w2;

import R1.g;

public abstract class j implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final g f12658e;

    public j() {
        this.f12658e = null;
    }

    public abstract void a();

    public final g b() {
        return this.f12658e;
    }

    public final void c(Exception exc) {
        g gVar = this.f12658e;
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

    public j(g gVar) {
        this.f12658e = gVar;
    }
}
