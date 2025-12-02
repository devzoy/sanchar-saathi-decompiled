package w1;

import Q1.l;
import java.util.Objects;

public final class K implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l f12541e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ M f12542f;

    public K(M m4, l lVar) {
        this.f12541e = lVar;
        Objects.requireNonNull(m4);
        this.f12542f = m4;
    }

    public final void run() {
        this.f12542f.K(this.f12541e);
    }
}
