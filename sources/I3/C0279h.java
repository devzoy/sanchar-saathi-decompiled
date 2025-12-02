package I3;

import D3.G;
import D3.H;
import h3.C0660a;
import l3.i;

/* renamed from: I3.h  reason: case insensitive filesystem */
public abstract class C0279h {
    public static final void a(i iVar, Throwable th) {
        for (G s4 : C0278g.a()) {
            try {
                s4.s(iVar, th);
            } catch (Throwable th2) {
                C0278g.b(H.b(th, th2));
            }
        }
        try {
            C0660a.a(th, new C0280i(iVar));
        } catch (Throwable unused) {
        }
        C0278g.b(th);
    }
}
