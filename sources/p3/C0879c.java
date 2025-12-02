package p3;

/* renamed from: p3.c  reason: case insensitive filesystem */
public abstract class C0879c {
    public static final int a(int i4, int i5, int i6) {
        return c(c(i4, i6) - c(i5, i6), i6);
    }

    public static final int b(int i4, int i5, int i6) {
        if (i6 > 0) {
            return i4 >= i5 ? i5 : i5 - a(i5, i4, i6);
        }
        if (i6 < 0) {
            return i4 <= i5 ? i5 : i5 + a(i4, i5, -i6);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final int c(int i4, int i5) {
        int i6 = i4 % i5;
        return i6 >= 0 ? i6 : i6 + i5;
    }
}
