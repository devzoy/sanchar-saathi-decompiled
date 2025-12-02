package h2;

import V1.a;
import V1.i;
import X.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import b2.C0393a;
import p.r;

/* renamed from: h2.a  reason: case insensitive filesystem */
public class C0659a extends r {

    /* renamed from: h  reason: collision with root package name */
    public static final int f9627h = i.f3130k;

    /* renamed from: i  reason: collision with root package name */
    public static final int[][] f9628i = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f9629f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9630g;

    public C0659a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f2987v);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9629f == null) {
            int c4 = C0393a.c(this, a.f2971f);
            int c5 = C0393a.c(this, a.f2973h);
            int c6 = C0393a.c(this, a.f2976k);
            int[][] iArr = f9628i;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C0393a.f(c6, c4, 1.0f);
            iArr2[1] = C0393a.f(c6, c5, 0.54f);
            iArr2[2] = C0393a.f(c6, c5, 0.38f);
            iArr2[3] = C0393a.f(c6, c5, 0.38f);
            this.f9629f = new ColorStateList(iArr, iArr2);
        }
        return this.f9629f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9630g && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f9630g = z4;
        if (z4) {
            c.c(this, getMaterialThemeColorsTintList());
        } else {
            c.c(this, (ColorStateList) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0659a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f9627h
            android.content.Context r8 = o2.C0822a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = V1.j.f3168G2
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = g2.i.h(r0, r1, r2, r3, r4, r5)
            int r10 = V1.j.f3173H2
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L_0x002a
            int r10 = V1.j.f3173H2
            android.content.res.ColorStateList r8 = i2.c.a(r8, r9, r10)
            X.c.c(r7, r8)
        L_0x002a:
            int r8 = V1.j.f3178I2
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f9630g = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C0659a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
