package w1;

import java.util.Objects;

/* renamed from: w1.u  reason: case insensitive filesystem */
public final class C0987u implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0988v f12629e;

    public C0987u(C0988v vVar) {
        Objects.requireNonNull(vVar);
        this.f12629e = vVar;
    }

    public final void run() {
        C0989w wVar = this.f12629e.f12630a;
        wVar.J().e(wVar.J().getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
