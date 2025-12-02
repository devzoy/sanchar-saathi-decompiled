package X0;

import Q0.i;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import c1.C0403b;
import v3.l;

public abstract class e extends h {

    /* renamed from: f  reason: collision with root package name */
    public final BroadcastReceiver f3442f = new a(this);

    public static final class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f3443a;

        public a(e eVar) {
            this.f3443a = eVar;
        }

        public void onReceive(Context context, Intent intent) {
            l.e(context, "context");
            l.e(intent, "intent");
            this.f3443a.k(intent);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, C0403b bVar) {
        super(context, bVar);
        l.e(context, "context");
        l.e(bVar, "taskExecutor");
    }

    public void h() {
        i e4 = i.e();
        String a4 = f.f3444a;
        e4.a(a4, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f3442f, j());
    }

    public void i() {
        i e4 = i.e();
        String a4 = f.f3444a;
        e4.a(a4, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f3442f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}
