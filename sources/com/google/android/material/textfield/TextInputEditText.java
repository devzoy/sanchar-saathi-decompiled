package com.google.android.material.textfield;

import V1.a;
import V1.c;
import V1.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import g2.e;
import g2.i;
import o2.C0822a;
import p.C0843j;

public class TextInputEditText extends C0843j {

    /* renamed from: f  reason: collision with root package name */
    public final Rect f8069f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8070g;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f2977l);
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f8070g && rect != null) {
            textInputLayout.getFocusedRect(this.f8069f);
            rect.bottom = this.f8069f.bottom;
        }
    }

    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!(textInputLayout == null || !this.f8070g || rect == null)) {
            textInputLayout.getGlobalVisibleRect(this.f8069f, point);
            rect.bottom = this.f8069f.bottom;
        }
        return globalVisibleRect;
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.O()) ? super.getHint() : textInputLayout.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.O() && super.getHint() == null && e.a()) {
            setHint("");
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f8070g) {
            this.f8069f.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(c.f3001D), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f8069f, true);
        }
        return requestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z4) {
        this.f8070g = z4;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i4) {
        super(C0822a.c(context, attributeSet, i4, 0), attributeSet, i4);
        this.f8069f = new Rect();
        TypedArray h4 = i.h(context, attributeSet, j.p4, i4, V1.i.f3123d, new int[0]);
        setTextInputLayoutFocusedRectEnabled(h4.getBoolean(j.q4, false));
        h4.recycle();
    }
}
