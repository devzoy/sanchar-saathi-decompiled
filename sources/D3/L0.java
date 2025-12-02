package D3;

import I3.B;
import I3.J;
import h3.C0666g;
import h3.C0670k;
import h3.C0673n;
import l3.e;
import l3.i;

public final class L0 extends B {

    /* renamed from: i  reason: collision with root package name */
    public final ThreadLocal f793i;
    private volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public L0(l3.i r3, l3.e r4) {
        /*
            r2 = this;
            D3.M0 r0 = D3.M0.f794e
            l3.i$b r1 = r3.d(r0)
            if (r1 != 0) goto L_0x000d
            l3.i r0 = r3.h(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f793i = r0
            l3.i r4 = r4.a()
            l3.f$b r0 = l3.f.f11129d
            l3.i$b r4 = r4.d(r0)
            boolean r4 = r4 instanceof D3.F
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = I3.J.c(r3, r4)
            I3.J.a(r3, r4)
            r2.U0(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.L0.<init>(l3.i, l3.e):void");
    }

    public void P0(Object obj) {
        if (this.threadLocalIsSet) {
            C0666g gVar = (C0666g) this.f793i.get();
            if (gVar != null) {
                J.a((i) gVar.a(), gVar.b());
            }
            this.f793i.remove();
        }
        Object a4 = D.a(obj, this.f1524h);
        e eVar = this.f1524h;
        i a5 = eVar.a();
        L0 l02 = null;
        Object c4 = J.c(a5, l02);
        if (c4 != J.f1532a) {
            l02 = E.g(eVar, a5, c4);
        }
        try {
            this.f1524h.q(a4);
            C0673n nVar = C0673n.f9639a;
        } finally {
            if (l02 == null || l02.T0()) {
                J.a(a5, c4);
            }
        }
    }

    public final boolean T0() {
        boolean z4 = this.threadLocalIsSet && this.f793i.get() == null;
        this.f793i.remove();
        return !z4;
    }

    public final void U0(i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f793i.set(C0670k.a(iVar, obj));
    }
}
