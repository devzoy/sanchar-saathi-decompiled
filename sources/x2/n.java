package X2;

import M2.b;
import Y2.f;
import Y2.i;
import Y2.j;
import java.util.HashMap;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public final j f3526a;

    /* renamed from: b  reason: collision with root package name */
    public final j.c f3527b;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(i iVar, j.d dVar) {
            dVar.a((Object) null);
        }
    }

    public n(P2.a aVar) {
        a aVar2 = new a();
        this.f3527b = aVar2;
        j jVar = new j(aVar, "flutter/navigation", f.f3765a);
        this.f3526a = jVar;
        jVar.e(aVar2);
    }

    public void a() {
        b.f("NavigationChannel", "Sending message to pop route.");
        this.f3526a.c("popRoute", (Object) null);
    }

    public void b(String str) {
        b.f("NavigationChannel", "Sending message to push route information '" + str + "'");
        HashMap hashMap = new HashMap();
        hashMap.put("location", str);
        this.f3526a.c("pushRouteInformation", hashMap);
    }

    public void c(String str) {
        b.f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f3526a.c("setInitialRoute", str);
    }
}
