package w2;

import android.os.IBinder;

public final /* synthetic */ class k implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f12659a;

    public /* synthetic */ k(t tVar) {
        this.f12659a = tVar;
    }

    public final void binderDied() {
        t.j(this.f12659a);
    }
}
