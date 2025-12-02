package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import h.C0645a;

/* renamed from: p.l  reason: case insensitive filesystem */
public class C0845l extends ImageButton {

    /* renamed from: c  reason: collision with root package name */
    public final C0837d f11563c;

    /* renamed from: d  reason: collision with root package name */
    public final C0846m f11564d;

    public C0845l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0645a.f9191y);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0837d dVar = this.f11563c;
        if (dVar != null) {
            dVar.b();
        }
        C0846m mVar = this.f11564d;
        if (mVar != null) {
            mVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0837d dVar = this.f11563c;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0837d dVar = this.f11563c;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0846m mVar = this.f11564d;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0846m mVar = this.f11564d;
        if (mVar != null) {
            return mVar.d();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f11564d.e() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0837d dVar = this.f11563c;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0837d dVar = this.f11563c;
        if (dVar != null) {
            dVar.g(i4);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0846m mVar = this.f11564d;
        if (mVar != null) {
            mVar.b();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0846m mVar = this.f11564d;
        if (mVar != null) {
            mVar.b();
        }
    }

    public void setImageResource(int i4) {
        this.f11564d.g(i4);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0846m mVar = this.f11564d;
        if (mVar != null) {
            mVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0837d dVar = this.f11563c;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0837d dVar = this.f11563c;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0846m mVar = this.f11564d;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0846m mVar = this.f11564d;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    public C0845l(Context context, AttributeSet attributeSet, int i4) {
        super(c0.b(context), attributeSet, i4);
        b0.a(this, getContext());
        C0837d dVar = new C0837d(this);
        this.f11563c = dVar;
        dVar.e(attributeSet, i4);
        C0846m mVar = new C0846m(this);
        this.f11564d = mVar;
        mVar.f(attributeSet, i4);
    }
}
