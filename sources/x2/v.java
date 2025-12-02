package X2;

import Y2.i;
import Y2.j;
import Y2.p;
import java.util.ArrayList;

public class v {

    /* renamed from: a  reason: collision with root package name */
    public final j f3654a;

    /* renamed from: b  reason: collision with root package name */
    public b f3655b;

    /* renamed from: c  reason: collision with root package name */
    public final j.c f3656c;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(i iVar, j.d dVar) {
            if (v.this.f3655b == null) {
                M2.b.f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = iVar.f3766a;
            Object obj = iVar.f3767b;
            M2.b.f("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.c();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                v.this.f3655b.a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e4) {
                dVar.b("error", e4.getMessage(), (Object) null);
            }
        }
    }

    public interface b {
        void a(String str, String str2, j.d dVar);
    }

    public v(P2.a aVar) {
        a aVar2 = new a();
        this.f3656c = aVar2;
        j jVar = new j(aVar, "flutter/spellcheck", p.f3781b);
        this.f3654a = jVar;
        jVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f3655b = bVar;
    }
}
