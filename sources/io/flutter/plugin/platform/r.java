package io.flutter.plugin.platform;

import X2.q;
import android.view.View;

public final /* synthetic */ class r implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f10568a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q.d f10569b;

    public /* synthetic */ r(t tVar, q.d dVar) {
        this.f10568a = tVar;
        this.f10569b = dVar;
    }

    public final void onFocusChange(View view, boolean z4) {
        this.f10568a.a0(this.f10569b, view, z4);
    }
}
