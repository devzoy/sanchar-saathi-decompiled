package p2;

import R1.f;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import r2.C0917a;
import s2.b;

public final class l implements C0871b {

    /* renamed from: a  reason: collision with root package name */
    public final w f11709a;

    /* renamed from: b  reason: collision with root package name */
    public final i f11710b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f11711c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f11712d = new Handler(Looper.getMainLooper());

    public l(w wVar, i iVar, Context context) {
        this.f11709a = wVar;
        this.f11710b = iVar;
        this.f11711c = context;
    }

    public final synchronized void a(b bVar) {
        this.f11710b.c(bVar);
    }

    public final boolean b(C0870a aVar, Activity activity, C0873d dVar, int i4) {
        if (activity == null) {
            return false;
        }
        return g(aVar, new k(this, activity), dVar, i4);
    }

    public final synchronized void c(b bVar) {
        this.f11710b.b(bVar);
    }

    public final f d() {
        return this.f11709a.d(this.f11711c.getPackageName());
    }

    public final f e() {
        return this.f11709a.e(this.f11711c.getPackageName());
    }

    public final boolean f(C0870a aVar, int i4, Activity activity, int i5) {
        C0873d c4 = C0873d.c(i4);
        if (activity == null) {
            return false;
        }
        return g(aVar, new k(this, activity), c4, i5);
    }

    public final boolean g(C0870a aVar, C0917a aVar2, C0873d dVar, int i4) {
        if (aVar == null || aVar2 == null || dVar == null || !aVar.f(dVar) || aVar.m()) {
            return false;
        }
        aVar.l();
        aVar2.a(aVar.j(dVar).getIntentSender(), i4, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }
}
