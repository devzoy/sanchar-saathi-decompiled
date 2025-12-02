package X2;

import M2.b;
import Y2.i;
import Y2.j;
import Y2.p;
import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final j f3491a;

    /* renamed from: b  reason: collision with root package name */
    public final j.c f3492b;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(i iVar, j.d dVar) {
            dVar.a((Object) null);
        }
    }

    public f(P2.a aVar) {
        a aVar2 = new a();
        this.f3492b = aVar2;
        j jVar = new j(aVar, "flutter/backgesture", p.f3781b);
        this.f3491a = jVar;
        jVar.e(aVar2);
    }

    public final Map a(BackEvent backEvent) {
        HashMap hashMap = new HashMap(3);
        float a4 = backEvent.getTouchX();
        float a5 = backEvent.getTouchY();
        hashMap.put("touchOffset", (Float.isNaN(a4) || Float.isNaN(a5)) ? null : Arrays.asList(new Float[]{Float.valueOf(a4), Float.valueOf(a5)}));
        hashMap.put("progress", Float.valueOf(backEvent.getProgress()));
        hashMap.put("swipeEdge", Integer.valueOf(backEvent.getSwipeEdge()));
        return hashMap;
    }

    public void b() {
        b.f("BackGestureChannel", "Sending message to cancel back gesture");
        this.f3491a.c("cancelBackGesture", (Object) null);
    }

    public void c() {
        b.f("BackGestureChannel", "Sending message to commit back gesture");
        this.f3491a.c("commitBackGesture", (Object) null);
    }

    public void d(BackEvent backEvent) {
        b.f("BackGestureChannel", "Sending message to start back gesture");
        this.f3491a.c("startBackGesture", a(backEvent));
    }

    public void e(BackEvent backEvent) {
        b.f("BackGestureChannel", "Sending message to update back gesture progress");
        this.f3491a.c("updateBackGestureProgress", a(backEvent));
    }
}
