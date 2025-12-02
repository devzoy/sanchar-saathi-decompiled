package Z0;

import java.util.List;
import v3.l;

public interface j {

    public static final class a {
        public static i a(j jVar, m mVar) {
            l.e(mVar, "id");
            return jVar.g(mVar.b(), mVar.a());
        }

        public static void b(j jVar, m mVar) {
            l.e(mVar, "id");
            jVar.d(mVar.b(), mVar.a());
        }
    }

    void a(m mVar);

    List b();

    void c(i iVar);

    void d(String str, int i4);

    i e(m mVar);

    void f(String str);

    i g(String str, int i4);
}
