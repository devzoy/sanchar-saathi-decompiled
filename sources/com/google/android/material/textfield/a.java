package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import j.C0754a;
import n2.C0803c;

public class a extends C0803c {

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f8166d = new C0132a();

    /* renamed from: e  reason: collision with root package name */
    public final View.OnFocusChangeListener f8167e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.f f8168f = new c();

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.g f8169g = new d();

    /* renamed from: h  reason: collision with root package name */
    public AnimatorSet f8170h;

    /* renamed from: i  reason: collision with root package name */
    public ValueAnimator f8171i;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    public class C0132a implements TextWatcher {
        public C0132a() {
        }

        public void afterTextChanged(Editable editable) {
            if (a.this.f11234a.getSuffixText() == null) {
                a.this.i(a.l(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        public void onFocusChange(View view, boolean z4) {
            a.this.i(!TextUtils.isEmpty(((EditText) view).getText()) && z4);
        }
    }

    public class c implements TextInputLayout.f {
        public c() {
        }

        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && a.l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(a.this.f8167e);
            editText.removeTextChangedListener(a.this.f8166d);
            editText.addTextChangedListener(a.this.f8166d);
        }
    }

    public class d implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.a$d$a  reason: collision with other inner class name */
        public class C0133a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ EditText f8176e;

            public C0133a(EditText editText) {
                this.f8176e = editText;
            }

            public void run() {
                this.f8176e.removeTextChangedListener(a.this.f8166d);
            }
        }

        public d() {
        }

        public void a(TextInputLayout textInputLayout, int i4) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i4 == 2) {
                editText.post(new C0133a(editText));
                if (editText.getOnFocusChangeListener() == a.this.f8167e) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        public void onClick(View view) {
            Editable text = a.this.f11234a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f11234a.V();
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        public void onAnimationStart(Animator animator) {
            a.this.f11234a.setEndIconVisible(true);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        public void onAnimationEnd(Animator animator) {
            a.this.f11234a.setEndIconVisible(false);
        }
    }

    public class h implements ValueAnimator.AnimatorUpdateListener {
        public h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f11236c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f11236c.setScaleX(floatValue);
            a.this.f11236c.setScaleY(floatValue);
        }
    }

    public a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public static boolean l(Editable editable) {
        return editable.length() > 0;
    }

    public void a() {
        this.f11234a.setEndIconDrawable(C0754a.b(this.f11235b, V1.d.f3042f));
        TextInputLayout textInputLayout = this.f11234a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(V1.h.f3108e));
        this.f11234a.setEndIconOnClickListener(new e());
        this.f11234a.e(this.f8168f);
        this.f11234a.f(this.f8169g);
        m();
    }

    public void c(boolean z4) {
        if (this.f11234a.getSuffixText() != null) {
            i(z4);
        }
    }

    public final void i(boolean z4) {
        boolean z5 = this.f11234a.K() == z4;
        if (z4 && !this.f8170h.isRunning()) {
            this.f8171i.cancel();
            this.f8170h.start();
            if (z5) {
                this.f8170h.end();
            }
        } else if (!z4) {
            this.f8170h.cancel();
            this.f8171i.start();
            if (z5) {
                this.f8171i.end();
            }
        }
    }

    public final ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(W1.a.f3396a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    public final ValueAnimator k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(W1.a.f3399d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    public final void m() {
        ValueAnimator k4 = k();
        ValueAnimator j4 = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f8170h = animatorSet;
        animatorSet.playTogether(new Animator[]{k4, j4});
        this.f8170h.addListener(new f());
        ValueAnimator j5 = j(1.0f, 0.0f);
        this.f8171i = j5;
        j5.addListener(new g());
    }
}
