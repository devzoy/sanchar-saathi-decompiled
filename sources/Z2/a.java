package Z2;

import X2.l;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final l f3885a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f3886b;

    /* renamed from: c  reason: collision with root package name */
    public final l.b f3887c;

    /* renamed from: Z2.a$a  reason: collision with other inner class name */
    public class C0075a implements l.b {
        public C0075a() {
        }

        public String a(String str, String str2) {
            Context a4 = a.this.f3886b;
            if (str2 != null) {
                Locale b4 = a.b(str2);
                Configuration configuration = new Configuration(a.this.f3886b.getResources().getConfiguration());
                configuration.setLocale(b4);
                a4 = a.this.f3886b.createConfigurationContext(configuration);
            }
            int identifier = a4.getResources().getIdentifier(str, "string", a.this.f3886b.getPackageName());
            if (identifier != 0) {
                return a4.getResources().getString(identifier);
            }
            return null;
        }
    }

    public a(Context context, l lVar) {
        C0075a aVar = new C0075a();
        this.f3887c = aVar;
        this.f3886b = context;
        this.f3885a = lVar;
        lVar.c(aVar);
    }

    public static Locale b(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int i4 = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = str4;
        } else {
            str2 = split[1];
            i4 = 2;
        }
        if (split.length > i4 && split[i4].length() >= 2 && split[i4].length() <= 3) {
            str4 = split[i4];
        }
        return new Locale(str3, str4, str2);
    }

    public Locale c(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        LocaleList locales = this.f3886b.getResources().getConfiguration().getLocales();
        int size = locales.size();
        for (int i4 = 0; i4 < size; i4++) {
            Locale locale = locales.get(i4);
            String language = locale.getLanguage();
            if (!locale.getScript().isEmpty()) {
                language = language + "-" + locale.getScript();
            }
            if (!locale.getCountry().isEmpty()) {
                language = language + "-" + locale.getCountry();
            }
            arrayList.add(new Locale.LanguageRange(language));
            arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
            arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
        }
        Locale lookup = Locale.lookup(arrayList, list);
        return lookup != null ? lookup : (Locale) list.get(0);
    }

    public void d(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(locales.get(i4));
        }
        this.f3885a.b(arrayList);
    }
}
