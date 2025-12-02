package C3;

import v3.l;

public abstract class n extends m {
    public static Long j(String str) {
        l.e(str, "<this>");
        return k(str, 10);
    }

    public static final Long k(String str, int i4) {
        boolean z4;
        String str2 = str;
        int i5 = i4;
        l.e(str2, "<this>");
        a.a(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str2.charAt(0);
        long j4 = -9223372036854775807L;
        if (l.f(charAt, 48) < 0) {
            z4 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z4 = false;
                i6 = 1;
            } else if (charAt != '-') {
                return null;
            } else {
                j4 = Long.MIN_VALUE;
                i6 = 1;
            }
        } else {
            z4 = false;
        }
        long j5 = -256204778801521550L;
        long j6 = 0;
        long j7 = -256204778801521550L;
        while (i6 < length) {
            int b4 = a.b(str2.charAt(i6), i5);
            if (b4 < 0) {
                return null;
            }
            if (j6 < j7) {
                if (j7 == j5) {
                    j7 = j4 / ((long) i5);
                    if (j6 < j7) {
                    }
                }
                return null;
            }
            long j8 = j6 * ((long) i5);
            long j9 = (long) b4;
            if (j8 < j4 + j9) {
                return null;
            }
            j6 = j8 - j9;
            i6++;
            j5 = -256204778801521550L;
        }
        return z4 ? Long.valueOf(j6) : Long.valueOf(-j6);
    }
}
