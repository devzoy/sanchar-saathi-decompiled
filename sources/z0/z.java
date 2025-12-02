package Z0;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import v3.l;

public interface z {

    public static final class a {
        public static void a(z zVar, String str, Set set) {
            l.e(str, "id");
            l.e(set, "tags");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                zVar.a(new y((String) it.next(), str));
            }
        }
    }

    void a(y yVar);

    void b(String str, Set set);

    void c(String str);

    List d(String str);
}
