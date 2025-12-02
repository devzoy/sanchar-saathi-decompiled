package I2;

import T2.a;
import Y2.b;
import Y2.i;
import Y2.j;
import android.content.Context;
import android.provider.Settings;
import v3.l;

public final class a implements j.c, T2.a {

    /* renamed from: c  reason: collision with root package name */
    public j f1522c;

    /* renamed from: d  reason: collision with root package name */
    public Context f1523d;

    private final void b(Context context, b bVar) {
        this.f1523d = context;
        j jVar = new j(bVar, "flutter_udid");
        this.f1522c = jVar;
        jVar.e(this);
    }

    public final String a() {
        Context context = this.f1523d;
        return Settings.Secure.getString(context != null ? context.getContentResolver() : null, "android_id");
    }

    public void onAttachedToEngine(a.b bVar) {
        l.e(bVar, "flutterPluginBinding");
        Context a4 = bVar.a();
        l.d(a4, "getApplicationContext(...)");
        b b4 = bVar.b();
        l.d(b4, "getBinaryMessenger(...)");
        b(a4, b4);
    }

    public void onDetachedFromEngine(a.b bVar) {
        l.e(bVar, "binding");
        this.f1523d = null;
        j jVar = this.f1522c;
        if (jVar == null) {
            l.n("channel");
            jVar = null;
        }
        jVar.e((j.c) null);
    }

    public void onMethodCall(i iVar, j.d dVar) {
        l.e(iVar, "call");
        l.e(dVar, "result");
        if (l.a(iVar.f3766a, "getUDID")) {
            String a4 = a();
            if (a4 == null || a4.length() == 0) {
                dVar.b("UNAVAILABLE", "UDID not available.", (Object) null);
            } else {
                dVar.a(a4);
            }
        } else {
            dVar.c();
        }
    }
}
