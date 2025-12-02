package R2;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import g3.C0638b;
import g3.C0641e;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2602a;

    /* renamed from: b  reason: collision with root package name */
    public c f2603b;

    /* renamed from: c  reason: collision with root package name */
    public long f2604c;

    /* renamed from: d  reason: collision with root package name */
    public b f2605d;

    /* renamed from: e  reason: collision with root package name */
    public FlutterJNI f2606e;

    /* renamed from: f  reason: collision with root package name */
    public ExecutorService f2607f;

    /* renamed from: g  reason: collision with root package name */
    public Future f2608g;

    public class a implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f2609a;

        public a(Context context) {
            this.f2609a = context;
        }

        /* renamed from: b */
        public b call() {
            String str;
            C0641e g4 = C0641e.g("FlutterLoader initTask");
            try {
                e unused = d.this.j(this.f2609a);
                d.this.f2606e.loadLibrary(this.f2609a);
                d.this.f2606e.updateRefreshRate();
                d.this.f2607f.execute(new c(this));
                b bVar = new b(C0638b.d(this.f2609a), C0638b.a(this.f2609a), C0638b.c(this.f2609a), (a) null);
                if (g4 != null) {
                    g4.close();
                }
                return bVar;
            } catch (UnsatisfiedLinkError e4) {
                if (!e4.toString().contains("couldn't find \"libflutter.so\"")) {
                    if (!e4.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                        throw e4;
                    }
                }
                String property = System.getProperty("os.arch");
                File file = new File(d.this.f2605d.f2599f);
                String[] list = file.list();
                StringBuilder sb = new StringBuilder();
                sb.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                sb.append(property);
                sb.append(", and the native libraries directory (with path ");
                sb.append(file.getAbsolutePath());
                sb.append(") ");
                if (file.exists()) {
                    str = "contains the following files: " + Arrays.toString(list);
                } else {
                    str = "does not exist.";
                }
                sb.append(str);
                throw new UnsupportedOperationException(sb.toString(), e4);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public final /* synthetic */ void c() {
            d.this.f2606e.prefetchDefaultFontManager();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f2611a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2612b;

        /* renamed from: c  reason: collision with root package name */
        public final String f2613c;

        public /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }

        public b(String str, String str2, String str3) {
            this.f2611a = str;
            this.f2612b = str2;
            this.f2613c = str3;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f2614a;

        public String a() {
            return this.f2614a;
        }
    }

    public d() {
        this(M2.a.e().d().a());
    }

    public static boolean l(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    public boolean e() {
        return this.f2605d.f2600g;
    }

    public void f(Context context, String[] strArr) {
        C0641e g4;
        Throwable th;
        String[] strArr2 = strArr;
        if (!this.f2602a) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
            } else if (this.f2603b != null) {
                try {
                    g4 = C0641e.g("FlutterLoader#ensureInitializationComplete");
                    b bVar = (b) this.f2608g.get();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                    StringBuilder sb = new StringBuilder();
                    sb.append("--icu-native-lib-path=");
                    sb.append(this.f2605d.f2599f);
                    String str = File.separator;
                    sb.append(str);
                    sb.append("libflutter.so");
                    arrayList.add(sb.toString());
                    if (strArr2 != null) {
                        Collections.addAll(arrayList, strArr2);
                    }
                    arrayList.add("--aot-shared-library-name=" + this.f2605d.f2594a);
                    arrayList.add("--aot-shared-library-name=" + this.f2605d.f2599f + str + this.f2605d.f2594a);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("--cache-dir-path=");
                    sb2.append(bVar.f2612b);
                    arrayList.add(sb2.toString());
                    if (this.f2605d.f2598e != null) {
                        arrayList.add("--domain-network-policy=" + this.f2605d.f2598e);
                    }
                    if (this.f2603b.a() != null) {
                        arrayList.add("--log-tag=" + this.f2603b.a());
                    }
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    int i4 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                    if (i4 == 0) {
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                        i4 = (int) ((((double) memoryInfo.totalMem) / 1000000.0d) / 2.0d);
                    } else {
                        Context context2 = context;
                    }
                    arrayList.add("--old-gen-heap-size=" + i4);
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                    arrayList.add("--prefetched-default-font-manager");
                    if (bundle != null) {
                        if (bundle.containsKey("io.flutter.embedding.android.EnableImpeller")) {
                            if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller")) {
                                arrayList.add("--enable-impeller=true");
                            } else {
                                arrayList.add("--enable-impeller=false");
                            }
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                            arrayList.add("--enable-vulkan-validation");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                            arrayList.add("--enable-opengl-gpu-tracing");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                            arrayList.add("--enable-vulkan-gpu-tracing");
                        }
                        if (bundle.containsKey("io.flutter.embedding.android.DisableMergedPlatformUIThread") && bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread")) {
                            arrayList.add("--no-enable-merged-platform-ui-thread");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                            arrayList.add("--enable-surface-control");
                        }
                        String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                        if (string != null) {
                            arrayList.add("--impeller-backend=" + string);
                        }
                    }
                    String str2 = l(bundle) ? "true" : "false";
                    arrayList.add("--leak-vm=" + str2);
                    this.f2606e.init(context, (String[]) arrayList.toArray(new String[0]), (String) null, bVar.f2611a, bVar.f2612b, SystemClock.uptimeMillis() - this.f2604c);
                    this.f2602a = true;
                    if (g4 != null) {
                        g4.close();
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    M2.b.c("FlutterLoader", "Flutter initialization failed.", e4);
                    throw new RuntimeException(e4);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
            }
        } else {
            return;
        }
        throw th;
    }

    public String g() {
        return this.f2605d.f2597d;
    }

    public final String h(String str) {
        return this.f2605d.f2597d + File.separator + str;
    }

    public String i(String str) {
        return h(str);
    }

    public final e j(Context context) {
        return null;
    }

    public boolean k() {
        return this.f2602a;
    }

    public void m(Context context) {
        n(context, new c());
    }

    public void n(Context context, c cVar) {
        if (this.f2603b == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C0641e g4 = C0641e.g("FlutterLoader#startInitialization");
                try {
                    Context applicationContext = context.getApplicationContext();
                    this.f2603b = cVar;
                    this.f2604c = SystemClock.uptimeMillis();
                    this.f2605d = a.e(applicationContext);
                    e.f((DisplayManager) applicationContext.getSystemService("display"), this.f2606e).g();
                    this.f2608g = this.f2607f.submit(new a(applicationContext));
                    if (g4 != null) {
                        g4.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("startInitialization must be called on the main thread");
            }
        } else {
            return;
        }
        throw th;
    }

    public d(FlutterJNI flutterJNI) {
        this(flutterJNI, M2.a.e().b());
    }

    public d(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f2602a = false;
        this.f2606e = flutterJNI;
        this.f2607f = executorService;
    }
}
