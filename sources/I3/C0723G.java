package i3;

import java.util.LinkedHashSet;
import java.util.Set;
import v3.l;

/* renamed from: i3.G  reason: case insensitive filesystem */
public abstract class C0723G extends C0722F {
    public static Set d() {
        return C0717A.f10287e;
    }

    public static Set e(Object... objArr) {
        l.e(objArr, "elements");
        return (Set) C0735l.C(objArr, new LinkedHashSet(C0720D.d(objArr.length)));
    }

    public static final Set f(Set set) {
        l.e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : C0722F.c(set.iterator().next()) : d();
    }

    public static Set g(Object... objArr) {
        l.e(objArr, "elements");
        return C0735l.F(objArr);
    }
}
