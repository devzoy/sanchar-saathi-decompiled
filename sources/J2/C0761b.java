package j2;

import android.content.res.ColorStateList;

/* renamed from: j2.b  reason: case insensitive filesystem */
public abstract class C0761b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f10903a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f10904b = {16842919};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f10905c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f10906d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f10907e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f10908f = {16842913, 16842919};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f10909g = {16842913, 16843623, 16842908};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f10910h = {16842913, 16842908};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f10911i = {16842913, 16843623};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f10912j = {16842913};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f10913k = {16842910, 16842919};

    /* renamed from: l  reason: collision with root package name */
    public static final String f10914l = C0761b.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }

    public static boolean b(int[] iArr) {
        boolean z4 = false;
        boolean z5 = false;
        for (int i4 : iArr) {
            if (i4 == 16842910) {
                z4 = true;
            } else if (i4 == 16842908 || i4 == 16842919 || i4 == 16843623) {
                z5 = true;
            }
        }
        return z4 && z5;
    }
}
