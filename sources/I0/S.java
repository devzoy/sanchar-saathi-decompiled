package i0;

import D0.C0221e;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import v.C0944a;
import v3.l;

public final class S {

    /* renamed from: a  reason: collision with root package name */
    public static final S f9954a;

    /* renamed from: b  reason: collision with root package name */
    public static final U f9955b = new T();

    /* renamed from: c  reason: collision with root package name */
    public static final U f9956c;

    static {
        S s4 = new S();
        f9954a = s4;
        f9956c = s4.b();
    }

    public static final void a(C0695p pVar, C0695p pVar2, boolean z4, C0944a aVar, boolean z5) {
        l.e(pVar, "inFragment");
        l.e(pVar2, "outFragment");
        l.e(aVar, "sharedElements");
        if (z4) {
            pVar2.x();
        } else {
            pVar.x();
        }
    }

    public static final void c(C0944a aVar, C0944a aVar2) {
        l.e(aVar, "<this>");
        l.e(aVar2, "namedViews");
        int size = aVar.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!aVar2.containsKey((String) aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    public static final void d(List list, int i4) {
        l.e(list, "views");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i4);
        }
    }

    public final U b() {
        Class<C0221e> cls = C0221e.class;
        try {
            l.c(cls, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
