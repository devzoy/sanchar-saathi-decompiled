package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p.M;

public class FitWindowsFrameLayout extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public M f4450c;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        M m4 = this.f4450c;
        if (m4 != null) {
            m4.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(M m4) {
    }
}
