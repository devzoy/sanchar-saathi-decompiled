package p;

import X.h;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import j.C0754a;

/* renamed from: p.g  reason: case insensitive filesystem */
public class C0840g extends CheckedTextView {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f11540d = {16843016};

    /* renamed from: c  reason: collision with root package name */
    public final C0856x f11541c;

    public C0840g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0856x xVar = this.f11541c;
        if (xVar != null) {
            xVar.b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0844k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCheckMarkDrawable(int i4) {
        setCheckMarkDrawable(C0754a.b(getContext(), i4));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.o(this, callback));
    }

    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C0856x xVar = this.f11541c;
        if (xVar != null) {
            xVar.q(context, i4);
        }
    }

    public C0840g(Context context, AttributeSet attributeSet, int i4) {
        super(c0.b(context), attributeSet, i4);
        b0.a(this, getContext());
        C0856x xVar = new C0856x(this);
        this.f11541c = xVar;
        xVar.m(attributeSet, i4);
        xVar.b();
        f0 v4 = f0.v(getContext(), attributeSet, f11540d, i4, 0);
        setCheckMarkDrawable(v4.g(0));
        v4.w();
    }
}
