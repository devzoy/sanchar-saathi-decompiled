package G2;

import T2.a;
import U2.c;
import Y2.i;
import Y2.j;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import net.sqlcipher.database.SQLiteDatabase;
import v3.l;

public final class a implements T2.a, j.c, U2.a {

    /* renamed from: c  reason: collision with root package name */
    public Activity f1268c;

    /* renamed from: d  reason: collision with root package name */
    public j f1269d;

    public final void a(i iVar, j.d dVar) {
        Boolean bool = (Boolean) iVar.a("asAnotherTask");
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        String str = (String) iVar.a("type");
        if (str != null) {
            switch (str.hashCode()) {
                case -2045253606:
                    if (str.equals("batteryOptimization")) {
                        f(dVar, booleanValue);
                        return;
                    }
                    break;
                case -1928150741:
                    if (str.equals("generalSettings")) {
                        i("android.settings.SETTINGS", dVar, booleanValue);
                        return;
                    }
                    break;
                case -1335157162:
                    if (str.equals("device")) {
                        i("android.settings.DEVICE_INFO_SETTINGS", dVar, booleanValue);
                        return;
                    }
                    break;
                case -1000044642:
                    if (str.equals("wireless")) {
                        i("android.settings.WIRELESS_SETTINGS", dVar, booleanValue);
                        return;
                    }
                    break;
                case -213139122:
                    if (str.equals("accessibility")) {
                        i("android.settings.ACCESSIBILITY_SETTINGS", dVar, booleanValue);
                        return;
                    }
                    break;
                case -114233073:
                    if (str.equals("dataRoaming")) {
                        i("android.settings.DATA_ROAMING_SETTINGS", dVar, booleanValue);
                        return;
                    }
                    break;
                case -80681014:
                    if (str.equals("developer")) {
                        i("android.settings.APPLICATION_DEVELOPMENT_SETTINGS", dVar, booleanValue);
                        return;
                    }
                    break;
                case 96799:
                    if (str.equals("apn")) {
                        i("android.settings.APN_SETTINGS", dVar, booleanValue);
                        return;
                    }
                    break;
                case 108971:
                    if (str.equals("nfc")) {
                        i("android.settings.NFC_SETTINGS", dVar, booleanValue);
                        return;
                    }
                    break;
                case 116980:
                    if (str.equals("vpn")) {
                        k(dVar, booleanValue);
                        return;
                    }
                    break;
                case 3076014:
                    if (str.equals("date")) {
                        i("android.settings.DATE_SETTINGS", dVar, booleanValue);
                        return;
                    }
                    break;
                case 3649301:
                    if (str.equals("wifi")) {
                        i("android.settings.WIFI_SETTINGS", dVar, booleanValue);
                        return;
                    }
                    break;
                case 92895825:
                    if (str.equals("alarm")) {
                        c(dVar, booleanValue);
                        return;
                    }
                    break;
                case 109627663:
                    if (str.equals("sound")) {
                        i("android.settings.SOUND_SETTINGS", dVar, booleanValue);
                        return;
                    }
                    break;
                case 595233003:
                    if (str.equals("notification")) {
                        h(dVar, booleanValue);
                        return;
                    }
                    break;
                case 949122880:
                    if (str.equals("security")) {
                        i("android.settings.SECURITY_SETTINGS", dVar, booleanValue);
                        return;
                    }
                    break;
                case 1039955198:
                    if (str.equals("internalStorage")) {
                        i("android.settings.INTERNAL_STORAGE_SETTINGS", dVar, booleanValue);
                        return;
                    }
                    break;
                case 1099603663:
                    if (str.equals("hotspot")) {
                        g(dVar, booleanValue);
                        return;
                    }
                    break;
                case 1214667623:
                    if (str.equals("lockAndPassword")) {
                        i("android.app.action.SET_NEW_PASSWORD", dVar, booleanValue);
                        return;
                    }
                    break;
                case 1294374875:
                    if (str.equals("appLocale")) {
                        d(dVar, booleanValue);
                        return;
                    }
                    break;
                case 1434631203:
                    if (str.equals("settings")) {
                        e(dVar, booleanValue);
                        return;
                    }
                    break;
                case 1671764162:
                    if (str.equals("display")) {
                        i("android.settings.DISPLAY_SETTINGS", dVar, booleanValue);
                        return;
                    }
                    break;
                case 1901043637:
                    if (str.equals("location")) {
                        i("android.settings.LOCATION_SOURCE_SETTINGS", dVar, booleanValue);
                        return;
                    }
                    break;
                case 1968882350:
                    if (str.equals("bluetooth")) {
                        i("android.settings.BLUETOOTH_SETTINGS", dVar, booleanValue);
                        return;
                    }
                    break;
            }
        }
        dVar.c();
    }

    public final void b(i iVar, j.d dVar) {
        if (Build.VERSION.SDK_INT < 29) {
            dVar.a((Object) null);
            return;
        }
        Activity activity = this.f1268c;
        if (activity != null) {
            String str = (String) iVar.a("type");
            if (str != null) {
                switch (str.hashCode()) {
                    case -810883302:
                        if (str.equals("volume")) {
                            activity.startActivity(new Intent("android.settings.panel.action.VOLUME"));
                            dVar.a((Object) null);
                            return;
                        }
                        break;
                    case 108971:
                        if (str.equals("nfc")) {
                            activity.startActivity(new Intent("android.settings.panel.action.NFC"));
                            dVar.a((Object) null);
                            return;
                        }
                        break;
                    case 3649301:
                        if (str.equals("wifi")) {
                            activity.startActivity(new Intent("android.settings.panel.action.WIFI"));
                            dVar.a((Object) null);
                            return;
                        }
                        break;
                    case 21015448:
                        if (str.equals("internetConnectivity")) {
                            activity.startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                            dVar.a((Object) null);
                            return;
                        }
                        break;
                }
            }
            dVar.c();
            return;
        }
        dVar.a((Object) null);
    }

    public final void c(j.d dVar, boolean z4) {
        if (Build.VERSION.SDK_INT >= 31) {
            Activity activity = this.f1268c;
            Uri fromParts = activity != null ? Uri.fromParts("package", activity.getPackageName(), (String) null) : null;
            if (fromParts == null) {
                dVar.a((Object) null);
            } else {
                j(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", fromParts), dVar, z4);
            }
        } else {
            e(dVar, z4);
        }
    }

    public final void d(j.d dVar, boolean z4) {
        if (Build.VERSION.SDK_INT < 33) {
            dVar.a((Object) null);
            return;
        }
        Intent intent = new Intent("android.settings.APP_LOCALE_SETTINGS");
        if (z4) {
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        }
        Activity activity = this.f1268c;
        if (activity != null) {
            intent.setData(Uri.fromParts("package", activity.getPackageName(), (String) null));
            activity.startActivity(intent);
        }
        dVar.a((Object) null);
    }

    public final void e(j.d dVar, boolean z4) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        if (z4) {
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        }
        Activity activity = this.f1268c;
        if (activity != null) {
            intent.setData(Uri.fromParts("package", activity.getPackageName(), (String) null));
            activity.startActivity(intent);
        }
        dVar.a((Object) null);
    }

    public final void f(j.d dVar, boolean z4) {
        i("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS", dVar, z4);
    }

    public final void g(j.d dVar, boolean z4) {
        Intent className = new Intent().setClassName("com.android.settings", "com.android.settings.TetherSettings");
        l.d(className, "setClassName(...)");
        j(className, dVar, z4);
    }

    public final void h(j.d dVar, boolean z4) {
        Activity activity = this.f1268c;
        if (activity != null) {
            Intent putExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
            l.d(putExtra, "putExtra(...)");
            if (z4) {
                putExtra.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            }
            activity.startActivity(putExtra);
        }
        dVar.a((Object) null);
    }

    public final void i(String str, j.d dVar, boolean z4) {
        try {
            Intent intent = new Intent(str);
            if (z4) {
                intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            }
            Activity activity = this.f1268c;
            if (activity != null) {
                activity.startActivity(intent);
            }
            dVar.a((Object) null);
        } catch (Exception unused) {
            e(dVar, z4);
        }
    }

    public final void j(Intent intent, j.d dVar, boolean z4) {
        if (z4) {
            try {
                intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            } catch (Exception unused) {
                e(dVar, z4);
                return;
            }
        }
        Activity activity = this.f1268c;
        if (activity != null) {
            activity.startActivity(intent);
        }
        dVar.a((Object) null);
    }

    public final void k(j.d dVar, boolean z4) {
        i("android.settings.VPN_SETTINGS", dVar, z4);
    }

    public void onAttachedToActivity(c cVar) {
        l.e(cVar, "binding");
        this.f1268c = cVar.e();
    }

    public void onAttachedToEngine(a.b bVar) {
        l.e(bVar, "flutterPluginBinding");
        j jVar = new j(bVar.b(), "com.spencerccf.app_settings/methods");
        this.f1269d = jVar;
        jVar.e(this);
    }

    public void onDetachedFromActivity() {
        this.f1268c = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f1268c = null;
    }

    public void onDetachedFromEngine(a.b bVar) {
        l.e(bVar, "binding");
        j jVar = this.f1269d;
        if (jVar == null) {
            l.n("channel");
            jVar = null;
        }
        jVar.e((j.c) null);
    }

    public void onMethodCall(i iVar, j.d dVar) {
        l.e(iVar, "call");
        l.e(dVar, "result");
        String str = iVar.f3766a;
        if (l.a(str, "openSettings")) {
            a(iVar, dVar);
        } else if (l.a(str, "openSettingsPanel")) {
            b(iVar, dVar);
        } else {
            dVar.c();
        }
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        l.e(cVar, "binding");
        this.f1268c = cVar.e();
    }
}
