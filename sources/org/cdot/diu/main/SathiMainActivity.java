package org.cdot.diu.main;

import N2.C0293g;
import Q3.c;
import Y2.i;
import Y2.j;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.media.MediaDrm;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.util.Base64;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;

public class SathiMainActivity extends C0293g implements j.c {

    /* renamed from: A  reason: collision with root package name */
    public final String f11337A = "clins.calllog";

    /* renamed from: B  reason: collision with root package name */
    public final String f11338B = "clins.chakshusmspermission";

    /* renamed from: C  reason: collision with root package name */
    public final String f11339C = "clins.chakshusmspermissionstatus";

    /* renamed from: D  reason: collision with root package name */
    public final String f11340D = "clins.chakshucallpermission";

    /* renamed from: E  reason: collision with root package name */
    public final String f11341E = "clins.chakshucallpermissionstatus";

    /* renamed from: F  reason: collision with root package name */
    public final String f11342F = "clins.androidsdkversion";

    /* renamed from: G  reason: collision with root package name */
    public final String f11343G = "clins.kym_permission";

    /* renamed from: H  reason: collision with root package name */
    public final String f11344H = "clins.registration_permission";

    /* renamed from: I  reason: collision with root package name */
    public final String f11345I = "clins.registration_page_permission";

    /* renamed from: J  reason: collision with root package name */
    public final String f11346J = "clins.registration_page_permission_status";

    /* renamed from: K  reason: collision with root package name */
    public final String f11347K = "clins.kym_permission_status";

    /* renamed from: L  reason: collision with root package name */
    public final String f11348L = "shareApp";

    /* renamed from: M  reason: collision with root package name */
    public BroadcastReceiver f11349M = null;

    /* renamed from: N  reason: collision with root package name */
    public BroadcastReceiver f11350N = null;

    /* renamed from: O  reason: collision with root package name */
    public boolean f11351O = false;

    /* renamed from: P  reason: collision with root package name */
    public boolean f11352P = false;

    /* renamed from: Q  reason: collision with root package name */
    public BroadcastReceiver f11353Q = null;

    /* renamed from: h  reason: collision with root package name */
    public j.d f11354h;

    /* renamed from: i  reason: collision with root package name */
    public final String f11355i = "org.cdot.diu.event";

    /* renamed from: j  reason: collision with root package name */
    public j f11356j;

    /* renamed from: k  reason: collision with root package name */
    public final String f11357k = "clins.sathismschannel";

    /* renamed from: l  reason: collision with root package name */
    public final String f11358l = "clins.sendsms";

    /* renamed from: m  reason: collision with root package name */
    public final String f11359m = "clins.smssent";

    /* renamed from: n  reason: collision with root package name */
    public final String f11360n = "clins.smsdeliver";

    /* renamed from: o  reason: collision with root package name */
    public final String f11361o = "clins.uniqueid";

    /* renamed from: p  reason: collision with root package name */
    public final String f11362p = "clins.permission";

    /* renamed from: q  reason: collision with root package name */
    public final String f11363q = "clins.permissionstatus";

    /* renamed from: r  reason: collision with root package name */
    public final String f11364r = "clins.getsentstatus";

    /* renamed from: s  reason: collision with root package name */
    public final String f11365s = "clins.getdeliverystatus";

    /* renamed from: t  reason: collision with root package name */
    public final String f11366t = "clins.rooteddevice";

    /* renamed from: u  reason: collision with root package name */
    public final String f11367u = "clins.simcardavailability";

    /* renamed from: v  reason: collision with root package name */
    public final String f11368v = "SMS_SENT";

    /* renamed from: w  reason: collision with root package name */
    public final String f11369w = "SMS_DELIVERED";

    /* renamed from: x  reason: collision with root package name */
    public final String f11370x = "clins.subscriptioninfo";

    /* renamed from: y  reason: collision with root package name */
    public final String f11371y = "clins.phoneaccountinfo";

    /* renamed from: z  reason: collision with root package name */
    public final String f11372z = "clins.smslog";

    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            int resultCode = getResultCode();
            String Z3 = SathiMainActivity.this.j0(resultCode);
            Log.i("[onCreate] [onReceive]", "status code sent " + getResultCode() + " detail : " + Z3);
            HashMap hashMap = new HashMap();
            hashMap.put("code", Integer.valueOf(resultCode));
            hashMap.put("result", Z3);
            SathiMainActivity.this.f11356j.c("clins.smssent", hashMap);
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        public void onReceive(Context context, Intent intent) {
            int resultCode = getResultCode();
            String Z3 = SathiMainActivity.this.j0(resultCode);
            Log.i("[onCreate] [onReceive]", "status code sent " + getResultCode() + " detail : " + Z3);
            HashMap hashMap = new HashMap();
            hashMap.put("code", Integer.valueOf(resultCode));
            hashMap.put("result", Z3);
            SathiMainActivity.this.f11356j.c("clins.smsdeliver", hashMap);
        }
    }

    public void G(io.flutter.embedding.engine.a aVar) {
        super.G(aVar);
        j jVar = new j(aVar.k().l(), "clins.sathismschannel");
        this.f11356j = jVar;
        jVar.e(this);
    }

    public final boolean a0() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    public final boolean b0() {
        String[] strArr = {"ro.debuggable=1", "ro.secure=0"};
        for (int i4 = 0; i4 < 2; i4++) {
            String[] split = strArr[i4].split("=");
            if (split[1].equals(k0(split[0]))) {
                return true;
            }
        }
        return false;
    }

    public final boolean c0() {
        String[] strArr = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};
        for (int i4 = 0; i4 < 7; i4++) {
            if (new File(strArr[i4]).canWrite()) {
                return true;
            }
        }
        return false;
    }

    public final boolean d0() {
        List<String> asList = Arrays.asList(new String[]{"com.noshufou.android.su", "com.koushikdutta.superuser", "eu.chainfire.supersu", "com.zachspong.temprootremovejb", "com.ramdroid.appquarantine", "com.topjohnwu.magisk"});
        PackageManager packageManager = getApplicationContext().getPackageManager();
        for (String packageInfo : asList) {
            try {
                packageManager.getPackageInfo(packageInfo, 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public final boolean e0() {
        String[] strArr = {"/system/xbin/su", "/system/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/xbin/su", "/data/local/bin/su", "/su/bin/su"};
        for (int i4 = 0; i4 < 7; i4++) {
            if (new File(strArr[i4]).exists()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f0() {
        String[] strArr = {"/system/app/Superuser.apk", "/system/app/SuperSU.apk", "/system/app/MagiskManager.apk"};
        for (int i4 = 0; i4 < 3; i4++) {
            if (new File(strArr[i4]).exists()) {
                return true;
            }
        }
        return false;
    }

    public final Map g0(j.d dVar) {
        HashMap hashMap = new HashMap();
        if (H.a.a(this, "android.permission.READ_CALL_LOG") == 0) {
            hashMap.put("READ_CALL_LOG", "granted");
        } else if (G.a.q(this, "android.permission.READ_CALL_LOG")) {
            hashMap.put("READ_CALL_LOG", "denied");
        } else {
            hashMap.put("READ_CALL_LOG", "permanentlyDenied");
        }
        if (H.a.a(this, "android.permission.READ_PHONE_STATE") == 0) {
            hashMap.put("READ_PHONE_STATE", "granted");
        } else if (G.a.q(this, "android.permission.READ_PHONE_STATE")) {
            hashMap.put("READ_PHONE_STATE", "denied");
        } else {
            hashMap.put("READ_PHONE_STATE", "permanentlyDenied");
        }
        PrintStream printStream = System.out;
        printStream.println("Permission status in getChakshuSmsPermissionStatuses() is : " + hashMap);
        dVar.a(hashMap);
        return hashMap;
    }

    public final Map h0(j.d dVar) {
        HashMap hashMap = new HashMap();
        if (H.a.a(this, "android.permission.READ_SMS") == 0) {
            hashMap.put("READ_SMS", "granted");
        } else if (G.a.q(this, "android.permission.READ_SMS")) {
            hashMap.put("READ_SMS", "denied");
        } else {
            hashMap.put("READ_SMS", "permanentlyDenied");
        }
        if (H.a.a(this, "android.permission.READ_PHONE_STATE") == 0) {
            hashMap.put("READ_PHONE_STATE", "granted");
        } else if (G.a.q(this, "android.permission.READ_PHONE_STATE")) {
            hashMap.put("READ_PHONE_STATE", "denied");
        } else {
            hashMap.put("READ_PHONE_STATE", "permanentlyDenied");
        }
        PrintStream printStream = System.out;
        printStream.println("Permission status in getChakshuSmsPermissionStatuses() is : " + hashMap);
        dVar.a(hashMap);
        return hashMap;
    }

    public final Map i0(j.d dVar, String... strArr) {
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            if (H.a.a(this, str) == 0) {
                hashMap.put(str, "granted");
            } else if (G.a.q(this, str)) {
                hashMap.put(str, "denied");
            } else {
                hashMap.put(str, "permanentlyDenied");
            }
        }
        dVar.a(hashMap);
        return hashMap;
    }

    public final String j0(int i4) {
        return i4 != -1 ? i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "UNKNOWN" : "NO_SERVICE" : "NULL_PDU" : "RADIO_OFF" : "GENERIC_FAILURE" : "RESULT_CANCELED" : "SUCCESS";
    }

    public final String k0(String str) {
        String str2 = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            Process exec = runtime.exec("getprop " + str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            str2 = bufferedReader.readLine();
            bufferedReader.close();
            exec.destroy();
            return str2;
        } catch (Exception unused) {
            return str2;
        }
    }

    public final String l0() {
        try {
            return Base64.encodeToString(new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L)).getPropertyByteArray("deviceUniqueId"), 2);
        } catch (Exception unused) {
            return "";
        }
    }

    public final boolean m0() {
        return a0() || f0() || e0() || b0() || c0() || d0();
    }

    public final String n0(Context context) {
        HashMap hashMap = new HashMap();
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
        if (subscriptionManager != null) {
            List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
            if (activeSubscriptionInfoList == null || activeSubscriptionInfoList.isEmpty()) {
                System.out.println("SimCardUtil : No SIM cards available");
            } else {
                for (SubscriptionInfo next : activeSubscriptionInfoList) {
                    int simSlotIndex = next.getSimSlotIndex();
                    String charSequence = next.getCarrierName().toString();
                    next.getSubscriptionId();
                    hashMap.put(String.valueOf(simSlotIndex), charSequence);
                }
            }
        }
        return hashMap.toString();
    }

    public final void o0(j.d dVar) {
        HashMap hashMap = new HashMap();
        if (H.a.a(this, "android.permission.READ_CALL_LOG") == 0 && H.a.a(this, "android.permission.READ_PHONE_STATE") == 0) {
            hashMap.put("READ_CALL_LOG", "granted");
            hashMap.put("READ_PHONE_STATE", "granted");
            dVar.a(hashMap);
            return;
        }
        this.f11354h = dVar;
        G.a.p(this, new String[]{"android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE"}, 4);
        hashMap.put("READ_CALL_LOG", "requested");
        hashMap.put("READ_PHONE_STATE", "requested");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11349M = new a();
        this.f11350N = new b();
        Log.i("[onCreate]", "registering sms receivers");
        registerReceiver(this.f11349M, new IntentFilter("SMS_SENT"));
        this.f11351O = true;
        registerReceiver(this.f11350N, new IntentFilter("SMS_DELIVERED"));
        this.f11352P = true;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f11351O) {
            unregisterReceiver(this.f11349M);
            this.f11351O = false;
        }
        if (this.f11352P) {
            unregisterReceiver(this.f11350N);
            this.f11352P = false;
        }
        Log.i("[onDestroy]", " destroy activity");
    }

    public void onMethodCall(i iVar, j.d dVar) {
        String str = iVar.f3766a;
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1921444766:
                if (str.equals("clins.registration_page_permission")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1676195403:
                if (str.equals("clins.chakshucallpermission")) {
                    c4 = 1;
                    break;
                }
                break;
            case -1501108360:
                if (str.equals("clins.kym_permission")) {
                    c4 = 2;
                    break;
                }
                break;
            case -1481736588:
                if (str.equals("clins.smslog")) {
                    c4 = 3;
                    break;
                }
                break;
            case -950911513:
                if (str.equals("clins.chakshucallpermissionstatus")) {
                    c4 = 4;
                    break;
                }
                break;
            case -913307380:
                if (str.equals("clins.registration_permission")) {
                    c4 = 5;
                    break;
                }
                break;
            case -852455751:
                if (str.equals("clins.simcardavailability")) {
                    c4 = 6;
                    break;
                }
                break;
            case -799447441:
                if (str.equals("clins.registration_page_permission_status")) {
                    c4 = 7;
                    break;
                }
                break;
            case -743788094:
                if (str.equals("shareApp")) {
                    c4 = 8;
                    break;
                }
                break;
            case -386753468:
                if (str.equals("clins.androidsdkversion")) {
                    c4 = 9;
                    break;
                }
                break;
            case -354367971:
                if (str.equals("clins.calllog")) {
                    c4 = 10;
                    break;
                }
                break;
            case -324208896:
                if (str.equals("clins.rooteddevice")) {
                    c4 = 11;
                    break;
                }
                break;
            case -254156182:
                if (str.equals("clins.permissionstatus")) {
                    c4 = 12;
                    break;
                }
                break;
            case -43352096:
                if (str.equals("clins.chakshusmspermission")) {
                    c4 = 13;
                    break;
                }
                break;
            case 294709202:
                if (str.equals("clins.chakshusmspermissionstatus")) {
                    c4 = 14;
                    break;
                }
                break;
            case 1076921032:
                if (str.equals("clins.sendsms")) {
                    c4 = 15;
                    break;
                }
                break;
            case 1544545814:
                if (str.equals("clins.phoneaccountinfo")) {
                    c4 = 16;
                    break;
                }
                break;
            case 1677856409:
                if (str.equals("clins.kym_permission_status")) {
                    c4 = 17;
                    break;
                }
                break;
            case 1680870196:
                if (str.equals("clins.subscriptioninfo")) {
                    c4 = 18;
                    break;
                }
                break;
            case 1776944533:
                if (str.equals("clins.uniqueid")) {
                    c4 = 19;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                q0(dVar, 2, "android.permission.READ_PHONE_STATE");
                return;
            case 1:
                o0(dVar);
                return;
            case 2:
                q0(dVar, 5, "android.permission.CAMERA");
                return;
            case 3:
                try {
                    dVar.a(new c().a(getApplicationContext(), ((Integer) iVar.a("subscriptionId")).intValue(), ((Integer) iVar.a("smsCount")).intValue()));
                    return;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    dVar.b("ERROR_CODE", "An error occurred: " + e4.getMessage(), (Object) null);
                    return;
                }
            case 4:
                g0(dVar);
                return;
            case 5:
                q0(dVar, 1, "android.permission.SEND_SMS", "android.permission.READ_PHONE_STATE");
                return;
            case 6:
                try {
                    dVar.a(n0(getApplicationContext()));
                    return;
                } catch (Exception e5) {
                    dVar.b("ERROR_CODE", "An error occurred: " + e5.getMessage(), (Object) null);
                    return;
                }
            case 7:
                i0(dVar, "android.permission.READ_PHONE_STATE");
                return;
            case 8:
                s0();
                return;
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION:
                dVar.a(Integer.valueOf(Build.VERSION.SDK_INT));
                return;
            case IBulkCursor.GET_EXTRAS_TRANSACTION:
                try {
                    dVar.a(new Q3.b().a(getApplicationContext(), (String) iVar.a("phoneAccountId"), ((Integer) iVar.a("callCount")).intValue()));
                    return;
                } catch (Exception e6) {
                    e6.printStackTrace();
                    dVar.b("ERROR_CODE", "An error occurred: " + e6.getMessage(), (Object) null);
                    return;
                }
            case IBulkCursor.RESPOND_TRANSACTION:
                dVar.a(Boolean.valueOf(m0()));
                return;
            case IBulkCursor.CLOSE_TRANSACTION:
                i0(dVar, "android.permission.SEND_SMS", "android.permission.READ_PHONE_STATE");
                return;
            case 13:
                p0(dVar);
                return;
            case 14:
                h0(dVar);
                return;
            case 15:
                String str2 = (String) iVar.a("sms_num");
                String str3 = (String) iVar.a("sms_content");
                Log.i("[SATHI]", "smsNum : " + str2 + ", smsContent : " + str3);
                dVar.a(r0(str2, str3, getApplicationContext()));
                return;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS:
                try {
                    dVar.a(new Q3.b().c(getApplicationContext()));
                    return;
                } catch (Exception e7) {
                    dVar.b("ERROR_CODE", "An error occurred: " + e7.getMessage(), (Object) null);
                    return;
                }
            case 17:
                i0(dVar, "android.permission.CAMERA");
                return;
            case 18:
                try {
                    dVar.a(new c().b(getApplicationContext()));
                    return;
                } catch (Exception e8) {
                    dVar.b("ERROR_CODE", "An error occurred: " + e8.getMessage(), (Object) null);
                    return;
                }
            case 19:
                dVar.a(l0());
                return;
            default:
                dVar.c();
                return;
        }
    }

    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        if (this.f11354h != null) {
            HashMap hashMap = new HashMap();
            for (int i5 = 0; i5 < strArr.length; i5++) {
                String str = strArr[i5];
                if (iArr[i5] == 0) {
                    hashMap.put(str, "granted");
                } else if (G.a.q(this, str)) {
                    hashMap.put(str, "denied");
                } else {
                    hashMap.put(str, "permanentlyDenied");
                }
            }
            this.f11354h.a(hashMap);
            this.f11354h = null;
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }

    public final void p0(j.d dVar) {
        HashMap hashMap = new HashMap();
        if (H.a.a(this, "android.permission.READ_SMS") == 0 && H.a.a(this, "android.permission.READ_PHONE_STATE") == 0) {
            hashMap.put("READ_SMS", "granted");
            hashMap.put("READ_PHONE_STATE", "granted");
            dVar.a(hashMap);
            return;
        }
        this.f11354h = dVar;
        G.a.p(this, new String[]{"android.permission.READ_SMS", "android.permission.READ_PHONE_STATE"}, 3);
        hashMap.put("READ_SMS", "requested");
        hashMap.put("READ_PHONE_STATE", "requested");
    }

    public final void q0(j.d dVar, int i4, String... strArr) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (H.a.a(this, str) != 0) {
                arrayList.add(str);
                hashMap.put(str, "requested");
            } else {
                hashMap.put(str, "granted");
            }
        }
        if (!arrayList.isEmpty()) {
            this.f11354h = dVar;
            G.a.p(this, (String[]) arrayList.toArray(new String[0]), i4);
            return;
        }
        dVar.a(hashMap);
    }

    public final String r0(String str, String str2, Context context) {
        String str3;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent("SMS_SENT"), 67108864);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, new Intent("SMS_DELIVERED"), 67108864);
        try {
            SubscriptionManager from = SubscriptionManager.from(context);
            if (H.a.a(this, "android.permission.READ_PHONE_STATE") != 0) {
                str3 = "Permission to read SIM information is not granted.";
            } else {
                List<SubscriptionInfo> activeSubscriptionInfoList = from.getActiveSubscriptionInfoList();
                if (activeSubscriptionInfoList.size() == 0) {
                    str3 = "Please insert a SIM card to continue.";
                } else {
                    String str4 = "";
                    for (SubscriptionInfo next : activeSubscriptionInfoList) {
                        int simSlotIndex = next.getSimSlotIndex();
                        System.out.println("simSlotIndex :" + simSlotIndex);
                        SmsManager.getSmsManagerForSubscriptionId(next.getSubscriptionId()).sendTextMessage(str, (String) null, str2 + "." + simSlotIndex, broadcast, broadcast2);
                        str4 = (simSlotIndex + 1) + ",";
                    }
                    str3 = "Active mobile number detected in Device : " + str4.substring(0, str4.length() - 1);
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            str3 = "Your Device is not able to send SMS to 14422.";
        }
        System.out.print("smsSent : " + str3);
        return str3;
    }

    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return (Build.VERSION.SDK_INT < 34 || getApplicationInfo().targetSdkVersion < 34) ? super.registerReceiver(broadcastReceiver, intentFilter) : super.registerReceiver(broadcastReceiver, intentFilter, 2);
    }

    public final void s0() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", "Download Sanchar Saathi App-\n\nAndroid: https://play.google.com/store/apps/details?id=com.dot.app.sancharsaathi&pcampaignid=web_share\n\niOS: https://apps.apple.com/in/app/sanchar-saathi/id6739700695\n");
        intent.setType("text/plain");
        startActivity(intent);
    }
}
