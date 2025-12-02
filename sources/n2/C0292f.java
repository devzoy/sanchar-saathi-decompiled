package N2;

import android.window.OnBackInvokedCallback;

/* renamed from: N2.f  reason: case insensitive filesystem */
public final /* synthetic */ class C0292f implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0293g f1902a;

    public /* synthetic */ C0292f(C0293g gVar) {
        this.f1902a = gVar;
    }

    public final void onBackInvoked() {
        this.f1902a.onBackPressed();
    }
}
