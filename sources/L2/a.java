package L2;

import Y2.i;
import Y2.j;
import java.util.List;
import java.util.Map;
import v3.l;

public final class a implements j.c {

    /* renamed from: c  reason: collision with root package name */
    public final d f1771c;

    /* renamed from: d  reason: collision with root package name */
    public final dev.fluttercommunity.plus.share.a f1772d;

    public a(d dVar, dev.fluttercommunity.plus.share.a aVar) {
        l.e(dVar, "share");
        l.e(aVar, "manager");
        this.f1771c = dVar;
        this.f1772d = aVar;
    }

    public final void a(i iVar) {
        if (!(iVar.f3767b instanceof Map)) {
            throw new IllegalArgumentException("Map arguments expected");
        }
    }

    public final void b(boolean z4, j.d dVar) {
        if (!z4) {
            dVar.a("dev.fluttercommunity.plus/share/unavailable");
        }
    }

    public void onMethodCall(i iVar, j.d dVar) {
        l.e(iVar, "call");
        l.e(dVar, "result");
        a(iVar);
        this.f1772d.c(dVar);
        try {
            String str = iVar.f3766a;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1811378728) {
                    if (hashCode != -743768819) {
                        if (hashCode == 109400031) {
                            if (str.equals("share")) {
                                d dVar2 = this.f1771c;
                                Object a4 = iVar.a("text");
                                l.c(a4, "null cannot be cast to non-null type kotlin.String");
                                dVar2.p((String) a4, (String) iVar.a("subject"), true);
                                b(true, dVar);
                                return;
                            }
                        }
                    } else if (str.equals("shareUri")) {
                        d dVar3 = this.f1771c;
                        Object a5 = iVar.a("uri");
                        l.c(a5, "null cannot be cast to non-null type kotlin.String");
                        dVar3.p((String) a5, (String) null, true);
                        b(true, dVar);
                        return;
                    }
                } else if (str.equals("shareFiles")) {
                    d dVar4 = this.f1771c;
                    Object a6 = iVar.a("paths");
                    l.b(a6);
                    dVar4.q((List) a6, (List) iVar.a("mimeTypes"), (String) iVar.a("text"), (String) iVar.a("subject"), true);
                    b(true, dVar);
                    return;
                }
            }
            dVar.c();
        } catch (Throwable th) {
            this.f1772d.a();
            dVar.b("Share failed", th.getMessage(), th);
        }
    }
}
