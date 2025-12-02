package w1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class E extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public Context f12526a;

    /* renamed from: b  reason: collision with root package name */
    public final C0967D f12527b;

    public E(C0967D d4) {
        this.f12527b = d4;
    }

    public final void a(Context context) {
        this.f12526a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f12526a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f12526a = null;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f12527b.a();
            b();
        }
    }
}
