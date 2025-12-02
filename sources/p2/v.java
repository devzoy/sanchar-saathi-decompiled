package p2;

import R1.g;
import android.os.Bundle;
import q2.s;
import s2.C0923a;

public final class v extends t {

    /* renamed from: f  reason: collision with root package name */
    public final String f11729f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ w f11730g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(w wVar, g gVar, String str) {
        super(wVar, new s("OnRequestInstallCallback"), gVar);
        this.f11730g = wVar;
        this.f11729f = str;
    }

    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f11727d.c(new C0923a(bundle.getInt("error.code", -2)));
        } else {
            this.f11727d.d(w.f(this.f11730g, bundle, this.f11729f));
        }
    }
}
