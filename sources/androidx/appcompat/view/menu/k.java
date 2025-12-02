package androidx.appcompat.view.menu;

import S.C;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import h.C0648d;
import h.g;
import o.C0811d;
import p.U;

public final class k extends C0811d implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, i, View.OnKeyListener {

    /* renamed from: x  reason: collision with root package name */
    public static final int f4336x = g.f9307m;

    /* renamed from: d  reason: collision with root package name */
    public final Context f4337d;

    /* renamed from: e  reason: collision with root package name */
    public final e f4338e;

    /* renamed from: f  reason: collision with root package name */
    public final d f4339f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4340g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4341h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4342i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4343j;

    /* renamed from: k  reason: collision with root package name */
    public final U f4344k;

    /* renamed from: l  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f4345l = new a();

    /* renamed from: m  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f4346m = new b();

    /* renamed from: n  reason: collision with root package name */
    public PopupWindow.OnDismissListener f4347n;

    /* renamed from: o  reason: collision with root package name */
    public View f4348o;

    /* renamed from: p  reason: collision with root package name */
    public View f4349p;

    /* renamed from: q  reason: collision with root package name */
    public i.a f4350q;

    /* renamed from: r  reason: collision with root package name */
    public ViewTreeObserver f4351r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4352s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4353t;

    /* renamed from: u  reason: collision with root package name */
    public int f4354u;

    /* renamed from: v  reason: collision with root package name */
    public int f4355v = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4356w;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (k.this.c() && !k.this.f4344k.B()) {
                View view = k.this.f4349p;
                if (view == null || !view.isShown()) {
                    k.this.dismiss();
                } else {
                    k.this.f4344k.a();
                }
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.f4351r;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.f4351r = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.f4351r.removeGlobalOnLayoutListener(kVar.f4345l);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i4, int i5, boolean z4) {
        this.f4337d = context;
        this.f4338e = eVar;
        this.f4340g = z4;
        this.f4339f = new d(eVar, LayoutInflater.from(context), z4, f4336x);
        this.f4342i = i4;
        this.f4343j = i5;
        Resources resources = context.getResources();
        this.f4341h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0648d.f9203b));
        this.f4348o = view;
        this.f4344k = new U(context, (AttributeSet) null, i4, i5);
        eVar.c(this, context);
    }

    public void a() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void b(e eVar, boolean z4) {
        if (eVar == this.f4338e) {
            dismiss();
            i.a aVar = this.f4350q;
            if (aVar != null) {
                aVar.b(eVar, z4);
            }
        }
    }

    public boolean c() {
        return !this.f4352s && this.f4344k.c();
    }

    public void dismiss() {
        if (c()) {
            this.f4344k.dismiss();
        }
    }

    public boolean e(l lVar) {
        if (lVar.hasVisibleItems()) {
            h hVar = new h(this.f4337d, lVar, this.f4349p, this.f4340g, this.f4342i, this.f4343j);
            hVar.j(this.f4350q);
            hVar.g(C0811d.x(lVar));
            hVar.i(this.f4347n);
            this.f4347n = null;
            this.f4338e.e(false);
            int b4 = this.f4344k.b();
            int n4 = this.f4344k.n();
            if ((Gravity.getAbsoluteGravity(this.f4355v, C.x(this.f4348o)) & 7) == 5) {
                b4 += this.f4348o.getWidth();
            }
            if (hVar.n(b4, n4)) {
                i.a aVar = this.f4350q;
                if (aVar == null) {
                    return true;
                }
                aVar.c(lVar);
                return true;
            }
        }
        return false;
    }

    public void f(boolean z4) {
        this.f4353t = false;
        d dVar = this.f4339f;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    public ListView g() {
        return this.f4344k.g();
    }

    public boolean h() {
        return false;
    }

    public void k(i.a aVar) {
        this.f4350q = aVar;
    }

    public void l(e eVar) {
    }

    public void onDismiss() {
        this.f4352s = true;
        this.f4338e.close();
        ViewTreeObserver viewTreeObserver = this.f4351r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4351r = this.f4349p.getViewTreeObserver();
            }
            this.f4351r.removeGlobalOnLayoutListener(this.f4345l);
            this.f4351r = null;
        }
        this.f4349p.removeOnAttachStateChangeListener(this.f4346m);
        PopupWindow.OnDismissListener onDismissListener = this.f4347n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void p(View view) {
        this.f4348o = view;
    }

    public void r(boolean z4) {
        this.f4339f.d(z4);
    }

    public void s(int i4) {
        this.f4355v = i4;
    }

    public void t(int i4) {
        this.f4344k.l(i4);
    }

    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f4347n = onDismissListener;
    }

    public void v(boolean z4) {
        this.f4356w = z4;
    }

    public void w(int i4) {
        this.f4344k.j(i4);
    }

    public final boolean z() {
        View view;
        if (c()) {
            return true;
        }
        if (this.f4352s || (view = this.f4348o) == null) {
            return false;
        }
        this.f4349p = view;
        this.f4344k.K(this);
        this.f4344k.L(this);
        this.f4344k.J(true);
        View view2 = this.f4349p;
        boolean z4 = this.f4351r == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f4351r = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f4345l);
        }
        view2.addOnAttachStateChangeListener(this.f4346m);
        this.f4344k.D(view2);
        this.f4344k.G(this.f4355v);
        if (!this.f4353t) {
            this.f4354u = C0811d.o(this.f4339f, (ViewGroup) null, this.f4337d, this.f4341h);
            this.f4353t = true;
        }
        this.f4344k.F(this.f4354u);
        this.f4344k.I(2);
        this.f4344k.H(n());
        this.f4344k.a();
        ListView g4 = this.f4344k.g();
        g4.setOnKeyListener(this);
        if (this.f4356w && this.f4338e.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f4337d).inflate(g.f9306l, g4, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f4338e.x());
            }
            frameLayout.setEnabled(false);
            g4.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f4344k.p(this.f4339f);
        this.f4344k.a();
        return true;
    }
}
