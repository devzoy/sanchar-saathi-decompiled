package com.google.android.material.textfield;

import S.C;
import T.m;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import b2.C0393a;
import com.google.android.material.textfield.TextInputLayout;
import j.C0754a;
import l2.k;
import n2.C0803c;

public class b extends C0803c {

    /* renamed from: q  reason: collision with root package name */
    public static final boolean f8183q = true;

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f8184d = new a();

    /* renamed from: e  reason: collision with root package name */
    public final View.OnFocusChangeListener f8185e = new c();

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.e f8186f = new d(this.f11234a);

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.f f8187g = new e();

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout.g f8188h = new f();

    /* renamed from: i  reason: collision with root package name */
    public boolean f8189i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8190j = false;

    /* renamed from: k  reason: collision with root package name */
    public long f8191k = Long.MAX_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public StateListDrawable f8192l;

    /* renamed from: m  reason: collision with root package name */
    public l2.g f8193m;

    /* renamed from: n  reason: collision with root package name */
    public AccessibilityManager f8194n;

    /* renamed from: o  reason: collision with root package name */
    public ValueAnimator f8195o;

    /* renamed from: p  reason: collision with root package name */
    public ValueAnimator f8196p;

    public class a extends g2.h {

        /* renamed from: com.google.android.material.textfield.b$a$a  reason: collision with other inner class name */
        public class C0134a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f8198e;

            public C0134a(AutoCompleteTextView autoCompleteTextView) {
                this.f8198e = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f8198e.isPopupShowing();
                b.this.E(isPopupShowing);
                boolean unused = b.this.f8189i = isPopupShowing;
            }
        }

        public a() {
        }

        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView e4 = b.y(b.this.f11234a.getEditText());
            if (b.this.f8194n.isTouchExplorationEnabled() && b.D(e4) && !b.this.f11236c.hasFocus()) {
                e4.dismissDropDown();
            }
            e4.post(new C0134a(e4));
        }
    }

    /* renamed from: com.google.android.material.textfield.b$b  reason: collision with other inner class name */
    public class C0135b implements ValueAnimator.AnimatorUpdateListener {
        public C0135b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.f11236c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        public void onFocusChange(View view, boolean z4) {
            b.this.f11234a.setEndIconActivated(z4);
            if (!z4) {
                b.this.E(false);
                boolean unused = b.this.f8189i = false;
            }
        }
    }

    public class d extends TextInputLayout.e {
        public d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        public void g(View view, m mVar) {
            super.g(view, mVar);
            if (!b.D(b.this.f11234a.getEditText())) {
                mVar.c0(Spinner.class.getName());
            }
            if (mVar.P()) {
                mVar.n0((CharSequence) null);
            }
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView e4 = b.y(b.this.f11234a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && b.this.f8194n.isTouchExplorationEnabled() && !b.D(b.this.f11234a.getEditText())) {
                b.this.H(e4);
            }
        }
    }

    public class e implements TextInputLayout.f {
        public e() {
        }

        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView e4 = b.y(textInputLayout.getEditText());
            b.this.F(e4);
            b.this.v(e4);
            b.this.G(e4);
            e4.setThreshold(0);
            e4.removeTextChangedListener(b.this.f8184d);
            e4.addTextChangedListener(b.this.f8184d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!b.D(e4)) {
                C.q0(b.this.f11236c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(b.this.f8186f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    public class f implements TextInputLayout.g {

        public class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f8205e;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.f8205e = autoCompleteTextView;
            }

            public void run() {
                this.f8205e.removeTextChangedListener(b.this.f8184d);
            }
        }

        public f() {
        }

        public void a(TextInputLayout textInputLayout, int i4) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i4 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == b.this.f8185e) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                if (b.f8183q) {
                    autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
                }
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        public void onClick(View view) {
            b.this.H((AutoCompleteTextView) b.this.f11234a.getEditText());
        }
    }

    public class h implements View.OnTouchListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ AutoCompleteTextView f8208c;

        public h(AutoCompleteTextView autoCompleteTextView) {
            this.f8208c = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (b.this.C()) {
                    boolean unused = b.this.f8189i = false;
                }
                b.this.H(this.f8208c);
            }
            return false;
        }
    }

    public class i implements AutoCompleteTextView.OnDismissListener {
        public i() {
        }

        public void onDismiss() {
            boolean unused = b.this.f8189i = true;
            long unused2 = b.this.f8191k = System.currentTimeMillis();
            b.this.E(false);
        }
    }

    public class j extends AnimatorListenerAdapter {
        public j() {
        }

        public void onAnimationEnd(Animator animator) {
            b bVar = b.this;
            bVar.f11236c.setChecked(bVar.f8190j);
            b.this.f8196p.start();
        }
    }

    public b(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    private void B() {
        this.f8196p = z(67, 0.0f, 1.0f);
        ValueAnimator z4 = z(50, 1.0f, 0.0f);
        this.f8195o = z4;
        z4.addListener(new j());
    }

    public static boolean D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public static AutoCompleteTextView y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final l2.g A(float f4, float f5, float f6, int i4) {
        k m4 = k.a().A(f4).E(f4).s(f5).w(f5).m();
        l2.g m5 = l2.g.m(this.f11235b, f6);
        m5.setShapeAppearanceModel(m4);
        m5.W(0, i4, 0, i4);
        return m5;
    }

    public final boolean C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f8191k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    public final void E(boolean z4) {
        if (this.f8190j != z4) {
            this.f8190j = z4;
            this.f8196p.cancel();
            this.f8195o.start();
        }
    }

    public final void F(AutoCompleteTextView autoCompleteTextView) {
        if (f8183q) {
            int boxBackgroundMode = this.f11234a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f8193m);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f8192l);
            }
        }
    }

    public final void G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f8185e);
        if (f8183q) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    public final void H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (C()) {
                this.f8189i = false;
            }
            if (!this.f8189i) {
                if (f8183q) {
                    E(!this.f8190j);
                } else {
                    this.f8190j = !this.f8190j;
                    this.f11236c.toggle();
                }
                if (this.f8190j) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f8189i = false;
        }
    }

    public void a() {
        float dimensionPixelOffset = (float) this.f11235b.getResources().getDimensionPixelOffset(V1.c.f3005H);
        float dimensionPixelOffset2 = (float) this.f11235b.getResources().getDimensionPixelOffset(V1.c.f3002E);
        int dimensionPixelOffset3 = this.f11235b.getResources().getDimensionPixelOffset(V1.c.f3003F);
        l2.g A4 = A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        l2.g A5 = A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f8193m = A4;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f8192l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, A4);
        this.f8192l.addState(new int[0], A5);
        this.f11234a.setEndIconDrawable(C0754a.b(this.f11235b, f8183q ? V1.d.f3040d : V1.d.f3041e));
        TextInputLayout textInputLayout = this.f11234a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(V1.h.f3110g));
        this.f11234a.setEndIconOnClickListener(new g());
        this.f11234a.e(this.f8187g);
        this.f11234a.f(this.f8188h);
        B();
        this.f8194n = (AccessibilityManager) this.f11235b.getSystemService("accessibility");
    }

    public boolean b(int i4) {
        return i4 != 0;
    }

    public boolean d() {
        return true;
    }

    public final void v(AutoCompleteTextView autoCompleteTextView) {
        if (!D(autoCompleteTextView)) {
            int boxBackgroundMode = this.f11234a.getBoxBackgroundMode();
            l2.g boxBackground = this.f11234a.getBoxBackground();
            int c4 = C0393a.c(autoCompleteTextView, V1.a.f2972g);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                x(autoCompleteTextView, c4, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                w(autoCompleteTextView, c4, iArr, boxBackground);
            }
        }
    }

    public final void w(AutoCompleteTextView autoCompleteTextView, int i4, int[][] iArr, l2.g gVar) {
        int boxBackgroundColor = this.f11234a.getBoxBackgroundColor();
        int[] iArr2 = {C0393a.f(i4, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f8183q) {
            C.j0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        l2.g gVar2 = new l2.g(gVar.B());
        gVar2.U(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int B4 = C.B(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int A4 = C.A(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C.j0(autoCompleteTextView, layerDrawable);
        C.u0(autoCompleteTextView, B4, paddingTop, A4, paddingBottom);
    }

    public final void x(AutoCompleteTextView autoCompleteTextView, int i4, int[][] iArr, l2.g gVar) {
        LayerDrawable layerDrawable;
        int c4 = C0393a.c(autoCompleteTextView, V1.a.f2976k);
        l2.g gVar2 = new l2.g(gVar.B());
        int f4 = C0393a.f(i4, c4, 0.1f);
        gVar2.U(new ColorStateList(iArr, new int[]{f4, 0}));
        if (f8183q) {
            gVar2.setTint(c4);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f4, c4});
            l2.g gVar3 = new l2.g(gVar.B());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        C.j0(autoCompleteTextView, layerDrawable);
    }

    public final ValueAnimator z(int i4, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(W1.a.f3396a);
        ofFloat.setDuration((long) i4);
        ofFloat.addUpdateListener(new C0135b());
        return ofFloat;
    }
}
