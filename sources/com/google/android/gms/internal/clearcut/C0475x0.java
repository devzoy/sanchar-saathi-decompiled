package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.x0  reason: case insensitive filesystem */
public final class C0475x0 implements C0472w0 {
    public final Object f(Object obj, Object obj2) {
        C0469v0 v0Var = (C0469v0) obj;
        C0469v0 v0Var2 = (C0469v0) obj2;
        if (!v0Var2.isEmpty()) {
            if (!v0Var.a()) {
                v0Var = v0Var.g();
            }
            v0Var.b(v0Var2);
        }
        return v0Var;
    }

    public final Object g(Object obj) {
        ((C0469v0) obj).l();
        return obj;
    }

    public final int h(int i4, Object obj, Object obj2) {
        C0469v0 v0Var = (C0469v0) obj;
        if (v0Var.isEmpty()) {
            return 0;
        }
        Iterator it = v0Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    public final boolean i(Object obj) {
        return !((C0469v0) obj).a();
    }

    public final Map j(Object obj) {
        return (C0469v0) obj;
    }

    public final C0466u0 k(Object obj) {
        throw new NoSuchMethodError();
    }

    public final Map l(Object obj) {
        return (C0469v0) obj;
    }

    public final Object m(Object obj) {
        return C0469v0.e().g();
    }
}
