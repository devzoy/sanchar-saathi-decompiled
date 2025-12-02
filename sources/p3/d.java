package P3;

import O3.w;
import v3.l;

public abstract class d {
    public static final int a(int[] iArr, int i4, int i5, int i6) {
        l.e(iArr, "<this>");
        int i7 = i6 - 1;
        while (i5 <= i7) {
            int i8 = (i5 + i7) >>> 1;
            int i9 = iArr[i8];
            if (i9 < i4) {
                i5 = i8 + 1;
            } else if (i9 <= i4) {
                return i8;
            } else {
                i7 = i8 - 1;
            }
        }
        return (-i5) - 1;
    }

    public static final int b(w wVar, int i4) {
        l.e(wVar, "<this>");
        int a4 = a(wVar.I(), i4 + 1, 0, wVar.J().length);
        return a4 >= 0 ? a4 : ~a4;
    }
}
