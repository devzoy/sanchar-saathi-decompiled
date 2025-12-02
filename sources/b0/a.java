package B0;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f240d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f241e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Map f242a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Set f243b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Context f244c;

    public a(Context context) {
        this.f244c = context.getApplicationContext();
    }

    public static a d(Context context) {
        if (f240d == null) {
            synchronized (f241e) {
                try {
                    if (f240d == null) {
                        f240d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f240d;
    }

    public void a() {
        try {
            C0.a.c("Startup");
            b(this.f244c.getPackageManager().getProviderInfo(new ComponentName(this.f244c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            C0.a.f();
        } catch (PackageManager.NameNotFoundException e4) {
            throw new d((Throwable) e4);
        } catch (Throwable th) {
            C0.a.f();
            throw th;
        }
    }

    public void b(Bundle bundle) {
        String string = this.f244c.getString(c.f245a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String next : bundle.keySet()) {
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f243b.add(cls);
                        }
                    }
                }
                for (Class c4 : this.f243b) {
                    c(c4, hashSet);
                }
            } catch (ClassNotFoundException e4) {
                throw new d((Throwable) e4);
            }
        }
    }

    public final Object c(Class cls, Set set) {
        Object obj;
        if (C0.a.h()) {
            try {
                C0.a.c(cls.getSimpleName());
            } catch (Throwable th) {
                C0.a.f();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f242a.containsKey(cls)) {
                set.add(cls);
                b bVar = (b) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                List<Class> a4 = bVar.a();
                if (!a4.isEmpty()) {
                    for (Class cls2 : a4) {
                        if (!this.f242a.containsKey(cls2)) {
                            c(cls2, set);
                        }
                    }
                }
                obj = bVar.b(this.f244c);
                set.remove(cls);
                this.f242a.put(cls, obj);
            } else {
                obj = this.f242a.get(cls);
            }
            C0.a.f();
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    public boolean e(Class cls) {
        return this.f243b.contains(cls);
    }
}
