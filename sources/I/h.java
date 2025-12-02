package i;

public class h {

    /* renamed from: d  reason: collision with root package name */
    public static h f9751d;

    /* renamed from: a  reason: collision with root package name */
    public long f9752a;

    /* renamed from: b  reason: collision with root package name */
    public long f9753b;

    /* renamed from: c  reason: collision with root package name */
    public int f9754c;

    public static h b() {
        if (f9751d == null) {
            f9751d = new h();
        }
        return f9751d;
    }

    public void a(long j4, double d4, double d5) {
        float f4 = ((float) (j4 - 946728000000L)) / 8.64E7f;
        float f5 = (0.01720197f * f4) + 6.24006f;
        double d6 = (double) f5;
        double sin = (Math.sin(d6) * 0.03341960161924362d) + d6 + (Math.sin((double) (2.0f * f5)) * 3.4906598739326E-4d) + (Math.sin((double) (f5 * 3.0f)) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d7 = (-d5) / 360.0d;
        double round = ((double) (((float) Math.round(((double) (f4 - 9.0E-4f)) - d7)) + 9.0E-4f)) + d7 + (Math.sin(d6) * 0.0053d) + (Math.sin(2.0d * sin) * -0.0069d);
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d8 = 0.01745329238474369d * d4;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d8) * Math.sin(asin))) / (Math.cos(d8) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f9754c = 1;
            this.f9752a = -1;
            this.f9753b = -1;
        } else if (sin2 <= -1.0d) {
            this.f9754c = 0;
            this.f9752a = -1;
            this.f9753b = -1;
        } else {
            double acos = (double) ((float) (Math.acos(sin2) / 6.283185307179586d));
            this.f9752a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            long round2 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            this.f9753b = round2;
            if (round2 >= j4 || this.f9752a <= j4) {
                this.f9754c = 1;
            } else {
                this.f9754c = 0;
            }
        }
    }
}
