package p2;

import R1.g;
import android.os.RemoteException;
import q2.t;

public final class s extends t {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f11723f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f11724g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ w f11725h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(w wVar, g gVar, g gVar2, String str) {
        super(gVar);
        this.f11725h = wVar;
        this.f11723f = gVar2;
        this.f11724g = str;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface, q2.l] */
    public final void a() {
        try {
            this.f11725h.f11733a.e().q(this.f11725h.f11734b, w.i(), new u(this.f11725h, this.f11723f));
        } catch (RemoteException e4) {
            w.f11731e.c(e4, "completeUpdate(%s)", this.f11724g);
            this.f11723f.c(new RuntimeException(e4));
        }
    }
}
