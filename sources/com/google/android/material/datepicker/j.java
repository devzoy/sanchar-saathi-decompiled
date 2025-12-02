package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.b;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class j<S> extends o {

    /* renamed from: h0  reason: collision with root package name */
    public int f7940h0;

    /* renamed from: i0  reason: collision with root package name */
    public a f7941i0;

    public class a extends n {
        public a() {
        }
    }

    public static j G1(d dVar, int i4, a aVar) {
        j jVar = new j();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i4);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        jVar.w1(bundle);
        return jVar;
    }

    public void L0(Bundle bundle) {
        super.L0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f7940h0);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7941i0);
    }

    public void p0(Bundle bundle) {
        super.p0(bundle);
        if (bundle == null) {
            bundle = r();
        }
        this.f7940h0 = bundle.getInt("THEME_RES_ID_KEY");
        b.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f7941i0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public View t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(u(), this.f7940h0));
        new a();
        throw null;
    }
}
