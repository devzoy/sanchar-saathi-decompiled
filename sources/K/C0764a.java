package k;

import K.a;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: k.a  reason: case insensitive filesystem */
public abstract class C0764a extends Drawable implements Drawable.Callback {

    /* renamed from: c  reason: collision with root package name */
    public Drawable f10961c;

    public C0764a(Drawable drawable) {
        b(drawable);
    }

    public Drawable a() {
        return this.f10961c;
    }

    public void b(Drawable drawable) {
        Drawable drawable2 = this.f10961c;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f10961c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f10961c.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f10961c.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f10961c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f10961c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f10961c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f10961c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f10961c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f10961c.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f10961c.getPadding(rect);
    }

    public int[] getState() {
        return this.f10961c.getState();
    }

    public Region getTransparentRegion() {
        return this.f10961c.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.c(this.f10961c);
    }

    public boolean isStateful() {
        return this.f10961c.isStateful();
    }

    public void jumpToCurrentState() {
        this.f10961c.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.f10961c.setBounds(rect);
    }

    public boolean onLevelChange(int i4) {
        return this.f10961c.setLevel(i4);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        scheduleSelf(runnable, j4);
    }

    public void setAlpha(int i4) {
        this.f10961c.setAlpha(i4);
    }

    public void setAutoMirrored(boolean z4) {
        a.d(this.f10961c, z4);
    }

    public void setChangingConfigurations(int i4) {
        this.f10961c.setChangingConfigurations(i4);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f10961c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z4) {
        this.f10961c.setDither(z4);
    }

    public void setFilterBitmap(boolean z4) {
        this.f10961c.setFilterBitmap(z4);
    }

    public void setHotspot(float f4, float f5) {
        a.e(this.f10961c, f4, f5);
    }

    public void setHotspotBounds(int i4, int i5, int i6, int i7) {
        a.f(this.f10961c, i4, i5, i6, i7);
    }

    public boolean setState(int[] iArr) {
        return this.f10961c.setState(iArr);
    }

    public void setTint(int i4) {
        a.h(this.f10961c, i4);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.i(this.f10961c, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.j(this.f10961c, mode);
    }

    public boolean setVisible(boolean z4, boolean z5) {
        return super.setVisible(z4, z5) || this.f10961c.setVisible(z4, z5);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
