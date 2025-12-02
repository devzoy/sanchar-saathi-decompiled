package androidx.work.impl.background.systemalarm;

import Q0.i;
import R0.E;
import a1.p;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6146a = i.i("ConstrntProxyUpdtRecvr");

    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Intent f6147e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Context f6148f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f6149g;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f6147e = intent;
            this.f6148f = context;
            this.f6149g = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f6147e.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f6147e.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f6147e.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f6147e.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                i.e().a(ConstraintProxyUpdateReceiver.f6146a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                p.a(this.f6148f, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                p.a(this.f6148f, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                p.a(this.f6148f, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                p.a(this.f6148f, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f6149g.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z5).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z6).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z7);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            i e4 = i.e();
            String str = f6146a;
            e4.a(str, "Ignoring unknown action " + action);
            return;
        }
        E.l(context).r().c(new a(intent, context, goAsync()));
    }
}
