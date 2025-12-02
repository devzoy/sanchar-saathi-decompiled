package X2;

import Y2.i;
import Y2.j;
import Y2.p;
import java.util.HashMap;
import java.util.Map;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final j f3494a;

    /* renamed from: b  reason: collision with root package name */
    public Map f3495b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final j.c f3496c;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(i iVar, j.d dVar) {
            Q2.a unused = g.this.getClass();
        }
    }

    public g(P2.a aVar) {
        a aVar2 = new a();
        this.f3496c = aVar2;
        j jVar = new j(aVar, "flutter/deferredcomponent", p.f3781b);
        this.f3494a = jVar;
        jVar.e(aVar2);
        M2.a.e().a();
    }
}
