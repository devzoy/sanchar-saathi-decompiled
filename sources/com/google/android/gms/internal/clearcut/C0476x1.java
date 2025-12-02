package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.clearcut.x1  reason: case insensitive filesystem */
public abstract class C0476x1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f7178a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f7179b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final Object f7180c = new Object();

    public static boolean a(int[] iArr, int[] iArr2) {
        return (iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2);
    }

    public static boolean b(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= length || objArr[i4] != null) {
                while (i5 < length2 && objArr2[i5] == null) {
                    i5++;
                }
                boolean z4 = i4 >= length;
                boolean z5 = i5 >= length2;
                if (z4 && z5) {
                    return true;
                }
                if (z4 != z5 || !objArr[i4].equals(objArr2[i5])) {
                    return false;
                }
                i4++;
                i5++;
            } else {
                i4++;
            }
        }
    }

    public static int c(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(iArr);
    }

    public static int d(Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            Object obj = objArr[i5];
            if (obj != null) {
                i4 = (i4 * 31) + obj.hashCode();
            }
        }
        return i4;
    }

    public static void e(C0473w1 w1Var, C0473w1 w1Var2) {
        w1Var.getClass();
    }
}
