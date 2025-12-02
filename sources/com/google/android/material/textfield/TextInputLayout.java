package com.google.android.material.textfield;

import S.C;
import S.C0310a;
import S.C0320k;
import T.m;
import V1.i;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b2.C0393a;
import com.google.android.material.internal.CheckableImageButton;
import g2.C0636a;
import j.C0754a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l2.k;
import n2.C0802b;
import n2.C0803c;
import n2.C0804d;
import p.C0842i;
import p.C0857y;
import p.K;

public class TextInputLayout extends LinearLayout {

    /* renamed from: L0  reason: collision with root package name */
    public static final int f8071L0 = i.f3124e;

    /* renamed from: A  reason: collision with root package name */
    public boolean f8072A;

    /* renamed from: A0  reason: collision with root package name */
    public int f8073A0;

    /* renamed from: B  reason: collision with root package name */
    public CharSequence f8074B;

    /* renamed from: B0  reason: collision with root package name */
    public int f8075B0;

    /* renamed from: C  reason: collision with root package name */
    public boolean f8076C;

    /* renamed from: C0  reason: collision with root package name */
    public int f8077C0;

    /* renamed from: D  reason: collision with root package name */
    public l2.g f8078D;

    /* renamed from: D0  reason: collision with root package name */
    public int f8079D0;

    /* renamed from: E  reason: collision with root package name */
    public l2.g f8080E;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f8081E0;

    /* renamed from: F  reason: collision with root package name */
    public k f8082F;

    /* renamed from: F0  reason: collision with root package name */
    public final C0636a f8083F0;

    /* renamed from: G  reason: collision with root package name */
    public final int f8084G;

    /* renamed from: G0  reason: collision with root package name */
    public boolean f8085G0;

    /* renamed from: H  reason: collision with root package name */
    public int f8086H;

    /* renamed from: H0  reason: collision with root package name */
    public boolean f8087H0;

    /* renamed from: I  reason: collision with root package name */
    public int f8088I;

    /* renamed from: I0  reason: collision with root package name */
    public ValueAnimator f8089I0;

    /* renamed from: J  reason: collision with root package name */
    public int f8090J;

    /* renamed from: J0  reason: collision with root package name */
    public boolean f8091J0;

    /* renamed from: K  reason: collision with root package name */
    public int f8092K;

    /* renamed from: K0  reason: collision with root package name */
    public boolean f8093K0;

    /* renamed from: L  reason: collision with root package name */
    public int f8094L;

    /* renamed from: M  reason: collision with root package name */
    public int f8095M;

    /* renamed from: N  reason: collision with root package name */
    public int f8096N;

    /* renamed from: O  reason: collision with root package name */
    public final Rect f8097O;

    /* renamed from: P  reason: collision with root package name */
    public final Rect f8098P;

    /* renamed from: Q  reason: collision with root package name */
    public final RectF f8099Q;

    /* renamed from: R  reason: collision with root package name */
    public Typeface f8100R;

    /* renamed from: S  reason: collision with root package name */
    public final CheckableImageButton f8101S;

    /* renamed from: T  reason: collision with root package name */
    public ColorStateList f8102T;

    /* renamed from: U  reason: collision with root package name */
    public boolean f8103U;

    /* renamed from: V  reason: collision with root package name */
    public PorterDuff.Mode f8104V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f8105W;

    /* renamed from: a0  reason: collision with root package name */
    public Drawable f8106a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f8107b0;

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f8108c;

    /* renamed from: c0  reason: collision with root package name */
    public View.OnLongClickListener f8109c0;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f8110d;

    /* renamed from: d0  reason: collision with root package name */
    public final LinkedHashSet f8111d0;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f8112e;

    /* renamed from: e0  reason: collision with root package name */
    public int f8113e0;

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f8114f;

    /* renamed from: f0  reason: collision with root package name */
    public final SparseArray f8115f0;

    /* renamed from: g  reason: collision with root package name */
    public EditText f8116g;

    /* renamed from: g0  reason: collision with root package name */
    public final CheckableImageButton f8117g0;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f8118h;

    /* renamed from: h0  reason: collision with root package name */
    public final LinkedHashSet f8119h0;

    /* renamed from: i  reason: collision with root package name */
    public final C0804d f8120i;

    /* renamed from: i0  reason: collision with root package name */
    public ColorStateList f8121i0;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8122j;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f8123j0;

    /* renamed from: k  reason: collision with root package name */
    public int f8124k;

    /* renamed from: k0  reason: collision with root package name */
    public PorterDuff.Mode f8125k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8126l;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f8127l0;

    /* renamed from: m  reason: collision with root package name */
    public TextView f8128m;

    /* renamed from: m0  reason: collision with root package name */
    public Drawable f8129m0;

    /* renamed from: n  reason: collision with root package name */
    public int f8130n;

    /* renamed from: n0  reason: collision with root package name */
    public int f8131n0;

    /* renamed from: o  reason: collision with root package name */
    public int f8132o;

    /* renamed from: o0  reason: collision with root package name */
    public Drawable f8133o0;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f8134p;

    /* renamed from: p0  reason: collision with root package name */
    public View.OnLongClickListener f8135p0;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8136q;

    /* renamed from: q0  reason: collision with root package name */
    public View.OnLongClickListener f8137q0;

    /* renamed from: r  reason: collision with root package name */
    public TextView f8138r;

    /* renamed from: r0  reason: collision with root package name */
    public final CheckableImageButton f8139r0;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f8140s;

    /* renamed from: s0  reason: collision with root package name */
    public ColorStateList f8141s0;

    /* renamed from: t  reason: collision with root package name */
    public int f8142t;

    /* renamed from: t0  reason: collision with root package name */
    public ColorStateList f8143t0;

    /* renamed from: u  reason: collision with root package name */
    public ColorStateList f8144u;

    /* renamed from: u0  reason: collision with root package name */
    public ColorStateList f8145u0;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f8146v;

    /* renamed from: v0  reason: collision with root package name */
    public int f8147v0;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f8148w;

    /* renamed from: w0  reason: collision with root package name */
    public int f8149w0;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f8150x;

    /* renamed from: x0  reason: collision with root package name */
    public int f8151x0;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f8152y;

    /* renamed from: y0  reason: collision with root package name */
    public ColorStateList f8153y0;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f8154z;

    /* renamed from: z0  reason: collision with root package name */
    public int f8155z0;

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.u0(!textInputLayout.f8093K0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f8122j) {
                textInputLayout2.n0(editable.length());
            }
            if (TextInputLayout.this.f8136q) {
                TextInputLayout.this.y0(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            TextInputLayout.this.f8117g0.performClick();
            TextInputLayout.this.f8117g0.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            TextInputLayout.this.f8116g.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f8083F0.V(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends C0310a {

        /* renamed from: d  reason: collision with root package name */
        public final TextInputLayout f8160d;

        public e(TextInputLayout textInputLayout) {
            this.f8160d = textInputLayout;
        }

        public void g(View view, m mVar) {
            super.g(view, mVar);
            EditText editText = this.f8160d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f8160d.getHint();
            CharSequence error = this.f8160d.getError();
            CharSequence placeholderText = this.f8160d.getPlaceholderText();
            int counterMaxLength = this.f8160d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f8160d.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(text);
            boolean isEmpty2 = TextUtils.isEmpty(hint);
            boolean N4 = this.f8160d.N();
            boolean isEmpty3 = TextUtils.isEmpty(error);
            boolean z4 = !isEmpty3 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = !isEmpty2 ? hint.toString() : "";
            if (!isEmpty) {
                mVar.y0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                mVar.y0(charSequence);
                if (!N4 && placeholderText != null) {
                    mVar.y0(charSequence + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                mVar.y0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                mVar.n0(charSequence);
                mVar.v0(isEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            mVar.o0(counterMaxLength);
            if (z4) {
                if (isEmpty3) {
                    error = counterOverflowDescription;
                }
                mVar.j0(error);
            }
            if (editText != null) {
                editText.setLabelFor(V1.e.f3052I);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i4);
    }

    public static class h extends Z.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f8161g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f8162h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f8163i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f8164j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f8165k;

        public static class a implements Parcelable.ClassLoaderCreator {
            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i4) {
                return new h[i4];
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f8161g + " hint=" + this.f8163i + " helperText=" + this.f8164j + " placeholderText=" + this.f8165k + "}";
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            TextUtils.writeToParcel(this.f8161g, parcel, i4);
            parcel.writeInt(this.f8162h ? 1 : 0);
            TextUtils.writeToParcel(this.f8163i, parcel, i4);
            TextUtils.writeToParcel(this.f8164j, parcel, i4);
            TextUtils.writeToParcel(this.f8165k, parcel, i4);
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f8161g = (CharSequence) creator.createFromParcel(parcel);
            this.f8162h = parcel.readInt() != 1 ? false : true;
            this.f8163i = (CharSequence) creator.createFromParcel(parcel);
            this.f8164j = (CharSequence) creator.createFromParcel(parcel);
            this.f8165k = (CharSequence) creator.createFromParcel(parcel);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, V1.a.f2963A);
    }

    public static void U(ViewGroup viewGroup, boolean z4) {
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            childAt.setEnabled(z4);
            if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt, z4);
            }
        }
    }

    public static void b0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean H4 = C.H(checkableImageButton);
        boolean z4 = false;
        int i4 = 1;
        boolean z5 = onLongClickListener != null;
        if (H4 || z5) {
            z4 = true;
        }
        checkableImageButton.setFocusable(z4);
        checkableImageButton.setClickable(H4);
        checkableImageButton.setPressable(H4);
        checkableImageButton.setLongClickable(z5);
        if (!z4) {
            i4 = 2;
        }
        C.q0(checkableImageButton, i4);
    }

    public static void c0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        b0(checkableImageButton, onLongClickListener);
    }

    public static void d0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        b0(checkableImageButton, onLongClickListener);
    }

    private C0803c getEndIconDelegate() {
        C0803c cVar = (C0803c) this.f8115f0.get(this.f8113e0);
        return cVar != null ? cVar : (C0803c) this.f8115f0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f8139r0.getVisibility() == 0) {
            return this.f8139r0;
        }
        if (!I() || !K()) {
            return null;
        }
        return this.f8117g0;
    }

    public static void o0(Context context, TextView textView, int i4, int i5, boolean z4) {
        textView.setContentDescription(context.getString(z4 ? V1.h.f3106c : V1.h.f3105b, new Object[]{Integer.valueOf(i4), Integer.valueOf(i5)}));
    }

    private void setEditText(EditText editText) {
        if (this.f8116g == null) {
            if (this.f8113e0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f8116g = editText;
            S();
            setTextInputAccessibilityDelegate(new e(this));
            this.f8083F0.b0(this.f8116g.getTypeface());
            this.f8083F0.T(this.f8116g.getTextSize());
            int gravity = this.f8116g.getGravity();
            this.f8083F0.L((gravity & -113) | 48);
            this.f8083F0.S(gravity);
            this.f8116g.addTextChangedListener(new a());
            if (this.f8143t0 == null) {
                this.f8143t0 = this.f8116g.getHintTextColors();
            }
            if (this.f8072A) {
                if (TextUtils.isEmpty(this.f8074B)) {
                    CharSequence hint = this.f8116g.getHint();
                    this.f8118h = hint;
                    setHint(hint);
                    this.f8116g.setHint((CharSequence) null);
                }
                this.f8076C = true;
            }
            if (this.f8128m != null) {
                n0(this.f8116g.getText().length());
            }
            r0();
            this.f8120i.e();
            this.f8110d.bringToFront();
            this.f8112e.bringToFront();
            this.f8114f.bringToFront();
            this.f8139r0.bringToFront();
            B();
            z0();
            C0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            v0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z4) {
        int i4 = 8;
        this.f8139r0.setVisibility(z4 ? 0 : 8);
        FrameLayout frameLayout = this.f8114f;
        if (!z4) {
            i4 = 0;
        }
        frameLayout.setVisibility(i4);
        C0();
        if (!I()) {
            q0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f8074B)) {
            this.f8074B = charSequence;
            this.f8083F0.Z(charSequence);
            if (!this.f8081E0) {
                T();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z4) {
        if (this.f8136q != z4) {
            if (z4) {
                C0857y yVar = new C0857y(getContext());
                this.f8138r = yVar;
                yVar.setId(V1.e.f3053J);
                C.i0(this.f8138r, 1);
                setPlaceholderTextAppearance(this.f8142t);
                setPlaceholderTextColor(this.f8140s);
                g();
            } else {
                Z();
                this.f8138r = null;
            }
            this.f8136q = z4;
        }
    }

    public final boolean A() {
        return this.f8072A && !TextUtils.isEmpty(this.f8074B) && (this.f8078D instanceof C0802b);
    }

    public final void A0() {
        this.f8150x.setVisibility((this.f8148w == null || N()) ? 8 : 0);
        q0();
    }

    public final void B() {
        Iterator it = this.f8111d0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    public final void B0(boolean z4, boolean z5) {
        int defaultColor = this.f8153y0.getDefaultColor();
        int colorForState = this.f8153y0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f8153y0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z4) {
            this.f8095M = colorForState2;
        } else if (z5) {
            this.f8095M = colorForState;
        } else {
            this.f8095M = defaultColor;
        }
    }

    public final void C(int i4) {
        Iterator it = this.f8119h0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this, i4);
        }
    }

    public final void C0() {
        if (this.f8116g != null) {
            C.u0(this.f8154z, getContext().getResources().getDimensionPixelSize(V1.c.f3028r), this.f8116g.getPaddingTop(), (K() || L()) ? 0 : C.A(this.f8116g), this.f8116g.getPaddingBottom());
        }
    }

    public final void D(Canvas canvas) {
        l2.g gVar = this.f8080E;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.f8090J;
            this.f8080E.draw(canvas);
        }
    }

    public final void D0() {
        int visibility = this.f8154z.getVisibility();
        int i4 = 0;
        boolean z4 = this.f8152y != null && !N();
        TextView textView = this.f8154z;
        if (!z4) {
            i4 = 8;
        }
        textView.setVisibility(i4);
        if (visibility != this.f8154z.getVisibility()) {
            getEndIconDelegate().c(z4);
        }
        q0();
    }

    public final void E(Canvas canvas) {
        if (this.f8072A) {
            this.f8083F0.j(canvas);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.f8116g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E0() {
        /*
            r6 = this;
            l2.g r0 = r6.f8078D
            if (r0 == 0) goto L_0x00ee
            int r0 = r6.f8086H
            if (r0 != 0) goto L_0x000a
            goto L_0x00ee
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.f8116g
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.f8116g
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = r1
            goto L_0x0034
        L_0x0033:
            r3 = r2
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r6.f8079D0
            r6.f8095M = r4
            goto L_0x0081
        L_0x003f:
            n2.d r4 = r6.f8120i
            boolean r4 = r4.k()
            if (r4 == 0) goto L_0x0058
            android.content.res.ColorStateList r4 = r6.f8153y0
            if (r4 == 0) goto L_0x004f
            r6.B0(r0, r3)
            goto L_0x0081
        L_0x004f:
            n2.d r4 = r6.f8120i
            int r4 = r4.o()
            r6.f8095M = r4
            goto L_0x0081
        L_0x0058:
            boolean r4 = r6.f8126l
            if (r4 == 0) goto L_0x006f
            android.widget.TextView r4 = r6.f8128m
            if (r4 == 0) goto L_0x006f
            android.content.res.ColorStateList r5 = r6.f8153y0
            if (r5 == 0) goto L_0x0068
            r6.B0(r0, r3)
            goto L_0x0081
        L_0x0068:
            int r4 = r4.getCurrentTextColor()
            r6.f8095M = r4
            goto L_0x0081
        L_0x006f:
            if (r0 == 0) goto L_0x0076
            int r4 = r6.f8151x0
            r6.f8095M = r4
            goto L_0x0081
        L_0x0076:
            if (r3 == 0) goto L_0x007d
            int r4 = r6.f8149w0
            r6.f8095M = r4
            goto L_0x0081
        L_0x007d:
            int r4 = r6.f8147v0
            r6.f8095M = r4
        L_0x0081:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L_0x0098
            n2.d r4 = r6.f8120i
            boolean r4 = r4.x()
            if (r4 == 0) goto L_0x0098
            n2.d r4 = r6.f8120i
            boolean r4 = r4.k()
            if (r4 == 0) goto L_0x0098
            r1 = r2
        L_0x0098:
            r6.setErrorIconVisible(r1)
            r6.W()
            r6.Y()
            r6.V()
            n2.c r1 = r6.getEndIconDelegate()
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x00b7
            n2.d r1 = r6.f8120i
            boolean r1 = r1.k()
            r6.j0(r1)
        L_0x00b7:
            if (r0 == 0) goto L_0x00c4
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L_0x00c4
            int r1 = r6.f8094L
            r6.f8090J = r1
            goto L_0x00c8
        L_0x00c4:
            int r1 = r6.f8092K
            r6.f8090J = r1
        L_0x00c8:
            int r1 = r6.f8086H
            if (r1 != r2) goto L_0x00eb
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x00d7
            int r0 = r6.f8073A0
            r6.f8096N = r0
            goto L_0x00eb
        L_0x00d7:
            if (r3 == 0) goto L_0x00e0
            if (r0 != 0) goto L_0x00e0
            int r0 = r6.f8077C0
            r6.f8096N = r0
            goto L_0x00eb
        L_0x00e0:
            if (r0 == 0) goto L_0x00e7
            int r0 = r6.f8075B0
            r6.f8096N = r0
            goto L_0x00eb
        L_0x00e7:
            int r0 = r6.f8155z0
            r6.f8096N = r0
        L_0x00eb:
            r6.j()
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.E0():void");
    }

    public final void F(boolean z4) {
        ValueAnimator valueAnimator = this.f8089I0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8089I0.cancel();
        }
        if (!z4 || !this.f8087H0) {
            this.f8083F0.V(0.0f);
        } else {
            i(0.0f);
        }
        if (A() && ((C0802b) this.f8078D).f0()) {
            y();
        }
        this.f8081E0 = true;
        J();
        A0();
        D0();
    }

    public final int G(int i4, boolean z4) {
        int compoundPaddingLeft = i4 + this.f8116g.getCompoundPaddingLeft();
        return (this.f8148w == null || z4) ? compoundPaddingLeft : (compoundPaddingLeft - this.f8150x.getMeasuredWidth()) + this.f8150x.getPaddingLeft();
    }

    public final int H(int i4, boolean z4) {
        int compoundPaddingRight = i4 - this.f8116g.getCompoundPaddingRight();
        return (this.f8148w == null || !z4) ? compoundPaddingRight : compoundPaddingRight + (this.f8150x.getMeasuredWidth() - this.f8150x.getPaddingRight());
    }

    public final boolean I() {
        return this.f8113e0 != 0;
    }

    public final void J() {
        TextView textView = this.f8138r;
        if (textView != null && this.f8136q) {
            textView.setText((CharSequence) null);
            this.f8138r.setVisibility(4);
        }
    }

    public boolean K() {
        return this.f8114f.getVisibility() == 0 && this.f8117g0.getVisibility() == 0;
    }

    public final boolean L() {
        return this.f8139r0.getVisibility() == 0;
    }

    public boolean M() {
        return this.f8120i.y();
    }

    public final boolean N() {
        return this.f8081E0;
    }

    public boolean O() {
        return this.f8076C;
    }

    public final boolean P() {
        return this.f8086H == 1 && this.f8116g.getMinLines() <= 1;
    }

    public boolean Q() {
        return this.f8101S.getVisibility() == 0;
    }

    public final int[] R(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    public final void S() {
        p();
        a0();
        E0();
        k0();
        h();
        if (this.f8086H != 0) {
            t0();
        }
    }

    public final void T() {
        if (A()) {
            RectF rectF = this.f8099Q;
            this.f8083F0.m(rectF, this.f8116g.getWidth(), this.f8116g.getGravity());
            l(rectF);
            rectF.offset((float) (-getPaddingLeft()), (float) (-getPaddingTop()));
            ((C0802b) this.f8078D).l0(rectF);
        }
    }

    public void V() {
        X(this.f8117g0, this.f8121i0);
    }

    public void W() {
        X(this.f8139r0, this.f8141s0);
    }

    public final void X(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(R(checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = K.a.l(drawable).mutate();
            K.a.i(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public void Y() {
        X(this.f8101S, this.f8102T);
    }

    public final void Z() {
        TextView textView = this.f8138r;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void a0() {
        if (h0()) {
            C.j0(this.f8116g, this.f8078D);
        }
    }

    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f8108c.addView(view, layoutParams2);
            this.f8108c.setLayoutParams(layoutParams);
            t0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i4, layoutParams);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i4) {
        EditText editText = this.f8116g;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i4);
            return;
        }
        if (this.f8118h != null) {
            boolean z4 = this.f8076C;
            this.f8076C = false;
            CharSequence hint = editText.getHint();
            this.f8116g.setHint(this.f8118h);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i4);
            } finally {
                this.f8116g.setHint(hint);
                this.f8076C = z4;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i4);
            onProvideAutofillVirtualStructure(viewStructure, i4);
            viewStructure.setChildCount(this.f8108c.getChildCount());
            for (int i5 = 0; i5 < this.f8108c.getChildCount(); i5++) {
                View childAt = this.f8108c.getChildAt(i5);
                ViewStructure newChild = viewStructure.newChild(i5);
                childAt.dispatchProvideAutofillStructure(newChild, i4);
                if (childAt == this.f8116g) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f8093K0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f8093K0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    public void drawableStateChanged() {
        if (!this.f8091J0) {
            boolean z4 = true;
            this.f8091J0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C0636a aVar = this.f8083F0;
            boolean Y3 = aVar != null ? aVar.Y(drawableState) : false;
            if (this.f8116g != null) {
                if (!C.M(this) || !isEnabled()) {
                    z4 = false;
                }
                u0(z4);
            }
            r0();
            E0();
            if (Y3) {
                invalidate();
            }
            this.f8091J0 = false;
        }
    }

    public void e(f fVar) {
        this.f8111d0.add(fVar);
        if (this.f8116g != null) {
            fVar.a(this);
        }
    }

    public void e0(TextView textView, int i4) {
        try {
            X.h.m(textView, i4);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        X.h.m(textView, i.f3120a);
        textView.setTextColor(H.a.c(getContext(), V1.b.f2992a));
    }

    public void f(g gVar) {
        this.f8119h0.add(gVar);
    }

    public final boolean f0() {
        return (this.f8139r0.getVisibility() == 0 || ((I() && K()) || this.f8152y != null)) && this.f8112e.getMeasuredWidth() > 0;
    }

    public final void g() {
        TextView textView = this.f8138r;
        if (textView != null) {
            this.f8108c.addView(textView);
            this.f8138r.setVisibility(0);
        }
    }

    public final boolean g0() {
        return !(getStartIconDrawable() == null && this.f8148w == null) && this.f8110d.getMeasuredWidth() > 0;
    }

    public int getBaseline() {
        EditText editText = this.f8116g;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    public l2.g getBoxBackground() {
        int i4 = this.f8086H;
        if (i4 == 1 || i4 == 2) {
            return this.f8078D;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f8096N;
    }

    public int getBoxBackgroundMode() {
        return this.f8086H;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f8078D.s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f8078D.t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f8078D.E();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f8078D.D();
    }

    public int getBoxStrokeColor() {
        return this.f8151x0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f8153y0;
    }

    public int getBoxStrokeWidth() {
        return this.f8092K;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f8094L;
    }

    public int getCounterMaxLength() {
        return this.f8124k;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f8122j || !this.f8126l || (textView = this.f8128m) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f8144u;
    }

    public ColorStateList getCounterTextColor() {
        return this.f8144u;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f8143t0;
    }

    public EditText getEditText() {
        return this.f8116g;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f8117g0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f8117g0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f8113e0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f8117g0;
    }

    public CharSequence getError() {
        if (this.f8120i.x()) {
            return this.f8120i.n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f8120i.m();
    }

    public int getErrorCurrentTextColors() {
        return this.f8120i.o();
    }

    public Drawable getErrorIconDrawable() {
        return this.f8139r0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f8120i.o();
    }

    public CharSequence getHelperText() {
        if (this.f8120i.y()) {
            return this.f8120i.q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f8120i.r();
    }

    public CharSequence getHint() {
        if (this.f8072A) {
            return this.f8074B;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f8083F0.o();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f8083F0.r();
    }

    public ColorStateList getHintTextColor() {
        return this.f8145u0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f8117g0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f8117g0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f8136q) {
            return this.f8134p;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f8142t;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f8140s;
    }

    public CharSequence getPrefixText() {
        return this.f8148w;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f8150x.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f8150x;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f8101S.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f8101S.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f8152y;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f8154z.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f8154z;
    }

    public Typeface getTypeface() {
        return this.f8100R;
    }

    public final void h() {
        if (this.f8116g != null && this.f8086H == 1) {
            if (i2.c.h(getContext())) {
                EditText editText = this.f8116g;
                C.u0(editText, C.B(editText), getResources().getDimensionPixelSize(V1.c.f3022l), C.A(this.f8116g), getResources().getDimensionPixelSize(V1.c.f3021k));
            } else if (i2.c.g(getContext())) {
                EditText editText2 = this.f8116g;
                C.u0(editText2, C.B(editText2), getResources().getDimensionPixelSize(V1.c.f3020j), C.A(this.f8116g), getResources().getDimensionPixelSize(V1.c.f3019i));
            }
        }
    }

    public final boolean h0() {
        EditText editText = this.f8116g;
        return (editText == null || this.f8078D == null || editText.getBackground() != null || this.f8086H == 0) ? false : true;
    }

    public void i(float f4) {
        if (this.f8083F0.v() != f4) {
            if (this.f8089I0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f8089I0 = valueAnimator;
                valueAnimator.setInterpolator(W1.a.f3397b);
                this.f8089I0.setDuration(167);
                this.f8089I0.addUpdateListener(new d());
            }
            this.f8089I0.setFloatValues(new float[]{this.f8083F0.v(), f4});
            this.f8089I0.start();
        }
    }

    public final void i0() {
        TextView textView = this.f8138r;
        if (textView != null && this.f8136q) {
            textView.setText(this.f8134p);
            this.f8138r.setVisibility(0);
            this.f8138r.bringToFront();
        }
    }

    public final void j() {
        l2.g gVar = this.f8078D;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(this.f8082F);
            if (w()) {
                this.f8078D.Y((float) this.f8090J, this.f8095M);
            }
            int q4 = q();
            this.f8096N = q4;
            this.f8078D.U(ColorStateList.valueOf(q4));
            if (this.f8113e0 == 3) {
                this.f8116g.getBackground().invalidateSelf();
            }
            k();
            invalidate();
        }
    }

    public final void j0(boolean z4) {
        if (!z4 || getEndIconDrawable() == null) {
            m();
            return;
        }
        Drawable mutate = K.a.l(getEndIconDrawable()).mutate();
        K.a.h(mutate, this.f8120i.o());
        this.f8117g0.setImageDrawable(mutate);
    }

    public final void k() {
        if (this.f8080E != null) {
            if (x()) {
                this.f8080E.U(ColorStateList.valueOf(this.f8095M));
            }
            invalidate();
        }
    }

    public final void k0() {
        if (this.f8086H != 1) {
            return;
        }
        if (i2.c.h(getContext())) {
            this.f8088I = getResources().getDimensionPixelSize(V1.c.f3024n);
        } else if (i2.c.g(getContext())) {
            this.f8088I = getResources().getDimensionPixelSize(V1.c.f3023m);
        }
    }

    public final void l(RectF rectF) {
        float f4 = rectF.left;
        int i4 = this.f8084G;
        rectF.left = f4 - ((float) i4);
        rectF.top -= (float) i4;
        rectF.right += (float) i4;
        rectF.bottom += (float) i4;
    }

    public final void l0(Rect rect) {
        l2.g gVar = this.f8080E;
        if (gVar != null) {
            int i4 = rect.bottom;
            gVar.setBounds(rect.left, i4 - this.f8094L, rect.right, i4);
        }
    }

    public final void m() {
        n(this.f8117g0, this.f8123j0, this.f8121i0, this.f8127l0, this.f8125k0);
    }

    public final void m0() {
        if (this.f8128m != null) {
            EditText editText = this.f8116g;
            n0(editText == null ? 0 : editText.getText().length());
        }
    }

    public final void n(CheckableImageButton checkableImageButton, boolean z4, ColorStateList colorStateList, boolean z5, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z4 || z5)) {
            drawable = K.a.l(drawable).mutate();
            if (z4) {
                K.a.i(drawable, colorStateList);
            }
            if (z5) {
                K.a.j(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void n0(int i4) {
        boolean z4 = this.f8126l;
        int i5 = this.f8124k;
        if (i5 == -1) {
            this.f8128m.setText(String.valueOf(i4));
            this.f8128m.setContentDescription((CharSequence) null);
            this.f8126l = false;
        } else {
            this.f8126l = i4 > i5;
            o0(getContext(), this.f8128m, i4, this.f8124k, this.f8126l);
            if (z4 != this.f8126l) {
                p0();
            }
            this.f8128m.setText(Q.a.c().j(getContext().getString(V1.h.f3107d, new Object[]{Integer.valueOf(i4), Integer.valueOf(this.f8124k)})));
        }
        if (this.f8116g != null && z4 != this.f8126l) {
            u0(false);
            E0();
            r0();
        }
    }

    public final void o() {
        n(this.f8101S, this.f8103U, this.f8102T, this.f8105W, this.f8104V);
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        EditText editText = this.f8116g;
        if (editText != null) {
            Rect rect = this.f8097O;
            g2.b.a(this, editText, rect);
            l0(rect);
            if (this.f8072A) {
                this.f8083F0.T(this.f8116g.getTextSize());
                int gravity = this.f8116g.getGravity();
                this.f8083F0.L((gravity & -113) | 48);
                this.f8083F0.S(gravity);
                this.f8083F0.H(r(rect));
                this.f8083F0.P(u(rect));
                this.f8083F0.E();
                if (A() && !this.f8081E0) {
                    T();
                }
            }
        }
    }

    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        boolean s02 = s0();
        boolean q02 = q0();
        if (s02 || q02) {
            this.f8116g.post(new c());
        }
        w0();
        z0();
        C0();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f8161g);
        if (hVar.f8162h) {
            this.f8117g0.post(new b());
        }
        setHint(hVar.f8163i);
        setHelperText(hVar.f8164j);
        setPlaceholderText(hVar.f8165k);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f8120i.k()) {
            hVar.f8161g = getError();
        }
        hVar.f8162h = I() && this.f8117g0.isChecked();
        hVar.f8163i = getHint();
        hVar.f8164j = getHelperText();
        hVar.f8165k = getPlaceholderText();
        return hVar;
    }

    public final void p() {
        int i4 = this.f8086H;
        if (i4 == 0) {
            this.f8078D = null;
            this.f8080E = null;
        } else if (i4 == 1) {
            this.f8078D = new l2.g(this.f8082F);
            this.f8080E = new l2.g();
        } else if (i4 == 2) {
            if (!this.f8072A || (this.f8078D instanceof C0802b)) {
                this.f8078D = new l2.g(this.f8082F);
            } else {
                this.f8078D = new C0802b(this.f8082F);
            }
            this.f8080E = null;
        } else {
            throw new IllegalArgumentException(this.f8086H + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    public final void p0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f8128m;
        if (textView != null) {
            e0(textView, this.f8126l ? this.f8130n : this.f8132o);
            if (!this.f8126l && (colorStateList2 = this.f8144u) != null) {
                this.f8128m.setTextColor(colorStateList2);
            }
            if (this.f8126l && (colorStateList = this.f8146v) != null) {
                this.f8128m.setTextColor(colorStateList);
            }
        }
    }

    public final int q() {
        return this.f8086H == 1 ? C0393a.e(C0393a.d(this, V1.a.f2976k, 0), this.f8096N) : this.f8096N;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f8116g
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.g0()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 == 0) goto L_0x0049
            android.widget.LinearLayout r0 = r10.f8110d
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f8116g
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f8106a0
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f8107b0
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f8106a0 = r6
            r10.f8107b0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.f8116g
            android.graphics.drawable.Drawable[] r0 = X.h.a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f8106a0
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.f8116g
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            X.h.h(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.f8106a0
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.f8116g
            android.graphics.drawable.Drawable[] r0 = X.h.a(r0)
            android.widget.EditText r6 = r10.f8116g
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            X.h.h(r6, r2, r7, r8, r0)
            r10.f8106a0 = r2
        L_0x0060:
            r0 = r5
            goto L_0x0063
        L_0x0062:
            r0 = r1
        L_0x0063:
            boolean r6 = r10.f0()
            if (r6 == 0) goto L_0x00d2
            android.widget.TextView r2 = r10.f8154z
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f8116g
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x008c
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = S.C0320k.b(r6)
            int r2 = r2 + r6
        L_0x008c:
            android.widget.EditText r6 = r10.f8116g
            android.graphics.drawable.Drawable[] r6 = X.h.a(r6)
            android.graphics.drawable.Drawable r7 = r10.f8129m0
            if (r7 == 0) goto L_0x00ad
            int r8 = r10.f8131n0
            if (r8 == r2) goto L_0x00ad
            r10.f8131n0 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.f8116g
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r3 = r10.f8129m0
            r4 = r6[r4]
            X.h.h(r0, r1, r2, r3, r4)
            goto L_0x00d0
        L_0x00ad:
            if (r7 != 0) goto L_0x00bb
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f8129m0 = r7
            r10.f8131n0 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00bb:
            r2 = r6[r3]
            android.graphics.drawable.Drawable r3 = r10.f8129m0
            if (r2 == r3) goto L_0x00cf
            r10.f8133o0 = r2
            android.widget.EditText r0 = r10.f8116g
            r1 = r6[r1]
            r2 = r6[r5]
            r4 = r6[r4]
            X.h.h(r0, r1, r2, r3, r4)
            goto L_0x00d0
        L_0x00cf:
            r5 = r0
        L_0x00d0:
            r0 = r5
            goto L_0x00f4
        L_0x00d2:
            android.graphics.drawable.Drawable r6 = r10.f8129m0
            if (r6 == 0) goto L_0x00f4
            android.widget.EditText r6 = r10.f8116g
            android.graphics.drawable.Drawable[] r6 = X.h.a(r6)
            r3 = r6[r3]
            android.graphics.drawable.Drawable r7 = r10.f8129m0
            if (r3 != r7) goto L_0x00f0
            android.widget.EditText r0 = r10.f8116g
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f8133o0
            r4 = r6[r4]
            X.h.h(r0, r1, r3, r7, r4)
            goto L_0x00f1
        L_0x00f0:
            r5 = r0
        L_0x00f1:
            r10.f8129m0 = r2
            goto L_0x00d0
        L_0x00f4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q0():boolean");
    }

    public final Rect r(Rect rect) {
        if (this.f8116g != null) {
            Rect rect2 = this.f8098P;
            boolean z4 = C.x(this) == 1;
            rect2.bottom = rect.bottom;
            int i4 = this.f8086H;
            if (i4 == 1) {
                rect2.left = G(rect.left, z4);
                rect2.top = rect.top + this.f8088I;
                rect2.right = H(rect.right, z4);
                return rect2;
            } else if (i4 != 2) {
                rect2.left = G(rect.left, z4);
                rect2.top = getPaddingTop();
                rect2.right = H(rect.right, z4);
                return rect2;
            } else {
                rect2.left = rect.left + this.f8116g.getPaddingLeft();
                rect2.top = rect.top - v();
                rect2.right = rect.right - this.f8116g.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public void r0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f8116g;
        if (editText != null && this.f8086H == 0 && (background = editText.getBackground()) != null) {
            if (K.a(background)) {
                background = background.mutate();
            }
            if (this.f8120i.k()) {
                background.setColorFilter(C0842i.e(this.f8120i.o(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f8126l || (textView = this.f8128m) == null) {
                K.a.a(background);
                this.f8116g.refreshDrawableState();
            } else {
                background.setColorFilter(C0842i.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final int s(Rect rect, Rect rect2, float f4) {
        return P() ? (int) (((float) rect2.top) + f4) : rect.bottom - this.f8116g.getCompoundPaddingBottom();
    }

    public final boolean s0() {
        int max;
        if (this.f8116g == null || this.f8116g.getMeasuredHeight() >= (max = Math.max(this.f8112e.getMeasuredHeight(), this.f8110d.getMeasuredHeight()))) {
            return false;
        }
        this.f8116g.setMinimumHeight(max);
        return true;
    }

    public void setBoxBackgroundColor(int i4) {
        if (this.f8096N != i4) {
            this.f8096N = i4;
            this.f8155z0 = i4;
            this.f8075B0 = i4;
            this.f8077C0 = i4;
            j();
        }
    }

    public void setBoxBackgroundColorResource(int i4) {
        setBoxBackgroundColor(H.a.c(getContext(), i4));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f8155z0 = defaultColor;
        this.f8096N = defaultColor;
        this.f8073A0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f8075B0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f8077C0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        j();
    }

    public void setBoxBackgroundMode(int i4) {
        if (i4 != this.f8086H) {
            this.f8086H = i4;
            if (this.f8116g != null) {
                S();
            }
        }
    }

    public void setBoxStrokeColor(int i4) {
        if (this.f8151x0 != i4) {
            this.f8151x0 = i4;
            E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f8147v0 = colorStateList.getDefaultColor();
            this.f8079D0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f8149w0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f8151x0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f8151x0 != colorStateList.getDefaultColor()) {
            this.f8151x0 = colorStateList.getDefaultColor();
        }
        E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f8153y0 != colorStateList) {
            this.f8153y0 = colorStateList;
            E0();
        }
    }

    public void setBoxStrokeWidth(int i4) {
        this.f8092K = i4;
        E0();
    }

    public void setBoxStrokeWidthFocused(int i4) {
        this.f8094L = i4;
        E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i4) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i4));
    }

    public void setBoxStrokeWidthResource(int i4) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i4));
    }

    public void setCounterEnabled(boolean z4) {
        if (this.f8122j != z4) {
            if (z4) {
                C0857y yVar = new C0857y(getContext());
                this.f8128m = yVar;
                yVar.setId(V1.e.f3050G);
                Typeface typeface = this.f8100R;
                if (typeface != null) {
                    this.f8128m.setTypeface(typeface);
                }
                this.f8128m.setMaxLines(1);
                this.f8120i.d(this.f8128m, 2);
                C0320k.d((ViewGroup.MarginLayoutParams) this.f8128m.getLayoutParams(), getResources().getDimensionPixelOffset(V1.c.f3010M));
                p0();
                m0();
            } else {
                this.f8120i.z(this.f8128m, 2);
                this.f8128m = null;
            }
            this.f8122j = z4;
        }
    }

    public void setCounterMaxLength(int i4) {
        if (this.f8124k != i4) {
            if (i4 > 0) {
                this.f8124k = i4;
            } else {
                this.f8124k = -1;
            }
            if (this.f8122j) {
                m0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i4) {
        if (this.f8130n != i4) {
            this.f8130n = i4;
            p0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f8146v != colorStateList) {
            this.f8146v = colorStateList;
            p0();
        }
    }

    public void setCounterTextAppearance(int i4) {
        if (this.f8132o != i4) {
            this.f8132o = i4;
            p0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f8144u != colorStateList) {
            this.f8144u = colorStateList;
            p0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f8143t0 = colorStateList;
        this.f8145u0 = colorStateList;
        if (this.f8116g != null) {
            u0(false);
        }
    }

    public void setEnabled(boolean z4) {
        U(this, z4);
        super.setEnabled(z4);
    }

    public void setEndIconActivated(boolean z4) {
        this.f8117g0.setActivated(z4);
    }

    public void setEndIconCheckable(boolean z4) {
        this.f8117g0.setCheckable(z4);
    }

    public void setEndIconContentDescription(int i4) {
        setEndIconContentDescription(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setEndIconDrawable(int i4) {
        setEndIconDrawable(i4 != 0 ? C0754a.b(getContext(), i4) : null);
    }

    public void setEndIconMode(int i4) {
        int i5 = this.f8113e0;
        this.f8113e0 = i4;
        C(i5);
        setEndIconVisible(i4 != 0);
        if (getEndIconDelegate().b(this.f8086H)) {
            getEndIconDelegate().a();
            m();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f8086H + " is not supported by the end icon mode " + i4);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.f8117g0, onClickListener, this.f8135p0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8135p0 = onLongClickListener;
        d0(this.f8117g0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f8121i0 != colorStateList) {
            this.f8121i0 = colorStateList;
            this.f8123j0 = true;
            m();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f8125k0 != mode) {
            this.f8125k0 = mode;
            this.f8127l0 = true;
            m();
        }
    }

    public void setEndIconVisible(boolean z4) {
        if (K() != z4) {
            this.f8117g0.setVisibility(z4 ? 0 : 8);
            C0();
            q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f8120i.x()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f8120i.M(charSequence);
        } else {
            this.f8120i.t();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f8120i.B(charSequence);
    }

    public void setErrorEnabled(boolean z4) {
        this.f8120i.C(z4);
    }

    public void setErrorIconDrawable(int i4) {
        setErrorIconDrawable(i4 != 0 ? C0754a.b(getContext(), i4) : null);
        W();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.f8139r0, onClickListener, this.f8137q0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8137q0 = onLongClickListener;
        d0(this.f8139r0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f8141s0 = colorStateList;
        Drawable drawable = this.f8139r0.getDrawable();
        if (drawable != null) {
            drawable = K.a.l(drawable).mutate();
            K.a.i(drawable, colorStateList);
        }
        if (this.f8139r0.getDrawable() != drawable) {
            this.f8139r0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f8139r0.getDrawable();
        if (drawable != null) {
            drawable = K.a.l(drawable).mutate();
            K.a.j(drawable, mode);
        }
        if (this.f8139r0.getDrawable() != drawable) {
            this.f8139r0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i4) {
        this.f8120i.D(i4);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f8120i.E(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z4) {
        if (this.f8085G0 != z4) {
            this.f8085G0 = z4;
            u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!M()) {
                setHelperTextEnabled(true);
            }
            this.f8120i.N(charSequence);
        } else if (M()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f8120i.H(colorStateList);
    }

    public void setHelperTextEnabled(boolean z4) {
        this.f8120i.G(z4);
    }

    public void setHelperTextTextAppearance(int i4) {
        this.f8120i.F(i4);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f8072A) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z4) {
        this.f8087H0 = z4;
    }

    public void setHintEnabled(boolean z4) {
        if (z4 != this.f8072A) {
            this.f8072A = z4;
            if (!z4) {
                this.f8076C = false;
                if (!TextUtils.isEmpty(this.f8074B) && TextUtils.isEmpty(this.f8116g.getHint())) {
                    this.f8116g.setHint(this.f8074B);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f8116g.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f8074B)) {
                        setHint(hint);
                    }
                    this.f8116g.setHint((CharSequence) null);
                }
                this.f8076C = true;
            }
            if (this.f8116g != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i4) {
        this.f8083F0.I(i4);
        this.f8145u0 = this.f8083F0.n();
        if (this.f8116g != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f8145u0 != colorStateList) {
            if (this.f8143t0 == null) {
                this.f8083F0.K(colorStateList);
            }
            this.f8145u0 = colorStateList;
            if (this.f8116g != null) {
                u0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i4) {
        setPasswordVisibilityToggleContentDescription(i4 != 0 ? getResources().getText(i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i4) {
        setPasswordVisibilityToggleDrawable(i4 != 0 ? C0754a.b(getContext(), i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z4) {
        if (z4 && this.f8113e0 != 1) {
            setEndIconMode(1);
        } else if (!z4) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f8121i0 = colorStateList;
        this.f8123j0 = true;
        m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f8125k0 = mode;
        this.f8127l0 = true;
        m();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (!this.f8136q || !TextUtils.isEmpty(charSequence)) {
            if (!this.f8136q) {
                setPlaceholderTextEnabled(true);
            }
            this.f8134p = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i4) {
        this.f8142t = i4;
        TextView textView = this.f8138r;
        if (textView != null) {
            X.h.m(textView, i4);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f8140s != colorStateList) {
            this.f8140s = colorStateList;
            TextView textView = this.f8138r;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f8148w = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f8150x.setText(charSequence);
        A0();
    }

    public void setPrefixTextAppearance(int i4) {
        X.h.m(this.f8150x, i4);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f8150x.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z4) {
        this.f8101S.setCheckable(z4);
    }

    public void setStartIconContentDescription(int i4) {
        setStartIconContentDescription(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setStartIconDrawable(int i4) {
        setStartIconDrawable(i4 != 0 ? C0754a.b(getContext(), i4) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.f8101S, onClickListener, this.f8109c0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8109c0 = onLongClickListener;
        d0(this.f8101S, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f8102T != colorStateList) {
            this.f8102T = colorStateList;
            this.f8103U = true;
            o();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f8104V != mode) {
            this.f8104V = mode;
            this.f8105W = true;
            o();
        }
    }

    public void setStartIconVisible(boolean z4) {
        if (Q() != z4) {
            this.f8101S.setVisibility(z4 ? 0 : 8);
            z0();
            q0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f8152y = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f8154z.setText(charSequence);
        D0();
    }

    public void setSuffixTextAppearance(int i4) {
        X.h.m(this.f8154z, i4);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f8154z.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f8116g;
        if (editText != null) {
            C.g0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f8100R) {
            this.f8100R = typeface;
            this.f8083F0.b0(typeface);
            this.f8120i.J(typeface);
            TextView textView = this.f8128m;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final int t(Rect rect, float f4) {
        return P() ? (int) (((float) rect.centerY()) - (f4 / 2.0f)) : rect.top + this.f8116g.getCompoundPaddingTop();
    }

    public final void t0() {
        if (this.f8086H != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8108c.getLayoutParams();
            int v4 = v();
            if (v4 != layoutParams.topMargin) {
                layoutParams.topMargin = v4;
                this.f8108c.requestLayout();
            }
        }
    }

    public final Rect u(Rect rect) {
        if (this.f8116g != null) {
            Rect rect2 = this.f8098P;
            float u4 = this.f8083F0.u();
            rect2.left = rect.left + this.f8116g.getCompoundPaddingLeft();
            rect2.top = t(rect, u4);
            rect2.right = rect.right - this.f8116g.getCompoundPaddingRight();
            rect2.bottom = s(rect, rect2, u4);
            return rect2;
        }
        throw new IllegalStateException();
    }

    public void u0(boolean z4) {
        v0(z4, false);
    }

    public final int v() {
        float o4;
        if (!this.f8072A) {
            return 0;
        }
        int i4 = this.f8086H;
        if (i4 == 0 || i4 == 1) {
            o4 = this.f8083F0.o();
        } else if (i4 != 2) {
            return 0;
        } else {
            o4 = this.f8083F0.o() / 2.0f;
        }
        return (int) o4;
    }

    public final void v0(boolean z4, boolean z5) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f8116g;
        boolean z6 = false;
        boolean z7 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f8116g;
        if (editText2 != null && editText2.hasFocus()) {
            z6 = true;
        }
        boolean k4 = this.f8120i.k();
        ColorStateList colorStateList2 = this.f8143t0;
        if (colorStateList2 != null) {
            this.f8083F0.K(colorStateList2);
            this.f8083F0.R(this.f8143t0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f8143t0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f8079D0) : this.f8079D0;
            this.f8083F0.K(ColorStateList.valueOf(colorForState));
            this.f8083F0.R(ColorStateList.valueOf(colorForState));
        } else if (k4) {
            this.f8083F0.K(this.f8120i.p());
        } else if (this.f8126l && (textView = this.f8128m) != null) {
            this.f8083F0.K(textView.getTextColors());
        } else if (z6 && (colorStateList = this.f8145u0) != null) {
            this.f8083F0.K(colorStateList);
        }
        if (z7 || !this.f8085G0 || (isEnabled() && z6)) {
            if (z5 || this.f8081E0) {
                z(z4);
            }
        } else if (z5 || !this.f8081E0) {
            F(z4);
        }
    }

    public final boolean w() {
        return this.f8086H == 2 && x();
    }

    public final void w0() {
        EditText editText;
        if (this.f8138r != null && (editText = this.f8116g) != null) {
            this.f8138r.setGravity(editText.getGravity());
            this.f8138r.setPadding(this.f8116g.getCompoundPaddingLeft(), this.f8116g.getCompoundPaddingTop(), this.f8116g.getCompoundPaddingRight(), this.f8116g.getCompoundPaddingBottom());
        }
    }

    public final boolean x() {
        return this.f8090J > -1 && this.f8095M != 0;
    }

    public final void x0() {
        EditText editText = this.f8116g;
        y0(editText == null ? 0 : editText.getText().length());
    }

    public final void y() {
        if (A()) {
            ((C0802b) this.f8078D).i0();
        }
    }

    public final void y0(int i4) {
        if (i4 != 0 || this.f8081E0) {
            J();
        } else {
            i0();
        }
    }

    public final void z(boolean z4) {
        ValueAnimator valueAnimator = this.f8089I0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8089I0.cancel();
        }
        if (!z4 || !this.f8087H0) {
            this.f8083F0.V(1.0f);
        } else {
            i(1.0f);
        }
        this.f8081E0 = false;
        if (A()) {
            T();
        }
        x0();
        A0();
        D0();
    }

    public final void z0() {
        if (this.f8116g != null) {
            C.u0(this.f8150x, Q() ? 0 : C.B(this.f8116g), this.f8116g.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(V1.c.f3028r), this.f8116g.getCompoundPaddingBottom());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r26, android.util.AttributeSet r27, int r28) {
        /*
            r25 = this;
            r0 = r25
            r7 = r27
            r8 = r28
            int r9 = f8071L0
            r1 = r26
            android.content.Context r1 = o2.C0822a.c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            n2.d r1 = new n2.d
            r1.<init>(r0)
            r0.f8120i = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f8097O = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f8098P = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f8099Q = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f8111d0 = r1
            r10 = 0
            r0.f8113e0 = r10
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>()
            r0.f8115f0 = r11
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f8119h0 = r1
            g2.a r1 = new g2.a
            r1.<init>(r0)
            r0.f8083F0 = r1
            android.content.Context r12 = r25.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r10)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r12)
            r0.f8108c = r2
            r2.setAddStatesFromChildren(r13)
            r0.addView(r2)
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            r14.<init>(r12)
            r0.f8110d = r14
            r14.setOrientation(r10)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r15 = -2
            r6 = -1
            r3.<init>(r15, r6, r4)
            r14.setLayoutParams(r3)
            r2.addView(r14)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r12)
            r0.f8112e = r5
            r5.setOrientation(r10)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 8388613(0x800005, float:1.175495E-38)
            r3.<init>(r15, r6, r4)
            r5.setLayoutParams(r3)
            r2.addView(r5)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r12)
            r0.f8114f = r4
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r15, r6)
            r4.setLayoutParams(r2)
            android.animation.TimeInterpolator r2 = W1.a.f3396a
            r1.a0(r2)
            r1.X(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.L(r2)
            int[] r3 = V1.j.r4
            int r1 = V1.j.K4
            int r2 = V1.j.I4
            int r6 = V1.j.X4
            int r15 = V1.j.c5
            int r10 = V1.j.g5
            int[] r6 = new int[]{r1, r2, r6, r15, r10}
            r1 = r12
            r2 = r27
            r10 = r4
            r4 = r28
            r15 = r5
            r5 = r9
            p.f0 r1 = g2.i.i(r1, r2, r3, r4, r5, r6)
            int r2 = V1.j.f5
            boolean r2 = r1.a(r2, r13)
            r0.f8072A = r2
            int r2 = V1.j.u4
            java.lang.CharSequence r2 = r1.p(r2)
            r0.setHint((java.lang.CharSequence) r2)
            int r2 = V1.j.e5
            boolean r2 = r1.a(r2, r13)
            r0.f8087H0 = r2
            int r2 = V1.j.Z4
            boolean r2 = r1.a(r2, r13)
            r0.f8085G0 = r2
            l2.k$b r2 = l2.k.e(r12, r7, r8, r9)
            l2.k r2 = r2.m()
            r0.f8082F = r2
            android.content.res.Resources r2 = r12.getResources()
            int r3 = V1.c.f3007J
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.f8084G = r2
            int r2 = V1.j.x4
            r3 = 0
            int r2 = r1.e(r2, r3)
            r0.f8088I = r2
            int r2 = V1.j.E4
            android.content.res.Resources r3 = r12.getResources()
            int r4 = V1.c.f3008K
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.f(r2, r3)
            r0.f8092K = r2
            int r2 = V1.j.F4
            android.content.res.Resources r3 = r12.getResources()
            int r4 = V1.c.f3009L
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.f(r2, r3)
            r0.f8094L = r2
            int r2 = r0.f8092K
            r0.f8090J = r2
            int r2 = V1.j.B4
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.d(r2, r3)
            int r4 = V1.j.A4
            float r4 = r1.d(r4, r3)
            int r5 = V1.j.y4
            float r5 = r1.d(r5, r3)
            int r6 = V1.j.z4
            float r3 = r1.d(r6, r3)
            l2.k r6 = r0.f8082F
            l2.k$b r6 = r6.v()
            r7 = 0
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x0162
            r6.A(r2)
        L_0x0162:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0169
            r6.E(r4)
        L_0x0169:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0170
            r6.w(r5)
        L_0x0170:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0177
            r6.s(r3)
        L_0x0177:
            l2.k r2 = r6.m()
            r0.f8082F = r2
            int r2 = V1.j.v4
            android.content.res.ColorStateList r2 = i2.c.b(r12, r1, r2)
            if (r2 == 0) goto L_0x01df
            int r3 = r2.getDefaultColor()
            r0.f8155z0 = r3
            r0.f8096N = r3
            boolean r3 = r2.isStateful()
            r4 = 16843623(0x1010367, float:2.3696E-38)
            r5 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r3 == 0) goto L_0x01bf
            int[] r3 = new int[]{r5}
            r6 = -1
            int r3 = r2.getColorForState(r3, r6)
            r0.f8073A0 = r3
            r3 = 16842908(0x101009c, float:2.3693995E-38)
            r5 = 16842910(0x101009e, float:2.3694E-38)
            int[] r3 = new int[]{r3, r5}
            int r3 = r2.getColorForState(r3, r6)
            r0.f8075B0 = r3
            int[] r3 = new int[]{r4, r5}
            int r2 = r2.getColorForState(r3, r6)
            r0.f8077C0 = r2
            goto L_0x01eb
        L_0x01bf:
            r6 = -1
            int r2 = r0.f8155z0
            r0.f8075B0 = r2
            int r2 = V1.b.f2994c
            android.content.res.ColorStateList r2 = j.C0754a.a(r12, r2)
            int[] r3 = new int[]{r5}
            int r3 = r2.getColorForState(r3, r6)
            r0.f8073A0 = r3
            int[] r3 = new int[]{r4}
            int r2 = r2.getColorForState(r3, r6)
            r0.f8077C0 = r2
            goto L_0x01eb
        L_0x01df:
            r2 = 0
            r6 = -1
            r0.f8096N = r2
            r0.f8155z0 = r2
            r0.f8073A0 = r2
            r0.f8075B0 = r2
            r0.f8077C0 = r2
        L_0x01eb:
            int r2 = V1.j.t4
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x01fd
            int r2 = V1.j.t4
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.f8145u0 = r2
            r0.f8143t0 = r2
        L_0x01fd:
            int r2 = V1.j.C4
            android.content.res.ColorStateList r2 = i2.c.b(r12, r1, r2)
            int r3 = V1.j.C4
            r4 = 0
            int r3 = r1.b(r3, r4)
            r0.f8151x0 = r3
            int r3 = V1.b.f2995d
            int r3 = H.a.c(r12, r3)
            r0.f8147v0 = r3
            int r3 = V1.b.f2996e
            int r3 = H.a.c(r12, r3)
            r0.f8079D0 = r3
            int r3 = V1.b.f2997f
            int r3 = H.a.c(r12, r3)
            r0.f8149w0 = r3
            if (r2 == 0) goto L_0x0229
            r0.setBoxStrokeColorStateList(r2)
        L_0x0229:
            int r2 = V1.j.D4
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x023a
            int r2 = V1.j.D4
            android.content.res.ColorStateList r2 = i2.c.b(r12, r1, r2)
            r0.setBoxStrokeErrorColor(r2)
        L_0x023a:
            int r2 = V1.j.g5
            int r2 = r1.n(r2, r6)
            if (r2 == r6) goto L_0x024d
            int r2 = V1.j.g5
            r3 = 0
            int r2 = r1.n(r2, r3)
            r0.setHintTextAppearance(r2)
            goto L_0x024e
        L_0x024d:
            r3 = 0
        L_0x024e:
            int r2 = V1.j.X4
            int r2 = r1.n(r2, r3)
            int r4 = V1.j.S4
            java.lang.CharSequence r4 = r1.p(r4)
            int r5 = V1.j.T4
            boolean r5 = r1.a(r5, r3)
            android.content.Context r7 = r25.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r8 = V1.g.f3086d
            android.view.View r7 = r7.inflate(r8, r15, r3)
            com.google.android.material.internal.CheckableImageButton r7 = (com.google.android.material.internal.CheckableImageButton) r7
            r0.f8139r0 = r7
            int r8 = V1.e.f3049F
            r7.setId(r8)
            r8 = 8
            r7.setVisibility(r8)
            boolean r9 = i2.c.g(r12)
            if (r9 == 0) goto L_0x028b
            android.view.ViewGroup$LayoutParams r9 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            S.C0320k.d(r9, r3)
        L_0x028b:
            int r3 = V1.j.U4
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x029c
            int r3 = V1.j.U4
            android.graphics.drawable.Drawable r3 = r1.g(r3)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r3)
        L_0x029c:
            int r3 = V1.j.V4
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x02ad
            int r3 = V1.j.V4
            android.content.res.ColorStateList r3 = i2.c.b(r12, r1, r3)
            r0.setErrorIconTintList(r3)
        L_0x02ad:
            int r3 = V1.j.W4
            boolean r3 = r1.s(r3)
            r9 = 0
            if (r3 == 0) goto L_0x02c3
            int r3 = V1.j.W4
            int r3 = r1.k(r3, r6)
            android.graphics.PorterDuff$Mode r3 = g2.j.e(r3, r9)
            r0.setErrorIconTintMode(r3)
        L_0x02c3:
            android.content.res.Resources r3 = r25.getResources()
            int r13 = V1.h.f3109f
            java.lang.CharSequence r3 = r3.getText(r13)
            r7.setContentDescription(r3)
            r3 = 2
            S.C.q0(r7, r3)
            r13 = 0
            r7.setClickable(r13)
            r7.setPressable(r13)
            r7.setFocusable(r13)
            int r3 = V1.j.c5
            int r3 = r1.n(r3, r13)
            int r9 = V1.j.b5
            boolean r9 = r1.a(r9, r13)
            int r8 = V1.j.a5
            java.lang.CharSequence r8 = r1.p(r8)
            int r6 = V1.j.o5
            int r6 = r1.n(r6, r13)
            int r13 = V1.j.n5
            java.lang.CharSequence r13 = r1.p(r13)
            r16 = r6
            int r6 = V1.j.r5
            r17 = r13
            r13 = 0
            int r6 = r1.n(r6, r13)
            int r13 = V1.j.q5
            java.lang.CharSequence r13 = r1.p(r13)
            r18 = r6
            int r6 = V1.j.z5
            r19 = r13
            r13 = 0
            int r6 = r1.n(r6, r13)
            int r13 = V1.j.y5
            java.lang.CharSequence r13 = r1.p(r13)
            r20 = r6
            int r6 = V1.j.G4
            r21 = r13
            r13 = 0
            boolean r6 = r1.a(r6, r13)
            int r13 = V1.j.H4
            r22 = r6
            r6 = -1
            int r13 = r1.k(r13, r6)
            r0.setCounterMaxLength(r13)
            int r6 = V1.j.K4
            r13 = 0
            int r6 = r1.n(r6, r13)
            r0.f8132o = r6
            int r6 = V1.j.I4
            int r6 = r1.n(r6, r13)
            r0.f8130n = r6
            android.content.Context r6 = r25.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r23 = r4
            int r4 = V1.g.f3087e
            android.view.View r4 = r6.inflate(r4, r14, r13)
            com.google.android.material.internal.CheckableImageButton r4 = (com.google.android.material.internal.CheckableImageButton) r4
            r0.f8101S = r4
            r6 = 8
            r4.setVisibility(r6)
            boolean r6 = i2.c.g(r12)
            if (r6 == 0) goto L_0x036e
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            S.C0320k.c(r6, r13)
        L_0x036e:
            r6 = 0
            r0.setStartIconOnClickListener(r6)
            r0.setStartIconOnLongClickListener(r6)
            int r6 = V1.j.v5
            boolean r6 = r1.s(r6)
            if (r6 == 0) goto L_0x03a1
            int r6 = V1.j.v5
            android.graphics.drawable.Drawable r6 = r1.g(r6)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r6)
            int r6 = V1.j.u5
            boolean r6 = r1.s(r6)
            if (r6 == 0) goto L_0x0397
            int r6 = V1.j.u5
            java.lang.CharSequence r6 = r1.p(r6)
            r0.setStartIconContentDescription((java.lang.CharSequence) r6)
        L_0x0397:
            int r6 = V1.j.t5
            r13 = 1
            boolean r6 = r1.a(r6, r13)
            r0.setStartIconCheckable(r6)
        L_0x03a1:
            int r6 = V1.j.w5
            boolean r6 = r1.s(r6)
            if (r6 == 0) goto L_0x03b2
            int r6 = V1.j.w5
            android.content.res.ColorStateList r6 = i2.c.b(r12, r1, r6)
            r0.setStartIconTintList(r6)
        L_0x03b2:
            int r6 = V1.j.x5
            boolean r6 = r1.s(r6)
            if (r6 == 0) goto L_0x03c9
            int r6 = V1.j.x5
            r13 = -1
            int r6 = r1.k(r6, r13)
            r13 = 0
            android.graphics.PorterDuff$Mode r6 = g2.j.e(r6, r13)
            r0.setStartIconTintMode(r6)
        L_0x03c9:
            int r6 = V1.j.w4
            r13 = 0
            int r6 = r1.k(r6, r13)
            r0.setBoxBackgroundMode(r6)
            android.content.Context r6 = r25.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r24 = r2
            int r2 = V1.g.f3086d
            android.view.View r2 = r6.inflate(r2, r10, r13)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.f8117g0 = r2
            r10.addView(r2)
            r6 = 8
            r2.setVisibility(r6)
            boolean r6 = i2.c.g(r12)
            if (r6 == 0) goto L_0x03fe
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            S.C0320k.d(r2, r13)
        L_0x03fe:
            n2.a r2 = new n2.a
            r2.<init>(r0)
            r6 = -1
            r11.append(r6, r2)
            n2.f r2 = new n2.f
            r2.<init>(r0)
            r11.append(r13, r2)
            com.google.android.material.textfield.c r2 = new com.google.android.material.textfield.c
            r2.<init>(r0)
            r6 = 1
            r11.append(r6, r2)
            com.google.android.material.textfield.a r2 = new com.google.android.material.textfield.a
            r2.<init>(r0)
            r6 = 2
            r11.append(r6, r2)
            com.google.android.material.textfield.b r2 = new com.google.android.material.textfield.b
            r2.<init>(r0)
            r6 = 3
            r11.append(r6, r2)
            int r2 = V1.j.P4
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x0469
            int r2 = V1.j.P4
            r6 = 0
            int r2 = r1.k(r2, r6)
            r0.setEndIconMode(r2)
            int r2 = V1.j.O4
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x044d
            int r2 = V1.j.O4
            android.graphics.drawable.Drawable r2 = r1.g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x044d:
            int r2 = V1.j.N4
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x045e
            int r2 = V1.j.N4
            java.lang.CharSequence r2 = r1.p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x045e:
            int r2 = V1.j.M4
            r6 = 1
            boolean r2 = r1.a(r2, r6)
            r0.setEndIconCheckable(r2)
            goto L_0x04b5
        L_0x0469:
            int r2 = V1.j.k5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x04b5
            int r2 = V1.j.k5
            r6 = 0
            boolean r2 = r1.a(r2, r6)
            r0.setEndIconMode(r2)
            int r2 = V1.j.j5
            android.graphics.drawable.Drawable r2 = r1.g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
            int r2 = V1.j.i5
            java.lang.CharSequence r2 = r1.p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
            int r2 = V1.j.l5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x049e
            int r2 = V1.j.l5
            android.content.res.ColorStateList r2 = i2.c.b(r12, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x049e:
            int r2 = V1.j.m5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x04b5
            int r2 = V1.j.m5
            r6 = -1
            int r2 = r1.k(r2, r6)
            r6 = 0
            android.graphics.PorterDuff$Mode r2 = g2.j.e(r2, r6)
            r0.setEndIconTintMode(r2)
        L_0x04b5:
            int r2 = V1.j.k5
            boolean r2 = r1.s(r2)
            if (r2 != 0) goto L_0x04e5
            int r2 = V1.j.Q4
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x04ce
            int r2 = V1.j.Q4
            android.content.res.ColorStateList r2 = i2.c.b(r12, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x04ce:
            int r2 = V1.j.R4
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x04e5
            int r2 = V1.j.R4
            r6 = -1
            int r2 = r1.k(r2, r6)
            r6 = 0
            android.graphics.PorterDuff$Mode r2 = g2.j.e(r2, r6)
            r0.setEndIconTintMode(r2)
        L_0x04e5:
            p.y r2 = new p.y
            r2.<init>(r12)
            r0.f8150x = r2
            int r6 = V1.e.f3054K
            r2.setId(r6)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r11 = -2
            r6.<init>(r11, r11)
            r2.setLayoutParams(r6)
            r6 = 1
            S.C.i0(r2, r6)
            r14.addView(r4)
            r14.addView(r2)
            p.y r2 = new p.y
            r2.<init>(r12)
            r0.f8154z = r2
            int r4 = V1.e.f3055L
            r2.setId(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r6 = 80
            r11 = -2
            r4.<init>(r11, r11, r6)
            r2.setLayoutParams(r4)
            r4 = 1
            S.C.i0(r2, r4)
            r15.addView(r2)
            r15.addView(r7)
            r15.addView(r10)
            r0.setHelperTextEnabled(r9)
            r0.setHelperText(r8)
            r0.setHelperTextTextAppearance(r3)
            r0.setErrorEnabled(r5)
            r2 = r24
            r0.setErrorTextAppearance(r2)
            r2 = r23
            r0.setErrorContentDescription(r2)
            int r2 = r0.f8132o
            r0.setCounterTextAppearance(r2)
            int r2 = r0.f8130n
            r0.setCounterOverflowTextAppearance(r2)
            r2 = r17
            r0.setPlaceholderText(r2)
            r2 = r16
            r0.setPlaceholderTextAppearance(r2)
            r2 = r19
            r0.setPrefixText(r2)
            r2 = r18
            r0.setPrefixTextAppearance(r2)
            r2 = r21
            r0.setSuffixText(r2)
            r2 = r20
            r0.setSuffixTextAppearance(r2)
            int r2 = V1.j.Y4
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x0577
            int r2 = V1.j.Y4
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setErrorTextColor(r2)
        L_0x0577:
            int r2 = V1.j.d5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x0588
            int r2 = V1.j.d5
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setHelperTextColor(r2)
        L_0x0588:
            int r2 = V1.j.h5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x0599
            int r2 = V1.j.h5
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setHintTextColor(r2)
        L_0x0599:
            int r2 = V1.j.L4
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x05aa
            int r2 = V1.j.L4
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setCounterTextColor(r2)
        L_0x05aa:
            int r2 = V1.j.J4
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x05bb
            int r2 = V1.j.J4
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x05bb:
            int r2 = V1.j.p5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x05cc
            int r2 = V1.j.p5
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x05cc:
            int r2 = V1.j.s5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x05dd
            int r2 = V1.j.s5
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setPrefixTextColor(r2)
        L_0x05dd:
            int r2 = V1.j.A5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x05ee
            int r2 = V1.j.A5
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setSuffixTextColor(r2)
        L_0x05ee:
            r2 = r22
            r0.setCounterEnabled(r2)
            int r2 = V1.j.s4
            r3 = 1
            boolean r2 = r1.a(r2, r3)
            r0.setEnabled(r2)
            r1.w()
            r1 = 2
            S.C.q0(r0, r1)
            S.C.s0(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f8117g0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f8117g0.setImageDrawable(drawable);
        V();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f8101S.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f8101S.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            Y();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f8139r0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f8120i.x());
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f8117g0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f8117g0.setImageDrawable(drawable);
    }

    public void setHint(int i4) {
        setHint(i4 != 0 ? getResources().getText(i4) : null);
    }
}
