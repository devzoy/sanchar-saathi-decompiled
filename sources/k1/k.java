package K1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class k extends f implements List, RandomAccess {

    /* renamed from: f  reason: collision with root package name */
    public static final o f1693f = new h(m.f1694i, 0);

    public static k A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        l.a(objArr, 6);
        return B(objArr, 6);
    }

    public static k B(Object[] objArr, int i4) {
        return i4 == 0 ? m.f1694i : new m(objArr, i4);
    }

    public static k y() {
        return m.f1694i;
    }

    public static k z(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        l.a(objArr, 3);
        return B(objArr, 3);
    }

    /* renamed from: C */
    public final o listIterator(int i4) {
        w.c(i4, size(), "index");
        return isEmpty() ? f1693f : new h(this, i4);
    }

    public final void add(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i4 = 0;
                    while (i4 < size) {
                        if (v.a(get(i4), list.get(i4))) {
                            i4++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!v.a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = (i4 * 31) + get(i5).hashCode();
        }
        return i4;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (obj.equals(get(i4))) {
                return i4;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    public final Object remove(int i4) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    public int v(Object[] objArr, int i4) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i5] = get(i5);
        }
        return size;
    }

    public k w() {
        return size() <= 1 ? this : new i(this);
    }

    /* renamed from: x */
    public k subList(int i4, int i5) {
        w.d(i4, i5, size());
        int i6 = i5 - i4;
        return i6 == size() ? this : i6 == 0 ? m.f1694i : new j(this, i4, i6);
    }
}
