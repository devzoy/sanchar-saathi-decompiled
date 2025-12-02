package androidx.preference;

import I.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import q0.C0887c;
import q0.C0888d;
import q0.C0891g;

public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: M  reason: collision with root package name */
    public final a f5528M;

    /* renamed from: N  reason: collision with root package name */
    public CharSequence f5529N;

    /* renamed from: O  reason: collision with root package name */
    public CharSequence f5530O;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (!SwitchPreferenceCompat.this.b(Boolean.valueOf(z4))) {
                compoundButton.setChecked(!z4);
            } else {
                SwitchPreferenceCompat.this.O(z4);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f5528M = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0891g.f11809U0, i4, i5);
        R(e.f(obtainStyledAttributes, C0891g.f11828c1, C0891g.f11811V0));
        Q(e.f(obtainStyledAttributes, C0891g.f11825b1, C0891g.f11813W0));
        U(e.f(obtainStyledAttributes, C0891g.f11834e1, C0891g.f11817Y0));
        T(e.f(obtainStyledAttributes, C0891g.f11831d1, C0891g.f11819Z0));
        P(e.b(obtainStyledAttributes, C0891g.f11822a1, C0891g.f11815X0, false));
        obtainStyledAttributes.recycle();
    }

    private void V(View view) {
        boolean z4 = view instanceof SwitchCompat;
        if (z4) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f5532H);
        }
        if (z4) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f5529N);
            switchCompat.setTextOff(this.f5530O);
            switchCompat.setOnCheckedChangeListener(this.f5528M);
        }
    }

    private void W(View view) {
        if (((AccessibilityManager) k().getSystemService("accessibility")).isEnabled()) {
            V(view.findViewById(C0888d.f11765a));
            S(view.findViewById(16908304));
        }
    }

    public void G(View view) {
        super.G(view);
        W(view);
    }

    public void T(CharSequence charSequence) {
        this.f5530O = charSequence;
        z();
    }

    public void U(CharSequence charSequence) {
        this.f5529N = charSequence;
        z();
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0887c.f11763i);
    }
}
