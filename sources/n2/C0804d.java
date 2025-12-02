package n2;

import S.C;
import V1.c;
import V1.e;
import W1.b;
import X.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import p.C0857y;

/* renamed from: n2.d  reason: case insensitive filesystem */
public final class C0804d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11237a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f11238b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f11239c;

    /* renamed from: d  reason: collision with root package name */
    public int f11240d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f11241e;

    /* renamed from: f  reason: collision with root package name */
    public Animator f11242f;

    /* renamed from: g  reason: collision with root package name */
    public final float f11243g;

    /* renamed from: h  reason: collision with root package name */
    public int f11244h;

    /* renamed from: i  reason: collision with root package name */
    public int f11245i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f11246j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11247k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f11248l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f11249m;

    /* renamed from: n  reason: collision with root package name */
    public int f11250n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f11251o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f11252p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f11253q;

    /* renamed from: r  reason: collision with root package name */
    public TextView f11254r;

    /* renamed from: s  reason: collision with root package name */
    public int f11255s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f11256t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f11257u;

    /* renamed from: n2.d$a */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f11258a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f11259b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f11260c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TextView f11261d;

        public a(int i4, TextView textView, int i5, TextView textView2) {
            this.f11258a = i4;
            this.f11259b = textView;
            this.f11260c = i5;
            this.f11261d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C0804d.this.f11244h = this.f11258a;
            Animator unused2 = C0804d.this.f11242f = null;
            TextView textView = this.f11259b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f11260c == 1 && C0804d.this.f11248l != null) {
                    C0804d.this.f11248l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f11261d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f11261d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f11261d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C0804d(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f11237a = context;
        this.f11238b = textInputLayout;
        this.f11243g = (float) context.getResources().getDimensionPixelSize(c.f3015e);
    }

    public final void A(int i4, int i5) {
        TextView l4;
        TextView l5;
        if (i4 != i5) {
            if (!(i5 == 0 || (l5 = l(i5)) == null)) {
                l5.setVisibility(0);
                l5.setAlpha(1.0f);
            }
            if (!(i4 == 0 || (l4 = l(i4)) == null)) {
                l4.setVisibility(4);
                if (i4 == 1) {
                    l4.setText((CharSequence) null);
                }
            }
            this.f11244h = i5;
        }
    }

    public void B(CharSequence charSequence) {
        this.f11249m = charSequence;
        TextView textView = this.f11248l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void C(boolean z4) {
        if (this.f11247k != z4) {
            g();
            if (z4) {
                C0857y yVar = new C0857y(this.f11237a);
                this.f11248l = yVar;
                yVar.setId(e.f3051H);
                this.f11248l.setTextAlignment(5);
                Typeface typeface = this.f11257u;
                if (typeface != null) {
                    this.f11248l.setTypeface(typeface);
                }
                D(this.f11250n);
                E(this.f11251o);
                B(this.f11249m);
                this.f11248l.setVisibility(4);
                C.i0(this.f11248l, 1);
                d(this.f11248l, 0);
            } else {
                t();
                z(this.f11248l, 0);
                this.f11248l = null;
                this.f11238b.r0();
                this.f11238b.E0();
            }
            this.f11247k = z4;
        }
    }

    public void D(int i4) {
        this.f11250n = i4;
        TextView textView = this.f11248l;
        if (textView != null) {
            this.f11238b.e0(textView, i4);
        }
    }

    public void E(ColorStateList colorStateList) {
        this.f11251o = colorStateList;
        TextView textView = this.f11248l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void F(int i4) {
        this.f11255s = i4;
        TextView textView = this.f11254r;
        if (textView != null) {
            h.m(textView, i4);
        }
    }

    public void G(boolean z4) {
        if (this.f11253q != z4) {
            g();
            if (z4) {
                C0857y yVar = new C0857y(this.f11237a);
                this.f11254r = yVar;
                yVar.setId(e.f3052I);
                this.f11254r.setTextAlignment(5);
                Typeface typeface = this.f11257u;
                if (typeface != null) {
                    this.f11254r.setTypeface(typeface);
                }
                this.f11254r.setVisibility(4);
                C.i0(this.f11254r, 1);
                F(this.f11255s);
                H(this.f11256t);
                d(this.f11254r, 1);
            } else {
                u();
                z(this.f11254r, 1);
                this.f11254r = null;
                this.f11238b.r0();
                this.f11238b.E0();
            }
            this.f11253q = z4;
        }
    }

    public void H(ColorStateList colorStateList) {
        this.f11256t = colorStateList;
        TextView textView = this.f11254r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void I(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void J(Typeface typeface) {
        if (typeface != this.f11257u) {
            this.f11257u = typeface;
            I(this.f11248l, typeface);
            I(this.f11254r, typeface);
        }
    }

    public final void K(ViewGroup viewGroup, int i4) {
        if (i4 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean L(TextView textView, CharSequence charSequence) {
        return C.M(this.f11238b) && this.f11238b.isEnabled() && (this.f11245i != this.f11244h || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    public void M(CharSequence charSequence) {
        g();
        this.f11246j = charSequence;
        this.f11248l.setText(charSequence);
        int i4 = this.f11244h;
        if (i4 != 1) {
            this.f11245i = 1;
        }
        O(i4, this.f11245i, L(this.f11248l, charSequence));
    }

    public void N(CharSequence charSequence) {
        g();
        this.f11252p = charSequence;
        this.f11254r.setText(charSequence);
        int i4 = this.f11244h;
        if (i4 != 2) {
            this.f11245i = 2;
        }
        O(i4, this.f11245i, L(this.f11254r, charSequence));
    }

    public final void O(int i4, int i5, boolean z4) {
        boolean z5 = z4;
        if (i4 != i5) {
            if (z5) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f11242f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i6 = i4;
                int i7 = i5;
                h(arrayList2, this.f11253q, this.f11254r, 2, i6, i7);
                h(arrayList2, this.f11247k, this.f11248l, 1, i6, i7);
                b.a(animatorSet, arrayList);
                animatorSet.addListener(new a(i5, l(i4), i4, l(i5)));
                animatorSet.start();
            } else {
                A(i4, i5);
            }
            this.f11238b.r0();
            this.f11238b.u0(z5);
            this.f11238b.E0();
        }
    }

    public void d(TextView textView, int i4) {
        if (this.f11239c == null && this.f11241e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f11237a);
            this.f11239c = linearLayout;
            linearLayout.setOrientation(0);
            this.f11238b.addView(this.f11239c, -1, -2);
            this.f11241e = new FrameLayout(this.f11237a);
            this.f11239c.addView(this.f11241e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f11238b.getEditText() != null) {
                e();
            }
        }
        if (w(i4)) {
            this.f11241e.setVisibility(0);
            this.f11241e.addView(textView);
        } else {
            this.f11239c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f11239c.setVisibility(0);
        this.f11240d++;
    }

    public void e() {
        if (f()) {
            EditText editText = this.f11238b.getEditText();
            boolean g4 = i2.c.g(this.f11237a);
            C.u0(this.f11239c, s(g4, c.f3026p, C.B(editText)), s(g4, c.f3027q, this.f11237a.getResources().getDimensionPixelSize(c.f3025o)), s(g4, c.f3026p, C.A(editText)), 0);
        }
    }

    public final boolean f() {
        return (this.f11239c == null || this.f11238b.getEditText() == null) ? false : true;
    }

    public void g() {
        Animator animator = this.f11242f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void h(List list, boolean z4, TextView textView, int i4, int i5, int i6) {
        if (textView != null && z4) {
            if (i4 == i6 || i4 == i5) {
                list.add(i(textView, i6 == i4));
                if (i6 == i4) {
                    list.add(j(textView));
                }
            }
        }
    }

    public final ObjectAnimator i(TextView textView, boolean z4) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z4 ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(W1.a.f3396a);
        return ofFloat;
    }

    public final ObjectAnimator j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f11243g, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(W1.a.f3399d);
        return ofFloat;
    }

    public boolean k() {
        return v(this.f11245i);
    }

    public final TextView l(int i4) {
        if (i4 == 1) {
            return this.f11248l;
        }
        if (i4 != 2) {
            return null;
        }
        return this.f11254r;
    }

    public CharSequence m() {
        return this.f11249m;
    }

    public CharSequence n() {
        return this.f11246j;
    }

    public int o() {
        TextView textView = this.f11248l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList p() {
        TextView textView = this.f11248l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence q() {
        return this.f11252p;
    }

    public int r() {
        TextView textView = this.f11254r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int s(boolean z4, int i4, int i5) {
        return z4 ? this.f11237a.getResources().getDimensionPixelSize(i4) : i5;
    }

    public void t() {
        this.f11246j = null;
        g();
        if (this.f11244h == 1) {
            if (!this.f11253q || TextUtils.isEmpty(this.f11252p)) {
                this.f11245i = 0;
            } else {
                this.f11245i = 2;
            }
        }
        O(this.f11244h, this.f11245i, L(this.f11248l, (CharSequence) null));
    }

    public void u() {
        g();
        int i4 = this.f11244h;
        if (i4 == 2) {
            this.f11245i = 0;
        }
        O(i4, this.f11245i, L(this.f11254r, (CharSequence) null));
    }

    public final boolean v(int i4) {
        return i4 == 1 && this.f11248l != null && !TextUtils.isEmpty(this.f11246j);
    }

    public boolean w(int i4) {
        return i4 == 0 || i4 == 1;
    }

    public boolean x() {
        return this.f11247k;
    }

    public boolean y() {
        return this.f11253q;
    }

    public void z(TextView textView, int i4) {
        FrameLayout frameLayout;
        if (this.f11239c != null) {
            if (!w(i4) || (frameLayout = this.f11241e) == null) {
                this.f11239c.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i5 = this.f11240d - 1;
            this.f11240d = i5;
            K(this.f11239c, i5);
        }
    }
}
