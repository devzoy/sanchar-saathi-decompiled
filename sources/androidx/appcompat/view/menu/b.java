package androidx.appcompat.view.menu;

import S.C;
import S.C0317h;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import h.C0648d;
import h.g;
import java.util.ArrayList;
import java.util.List;
import o.C0811d;
import p.S;
import p.U;

public final class b extends C0811d implements i, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: D  reason: collision with root package name */
    public static final int f4206D = g.f9299e;

    /* renamed from: A  reason: collision with root package name */
    public ViewTreeObserver f4207A;

    /* renamed from: B  reason: collision with root package name */
    public PopupWindow.OnDismissListener f4208B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f4209C;

    /* renamed from: d  reason: collision with root package name */
    public final Context f4210d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4211e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4212f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4213g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4214h;

    /* renamed from: i  reason: collision with root package name */
    public final Handler f4215i;

    /* renamed from: j  reason: collision with root package name */
    public final List f4216j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final List f4217k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f4218l = new a();

    /* renamed from: m  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f4219m = new C0083b();

    /* renamed from: n  reason: collision with root package name */
    public final S f4220n = new c();

    /* renamed from: o  reason: collision with root package name */
    public int f4221o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f4222p = 0;

    /* renamed from: q  reason: collision with root package name */
    public View f4223q;

    /* renamed from: r  reason: collision with root package name */
    public View f4224r;

    /* renamed from: s  reason: collision with root package name */
    public int f4225s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4226t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4227u;

    /* renamed from: v  reason: collision with root package name */
    public int f4228v;

    /* renamed from: w  reason: collision with root package name */
    public int f4229w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4230x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4231y;

    /* renamed from: z  reason: collision with root package name */
    public i.a f4232z;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (b.this.c() && b.this.f4217k.size() > 0 && !((d) b.this.f4217k.get(0)).f4240a.B()) {
                View view = b.this.f4224r;
                if (view == null || !view.isShown()) {
                    b.this.dismiss();
                    return;
                }
                for (d dVar : b.this.f4217k) {
                    dVar.f4240a.a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    public class C0083b implements View.OnAttachStateChangeListener {
        public C0083b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f4207A;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f4207A = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f4207A.removeGlobalOnLayoutListener(bVar.f4218l);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements S {

        public class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ d f4236e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ MenuItem f4237f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ e f4238g;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.f4236e = dVar;
                this.f4237f = menuItem;
                this.f4238g = eVar;
            }

            public void run() {
                d dVar = this.f4236e;
                if (dVar != null) {
                    b.this.f4209C = true;
                    dVar.f4241b.e(false);
                    b.this.f4209C = false;
                }
                if (this.f4237f.isEnabled() && this.f4237f.hasSubMenu()) {
                    this.f4238g.L(this.f4237f, 4);
                }
            }
        }

        public c() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.appcompat.view.menu.b$d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(androidx.appcompat.view.menu.e r6, android.view.MenuItem r7) {
            /*
                r5 = this;
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                android.os.Handler r0 = r0.f4215i
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                java.util.List r0 = r0.f4217k
                int r0 = r0.size()
                r2 = 0
            L_0x0011:
                r3 = -1
                if (r2 >= r0) goto L_0x0026
                androidx.appcompat.view.menu.b r4 = androidx.appcompat.view.menu.b.this
                java.util.List r4 = r4.f4217k
                java.lang.Object r4 = r4.get(r2)
                androidx.appcompat.view.menu.b$d r4 = (androidx.appcompat.view.menu.b.d) r4
                androidx.appcompat.view.menu.e r4 = r4.f4241b
                if (r6 != r4) goto L_0x0023
                goto L_0x0027
            L_0x0023:
                int r2 = r2 + 1
                goto L_0x0011
            L_0x0026:
                r2 = r3
            L_0x0027:
                if (r2 != r3) goto L_0x002a
                return
            L_0x002a:
                int r2 = r2 + 1
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                java.util.List r0 = r0.f4217k
                int r0 = r0.size()
                if (r2 >= r0) goto L_0x0041
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                java.util.List r0 = r0.f4217k
                java.lang.Object r0 = r0.get(r2)
                r1 = r0
                androidx.appcompat.view.menu.b$d r1 = (androidx.appcompat.view.menu.b.d) r1
            L_0x0041:
                androidx.appcompat.view.menu.b$c$a r0 = new androidx.appcompat.view.menu.b$c$a
                r0.<init>(r1, r7, r6)
                long r1 = android.os.SystemClock.uptimeMillis()
                r3 = 200(0xc8, double:9.9E-322)
                long r1 = r1 + r3
                androidx.appcompat.view.menu.b r7 = androidx.appcompat.view.menu.b.this
                android.os.Handler r7 = r7.f4215i
                r7.postAtTime(r0, r6, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.c.d(androidx.appcompat.view.menu.e, android.view.MenuItem):void");
        }

        public void e(e eVar, MenuItem menuItem) {
            b.this.f4215i.removeCallbacksAndMessages(eVar);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final U f4240a;

        /* renamed from: b  reason: collision with root package name */
        public final e f4241b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4242c;

        public d(U u4, e eVar, int i4) {
            this.f4240a = u4;
            this.f4241b = eVar;
            this.f4242c = i4;
        }

        public ListView a() {
            return this.f4240a.g();
        }
    }

    public b(Context context, View view, int i4, int i5, boolean z4) {
        this.f4210d = context;
        this.f4223q = view;
        this.f4212f = i4;
        this.f4213g = i5;
        this.f4214h = z4;
        this.f4230x = false;
        this.f4225s = D();
        Resources resources = context.getResources();
        this.f4211e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0648d.f9203b));
        this.f4215i = new Handler();
    }

    public final int A(e eVar) {
        int size = this.f4217k.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (eVar == ((d) this.f4217k.get(i4)).f4241b) {
                return i4;
            }
        }
        return -1;
    }

    public final MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = eVar.getItem(i4);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View C(d dVar, e eVar) {
        int i4;
        d dVar2;
        int firstVisiblePosition;
        MenuItem B4 = B(dVar.f4241b, eVar);
        if (B4 == null) {
            return null;
        }
        ListView a4 = dVar.a();
        ListAdapter adapter = a4.getAdapter();
        int i5 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i4 = headerViewListAdapter.getHeadersCount();
            dVar2 = (d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (d) adapter;
            i4 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i5 >= count) {
                i5 = -1;
                break;
            } else if (B4 == dVar2.getItem(i5)) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 != -1 && (firstVisiblePosition = (i5 + i4) - a4.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a4.getChildCount()) {
            return a4.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int D() {
        return C.x(this.f4223q) == 1 ? 0 : 1;
    }

    public final int E(int i4) {
        List list = this.f4217k;
        ListView a4 = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a4.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f4224r.getWindowVisibleDisplayFrame(rect);
        return this.f4225s == 1 ? (iArr[0] + a4.getWidth()) + i4 > rect.right ? 0 : 1 : iArr[0] - i4 < 0 ? 1 : 0;
    }

    public final void F(e eVar) {
        View view;
        d dVar;
        LayoutInflater from = LayoutInflater.from(this.f4210d);
        d dVar2 = new d(eVar, from, this.f4214h, f4206D);
        if (!c() && this.f4230x) {
            dVar2.d(true);
        } else if (c()) {
            dVar2.d(C0811d.x(eVar));
        }
        int o4 = C0811d.o(dVar2, (ViewGroup) null, this.f4210d, this.f4211e);
        U z4 = z();
        z4.p(dVar2);
        z4.F(o4);
        z4.G(this.f4222p);
        if (this.f4217k.size() > 0) {
            List list = this.f4217k;
            dVar = (d) list.get(list.size() - 1);
            view = C(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z4.U(false);
            z4.R((Object) null);
            int E4 = E(o4);
            boolean z5 = E4 == 1;
            this.f4225s = E4;
            z4.D(view);
            if ((this.f4222p & 5) != 5) {
                o4 = z5 ? view.getWidth() : 0 - o4;
            } else if (!z5) {
                o4 = 0 - view.getWidth();
            }
            z4.l(o4);
            z4.M(true);
            z4.j(0);
        } else {
            if (this.f4226t) {
                z4.l(this.f4228v);
            }
            if (this.f4227u) {
                z4.j(this.f4229w);
            }
            z4.H(n());
        }
        this.f4217k.add(new d(z4, eVar, this.f4225s));
        z4.a();
        ListView g4 = z4.g();
        g4.setOnKeyListener(this);
        if (dVar == null && this.f4231y && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(g.f9306l, g4, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.x());
            g4.addHeaderView(frameLayout, (Object) null, false);
            z4.a();
        }
    }

    public void a() {
        if (!c()) {
            for (e F4 : this.f4216j) {
                F(F4);
            }
            this.f4216j.clear();
            View view = this.f4223q;
            this.f4224r = view;
            if (view != null) {
                boolean z4 = this.f4207A == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f4207A = viewTreeObserver;
                if (z4) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f4218l);
                }
                this.f4224r.addOnAttachStateChangeListener(this.f4219m);
            }
        }
    }

    public void b(e eVar, boolean z4) {
        int A4 = A(eVar);
        if (A4 >= 0) {
            int i4 = A4 + 1;
            if (i4 < this.f4217k.size()) {
                ((d) this.f4217k.get(i4)).f4241b.e(false);
            }
            d dVar = (d) this.f4217k.remove(A4);
            dVar.f4241b.O(this);
            if (this.f4209C) {
                dVar.f4240a.S((Object) null);
                dVar.f4240a.E(0);
            }
            dVar.f4240a.dismiss();
            int size = this.f4217k.size();
            if (size > 0) {
                this.f4225s = ((d) this.f4217k.get(size - 1)).f4242c;
            } else {
                this.f4225s = D();
            }
            if (size == 0) {
                dismiss();
                i.a aVar = this.f4232z;
                if (aVar != null) {
                    aVar.b(eVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f4207A;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f4207A.removeGlobalOnLayoutListener(this.f4218l);
                    }
                    this.f4207A = null;
                }
                this.f4224r.removeOnAttachStateChangeListener(this.f4219m);
                this.f4208B.onDismiss();
            } else if (z4) {
                ((d) this.f4217k.get(0)).f4241b.e(false);
            }
        }
    }

    public boolean c() {
        return this.f4217k.size() > 0 && ((d) this.f4217k.get(0)).f4240a.c();
    }

    public void dismiss() {
        int size = this.f4217k.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f4217k.toArray(new d[size]);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                d dVar = dVarArr[i4];
                if (dVar.f4240a.c()) {
                    dVar.f4240a.dismiss();
                }
            }
        }
    }

    public boolean e(l lVar) {
        for (d dVar : this.f4217k) {
            if (lVar == dVar.f4241b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        l(lVar);
        i.a aVar = this.f4232z;
        if (aVar != null) {
            aVar.c(lVar);
        }
        return true;
    }

    public void f(boolean z4) {
        for (d a4 : this.f4217k) {
            C0811d.y(a4.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public ListView g() {
        if (this.f4217k.isEmpty()) {
            return null;
        }
        List list = this.f4217k;
        return ((d) list.get(list.size() - 1)).a();
    }

    public boolean h() {
        return false;
    }

    public void k(i.a aVar) {
        this.f4232z = aVar;
    }

    public void l(e eVar) {
        eVar.c(this, this.f4210d);
        if (c()) {
            F(eVar);
        } else {
            this.f4216j.add(eVar);
        }
    }

    public boolean m() {
        return false;
    }

    public void onDismiss() {
        d dVar;
        int size = this.f4217k.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f4217k.get(i4);
            if (!dVar.f4240a.c()) {
                break;
            }
            i4++;
        }
        if (dVar != null) {
            dVar.f4241b.e(false);
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
        if (this.f4223q != view) {
            this.f4223q = view;
            this.f4222p = C0317h.b(this.f4221o, C.x(view));
        }
    }

    public void r(boolean z4) {
        this.f4230x = z4;
    }

    public void s(int i4) {
        if (this.f4221o != i4) {
            this.f4221o = i4;
            this.f4222p = C0317h.b(i4, C.x(this.f4223q));
        }
    }

    public void t(int i4) {
        this.f4226t = true;
        this.f4228v = i4;
    }

    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f4208B = onDismissListener;
    }

    public void v(boolean z4) {
        this.f4231y = z4;
    }

    public void w(int i4) {
        this.f4227u = true;
        this.f4229w = i4;
    }

    public final U z() {
        U u4 = new U(this.f4210d, (AttributeSet) null, this.f4212f, this.f4213g);
        u4.T(this.f4220n);
        u4.L(this);
        u4.K(this);
        u4.D(this.f4223q);
        u4.G(this.f4222p);
        u4.J(true);
        u4.I(2);
        return u4;
    }
}
