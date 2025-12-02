package androidx.preference;

import I.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import q0.C0887c;
import q0.C0891g;

public abstract class DialogPreference extends Preference {

    /* renamed from: H  reason: collision with root package name */
    public CharSequence f5448H;

    /* renamed from: I  reason: collision with root package name */
    public CharSequence f5449I;

    /* renamed from: J  reason: collision with root package name */
    public Drawable f5450J;

    /* renamed from: K  reason: collision with root package name */
    public CharSequence f5451K;

    /* renamed from: L  reason: collision with root package name */
    public CharSequence f5452L;

    /* renamed from: M  reason: collision with root package name */
    public int f5453M;

    public DialogPreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0891g.f11841i, i4, i5);
        String f4 = e.f(obtainStyledAttributes, C0891g.f11861s, C0891g.f11843j);
        this.f5448H = f4;
        if (f4 == null) {
            this.f5448H = v();
        }
        this.f5449I = e.f(obtainStyledAttributes, C0891g.f11859r, C0891g.f11845k);
        this.f5450J = e.c(obtainStyledAttributes, C0891g.f11855p, C0891g.f11847l);
        this.f5451K = e.f(obtainStyledAttributes, C0891g.f11865u, C0891g.f11849m);
        this.f5452L = e.f(obtainStyledAttributes, C0891g.f11863t, C0891g.f11851n);
        this.f5453M = e.e(obtainStyledAttributes, C0891g.f11857q, C0891g.f11853o, 0);
        obtainStyledAttributes.recycle();
    }

    public void B() {
        s();
        throw null;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, C0887c.f11756b, 16842897));
    }
}
