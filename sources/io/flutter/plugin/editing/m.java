package io.flutter.plugin.editing;

import X2.t;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class m implements t.b {

    /* renamed from: a  reason: collision with root package name */
    public final t f10452a;

    /* renamed from: b  reason: collision with root package name */
    public final InputMethodManager f10453b;

    /* renamed from: c  reason: collision with root package name */
    public View f10454c;

    public m(View view, InputMethodManager inputMethodManager, t tVar) {
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f10454c = view;
        this.f10453b = inputMethodManager;
        this.f10452a = tVar;
        tVar.g(this);
    }

    public boolean a() {
        return Build.VERSION.SDK_INT >= 34 && c();
    }

    public void b() {
        this.f10453b.startStylusHandwriting(this.f10454c);
    }

    public boolean c() {
        return this.f10453b.isStylusHandwritingAvailable();
    }
}
