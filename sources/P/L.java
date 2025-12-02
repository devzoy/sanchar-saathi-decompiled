package p;

import S.K;
import X.f;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import h.C0645a;
import java.lang.reflect.Field;
import k.C0764a;

public class L extends ListView {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f11380c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public int f11381d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f11382e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f11383f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f11384g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f11385h;

    /* renamed from: i  reason: collision with root package name */
    public Field f11386i;

    /* renamed from: j  reason: collision with root package name */
    public a f11387j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11388k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f11389l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11390m;

    /* renamed from: n  reason: collision with root package name */
    public K f11391n;

    /* renamed from: o  reason: collision with root package name */
    public f f11392o;

    /* renamed from: p  reason: collision with root package name */
    public b f11393p;

    public static class a extends C0764a {

        /* renamed from: d  reason: collision with root package name */
        public boolean f11394d = true;

        public a(Drawable drawable) {
            super(drawable);
        }

        public void c(boolean z4) {
            this.f11394d = z4;
        }

        public void draw(Canvas canvas) {
            if (this.f11394d) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f4, float f5) {
            if (this.f11394d) {
                super.setHotspot(f4, f5);
            }
        }

        public void setHotspotBounds(int i4, int i5, int i6, int i7) {
            if (this.f11394d) {
                super.setHotspotBounds(i4, i5, i6, i7);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f11394d) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z4, boolean z5) {
            if (this.f11394d) {
                return super.setVisible(z4, z5);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void a() {
            L l4 = L.this;
            l4.f11393p = null;
            l4.removeCallbacks(this);
        }

        public void b() {
            L.this.post(this);
        }

        public void run() {
            L l4 = L.this;
            l4.f11393p = null;
            l4.drawableStateChanged();
        }
    }

    public L(Context context, boolean z4) {
        super(context, (AttributeSet) null, C0645a.f9189w);
        this.f11389l = z4;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f11386i = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e4) {
            e4.printStackTrace();
        }
    }

    public final void a() {
        this.f11390m = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f11385h - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        K k4 = this.f11391n;
        if (k4 != null) {
            k4.c();
            this.f11391n = null;
        }
    }

    public final void b(View view, int i4) {
        performItemClick(view, i4, getItemIdAtPosition(i4));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (!this.f11380c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f11380c);
            selector.draw(canvas);
        }
    }

    public int d(int i4, int i5, int i6, int i7, int i8) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i9 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        View view = null;
        while (i10 < count) {
            int itemViewType = adapter.getItemViewType(i10);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(i10, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            view.measure(i4, i13 > 0 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i10 > 0) {
                i9 += dividerHeight;
            }
            i9 += view.getMeasuredHeight();
            if (i9 >= i7) {
                return (i8 < 0 || i10 <= i8 || i12 <= 0 || i9 == i7) ? i7 : i12;
            }
            if (i8 >= 0 && i10 >= i8) {
                i12 = i9;
            }
            i10++;
        }
        return i9;
    }

    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.f11393p == null) {
            super.drawableStateChanged();
            j(true);
            l();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r3 = r1
            r9 = r2
            goto L_0x0046
        L_0x0011:
            r9 = r2
            r3 = r9
            goto L_0x0046
        L_0x0014:
            r3 = r1
            goto L_0x0017
        L_0x0016:
            r3 = r2
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = r1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r1) goto L_0x000e
            r7.b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            X.f r9 = r7.f11392o
            if (r9 != 0) goto L_0x005a
            X.f r9 = new X.f
            r9.<init>(r7)
            r7.f11392o = r9
        L_0x005a:
            X.f r9 = r7.f11392o
            r9.m(r1)
            X.f r9 = r7.f11392o
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            X.f r8 = r7.f11392o
            if (r8 == 0) goto L_0x006c
            r8.m(r2)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.L.e(android.view.MotionEvent, int):boolean");
    }

    public final void f(int i4, View view) {
        Rect rect = this.f11380c;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f11381d;
        rect.top -= this.f11382e;
        rect.right += this.f11383f;
        rect.bottom += this.f11384g;
        try {
            boolean z4 = this.f11386i.getBoolean(this);
            if (view.isEnabled() != z4) {
                this.f11386i.set(this, Boolean.valueOf(!z4));
                if (i4 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
        }
    }

    public final void g(int i4, View view) {
        Drawable selector = getSelector();
        boolean z4 = true;
        boolean z5 = (selector == null || i4 == -1) ? false : true;
        if (z5) {
            selector.setVisible(false, false);
        }
        f(i4, view);
        if (z5) {
            Rect rect = this.f11380c;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z4 = false;
            }
            selector.setVisible(z4, false);
            K.a.e(selector, exactCenterX, exactCenterY);
        }
    }

    public final void h(int i4, View view, float f4, float f5) {
        g(i4, view);
        Drawable selector = getSelector();
        if (selector != null && i4 != -1) {
            K.a.e(selector, f4, f5);
        }
    }

    public boolean hasFocus() {
        return this.f11389l || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f11389l || super.hasWindowFocus();
    }

    public final void i(View view, int i4, float f4, float f5) {
        View childAt;
        this.f11390m = true;
        drawableHotspotChanged(f4, f5);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i5 = this.f11385h;
        if (!(i5 == -1 || (childAt = getChildAt(i5 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f11385h = i4;
        view.drawableHotspotChanged(f4 - ((float) view.getLeft()), f5 - ((float) view.getTop()));
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i4, view, f4, f5);
        j(false);
        refreshDrawableState();
    }

    public boolean isFocused() {
        return this.f11389l || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f11389l && this.f11388k) || super.isInTouchMode();
    }

    public final void j(boolean z4) {
        a aVar = this.f11387j;
        if (aVar != null) {
            aVar.c(z4);
        }
    }

    public final boolean k() {
        return this.f11390m;
    }

    public final void l() {
        Drawable selector = getSelector();
        if (selector != null && k() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public void onDetachedFromWindow() {
        this.f11393p = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f11393p == null) {
            b bVar = new b();
            this.f11393p = bVar;
            bVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                l();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f11385h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f11393p;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z4) {
        this.f11388k = z4;
    }

    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f11387j = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f11381d = rect.left;
        this.f11382e = rect.top;
        this.f11383f = rect.right;
        this.f11384g = rect.bottom;
    }
}
