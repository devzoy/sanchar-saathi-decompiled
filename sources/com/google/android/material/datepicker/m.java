package com.google.android.material.datepicker;

import S.C;
import V1.e;
import V1.g;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;

public class m extends RecyclerView.g {

    /* renamed from: c  reason: collision with root package name */
    public final Context f7955c;

    /* renamed from: d  reason: collision with root package name */
    public final a f7956d;

    /* renamed from: e  reason: collision with root package name */
    public final h.l f7957e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7958f;

    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ MaterialCalendarGridView f7959c;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.f7959c = materialCalendarGridView;
        }

        public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
            if (this.f7959c.getAdapter().l(i4)) {
                m.this.f7957e.a(this.f7959c.getAdapter().getItem(i4).longValue());
            }
        }
    }

    public static class b extends RecyclerView.C {

        /* renamed from: t  reason: collision with root package name */
        public final TextView f7961t;

        /* renamed from: u  reason: collision with root package name */
        public final MaterialCalendarGridView f7962u;

        public b(LinearLayout linearLayout, boolean z4) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(e.f3073r);
            this.f7961t = textView;
            C.h0(textView, true);
            this.f7962u = (MaterialCalendarGridView) linearLayout.findViewById(e.f3069n);
            if (!z4) {
                textView.setVisibility(8);
            }
        }
    }

    public m(Context context, d dVar, a aVar, h.l lVar) {
        k k4 = aVar.k();
        k h4 = aVar.h();
        k j4 = aVar.j();
        if (k4.compareTo(j4) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (j4.compareTo(h4) <= 0) {
            int R12 = l.f7950g * h.R1(context);
            int R13 = i.a2(context) ? h.R1(context) : 0;
            this.f7955c = context;
            this.f7958f = R12 + R13;
            this.f7956d = aVar;
            this.f7957e = lVar;
            r(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public int c() {
        return this.f7956d.i();
    }

    public long d(int i4) {
        return this.f7956d.k().t(i4).s();
    }

    public k u(int i4) {
        return this.f7956d.k().t(i4);
    }

    public CharSequence v(int i4) {
        return u(i4).r(this.f7955c);
    }

    public int w(k kVar) {
        return this.f7956d.k().u(kVar);
    }

    /* renamed from: x */
    public void i(b bVar, int i4) {
        k t4 = this.f7956d.k().t(i4);
        bVar.f7961t.setText(t4.r(bVar.f5707a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f7962u.findViewById(e.f3069n);
        if (materialCalendarGridView.getAdapter() == null || !t4.equals(materialCalendarGridView.getAdapter().f7951c)) {
            l lVar = new l(t4, (d) null, this.f7956d);
            materialCalendarGridView.setNumColumns(t4.f7946h);
            materialCalendarGridView.setAdapter((ListAdapter) lVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().k(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    /* renamed from: y */
    public b k(ViewGroup viewGroup, int i4) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(g.f3097o, viewGroup, false);
        if (!i.a2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f7958f));
        return new b(linearLayout, true);
    }
}
