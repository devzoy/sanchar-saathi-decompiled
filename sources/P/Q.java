package p;

import S.C;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import h.C0645a;
import h.j;
import java.lang.reflect.Method;
import o.C0813f;

public class Q implements C0813f {

    /* renamed from: I  reason: collision with root package name */
    public static Method f11407I;

    /* renamed from: J  reason: collision with root package name */
    public static Method f11408J;

    /* renamed from: A  reason: collision with root package name */
    public final e f11409A;

    /* renamed from: B  reason: collision with root package name */
    public final c f11410B;

    /* renamed from: C  reason: collision with root package name */
    public Runnable f11411C;

    /* renamed from: D  reason: collision with root package name */
    public final Handler f11412D;

    /* renamed from: E  reason: collision with root package name */
    public final Rect f11413E;

    /* renamed from: F  reason: collision with root package name */
    public Rect f11414F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f11415G;

    /* renamed from: H  reason: collision with root package name */
    public PopupWindow f11416H;

    /* renamed from: c  reason: collision with root package name */
    public Context f11417c;

    /* renamed from: d  reason: collision with root package name */
    public ListAdapter f11418d;

    /* renamed from: e  reason: collision with root package name */
    public L f11419e;

    /* renamed from: f  reason: collision with root package name */
    public int f11420f;

    /* renamed from: g  reason: collision with root package name */
    public int f11421g;

    /* renamed from: h  reason: collision with root package name */
    public int f11422h;

    /* renamed from: i  reason: collision with root package name */
    public int f11423i;

    /* renamed from: j  reason: collision with root package name */
    public int f11424j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11425k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f11426l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11427m;

    /* renamed from: n  reason: collision with root package name */
    public int f11428n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f11429o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f11430p;

    /* renamed from: q  reason: collision with root package name */
    public int f11431q;

    /* renamed from: r  reason: collision with root package name */
    public View f11432r;

    /* renamed from: s  reason: collision with root package name */
    public int f11433s;

    /* renamed from: t  reason: collision with root package name */
    public DataSetObserver f11434t;

    /* renamed from: u  reason: collision with root package name */
    public View f11435u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f11436v;

    /* renamed from: w  reason: collision with root package name */
    public AdapterView.OnItemClickListener f11437w;

    /* renamed from: x  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f11438x;

    /* renamed from: y  reason: collision with root package name */
    public final g f11439y;

    /* renamed from: z  reason: collision with root package name */
    public final f f11440z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            View t4 = Q.this.t();
            if (t4 != null && t4.getWindowToken() != null) {
                Q.this.a();
            }
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        public void onItemSelected(AdapterView adapterView, View view, int i4, long j4) {
            L l4;
            if (i4 != -1 && (l4 = Q.this.f11419e) != null) {
                l4.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            Q.this.r();
        }
    }

    public class d extends DataSetObserver {
        public d() {
        }

        public void onChanged() {
            if (Q.this.c()) {
                Q.this.a();
            }
        }

        public void onInvalidated() {
            Q.this.dismiss();
        }
    }

    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i4) {
            if (i4 == 1 && !Q.this.A() && Q.this.f11416H.getContentView() != null) {
                Q q4 = Q.this;
                q4.f11412D.removeCallbacks(q4.f11439y);
                Q.this.f11439y.run();
            }
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x4 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = Q.this.f11416H) != null && popupWindow.isShowing() && x4 >= 0 && x4 < Q.this.f11416H.getWidth() && y4 >= 0 && y4 < Q.this.f11416H.getHeight()) {
                Q q4 = Q.this;
                q4.f11412D.postDelayed(q4.f11439y, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                Q q5 = Q.this;
                q5.f11412D.removeCallbacks(q5.f11439y);
                return false;
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        public void run() {
            L l4 = Q.this.f11419e;
            if (l4 != null && C.L(l4) && Q.this.f11419e.getCount() > Q.this.f11419e.getChildCount()) {
                int childCount = Q.this.f11419e.getChildCount();
                Q q4 = Q.this;
                if (childCount <= q4.f11431q) {
                    q4.f11416H.setInputMethodMode(2);
                    Q.this.a();
                }
            }
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f11407I = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f11408J = cls.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public Q(Context context) {
        this(context, (AttributeSet) null, C0645a.f9156A);
    }

    public boolean A() {
        return this.f11416H.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.f11415G;
    }

    public final void C() {
        View view = this.f11432r;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f11432r);
            }
        }
    }

    public void D(View view) {
        this.f11435u = view;
    }

    public void E(int i4) {
        this.f11416H.setAnimationStyle(i4);
    }

    public void F(int i4) {
        Drawable background = this.f11416H.getBackground();
        if (background != null) {
            background.getPadding(this.f11413E);
            Rect rect = this.f11413E;
            this.f11421g = rect.left + rect.right + i4;
            return;
        }
        Q(i4);
    }

    public void G(int i4) {
        this.f11428n = i4;
    }

    public void H(Rect rect) {
        this.f11414F = rect != null ? new Rect(rect) : null;
    }

    public void I(int i4) {
        this.f11416H.setInputMethodMode(i4);
    }

    public void J(boolean z4) {
        this.f11415G = z4;
        this.f11416H.setFocusable(z4);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.f11416H.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f11437w = onItemClickListener;
    }

    public void M(boolean z4) {
        this.f11427m = true;
        this.f11426l = z4;
    }

    public final void N(boolean z4) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f11407I;
            if (method != null) {
                try {
                    method.invoke(this.f11416H, new Object[]{Boolean.valueOf(z4)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f11416H.setIsClippedToScreen(z4);
        }
    }

    public void O(int i4) {
        this.f11433s = i4;
    }

    public void P(int i4) {
        L l4 = this.f11419e;
        if (c() && l4 != null) {
            l4.setListSelectionHidden(false);
            l4.setSelection(i4);
            if (l4.getChoiceMode() != 0) {
                l4.setItemChecked(i4, true);
            }
        }
    }

    public void Q(int i4) {
        this.f11421g = i4;
    }

    public void a() {
        int q4 = q();
        boolean A4 = A();
        X.g.b(this.f11416H, this.f11424j);
        boolean z4 = true;
        if (!this.f11416H.isShowing()) {
            int i4 = this.f11421g;
            if (i4 == -1) {
                i4 = -1;
            } else if (i4 == -2) {
                i4 = t().getWidth();
            }
            int i5 = this.f11420f;
            if (i5 == -1) {
                q4 = -1;
            } else if (i5 != -2) {
                q4 = i5;
            }
            this.f11416H.setWidth(i4);
            this.f11416H.setHeight(q4);
            N(true);
            PopupWindow popupWindow = this.f11416H;
            if (this.f11430p || this.f11429o) {
                z4 = false;
            }
            popupWindow.setOutsideTouchable(z4);
            this.f11416H.setTouchInterceptor(this.f11440z);
            if (this.f11427m) {
                X.g.a(this.f11416H, this.f11426l);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f11408J;
                if (method != null) {
                    try {
                        method.invoke(this.f11416H, new Object[]{this.f11414F});
                    } catch (Exception e4) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                    }
                }
            } else {
                this.f11416H.setEpicenterBounds(this.f11414F);
            }
            X.g.c(this.f11416H, t(), this.f11422h, this.f11423i, this.f11428n);
            this.f11419e.setSelection(-1);
            if (!this.f11415G || this.f11419e.isInTouchMode()) {
                r();
            }
            if (!this.f11415G) {
                this.f11412D.post(this.f11410B);
            }
        } else if (C.L(t())) {
            int i6 = this.f11421g;
            if (i6 == -1) {
                i6 = -1;
            } else if (i6 == -2) {
                i6 = t().getWidth();
            }
            int i7 = this.f11420f;
            if (i7 == -1) {
                if (!A4) {
                    q4 = -1;
                }
                if (A4) {
                    this.f11416H.setWidth(this.f11421g == -1 ? -1 : 0);
                    this.f11416H.setHeight(0);
                } else {
                    this.f11416H.setWidth(this.f11421g == -1 ? -1 : 0);
                    this.f11416H.setHeight(-1);
                }
            } else if (i7 != -2) {
                q4 = i7;
            }
            PopupWindow popupWindow2 = this.f11416H;
            if (this.f11430p || this.f11429o) {
                z4 = false;
            }
            popupWindow2.setOutsideTouchable(z4);
            this.f11416H.update(t(), this.f11422h, this.f11423i, i6 < 0 ? -1 : i6, q4 < 0 ? -1 : q4);
        }
    }

    public int b() {
        return this.f11422h;
    }

    public boolean c() {
        return this.f11416H.isShowing();
    }

    public void dismiss() {
        this.f11416H.dismiss();
        C();
        this.f11416H.setContentView((View) null);
        this.f11419e = null;
        this.f11412D.removeCallbacks(this.f11439y);
    }

    public Drawable f() {
        return this.f11416H.getBackground();
    }

    public ListView g() {
        return this.f11419e;
    }

    public void i(Drawable drawable) {
        this.f11416H.setBackgroundDrawable(drawable);
    }

    public void j(int i4) {
        this.f11423i = i4;
        this.f11425k = true;
    }

    public void l(int i4) {
        this.f11422h = i4;
    }

    public int n() {
        if (!this.f11425k) {
            return 0;
        }
        return this.f11423i;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f11434t;
        if (dataSetObserver == null) {
            this.f11434t = new d();
        } else {
            ListAdapter listAdapter2 = this.f11418d;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f11418d = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f11434t);
        }
        L l4 = this.f11419e;
        if (l4 != null) {
            l4.setAdapter(this.f11418d);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: p.L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: p.L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: p.L} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int q() {
        /*
            r12 = this;
            p.L r0 = r12.f11419e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00be
            android.content.Context r0 = r12.f11417c
            p.Q$a r5 = new p.Q$a
            r5.<init>()
            r12.f11411C = r5
            boolean r5 = r12.f11415G
            r5 = r5 ^ r3
            p.L r5 = r12.s(r0, r5)
            r12.f11419e = r5
            android.graphics.drawable.Drawable r6 = r12.f11436v
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            p.L r5 = r12.f11419e
            android.widget.ListAdapter r6 = r12.f11418d
            r5.setAdapter(r6)
            p.L r5 = r12.f11419e
            android.widget.AdapterView$OnItemClickListener r6 = r12.f11437w
            r5.setOnItemClickListener(r6)
            p.L r5 = r12.f11419e
            r5.setFocusable(r3)
            p.L r5 = r12.f11419e
            r5.setFocusableInTouchMode(r3)
            p.L r5 = r12.f11419e
            p.Q$b r6 = new p.Q$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            p.L r5 = r12.f11419e
            p.Q$e r6 = r12.f11409A
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f11438x
            if (r5 == 0) goto L_0x0054
            p.L r6 = r12.f11419e
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            p.L r5 = r12.f11419e
            android.view.View r6 = r12.f11432r
            if (r6 == 0) goto L_0x00b7
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f11433s
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f11433s
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.f11421g
            if (r0 < 0) goto L_0x009b
            r5 = r1
            goto L_0x009d
        L_0x009b:
            r0 = r4
            r5 = r0
        L_0x009d:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b8
        L_0x00b7:
            r0 = r4
        L_0x00b8:
            android.widget.PopupWindow r6 = r12.f11416H
            r6.setContentView(r5)
            goto L_0x00dc
        L_0x00be:
            android.widget.PopupWindow r0 = r12.f11416H
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f11432r
            if (r0 == 0) goto L_0x00db
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dc
        L_0x00db:
            r0 = r4
        L_0x00dc:
            android.widget.PopupWindow r5 = r12.f11416H
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f8
            android.graphics.Rect r6 = r12.f11413E
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f11413E
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f11425k
            if (r7 != 0) goto L_0x00fe
            int r6 = -r6
            r12.f11423i = r6
            goto L_0x00fe
        L_0x00f8:
            android.graphics.Rect r5 = r12.f11413E
            r5.setEmpty()
            r5 = r4
        L_0x00fe:
            android.widget.PopupWindow r6 = r12.f11416H
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r3 = r4
        L_0x0109:
            android.view.View r4 = r12.t()
            int r6 = r12.f11423i
            int r3 = r12.u(r4, r6, r3)
            boolean r4 = r12.f11429o
            if (r4 != 0) goto L_0x017b
            int r4 = r12.f11420f
            if (r4 != r2) goto L_0x011c
            goto L_0x017b
        L_0x011c:
            int r4 = r12.f11421g
            r6 = -2
            if (r4 == r6) goto L_0x0144
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012b
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
        L_0x0129:
            r7 = r1
            goto L_0x015d
        L_0x012b:
            android.content.Context r2 = r12.f11417c
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f11413E
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0129
        L_0x0144:
            android.content.Context r2 = r12.f11417c
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f11413E
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0129
        L_0x015d:
            p.L r6 = r12.f11419e
            int r10 = r3 - r0
            r11 = -1
            r8 = 0
            r9 = -1
            int r1 = r6.d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0179
            p.L r2 = r12.f11419e
            int r2 = r2.getPaddingTop()
            p.L r3 = r12.f11419e
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0179:
            int r1 = r1 + r0
            return r1
        L_0x017b:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.Q.q():int");
    }

    public void r() {
        L l4 = this.f11419e;
        if (l4 != null) {
            l4.setListSelectionHidden(true);
            l4.requestLayout();
        }
    }

    public L s(Context context, boolean z4) {
        return new L(context, z4);
    }

    public View t() {
        return this.f11435u;
    }

    public final int u(View view, int i4, boolean z4) {
        return this.f11416H.getMaxAvailableHeight(view, i4, z4);
    }

    public Object v() {
        if (!c()) {
            return null;
        }
        return this.f11419e.getSelectedItem();
    }

    public long w() {
        if (!c()) {
            return Long.MIN_VALUE;
        }
        return this.f11419e.getSelectedItemId();
    }

    public int x() {
        if (!c()) {
            return -1;
        }
        return this.f11419e.getSelectedItemPosition();
    }

    public View y() {
        if (!c()) {
            return null;
        }
        return this.f11419e.getSelectedView();
    }

    public int z() {
        return this.f11421g;
    }

    public Q(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public Q(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f11420f = -2;
        this.f11421g = -2;
        this.f11424j = 1002;
        this.f11428n = 0;
        this.f11429o = false;
        this.f11430p = false;
        this.f11431q = Integer.MAX_VALUE;
        this.f11433s = 0;
        this.f11439y = new g();
        this.f11440z = new f();
        this.f11409A = new e();
        this.f11410B = new c();
        this.f11413E = new Rect();
        this.f11417c = context;
        this.f11412D = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f9522o1, i4, i5);
        this.f11422h = obtainStyledAttributes.getDimensionPixelOffset(j.f9527p1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(j.f9532q1, 0);
        this.f11423i = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f11425k = true;
        }
        obtainStyledAttributes.recycle();
        C0849p pVar = new C0849p(context, attributeSet, i4, i5);
        this.f11416H = pVar;
        pVar.setInputMethodMode(1);
    }
}
