package i3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import v3.l;

/* renamed from: i3.k  reason: case insensitive filesystem */
public abstract class C0734k extends C0733j {
    public static final List c(Object[] objArr) {
        l.e(objArr, "<this>");
        List a4 = C0736m.a(objArr);
        l.d(a4, "asList(...)");
        return a4;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, int i4, int i5, int i6) {
        l.e(bArr, "<this>");
        l.e(bArr2, "destination");
        System.arraycopy(bArr, i5, bArr2, i4, i6 - i5);
        return bArr2;
    }

    public static Object[] e(Object[] objArr, Object[] objArr2, int i4, int i5, int i6) {
        l.e(objArr, "<this>");
        l.e(objArr2, "destination");
        System.arraycopy(objArr, i5, objArr2, i4, i6 - i5);
        return objArr2;
    }

    public static /* synthetic */ byte[] f(byte[] bArr, byte[] bArr2, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = bArr.length;
        }
        return d(bArr, bArr2, i4, i5, i6);
    }

    public static /* synthetic */ Object[] g(Object[] objArr, Object[] objArr2, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = objArr.length;
        }
        return e(objArr, objArr2, i4, i5, i6);
    }

    public static byte[] h(byte[] bArr, int i4, int i5) {
        l.e(bArr, "<this>");
        C0732i.b(i5, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i4, i5);
        l.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] i(Object[] objArr, int i4, int i5) {
        l.e(objArr, "<this>");
        C0732i.b(i5, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i4, i5);
        l.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static final void j(Object[] objArr, Object obj, int i4, int i5) {
        l.e(objArr, "<this>");
        Arrays.fill(objArr, i4, i5, obj);
    }

    public static final void k(Object[] objArr) {
        l.e(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static final void l(Object[] objArr, Comparator comparator) {
        l.e(objArr, "<this>");
        l.e(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }
}
