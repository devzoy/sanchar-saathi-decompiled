package com.google.android.material.datepicker;

import S.C;
import S.C0310a;
import V1.c;
import V1.d;
import V1.e;
import V1.h;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import c2.C0404a;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import i0.C0693n;
import i0.Q;
import j.C0754a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l2.g;

public final class i<S> extends C0693n {

    /* renamed from: M0  reason: collision with root package name */
    public static final Object f7919M0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: N0  reason: collision with root package name */
    public static final Object f7920N0 = "CANCEL_BUTTON_TAG";

    /* renamed from: O0  reason: collision with root package name */
    public static final Object f7921O0 = "TOGGLE_BUTTON_TAG";

    /* renamed from: A0  reason: collision with root package name */
    public int f7922A0;

    /* renamed from: B0  reason: collision with root package name */
    public o f7923B0;

    /* renamed from: C0  reason: collision with root package name */
    public a f7924C0;

    /* renamed from: D0  reason: collision with root package name */
    public h f7925D0;

    /* renamed from: E0  reason: collision with root package name */
    public int f7926E0;

    /* renamed from: F0  reason: collision with root package name */
    public CharSequence f7927F0;

    /* renamed from: G0  reason: collision with root package name */
    public boolean f7928G0;

    /* renamed from: H0  reason: collision with root package name */
    public int f7929H0;

    /* renamed from: I0  reason: collision with root package name */
    public TextView f7930I0;

    /* renamed from: J0  reason: collision with root package name */
    public CheckableImageButton f7931J0;

    /* renamed from: K0  reason: collision with root package name */
    public g f7932K0;

    /* renamed from: L0  reason: collision with root package name */
    public Button f7933L0;

    /* renamed from: w0  reason: collision with root package name */
    public final LinkedHashSet f7934w0 = new LinkedHashSet();

    /* renamed from: x0  reason: collision with root package name */
    public final LinkedHashSet f7935x0 = new LinkedHashSet();

    /* renamed from: y0  reason: collision with root package name */
    public final LinkedHashSet f7936y0 = new LinkedHashSet();

    /* renamed from: z0  reason: collision with root package name */
    public final LinkedHashSet f7937z0 = new LinkedHashSet();

    public class a extends n {
        public a() {
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            Button unused = i.this.f7933L0;
            d unused2 = i.this.getClass();
            throw null;
        }
    }

    public static Drawable U1(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C0754a.b(context, d.f3038b));
        stateListDrawable.addState(new int[0], C0754a.b(context, d.f3039c));
        return stateListDrawable;
    }

    public static int V1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(c.f2999B) + resources.getDimensionPixelOffset(c.f3000C) + resources.getDimensionPixelOffset(c.f2998A);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(c.f3033w);
        int i4 = l.f7950g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(c.f3031u) * i4) + ((i4 - 1) * resources.getDimensionPixelOffset(c.f3036z)) + resources.getDimensionPixelOffset(c.f3029s);
    }

    public static int X1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(c.f3030t);
        int i4 = k.n().f7946h;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(c.f3032v) * i4) + ((i4 - 1) * resources.getDimensionPixelOffset(c.f3035y));
    }

    public static boolean a2(Context context) {
        return c2(context, 16843277);
    }

    public static boolean b2(Context context) {
        return c2(context, V1.a.f2986u);
    }

    public static boolean c2(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2.b.c(context, V1.a.f2983r, h.class.getCanonicalName()), new int[]{i4});
        boolean z4 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z4;
    }

    public final Dialog K1(Bundle bundle) {
        Dialog dialog = new Dialog(q1(), Y1(q1()));
        Context context = dialog.getContext();
        this.f7928G0 = a2(context);
        int c4 = i2.b.c(context, V1.a.f2976k, i.class.getCanonicalName());
        g gVar = new g(context, (AttributeSet) null, V1.a.f2983r, V1.i.f3132m);
        this.f7932K0 = gVar;
        gVar.K(context);
        this.f7932K0.U(ColorStateList.valueOf(c4));
        this.f7932K0.T(C.t(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public final void L0(Bundle bundle) {
        super.L0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f7922A0);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        a.b bVar = new a.b(this.f7924C0);
        if (this.f7925D0.P1() != null) {
            bVar.b(this.f7925D0.P1().f7948j);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f7926E0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f7927F0);
    }

    public void M0() {
        super.M0();
        Window window = O1().getWindow();
        if (this.f7928G0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f7932K0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = N().getDimensionPixelOffset(c.f3034x);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f7932K0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new C0404a(O1(), rect));
        }
        d2();
    }

    public void N0() {
        this.f7923B0.F1();
        super.N0();
    }

    public String W1() {
        u();
        throw null;
    }

    public final int Y1(Context context) {
        int i4 = this.f7922A0;
        if (i4 != 0) {
            return i4;
        }
        throw null;
    }

    public final void Z1(Context context) {
        this.f7931J0.setTag(f7921O0);
        this.f7931J0.setImageDrawable(U1(context));
        this.f7931J0.setChecked(this.f7929H0 != 0);
        C.g0(this.f7931J0, (C0310a) null);
        f2(this.f7931J0);
        this.f7931J0.setOnClickListener(new b());
    }

    public final void d2() {
        int Y12 = Y1(q1());
        this.f7925D0 = h.T1((d) null, Y12, this.f7924C0);
        this.f7923B0 = this.f7931J0.isChecked() ? j.G1((d) null, Y12, this.f7924C0) : this.f7925D0;
        e2();
        Q n4 = s().n();
        n4.m(e.f3076u, this.f7923B0);
        n4.h();
        this.f7923B0.E1(new a());
    }

    public final void e2() {
        String W12 = W1();
        this.f7930I0.setContentDescription(String.format(T(h.f3112i), new Object[]{W12}));
        this.f7930I0.setText(W12);
    }

    public final void f2(CheckableImageButton checkableImageButton) {
        this.f7931J0.setContentDescription(this.f7931J0.isChecked() ? checkableImageButton.getContext().getString(h.f3115l) : checkableImageButton.getContext().getString(h.f3117n));
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f7936y0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f7937z0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) V();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void p0(Bundle bundle) {
        super.p0(bundle);
        if (bundle == null) {
            bundle = r();
        }
        this.f7922A0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        android.support.v4.media.session.b.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f7924C0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f7926E0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f7927F0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f7929H0 = bundle.getInt("INPUT_MODE_KEY");
    }

    public final View t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f7928G0 ? V1.g.f3103u : V1.g.f3102t, viewGroup);
        Context context = inflate.getContext();
        if (this.f7928G0) {
            inflate.findViewById(e.f3076u).setLayoutParams(new LinearLayout.LayoutParams(X1(context), -2));
        } else {
            View findViewById = inflate.findViewById(e.f3077v);
            View findViewById2 = inflate.findViewById(e.f3076u);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(X1(context), -1));
            findViewById2.setMinimumHeight(V1(q1()));
        }
        TextView textView = (TextView) inflate.findViewById(e.f3080y);
        this.f7930I0 = textView;
        C.i0(textView, 1);
        this.f7931J0 = (CheckableImageButton) inflate.findViewById(e.f3081z);
        TextView textView2 = (TextView) inflate.findViewById(e.f3044A);
        CharSequence charSequence = this.f7927F0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f7926E0);
        }
        Z1(context);
        this.f7933L0 = (Button) inflate.findViewById(e.f3058c);
        throw null;
    }
}
