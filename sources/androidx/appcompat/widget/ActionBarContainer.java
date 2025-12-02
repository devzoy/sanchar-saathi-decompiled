package androidx.appcompat.widget;

import S.C;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import h.f;
import h.j;
import p.C0835b;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public boolean f4361c;

    /* renamed from: d  reason: collision with root package name */
    public View f4362d;

    /* renamed from: e  reason: collision with root package name */
    public View f4363e;

    /* renamed from: f  reason: collision with root package name */
    public View f4364f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f4365g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f4366h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f4367i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4368j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4369k;

    /* renamed from: l  reason: collision with root package name */
    public int f4370l;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C.j0(this, new C0835b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f9450a);
        this.f4365g = obtainStyledAttributes.getDrawable(j.f9455b);
        this.f4366h = obtainStyledAttributes.getDrawable(j.f9465d);
        this.f4370l = obtainStyledAttributes.getDimensionPixelSize(j.f9495j, -1);
        boolean z4 = true;
        if (getId() == f.f9260G) {
            this.f4368j = true;
            this.f4367i = obtainStyledAttributes.getDrawable(j.f9460c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f4368j ? !(this.f4365g == null && this.f4366h == null) : this.f4367i != null) {
            z4 = false;
        }
        setWillNotDraw(z4);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4365g;
        if (drawable != null && drawable.isStateful()) {
            this.f4365g.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4366h;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4366h.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4367i;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f4367i.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f4362d;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4365g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4366h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4367i;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f4363e = findViewById(f.f9269a);
        this.f4364f = findViewById(f.f9274f);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4361c || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f4362d
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.f4368j
            if (r6 == 0) goto L_0x004b
            android.graphics.drawable.Drawable r5 = r4.f4367i
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00be
        L_0x0048:
            r9 = r0
            goto L_0x00be
        L_0x004b:
            android.graphics.drawable.Drawable r6 = r4.f4365g
            if (r6 == 0) goto L_0x00a3
            android.view.View r6 = r4.f4363e
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0075
            android.graphics.drawable.Drawable r6 = r4.f4365g
            android.view.View r7 = r4.f4363e
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f4363e
            int r8 = r8.getTop()
            android.view.View r0 = r4.f4363e
            int r0 = r0.getRight()
            android.view.View r2 = r4.f4363e
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x0075:
            android.view.View r6 = r4.f4364f
            if (r6 == 0) goto L_0x009d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x009d
            android.graphics.drawable.Drawable r6 = r4.f4365g
            android.view.View r7 = r4.f4364f
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f4364f
            int r8 = r8.getTop()
            android.view.View r0 = r4.f4364f
            int r0 = r0.getRight()
            android.view.View r2 = r4.f4364f
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x009d:
            android.graphics.drawable.Drawable r6 = r4.f4365g
            r6.setBounds(r0, r0, r0, r0)
        L_0x00a2:
            r0 = r9
        L_0x00a3:
            r4.f4369k = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.f4366h
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00be:
            if (r9 == 0) goto L_0x00c3
            r4.invalidate()
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i4, int i5) {
        int i6;
        if (this.f4363e == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i6 = this.f4370l) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i4, i5);
        if (this.f4363e != null) {
            int mode = View.MeasureSpec.getMode(i5);
            View view = this.f4362d;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f4363e) ? a(this.f4363e) : !b(this.f4364f) ? a(this.f4364f) : 0) + a(this.f4362d), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i5) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f4365g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f4365g);
        }
        this.f4365g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f4363e;
            if (view != null) {
                this.f4365g.setBounds(view.getLeft(), this.f4363e.getTop(), this.f4363e.getRight(), this.f4363e.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f4368j ? this.f4365g == null && this.f4366h == null : this.f4367i == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4367i;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f4367i);
        }
        this.f4367i = drawable;
        boolean z4 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4368j && (drawable2 = this.f4367i) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f4368j ? this.f4365g == null && this.f4366h == null : this.f4367i == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4366h;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f4366h);
        }
        this.f4366h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4369k && (drawable2 = this.f4366h) != null) {
                drawable2.setBounds(this.f4362d.getLeft(), this.f4362d.getTop(), this.f4362d.getRight(), this.f4362d.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f4368j ? this.f4365g == null && this.f4366h == null : this.f4367i == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(c cVar) {
        View view = this.f4362d;
        if (view != null) {
            removeView(view);
        }
        this.f4362d = cVar;
    }

    public void setTransitioning(boolean z4) {
        this.f4361c = z4;
        setDescendantFocusability(z4 ? 393216 : 262144);
    }

    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z4 = i4 == 0;
        Drawable drawable = this.f4365g;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
        Drawable drawable2 = this.f4366h;
        if (drawable2 != null) {
            drawable2.setVisible(z4, false);
        }
        Drawable drawable3 = this.f4367i;
        if (drawable3 != null) {
            drawable3.setVisible(z4, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f4365g && !this.f4368j) || (drawable == this.f4366h && this.f4369k) || ((drawable == this.f4367i && this.f4368j) || super.verifyDrawable(drawable));
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }
}
