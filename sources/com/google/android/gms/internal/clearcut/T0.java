package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class T0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f6901a = C();

    /* renamed from: b  reason: collision with root package name */
    public static final Y0 f6902b = w(false);

    /* renamed from: c  reason: collision with root package name */
    public static final Y0 f6903c = w(true);

    /* renamed from: d  reason: collision with root package name */
    public static final Y0 f6904d = new C0408a1();

    public static Y0 A() {
        return f6903c;
    }

    public static Y0 B() {
        return f6904d;
    }

    public static Class C() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int E(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0410b0) {
            C0410b0 b0Var = (C0410b0) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += K.w0(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static void F(int i4, List list, C0464t1 t1Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            t1Var.g(i4, list, z4);
        }
    }

    public static int G(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0410b0) {
            C0410b0 b0Var = (C0410b0) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += K.x0(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static void H(int i4, List list, C0464t1 t1Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            t1Var.c(i4, list, z4);
        }
    }

    public static void I(Class cls) {
        Class cls2;
        if (!C0407a0.class.isAssignableFrom(cls) && (cls2 = f6901a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static int J(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0410b0) {
            C0410b0 b0Var = (C0410b0) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += K.y0(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static void K(int i4, List list, C0464t1 t1Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            t1Var.t(i4, list, z4);
        }
    }

    public static int L(List list) {
        return list.size() << 2;
    }

    public static void M(int i4, List list, C0464t1 t1Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            t1Var.i(i4, list, z4);
        }
    }

    public static int N(List list) {
        return list.size() << 3;
    }

    public static void O(int i4, List list, C0464t1 t1Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            t1Var.x(i4, list, z4);
        }
    }

    public static int P(List list) {
        return list.size();
    }

    public static void Q(int i4, List list, C0464t1 t1Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            t1Var.l(i4, list, z4);
        }
    }

    public static void R(int i4, List list, C0464t1 t1Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            t1Var.u(i4, list, z4);
        }
    }

    public static void S(int i4, List list, C0464t1 t1Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            t1Var.z(i4, list, z4);
        }
    }

    public static void T(int i4, List list, C0464t1 t1Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            t1Var.k(i4, list, z4);
        }
    }

    public static void U(int i4, List list, C0464t1 t1Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            t1Var.d(i4, list, z4);
        }
    }

    public static int V(int i4, List list, boolean z4) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * K.v0(i4));
    }

    public static int W(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j(list) + (size * K.v0(i4));
    }

    public static int X(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return q(list) + (size * K.v0(i4));
    }

    public static int Y(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return v(list) + (size * K.v0(i4));
    }

    public static int Z(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * K.v0(i4));
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0452p0) {
            C0452p0 p0Var = (C0452p0) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += K.Y(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static int a0(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * K.v0(i4));
    }

    public static Object b(int i4, int i5, Object obj, Y0 y02) {
        if (obj == null) {
            obj = y02.f();
        }
        y02.a(obj, i4, (long) i5);
        return obj;
    }

    public static int b0(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return J(list) + (size * K.v0(i4));
    }

    public static Object c(int i4, List list, C0419e0 e0Var, Object obj, Y0 y02) {
        if (e0Var == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Integer num = (Integer) list.get(i6);
                int intValue = num.intValue();
                if (e0Var.f(intValue) != null) {
                    if (i6 != i5) {
                        list.set(i5, num);
                    }
                    i5++;
                } else {
                    obj = b(i4, intValue, obj, y02);
                }
            }
            if (i5 != size) {
                list.subList(i5, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (e0Var.f(intValue2) == null) {
                    obj = b(i4, intValue2, obj, y02);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static int c0(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * K.n0(i4, 0);
    }

    public static void d(int i4, List list, C0464t1 t1Var) {
        if (list != null && !list.isEmpty()) {
            t1Var.A(i4, list);
        }
    }

    public static int d0(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * K.e0(i4, 0);
    }

    public static void e(int i4, List list, C0464t1 t1Var, R0 r02) {
        if (list != null && !list.isEmpty()) {
            t1Var.N(i4, list, r02);
        }
    }

    public static int e0(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * K.N(i4, true);
    }

    public static void f(int i4, List list, C0464t1 t1Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            t1Var.q(i4, list, z4);
        }
    }

    public static void g(P p4, Object obj, Object obj2) {
        U b4 = p4.b(obj2);
        if (!b4.b()) {
            p4.e(obj).f(b4);
        }
    }

    public static void h(C0472w0 w0Var, Object obj, Object obj2, long j4) {
        C0423f1.i(obj, j4, w0Var.f(C0423f1.M(obj, j4), C0423f1.M(obj2, j4)));
    }

    public static void i(Y0 y02, Object obj, Object obj2) {
        y02.g(obj, y02.i(y02.k(obj), y02.k(obj2)));
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0452p0) {
            C0452p0 p0Var = (C0452p0) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += K.b0(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static void k(int i4, List list, C0464t1 t1Var) {
        if (list != null && !list.isEmpty()) {
            t1Var.r(i4, list);
        }
    }

    public static void l(int i4, List list, C0464t1 t1Var, R0 r02) {
        if (list != null && !list.isEmpty()) {
            t1Var.I(i4, list, r02);
        }
    }

    public static void m(int i4, List list, C0464t1 t1Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            t1Var.v(i4, list, z4);
        }
    }

    public static int n(int i4, Object obj, R0 r02) {
        return K.y(i4, (B0) obj, r02);
    }

    public static int o(int i4, List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int v02 = K.v0(i4) * size;
        if (list instanceof C0437k0) {
            C0437k0 k0Var = (C0437k0) list;
            while (i5 < size) {
                Object g4 = k0Var.g(i5);
                v02 += g4 instanceof C0477y ? K.A((C0477y) g4) : K.k0((String) g4);
                i5++;
            }
        } else {
            while (i5 < size) {
                Object obj = list.get(i5);
                v02 += obj instanceof C0477y ? K.A((C0477y) obj) : K.k0((String) obj);
                i5++;
            }
        }
        return v02;
    }

    public static int p(int i4, List list, R0 r02) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v02 = K.v0(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            v02 += K.B((B0) list.get(i5), r02);
        }
        return v02;
    }

    public static int q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0452p0) {
            C0452p0 p0Var = (C0452p0) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += K.f0(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static void r(int i4, List list, C0464t1 t1Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            t1Var.p(i4, list, z4);
        }
    }

    public static boolean s(int i4, int i5, int i6) {
        if (i5 < 40) {
            return true;
        }
        long j4 = ((long) i5) - ((long) i4);
        long j5 = (long) i6;
        return j4 + 10 <= ((2 * j5) + 3) + ((j5 + 3) * 3);
    }

    public static int t(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v02 = size * K.v0(i4);
        for (int i5 = 0; i5 < list.size(); i5++) {
            v02 += K.A((C0477y) list.get(i5));
        }
        return v02;
    }

    public static int u(int i4, List list, R0 r02) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += K.M(i4, (B0) list.get(i6), r02);
        }
        return i5;
    }

    public static int v(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0410b0) {
            C0410b0 b0Var = (C0410b0) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += K.B0(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static Y0 w(boolean z4) {
        try {
            Class D4 = D();
            if (D4 == null) {
                return null;
            }
            return (Y0) D4.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z4)});
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void x(int i4, List list, C0464t1 t1Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            t1Var.j(i4, list, z4);
        }
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Y0 z() {
        return f6902b;
    }
}
