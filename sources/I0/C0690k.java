package i0;

import android.graphics.Rect;
import android.view.View;
import i0.C0685f;

/* renamed from: i0.k  reason: case insensitive filesystem */
public final /* synthetic */ class C0690k implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ U f10103e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f10104f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Rect f10105g;

    public /* synthetic */ C0690k(U u4, View view, Rect rect) {
        this.f10103e = u4;
        this.f10104f = view;
        this.f10105g = rect;
    }

    public final void run() {
        C0685f.g.q(this.f10103e, this.f10104f, this.f10105g);
    }
}
