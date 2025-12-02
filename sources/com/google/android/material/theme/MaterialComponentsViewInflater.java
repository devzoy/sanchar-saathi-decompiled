package com.google.android.material.theme;

import a2.C0347a;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import h2.C0659a;
import i.g;
import n2.C0805e;
import p.C0836c;
import p.C0838e;
import p.C0839f;
import p.C0857y;
import p.r;

public class MaterialComponentsViewInflater extends g {
    public C0836c b(Context context, AttributeSet attributeSet) {
        return new C0805e(context, attributeSet);
    }

    public C0838e c(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public C0839f d(Context context, AttributeSet attributeSet) {
        return new C0347a(context, attributeSet);
    }

    public r j(Context context, AttributeSet attributeSet) {
        return new C0659a(context, attributeSet);
    }

    public C0857y n(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
