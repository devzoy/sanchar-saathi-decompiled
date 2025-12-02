package com.google.android.material.datepicker;

import V1.g;
import V1.h;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

public class s extends RecyclerView.g {

    /* renamed from: c  reason: collision with root package name */
    public final h f7969c;

    public static class a extends RecyclerView.C {

        /* renamed from: t  reason: collision with root package name */
        public final TextView f7970t;

        public a(TextView textView) {
            super(textView);
            this.f7970t = textView;
        }
    }

    public s(h hVar) {
        this.f7969c = hVar;
    }

    public int c() {
        return this.f7969c.N1().l();
    }

    public int t(int i4) {
        return i4 - this.f7969c.N1().k().f7945g;
    }

    public int u(int i4) {
        return this.f7969c.N1().k().f7945g + i4;
    }

    /* renamed from: v */
    public void i(a aVar, int i4) {
        int u4 = u(i4);
        String string = aVar.f7970t.getContext().getString(h.f3114k);
        aVar.f7970t.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(u4)}));
        aVar.f7970t.setContentDescription(String.format(string, new Object[]{Integer.valueOf(u4)}));
        c O12 = this.f7969c.O1();
        if (r.g().get(1) == u4) {
            b bVar = O12.f7877f;
        } else {
            b bVar2 = O12.f7875d;
        }
        this.f7969c.Q1();
        throw null;
    }

    /* renamed from: w */
    public a k(ViewGroup viewGroup, int i4) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(g.f3099q, viewGroup, false));
    }
}
