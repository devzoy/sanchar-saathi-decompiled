package w1;

import P1.e;
import Q1.d;
import Q1.l;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.Set;
import u1.C0941a;
import v1.C0947a;
import v1.C0952f;
import z1.C1022e;
import z1.C1032o;
import z1.G;

public final class M extends d implements C0952f.a, C0952f.b {

    /* renamed from: j  reason: collision with root package name */
    public static final C0947a.C0204a f12543j = P1.d.f2217c;

    /* renamed from: c  reason: collision with root package name */
    public final Context f12544c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f12545d;

    /* renamed from: e  reason: collision with root package name */
    public final C0947a.C0204a f12546e;

    /* renamed from: f  reason: collision with root package name */
    public final Set f12547f;

    /* renamed from: g  reason: collision with root package name */
    public final C1022e f12548g;

    /* renamed from: h  reason: collision with root package name */
    public e f12549h;

    /* renamed from: i  reason: collision with root package name */
    public L f12550i;

    public M(Context context, Handler handler, C1022e eVar) {
        C0947a.C0204a aVar = f12543j;
        this.f12544c = context;
        this.f12545d = handler;
        this.f12548g = (C1022e) C1032o.g(eVar, "ClientSettings must not be null");
        this.f12547f = eVar.e();
        this.f12546e = aVar;
    }

    public final void I(L l4) {
        e eVar = this.f12549h;
        if (eVar != null) {
            eVar.n();
        }
        C1022e eVar2 = this.f12548g;
        eVar2.i(Integer.valueOf(System.identityHashCode(this)));
        C0947a.C0204a aVar = this.f12546e;
        Context context = this.f12544c;
        Handler handler = this.f12545d;
        this.f12549h = (e) aVar.a(context, handler.getLooper(), eVar2, eVar2.g(), this, this);
        this.f12550i = l4;
        Set set = this.f12547f;
        if (set == null || set.isEmpty()) {
            handler.post(new J(this));
        } else {
            this.f12549h.g();
        }
    }

    public final void J() {
        e eVar = this.f12549h;
        if (eVar != null) {
            eVar.n();
        }
    }

    public final /* synthetic */ void K(l lVar) {
        C0941a d4 = lVar.d();
        if (d4.i()) {
            G g4 = (G) C1032o.f(lVar.e());
            C0941a e4 = g4.e();
            if (!e4.i()) {
                String valueOf = String.valueOf(e4);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                this.f12550i.b(e4);
                this.f12549h.n();
                return;
            }
            this.f12550i.d(g4.d(), this.f12547f);
        } else {
            this.f12550i.b(d4);
        }
        this.f12549h.n();
    }

    public final /* synthetic */ L L() {
        return this.f12550i;
    }

    public final void onConnected(Bundle bundle) {
        this.f12549h.d(this);
    }

    public final void onConnectionFailed(C0941a aVar) {
        this.f12550i.b(aVar);
    }

    public final void onConnectionSuspended(int i4) {
        this.f12550i.c(i4);
    }

    public final void w(l lVar) {
        this.f12545d.post(new K(this, lVar));
    }
}
