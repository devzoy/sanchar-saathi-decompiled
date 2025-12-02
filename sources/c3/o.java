package C3;

import v3.l;
import z3.e;

public abstract class o extends n {
    public static String l(char[] cArr) {
        l.e(cArr, "<this>");
        return new String(cArr);
    }

    public static boolean m(String str, String str2, boolean z4) {
        l.e(str, "<this>");
        l.e(str2, "suffix");
        if (!z4) {
            return str.endsWith(str2);
        }
        return p(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean n(String str, String str2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return m(str, str2, z4);
    }

    public static boolean o(String str, String str2, boolean z4) {
        return str == null ? str2 == null : !z4 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final boolean p(String str, int i4, String str2, int i5, int i6, boolean z4) {
        l.e(str, "<this>");
        l.e(str2, "other");
        return !z4 ? str.regionMatches(i4, str2, i5, i6) : str.regionMatches(z4, i4, str2, i5, i6);
    }

    public static final String q(String str, char c4, char c5, boolean z4) {
        l.e(str, "<this>");
        if (!z4) {
            String replace = str.replace(c4, c5);
            l.d(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (b.d(charAt, c4, z4)) {
                charAt = c5;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static final String r(String str, String str2, String str3, boolean z4) {
        l.e(str, "<this>");
        l.e(str2, "oldValue");
        l.e(str3, "newValue");
        int i4 = 0;
        int C4 = p.C(str, str2, 0, z4);
        if (C4 < 0) {
            return str;
        }
        int length = str2.length();
        int a4 = e.a(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i4, C4);
                sb.append(str3);
                i4 = C4 + length;
                if (C4 >= str.length() || (C4 = p.C(str, str2, C4 + a4, z4)) <= 0) {
                    sb.append(str, i4, str.length());
                    String sb2 = sb.toString();
                    l.d(sb2, "toString(...)");
                }
                sb.append(str, i4, C4);
                sb.append(str3);
                i4 = C4 + length;
                break;
            } while ((C4 = p.C(str, str2, C4 + a4, z4)) <= 0);
            sb.append(str, i4, str.length());
            String sb22 = sb.toString();
            l.d(sb22, "toString(...)");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String s(String str, char c4, char c5, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return q(str, c4, c5, z4);
    }

    public static /* synthetic */ String t(String str, String str2, String str3, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return r(str, str2, str3, z4);
    }

    public static final boolean u(String str, String str2, boolean z4) {
        l.e(str, "<this>");
        l.e(str2, "prefix");
        if (!z4) {
            return str.startsWith(str2);
        }
        return p(str, 0, str2, 0, str2.length(), z4);
    }

    public static /* synthetic */ boolean v(String str, String str2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return u(str, str2, z4);
    }
}
