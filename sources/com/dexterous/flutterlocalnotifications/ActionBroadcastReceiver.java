package com.dexterous.flutterlocalnotifications;

import G.m;
import P2.a;
import R2.d;
import Y2.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import io.flutter.view.FlutterCallbackInformation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m1.C0790a;

public class ActionBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static b f6589b;

    /* renamed from: c  reason: collision with root package name */
    public static io.flutter.embedding.engine.a f6590c;

    /* renamed from: a  reason: collision with root package name */
    public C0790a f6591a;

    public static class b implements c.d {

        /* renamed from: c  reason: collision with root package name */
        public final List f6592c;

        /* renamed from: d  reason: collision with root package name */
        public c.b f6593d;

        public b() {
            this.f6592c = new ArrayList();
        }

        public void a(Object obj, c.b bVar) {
            for (Map a4 : this.f6592c) {
                bVar.a(a4);
            }
            this.f6592c.clear();
            this.f6593d = bVar;
        }

        public void b(Object obj) {
            this.f6593d = null;
        }

        public void c(Map map) {
            c.b bVar = this.f6593d;
            if (bVar != null) {
                bVar.a(map);
            } else {
                this.f6592c.add(map);
            }
        }
    }

    public final void a(P2.a aVar) {
        new c(aVar.l(), "dexterous.com/flutter/local_notifications/actions").d(f6589b);
    }

    public final void b(Context context) {
        if (f6590c != null) {
            Log.e("ActionBroadcastReceiver", "Engine is already initialised");
            return;
        }
        d c4 = M2.a.e().c();
        c4.m(context);
        c4.f(context, (String[]) null);
        f6590c = new io.flutter.embedding.engine.a(context);
        FlutterCallbackInformation d4 = this.f6591a.d();
        if (d4 == null) {
            Log.w("ActionBroadcastReceiver", "Callback information could not be retrieved");
            return;
        }
        P2.a k4 = f6590c.k();
        a(k4);
        k4.i(new a.b(context.getAssets(), c4.g(), d4));
    }

    public void onReceive(Context context, Intent intent) {
        if ("com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED".equalsIgnoreCase(intent.getAction())) {
            C0790a aVar = this.f6591a;
            if (aVar == null) {
                aVar = new C0790a(context);
            }
            this.f6591a = aVar;
            Map<String, Object> extractNotificationResponseMap = FlutterLocalNotificationsPlugin.extractNotificationResponseMap(intent);
            if (intent.getBooleanExtra("cancelNotification", false)) {
                int intValue = ((Integer) extractNotificationResponseMap.get("notificationId")).intValue();
                Object obj = extractNotificationResponseMap.get("notificationTag");
                if (obj instanceof String) {
                    m.e(context).c((String) obj, intValue);
                } else {
                    m.e(context).b(intValue);
                }
            }
            if (f6589b == null) {
                f6589b = new b();
            }
            f6589b.c(extractNotificationResponseMap);
            b(context);
        }
    }
}
