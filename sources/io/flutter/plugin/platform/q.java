package io.flutter.plugin.platform;

import X2.q;
import android.view.View;

public final /* synthetic */ class q implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f10566a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q.d f10567b;

    public /* synthetic */ q(t tVar, q.d dVar) {
        this.f10566a = tVar;
        this.f10567b = dVar;
    }

    public final void onFocusChange(View view, boolean z4) {
        this.f10566a.Z(this.f10567b, view, z4);
    }
}
