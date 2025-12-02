package androidx.preference;

import I.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import q0.C0887c;
import q0.C0891g;

public class SwitchPreference extends TwoStatePreference {

    /* renamed from: M  reason: collision with root package name */
    public final a f5524M;

    /* renamed from: N  reason: collision with root package name */
    public CharSequence f5525N;

    /* renamed from: O  reason: collision with root package name */
    public CharSequence f5526O;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (!SwitchPreference.this.b(Boolean.valueOf(z4))) {
                compoundButton.setChecked(!z4);
            } else {
                SwitchPreference.this.O(z4);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f5524M = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0891g.f11787J0, i4, i5);
        R(e.f(obtainStyledAttributes, C0891g.f11803R0, C0891g.f11789K0));
        Q(e.f(obtainStyledAttributes, C0891g.f11801Q0, C0891g.f11791L0));
        U(e.f(obtainStyledAttributes, C0891g.f11807T0, C0891g.f11795N0));
        T(e.f(obtainStyledAttributes, C0891g.f11805S0, C0891g.f11797O0));
        P(e.b(obtainStyledAttributes, C0891g.f11799P0, C0891g.f11793M0, false));
        obtainStyledAttributes.recycle();
    }

    private void W(View view) {
        if (((AccessibilityManager) k().getSystemService("accessibility")).isEnabled()) {
            V(view.findViewById(16908352));
            S(view.findViewById(16908304));
        }
    }

    public void G(View view) {
        super.G(view);
        W(view);
    }

    public void T(CharSequence charSequence) {
        this.f5526O = charSequence;
        z();
    }

    public void U(CharSequence charSequence) {
        this.f5525N = charSequence;
        z();
    }

    public final void V(View view) {
        boolean z4 = view instanceof Switch;
        if (z4) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f5532H);
        }
        if (z4) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.f5525N);
            switchR.setTextOff(this.f5526O);
            switchR.setOnCheckedChangeListener(this.f5524M);
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, C0887c.f11764j, 16843629));
    }
}
