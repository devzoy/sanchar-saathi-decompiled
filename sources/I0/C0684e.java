package i0;

import android.view.View;
import android.view.ViewGroup;
import i0.C0685f;

/* renamed from: i0.e  reason: case insensitive filesystem */
public final /* synthetic */ class C0684e implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f10046e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f10047f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0685f.a f10048g;

    public /* synthetic */ C0684e(ViewGroup viewGroup, View view, C0685f.a aVar) {
        this.f10046e = viewGroup;
        this.f10047f = view;
        this.f10048g = aVar;
    }

    public final void run() {
        C0685f.a.C0168a.b(this.f10046e, this.f10047f, this.f10048g);
    }
}
