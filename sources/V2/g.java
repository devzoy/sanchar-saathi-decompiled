package v2;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

public final class g extends ResultReceiver {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ R1.g f12430e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, Handler handler, R1.g gVar) {
        super(handler);
        this.f12430e = gVar;
    }

    public final void onReceiveResult(int i4, Bundle bundle) {
        this.f12430e.d((Object) null);
    }
}
