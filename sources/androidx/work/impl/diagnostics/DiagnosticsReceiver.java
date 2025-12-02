package androidx.work.impl.diagnostics;

import Q0.i;
import Q0.k;
import Q0.t;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6198a = i.i("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            i.e().a(f6198a, "Requesting diagnostics");
            try {
                t.d(context).a(k.e(DiagnosticsWorker.class));
            } catch (IllegalStateException e4) {
                i.e().d(f6198a, "WorkManager is not initialized", e4);
            }
        }
    }
}
