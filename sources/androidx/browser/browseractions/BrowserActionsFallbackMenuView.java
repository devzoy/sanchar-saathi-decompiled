package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import t.C0924a;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: c  reason: collision with root package name */
    public final int f4687c = getResources().getDimensionPixelOffset(C0924a.f12032b);

    /* renamed from: d  reason: collision with root package name */
    public final int f4688d = getResources().getDimensionPixelOffset(C0924a.f12031a);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i4, int i5) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f4687c * 2), this.f4688d), 1073741824), i5);
    }
}
