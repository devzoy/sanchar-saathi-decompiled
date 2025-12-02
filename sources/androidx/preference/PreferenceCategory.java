package androidx.preference;

import I.e;
import android.content.Context;
import android.util.AttributeSet;
import q0.C0887c;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
    }

    public boolean L() {
        return !super.x();
    }

    public boolean x() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, C0887c.f11759e, 16842892));
    }
}
