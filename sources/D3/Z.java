package D3;

import i3.C0731h;

public abstract class Z extends F {

    /* renamed from: g  reason: collision with root package name */
    public long f808g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f809h;

    /* renamed from: i  reason: collision with root package name */
    public C0731h f810i;

    public static /* synthetic */ void O(Z z4, boolean z5, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                z5 = false;
            }
            z4.N(z5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    public static /* synthetic */ void T(Z z4, boolean z5, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                z5 = false;
            }
            z4.S(z5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final void N(boolean z4) {
        long P4 = this.f808g - P(z4);
        this.f808g = P4;
        if (P4 <= 0 && this.f809h) {
            Z();
        }
    }

    public final long P(boolean z4) {
        return z4 ? 4294967296L : 1;
    }

    public final void Q(T t4) {
        C0731h hVar = this.f810i;
        if (hVar == null) {
            hVar = new C0731h();
            this.f810i = hVar;
        }
        hVar.addLast(t4);
    }

    public long R() {
        C0731h hVar = this.f810i;
        return (hVar != null && !hVar.isEmpty()) ? 0 : Long.MAX_VALUE;
    }

    public final void S(boolean z4) {
        this.f808g += P(z4);
        if (!z4) {
            this.f809h = true;
        }
    }

    public final boolean U() {
        return this.f808g >= P(true);
    }

    public final boolean V() {
        C0731h hVar = this.f810i;
        if (hVar != null) {
            return hVar.isEmpty();
        }
        return true;
    }

    public abstract long W();

    public final boolean X() {
        T t4;
        C0731h hVar = this.f810i;
        if (hVar == null || (t4 = (T) hVar.D()) == null) {
            return false;
        }
        t4.run();
        return true;
    }

    public boolean Y() {
        return false;
    }

    public abstract void Z();
}
