package e3;

import C3.o;
import Y2.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import i3.C0746w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q0.C0886b;
import v3.l;

public final class F implements C0597E {

    /* renamed from: c  reason: collision with root package name */
    public b f8788c;

    /* renamed from: d  reason: collision with root package name */
    public Context f8789d;

    /* renamed from: e  reason: collision with root package name */
    public G f8790e;

    public F(b bVar, Context context, G g4) {
        l.e(bVar, "messenger");
        l.e(context, "context");
        l.e(g4, "listEncoder");
        this.f8788c = bVar;
        this.f8789d = context;
        this.f8790e = g4;
        try {
            C0597E.f8785b.s(bVar, this, "shared_preferences");
        } catch (Exception e4) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e4);
        }
    }

    public List a(List list, H h4) {
        l.e(h4, "options");
        Map<String, ?> all = p(h4).getAll();
        l.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : all.entrySet()) {
            Object key = next.getKey();
            l.d(key, "<get-key>(...)");
            if (J.c((String) key, next.getValue(), list != null ? C0746w.L(list) : null)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return C0746w.I(linkedHashMap.keySet());
    }

    public void b(String str, String str2, H h4) {
        l.e(str, "key");
        l.e(str2, "value");
        l.e(h4, "options");
        p(h4).edit().putString(str, str2).apply();
    }

    public void c(String str, boolean z4, H h4) {
        l.e(str, "key");
        l.e(h4, "options");
        p(h4).edit().putBoolean(str, z4).apply();
    }

    public List d(String str, H h4) {
        List list;
        l.e(str, "key");
        l.e(h4, "options");
        SharedPreferences p4 = p(h4);
        ArrayList arrayList = null;
        if (p4.contains(str)) {
            String string = p4.getString(str, "");
            l.b(string);
            if (o.v(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, (Object) null) && !o.v(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false, 2, (Object) null) && (list = (List) J.d(p4.getString(str, ""), this.f8790e)) != null) {
                arrayList = new ArrayList();
                for (Object next : list) {
                    if (next instanceof String) {
                        arrayList.add(next);
                    }
                }
            }
        }
        return arrayList;
    }

    public Map e(List list, H h4) {
        Object value;
        l.e(h4, "options");
        Map<String, ?> all = p(h4).getAll();
        l.d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry next : all.entrySet()) {
            if (J.c((String) next.getKey(), next.getValue(), list != null ? C0746w.L(list) : null) && (value = next.getValue()) != null) {
                Object key = next.getKey();
                Object d4 = J.d(value, this.f8790e);
                l.c(d4, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, d4);
            }
        }
        return hashMap;
    }

    public void f(String str, List list, H h4) {
        l.e(str, "key");
        l.e(list, "value");
        l.e(h4, "options");
        String a4 = this.f8790e.a(list);
        p(h4).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + a4).apply();
    }

    public void g(List list, H h4) {
        l.e(h4, "options");
        SharedPreferences p4 = p(h4);
        SharedPreferences.Editor edit = p4.edit();
        l.d(edit, "edit(...)");
        Map<String, ?> all = p4.getAll();
        l.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String next : all.keySet()) {
            if (J.c(next, all.get(next), list != null ? C0746w.L(list) : null)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        l.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next2 = it.next();
            l.d(next2, "next(...)");
            edit.remove((String) next2);
        }
        edit.apply();
    }

    public Boolean h(String str, H h4) {
        l.e(str, "key");
        l.e(h4, "options");
        SharedPreferences p4 = p(h4);
        if (p4.contains(str)) {
            return Boolean.valueOf(p4.getBoolean(str, true));
        }
        return null;
    }

    public M i(String str, H h4) {
        l.e(str, "key");
        l.e(h4, "options");
        SharedPreferences p4 = p(h4);
        if (!p4.contains(str)) {
            return null;
        }
        String string = p4.getString(str, "");
        l.b(string);
        return o.v(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false, 2, (Object) null) ? new M(string, K.JSON_ENCODED) : o.v(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, (Object) null) ? new M((String) null, K.PLATFORM_ENCODED) : new M((String) null, K.UNEXPECTED_STRING);
    }

    public void j(String str, long j4, H h4) {
        l.e(str, "key");
        l.e(h4, "options");
        p(h4).edit().putLong(str, j4).apply();
    }

    public String k(String str, H h4) {
        l.e(str, "key");
        l.e(h4, "options");
        SharedPreferences p4 = p(h4);
        if (p4.contains(str)) {
            return p4.getString(str, "");
        }
        return null;
    }

    public Double l(String str, H h4) {
        l.e(str, "key");
        l.e(h4, "options");
        SharedPreferences p4 = p(h4);
        if (!p4.contains(str)) {
            return null;
        }
        Object d4 = J.d(p4.getString(str, ""), this.f8790e);
        l.c(d4, "null cannot be cast to non-null type kotlin.Double");
        return (Double) d4;
    }

    public void m(String str, double d4, H h4) {
        l.e(str, "key");
        l.e(h4, "options");
        SharedPreferences.Editor edit = p(h4).edit();
        edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).apply();
    }

    public Long n(String str, H h4) {
        long j4;
        l.e(str, "key");
        l.e(h4, "options");
        SharedPreferences p4 = p(h4);
        if (!p4.contains(str)) {
            return null;
        }
        try {
            j4 = p4.getLong(str, 0);
        } catch (ClassCastException unused) {
            j4 = (long) p4.getInt(str, 0);
        }
        return Long.valueOf(j4);
    }

    public void o(String str, String str2, H h4) {
        l.e(str, "key");
        l.e(str2, "value");
        l.e(h4, "options");
        p(h4).edit().putString(str, str2).apply();
    }

    public final SharedPreferences p(H h4) {
        if (h4.a() == null) {
            SharedPreferences a4 = C0886b.a(this.f8789d);
            l.b(a4);
            return a4;
        }
        SharedPreferences sharedPreferences = this.f8789d.getSharedPreferences(h4.a(), 0);
        l.b(sharedPreferences);
        return sharedPreferences;
    }

    public final void q() {
        C0597E.f8785b.s(this.f8788c, (C0597E) null, "shared_preferences");
    }
}
