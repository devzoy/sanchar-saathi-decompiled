package K1;

public abstract class l {
    public static Object[] a(Object[] objArr, int i4) {
        int i5 = 0;
        while (i5 < i4) {
            if (objArr[i5] != null) {
                i5++;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 9);
                sb.append("at index ");
                sb.append(i5);
                throw new NullPointerException(sb.toString());
            }
        }
        return objArr;
    }
}
