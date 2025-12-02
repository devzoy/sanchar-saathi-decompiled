package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* renamed from: e  reason: collision with root package name */
    public WeakReference f4032e;

    public void onReceiveResult(int i4, Bundle bundle) {
        b.a(this.f4032e.get());
    }
}
