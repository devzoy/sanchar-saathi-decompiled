package com.google.android.gms.internal.vision;

import android.support.v4.media.session.b;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.p1  reason: case insensitive filesystem */
public final class C0535p1 implements C0538q1 {
    public final Map b(Object obj) {
        return (C0529n1) obj;
    }

    public final Map c(Object obj) {
        return (C0529n1) obj;
    }

    public final boolean d(Object obj) {
        return !((C0529n1) obj).k();
    }

    public final Object e(Object obj, Object obj2) {
        C0529n1 n1Var = (C0529n1) obj;
        C0529n1 n1Var2 = (C0529n1) obj2;
        if (!n1Var2.isEmpty()) {
            if (!n1Var.k()) {
                n1Var = n1Var.g();
            }
            n1Var.e(n1Var2);
        }
        return n1Var;
    }

    public final C0532o1 g(Object obj) {
        b.a(obj);
        throw new NoSuchMethodError();
    }

    public final Object h(Object obj) {
        return C0529n1.b().g();
    }

    public final Object i(Object obj) {
        ((C0529n1) obj).h();
        return obj;
    }

    public final int j(int i4, Object obj, Object obj2) {
        C0529n1 n1Var = (C0529n1) obj;
        b.a(obj2);
        if (n1Var.isEmpty()) {
            return 0;
        }
        Iterator it = n1Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
