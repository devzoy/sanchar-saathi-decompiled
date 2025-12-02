package w1;

import java.util.Objects;

/* renamed from: w1.t  reason: case insensitive filesystem */
public final class C0986t implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f12627e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0989w f12628f;

    public C0986t(C0989w wVar, int i4) {
        this.f12627e = i4;
        Objects.requireNonNull(wVar);
        this.f12628f = wVar;
    }

    public final void run() {
        this.f12628f.F(this.f12627e);
    }
}
