package o2;

import V1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import n.d;

/* renamed from: o2.a  reason: case insensitive filesystem */
public abstract class C0822a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f11333a = {16842752, a.f2964B};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f11334b = {a.f2985t};

    public static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11333a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    public static int b(Context context, AttributeSet attributeSet, int i4, int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11334b, i4, i5);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i4, int i5) {
        int b4 = b(context, attributeSet, i4, i5);
        boolean z4 = (context instanceof d) && ((d) context).c() == b4;
        if (b4 == 0 || z4) {
            return context;
        }
        d dVar = new d(context, b4);
        int a4 = a(context, attributeSet);
        if (a4 != 0) {
            dVar.getTheme().applyStyle(a4, true);
        }
        return dVar;
    }
}
