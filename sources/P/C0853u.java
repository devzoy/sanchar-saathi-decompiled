package p;

import K.a;
import S.C;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import h.j;

/* renamed from: p.u  reason: case insensitive filesystem */
public class C0853u extends C0850q {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f11584d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f11585e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f11586f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f11587g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11588h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11589i = false;

    public C0853u(SeekBar seekBar) {
        super(seekBar);
        this.f11584d = seekBar;
    }

    public void c(AttributeSet attributeSet, int i4) {
        super.c(attributeSet, i4);
        f0 v4 = f0.v(this.f11584d.getContext(), attributeSet, j.f9430V, i4, 0);
        SeekBar seekBar = this.f11584d;
        C.e0(seekBar, seekBar.getContext(), j.f9430V, attributeSet, v4.r(), i4, 0);
        Drawable h4 = v4.h(j.f9434W);
        if (h4 != null) {
            this.f11584d.setThumb(h4);
        }
        j(v4.g(j.f9438X));
        if (v4.s(j.f9446Z)) {
            this.f11587g = K.d(v4.k(j.f9446Z, -1), this.f11587g);
            this.f11589i = true;
        }
        if (v4.s(j.f9442Y)) {
            this.f11586f = v4.c(j.f9442Y);
            this.f11588h = true;
        }
        v4.w();
        f();
    }

    public final void f() {
        Drawable drawable = this.f11585e;
        if (drawable == null) {
            return;
        }
        if (this.f11588h || this.f11589i) {
            Drawable l4 = a.l(drawable.mutate());
            this.f11585e = l4;
            if (this.f11588h) {
                a.i(l4, this.f11586f);
            }
            if (this.f11589i) {
                a.j(this.f11585e, this.f11587g);
            }
            if (this.f11585e.isStateful()) {
                this.f11585e.setState(this.f11584d.getDrawableState());
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.f11585e != null) {
            int max = this.f11584d.getMax();
            int i4 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f11585e.getIntrinsicWidth();
                int intrinsicHeight = this.f11585e.getIntrinsicHeight();
                int i5 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i4 = intrinsicHeight / 2;
                }
                this.f11585e.setBounds(-i5, -i4, i5, i4);
                float width = ((float) ((this.f11584d.getWidth() - this.f11584d.getPaddingLeft()) - this.f11584d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f11584d.getPaddingLeft(), (float) (this.f11584d.getHeight() / 2));
                for (int i6 = 0; i6 <= max; i6++) {
                    this.f11585e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public void h() {
        Drawable drawable = this.f11585e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f11584d.getDrawableState())) {
            this.f11584d.invalidateDrawable(drawable);
        }
    }

    public void i() {
        Drawable drawable = this.f11585e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void j(Drawable drawable) {
        Drawable drawable2 = this.f11585e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f11585e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f11584d);
            a.g(drawable, C.x(this.f11584d));
            if (drawable.isStateful()) {
                drawable.setState(this.f11584d.getDrawableState());
            }
            f();
        }
        this.f11584d.invalidate();
    }
}
