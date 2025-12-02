package p2;

import R1.g;
import android.os.Bundle;
import q2.m;
import q2.s;

public abstract class t extends m {

    /* renamed from: c  reason: collision with root package name */
    public final s f11726c;

    /* renamed from: d  reason: collision with root package name */
    public final g f11727d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ w f11728e;

    public t(w wVar, s sVar, g gVar) {
        this.f11728e = wVar;
        this.f11726c = sVar;
        this.f11727d = gVar;
    }

    public void b(Bundle bundle) {
        this.f11728e.f11733a.u(this.f11727d);
        this.f11726c.d("onCompleteUpdate", new Object[0]);
    }

    public void f(Bundle bundle) {
        this.f11728e.f11733a.u(this.f11727d);
        this.f11726c.d("onRequestInfo", new Object[0]);
    }
}
