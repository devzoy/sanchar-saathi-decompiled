package androidx.work.impl.background.systemalarm;

import Q0.i;
import R0.E;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6151a = i.i("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        i e4 = i.e();
        String str = f6151a;
        e4.a(str, "Received intent " + intent);
        try {
            E.l(context).v(goAsync());
        } catch (IllegalStateException e5) {
            i.e().d(f6151a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e5);
        }
    }
}
