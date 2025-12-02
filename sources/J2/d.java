package J2;

import R1.f;
import T2.a;
import Y2.i;
import Y2.j;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import v2.b;
import v2.c;
import v3.l;

public final class d implements a, j.c, U2.a {

    /* renamed from: c  reason: collision with root package name */
    public j f1626c;

    /* renamed from: d  reason: collision with root package name */
    public Context f1627d;

    /* renamed from: e  reason: collision with root package name */
    public Activity f1628e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1629f = "InAppReviewPlugin";

    public static final void e(j.d dVar, f fVar) {
        l.e(fVar, "task");
        if (fVar.i()) {
            dVar.a(Boolean.TRUE);
        } else {
            dVar.a(Boolean.FALSE);
        }
    }

    public static /* synthetic */ boolean g(d dVar, j.d dVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            dVar2 = null;
        }
        return dVar.f(dVar2);
    }

    public static final void j(d dVar, c cVar, j.d dVar2, f fVar) {
        l.e(fVar, "task");
        if (fVar.i()) {
            Log.i(dVar.f1629f, "onComplete: Successfully requested review flow");
            Activity activity = dVar.f1628e;
            l.b(activity);
            f b4 = cVar.b(activity, (b) fVar.f());
            l.d(b4, "launchReviewFlow(...)");
            b4.a(new c(dVar2));
            return;
        }
        Log.w(dVar.f1629f, "onComplete: Unsuccessfully requested review flow");
        dVar2.b("error", "In-App Review API unavailable", (Object) null);
    }

    public static final void k(j.d dVar, f fVar) {
        l.e(fVar, "it");
        dVar.a((Object) null);
    }

    public final void d(j.d dVar) {
        Log.i(this.f1629f, "isAvailable: called");
        if (g(this, (j.d) null, 1, (Object) null)) {
            dVar.a(Boolean.FALSE);
            return;
        }
        try {
            Context context = this.f1627d;
            l.b(context);
            c a4 = v2.d.a(context);
            l.d(a4, "create(...)");
            f a5 = a4.a();
            l.d(a5, "requestReviewFlow(...)");
            l.b(a5.a(new b(dVar)));
        } catch (Exception e4) {
            Log.e(this.f1629f, "isAvailable: error", e4);
            dVar.a(Boolean.FALSE);
        }
    }

    public final boolean f(j.d dVar) {
        Log.i(this.f1629f, "noContextOrActivity: called");
        if (this.f1627d == null) {
            String str = this.f1629f;
            Log.e(str, "noContextOrActivity: " + "Android context not available");
            if (dVar != null) {
                dVar.b("error", "Android context not available", (Object) null);
            }
            return true;
        } else if (this.f1628e != null) {
            return false;
        } else {
            String str2 = this.f1629f;
            Log.e(str2, "noContextOrActivity: " + "Android activity not available");
            if (dVar != null) {
                dVar.b("error", "Android activity not available", (Object) null);
            }
            return true;
        }
    }

    public final void h(j.d dVar) {
        Log.i(this.f1629f, "openStoreListing: called");
        if (!f(dVar)) {
            try {
                Context context = this.f1627d;
                l.b(context);
                String packageName = context.getPackageName();
                Intent intent = new Intent("android.intent.action.VIEW");
                Intent data = intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
                l.d(data, "setData(...)");
                Activity activity = this.f1628e;
                l.b(activity);
                activity.startActivity(data);
                dVar.a((Object) null);
            } catch (Exception e4) {
                Log.e(this.f1629f, "openStoreListing: error", e4);
                dVar.b("error", "An error occurred while opening the play store", (Object) null);
            }
        }
    }

    public final void i(j.d dVar) {
        Log.i(this.f1629f, "requestReview: called");
        if (!f(dVar)) {
            try {
                Context context = this.f1627d;
                l.b(context);
                c a4 = v2.d.a(context);
                l.d(a4, "create(...)");
                f a5 = a4.a();
                l.d(a5, "requestReviewFlow(...)");
                l.b(a5.a(new a(this, a4, dVar)));
            } catch (Exception e4) {
                Log.e(this.f1629f, "requestReview: error", e4);
                dVar.b("error", "An error occurred during the request review flow", (Object) null);
            }
        }
    }

    public void onAttachedToActivity(U2.c cVar) {
        l.e(cVar, "binding");
        this.f1628e = cVar.e();
    }

    public void onAttachedToEngine(a.b bVar) {
        l.e(bVar, "flutterPluginBinding");
        j jVar = new j(bVar.b(), "dev.britannio.in_app_review");
        this.f1626c = jVar;
        jVar.e(this);
        this.f1627d = bVar.a();
    }

    public void onDetachedFromActivity() {
        this.f1628e = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f1628e = null;
    }

    public void onDetachedFromEngine(a.b bVar) {
        l.e(bVar, "binding");
        j jVar = this.f1626c;
        if (jVar == null) {
            l.n("channel");
            jVar = null;
        }
        jVar.e((j.c) null);
        this.f1627d = null;
    }

    public void onMethodCall(i iVar, j.d dVar) {
        l.e(iVar, "call");
        l.e(dVar, "result");
        String str = this.f1629f;
        String str2 = iVar.f3766a;
        Log.i(str, "onMethodCall: " + str2);
        String str3 = iVar.f3766a;
        if (str3 != null) {
            int hashCode = str3.hashCode();
            if (hashCode != 159262157) {
                if (hashCode != 444517567) {
                    if (hashCode == 1361080007 && str3.equals("requestReview")) {
                        i(dVar);
                        return;
                    }
                } else if (str3.equals("isAvailable")) {
                    d(dVar);
                    return;
                }
            } else if (str3.equals("openStoreListing")) {
                h(dVar);
                return;
            }
        }
        dVar.c();
    }

    public void onReattachedToActivityForConfigChanges(U2.c cVar) {
        l.e(cVar, "binding");
        this.f1628e = cVar.e();
    }
}
