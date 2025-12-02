package l2;

/* renamed from: l2.e  reason: case insensitive filesystem */
public class C0782e extends C0781d {

    /* renamed from: a  reason: collision with root package name */
    public float f11002a = -1.0f;

    public void a(m mVar, float f4, float f5, float f6) {
        mVar.o(0.0f, f6 * f5, 180.0f, 180.0f - f4);
        double d4 = (double) f6;
        double d5 = (double) f5;
        mVar.m((float) (Math.sin(Math.toRadians((double) f4)) * d4 * d5), (float) (Math.sin(Math.toRadians((double) (90.0f - f4))) * d4 * d5));
    }
}
