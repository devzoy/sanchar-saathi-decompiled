package H0;

import v3.g;
import v3.l;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1380a = new a((g) null);

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public static /* synthetic */ h b(a aVar, Object obj, String str, j jVar, g gVar, int i4, Object obj2) {
            if ((i4 & 2) != 0) {
                jVar = c.f1363a.a();
            }
            if ((i4 & 4) != 0) {
                gVar = a.f1358a;
            }
            return aVar.a(obj, str, jVar, gVar);
        }

        public final h a(Object obj, String str, j jVar, g gVar) {
            l.e(obj, "<this>");
            l.e(str, "tag");
            l.e(jVar, "verificationMode");
            l.e(gVar, "logger");
            return new i(obj, str, jVar, gVar);
        }

        public a() {
        }
    }

    public abstract Object a();

    public final String b(Object obj, String str) {
        l.e(obj, "value");
        l.e(str, "message");
        return str + " value: " + obj;
    }

    public abstract h c(String str, u3.l lVar);
}
