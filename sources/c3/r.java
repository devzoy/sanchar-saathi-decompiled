package C3;

import java.util.NoSuchElementException;
import v3.l;
import z3.e;

public abstract class r extends q {
    public static final String Y(String str, int i4) {
        l.e(str, "<this>");
        if (i4 >= 0) {
            String substring = str.substring(e.c(i4, str.length()));
            l.d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    public static char Z(CharSequence charSequence) {
        l.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(p.A(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
