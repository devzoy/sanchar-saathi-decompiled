package a2;

import V1.a;
import V1.i;
import X.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import b2.C0393a;
import p.C0839f;

/* renamed from: a2.a  reason: case insensitive filesystem */
public class C0347a extends C0839f {

    /* renamed from: h  reason: collision with root package name */
    public static final int f3997h = i.f3129j;

    /* renamed from: i  reason: collision with root package name */
    public static final int[][] f3998i = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f3999f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4000g;

    public C0347a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f2968c);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3999f == null) {
            int[][] iArr = f3998i;
            int[] iArr2 = new int[iArr.length];
            int c4 = C0393a.c(this, a.f2971f);
            int c5 = C0393a.c(this, a.f2976k);
            int c6 = C0393a.c(this, a.f2973h);
            iArr2[0] = C0393a.f(c5, c4, 1.0f);
            iArr2[1] = C0393a.f(c5, c6, 0.54f);
            iArr2[2] = C0393a.f(c5, c6, 0.38f);
            iArr2[3] = C0393a.f(c5, c6, 0.38f);
            this.f3999f = new ColorStateList(iArr, iArr2);
        }
        return this.f3999f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4000g && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f4000g = z4;
        if (z4) {
            c.c(this, getMaterialThemeColorsTintList());
        } else {
            c.c(this, (ColorStateList) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0347a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f3997h
            android.content.Context r8 = o2.C0822a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = V1.j.f3153D2
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = g2.i.h(r0, r1, r2, r3, r4, r5)
            int r10 = V1.j.f3158E2
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L_0x002a
            int r10 = V1.j.f3158E2
            android.content.res.ColorStateList r8 = i2.c.a(r8, r9, r10)
            X.c.c(r7, r8)
        L_0x002a:
            int r8 = V1.j.f3163F2
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f4000g = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.C0347a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
