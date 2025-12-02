package i3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import v3.l;

/* renamed from: i3.o  reason: case insensitive filesystem */
public abstract class C0738o extends C0737n {
    public static ArrayList f(Object... objArr) {
        l.e(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0730g(objArr, true));
    }

    public static final Collection g(Object[] objArr) {
        l.e(objArr, "<this>");
        return new C0730g(objArr, false);
    }

    public static List h() {
        return C0748y.f10304e;
    }

    public static int i(List list) {
        l.e(list, "<this>");
        return list.size() - 1;
    }

    public static List j(Object... objArr) {
        l.e(objArr, "elements");
        return objArr.length > 0 ? C0734k.c(objArr) : h();
    }

    public static final List k(List list) {
        l.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C0737n.d(list.get(0)) : h();
    }

    public static void l() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
