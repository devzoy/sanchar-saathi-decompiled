package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public abstract class TwoStatePreference extends Preference {

    /* renamed from: H  reason: collision with root package name */
    public boolean f5532H;

    /* renamed from: I  reason: collision with root package name */
    public CharSequence f5533I;

    /* renamed from: J  reason: collision with root package name */
    public CharSequence f5534J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f5535K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f5536L;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
    }

    public void B() {
        super.B();
        boolean z4 = !N();
        if (b(Boolean.valueOf(z4))) {
            O(z4);
        }
    }

    public Object D(TypedArray typedArray, int i4) {
        return Boolean.valueOf(typedArray.getBoolean(i4, false));
    }

    public boolean L() {
        return (this.f5536L ? this.f5532H : !this.f5532H) || super.L();
    }

    public boolean N() {
        return this.f5532H;
    }

    public void O(boolean z4) {
        boolean z5 = this.f5532H != z4;
        if (z5 || !this.f5535K) {
            this.f5532H = z4;
            this.f5535K = true;
            H(z4);
            if (z5) {
                A(L());
                z();
            }
        }
    }

    public void P(boolean z4) {
        this.f5536L = z4;
    }

    public void Q(CharSequence charSequence) {
        this.f5534J = charSequence;
        if (!N()) {
            z();
        }
    }

    public void R(CharSequence charSequence) {
        this.f5533I = charSequence;
        if (N()) {
            z();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void S(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f5532H
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.CharSequence r0 = r4.f5533I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001b
            java.lang.CharSequence r0 = r4.f5533I
            r5.setText(r0)
        L_0x0019:
            r0 = r1
            goto L_0x002e
        L_0x001b:
            boolean r0 = r4.f5532H
            if (r0 != 0) goto L_0x002d
            java.lang.CharSequence r0 = r4.f5534J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002d
            java.lang.CharSequence r0 = r4.f5534J
            r5.setText(r0)
            goto L_0x0019
        L_0x002d:
            r0 = 1
        L_0x002e:
            if (r0 == 0) goto L_0x003e
            java.lang.CharSequence r2 = r4.t()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x003e
            r5.setText(r2)
            r0 = r1
        L_0x003e:
            if (r0 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r1 = 8
        L_0x0043:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L_0x004c
            r5.setVisibility(r1)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.S(android.view.View):void");
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
