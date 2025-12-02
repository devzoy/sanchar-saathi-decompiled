package f;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import g.C0631a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import x3.c;

/* renamed from: f.d  reason: case insensitive filesystem */
public abstract class C0614d {

    /* renamed from: a  reason: collision with root package name */
    public final Map f8956a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map f8957b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map f8958c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f8959d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final transient Map f8960e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final Map f8961f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f8962g = new Bundle();

    /* renamed from: f.d$a */
    public class a extends C0613c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8963a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ C0631a f8964b;

        public a(String str, C0631a aVar) {
            this.f8963a = str;
            this.f8964b = aVar;
        }

        public void b(Object obj, G.b bVar) {
            Integer num = (Integer) C0614d.this.f8957b.get(this.f8963a);
            if (num != null) {
                C0614d.this.f8959d.add(this.f8963a);
                try {
                    C0614d.this.f(num.intValue(), this.f8964b, obj, bVar);
                } catch (Exception e4) {
                    C0614d.this.f8959d.remove(this.f8963a);
                    throw e4;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f8964b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        public void c() {
            C0614d.this.k(this.f8963a);
        }
    }

    /* renamed from: f.d$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final C0612b f8966a;

        /* renamed from: b  reason: collision with root package name */
        public final C0631a f8967b;

        public b(C0612b bVar, C0631a aVar) {
            this.f8966a = bVar;
            this.f8967b = aVar;
        }
    }

    public final void a(int i4, String str) {
        this.f8956a.put(Integer.valueOf(i4), str);
        this.f8957b.put(str, Integer.valueOf(i4));
    }

    public final boolean b(int i4, int i5, Intent intent) {
        String str = (String) this.f8956a.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        d(str, i5, intent, (b) this.f8960e.get(str));
        return true;
    }

    public final boolean c(int i4, Object obj) {
        C0612b bVar;
        String str = (String) this.f8956a.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        b bVar2 = (b) this.f8960e.get(str);
        if (bVar2 == null || (bVar = bVar2.f8966a) == null) {
            this.f8962g.remove(str);
            this.f8961f.put(str, obj);
            return true;
        } else if (!this.f8959d.remove(str)) {
            return true;
        } else {
            bVar.a(obj);
            return true;
        }
    }

    public final void d(String str, int i4, Intent intent, b bVar) {
        if (bVar == null || bVar.f8966a == null || !this.f8959d.contains(str)) {
            this.f8961f.remove(str);
            this.f8962g.putParcelable(str, new C0611a(i4, intent));
            return;
        }
        bVar.f8966a.a(bVar.f8967b.c(i4, intent));
        this.f8959d.remove(str);
    }

    public final int e() {
        int c4 = c.f12705e.c(2147418112);
        while (true) {
            int i4 = c4 + 65536;
            if (!this.f8956a.containsKey(Integer.valueOf(i4))) {
                return i4;
            }
            c4 = c.f12705e.c(2147418112);
        }
    }

    public abstract void f(int i4, C0631a aVar, Object obj, G.b bVar);

    public final void g(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                this.f8959d = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f8962g.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i4 = 0; i4 < stringArrayList.size(); i4++) {
                    String str = stringArrayList.get(i4);
                    if (this.f8957b.containsKey(str)) {
                        Integer num = (Integer) this.f8957b.remove(str);
                        if (!this.f8962g.containsKey(str)) {
                            this.f8956a.remove(num);
                        }
                    }
                    a(integerArrayList.get(i4).intValue(), stringArrayList.get(i4));
                }
            }
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f8957b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f8957b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f8959d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f8962g.clone());
    }

    public final C0613c i(String str, C0631a aVar, C0612b bVar) {
        j(str);
        this.f8960e.put(str, new b(bVar, aVar));
        if (this.f8961f.containsKey(str)) {
            Object obj = this.f8961f.get(str);
            this.f8961f.remove(str);
            bVar.a(obj);
        }
        C0611a aVar2 = (C0611a) this.f8962g.getParcelable(str);
        if (aVar2 != null) {
            this.f8962g.remove(str);
            bVar.a(aVar.c(aVar2.c(), aVar2.a()));
        }
        return new a(str, aVar);
    }

    public final void j(String str) {
        if (((Integer) this.f8957b.get(str)) == null) {
            a(e(), str);
        }
    }

    public final void k(String str) {
        Integer num;
        if (!this.f8959d.contains(str) && (num = (Integer) this.f8957b.remove(str)) != null) {
            this.f8956a.remove(num);
        }
        this.f8960e.remove(str);
        if (this.f8961f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f8961f.get(str));
            this.f8961f.remove(str);
        }
        if (this.f8962g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f8962g.getParcelable(str));
            this.f8962g.remove(str);
        }
        android.support.v4.media.session.b.a(this.f8958c.get(str));
    }
}
