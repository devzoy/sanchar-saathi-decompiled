package g2;

import V1.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.b;

public abstract class d extends b {

    /* renamed from: r  reason: collision with root package name */
    public Drawable f9124r;

    /* renamed from: s  reason: collision with root package name */
    public final Rect f9125s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    public final Rect f9126t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    public int f9127u = 119;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9128v = true;

    /* renamed from: w  reason: collision with root package name */
    public boolean f9129w = false;

    public d(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        TypedArray h4 = i.h(context, attributeSet, j.f3328o1, i4, 0, new int[0]);
        this.f9127u = h4.getInt(j.f3338q1, this.f9127u);
        Drawable drawable = h4.getDrawable(j.f3333p1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f9128v = h4.getBoolean(j.f3343r1, true);
        h4.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f9124r;
        if (drawable != null) {
            if (this.f9129w) {
                this.f9129w = false;
                Rect rect = this.f9125s;
                Rect rect2 = this.f9126t;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f9128v) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f9127u, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f4, float f5) {
        super.drawableHotspotChanged(f4, f5);
        Drawable drawable = this.f9124r;
        if (drawable != null) {
            drawable.setHotspot(f4, f5);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f9124r;
        if (drawable != null && drawable.isStateful()) {
            this.f9124r.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f9124r;
    }

    public int getForegroundGravity() {
        return this.f9127u;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9124r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        this.f9129w = z4 | this.f9129w;
    }

    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.f9129w = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f9124r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f9124r);
            }
            this.f9124r = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f9127u == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i4) {
        if (this.f9127u != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f9127u = i4;
            if (i4 == 119 && this.f9124r != null) {
                this.f9124r.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9124r;
    }
}
