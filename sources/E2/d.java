package E2;

import T2.a;
import Y2.c;
import Y2.i;
import Y2.j;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0380g;
import androidx.lifecycle.C0384k;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.ArrayList;
import java.util.HashMap;

public class d implements j.c, T2.a, U2.a {

    /* renamed from: k  reason: collision with root package name */
    public static String f911k = null;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f912l = false;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f913m = false;

    /* renamed from: n  reason: collision with root package name */
    public static int f914n;

    /* renamed from: o  reason: collision with root package name */
    public static boolean f915o;

    /* renamed from: c  reason: collision with root package name */
    public U2.c f916c;

    /* renamed from: d  reason: collision with root package name */
    public c f917d;

    /* renamed from: e  reason: collision with root package name */
    public Application f918e;

    /* renamed from: f  reason: collision with root package name */
    public a.b f919f;

    /* renamed from: g  reason: collision with root package name */
    public C0380g f920g;

    /* renamed from: h  reason: collision with root package name */
    public b f921h;

    /* renamed from: i  reason: collision with root package name */
    public Activity f922i;

    /* renamed from: j  reason: collision with root package name */
    public j f923j;

    public class a implements c.d {
        public a() {
        }

        public void a(Object obj, c.b bVar) {
            d.this.f917d.q(bVar);
        }

        public void b(Object obj) {
            d.this.f917d.q((c.b) null);
        }
    }

    public class b implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

        /* renamed from: c  reason: collision with root package name */
        public final Activity f925c;

        public b(Activity activity) {
            this.f925c = activity;
        }

        public void a(C0384k kVar) {
        }

        public void b(C0384k kVar) {
            onActivityDestroyed(this.f925c);
        }

        public void c(C0384k kVar) {
        }

        public void e(C0384k kVar) {
        }

        public void f(C0384k kVar) {
        }

        public void g(C0384k kVar) {
            onActivityStopped(this.f925c);
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f925c == activity && activity.getApplicationContext() != null) {
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

    public static class c implements j.d {

        /* renamed from: a  reason: collision with root package name */
        public final j.d f927a;

        /* renamed from: b  reason: collision with root package name */
        public final Handler f928b = new Handler(Looper.getMainLooper());

        public class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ Object f929e;

            public a(Object obj) {
                this.f929e = obj;
            }

            public void run() {
                c.this.f927a.a(this.f929e);
            }
        }

        public class b implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ String f931e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ String f932f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ Object f933g;

            public b(String str, String str2, Object obj) {
                this.f931e = str;
                this.f932f = str2;
                this.f933g = obj;
            }

            public void run() {
                c.this.f927a.b(this.f931e, this.f932f, this.f933g);
            }
        }

        /* renamed from: E2.d$c$c  reason: collision with other inner class name */
        public class C0010c implements Runnable {
            public C0010c() {
            }

            public void run() {
                c.this.f927a.c();
            }
        }

        public c(j.d dVar) {
            this.f927a = dVar;
        }

        public void a(Object obj) {
            this.f928b.post(new a(obj));
        }

        public void b(String str, String str2, Object obj) {
            this.f928b.post(new b(str, str2, obj));
        }

        public void c() {
            this.f928b.post(new C0010c());
        }
    }

    public static String b(String str) {
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1349088399:
                if (str.equals("custom")) {
                    c4 = 0;
                    break;
                }
                break;
            case 96748:
                if (str.equals("any")) {
                    c4 = 1;
                    break;
                }
                break;
            case 99469:
                if (str.equals("dir")) {
                    c4 = 2;
                    break;
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    c4 = 3;
                    break;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    c4 = 4;
                    break;
                }
                break;
            case 103772132:
                if (str.equals("media")) {
                    c4 = 5;
                    break;
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    c4 = 6;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
            case 1:
                return "*/*";
            case 2:
                return "dir";
            case 3:
                return "audio/*";
            case 4:
                return "image/*";
            case 5:
                return "image/*,video/*";
            case 6:
                return "video/*";
            default:
                return null;
        }
    }

    private void d() {
        this.f916c.f(this.f917d);
        this.f916c = null;
        b bVar = this.f921h;
        if (bVar != null) {
            this.f920g.c(bVar);
            this.f918e.unregisterActivityLifecycleCallbacks(this.f921h);
        }
        this.f920g = null;
        this.f917d.q((c.b) null);
        this.f917d = null;
        this.f923j.e((j.c) null);
        this.f923j = null;
        this.f918e = null;
    }

    public final void c(Y2.b bVar, Application application, Activity activity, U2.c cVar) {
        this.f922i = activity;
        this.f918e = application;
        this.f917d = new c(activity);
        j jVar = new j(bVar, "miguelruivo.flutter.plugins.filepicker");
        this.f923j = jVar;
        jVar.e(this);
        new Y2.c(bVar, "miguelruivo.flutter.plugins.filepickerevent").d(new a());
        this.f921h = new b(activity);
        cVar.a(this.f917d);
        C0380g a4 = V2.a.a(cVar);
        this.f920g = a4;
        a4.a(this.f921h);
    }

    public void onAttachedToActivity(U2.c cVar) {
        this.f916c = cVar;
        c(this.f919f.b(), (Application) this.f919f.a(), this.f916c.e(), this.f916c);
    }

    public void onAttachedToEngine(a.b bVar) {
        this.f919f = bVar;
    }

    public void onDetachedFromActivity() {
        d();
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f919f = null;
    }

    public void onMethodCall(i iVar, j.d dVar) {
        String[] strArr;
        String str;
        if (this.f922i == null) {
            dVar.b("no_activity", "file picker plugin requires a foreground activity", (Object) null);
            return;
        }
        c cVar = new c(dVar);
        HashMap hashMap = (HashMap) iVar.f3767b;
        String str2 = iVar.f3766a;
        if (str2 == null || !str2.equals("clear")) {
            String str3 = iVar.f3766a;
            if (str3 == null || !str3.equals("save")) {
                String b4 = b(iVar.f3766a);
                f911k = b4;
                if (b4 == null) {
                    cVar.c();
                } else if (b4 != "dir") {
                    f912l = ((Boolean) hashMap.get("allowMultipleSelection")).booleanValue();
                    f913m = ((Boolean) hashMap.get("withData")).booleanValue();
                    f915o = ((Boolean) hashMap.get("allowCompression")).booleanValue();
                    f914n = ((Integer) hashMap.get("compressionQuality")).intValue();
                    strArr = e.h((ArrayList) hashMap.get("allowedExtensions"));
                    str = iVar.f3766a;
                    if (str == null && !str.equals("custom") && (strArr == null || strArr.length == 0)) {
                        cVar.b("FilePicker", "Unsupported filter. Make sure that you are only using the extension without the dot, (ie., jpg instead of .jpg). This could also have happened because you are using an unsupported file extension.  If the problem persists, you may want to consider using FileType.any instead.", (Object) null);
                        return;
                    } else {
                        this.f917d.t(f911k, f912l, f913m, strArr, f915o, f914n, cVar);
                        return;
                    }
                }
                strArr = null;
                str = iVar.f3766a;
                if (str == null && !str.equals("custom")) {
                }
                this.f917d.t(f911k, f912l, f913m, strArr, f915o, f914n, cVar);
                return;
            }
            this.f917d.p((String) hashMap.get("fileName"), b((String) hashMap.get("fileType")), (String) hashMap.get("initialDirectory"), e.h((ArrayList) hashMap.get("allowedExtensions")), (byte[]) hashMap.get("bytes"), cVar);
            return;
        }
        cVar.a(Boolean.valueOf(e.a(this.f922i.getApplicationContext())));
    }

    public void onReattachedToActivityForConfigChanges(U2.c cVar) {
        onAttachedToActivity(cVar);
    }
}
