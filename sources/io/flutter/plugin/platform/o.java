package io.flutter.plugin.platform;

import android.view.View;

public final /* synthetic */ class o implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f10563a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10564b;

    public /* synthetic */ o(t tVar, int i4) {
        this.f10563a = tVar;
        this.f10564b = i4;
    }

    public final void onFocusChange(View view, boolean z4) {
        this.f10563a.b0(this.f10564b, view, z4);
    }
}
