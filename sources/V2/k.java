package v2;

import android.os.Bundle;
import w2.g;
import w2.i;
import w2.t;

public abstract class k extends g {

    /* renamed from: c  reason: collision with root package name */
    public final i f12435c;

    /* renamed from: d  reason: collision with root package name */
    public final R1.g f12436d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m f12437e;

    public k(m mVar, i iVar, R1.g gVar) {
        this.f12437e = mVar;
        this.f12435c = iVar;
        this.f12436d = gVar;
    }

    public void b(Bundle bundle) {
        t tVar = this.f12437e.f12439a;
        if (tVar != null) {
            tVar.u(this.f12436d);
        }
        this.f12435c.c("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
