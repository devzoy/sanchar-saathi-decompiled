package e3;

import A3.h;
import C3.o;
import D3.I;
import android.content.Context;
import d0.C0569b;
import f0.C0617a;
import java.util.List;
import java.util.Set;
import u3.l;
import v3.r;
import v3.x;
import w3.a;

public abstract class J {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ h[] f8919a = {x.e(new r(J.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};

    /* renamed from: b  reason: collision with root package name */
    public static final a f8920b = C0617a.b("FlutterSharedPreferences", (C0569b) null, (l) null, (I) null, 14, (Object) null);

    public static final c0.h b(Context context) {
        return (c0.h) f8920b.a(context, f8919a[0]);
    }

    public static final boolean c(String str, Object obj, Set set) {
        v3.l.e(str, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(str);
    }

    public static final Object d(Object obj, G g4) {
        v3.l.e(g4, "listEncoder");
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (o.v(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, (Object) null)) {
            if (o.v(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false, 2, (Object) null)) {
                return obj;
            }
            String substring = str.substring(40);
            v3.l.d(substring, "substring(...)");
            List b4 = g4.b(substring);
            v3.l.b(b4);
            return b4;
        } else if (!o.v(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu", false, 2, (Object) null)) {
            return obj;
        } else {
            String substring2 = str.substring(40);
            v3.l.d(substring2, "substring(...)");
            return Double.valueOf(Double.parseDouble(substring2));
        }
    }
}
