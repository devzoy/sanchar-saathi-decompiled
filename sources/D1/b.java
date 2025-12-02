package D1;

import z1.C1031n;

public abstract class b {
    public static boolean a(int[] iArr, int i4) {
        if (iArr != null) {
            for (int i5 : iArr) {
                if (i5 == i4) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            } else if (!C1031n.a(objArr[i4], obj)) {
                i4++;
            } else if (i4 >= 0) {
                return true;
            }
        }
        return false;
    }
}
