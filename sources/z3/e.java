package z3;

public abstract class e extends d {
    public static int a(int i4, int i5) {
        return i4 < i5 ? i5 : i4;
    }

    public static long b(long j4, long j5) {
        return j4 < j5 ? j5 : j4;
    }

    public static int c(int i4, int i5) {
        return i4 > i5 ? i5 : i4;
    }

    public static long d(long j4, long j5) {
        return j4 > j5 ? j5 : j4;
    }

    public static long e(long j4, long j5, long j6) {
        if (j5 <= j6) {
            return j4 < j5 ? j5 : j4 > j6 ? j6 : j4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j6 + " is less than minimum " + j5 + '.');
    }

    public static a f(int i4, int i5) {
        return a.f13032h.a(i4, i5, -1);
    }
}
