package p;

import X.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import h.C0645a;

/* renamed from: p.j  reason: case insensitive filesystem */
public class C0843j extends EditText {

    /* renamed from: c  reason: collision with root package name */
    public final C0837d f11560c;

    /* renamed from: d  reason: collision with root package name */
    public final C0856x f11561d;

    /* renamed from: e  reason: collision with root package name */
    public final C0855w f11562e;

    public C0843j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0645a.f9190x);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0837d dVar = this.f11560c;
        if (dVar != null) {
            dVar.b();
        }
        C0856x xVar = this.f11561d;
        if (xVar != null) {
            xVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0837d dVar = this.f11560c;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0837d dVar = this.f11560c;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0844k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0837d dVar = this.f11560c;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0837d dVar = this.f11560c;
        if (dVar != null) {
            dVar.g(i4);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.o(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0837d dVar = this.f11560c;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0837d dVar = this.f11560c;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C0856x xVar = this.f11561d;
        if (xVar != null) {
            xVar.q(context, i4);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public C0843j(Context context, AttributeSet attributeSet, int i4) {
        super(c0.b(context), attributeSet, i4);
        b0.a(this, getContext());
        C0837d dVar = new C0837d(this);
        this.f11560c = dVar;
        dVar.e(attributeSet, i4);
        C0856x xVar = new C0856x(this);
        this.f11561d = xVar;
        xVar.m(attributeSet, i4);
        xVar.b();
        this.f11562e = new C0855w(this);
    }

    public Editable getText() {
        return super.getText();
    }
}
