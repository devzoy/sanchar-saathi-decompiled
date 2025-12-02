package i3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import v3.l;
import z3.e;

/* renamed from: i3.l  reason: case insensitive filesystem */
public abstract class C0735l extends C0734k {
    public static Object A(Object[] objArr) {
        l.e(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static final List B(Object[] objArr, int i4) {
        l.e(objArr, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            return C0738o.h();
        } else {
            int length = objArr.length;
            if (i4 >= length) {
                return D(objArr);
            }
            if (i4 == 1) {
                return C0737n.d(objArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(objArr[i5]);
            }
            return arrayList;
        }
    }

    public static final Collection C(Object[] objArr, Collection collection) {
        l.e(objArr, "<this>");
        l.e(collection, "destination");
        for (Object add : objArr) {
            collection.add(add);
        }
        return collection;
    }

    public static final List D(Object[] objArr) {
        l.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? E(objArr) : C0737n.d(objArr[0]) : C0738o.h();
    }

    public static final List E(Object[] objArr) {
        l.e(objArr, "<this>");
        return new ArrayList(C0738o.g(objArr));
    }

    public static final Set F(Object[] objArr) {
        l.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) C(objArr, new LinkedHashSet(C0720D.d(objArr.length))) : C0722F.c(objArr[0]) : C0723G.d();
    }

    public static final boolean m(Object[] objArr, Object obj) {
        l.e(objArr, "<this>");
        return s(objArr, obj) >= 0;
    }

    public static List n(Object[] objArr, int i4) {
        l.e(objArr, "<this>");
        if (i4 >= 0) {
            return B(objArr, e.a(objArr.length - i4, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    public static List o(Object[] objArr) {
        l.e(objArr, "<this>");
        return (List) p(objArr, new ArrayList());
    }

    public static final Collection p(Object[] objArr, Collection collection) {
        l.e(objArr, "<this>");
        l.e(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static final int q(Object[] objArr) {
        l.e(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Object r(Object[] objArr, int i4) {
        l.e(objArr, "<this>");
        if (i4 < 0 || i4 >= objArr.length) {
            return null;
        }
        return objArr[i4];
    }

    public static final int s(Object[] objArr, Object obj) {
        l.e(objArr, "<this>");
        int i4 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i4 < length) {
                if (objArr[i4] == null) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i4 < length2) {
            if (l.a(obj, objArr[i4])) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static final Appendable t(byte[] bArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, u3.l lVar) {
        l.e(bArr, "<this>");
        l.e(appendable, "buffer");
        l.e(charSequence, "separator");
        l.e(charSequence2, "prefix");
        l.e(charSequence3, "postfix");
        l.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i5 = 0;
        for (byte b4 : bArr) {
            i5++;
            if (i5 > 1) {
                appendable.append(charSequence);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (lVar != null) {
                appendable.append((CharSequence) lVar.i(Byte.valueOf(b4)));
            } else {
                appendable.append(String.valueOf(b4));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final Appendable u(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, u3.l lVar) {
        l.e(objArr, "<this>");
        l.e(appendable, "buffer");
        l.e(charSequence, "separator");
        l.e(charSequence2, "prefix");
        l.e(charSequence3, "postfix");
        l.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i5 = 0;
        for (Object obj : objArr) {
            i5++;
            if (i5 > 1) {
                appendable.append(charSequence);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            C3.e.a(appendable, obj, lVar);
        }
        if (i4 >= 0 && i5 > i4) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String v(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, u3.l lVar) {
        l.e(bArr, "<this>");
        l.e(charSequence, "separator");
        l.e(charSequence2, "prefix");
        l.e(charSequence3, "postfix");
        l.e(charSequence4, "truncated");
        return ((StringBuilder) t(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i4, charSequence4, lVar)).toString();
    }

    public static final String w(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, u3.l lVar) {
        l.e(objArr, "<this>");
        l.e(charSequence, "separator");
        l.e(charSequence2, "prefix");
        l.e(charSequence3, "postfix");
        l.e(charSequence4, "truncated");
        return ((StringBuilder) u(objArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i4, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String x(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, u3.l lVar, int i5, Object obj) {
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
        return v(bArr, charSequence, charSequence6, charSequence5, i6, charSequence7, lVar);
    }

    public static /* synthetic */ String y(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, u3.l lVar, int i5, Object obj) {
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
        return w(objArr, charSequence, charSequence6, charSequence5, i6, charSequence7, lVar);
    }

    public static char z(char[] cArr) {
        l.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }
}
