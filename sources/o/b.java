package O;

import android.content.res.Configuration;
import android.os.LocaleList;

public abstract class b {

    public static class a {
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        public static void b(Configuration configuration, d dVar) {
            configuration.setLocales((LocaleList) dVar.c());
        }
    }

    public static d a(Configuration configuration) {
        return d.d(a.a(configuration));
    }
}
