package androidx.appcompat.widget;

import S.C;
import S.K;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import h.C0645a;
import h.f;
import h.g;
import h.j;
import n.b;
import p.C0834a;
import p.f0;
import p.i0;

public class ActionBarContextView extends C0834a {

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f4371k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f4372l;

    /* renamed from: m  reason: collision with root package name */
    public View f4373m;

    /* renamed from: n  reason: collision with root package name */
    public View f4374n;

    /* renamed from: o  reason: collision with root package name */
    public LinearLayout f4375o;

    /* renamed from: p  reason: collision with root package name */
    public TextView f4376p;

    /* renamed from: q  reason: collision with root package name */
    public TextView f4377q;

    /* renamed from: r  reason: collision with root package name */
    public int f4378r;

    /* renamed from: s  reason: collision with root package name */
    public int f4379s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4380t;

    /* renamed from: u  reason: collision with root package name */
    public int f4381u;

    public class a implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b f4382c;

        public a(b bVar) {
            this.f4382c = bVar;
        }

        public void onClick(View view) {
            this.f4382c.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public /* bridge */ /* synthetic */ K f(int i4, long j4) {
        return super.f(i4, j4);
    }

    public void g() {
        if (this.f4373m == null) {
            k();
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f4372l;
    }

    public CharSequence getTitle() {
        return this.f4371k;
    }

    public void h(b bVar) {
        View view = this.f4373m;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f4381u, this, false);
            this.f4373m = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f4373m);
        }
        this.f4373m.findViewById(f.f9277i).setOnClickListener(new a(bVar));
        e eVar = (e) bVar.e();
        a aVar = this.f11476f;
        if (aVar != null) {
            aVar.y();
        }
        a aVar2 = new a(getContext());
        this.f11476f = aVar2;
        aVar2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f11476f, this.f11474d);
        ActionMenuView actionMenuView = (ActionMenuView) this.f11476f.o(this);
        this.f11475e = actionMenuView;
        C.j0(actionMenuView, (Drawable) null);
        addView(this.f11475e, layoutParams);
    }

    public final void i() {
        if (this.f4375o == null) {
            LayoutInflater.from(getContext()).inflate(g.f9295a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4375o = linearLayout;
            this.f4376p = (TextView) linearLayout.findViewById(f.f9273e);
            this.f4377q = (TextView) this.f4375o.findViewById(f.f9272d);
            if (this.f4378r != 0) {
                this.f4376p.setTextAppearance(getContext(), this.f4378r);
            }
            if (this.f4379s != 0) {
                this.f4377q.setTextAppearance(getContext(), this.f4379s);
            }
        }
        this.f4376p.setText(this.f4371k);
        this.f4377q.setText(this.f4372l);
        boolean isEmpty = TextUtils.isEmpty(this.f4371k);
        boolean isEmpty2 = TextUtils.isEmpty(this.f4372l);
        int i4 = 8;
        this.f4377q.setVisibility(!isEmpty2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f4375o;
        if (!isEmpty || !isEmpty2) {
            i4 = 0;
        }
        linearLayout2.setVisibility(i4);
        if (this.f4375o.getParent() == null) {
            addView(this.f4375o);
        }
    }

    public boolean j() {
        return this.f4380t;
    }

    public void k() {
        removeAllViews();
        this.f4374n = null;
        this.f11475e = null;
    }

    public boolean l() {
        a aVar = this.f11476f;
        if (aVar != null) {
            return aVar.K();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f11476f;
        if (aVar != null) {
            aVar.B();
            this.f11476f.C();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f4371k);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        boolean b4 = i0.b(this);
        int paddingRight = b4 ? (i6 - i4) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        View view = this.f4373m;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4373m.getLayoutParams();
            int i8 = b4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i9 = b4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d4 = C0834a.d(paddingRight, i8, b4);
            paddingRight = C0834a.d(d4 + e(this.f4373m, d4, paddingTop, paddingTop2, b4), i9, b4);
        }
        int i10 = paddingRight;
        LinearLayout linearLayout = this.f4375o;
        if (!(linearLayout == null || this.f4374n != null || linearLayout.getVisibility() == 8)) {
            i10 += e(this.f4375o, i10, paddingTop, paddingTop2, b4);
        }
        int i11 = i10;
        View view2 = this.f4374n;
        if (view2 != null) {
            e(view2, i11, paddingTop, paddingTop2, b4);
        }
        int paddingLeft = b4 ? getPaddingLeft() : (i6 - i4) - getPaddingRight();
        ActionMenuView actionMenuView = this.f11475e;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b4);
        }
    }

    public void onMeasure(int i4, int i5) {
        int i6 = 1073741824;
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i5) != 0) {
            int size = View.MeasureSpec.getSize(i4);
            int i7 = this.f11477g;
            if (i7 <= 0) {
                i7 = View.MeasureSpec.getSize(i5);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i8 = i7 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
            View view = this.f4373m;
            if (view != null) {
                int c4 = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4373m.getLayoutParams();
                paddingLeft = c4 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f11475e;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f11475e, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f4375o;
            if (linearLayout != null && this.f4374n == null) {
                if (this.f4380t) {
                    this.f4375o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f4375o.getMeasuredWidth();
                    boolean z4 = measuredWidth <= paddingLeft;
                    if (z4) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f4375o.setVisibility(z4 ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f4374n;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i9 = layoutParams.width;
                int i10 = i9 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i9 >= 0) {
                    paddingLeft = Math.min(i9, paddingLeft);
                }
                int i11 = layoutParams.height;
                if (i11 == -2) {
                    i6 = Integer.MIN_VALUE;
                }
                if (i11 >= 0) {
                    i8 = Math.min(i11, i8);
                }
                this.f4374n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i10), View.MeasureSpec.makeMeasureSpec(i8, i6));
            }
            if (this.f11477g <= 0) {
                int childCount = getChildCount();
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    int measuredHeight = getChildAt(i13).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i12) {
                        i12 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i12);
                return;
            }
            setMeasuredDimension(size, i7);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i4) {
        this.f11477g = i4;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f4374n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f4374n = view;
        if (!(view == null || (linearLayout = this.f4375o) == null)) {
            removeView(linearLayout);
            this.f4375o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4372l = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4371k = charSequence;
        i();
    }

    public void setTitleOptional(boolean z4) {
        if (z4 != this.f4380t) {
            requestLayout();
        }
        this.f4380t = z4;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i4) {
        super.setVisibility(i4);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0645a.f9173g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        f0 v4 = f0.v(context, attributeSet, j.f9570y, i4, 0);
        C.j0(this, v4.g(j.f9575z));
        this.f4378r = v4.n(j.f9344D, 0);
        this.f4379s = v4.n(j.f9339C, 0);
        this.f11477g = v4.m(j.f9334B, 0);
        this.f4381u = v4.n(j.f9329A, g.f9298d);
        v4.w();
    }
}
