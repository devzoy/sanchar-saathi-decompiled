package dev.fluttercommunity.plus.share;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import v3.g;
import v3.l;

public final class SharePlusPendingIntent extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8700a = new a((g) null);

    /* renamed from: b  reason: collision with root package name */
    public static String f8701b = "";

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a() {
            return SharePlusPendingIntent.f8701b;
        }

        public final void b(String str) {
            l.e(str, "<set-?>");
            SharePlusPendingIntent.f8701b = str;
        }

        public a() {
        }
    }

    public void onReceive(Context context, Intent intent) {
        l.e(context, "context");
        l.e(intent, "intent");
        ComponentName componentName = Build.VERSION.SDK_INT >= 33 ? (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT", ComponentName.class) : (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        if (componentName != null) {
            f8701b = componentName.flattenToString();
        }
    }
}
