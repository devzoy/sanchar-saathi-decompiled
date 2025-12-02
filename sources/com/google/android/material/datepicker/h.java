package com.google.android.material.datepicker;

import S.C;
import S.C0310a;
import T.m;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

public final class h<S> extends o {

    /* renamed from: q0  reason: collision with root package name */
    public static final Object f7885q0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: r0  reason: collision with root package name */
    public static final Object f7886r0 = "NAVIGATION_PREV_TAG";

    /* renamed from: s0  reason: collision with root package name */
    public static final Object f7887s0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: t0  reason: collision with root package name */
    public static final Object f7888t0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: h0  reason: collision with root package name */
    public int f7889h0;

    /* renamed from: i0  reason: collision with root package name */
    public a f7890i0;

    /* renamed from: j0  reason: collision with root package name */
    public k f7891j0;

    /* renamed from: k0  reason: collision with root package name */
    public k f7892k0;

    /* renamed from: l0  reason: collision with root package name */
    public c f7893l0;

    /* renamed from: m0  reason: collision with root package name */
    public RecyclerView f7894m0;

    /* renamed from: n0  reason: collision with root package name */
    public RecyclerView f7895n0;

    /* renamed from: o0  reason: collision with root package name */
    public View f7896o0;

    /* renamed from: p0  reason: collision with root package name */
    public View f7897p0;

    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f7898e;

        public a(int i4) {
            this.f7898e = i4;
        }

        public void run() {
            h.this.f7895n0.o1(this.f7898e);
        }
    }

    public class b extends C0310a {
        public b() {
        }

        public void g(View view, m mVar) {
            super.g(view, mVar);
            mVar.e0((Object) null);
        }
    }

    public class c extends p {

        /* renamed from: I  reason: collision with root package name */
        public final /* synthetic */ int f7901I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, int i4, boolean z4, int i5) {
            super(context, i4, z4);
            this.f7901I = i5;
        }

        public void M1(RecyclerView.z zVar, int[] iArr) {
            if (this.f7901I == 0) {
                iArr[0] = h.this.f7895n0.getWidth();
                iArr[1] = h.this.f7895n0.getWidth();
                return;
            }
            iArr[0] = h.this.f7895n0.getHeight();
            iArr[1] = h.this.f7895n0.getHeight();
        }
    }

    public class d implements l {
        public d() {
        }

        public void a(long j4) {
            if (h.this.f7890i0.g().b(j4)) {
                d unused = h.this.getClass();
                throw null;
            }
        }
    }

    public class e extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        public final Calendar f7904a = r.i();

        /* renamed from: b  reason: collision with root package name */
        public final Calendar f7905b = r.i();

        public e() {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            if ((recyclerView.getAdapter() instanceof s) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                s sVar = (s) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                d unused = h.this.getClass();
                throw null;
            }
        }
    }

    public class f extends C0310a {
        public f() {
        }

        public void g(View view, m mVar) {
            super.g(view, mVar);
            mVar.n0(h.this.f7897p0.getVisibility() == 0 ? h.this.T(V1.h.f3118o) : h.this.T(V1.h.f3116m));
        }
    }

    public class g extends RecyclerView.s {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m f7908a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ MaterialButton f7909b;

        public g(m mVar, MaterialButton materialButton) {
            this.f7908a = mVar;
            this.f7909b = materialButton;
        }

        public void a(RecyclerView recyclerView, int i4) {
            if (i4 == 0) {
                recyclerView.announceForAccessibility(this.f7909b.getText());
            }
        }

        public void b(RecyclerView recyclerView, int i4, int i5) {
            int Z12 = i4 < 0 ? h.this.S1().Z1() : h.this.S1().c2();
            k unused = h.this.f7891j0 = this.f7908a.u(Z12);
            this.f7909b.setText(this.f7908a.v(Z12));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$h  reason: collision with other inner class name */
    public class C0130h implements View.OnClickListener {
        public C0130h() {
        }

        public void onClick(View view) {
            h.this.X1();
        }
    }

    public class i implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ m f7912c;

        public i(m mVar) {
            this.f7912c = mVar;
        }

        public void onClick(View view) {
            int Z12 = h.this.S1().Z1() + 1;
            if (Z12 < h.this.f7895n0.getAdapter().c()) {
                h.this.V1(this.f7912c.u(Z12));
            }
        }
    }

    public class j implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ m f7914c;

        public j(m mVar) {
            this.f7914c = mVar;
        }

        public void onClick(View view) {
            int c22 = h.this.S1().c2() - 1;
            if (c22 >= 0) {
                h.this.V1(this.f7914c.u(c22));
            }
        }
    }

    public enum k {
        DAY,
        YEAR
    }

    public interface l {
        void a(long j4);
    }

    public static int R1(Context context) {
        return context.getResources().getDimensionPixelSize(V1.c.f3031u);
    }

    public static h T1(d dVar, int i4, a aVar) {
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i4);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.j());
        hVar.w1(bundle);
        return hVar;
    }

    public boolean E1(n nVar) {
        return super.E1(nVar);
    }

    public void L0(Bundle bundle) {
        super.L0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f7889h0);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7890i0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f7891j0);
    }

    public final void L1(View view, m mVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(V1.e.f3070o);
        materialButton.setTag(f7888t0);
        C.g0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(V1.e.f3072q);
        materialButton2.setTag(f7886r0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(V1.e.f3071p);
        materialButton3.setTag(f7887s0);
        this.f7896o0 = view.findViewById(V1.e.f3079x);
        this.f7897p0 = view.findViewById(V1.e.f3074s);
        W1(k.DAY);
        materialButton.setText(this.f7891j0.r(view.getContext()));
        this.f7895n0.k(new g(mVar, materialButton));
        materialButton.setOnClickListener(new C0130h());
        materialButton3.setOnClickListener(new i(mVar));
        materialButton2.setOnClickListener(new j(mVar));
    }

    public final RecyclerView.n M1() {
        return new e();
    }

    public a N1() {
        return this.f7890i0;
    }

    public c O1() {
        return this.f7893l0;
    }

    public k P1() {
        return this.f7891j0;
    }

    public d Q1() {
        return null;
    }

    public LinearLayoutManager S1() {
        return (LinearLayoutManager) this.f7895n0.getLayoutManager();
    }

    public final void U1(int i4) {
        this.f7895n0.post(new a(i4));
    }

    public void V1(k kVar) {
        m mVar = (m) this.f7895n0.getAdapter();
        int w4 = mVar.w(kVar);
        int w5 = w4 - mVar.w(this.f7891j0);
        boolean z4 = false;
        boolean z5 = Math.abs(w5) > 3;
        if (w5 > 0) {
            z4 = true;
        }
        this.f7891j0 = kVar;
        if (z5 && z4) {
            this.f7895n0.g1(w4 - 3);
            U1(w4);
        } else if (z5) {
            this.f7895n0.g1(w4 + 3);
            U1(w4);
        } else {
            U1(w4);
        }
    }

    public void W1(k kVar) {
        this.f7892k0 = kVar;
        if (kVar == k.YEAR) {
            this.f7894m0.getLayoutManager().x1(((s) this.f7894m0.getAdapter()).t(this.f7891j0.f7945g));
            this.f7896o0.setVisibility(0);
            this.f7897p0.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f7896o0.setVisibility(8);
            this.f7897p0.setVisibility(0);
            V1(this.f7891j0);
        }
    }

    public void X1() {
        k kVar = this.f7892k0;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            W1(k.DAY);
        } else if (kVar == k.DAY) {
            W1(kVar2);
        }
    }

    public void p0(Bundle bundle) {
        super.p0(bundle);
        if (bundle == null) {
            bundle = r();
        }
        this.f7889h0 = bundle.getInt("THEME_RES_ID_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f7890i0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f7891j0 = (k) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public View t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i4;
        int i5;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(u(), this.f7889h0);
        this.f7893l0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        k k4 = this.f7890i0.k();
        if (i.a2(contextThemeWrapper)) {
            i5 = V1.g.f3098p;
            i4 = 1;
        } else {
            i5 = V1.g.f3096n;
            i4 = 0;
        }
        View inflate = cloneInContext.inflate(i5, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(V1.e.f3075t);
        C.g0(gridView, new b());
        gridView.setAdapter(new g());
        gridView.setNumColumns(k4.f7946h);
        gridView.setEnabled(false);
        this.f7895n0 = (RecyclerView) inflate.findViewById(V1.e.f3078w);
        this.f7895n0.setLayoutManager(new c(u(), i4, false, i4));
        this.f7895n0.setTag(f7885q0);
        m mVar = new m(contextThemeWrapper, (d) null, this.f7890i0, new d());
        this.f7895n0.setAdapter(mVar);
        int integer = contextThemeWrapper.getResources().getInteger(V1.f.f3082a);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(V1.e.f3079x);
        this.f7894m0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f7894m0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f7894m0.setAdapter(new s(this));
            this.f7894m0.h(M1());
        }
        if (inflate.findViewById(V1.e.f3070o) != null) {
            L1(inflate, mVar);
        }
        if (!i.a2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.f7895n0);
        }
        this.f7895n0.g1(mVar.w(this.f7891j0));
        return inflate;
    }
}
