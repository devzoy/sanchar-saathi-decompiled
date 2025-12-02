package com.google.android.gms.internal.vision;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.vision.i0  reason: case insensitive filesystem */
public final class C0513i0 implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C0507g0 g0Var = (C0507g0) obj;
        C0507g0 g0Var2 = (C0507g0) obj2;
        C0522l0 l0Var = (C0522l0) g0Var.iterator();
        C0522l0 l0Var2 = (C0522l0) g0Var2.iterator();
        while (l0Var.hasNext() && l0Var2.hasNext()) {
            int compare = Integer.compare(C0507g0.C(l0Var.a()), C0507g0.C(l0Var2.a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(g0Var.t(), g0Var2.t());
    }
}
