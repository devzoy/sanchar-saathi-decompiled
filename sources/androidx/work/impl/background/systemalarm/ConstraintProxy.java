package androidx.work.impl.background.systemalarm;

import Q0.b;
import Q0.i;
import Q0.j;
import Z0.u;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;

public abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6145a = i.i("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static void a(Context context, List list) {
        Iterator it = list.iterator();
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (it.hasNext()) {
            b bVar = ((u) it.next()).f3843j;
            z4 |= bVar.f();
            z5 |= bVar.g();
            z6 |= bVar.i();
            z7 |= bVar.d() != j.NOT_REQUIRED;
            if (z4 && z5 && z6 && z7) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, z4, z5, z6, z7));
    }

    public void onReceive(Context context, Intent intent) {
        i e4 = i.e();
        String str = f6145a;
        e4.a(str, "onReceive : " + intent);
        context.startService(a.a(context));
    }
}
