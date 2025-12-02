package K3;

import D3.M;

public final class k extends h {

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f1753g;

    public k(Runnable runnable, long j4, i iVar) {
        super(j4, iVar);
        this.f1753g = runnable;
    }

    public void run() {
        try {
            this.f1753g.run();
        } finally {
            this.f1751f.a();
        }
    }

    public String toString() {
        return "Task[" + M.a(this.f1753g) + '@' + M.b(this.f1753g) + ", " + this.f1750e + ", " + this.f1751f + ']';
    }
}
