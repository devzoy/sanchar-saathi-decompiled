package X2;

import Y2.i;
import Y2.j;
import Y2.p;
import java.util.HashMap;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public final j f3522a;

    /* renamed from: b  reason: collision with root package name */
    public b f3523b;

    /* renamed from: c  reason: collision with root package name */
    public final j.c f3524c;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(i iVar, j.d dVar) {
            if (m.this.f3523b != null) {
                String str = iVar.f3766a;
                M2.b.f("MouseCursorChannel", "Received '" + str + "' message.");
                try {
                    if (str.hashCode() == -1307105544) {
                        if (str.equals("activateSystemCursor")) {
                            try {
                                m.this.f3523b.a((String) ((HashMap) iVar.f3767b).get("kind"));
                                dVar.a(Boolean.TRUE);
                            } catch (Exception e4) {
                                dVar.b("error", "Error when setting cursors: " + e4.getMessage(), (Object) null);
                            }
                        }
                    }
                } catch (Exception e5) {
                    dVar.b("error", "Unhandled error: " + e5.getMessage(), (Object) null);
                }
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public m(P2.a aVar) {
        a aVar2 = new a();
        this.f3524c = aVar2;
        j jVar = new j(aVar, "flutter/mousecursor", p.f3781b);
        this.f3522a = jVar;
        jVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f3523b = bVar;
    }
}
