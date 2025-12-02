package io.flutter.plugins;

import E2.d;
import H2.l;
import K2.f;
import L2.e;
import M2.b;
import c3.C0405a;
import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin;
import d3.C0583i;
import e3.I;
import f3.C0630i;
import i1.m;
import io.flutter.embedding.engine.a;
import j1.C0758c;

public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(a aVar) {
        try {
            aVar.r().a(new G2.a());
        } catch (Exception e4) {
            b.c(TAG, "Error registering plugin app_settings, com.spencerccf.app_settings.AppSettingsPlugin", e4);
        }
        try {
            aVar.r().a(new f());
        } catch (Exception e5) {
            b.c(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e5);
        }
        try {
            aVar.r().a(new d());
        } catch (Exception e6) {
            b.c(TAG, "Error registering plugin file_picker, com.mr.flutter.plugin.filepicker.FilePickerPlugin", e6);
        }
        try {
            aVar.r().a(new FlutterLocalNotificationsPlugin());
        } catch (Exception e7) {
            b.c(TAG, "Error registering plugin flutter_local_notifications, com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin", e7);
        }
        try {
            aVar.r().a(new N3.a());
        } catch (Exception e8) {
            b.c(TAG, "Error registering plugin flutter_native_splash, net.jonhanson.flutter_native_splash.FlutterNativeSplashPlugin", e8);
        }
        try {
            aVar.r().a(new C0405a());
        } catch (Exception e9) {
            b.c(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e9);
        }
        try {
            aVar.r().a(new I2.a());
        } catch (Exception e10) {
            b.c(TAG, "Error registering plugin flutter_udid, de.gigadroid.flutter_udid.FlutterUdidPlugin", e10);
        }
        try {
            aVar.r().a(new J2.d());
        } catch (Exception e11) {
            b.c(TAG, "Error registering plugin in_app_review, dev.britannio.in_app_review.InAppReviewPlugin", e11);
        }
        try {
            aVar.r().a(new l());
        } catch (Exception e12) {
            b.c(TAG, "Error registering plugin in_app_update, de.ffuf.in_app_update.InAppUpdatePlugin", e12);
        }
        try {
            aVar.r().a(new C0583i());
        } catch (Exception e13) {
            b.c(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e13);
        }
        try {
            aVar.r().a(new m());
        } catch (Exception e14) {
            b.c(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e14);
        }
        try {
            aVar.r().a(new F2.a());
        } catch (Exception e15) {
            b.c(TAG, "Error registering plugin screen_protector, com.prongbang.screen_protector.ScreenProtectorPlugin", e15);
        }
        try {
            aVar.r().a(new e());
        } catch (Exception e16) {
            b.c(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e16);
        }
        try {
            aVar.r().a(new I());
        } catch (Exception e17) {
            b.c(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e17);
        }
        try {
            aVar.r().a(new com.amolg.flutterbarcodescanner.b());
        } catch (Exception e18) {
            b.c(TAG, "Error registering plugin simple_barcode_scanner, com.amolg.flutterbarcodescanner.FlutterBarcodeScannerPlugin", e18);
        }
        try {
            aVar.r().a(new C0758c());
        } catch (Exception e19) {
            b.c(TAG, "Error registering plugin sqflite_sqlcipher, com.davidmartos96.sqflite_sqlcipher.SqfliteSqlCipherPlugin", e19);
        }
        try {
            aVar.r().a(new C0630i());
        } catch (Exception e20) {
            b.c(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e20);
        }
    }
}
