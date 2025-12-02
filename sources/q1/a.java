package Q1;

import P1.e;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import r1.C0916a;
import u1.C0941a;
import u1.g;
import v1.C0952f;
import z1.C1021d;
import z1.C1022e;
import z1.C1025h;
import z1.C1032o;
import z1.E;
import z1.G;

public class a extends C1025h implements e {

    /* renamed from: O  reason: collision with root package name */
    public static final /* synthetic */ int f2419O = 0;

    /* renamed from: K  reason: collision with root package name */
    public final boolean f2420K = true;

    /* renamed from: L  reason: collision with root package name */
    public final C1022e f2421L;

    /* renamed from: M  reason: collision with root package name */
    public final Bundle f2422M;

    /* renamed from: N  reason: collision with root package name */
    public final Integer f2423N;

    public a(Context context, Looper looper, boolean z4, C1022e eVar, Bundle bundle, C0952f.a aVar, C0952f.b bVar) {
        super(context, looper, 44, eVar, aVar, bVar);
        this.f2421L = eVar;
        this.f2422M = bundle;
        this.f2423N = eVar.h();
    }

    public static Bundle l0(C1022e eVar) {
        eVar.g();
        Integer h4 = eVar.h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.a());
        if (h4 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", h4.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    public final String D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String E() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void d(f fVar) {
        C1032o.g(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b4 = this.f2421L.b();
            ((g) C()).K(new j(1, new E(b4, ((Integer) C1032o.f(this.f2423N)).intValue(), "<<default account>>".equals(b4.name) ? C0916a.a(x()).b() : null)), fVar);
        } catch (RemoteException e4) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.w(new l(1, new C0941a(8, (PendingIntent) null), (G) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e4);
            }
        }
    }

    public final void g() {
        a(new C1021d.C0215d(this));
    }

    public final int i() {
        return g.f12322a;
    }

    public final boolean o() {
        return this.f2420K;
    }

    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    public final Bundle z() {
        C1022e eVar = this.f2421L;
        if (!x().getPackageName().equals(eVar.d())) {
            this.f2422M.putString("com.google.android.gms.signin.internal.realClientPackageName", eVar.d());
        }
        return this.f2422M;
    }
}
