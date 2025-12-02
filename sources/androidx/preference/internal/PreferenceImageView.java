package androidx.preference.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import q0.C0891g;

public class PreferenceImageView extends ImageView {

    /* renamed from: c  reason: collision with root package name */
    public int f5537c;

    /* renamed from: d  reason: collision with root package name */
    public int f5538d;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int getMaxHeight() {
        return this.f5538d;
    }

    public int getMaxWidth() {
        return this.f5537c;
    }

    public void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i4);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i4 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i5);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i5 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i4, i5);
    }

    public void setMaxHeight(int i4) {
        this.f5538d = i4;
        super.setMaxHeight(i4);
    }

    public void setMaxWidth(int i4) {
        this.f5537c = i4;
        super.setMaxWidth(i4);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f5537c = Integer.MAX_VALUE;
        this.f5538d = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0891g.f11874y0, i4, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(C0891g.f11769A0, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(C0891g.f11876z0, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }
}
