package androidx.preference;

import I.e;
import android.content.Context;
import android.util.AttributeSet;
import q0.C0887c;

public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: P  reason: collision with root package name */
    public boolean f5509P = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, e.a(context, C0887c.f11760f, 16842891));
    }

    public void B() {
        if (n() == null && m() == null && O() != 0) {
            s();
            throw null;
        }
    }
}
