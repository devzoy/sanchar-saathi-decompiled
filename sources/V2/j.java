package v2;

import R1.g;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Map;
import w2.f;

public final class j extends w2.j {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f12433f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m f12434g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(m mVar, g gVar, g gVar2) {
        super(gVar);
        this.f12433f = gVar2;
        this.f12434g = mVar;
    }

    public final void a() {
        try {
            f fVar = (f) this.f12434g.f12439a.e();
            String c4 = this.f12434g.f12440b;
            Bundle bundle = new Bundle();
            Map a4 = n.a();
            bundle.putInt("playcore_version_code", ((Integer) a4.get("java")).intValue());
            if (a4.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) a4.get("native")).intValue());
            }
            if (a4.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) a4.get("unity")).intValue());
            }
            m mVar = this.f12434g;
            fVar.y(c4, bundle, new l(mVar, this.f12433f, mVar.f12440b));
        } catch (RemoteException e4) {
            m.f12438c.b(e4, "error requesting in-app review for %s", this.f12434g.f12440b);
            this.f12433f.c(new RuntimeException(e4));
        }
    }
}
