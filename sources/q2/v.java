package q2;

import android.os.IBinder;

public final /* synthetic */ class v implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ D f11916a;

    public /* synthetic */ v(D d4) {
        this.f11916a = d4;
    }

    public final void binderDied() {
        D.j(this.f11916a);
    }
}
