package com.amolg.flutterbarcodescanner;

import N2.C0293g;
import T2.a;
import Y2.c;
import Y2.j;
import Y2.l;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.C0380g;
import androidx.lifecycle.C0384k;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.amolg.flutterbarcodescanner.BarcodeCaptureActivity;
import h1.C0653a;
import java.util.Map;

public class b implements j.c, l, c.d, T2.a, U2.a {

    /* renamed from: k  reason: collision with root package name */
    public static C0293g f6547k = null;

    /* renamed from: l  reason: collision with root package name */
    public static j.d f6548l = null;

    /* renamed from: m  reason: collision with root package name */
    public static final String f6549m = "b";

    /* renamed from: n  reason: collision with root package name */
    public static String f6550n = "";

    /* renamed from: o  reason: collision with root package name */
    public static boolean f6551o = false;

    /* renamed from: p  reason: collision with root package name */
    public static boolean f6552p = false;

    /* renamed from: q  reason: collision with root package name */
    public static String f6553q = "";

    /* renamed from: r  reason: collision with root package name */
    public static int f6554r;

    /* renamed from: s  reason: collision with root package name */
    public static c.b f6555s;

    /* renamed from: c  reason: collision with root package name */
    public Map f6556c;

    /* renamed from: d  reason: collision with root package name */
    public c f6557d;

    /* renamed from: e  reason: collision with root package name */
    public j f6558e;

    /* renamed from: f  reason: collision with root package name */
    public a.b f6559f;

    /* renamed from: g  reason: collision with root package name */
    public U2.c f6560g;

    /* renamed from: h  reason: collision with root package name */
    public Application f6561h;

    /* renamed from: i  reason: collision with root package name */
    public C0380g f6562i;

    /* renamed from: j  reason: collision with root package name */
    public C0125b f6563j;

    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ T1.a f6564e;

        public a(T1.a aVar) {
            this.f6564e = aVar;
        }

        public void run() {
            b.f6555s.a(this.f6564e.f2856f);
        }
    }

    /* renamed from: com.amolg.flutterbarcodescanner.b$b  reason: collision with other inner class name */
    public class C0125b implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

        /* renamed from: c  reason: collision with root package name */
        public final Activity f6565c;

        public C0125b(Activity activity) {
            this.f6565c = activity;
        }

        public void a(C0384k kVar) {
        }

        public void b(C0384k kVar) {
            onActivityDestroyed(this.f6565c);
        }

        public void c(C0384k kVar) {
        }

        public void e(C0384k kVar) {
        }

        public void f(C0384k kVar) {
        }

        public void g(C0384k kVar) {
            onActivityStopped(this.f6565c);
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f6565c == activity && activity.getApplicationContext() != null) {
                ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
            }
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public static void e(T1.a aVar) {
        if (aVar != null) {
            try {
                if (!aVar.f2857g.isEmpty()) {
                    f6547k.runOnUiThread(new a(aVar));
                }
            } catch (Exception e4) {
                String str = f6549m;
                Log.e(str, "onBarcodeScanReceiver: " + e4.getLocalizedMessage());
            }
        }
    }

    public void a(Object obj, c.b bVar) {
        try {
            f6555s = bVar;
        } catch (Exception unused) {
        }
    }

    public void b(Object obj) {
        try {
            f6555s = null;
        } catch (Exception unused) {
        }
    }

    public final void c() {
        f6547k = null;
        this.f6560g.f(this);
        this.f6560g = null;
        this.f6562i.c(this.f6563j);
        this.f6562i = null;
        this.f6558e.e((j.c) null);
        this.f6557d.d((c.d) null);
        this.f6558e = null;
        this.f6561h.unregisterActivityLifecycleCallbacks(this.f6563j);
        this.f6561h = null;
    }

    public final void d(Y2.b bVar, Application application, Activity activity, U2.c cVar) {
        f6547k = (C0293g) activity;
        c cVar2 = new c(bVar, "flutter_barcode_scanner_receiver");
        this.f6557d = cVar2;
        cVar2.d(this);
        this.f6561h = application;
        j jVar = new j(bVar, "flutter_barcode_scanner");
        this.f6558e = jVar;
        jVar.e(this);
        cVar.a(this);
        this.f6562i = V2.a.a(cVar);
        C0125b bVar2 = new C0125b(activity);
        this.f6563j = bVar2;
        this.f6562i.a(bVar2);
    }

    public final void f() {
        BarcodeCaptureActivity.d dVar = BarcodeCaptureActivity.d.ALL_FORMATS;
        if (this.f6556c.get("scanFormat") != null) {
            String upperCase = ((String) this.f6556c.get("scanFormat")).toUpperCase();
            upperCase.hashCode();
            if (upperCase.equals("ONLY_QR_CODE")) {
                dVar = BarcodeCaptureActivity.d.ONLY_QR_CODE;
            } else if (upperCase.equals("ONLY_BARCODE")) {
                dVar = BarcodeCaptureActivity.d.ONLY_BARCODE;
            }
        }
        BarcodeCaptureActivity.f6511M = dVar;
    }

    public final void g(String str, boolean z4, String str2) {
        try {
            Intent putExtra = new Intent(f6547k, BarcodeCaptureActivity.class).putExtra("cancelButtonText", str).putExtra("delayMillis", f6554r).putExtra("cameraFacingText", str2);
            if (z4) {
                f6547k.startActivity(putExtra);
            } else {
                f6547k.startActivityForResult(putExtra, 9001);
            }
        } catch (Exception e4) {
            String str3 = f6549m;
            Log.e(str3, "startView: " + e4.getLocalizedMessage());
        }
    }

    public boolean onActivityResult(int i4, int i5, Intent intent) {
        if (i4 != 9001) {
            return false;
        }
        if (i5 == 0) {
            if (intent != null) {
                try {
                    f6548l.a(((T1.a) intent.getParcelableExtra("Barcode")).f2856f);
                } catch (Exception unused) {
                    f6548l.a("-1");
                }
            } else {
                f6548l.a("-1");
            }
            f6548l = null;
            this.f6556c = null;
            return true;
        }
        f6548l.a("-1");
        return false;
    }

    public void onAttachedToActivity(U2.c cVar) {
        this.f6560g = cVar;
        d(this.f6559f.b(), (Application) this.f6559f.a(), this.f6560g.e(), this.f6560g);
    }

    public void onAttachedToEngine(a.b bVar) {
        this.f6559f = bVar;
        bVar.c().a("plugins.codingwithtashi/barcode_scanner_view", new C0653a(bVar.b()));
    }

    public void onDetachedFromActivity() {
        c();
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f6559f = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050 A[Catch:{ Exception -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c A[Catch:{ Exception -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ab A[Catch:{ Exception -> 0x0041 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(Y2.i r4, Y2.j.d r5) {
        /*
            r3 = this;
            java.lang.String r0 = "delayMillis"
            java.lang.String r1 = "scanMode"
            f6548l = r5     // Catch:{ Exception -> 0x0041 }
            java.lang.String r5 = r4.f3766a     // Catch:{ Exception -> 0x0041 }
            java.lang.String r2 = "scanBarcode"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x0041 }
            if (r5 == 0) goto L_0x00fe
            java.lang.Object r5 = r4.f3767b     // Catch:{ Exception -> 0x0041 }
            boolean r2 = r5 instanceof java.util.Map     // Catch:{ Exception -> 0x0041 }
            if (r2 == 0) goto L_0x00cb
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ Exception -> 0x0041 }
            r3.f6556c = r5     // Catch:{ Exception -> 0x0041 }
            java.lang.String r4 = "lineColor"
            java.lang.Object r4 = r5.get(r4)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0041 }
            f6550n = r4     // Catch:{ Exception -> 0x0041 }
            java.util.Map r4 = r3.f6556c     // Catch:{ Exception -> 0x0041 }
            java.lang.String r5 = "isShowFlashIcon"
            java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x0041 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x0041 }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x0041 }
            f6551o = r4     // Catch:{ Exception -> 0x0041 }
            java.lang.String r4 = f6550n     // Catch:{ Exception -> 0x0041 }
            if (r4 == 0) goto L_0x0044
            java.lang.String r5 = ""
            boolean r4 = r4.equalsIgnoreCase(r5)     // Catch:{ Exception -> 0x0041 }
            if (r4 == 0) goto L_0x0048
            goto L_0x0044
        L_0x0041:
            r4 = move-exception
            goto L_0x00e4
        L_0x0044:
            java.lang.String r4 = "#DC143C"
            f6550n = r4     // Catch:{ Exception -> 0x0041 }
        L_0x0048:
            java.util.Map r4 = r3.f6556c     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ Exception -> 0x0041 }
            if (r4 == 0) goto L_0x007c
            java.util.Map r4 = r3.f6556c     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ Exception -> 0x0041 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0041 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0041 }
            com.amolg.flutterbarcodescanner.BarcodeCaptureActivity$e r5 = com.amolg.flutterbarcodescanner.BarcodeCaptureActivity.e.DEFAULT     // Catch:{ Exception -> 0x0041 }
            int r5 = r5.ordinal()     // Catch:{ Exception -> 0x0041 }
            if (r4 != r5) goto L_0x006d
            com.amolg.flutterbarcodescanner.BarcodeCaptureActivity$e r4 = com.amolg.flutterbarcodescanner.BarcodeCaptureActivity.e.QR     // Catch:{ Exception -> 0x0041 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0041 }
            com.amolg.flutterbarcodescanner.BarcodeCaptureActivity.f6512N = r4     // Catch:{ Exception -> 0x0041 }
            goto L_0x0084
        L_0x006d:
            java.util.Map r4 = r3.f6556c     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ Exception -> 0x0041 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0041 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0041 }
            com.amolg.flutterbarcodescanner.BarcodeCaptureActivity.f6512N = r4     // Catch:{ Exception -> 0x0041 }
            goto L_0x0084
        L_0x007c:
            com.amolg.flutterbarcodescanner.BarcodeCaptureActivity$e r4 = com.amolg.flutterbarcodescanner.BarcodeCaptureActivity.e.QR     // Catch:{ Exception -> 0x0041 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0041 }
            com.amolg.flutterbarcodescanner.BarcodeCaptureActivity.f6512N = r4     // Catch:{ Exception -> 0x0041 }
        L_0x0084:
            r3.f()     // Catch:{ Exception -> 0x0041 }
            java.util.Map r4 = r3.f6556c     // Catch:{ Exception -> 0x0041 }
            java.lang.String r5 = "isContinuousScan"
            java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x0041 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x0041 }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x0041 }
            f6552p = r4     // Catch:{ Exception -> 0x0041 }
            java.util.Map r4 = r3.f6556c     // Catch:{ Exception -> 0x0041 }
            java.lang.String r5 = "cameraFacingText"
            java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0041 }
            f6553q = r4     // Catch:{ Exception -> 0x0041 }
            java.util.Map r4 = r3.f6556c     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ Exception -> 0x0041 }
            if (r4 == 0) goto L_0x00b9
            java.util.Map r4 = r3.f6556c     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ Exception -> 0x0041 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0041 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0041 }
            f6554r = r4     // Catch:{ Exception -> 0x0041 }
        L_0x00b9:
            java.util.Map r4 = r3.f6556c     // Catch:{ Exception -> 0x0041 }
            java.lang.String r5 = "cancelButtonText"
            java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0041 }
            boolean r5 = f6552p     // Catch:{ Exception -> 0x0041 }
            java.lang.String r0 = f6553q     // Catch:{ Exception -> 0x0041 }
            r3.g(r4, r5, r0)     // Catch:{ Exception -> 0x0041 }
            goto L_0x00fe
        L_0x00cb:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0041 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0041 }
            r0.<init>()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r1 = "Plugin not passing a map as parameter: "
            r0.append(r1)     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r4 = r4.f3767b     // Catch:{ Exception -> 0x0041 }
            r0.append(r4)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r4 = r0.toString()     // Catch:{ Exception -> 0x0041 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0041 }
            throw r5     // Catch:{ Exception -> 0x0041 }
        L_0x00e4:
            java.lang.String r5 = f6549m
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onMethodCall: "
            r0.append(r1)
            java.lang.String r4 = r4.getLocalizedMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            android.util.Log.e(r5, r4)
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amolg.flutterbarcodescanner.b.onMethodCall(Y2.i, Y2.j$d):void");
    }

    public void onReattachedToActivityForConfigChanges(U2.c cVar) {
        onAttachedToActivity(cVar);
    }
}
