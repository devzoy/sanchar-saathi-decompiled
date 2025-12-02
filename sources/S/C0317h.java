package S;

import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: S.h  reason: case insensitive filesystem */
public abstract class C0317h {
    public static void a(int i4, int i5, int i6, Rect rect, Rect rect2, int i7) {
        Gravity.apply(i4, i5, i6, rect, rect2, i7);
    }

    public static int b(int i4, int i5) {
        return Gravity.getAbsoluteGravity(i4, i5);
    }
}
