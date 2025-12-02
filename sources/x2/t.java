package X2;

import Y2.f;
import Y2.i;
import Y2.j;
import android.os.Build;

public class t {

    /* renamed from: a  reason: collision with root package name */
    public final j f3633a;

    /* renamed from: b  reason: collision with root package name */
    public b f3634b;

    /* renamed from: c  reason: collision with root package name */
    public final j.c f3635c;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(i iVar, j.d dVar) {
            if (t.this.f3634b == null) {
                M2.b.f("ScribeChannel", "No ScribeMethodHandler registered. Scribe call not handled.");
                return;
            }
            String str = iVar.f3766a;
            M2.b.f("ScribeChannel", "Received '" + str + "' message.");
            str.hashCode();
            char c4 = 65535;
            switch (str.hashCode()) {
                case -705821951:
                    if (str.equals("Scribe.isFeatureAvailable")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case 1759284829:
                    if (str.equals("Scribe.startStylusHandwriting")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 2119738044:
                    if (str.equals("Scribe.isStylusHandwritingAvailable")) {
                        c4 = 2;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    t.this.e(iVar, dVar);
                    return;
                case 1:
                    t.this.h(iVar, dVar);
                    return;
                case 2:
                    t.this.f(iVar, dVar);
                    return;
                default:
                    dVar.c();
                    return;
            }
        }
    }

    public interface b {
        boolean a();

        void b();

        boolean c();
    }

    public t(P2.a aVar) {
        a aVar2 = new a();
        this.f3635c = aVar2;
        j jVar = new j(aVar, "flutter/scribe", f.f3765a);
        this.f3633a = jVar;
        jVar.e(aVar2);
    }

    public final void e(i iVar, j.d dVar) {
        try {
            dVar.a(Boolean.valueOf(this.f3634b.a()));
        } catch (IllegalStateException e4) {
            dVar.b("error", e4.getMessage(), (Object) null);
        }
    }

    public final void f(i iVar, j.d dVar) {
        if (Build.VERSION.SDK_INT < 34) {
            dVar.b("error", "Requires API level 34 or higher.", (Object) null);
            return;
        }
        try {
            dVar.a(Boolean.valueOf(this.f3634b.c()));
        } catch (IllegalStateException e4) {
            dVar.b("error", e4.getMessage(), (Object) null);
        }
    }

    public void g(b bVar) {
        this.f3634b = bVar;
    }

    public final void h(i iVar, j.d dVar) {
        if (Build.VERSION.SDK_INT < 33) {
            dVar.b("error", "Requires API level 33 or higher.", (Object) null);
            return;
        }
        try {
            this.f3634b.b();
            dVar.a((Object) null);
        } catch (IllegalStateException e4) {
            dVar.b("error", e4.getMessage(), (Object) null);
        }
    }
}
