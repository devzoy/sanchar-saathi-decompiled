package com.google.android.material.internal;

import S.C;
import S.C0310a;
import T.m;
import V1.c;
import V1.e;
import X.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.b;
import g2.d;
import h.C0645a;
import p.g0;

public class NavigationMenuItemView extends d implements j.a {

    /* renamed from: H  reason: collision with root package name */
    public static final int[] f7981H = {16842912};

    /* renamed from: A  reason: collision with root package name */
    public final CheckedTextView f7982A;

    /* renamed from: B  reason: collision with root package name */
    public FrameLayout f7983B;

    /* renamed from: C  reason: collision with root package name */
    public g f7984C;

    /* renamed from: D  reason: collision with root package name */
    public ColorStateList f7985D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f7986E;

    /* renamed from: F  reason: collision with root package name */
    public Drawable f7987F;

    /* renamed from: G  reason: collision with root package name */
    public final C0310a f7988G;

    /* renamed from: x  reason: collision with root package name */
    public int f7989x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f7990y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f7991z;

    public class a extends C0310a {
        public a() {
        }

        public void g(View view, m mVar) {
            super.g(view, mVar);
            mVar.a0(NavigationMenuItemView.this.f7991z);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f7983B == null) {
                this.f7983B = (FrameLayout) ((ViewStub) findViewById(e.f3059d)).inflate();
            }
            this.f7983B.removeAllViews();
            this.f7983B.addView(view);
        }
    }

    public final void B() {
        if (D()) {
            this.f7982A.setVisibility(8);
            FrameLayout frameLayout = this.f7983B;
            if (frameLayout != null) {
                b.a aVar = (b.a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.f7983B.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f7982A.setVisibility(0);
        FrameLayout frameLayout2 = this.f7983B;
        if (frameLayout2 != null) {
            b.a aVar2 = (b.a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.f7983B.setLayoutParams(aVar2);
        }
    }

    public final StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0645a.f9185s, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f7981H, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public final boolean D() {
        return this.f7984C.getTitle() == null && this.f7984C.getIcon() == null && this.f7984C.getActionView() != null;
    }

    public boolean d() {
        return false;
    }

    public void e(g gVar, int i4) {
        this.f7984C = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C.j0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        g0.a(this, gVar.getTooltipText());
        B();
    }

    public g getItemData() {
        return this.f7984C;
    }

    public int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        g gVar = this.f7984C;
        if (gVar != null && gVar.isCheckable() && this.f7984C.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f7981H);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z4) {
        refreshDrawableState();
        if (this.f7991z != z4) {
            this.f7991z = z4;
            this.f7988G.l(this.f7982A, 2048);
        }
    }

    public void setChecked(boolean z4) {
        refreshDrawableState();
        this.f7982A.setChecked(z4);
    }

    public void setHorizontalPadding(int i4) {
        setPadding(i4, 0, i4, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f7986E) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = K.a.l(drawable).mutate();
                K.a.i(drawable, this.f7985D);
            }
            int i4 = this.f7989x;
            drawable.setBounds(0, 0, i4, i4);
        } else if (this.f7990y) {
            if (this.f7987F == null) {
                Drawable a4 = I.b.a(getResources(), V1.d.f3043g, getContext().getTheme());
                this.f7987F = a4;
                if (a4 != null) {
                    int i5 = this.f7989x;
                    a4.setBounds(0, 0, i5, i5);
                }
            }
            drawable = this.f7987F;
        }
        h.h(this.f7982A, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i4) {
        this.f7982A.setCompoundDrawablePadding(i4);
    }

    public void setIconSize(int i4) {
        this.f7989x = i4;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f7985D = colorStateList;
        this.f7986E = colorStateList != null;
        g gVar = this.f7984C;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i4) {
        this.f7982A.setMaxLines(i4);
    }

    public void setNeedsEmptyIcon(boolean z4) {
        this.f7990y = z4;
    }

    public void setTextAppearance(int i4) {
        h.m(this.f7982A, i4);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f7982A.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f7982A.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a aVar = new a();
        this.f7988G = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(V1.g.f3085c, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(c.f3012b));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(e.f3060e);
        this.f7982A = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C.g0(checkedTextView, aVar);
    }
}
