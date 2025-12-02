package f3;

import T2.a;
import U2.c;
import android.app.Activity;
import android.util.Log;
import f3.C0622a;

/* renamed from: f3.i  reason: case insensitive filesystem */
public final class C0630i implements a, U2.a {

    /* renamed from: c  reason: collision with root package name */
    public C0629h f9042c;

    public void onAttachedToActivity(c cVar) {
        C0629h hVar = this.f9042c;
        if (hVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            hVar.y(cVar.e());
        }
    }

    public void onAttachedToEngine(a.b bVar) {
        this.f9042c = new C0629h(bVar.a());
        C0622a.d.f(bVar.b(), this.f9042c);
    }

    public void onDetachedFromActivity() {
        C0629h hVar = this.f9042c;
        if (hVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            hVar.y((Activity) null);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        if (this.f9042c == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        C0622a.d.f(bVar.b(), (C0622a.d) null);
        this.f9042c = null;
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        onAttachedToActivity(cVar);
    }
}
