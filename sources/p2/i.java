package p2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;
import q2.r;
import q2.s;

public final class i extends r {
    public i(Context context) {
        super(new s("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    public final void a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.f11906a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.f11906a.a("List of extras in received intent:", new Object[0]);
        for (String next : intent.getExtras().keySet()) {
            this.f11906a.a("Key: %s; value: %s", next, intent.getExtras().get(next));
        }
        InstallState f4 = InstallState.f(intent, this.f11906a);
        this.f11906a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", f4);
        d(f4);
    }
}
