package L2;

import T2.a;
import U2.c;
import Y2.j;
import android.app.Activity;
import android.content.Context;
import v3.g;
import v3.l;

public final class e implements T2.a, U2.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f1779f = new a((g) null);

    /* renamed from: c  reason: collision with root package name */
    public d f1780c;

    /* renamed from: d  reason: collision with root package name */
    public dev.fluttercommunity.plus.share.a f1781d;

    /* renamed from: e  reason: collision with root package name */
    public j f1782e;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    public void onAttachedToActivity(c cVar) {
        l.e(cVar, "binding");
        dev.fluttercommunity.plus.share.a aVar = this.f1781d;
        d dVar = null;
        if (aVar == null) {
            l.n("manager");
            aVar = null;
        }
        cVar.a(aVar);
        d dVar2 = this.f1780c;
        if (dVar2 == null) {
            l.n("share");
        } else {
            dVar = dVar2;
        }
        dVar.o(cVar.e());
    }

    public void onAttachedToEngine(a.b bVar) {
        l.e(bVar, "binding");
        this.f1782e = new j(bVar.b(), "dev.fluttercommunity.plus/share");
        Context a4 = bVar.a();
        l.d(a4, "getApplicationContext(...)");
        this.f1781d = new dev.fluttercommunity.plus.share.a(a4);
        Context a5 = bVar.a();
        l.d(a5, "getApplicationContext(...)");
        dev.fluttercommunity.plus.share.a aVar = this.f1781d;
        j jVar = null;
        if (aVar == null) {
            l.n("manager");
            aVar = null;
        }
        d dVar = new d(a5, (Activity) null, aVar);
        this.f1780c = dVar;
        dev.fluttercommunity.plus.share.a aVar2 = this.f1781d;
        if (aVar2 == null) {
            l.n("manager");
            aVar2 = null;
        }
        a aVar3 = new a(dVar, aVar2);
        j jVar2 = this.f1782e;
        if (jVar2 == null) {
            l.n("methodChannel");
        } else {
            jVar = jVar2;
        }
        jVar.e(aVar3);
    }

    public void onDetachedFromActivity() {
        d dVar = this.f1780c;
        if (dVar == null) {
            l.n("share");
            dVar = null;
        }
        dVar.o((Activity) null);
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        l.e(bVar, "binding");
        j jVar = this.f1782e;
        if (jVar == null) {
            l.n("methodChannel");
            jVar = null;
        }
        jVar.e((j.c) null);
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        l.e(cVar, "binding");
        onAttachedToActivity(cVar);
    }
}
