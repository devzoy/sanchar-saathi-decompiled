package m1;

import android.content.Context;
import android.content.SharedPreferences;
import io.flutter.view.FlutterCallbackInformation;

/* renamed from: m1.a  reason: case insensitive filesystem */
public class C0790a {

    /* renamed from: a  reason: collision with root package name */
    public final String f11139a = "com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY";

    /* renamed from: b  reason: collision with root package name */
    public final String f11140b = "com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY";

    /* renamed from: c  reason: collision with root package name */
    public final Context f11141c;

    public C0790a(Context context) {
        this.f11141c = context;
    }

    public final SharedPreferences a() {
        return this.f11141c.getSharedPreferences("flutter_local_notifications_plugin", 0);
    }

    public Long b() {
        return Long.valueOf(a().getLong("com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY", -1));
    }

    public Long c() {
        return Long.valueOf(a().getLong("com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY", -1));
    }

    public FlutterCallbackInformation d() {
        return FlutterCallbackInformation.lookupCallbackInformation(b().longValue());
    }

    public void e(Long l4, Long l5) {
        a().edit().putLong("com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY", l4.longValue()).apply();
        a().edit().putLong("com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY", l5.longValue()).apply();
    }
}
