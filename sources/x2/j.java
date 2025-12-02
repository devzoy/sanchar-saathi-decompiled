package X2;

import Y2.i;
import Y2.j;
import Y2.p;
import java.util.HashMap;
import java.util.Map;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public final Y2.j f3502a;

    /* renamed from: b  reason: collision with root package name */
    public b f3503b;

    /* renamed from: c  reason: collision with root package name */
    public final j.c f3504c;

    public class a implements j.c {

        /* renamed from: c  reason: collision with root package name */
        public Map f3505c = new HashMap();

        public a() {
        }

        public void onMethodCall(i iVar, j.d dVar) {
            if (j.this.f3503b == null) {
                dVar.a(this.f3505c);
                return;
            }
            String str = iVar.f3766a;
            str.hashCode();
            if (!str.equals("getKeyboardState")) {
                dVar.c();
                return;
            }
            try {
                this.f3505c = j.this.f3503b.a();
            } catch (IllegalStateException e4) {
                dVar.b("error", e4.getMessage(), (Object) null);
            }
            dVar.a(this.f3505c);
        }
    }

    public interface b {
        Map a();
    }

    public j(Y2.b bVar) {
        a aVar = new a();
        this.f3504c = aVar;
        Y2.j jVar = new Y2.j(bVar, "flutter/keyboard", p.f3781b);
        this.f3502a = jVar;
        jVar.e(aVar);
    }

    public void b(b bVar) {
        this.f3503b = bVar;
    }
}
