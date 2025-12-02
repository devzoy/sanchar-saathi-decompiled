package p;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: p.C  reason: case insensitive filesystem */
public class C0828C extends ToggleButton {

    /* renamed from: c  reason: collision with root package name */
    public final C0856x f11375c;

    public C0828C(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public C0828C(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        b0.a(this, getContext());
        C0856x xVar = new C0856x(this);
        this.f11375c = xVar;
        xVar.m(attributeSet, i4);
    }
}
