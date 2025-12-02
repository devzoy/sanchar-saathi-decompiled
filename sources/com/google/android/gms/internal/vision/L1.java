package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class L1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f7307a = F();

    /* renamed from: b  reason: collision with root package name */
    public static final C0486a2 f7308b = g(false);

    /* renamed from: c  reason: collision with root package name */
    public static final C0486a2 f7309c = g(true);

    /* renamed from: d  reason: collision with root package name */
    public static final C0486a2 f7310d = new C0494c2();

    public static int A(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0508g1) {
            C0508g1 g1Var = (C0508g1) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0551v0.j0(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static C0486a2 B() {
        return f7310d;
    }

    public static void C(int i4, List list, y2 y2Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            y2Var.p(i4, list, z4);
        }
    }

    public static int D(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * C0551v0.c0(i4));
    }

    public static int E(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof P0) {
            P0 p02 = (P0) list;
            i4 = 0;
            while (i5 < size) {
                i4 += C0551v0.x0(p02.t(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i4 + C0551v0.x0(((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i4;
    }

    public static Class F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void G(int i4, List list, y2 y2Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            y2Var.j(i4, list, z4);
        }
    }

    public static int H(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return I(list) + (size * C0551v0.c0(i4));
    }

    public static int I(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof P0) {
            P0 p02 = (P0) list;
            i4 = 0;
            while (i5 < size) {
                i4 += C0551v0.g0(p02.t(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i4 + C0551v0.g0(((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i4;
    }

    public static Class J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void K(int i4, List list, y2 y2Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            y2Var.g(i4, list, z4);
        }
    }

    public static int L(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return M(list) + (size * C0551v0.c0(i4));
    }

    public static int M(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof P0) {
            P0 p02 = (P0) list;
            i4 = 0;
            while (i5 < size) {
                i4 += C0551v0.k0(p02.t(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i4 + C0551v0.k0(((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i4;
    }

    public static void N(int i4, List list, y2 y2Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            y2Var.c(i4, list, z4);
        }
    }

    public static int O(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * C0551v0.c0(i4));
    }

    public static int P(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof P0) {
            P0 p02 = (P0) list;
            i4 = 0;
            while (i5 < size) {
                i4 += C0551v0.o0(p02.t(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i4 + C0551v0.o0(((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i4;
    }

    public static void Q(int i4, List list, y2 y2Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            y2Var.t(i4, list, z4);
        }
    }

    public static int R(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C0551v0.t0(i4, 0);
    }

    public static int S(List list) {
        return list.size() << 2;
    }

    public static void T(int i4, List list, y2 y2Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            y2Var.i(i4, list, z4);
        }
    }

    public static int U(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C0551v0.m0(i4, 0);
    }

    public static int V(List list) {
        return list.size() << 3;
    }

    public static void W(int i4, List list, y2 y2Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            y2Var.x(i4, list, z4);
        }
    }

    public static int X(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C0551v0.D(i4, true);
    }

    public static int Y(List list) {
        return list.size();
    }

    public static void Z(int i4, List list, y2 y2Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            y2Var.l(i4, list, z4);
        }
    }

    public static int a(int i4, Object obj, K1 k12) {
        return C0551v0.B(i4, (C0546t1) obj, k12);
    }

    public static void a0(int i4, List list, y2 y2Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            y2Var.u(i4, list, z4);
        }
    }

    public static int b(int i4, List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int c02 = C0551v0.c0(i4) * size;
        if (list instanceof C0497d1) {
            C0497d1 d1Var = (C0497d1) list;
            while (i5 < size) {
                Object f4 = d1Var.f(i5);
                c02 += f4 instanceof C0507g0 ? C0551v0.E((C0507g0) f4) : C0551v0.G((String) f4);
                i5++;
            }
        } else {
            while (i5 < size) {
                Object obj = list.get(i5);
                c02 += obj instanceof C0507g0 ? C0551v0.E((C0507g0) obj) : C0551v0.G((String) obj);
                i5++;
            }
        }
        return c02;
    }

    public static void b0(int i4, List list, y2 y2Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            y2Var.z(i4, list, z4);
        }
    }

    public static int c(int i4, List list, K1 k12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int c02 = C0551v0.c0(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            c02 += C0551v0.c((C0546t1) list.get(i5), k12);
        }
        return c02;
    }

    public static void c0(int i4, List list, y2 y2Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            y2Var.k(i4, list, z4);
        }
    }

    public static int d(int i4, List list, boolean z4) {
        if (list.size() == 0) {
            return 0;
        }
        return e(list) + (list.size() * C0551v0.c0(i4));
    }

    public static void d0(int i4, List list, y2 y2Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            y2Var.d(i4, list, z4);
        }
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0508g1) {
            C0508g1 g1Var = (C0508g1) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0551v0.Z(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static C0486a2 f() {
        return f7308b;
    }

    public static C0486a2 g(boolean z4) {
        try {
            Class J4 = J();
            if (J4 == null) {
                return null;
            }
            return (C0486a2) J4.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z4)});
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object h(int i4, int i5, Object obj, C0486a2 a2Var) {
        if (obj == null) {
            obj = a2Var.a();
        }
        a2Var.b(obj, i4, (long) i5);
        return obj;
    }

    public static Object i(int i4, List list, S0 s02, Object obj, C0486a2 a2Var) {
        if (s02 == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Integer num = (Integer) list.get(i6);
                int intValue = num.intValue();
                if (s02.b(intValue)) {
                    if (i6 != i5) {
                        list.set(i5, num);
                    }
                    i5++;
                } else {
                    obj = h(i4, intValue, obj, a2Var);
                }
            }
            if (i5 != size) {
                list.subList(i5, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!s02.b(intValue2)) {
                    obj = h(i4, intValue2, obj, a2Var);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static void j(int i4, List list, y2 y2Var) {
        if (list != null && !list.isEmpty()) {
            y2Var.A(i4, list);
        }
    }

    public static void k(int i4, List list, y2 y2Var, K1 k12) {
        if (list != null && !list.isEmpty()) {
            y2Var.O(i4, list, k12);
        }
    }

    public static void l(int i4, List list, y2 y2Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            y2Var.q(i4, list, z4);
        }
    }

    public static void m(C0 c02, Object obj, Object obj2) {
        F0 b4 = c02.b(obj2);
        if (!b4.f7218a.isEmpty()) {
            c02.e(obj).c(b4);
        }
    }

    public static void n(C0538q1 q1Var, Object obj, Object obj2, long j4) {
        h2.j(obj, j4, q1Var.e(h2.F(obj, j4), h2.F(obj2, j4)));
    }

    public static void o(C0486a2 a2Var, Object obj, Object obj2) {
        a2Var.e(obj, a2Var.i(a2Var.f(obj), a2Var.f(obj2)));
    }

    public static void p(Class cls) {
        Class cls2;
        if (!N0.class.isAssignableFrom(cls) && (cls2 = f7307a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int r(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int c02 = size * C0551v0.c0(i4);
        for (int i5 = 0; i5 < list.size(); i5++) {
            c02 += C0551v0.E((C0507g0) list.get(i5));
        }
        return c02;
    }

    public static int s(int i4, List list, K1 k12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += C0551v0.Q(i4, (C0546t1) list.get(i6), k12);
        }
        return i5;
    }

    public static int t(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u(list) + (size * C0551v0.c0(i4));
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0508g1) {
            C0508g1 g1Var = (C0508g1) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0551v0.e0(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static C0486a2 v() {
        return f7309c;
    }

    public static void w(int i4, List list, y2 y2Var) {
        if (list != null && !list.isEmpty()) {
            y2Var.r(i4, list);
        }
    }

    public static void x(int i4, List list, y2 y2Var, K1 k12) {
        if (list != null && !list.isEmpty()) {
            y2Var.J(i4, list, k12);
        }
    }

    public static void y(int i4, List list, y2 y2Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            y2Var.v(i4, list, z4);
        }
    }

    public static int z(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A(list) + (size * C0551v0.c0(i4));
    }
}
