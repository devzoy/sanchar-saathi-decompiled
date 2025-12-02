package X2;

import Y2.f;
import Y2.i;
import Y2.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public final j f3518a;

    /* renamed from: b  reason: collision with root package name */
    public b f3519b;

    /* renamed from: c  reason: collision with root package name */
    public final j.c f3520c;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(i iVar, j.d dVar) {
            if (l.this.f3519b != null) {
                String str = iVar.f3766a;
                str.hashCode();
                if (!str.equals("Localization.getStringResource")) {
                    dVar.c();
                    return;
                }
                JSONObject jSONObject = (JSONObject) iVar.b();
                try {
                    dVar.a(l.this.f3519b.a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                } catch (JSONException e4) {
                    dVar.b("error", e4.getMessage(), (Object) null);
                }
            }
        }
    }

    public interface b {
        String a(String str, String str2);
    }

    public l(P2.a aVar) {
        a aVar2 = new a();
        this.f3520c = aVar2;
        j jVar = new j(aVar, "flutter/localization", f.f3765a);
        this.f3518a = jVar;
        jVar.e(aVar2);
    }

    public void b(List list) {
        M2.b.f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            M2.b.f("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.f3518a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.f3519b = bVar;
    }
}
