package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p.M;

public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: c  reason: collision with root package name */
    public M f4451c;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        M m4 = this.f4451c;
        if (m4 != null) {
            m4.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(M m4) {
    }
}
