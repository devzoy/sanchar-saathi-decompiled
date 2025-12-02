package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0372y;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f5126a = A();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f5127b = B();

    /* renamed from: c  reason: collision with root package name */
    public static final m0 f5128c = new o0();

    public static Class A() {
        if (b0.f5079d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static m0 B() {
        try {
            Class C4 = C();
            if (C4 == null) {
                return null;
            }
            return (m0) C4.getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class C() {
        if (b0.f5079d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D(C0364p pVar, Object obj, Object obj2) {
        C0366s c4 = pVar.c(obj2);
        if (!c4.j()) {
            pVar.d(obj).p(c4);
        }
    }

    public static void E(K k4, Object obj, Object obj2, long j4) {
        p0.O(obj, j4, k4.a(p0.z(obj, j4), p0.z(obj2, j4)));
    }

    public static void F(m0 m0Var, Object obj, Object obj2) {
        m0Var.p(obj, m0Var.k(m0Var.g(obj), m0Var.g(obj2)));
    }

    public static void G(Class cls) {
        Class cls2;
        if (!C0370w.class.isAssignableFrom(cls) && !b0.f5079d && (cls2 = f5126a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean H(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Object I(Object obj, int i4, int i5, Object obj2, m0 m0Var) {
        if (obj2 == null) {
            obj2 = m0Var.f(obj);
        }
        m0Var.e(obj2, i4, (long) i5);
        return obj2;
    }

    public static m0 J() {
        return f5127b;
    }

    public static m0 K() {
        return f5128c;
    }

    public static void L(int i4, List list, s0 s0Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            s0Var.t(i4, list, z4);
        }
    }

    public static void M(int i4, List list, s0 s0Var) {
        if (list != null && !list.isEmpty()) {
            s0Var.N(i4, list);
        }
    }

    public static void N(int i4, List list, s0 s0Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            s0Var.K(i4, list, z4);
        }
    }

    public static void O(int i4, List list, s0 s0Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            s0Var.J(i4, list, z4);
        }
    }

    public static void P(int i4, List list, s0 s0Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            s0Var.q(i4, list, z4);
        }
    }

    public static void Q(int i4, List list, s0 s0Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            s0Var.j(i4, list, z4);
        }
    }

    public static void R(int i4, List list, s0 s0Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            s0Var.b(i4, list, z4);
        }
    }

    public static void S(int i4, List list, s0 s0Var, f0 f0Var) {
        if (list != null && !list.isEmpty()) {
            s0Var.C(i4, list, f0Var);
        }
    }

    public static void T(int i4, List list, s0 s0Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            s0Var.a(i4, list, z4);
        }
    }

    public static void U(int i4, List list, s0 s0Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            s0Var.I(i4, list, z4);
        }
    }

    public static void V(int i4, List list, s0 s0Var, f0 f0Var) {
        if (list != null && !list.isEmpty()) {
            s0Var.y(i4, list, f0Var);
        }
    }

    public static void W(int i4, List list, s0 s0Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            s0Var.k(i4, list, z4);
        }
    }

    public static void X(int i4, List list, s0 s0Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            s0Var.p(i4, list, z4);
        }
    }

    public static void Y(int i4, List list, s0 s0Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            s0Var.F(i4, list, z4);
        }
    }

    public static void Z(int i4, List list, s0 s0Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            s0Var.v(i4, list, z4);
        }
    }

    public static int a(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z4 ? C0358j.O(i4) + C0358j.y(size) : size * C0358j.c(i4, true);
    }

    public static void a0(int i4, List list, s0 s0Var) {
        if (list != null && !list.isEmpty()) {
            s0Var.B(i4, list);
        }
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i4, List list, s0 s0Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            s0Var.u(i4, list, z4);
        }
    }

    public static int c(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O4 = size * C0358j.O(i4);
        for (int i5 = 0; i5 < list.size(); i5++) {
            O4 += C0358j.g((C0355g) list.get(i5));
        }
        return O4;
    }

    public static void c0(int i4, List list, s0 s0Var, boolean z4) {
        if (list != null && !list.isEmpty()) {
            s0Var.r(i4, list, z4);
        }
    }

    public static int d(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e4 = e(list);
        return z4 ? C0358j.O(i4) + C0358j.y(e4) : e4 + (size * C0358j.O(i4));
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0371x) {
            C0371x xVar = (C0371x) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0358j.k(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static int f(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z4 ? C0358j.O(i4) + C0358j.y(size * 4) : size * C0358j.l(i4, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z4 ? C0358j.O(i4) + C0358j.y(size * 8) : size * C0358j.n(i4, 0);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i4, List list, f0 f0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += C0358j.r(i4, (P) list.get(i6), f0Var);
        }
        return i5;
    }

    public static int k(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l4 = l(list);
        return z4 ? C0358j.O(i4) + C0358j.y(l4) : l4 + (size * C0358j.O(i4));
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0371x) {
            C0371x xVar = (C0371x) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0358j.v(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static int m(int i4, List list, boolean z4) {
        if (list.size() == 0) {
            return 0;
        }
        int n4 = n(list);
        return z4 ? C0358j.O(i4) + C0358j.y(n4) : n4 + (list.size() * C0358j.O(i4));
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g4 = (G) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0358j.x(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static int o(int i4, Object obj, f0 f0Var) {
        return C0358j.z(i4, (P) obj, f0Var);
    }

    public static int p(int i4, List list, f0 f0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O4 = C0358j.O(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            O4 += C0358j.B((P) list.get(i5), f0Var);
        }
        return O4;
    }

    public static int q(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r4 = r(list);
        return z4 ? C0358j.O(i4) + C0358j.y(r4) : r4 + (size * C0358j.O(i4));
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0371x) {
            C0371x xVar = (C0371x) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0358j.J(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static int s(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t4 = t(list);
        return z4 ? C0358j.O(i4) + C0358j.y(t4) : t4 + (size * C0358j.O(i4));
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g4 = (G) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0358j.L(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static int u(int i4, List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int O4 = C0358j.O(i4) * size;
        if (list instanceof C) {
            C c4 = (C) list;
            while (i5 < size) {
                Object g4 = c4.g(i5);
                O4 += g4 instanceof C0355g ? C0358j.g((C0355g) g4) : C0358j.N((String) g4);
                i5++;
            }
        } else {
            while (i5 < size) {
                Object obj = list.get(i5);
                O4 += obj instanceof C0355g ? C0358j.g((C0355g) obj) : C0358j.N((String) obj);
                i5++;
            }
        }
        return O4;
    }

    public static int v(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w4 = w(list);
        return z4 ? C0358j.O(i4) + C0358j.y(w4) : w4 + (size * C0358j.O(i4));
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0371x) {
            C0371x xVar = (C0371x) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0358j.Q(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static int x(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y4 = y(list);
        return z4 ? C0358j.O(i4) + C0358j.y(y4) : y4 + (size * C0358j.O(i4));
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g4 = (G) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0358j.S(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static Object z(Object obj, int i4, List list, C0372y.a aVar, Object obj2, m0 m0Var) {
        if (aVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Integer num = (Integer) list.get(i6);
                int intValue = num.intValue();
                if (aVar.a(intValue)) {
                    if (i6 != i5) {
                        list.set(i5, num);
                    }
                    i5++;
                } else {
                    obj2 = I(obj, i4, intValue, obj2, m0Var);
                }
            }
            if (i5 != size) {
                list.subList(i5, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!aVar.a(intValue2)) {
                    obj2 = I(obj, i4, intValue2, obj2, m0Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }
}
