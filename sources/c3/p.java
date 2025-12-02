package C3;

import B3.b;
import B3.g;
import i3.C0735l;
import java.util.Iterator;
import java.util.List;
import v3.l;
import z3.c;
import z3.e;

public abstract class p extends o {

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CharSequence f547a;

        public a(CharSequence charSequence) {
            this.f547a = charSequence;
        }

        public Iterator iterator() {
            return new d(this.f547a);
        }
    }

    public static final int A(CharSequence charSequence) {
        l.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int B(CharSequence charSequence, char c4, int i4, boolean z4) {
        l.e(charSequence, "<this>");
        if (!z4 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c4, i4);
        }
        return H(charSequence, new char[]{c4}, i4, z4);
    }

    public static final int C(CharSequence charSequence, String str, int i4, boolean z4) {
        l.e(charSequence, "<this>");
        l.e(str, "string");
        if (!z4 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i4);
        }
        return E(charSequence, str, i4, charSequence.length(), z4, false, 16, (Object) null);
    }

    public static final int D(CharSequence charSequence, CharSequence charSequence2, int i4, int i5, boolean z4, boolean z5) {
        z3.a cVar = !z5 ? new c(e.a(i4, 0), e.c(i5, charSequence.length())) : e.f(e.c(i4, A(charSequence)), e.a(i5, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int s4 = cVar.s();
            int t4 = cVar.t();
            int u4 = cVar.u();
            if ((u4 <= 0 || s4 > t4) && (u4 >= 0 || t4 > s4)) {
                return -1;
            }
            while (true) {
                if (Q(charSequence2, 0, charSequence, s4, charSequence2.length(), z4)) {
                    return s4;
                }
                if (s4 == t4) {
                    return -1;
                }
                s4 += u4;
            }
        } else {
            int s5 = cVar.s();
            int t5 = cVar.t();
            int u5 = cVar.u();
            if ((u5 <= 0 || s5 > t5) && (u5 >= 0 || t5 > s5)) {
                return -1;
            }
            while (true) {
                String str = (String) charSequence2;
                if (o.p(str, 0, (String) charSequence, s5, str.length(), z4)) {
                    return s5;
                }
                if (s5 == t5) {
                    return -1;
                }
                s5 += u5;
            }
        }
    }

    public static /* synthetic */ int E(CharSequence charSequence, CharSequence charSequence2, int i4, int i5, boolean z4, boolean z5, int i6, Object obj) {
        if ((i6 & 16) != 0) {
            z5 = false;
        }
        return D(charSequence, charSequence2, i4, i5, z4, z5);
    }

    public static /* synthetic */ int F(CharSequence charSequence, char c4, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return B(charSequence, c4, i4, z4);
    }

    public static /* synthetic */ int G(CharSequence charSequence, String str, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return C(charSequence, str, i4, z4);
    }

    public static final int H(CharSequence charSequence, char[] cArr, int i4, boolean z4) {
        l.e(charSequence, "<this>");
        l.e(cArr, "chars");
        if (z4 || cArr.length != 1 || !(charSequence instanceof String)) {
            int a4 = e.a(i4, 0);
            int A4 = A(charSequence);
            if (a4 > A4) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(a4);
                for (char d4 : cArr) {
                    if (b.d(d4, charAt, z4)) {
                        return a4;
                    }
                }
                if (a4 == A4) {
                    return -1;
                }
                a4++;
            }
        } else {
            return ((String) charSequence).indexOf(C0735l.z(cArr), i4);
        }
    }

    public static boolean I(CharSequence charSequence) {
        l.e(charSequence, "<this>");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            if (!a.c(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static final int J(CharSequence charSequence, char c4, int i4, boolean z4) {
        l.e(charSequence, "<this>");
        if (!z4 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c4, i4);
        }
        return N(charSequence, new char[]{c4}, i4, z4);
    }

    public static final int K(CharSequence charSequence, String str, int i4, boolean z4) {
        l.e(charSequence, "<this>");
        l.e(str, "string");
        return (z4 || !(charSequence instanceof String)) ? D(charSequence, str, i4, 0, z4, true) : ((String) charSequence).lastIndexOf(str, i4);
    }

    public static /* synthetic */ int L(CharSequence charSequence, char c4, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = A(charSequence);
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return J(charSequence, c4, i4, z4);
    }

    public static /* synthetic */ int M(CharSequence charSequence, String str, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = A(charSequence);
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return K(charSequence, str, i4, z4);
    }

    public static final int N(CharSequence charSequence, char[] cArr, int i4, boolean z4) {
        l.e(charSequence, "<this>");
        l.e(cArr, "chars");
        if (z4 || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int c4 = e.c(i4, A(charSequence)); -1 < c4; c4--) {
                char charAt = charSequence.charAt(c4);
                for (char d4 : cArr) {
                    if (b.d(d4, charAt, z4)) {
                        return c4;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C0735l.z(cArr), i4);
    }

    public static final b O(CharSequence charSequence) {
        l.e(charSequence, "<this>");
        return new a(charSequence);
    }

    public static final List P(CharSequence charSequence) {
        l.e(charSequence, "<this>");
        return g.c(O(charSequence));
    }

    public static final boolean Q(CharSequence charSequence, int i4, CharSequence charSequence2, int i5, int i6, boolean z4) {
        l.e(charSequence, "<this>");
        l.e(charSequence2, "other");
        if (i5 < 0 || i4 < 0 || i4 > charSequence.length() - i6 || i5 > charSequence2.length() - i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (!b.d(charSequence.charAt(i4 + i7), charSequence2.charAt(i5 + i7), z4)) {
                return false;
            }
        }
        return true;
    }

    public static final String R(String str, char c4, String str2) {
        l.e(str, "<this>");
        l.e(str2, "missingDelimiterValue");
        int F4 = F(str, c4, 0, false, 6, (Object) null);
        if (F4 == -1) {
            return str2;
        }
        String substring = str.substring(F4 + 1, str.length());
        l.d(substring, "substring(...)");
        return substring;
    }

    public static final String S(String str, String str2, String str3) {
        l.e(str, "<this>");
        l.e(str2, "delimiter");
        l.e(str3, "missingDelimiterValue");
        int G4 = G(str, str2, 0, false, 6, (Object) null);
        if (G4 == -1) {
            return str3;
        }
        String substring = str.substring(G4 + str2.length(), str.length());
        l.d(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String T(String str, char c4, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return R(str, c4, str2);
    }

    public static /* synthetic */ String U(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return S(str, str2, str3);
    }

    public static String V(String str, char c4, String str2) {
        l.e(str, "<this>");
        l.e(str2, "missingDelimiterValue");
        int L4 = L(str, c4, 0, false, 6, (Object) null);
        if (L4 == -1) {
            return str2;
        }
        String substring = str.substring(L4 + 1, str.length());
        l.d(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String W(String str, char c4, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return V(str, c4, str2);
    }

    public static CharSequence X(CharSequence charSequence) {
        l.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i4 = 0;
        boolean z4 = false;
        while (i4 <= length) {
            boolean c4 = a.c(charSequence.charAt(!z4 ? i4 : length));
            if (!z4) {
                if (!c4) {
                    z4 = true;
                } else {
                    i4++;
                }
            } else if (!c4) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i4, length + 1);
    }

    public static final boolean w(CharSequence charSequence, char c4, boolean z4) {
        l.e(charSequence, "<this>");
        return F(charSequence, c4, 0, z4, 2, (Object) null) >= 0;
    }

    public static final boolean x(CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        l.e(charSequence, "<this>");
        l.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (G(charSequence, (String) charSequence2, 0, z4, 2, (Object) null) < 0) {
                return false;
            }
        } else {
            if (E(charSequence, charSequence2, 0, charSequence.length(), z4, false, 16, (Object) null) < 0) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean y(CharSequence charSequence, char c4, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return w(charSequence, c4, z4);
    }

    public static /* synthetic */ boolean z(CharSequence charSequence, CharSequence charSequence2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return x(charSequence, charSequence2, z4);
    }
}
