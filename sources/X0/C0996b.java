package x0;

import android.os.Bundle;
import android.support.v4.media.session.b;
import androidx.lifecycle.C0380g;
import androidx.lifecycle.C0382i;
import androidx.lifecycle.C0384k;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import v3.g;
import v3.l;
import x0.C0998d;

/* renamed from: x0.b  reason: case insensitive filesystem */
public final class C0996b implements C0382i {

    /* renamed from: d  reason: collision with root package name */
    public static final a f12689d = new a((g) null);

    /* renamed from: c  reason: collision with root package name */
    public final C1000f f12690c;

    /* renamed from: x0.b$a */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    public C0996b(C1000f fVar) {
        l.e(fVar, "owner");
        this.f12690c = fVar;
    }

    public void d(C0384k kVar, C0380g.a aVar) {
        l.e(kVar, "source");
        l.e(aVar, "event");
        if (aVar == C0380g.a.ON_CREATE) {
            kVar.b().c(this);
            Bundle b4 = this.f12690c.l().b("androidx.savedstate.Restarter");
            if (b4 != null) {
                ArrayList<String> stringArrayList = b4.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String h4 : stringArrayList) {
                        h(h4);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }

    public final void h(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, C0996b.class.getClassLoader()).asSubclass(C0998d.a.class);
            l.d(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor((Class[]) null);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance((Object[]) null);
                    l.d(newInstance, "{\n                constr…wInstance()\n            }");
                    b.a(newInstance);
                    throw null;
                } catch (Exception e4) {
                    throw new RuntimeException("Failed to instantiate " + str, e4);
                }
            } catch (NoSuchMethodException e5) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("Class " + str + " wasn't found", e6);
        }
    }
}
