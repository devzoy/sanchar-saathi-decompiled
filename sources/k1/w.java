package K1;

public abstract class w {
    public static void a(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static int b(int i4, int i5, String str) {
        String str2;
        if (i4 >= 0 && i4 < i5) {
            return i4;
        }
        if (i4 < 0) {
            str2 = x.a("%s (%s) must not be negative", "index", Integer.valueOf(i4));
        } else if (i5 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 15);
            sb.append("negative size: ");
            sb.append(i5);
            throw new IllegalArgumentException(sb.toString());
        } else {
            str2 = x.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    public static int c(int i4, int i5, String str) {
        if (i4 >= 0 && i4 <= i5) {
            return i4;
        }
        throw new IndexOutOfBoundsException(e(i4, i5, "index"));
    }

    public static void d(int i4, int i5, int i6) {
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            throw new IndexOutOfBoundsException((i4 < 0 || i4 > i6) ? e(i4, i6, "start index") : (i5 < 0 || i5 > i6) ? e(i5, i6, "end index") : x.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4)));
        }
    }

    public static String e(int i4, int i5, String str) {
        if (i4 < 0) {
            return x.a("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return x.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 15);
        sb.append("negative size: ");
        sb.append(i5);
        throw new IllegalArgumentException(sb.toString());
    }
}
