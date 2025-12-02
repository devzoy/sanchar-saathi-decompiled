package i0;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0384k;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.s;
import d.l;
import x0.C1001g;

/* renamed from: i0.n  reason: case insensitive filesystem */
public class C0693n extends C0695p implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: g0  reason: collision with root package name */
    public Handler f10109g0;

    /* renamed from: h0  reason: collision with root package name */
    public Runnable f10110h0 = new a();

    /* renamed from: i0  reason: collision with root package name */
    public DialogInterface.OnCancelListener f10111i0 = new b();

    /* renamed from: j0  reason: collision with root package name */
    public DialogInterface.OnDismissListener f10112j0 = new c();

    /* renamed from: k0  reason: collision with root package name */
    public int f10113k0 = 0;

    /* renamed from: l0  reason: collision with root package name */
    public int f10114l0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f10115m0 = true;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f10116n0 = true;

    /* renamed from: o0  reason: collision with root package name */
    public int f10117o0 = -1;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f10118p0;

    /* renamed from: q0  reason: collision with root package name */
    public s f10119q0 = new d();

    /* renamed from: r0  reason: collision with root package name */
    public Dialog f10120r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f10121s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f10122t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f10123u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f10124v0 = false;

    /* renamed from: i0.n$a */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            C0693n.this.f10112j0.onDismiss(C0693n.this.f10120r0);
        }
    }

    /* renamed from: i0.n$b */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (C0693n.this.f10120r0 != null) {
                C0693n nVar = C0693n.this;
                nVar.onCancel(nVar.f10120r0);
            }
        }
    }

    /* renamed from: i0.n$c */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (C0693n.this.f10120r0 != null) {
                C0693n nVar = C0693n.this;
                nVar.onDismiss(nVar.f10120r0);
            }
        }
    }

    /* renamed from: i0.n$d */
    public class d implements s {
        public d() {
        }

        /* renamed from: b */
        public void a(C0384k kVar) {
            if (kVar != null && C0693n.this.f10116n0) {
                View r12 = C0693n.this.r1();
                if (r12.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (C0693n.this.f10120r0 != null) {
                    if (I.I0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + C0693n.this.f10120r0);
                    }
                    C0693n.this.f10120r0.setContentView(r12);
                }
            }
        }
    }

    /* renamed from: i0.n$e */
    public class e extends C0701w {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ C0701w f10129c;

        public e(C0701w wVar) {
            this.f10129c = wVar;
        }

        public View i(int i4) {
            return this.f10129c.j() ? this.f10129c.i(i4) : C0693n.this.L1(i4);
        }

        public boolean j() {
            return this.f10129c.j() || C0693n.this.M1();
        }
    }

    public final void H1(boolean z4, boolean z5, boolean z6) {
        if (!this.f10122t0) {
            this.f10122t0 = true;
            this.f10123u0 = false;
            Dialog dialog = this.f10120r0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f10120r0.dismiss();
                if (!z5) {
                    if (Looper.myLooper() == this.f10109g0.getLooper()) {
                        onDismiss(this.f10120r0);
                    } else {
                        this.f10109g0.post(this.f10110h0);
                    }
                }
            }
            this.f10121s0 = true;
            if (this.f10117o0 >= 0) {
                if (z6) {
                    H().c1(this.f10117o0, 1);
                } else {
                    H().a1(this.f10117o0, 1, z4);
                }
                this.f10117o0 = -1;
                return;
            }
            Q n4 = H().n();
            n4.o(true);
            n4.l(this);
            if (z6) {
                n4.h();
            } else if (z4) {
                n4.g();
            } else {
                n4.f();
            }
        }
    }

    public Dialog I1() {
        return this.f10120r0;
    }

    public int J1() {
        return this.f10114l0;
    }

    public Dialog K1(Bundle bundle) {
        if (I.I0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new l(q1(), J1());
    }

    public void L0(Bundle bundle) {
        super.L0(bundle);
        Dialog dialog = this.f10120r0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i4 = this.f10113k0;
        if (i4 != 0) {
            bundle.putInt("android:style", i4);
        }
        int i5 = this.f10114l0;
        if (i5 != 0) {
            bundle.putInt("android:theme", i5);
        }
        boolean z4 = this.f10115m0;
        if (!z4) {
            bundle.putBoolean("android:cancelable", z4);
        }
        boolean z5 = this.f10116n0;
        if (!z5) {
            bundle.putBoolean("android:showsDialog", z5);
        }
        int i6 = this.f10117o0;
        if (i6 != -1) {
            bundle.putInt("android:backStackId", i6);
        }
    }

    public View L1(int i4) {
        Dialog dialog = this.f10120r0;
        if (dialog != null) {
            return dialog.findViewById(i4);
        }
        return null;
    }

    public void M0() {
        super.M0();
        Dialog dialog = this.f10120r0;
        if (dialog != null) {
            this.f10121s0 = false;
            dialog.show();
            View decorView = this.f10120r0.getWindow().getDecorView();
            J.a(decorView, this);
            K.a(decorView, this);
            C1001g.a(decorView, this);
        }
    }

    public boolean M1() {
        return this.f10124v0;
    }

    public void N0() {
        super.N0();
        Dialog dialog = this.f10120r0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void N1(Bundle bundle) {
        if (this.f10116n0 && !this.f10124v0) {
            try {
                this.f10118p0 = true;
                Dialog K12 = K1(bundle);
                this.f10120r0 = K12;
                if (this.f10116n0) {
                    Q1(K12, this.f10113k0);
                    Context u4 = u();
                    if (u4 instanceof Activity) {
                        this.f10120r0.setOwnerActivity((Activity) u4);
                    }
                    this.f10120r0.setCancelable(this.f10115m0);
                    this.f10120r0.setOnCancelListener(this.f10111i0);
                    this.f10120r0.setOnDismissListener(this.f10112j0);
                    this.f10124v0 = true;
                } else {
                    this.f10120r0 = null;
                }
            } finally {
                this.f10118p0 = false;
            }
        }
    }

    public final Dialog O1() {
        Dialog I12 = I1();
        if (I12 != null) {
            return I12;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void P0(Bundle bundle) {
        Bundle bundle2;
        super.P0(bundle);
        if (this.f10120r0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f10120r0.onRestoreInstanceState(bundle2);
        }
    }

    public void P1(boolean z4) {
        this.f10116n0 = z4;
    }

    public void Q1(Dialog dialog, int i4) {
        if (!(i4 == 1 || i4 == 2)) {
            if (i4 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void R1(I i4, String str) {
        this.f10122t0 = false;
        this.f10123u0 = true;
        Q n4 = i4.n();
        n4.o(true);
        n4.d(this, str);
        n4.f();
    }

    public void W0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.W0(layoutInflater, viewGroup, bundle);
        if (this.f10144L == null && this.f10120r0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f10120r0.onRestoreInstanceState(bundle2);
        }
    }

    public C0701w g() {
        return new e(super.g());
    }

    public void j0(Bundle bundle) {
        super.j0(bundle);
    }

    public void m0(Context context) {
        super.m0(context);
        W().e(this.f10119q0);
        if (!this.f10123u0) {
            this.f10122t0 = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f10121s0) {
            if (I.I0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            H1(true, true, false);
        }
    }

    public void p0(Bundle bundle) {
        super.p0(bundle);
        this.f10109g0 = new Handler();
        this.f10116n0 = this.f10134B == 0;
        if (bundle != null) {
            this.f10113k0 = bundle.getInt("android:style", 0);
            this.f10114l0 = bundle.getInt("android:theme", 0);
            this.f10115m0 = bundle.getBoolean("android:cancelable", true);
            this.f10116n0 = bundle.getBoolean("android:showsDialog", this.f10116n0);
            this.f10117o0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void w0() {
        super.w0();
        Dialog dialog = this.f10120r0;
        if (dialog != null) {
            this.f10121s0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f10120r0.dismiss();
            if (!this.f10122t0) {
                onDismiss(this.f10120r0);
            }
            this.f10120r0 = null;
            this.f10124v0 = false;
        }
    }

    public void x0() {
        super.x0();
        if (!this.f10123u0 && !this.f10122t0) {
            this.f10122t0 = true;
        }
        W().i(this.f10119q0);
    }

    public LayoutInflater y0(Bundle bundle) {
        LayoutInflater y02 = super.y0(bundle);
        if (!this.f10116n0 || this.f10118p0) {
            if (I.I0(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (!this.f10116n0) {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                } else {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                }
            }
            return y02;
        }
        N1(bundle);
        if (I.I0(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f10120r0;
        return dialog != null ? y02.cloneInContext(dialog.getContext()) : y02;
    }
}
