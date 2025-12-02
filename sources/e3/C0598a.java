package e3;

import T2.a;
import Y2.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import e3.C0600c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: e3.a  reason: case insensitive filesystem */
public class C0598a implements a, C0600c.b {

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f8931c;

    /* renamed from: d  reason: collision with root package name */
    public final G f8932d;

    /* renamed from: e3.a$a  reason: collision with other inner class name */
    public static class C0158a implements G {
        public String a(List list) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(list);
                objectOutputStream.flush();
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }

        public List b(String str) {
            try {
                return (List) new L(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
            } catch (IOException | ClassNotFoundException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public C0598a() {
        this(new C0158a());
    }

    private void F(b bVar, Context context) {
        this.f8931c = context.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            C0600c.b.C(bVar, this);
        } catch (Exception e4) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e4);
        }
    }

    public final Map E(String str, Set set) {
        Map<String, ?> all = this.f8931c.getAll();
        HashMap hashMap = new HashMap();
        for (String next : all.keySet()) {
            if (next.startsWith(str) && (set == null || set.contains(next))) {
                Object obj = all.get(next);
                Objects.requireNonNull(obj);
                hashMap.put(next, G(next, obj));
            }
        }
        return hashMap;
    }

    public final Object G(String str, Object obj) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                return str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? obj : this.f8932d.b(str2.substring(40));
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                return new BigInteger(str2.substring(44), 36);
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return Double.valueOf(str2.substring(40));
            }
        } else if (obj instanceof Set) {
            ArrayList arrayList = new ArrayList((Set) obj);
            SharedPreferences.Editor remove = this.f8931c.edit().remove(str);
            remove.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f8932d.a(arrayList)).apply();
            return arrayList;
        }
        return obj;
    }

    public Boolean f(String str, Long l4) {
        return Boolean.valueOf(this.f8931c.edit().putLong(str, l4.longValue()).commit());
    }

    public Map g(String str, List list) {
        return E(str, list == null ? null : new HashSet(list));
    }

    public Boolean k(String str, String str2) {
        if (!str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") && !str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            return Boolean.valueOf(this.f8931c.edit().putString(str, str2).commit());
        }
        throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
    }

    public Boolean m(String str, String str2) {
        return Boolean.valueOf(this.f8931c.edit().putString(str, str2).commit());
    }

    public Boolean n(String str, List list) {
        SharedPreferences.Editor edit = this.f8931c.edit();
        Map<String, ?> all = this.f8931c.getAll();
        ArrayList arrayList = new ArrayList();
        for (String next : all.keySet()) {
            if (next.startsWith(str) && (list == null || list.contains(next))) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        return Boolean.valueOf(edit.commit());
    }

    public Boolean o(String str, List list) {
        SharedPreferences.Editor edit = this.f8931c.edit();
        return Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f8932d.a(list)).commit());
    }

    public void onAttachedToEngine(a.b bVar) {
        F(bVar.b(), bVar.a());
    }

    public void onDetachedFromEngine(a.b bVar) {
        C0600c.b.C(bVar.b(), (C0600c.b) null);
    }

    public Boolean t(String str, Boolean bool) {
        return Boolean.valueOf(this.f8931c.edit().putBoolean(str, bool.booleanValue()).commit());
    }

    public Boolean w(String str, Double d4) {
        String d5 = Double.toString(d4.doubleValue());
        SharedPreferences.Editor edit = this.f8931c.edit();
        return Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit());
    }

    public Boolean y(String str) {
        return Boolean.valueOf(this.f8931c.edit().remove(str).commit());
    }

    public C0598a(G g4) {
        this.f8932d = g4;
    }
}
