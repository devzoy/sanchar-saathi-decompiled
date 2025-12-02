package W0;

import Q0.j;
import V0.b;
import X0.h;
import Z0.u;
import android.os.Build;
import v3.l;

public final class g extends c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(hVar);
        l.e(hVar, "tracker");
    }

    public boolean b(u uVar) {
        l.e(uVar, "workSpec");
        j d4 = uVar.f3843j.d();
        return d4 == j.UNMETERED || (Build.VERSION.SDK_INT >= 30 && d4 == j.TEMPORARILY_UNMETERED);
    }

    /* renamed from: i */
    public boolean c(b bVar) {
        l.e(bVar, "value");
        return !bVar.a() || bVar.b();
    }
}
