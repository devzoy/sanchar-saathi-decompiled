package i3;

import C3.e;
import h3.C0670k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import u3.l;

/* renamed from: i3.w  reason: case insensitive filesystem */
public abstract class C0746w extends C0745v {
    public static /* synthetic */ String A(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i5 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i5 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        return z(iterable, charSequence, charSequence6, charSequence5, i6, charSequence7, lVar);
    }

    public static Object B(List list) {
        v3.l.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C0738o.i(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Comparable C(Iterable iterable) {
        v3.l.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List D(Collection collection, Iterable iterable) {
        v3.l.e(collection, "<this>");
        v3.l.e(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C0743t.p(arrayList2, iterable);
        return arrayList2;
    }

    public static List E(Iterable iterable) {
        v3.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return I(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C0734k.k((Comparable[]) array);
            return C0734k.c(array);
        }
        List J4 = J(iterable);
        C0742s.n(J4);
        return J4;
    }

    public static List F(Iterable iterable, Comparator comparator) {
        v3.l.e(iterable, "<this>");
        v3.l.e(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return I(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            C0734k.l(array, comparator);
            return C0734k.c(array);
        }
        List J4 = J(iterable);
        C0742s.o(J4, comparator);
        return J4;
    }

    public static final Collection G(Iterable iterable, Collection collection) {
        v3.l.e(iterable, "<this>");
        v3.l.e(collection, "destination");
        for (Object add : iterable) {
            collection.add(add);
        }
        return collection;
    }

    public static int[] H(Collection collection) {
        v3.l.e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            iArr[i4] = ((Number) it.next()).intValue();
            i4++;
        }
        return iArr;
    }

    public static List I(Iterable iterable) {
        v3.l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C0738o.k(J(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C0738o.h();
        }
        if (size != 1) {
            return K(collection);
        }
        return C0737n.d(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final List J(Iterable iterable) {
        v3.l.e(iterable, "<this>");
        return iterable instanceof Collection ? K((Collection) iterable) : (List) G(iterable, new ArrayList());
    }

    public static List K(Collection collection) {
        v3.l.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set L(Iterable iterable) {
        v3.l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C0723G.f((Set) G(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C0723G.d();
        }
        if (size != 1) {
            return (Set) G(iterable, new LinkedHashSet(C0720D.d(collection.size())));
        }
        return C0722F.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static List M(Iterable iterable, Iterable iterable2) {
        v3.l.e(iterable, "<this>");
        v3.l.e(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C0739p.m(iterable, 10), C0739p.m(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C0670k.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static boolean t(Iterable iterable, Object obj) {
        v3.l.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : w(iterable, obj) >= 0;
    }

    public static Object u(List list) {
        v3.l.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object v(List list) {
        v3.l.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final int w(Iterable iterable, Object obj) {
        v3.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i4 = 0;
        for (Object next : iterable) {
            if (i4 < 0) {
                C0738o.l();
            }
            if (v3.l.a(obj, next)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static final Appendable x(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar) {
        v3.l.e(iterable, "<this>");
        v3.l.e(appendable, "buffer");
        v3.l.e(charSequence, "separator");
        v3.l.e(charSequence2, "prefix");
        v3.l.e(charSequence3, "postfix");
        v3.l.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i5 = 0;
        for (Object next : iterable) {
            i5++;
            if (i5 > 1) {
                appendable.append(charSequence);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            e.a(appendable, next, lVar);
        }
        if (i4 >= 0 && i5 > i4) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static /* synthetic */ Appendable y(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar, int i5, Object obj) {
        String str = (i5 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i5 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i5 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return x(iterable, appendable, str, charSequence6, charSequence5, (i5 & 16) != 0 ? -1 : i4, (i5 & 32) != 0 ? "..." : charSequence4, (i5 & 64) != 0 ? null : lVar);
    }

    public static final String z(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar) {
        v3.l.e(iterable, "<this>");
        v3.l.e(charSequence, "separator");
        v3.l.e(charSequence2, "prefix");
        v3.l.e(charSequence3, "postfix");
        v3.l.e(charSequence4, "truncated");
        return ((StringBuilder) x(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i4, charSequence4, lVar)).toString();
    }
}
