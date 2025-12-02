package X0;

import Q0.i;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import c1.C0403b;
import v3.l;

public final class c extends e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, C0403b bVar) {
        super(context, bVar);
        l.e(context, "context");
        l.e(bVar, "taskExecutor");
    }

    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    public void k(Intent intent) {
        l.e(intent, "intent");
        if (intent.getAction() != null) {
            i e4 = i.e();
            String a4 = d.f3441a;
            e4.a(a4, "Received " + intent.getAction());
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1980154005) {
                    if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                        g(Boolean.FALSE);
                    }
                } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    g(Boolean.TRUE);
                }
            }
        }
    }

    /* renamed from: l */
    public Boolean e() {
        Intent registerReceiver = d().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            i.e().c(d.f3441a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        boolean z4 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
