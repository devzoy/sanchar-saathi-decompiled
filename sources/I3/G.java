package I3;

public abstract class G {
    public static final int a() {
        return H.a();
    }

    public static final int b(String str, int i4, int i5, int i6) {
        return I.a(str, i4, i5, i6);
    }

    public static final long c(String str, long j4, long j5, long j6) {
        return I.b(str, j4, j5, j6);
    }

    public static final String d(String str) {
        return H.b(str);
    }

    public static final String e(String str, String str2) {
        return I.c(str, str2);
    }

    public static final boolean f(String str, boolean z4) {
        return I.d(str, z4);
    }
}
