package j0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import i0.C0695p;
import i0.I;
import i3.C0721E;
import i3.C0723G;
import i3.C0746w;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import v3.g;
import v3.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f10809a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static C0176c f10810b = C0176c.f10822d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
    }

    /* renamed from: j0.c$c  reason: collision with other inner class name */
    public static final class C0176c {

        /* renamed from: c  reason: collision with root package name */
        public static final a f10821c = new a((g) null);

        /* renamed from: d  reason: collision with root package name */
        public static final C0176c f10822d = new C0176c(C0723G.d(), (b) null, C0721E.g());

        /* renamed from: a  reason: collision with root package name */
        public final Set f10823a;

        /* renamed from: b  reason: collision with root package name */
        public final Map f10824b;

        /* renamed from: j0.c$c$a */
        public static final class a {
            public /* synthetic */ a(g gVar) {
                this();
            }

            public a() {
            }
        }

        public C0176c(Set set, b bVar, Map map) {
            l.e(set, "flags");
            l.e(map, "allowedViolations");
            this.f10823a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f10824b = linkedHashMap;
        }

        public final Set a() {
            return this.f10823a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f10824b;
        }
    }

    public static final void d(String str, g gVar) {
        l.e(gVar, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, gVar);
        throw gVar;
    }

    public static final void f(C0695p pVar, String str) {
        l.e(pVar, "fragment");
        l.e(str, "previousFragmentId");
        C0755a aVar = new C0755a(pVar, str);
        c cVar = f10809a;
        cVar.e(aVar);
        C0176c b4 = cVar.b(pVar);
        if (b4.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.l(b4, pVar.getClass(), aVar.getClass())) {
            cVar.c(b4, aVar);
        }
    }

    public static final void g(C0695p pVar, ViewGroup viewGroup) {
        l.e(pVar, "fragment");
        d dVar = new d(pVar, viewGroup);
        c cVar = f10809a;
        cVar.e(dVar);
        C0176c b4 = cVar.b(pVar);
        if (b4.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.l(b4, pVar.getClass(), dVar.getClass())) {
            cVar.c(b4, dVar);
        }
    }

    public static final void h(C0695p pVar) {
        l.e(pVar, "fragment");
        e eVar = new e(pVar);
        c cVar = f10809a;
        cVar.e(eVar);
        C0176c b4 = cVar.b(pVar);
        if (b4.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.l(b4, pVar.getClass(), eVar.getClass())) {
            cVar.c(b4, eVar);
        }
    }

    public static final void i(C0695p pVar, ViewGroup viewGroup) {
        l.e(pVar, "fragment");
        l.e(viewGroup, "container");
        h hVar = new h(pVar, viewGroup);
        c cVar = f10809a;
        cVar.e(hVar);
        C0176c b4 = cVar.b(pVar);
        if (b4.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.l(b4, pVar.getClass(), hVar.getClass())) {
            cVar.c(b4, hVar);
        }
    }

    public static final void j(C0695p pVar, C0695p pVar2, int i4) {
        l.e(pVar, "fragment");
        l.e(pVar2, "expectedParentFragment");
        i iVar = new i(pVar, pVar2, i4);
        c cVar = f10809a;
        cVar.e(iVar);
        C0176c b4 = cVar.b(pVar);
        if (b4.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && cVar.l(b4, pVar.getClass(), iVar.getClass())) {
            cVar.c(b4, iVar);
        }
    }

    public final C0176c b(C0695p pVar) {
        while (pVar != null) {
            if (pVar.a0()) {
                I H4 = pVar.H();
                l.d(H4, "declaringFragment.parentFragmentManager");
                if (H4.B0() != null) {
                    C0176c B02 = H4.B0();
                    l.b(B02);
                    return B02;
                }
            }
            pVar = pVar.G();
        }
        return f10810b;
    }

    public final void c(C0176c cVar, g gVar) {
        C0695p a4 = gVar.a();
        String name = a4.getClass().getName();
        if (cVar.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, gVar);
        }
        cVar.b();
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            k(a4, new b(name, gVar));
        }
    }

    public final void e(g gVar) {
        if (I.I0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + gVar.a().getClass().getName(), gVar);
        }
    }

    public final void k(C0695p pVar, Runnable runnable) {
        if (pVar.a0()) {
            Handler v4 = pVar.H().v0().v();
            if (l.a(v4.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                v4.post(runnable);
            }
        } else {
            runnable.run();
        }
    }

    public final boolean l(C0176c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (l.a(cls2.getSuperclass(), g.class) || !C0746w.t(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
