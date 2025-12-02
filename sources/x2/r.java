package X2;

import Y2.i;
import Y2.j;
import Y2.p;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Map;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public final j f3618a;

    /* renamed from: b  reason: collision with root package name */
    public final PackageManager f3619b;

    /* renamed from: c  reason: collision with root package name */
    public b f3620c;

    /* renamed from: d  reason: collision with root package name */
    public final j.c f3621d;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(i iVar, j.d dVar) {
            if (r.this.f3620c != null) {
                String str = iVar.f3766a;
                Object obj = iVar.f3767b;
                str.hashCode();
                if (str.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList = (ArrayList) obj;
                        boolean booleanValue = ((Boolean) arrayList.get(2)).booleanValue();
                        r.this.f3620c.a((String) arrayList.get(0), (String) arrayList.get(1), booleanValue, dVar);
                    } catch (IllegalStateException e4) {
                        dVar.b("error", e4.getMessage(), (Object) null);
                    }
                } else if (!str.equals("ProcessText.queryTextActions")) {
                    dVar.c();
                } else {
                    try {
                        dVar.a(r.this.f3620c.b());
                    } catch (IllegalStateException e5) {
                        dVar.b("error", e5.getMessage(), (Object) null);
                    }
                }
            }
        }
    }

    public interface b {
        void a(String str, String str2, boolean z4, j.d dVar);

        Map b();
    }

    public r(P2.a aVar, PackageManager packageManager) {
        a aVar2 = new a();
        this.f3621d = aVar2;
        this.f3619b = packageManager;
        j jVar = new j(aVar, "flutter/processtext", p.f3781b);
        this.f3618a = jVar;
        jVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f3620c = bVar;
    }
}
