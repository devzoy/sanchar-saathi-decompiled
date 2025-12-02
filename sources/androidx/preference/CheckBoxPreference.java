package androidx.preference;

import I.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import q0.C0887c;
import q0.C0891g;

public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: M  reason: collision with root package name */
    public final a f5446M;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (!CheckBoxPreference.this.b(Boolean.valueOf(z4))) {
                compoundButton.setChecked(!z4);
            } else {
                CheckBoxPreference.this.O(z4);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public void G(View view) {
        super.G(view);
        U(view);
    }

    public final void T(View view) {
        boolean z4 = view instanceof CompoundButton;
        if (z4) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f5532H);
        }
        if (z4) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f5446M);
        }
    }

    public final void U(View view) {
        if (((AccessibilityManager) k().getSystemService("accessibility")).isEnabled()) {
            T(view.findViewById(16908289));
            S(view.findViewById(16908304));
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f5446M = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0891g.f11823b, i4, i5);
        R(e.f(obtainStyledAttributes, C0891g.f11839h, C0891g.f11826c));
        Q(e.f(obtainStyledAttributes, C0891g.f11837g, C0891g.f11829d));
        P(e.b(obtainStyledAttributes, C0891g.f11835f, C0891g.f11832e, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, C0887c.f11755a, 16842895));
    }
}
