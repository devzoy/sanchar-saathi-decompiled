package p;

import X.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import h.C0645a;
import j.C0754a;

/* renamed from: p.c  reason: case insensitive filesystem */
public class C0836c extends AutoCompleteTextView {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f11514e = {16843126};

    /* renamed from: c  reason: collision with root package name */
    public final C0837d f11515c;

    /* renamed from: d  reason: collision with root package name */
    public final C0856x f11516d;

    public C0836c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0645a.f9179m);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0837d dVar = this.f11515c;
        if (dVar != null) {
            dVar.b();
        }
        C0856x xVar = this.f11516d;
        if (xVar != null) {
            xVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0837d dVar = this.f11515c;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0837d dVar = this.f11515c;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0844k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0837d dVar = this.f11515c;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0837d dVar = this.f11515c;
        if (dVar != null) {
            dVar.g(i4);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.o(this, callback));
    }

    public void setDropDownBackgroundResource(int i4) {
        setDropDownBackgroundDrawable(C0754a.b(getContext(), i4));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0837d dVar = this.f11515c;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0837d dVar = this.f11515c;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C0856x xVar = this.f11516d;
        if (xVar != null) {
            xVar.q(context, i4);
        }
    }

    public C0836c(Context context, AttributeSet attributeSet, int i4) {
        super(c0.b(context), attributeSet, i4);
        b0.a(this, getContext());
        f0 v4 = f0.v(getContext(), attributeSet, f11514e, i4, 0);
        if (v4.s(0)) {
            setDropDownBackgroundDrawable(v4.g(0));
        }
        v4.w();
        C0837d dVar = new C0837d(this);
        this.f11515c = dVar;
        dVar.e(attributeSet, i4);
        C0856x xVar = new C0856x(this);
        this.f11516d = xVar;
        xVar.m(attributeSet, i4);
        xVar.b();
    }
}
