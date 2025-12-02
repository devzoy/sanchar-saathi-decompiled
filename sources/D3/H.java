package D3;

import I3.C0279h;
import h3.C0660a;
import l3.i;

public abstract class H {
    public static final void a(i iVar, Throwable th) {
        try {
            G g4 = (G) iVar.d(G.f782a);
            if (g4 != null) {
                g4.s(iVar, th);
            } else {
                C0279h.a(iVar, th);
            }
        } catch (Throwable th2) {
            C0279h.a(iVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C0660a.a(runtimeException, th);
        return runtimeException;
    }
}
