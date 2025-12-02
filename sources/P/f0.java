package p;

import I.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

public class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11537a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f11538b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f11539c;

    public f0(Context context, TypedArray typedArray) {
        this.f11537a = context;
        this.f11538b = typedArray;
    }

    public static f0 t(Context context, int i4, int[] iArr) {
        return new f0(context, context.obtainStyledAttributes(i4, iArr));
    }

    public static f0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new f0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static f0 v(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5) {
        return new f0(context, context.obtainStyledAttributes(attributeSet, iArr, i4, i5));
    }

    public boolean a(int i4, boolean z4) {
        return this.f11538b.getBoolean(i4, z4);
    }

    public int b(int i4, int i5) {
        return this.f11538b.getColor(i4, i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = j.C0754a.a(r2.f11537a, (r0 = r2.f11538b.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList c(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f11538b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f11538b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f11537a
            android.content.res.ColorStateList r0 = j.C0754a.a(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f11538b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f0.c(int):android.content.res.ColorStateList");
    }

    public float d(int i4, float f4) {
        return this.f11538b.getDimension(i4, f4);
    }

    public int e(int i4, int i5) {
        return this.f11538b.getDimensionPixelOffset(i4, i5);
    }

    public int f(int i4, int i5) {
        return this.f11538b.getDimensionPixelSize(i4, i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f11538b.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable g(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f11538b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f11538b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f11537a
            android.graphics.drawable.Drawable r3 = j.C0754a.b(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f11538b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f0.g(int):android.graphics.drawable.Drawable");
    }

    public Drawable h(int i4) {
        int resourceId;
        if (!this.f11538b.hasValue(i4) || (resourceId = this.f11538b.getResourceId(i4, 0)) == 0) {
            return null;
        }
        return C0842i.b().d(this.f11537a, resourceId, true);
    }

    public float i(int i4, float f4) {
        return this.f11538b.getFloat(i4, f4);
    }

    public Typeface j(int i4, int i5, b.C0023b bVar) {
        int resourceId = this.f11538b.getResourceId(i4, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f11539c == null) {
            this.f11539c = new TypedValue();
        }
        return b.c(this.f11537a, resourceId, this.f11539c, i5, bVar);
    }

    public int k(int i4, int i5) {
        return this.f11538b.getInt(i4, i5);
    }

    public int l(int i4, int i5) {
        return this.f11538b.getInteger(i4, i5);
    }

    public int m(int i4, int i5) {
        return this.f11538b.getLayoutDimension(i4, i5);
    }

    public int n(int i4, int i5) {
        return this.f11538b.getResourceId(i4, i5);
    }

    public String o(int i4) {
        return this.f11538b.getString(i4);
    }

    public CharSequence p(int i4) {
        return this.f11538b.getText(i4);
    }

    public CharSequence[] q(int i4) {
        return this.f11538b.getTextArray(i4);
    }

    public TypedArray r() {
        return this.f11538b;
    }

    public boolean s(int i4) {
        return this.f11538b.hasValue(i4);
    }

    public void w() {
        this.f11538b.recycle();
    }
}
