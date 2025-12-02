package p;

import K.b;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import k.C0764a;
import net.sqlcipher.database.SQLiteDatabase;

public abstract class K {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f11376a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f11377b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f11378c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public static Class f11379d;

    static {
        try {
            f11379d = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    public static boolean a(Drawable drawable) {
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable a4 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!a(a4)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof b) {
            return a(((b) drawable).b());
        } else {
            if (drawable instanceof C0764a) {
                return a(((C0764a) drawable).a());
            }
            if (drawable instanceof ScaleDrawable) {
                return a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    public static void b(Drawable drawable) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Rect c(android.graphics.drawable.Drawable r11) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x0028
            android.graphics.Insets r11 = r11.getOpticalInsets()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            int r1 = r11.left
            r0.left = r1
            int r1 = r11.right
            r0.right = r1
            int r1 = r11.top
            r0.top = r1
            int r11 = r11.bottom
            r0.bottom = r11
            return r0
        L_0x0028:
            java.lang.Class r0 = f11379d
            if (r0 == 0) goto L_0x00ba
            android.graphics.drawable.Drawable r11 = K.a.k(r11)     // Catch:{ Exception -> 0x00b3 }
            java.lang.Class r0 = r11.getClass()     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r1 = "getOpticalInsets"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ Exception -> 0x00b3 }
            java.lang.Object r11 = r0.invoke(r11, r2)     // Catch:{ Exception -> 0x00b3 }
            if (r11 == 0) goto L_0x00ba
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ Exception -> 0x00b3 }
            r0.<init>()     // Catch:{ Exception -> 0x00b3 }
            java.lang.Class r1 = f11379d     // Catch:{ Exception -> 0x00b3 }
            java.lang.reflect.Field[] r1 = r1.getFields()     // Catch:{ Exception -> 0x00b3 }
            int r2 = r1.length     // Catch:{ Exception -> 0x00b3 }
            r3 = 0
            r4 = r3
        L_0x004f:
            if (r4 >= r2) goto L_0x00b2
            r5 = r1[r4]     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r6 = r5.getName()     // Catch:{ Exception -> 0x00b3 }
            int r7 = r6.hashCode()     // Catch:{ Exception -> 0x00b3 }
            r8 = 3
            r9 = 2
            r10 = 1
            switch(r7) {
                case -1383228885: goto L_0x0080;
                case 115029: goto L_0x0076;
                case 3317767: goto L_0x006c;
                case 108511772: goto L_0x0062;
                default: goto L_0x0061;
            }     // Catch:{ Exception -> 0x00b3 }
        L_0x0061:
            goto L_0x008a
        L_0x0062:
            java.lang.String r7 = "right"
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x00b3 }
            if (r6 == 0) goto L_0x008a
            r6 = r9
            goto L_0x008b
        L_0x006c:
            java.lang.String r7 = "left"
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x00b3 }
            if (r6 == 0) goto L_0x008a
            r6 = r3
            goto L_0x008b
        L_0x0076:
            java.lang.String r7 = "top"
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x00b3 }
            if (r6 == 0) goto L_0x008a
            r6 = r10
            goto L_0x008b
        L_0x0080:
            java.lang.String r7 = "bottom"
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x00b3 }
            if (r6 == 0) goto L_0x008a
            r6 = r8
            goto L_0x008b
        L_0x008a:
            r6 = -1
        L_0x008b:
            if (r6 == 0) goto L_0x00a9
            if (r6 == r10) goto L_0x00a2
            if (r6 == r9) goto L_0x009b
            if (r6 == r8) goto L_0x0094
            goto L_0x00af
        L_0x0094:
            int r5 = r5.getInt(r11)     // Catch:{ Exception -> 0x00b3 }
            r0.bottom = r5     // Catch:{ Exception -> 0x00b3 }
            goto L_0x00af
        L_0x009b:
            int r5 = r5.getInt(r11)     // Catch:{ Exception -> 0x00b3 }
            r0.right = r5     // Catch:{ Exception -> 0x00b3 }
            goto L_0x00af
        L_0x00a2:
            int r5 = r5.getInt(r11)     // Catch:{ Exception -> 0x00b3 }
            r0.top = r5     // Catch:{ Exception -> 0x00b3 }
            goto L_0x00af
        L_0x00a9:
            int r5 = r5.getInt(r11)     // Catch:{ Exception -> 0x00b3 }
            r0.left = r5     // Catch:{ Exception -> 0x00b3 }
        L_0x00af:
            int r4 = r4 + 1
            goto L_0x004f
        L_0x00b2:
            return r0
        L_0x00b3:
            java.lang.String r11 = "DrawableUtils"
            java.lang.String r0 = "Couldn't obtain the optical insets. Ignoring."
            android.util.Log.e(r11, r0)
        L_0x00ba:
            android.graphics.Rect r11 = f11378c
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.K.c(android.graphics.drawable.Drawable):android.graphics.Rect");
    }

    public static PorterDuff.Mode d(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
