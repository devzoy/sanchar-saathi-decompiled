package p2;

import android.content.Context;
import q2.F;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static C0874e f11706a;

    public static synchronized C0874e a(Context context) {
        C0874e eVar;
        synchronized (h.class) {
            try {
                if (f11706a == null) {
                    C0876g gVar = new C0876g((C0875f) null);
                    gVar.b(new n(F.a(context)));
                    f11706a = gVar.a();
                }
                eVar = f11706a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return eVar;
    }
}
