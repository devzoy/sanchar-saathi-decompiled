package i1;

import T2.a;
import U2.c;
import Y2.b;
import Y2.j;
import android.app.Activity;
import android.content.Context;

public final class m implements a, U2.a {

    /* renamed from: c  reason: collision with root package name */
    public p f10252c;

    /* renamed from: d  reason: collision with root package name */
    public j f10253d;

    /* renamed from: e  reason: collision with root package name */
    public c f10254e;

    /* renamed from: f  reason: collision with root package name */
    public l f10255f;

    public final void a() {
        c cVar = this.f10254e;
        if (cVar != null) {
            cVar.f(this.f10252c);
            this.f10254e.g(this.f10252c);
        }
    }

    public final void b() {
        c cVar = this.f10254e;
        if (cVar != null) {
            cVar.a(this.f10252c);
            this.f10254e.d(this.f10252c);
        }
    }

    public final void c(Context context, b bVar) {
        this.f10253d = new j(bVar, "flutter.baseflow.com/permissions/methods");
        l lVar = new l(context, new C0705a(), this.f10252c, new w());
        this.f10255f = lVar;
        this.f10253d.e(lVar);
    }

    public final void d(Activity activity) {
        p pVar = this.f10252c;
        if (pVar != null) {
            pVar.h(activity);
        }
    }

    public final void e() {
        this.f10253d.e((j.c) null);
        this.f10253d = null;
        this.f10255f = null;
    }

    public final void f() {
        p pVar = this.f10252c;
        if (pVar != null) {
            pVar.h((Activity) null);
        }
    }

    public void onAttachedToActivity(c cVar) {
        d(cVar.e());
        this.f10254e = cVar;
        b();
    }

    public void onAttachedToEngine(a.b bVar) {
        this.f10252c = new p(bVar.a());
        c(bVar.a(), bVar.b());
    }

    public void onDetachedFromActivity() {
        f();
        a();
        this.f10254e = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        e();
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        onAttachedToActivity(cVar);
    }
}
