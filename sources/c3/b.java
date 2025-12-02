package C3;

public abstract class b extends a {
    public static final boolean d(char c4, char c5, boolean z4) {
        if (c4 == c5) {
            return true;
        }
        if (!z4) {
            return false;
        }
        char upperCase = Character.toUpperCase(c4);
        char upperCase2 = Character.toUpperCase(c5);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
