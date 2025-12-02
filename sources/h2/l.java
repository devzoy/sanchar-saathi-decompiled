package H2;

import R1.f;
import T2.a;
import Y2.c;
import Y2.i;
import Y2.j;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.play.core.install.InstallState;
import h3.C0666g;
import h3.C0670k;
import h3.C0673n;
import i3.C0721E;
import i3.C0739p;
import i3.C0746w;
import java.util.ArrayList;
import java.util.Set;
import p2.C0870a;
import p2.C0871b;
import p2.C0872c;
import p2.C0873d;
import v3.g;

public final class l implements T2.a, j.c, Y2.l, Application.ActivityLifecycleCallbacks, U2.a, c.d {

    /* renamed from: l  reason: collision with root package name */
    public static final a f1425l = new a((g) null);

    /* renamed from: c  reason: collision with root package name */
    public j f1426c;

    /* renamed from: d  reason: collision with root package name */
    public Y2.c f1427d;

    /* renamed from: e  reason: collision with root package name */
    public s2.b f1428e;

    /* renamed from: f  reason: collision with root package name */
    public c.b f1429f;

    /* renamed from: g  reason: collision with root package name */
    public a f1430g;

    /* renamed from: h  reason: collision with root package name */
    public j.d f1431h;

    /* renamed from: i  reason: collision with root package name */
    public Integer f1432i;

    /* renamed from: j  reason: collision with root package name */
    public C0870a f1433j;

    /* renamed from: k  reason: collision with root package name */
    public C0871b f1434k;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ U2.c f1435a;

        public b(U2.c cVar) {
            this.f1435a = cVar;
        }

        public void a(Y2.l lVar) {
            v3.l.e(lVar, "callback");
            this.f1435a.a(lVar);
        }

        public Activity b() {
            Activity e4 = this.f1435a.e();
            v3.l.d(e4, "getActivity(...)");
            return e4;
        }
    }

    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ U2.c f1436a;

        public c(U2.c cVar) {
            this.f1436a = cVar;
        }

        public void a(Y2.l lVar) {
            v3.l.e(lVar, "callback");
            this.f1436a.a(lVar);
        }

        public Activity b() {
            Activity e4 = this.f1436a.e();
            v3.l.d(e4, "getActivity(...)");
            return e4;
        }
    }

    public static final C0673n A(l lVar, j.d dVar) {
        lVar.f1432i = 0;
        lVar.f1431h = dVar;
        C0871b bVar = lVar.f1434k;
        if (bVar != null) {
            C0870a aVar = lVar.f1433j;
            v3.l.b(aVar);
            a aVar2 = lVar.f1430g;
            v3.l.b(aVar2);
            bVar.b(aVar, aVar2.b(), C0873d.c(0), 1276);
        }
        C0871b bVar2 = lVar.f1434k;
        if (bVar2 != null) {
            bVar2.c(new k(lVar));
        }
        return C0673n.f9639a;
    }

    public static final void B(l lVar, InstallState installState) {
        v3.l.e(installState, "state");
        lVar.m(installState.c());
        if (installState.c() == 11) {
            j.d dVar = lVar.f1431h;
            if (dVar != null) {
                dVar.a((Object) null);
            }
            lVar.f1431h = null;
        } else if (installState.b() != 0) {
            j.d dVar2 = lVar.f1431h;
            if (dVar2 != null) {
                dVar2.b("Error during installation", String.valueOf(installState.b()), (Object) null);
            }
            lVar.f1431h = null;
        }
    }

    public static final C0673n p(l lVar, j.d dVar, C0870a aVar) {
        lVar.f1433j = aVar;
        C0666g a4 = C0670k.a("updateAvailability", Integer.valueOf(aVar.h()));
        C0666g a5 = C0670k.a("immediateAllowed", Boolean.valueOf(aVar.e(1)));
        Set<Integer> c4 = aVar.c(C0873d.c(1));
        v3.l.d(c4, "getFailedUpdatePreconditions(...)");
        ArrayList arrayList = new ArrayList(C0739p.m(c4, 10));
        for (Integer num : c4) {
            num.intValue();
            arrayList.add(num);
        }
        C0666g a6 = C0670k.a("immediateAllowedPreconditions", C0746w.I(arrayList));
        C0666g a7 = C0670k.a("flexibleAllowed", Boolean.valueOf(aVar.e(0)));
        Set<Integer> c5 = aVar.c(C0873d.c(0));
        v3.l.d(c5, "getFailedUpdatePreconditions(...)");
        ArrayList arrayList2 = new ArrayList(C0739p.m(c5, 10));
        for (Integer num2 : c5) {
            num2.intValue();
            arrayList2.add(num2);
        }
        dVar.a(C0721E.i(a4, a5, a6, a7, C0670k.a("flexibleAllowedPreconditions", C0746w.I(arrayList2)), C0670k.a("availableVersionCode", Integer.valueOf(aVar.a())), C0670k.a("installStatus", Integer.valueOf(aVar.d())), C0670k.a("packageName", aVar.g()), C0670k.a("clientVersionStalenessDays", aVar.b()), C0670k.a("updatePriority", Integer.valueOf(aVar.i()))));
        return C0673n.f9639a;
    }

    public static final void q(u3.l lVar, Object obj) {
        lVar.i(obj);
    }

    public static final void r(j.d dVar, Exception exc) {
        v3.l.e(exc, "it");
        dVar.b("TASK_FAILURE", exc.getMessage(), (Object) null);
    }

    public static final C0673n t(l lVar) {
        C0871b bVar = lVar.f1434k;
        if (bVar != null) {
            bVar.d();
        }
        return C0673n.f9639a;
    }

    public static final C0673n u(l lVar, Activity activity, C0870a aVar) {
        Integer num;
        if (aVar.h() == 3 && (num = lVar.f1432i) != null && num.intValue() == 1) {
            try {
                C0871b bVar = lVar.f1434k;
                if (bVar != null) {
                    bVar.f(aVar, 1, activity, 1276);
                }
            } catch (IntentSender.SendIntentException e4) {
                Log.e("in_app_update", "Could not start update flow", e4);
            }
        }
        return C0673n.f9639a;
    }

    public static final void v(u3.l lVar, Object obj) {
        lVar.i(obj);
    }

    public static final void w(l lVar, InstallState installState) {
        v3.l.e(installState, "installState");
        lVar.m(installState.c());
    }

    public static final C0673n y(l lVar, j.d dVar) {
        lVar.f1432i = 1;
        lVar.f1431h = dVar;
        C0871b bVar = lVar.f1434k;
        if (bVar != null) {
            C0870a aVar = lVar.f1433j;
            v3.l.b(aVar);
            a aVar2 = lVar.f1430g;
            v3.l.b(aVar2);
            bVar.b(aVar, aVar2.b(), C0873d.c(1), 1276);
        }
        return C0673n.f9639a;
    }

    public void a(Object obj, c.b bVar) {
        this.f1429f = bVar;
    }

    public void b(Object obj) {
        this.f1429f = null;
    }

    public final void m(int i4) {
        c.b bVar = this.f1429f;
        if (bVar != null) {
            bVar.a(Integer.valueOf(i4));
        }
    }

    public final void n(j.d dVar, u3.a aVar) {
        if (this.f1433j != null) {
            a aVar2 = this.f1430g;
            if ((aVar2 != null ? aVar2.b() : null) == null) {
                dVar.b("REQUIRE_FOREGROUND_ACTIVITY", "in_app_update requires a foreground activity", (Object) null);
                throw new IllegalArgumentException(C0673n.f9639a.toString());
            } else if (this.f1434k != null) {
                aVar.c();
            } else {
                dVar.b("REQUIRE_CHECK_FOR_UPDATE", "Call checkForUpdate first!", (Object) null);
                throw new IllegalArgumentException(C0673n.f9639a.toString());
            }
        } else {
            dVar.b("REQUIRE_CHECK_FOR_UPDATE", "Call checkForUpdate first!", (Object) null);
            throw new IllegalArgumentException(C0673n.f9639a.toString());
        }
    }

    public final void o(j.d dVar) {
        Activity b4;
        Application application;
        a aVar = this.f1430g;
        if ((aVar != null ? aVar.b() : null) != null) {
            a aVar2 = this.f1430g;
            if (aVar2 != null) {
                aVar2.a(this);
            }
            a aVar3 = this.f1430g;
            if (!(aVar3 == null || (b4 = aVar3.b()) == null || (application = b4.getApplication()) == null)) {
                application.registerActivityLifecycleCallbacks(this);
            }
            a aVar4 = this.f1430g;
            v3.l.b(aVar4);
            C0871b a4 = C0872c.a(aVar4.b());
            this.f1434k = a4;
            v3.l.b(a4);
            f e4 = a4.e();
            v3.l.d(e4, "getAppUpdateInfo(...)");
            e4.d(new h(new g(this, dVar)));
            e4.c(new i(dVar));
            return;
        }
        dVar.b("REQUIRE_FOREGROUND_ACTIVITY", "in_app_update requires a foreground activity", (Object) null);
        throw new IllegalArgumentException(C0673n.f9639a.toString());
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        v3.l.e(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        v3.l.e(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        v3.l.e(activity, "activity");
    }

    public boolean onActivityResult(int i4, int i5, Intent intent) {
        j.d dVar;
        if (i4 != 1276) {
            return false;
        }
        Integer num = this.f1432i;
        if (num != null && num.intValue() == 1) {
            if (i5 == -1) {
                j.d dVar2 = this.f1431h;
                if (dVar2 != null) {
                    dVar2.a((Object) null);
                }
            } else if (i5 == 0) {
                j.d dVar3 = this.f1431h;
                if (dVar3 != null) {
                    dVar3.b("USER_DENIED_UPDATE", String.valueOf(i5), (Object) null);
                }
            } else if (i5 == 1 && (dVar = this.f1431h) != null) {
                dVar.b("IN_APP_UPDATE_FAILED", "Some other error prevented either the user from providing consent or the update to proceed.", (Object) null);
            }
            this.f1431h = null;
            return true;
        }
        Integer num2 = this.f1432i;
        if (num2 == null || num2.intValue() != 0) {
            return false;
        }
        if (i5 == 0) {
            j.d dVar4 = this.f1431h;
            if (dVar4 != null) {
                dVar4.b("USER_DENIED_UPDATE", String.valueOf(i5), (Object) null);
            }
            this.f1431h = null;
        } else if (i5 == 1) {
            j.d dVar5 = this.f1431h;
            if (dVar5 != null) {
                dVar5.b("IN_APP_UPDATE_FAILED", String.valueOf(i5), (Object) null);
            }
            this.f1431h = null;
        }
        return true;
    }

    public void onActivityResumed(Activity activity) {
        f e4;
        v3.l.e(activity, "activity");
        C0871b bVar = this.f1434k;
        if (bVar != null && (e4 = bVar.e()) != null) {
            e4.d(new d(new c(this, activity)));
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        v3.l.e(activity, "activity");
        v3.l.e(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        v3.l.e(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        v3.l.e(activity, "activity");
    }

    public void onAttachedToActivity(U2.c cVar) {
        v3.l.e(cVar, "activityPluginBinding");
        this.f1430g = new b(cVar);
    }

    public void onAttachedToEngine(a.b bVar) {
        v3.l.e(bVar, "flutterPluginBinding");
        j jVar = new j(bVar.b(), "de.ffuf.in_app_update/methods");
        this.f1426c = jVar;
        jVar.e(this);
        Y2.c cVar = new Y2.c(bVar.b(), "de.ffuf.in_app_update/stateEvents");
        this.f1427d = cVar;
        cVar.d(this);
        b bVar2 = new b(this);
        this.f1428e = bVar2;
        C0871b bVar3 = this.f1434k;
        if (bVar3 != null) {
            bVar3.c(bVar2);
        }
    }

    public void onDetachedFromActivity() {
        this.f1430g = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f1430g = null;
    }

    public void onDetachedFromEngine(a.b bVar) {
        v3.l.e(bVar, "binding");
        j jVar = this.f1426c;
        s2.b bVar2 = null;
        if (jVar == null) {
            v3.l.n("channel");
            jVar = null;
        }
        jVar.e((j.c) null);
        Y2.c cVar = this.f1427d;
        if (cVar == null) {
            v3.l.n("event");
            cVar = null;
        }
        cVar.d((c.d) null);
        C0871b bVar3 = this.f1434k;
        if (bVar3 != null) {
            s2.b bVar4 = this.f1428e;
            if (bVar4 == null) {
                v3.l.n("installStateUpdatedListener");
            } else {
                bVar2 = bVar4;
            }
            bVar3.a(bVar2);
        }
    }

    public void onMethodCall(i iVar, j.d dVar) {
        v3.l.e(iVar, "call");
        v3.l.e(dVar, "result");
        String str = iVar.f3766a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1873373639:
                    if (str.equals("performImmediateUpdate")) {
                        x(dVar);
                        return;
                    }
                    break;
                case -1541164682:
                    if (str.equals("startFlexibleUpdate")) {
                        z(dVar);
                        return;
                    }
                    break;
                case -1317168438:
                    if (str.equals("checkForUpdate")) {
                        o(dVar);
                        return;
                    }
                    break;
                case -193504755:
                    if (str.equals("completeFlexibleUpdate")) {
                        s(dVar);
                        return;
                    }
                    break;
            }
        }
        dVar.c();
    }

    public void onReattachedToActivityForConfigChanges(U2.c cVar) {
        v3.l.e(cVar, "activityPluginBinding");
        this.f1430g = new c(cVar);
    }

    public final void s(j.d dVar) {
        n(dVar, new e(this));
    }

    public final void x(j.d dVar) {
        n(dVar, new j(this, dVar));
    }

    public final void z(j.d dVar) {
        n(dVar, new f(this, dVar));
    }
}
