package C3;

import i3.C0738o;
import i3.C0739p;
import i3.C0746w;
import java.util.ArrayList;
import java.util.List;
import u3.l;

public abstract class h extends e {
    public static final l d(String str) {
        return str.length() == 0 ? new f() : new g(str);
    }

    public static final String e(String str) {
        v3.l.e(str, "line");
        return str;
    }

    public static final String f(String str, String str2) {
        v3.l.e(str2, "line");
        return str + str2;
    }

    public static final int g(String str) {
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            } else if (!a.c(str.charAt(i4))) {
                break;
            } else {
                i4++;
            }
        }
        return i4 == -1 ? str.length() : i4;
    }

    public static final String h(String str, String str2) {
        String str3;
        v3.l.e(str, "<this>");
        v3.l.e(str2, "newIndent");
        List P4 = p.P(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object next : P4) {
            if (!p.I((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C0739p.m(arrayList, 10));
        for (String g4 : arrayList) {
            arrayList2.add(Integer.valueOf(g(g4)));
        }
        Integer num = (Integer) C0746w.C(arrayList2);
        int i4 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * P4.size());
        l d4 = d(str2);
        int i5 = C0738o.i(P4);
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : P4) {
            int i6 = i4 + 1;
            if (i4 < 0) {
                C0738o.l();
            }
            String str4 = (String) next2;
            if ((i4 == 0 || i4 == i5) && p.I(str4)) {
                str4 = null;
            } else {
                String Y3 = r.Y(str4, intValue);
                if (!(Y3 == null || (str3 = (String) d4.i(Y3)) == null)) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i4 = i6;
        }
        return ((StringBuilder) C0746w.y(arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 124, (Object) null)).toString();
    }

    public static String i(String str) {
        v3.l.e(str, "<this>");
        return h(str, "");
    }
}
