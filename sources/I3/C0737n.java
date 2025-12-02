package i3;

import j3.C0763b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import v3.g;
import v3.l;

/* renamed from: i3.n  reason: case insensitive filesystem */
public abstract class C0737n {
    public static List a(List list) {
        l.e(list, "builder");
        return ((C0763b) list).F();
    }

    public static final Object[] b(Object[] objArr, boolean z4) {
        l.e(objArr, "<this>");
        Class<Object[]> cls = Object[].class;
        if (z4 && l.a(objArr.getClass(), cls)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, cls);
        l.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static List c() {
        return new C0763b(0, 1, (g) null);
    }

    public static List d(Object obj) {
        List singletonList = Collections.singletonList(obj);
        l.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static Object[] e(int i4, Object[] objArr) {
        l.e(objArr, "array");
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
