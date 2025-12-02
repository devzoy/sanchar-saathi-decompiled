package p2;

import R1.g;
import android.os.RemoteException;
import q2.t;

public final class r extends t {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f11720f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ g f11721g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ w f11722h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(w wVar, g gVar, String str, g gVar2) {
        super(gVar);
        this.f11722h = wVar;
        this.f11720f = str;
        this.f11721g = gVar2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface, q2.l] */
    public final void a() {
        try {
            ? e4 = this.f11722h.f11733a.e();
            w wVar = this.f11722h;
            e4.j(wVar.f11734b, w.b(wVar, this.f11720f), new v(this.f11722h, this.f11721g, this.f11720f));
        } catch (RemoteException e5) {
            w.f11731e.c(e5, "requestUpdateInfo(%s)", this.f11720f);
            this.f11721g.c(new RuntimeException(e5));
        }
    }
}
