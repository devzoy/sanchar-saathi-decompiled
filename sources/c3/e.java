package C3;

import u3.l;

public abstract class e {
    public static void a(Appendable appendable, Object obj, l lVar) {
        v3.l.e(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.i(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }
}
