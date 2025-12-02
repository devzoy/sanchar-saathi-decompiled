package p;

import J.c;
import Q.b;
import X.b;
import X.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import j.C0754a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: p.y  reason: case insensitive filesystem */
public class C0857y extends TextView implements b {

    /* renamed from: c  reason: collision with root package name */
    public final C0837d f11637c;

    /* renamed from: d  reason: collision with root package name */
    public final C0856x f11638d;

    /* renamed from: e  reason: collision with root package name */
    public final C0855w f11639e;

    /* renamed from: f  reason: collision with root package name */
    public Future f11640f;

    public C0857y(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void c() {
        Future future = this.f11640f;
        if (future != null) {
            try {
                this.f11640f = null;
                android.support.v4.media.session.b.a(future.get());
                h.l(this, (Q.b) null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0837d dVar = this.f11637c;
        if (dVar != null) {
            dVar.b();
        }
        C0856x xVar = this.f11638d;
        if (xVar != null) {
            xVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f3438a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0856x xVar = this.f11638d;
        if (xVar != null) {
            return xVar.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f3438a) {
            return super.getAutoSizeMinTextSize();
        }
        C0856x xVar = this.f11638d;
        if (xVar != null) {
            return xVar.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f3438a) {
            return super.getAutoSizeStepGranularity();
        }
        C0856x xVar = this.f11638d;
        if (xVar != null) {
            return xVar.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f3438a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0856x xVar = this.f11638d;
        return xVar != null ? xVar.h() : new int[0];
    }

    public int getAutoSizeTextType() {
        if (b.f3438a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0856x xVar = this.f11638d;
        if (xVar != null) {
            return xVar.i();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return h.b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return h.c(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0837d dVar = this.f11637c;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0837d dVar = this.f11637c;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11638d.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11638d.k();
    }

    public CharSequence getText() {
        c();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public b.a getTextMetricsParamsCompat() {
        return h.e(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0844k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        C0856x xVar = this.f11638d;
        if (xVar != null) {
            xVar.o(z4, i4, i5, i6, i7);
        }
    }

    public void onMeasure(int i4, int i5) {
        c();
        super.onMeasure(i4, i5);
    }

    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        C0856x xVar = this.f11638d;
        if (xVar != null && !X.b.f3438a && xVar.l()) {
            this.f11638d.c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) {
        if (X.b.f3438a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        C0856x xVar = this.f11638d;
        if (xVar != null) {
            xVar.s(i4, i5, i6, i7);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (X.b.f3438a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        C0856x xVar = this.f11638d;
        if (xVar != null) {
            xVar.t(iArr, i4);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (X.b.f3438a) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        C0856x xVar = this.f11638d;
        if (xVar != null) {
            xVar.u(i4);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0837d dVar = this.f11637c;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0837d dVar = this.f11637c;
        if (dVar != null) {
            dVar.g(i4);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0856x xVar = this.f11638d;
        if (xVar != null) {
            xVar.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0856x xVar = this.f11638d;
        if (xVar != null) {
            xVar.p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0856x xVar = this.f11638d;
        if (xVar != null) {
            xVar.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0856x xVar = this.f11638d;
        if (xVar != null) {
            xVar.p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.o(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i4) {
        super.setFirstBaselineToTopHeight(i4);
    }

    public void setLastBaselineToBottomHeight(int i4) {
        super.setLastBaselineToBottomHeight(i4);
    }

    public void setLineHeight(int i4) {
        h.k(this, i4);
    }

    public void setPrecomputedText(Q.b bVar) {
        h.l(this, bVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0837d dVar = this.f11637c;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0837d dVar = this.f11637c;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f11638d.v(colorStateList);
        this.f11638d.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f11638d.w(mode);
        this.f11638d.b();
    }

    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C0856x xVar = this.f11638d;
        if (xVar != null) {
            xVar.q(context, i4);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<Q.b> future) {
        this.f11640f = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a aVar) {
        h.n(this, aVar);
    }

    public void setTextSize(int i4, float f4) {
        if (X.b.f3438a) {
            super.setTextSize(i4, f4);
            return;
        }
        C0856x xVar = this.f11638d;
        if (xVar != null) {
            xVar.z(i4, f4);
        }
    }

    public void setTypeface(Typeface typeface, int i4) {
        Typeface a4 = (typeface == null || i4 <= 0) ? null : c.a(getContext(), typeface, i4);
        if (a4 != null) {
            typeface = a4;
        }
        super.setTypeface(typeface, i4);
    }

    public C0857y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0857y(Context context, AttributeSet attributeSet, int i4) {
        super(c0.b(context), attributeSet, i4);
        b0.a(this, getContext());
        C0837d dVar = new C0837d(this);
        this.f11637c = dVar;
        dVar.e(attributeSet, i4);
        C0856x xVar = new C0856x(this);
        this.f11638d = xVar;
        xVar.m(attributeSet, i4);
        xVar.b();
        this.f11639e = new C0855w(this);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b4 = i4 != 0 ? C0754a.b(context, i4) : null;
        Drawable b5 = i5 != 0 ? C0754a.b(context, i5) : null;
        Drawable b6 = i6 != 0 ? C0754a.b(context, i6) : null;
        if (i7 != 0) {
            drawable = C0754a.b(context, i7);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b4, b5, b6, drawable);
        C0856x xVar = this.f11638d;
        if (xVar != null) {
            xVar.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b4 = i4 != 0 ? C0754a.b(context, i4) : null;
        Drawable b5 = i5 != 0 ? C0754a.b(context, i5) : null;
        Drawable b6 = i6 != 0 ? C0754a.b(context, i6) : null;
        if (i7 != 0) {
            drawable = C0754a.b(context, i7);
        }
        setCompoundDrawablesWithIntrinsicBounds(b4, b5, b6, drawable);
        C0856x xVar = this.f11638d;
        if (xVar != null) {
            xVar.p();
        }
    }
}
