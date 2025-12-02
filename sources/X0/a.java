package X0;

import Q0.i;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import c1.C0403b;
import v3.l;

public final class a extends e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, C0403b bVar) {
        super(context, bVar);
        l.e(context, "context");
        l.e(bVar, "taskExecutor");
    }

    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    public void k(Intent intent) {
        l.e(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            i e4 = i.e();
            String a4 = b.f3440a;
            e4.a(a4, "Received " + action);
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        g(Boolean.FALSE);
                        return;
                    }
                    return;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        g(Boolean.FALSE);
                        return;
                    }
                    return;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        g(Boolean.TRUE);
                        return;
                    }
                    return;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        g(Boolean.TRUE);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: l */
    public Boolean e() {
        Intent registerReceiver = d().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(m(registerReceiver));
        }
        i.e().c(b.f3440a, "getInitialState - null intent received");
        return Boolean.FALSE;
    }

    public final boolean m(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }
}
