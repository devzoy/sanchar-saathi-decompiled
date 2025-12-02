package W0;

import Q0.i;
import Q0.j;
import V0.b;
import X0.h;
import Z0.u;
import v3.g;
import v3.l;

public final class f extends c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f3394f = new a((g) null);

    /* renamed from: g  reason: collision with root package name */
    public static final String f3395g;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    static {
        String i4 = i.i("NetworkNotRoamingCtrlr");
        l.d(i4, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f3395g = i4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(h hVar) {
        super(hVar);
        l.e(hVar, "tracker");
    }

    public boolean b(u uVar) {
        l.e(uVar, "workSpec");
        return uVar.f3843j.d() == j.NOT_ROAMING;
    }

    /* renamed from: i */
    public boolean c(b bVar) {
        l.e(bVar, "value");
        return !bVar.a() || !bVar.c();
    }
}
