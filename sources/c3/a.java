package C3;

import z3.c;

public abstract class a {
    public static int a(int i4) {
        if (2 <= i4 && i4 < 37) {
            return i4;
        }
        throw new IllegalArgumentException("radix " + i4 + " was not in valid range " + new c(2, 36));
    }

    public static final int b(char c4, int i4) {
        return Character.digit(c4, i4);
    }

    public static final boolean c(char c4) {
        return Character.isWhitespace(c4) || Character.isSpaceChar(c4);
    }
}
