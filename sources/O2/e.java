package O2;

import android.content.Intent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public Set f2073a;

    public e(List list) {
        this.f2073a = new HashSet(list);
    }

    public static e a(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (intent.getBooleanExtra("trace-startup", false)) {
            arrayList.add("--trace-startup");
        }
        if (intent.getBooleanExtra("start-paused", false)) {
            arrayList.add("--start-paused");
        }
        int intExtra = intent.getIntExtra("vm-service-port", 0);
        if (intExtra > 0) {
            arrayList.add("--vm-service-port=" + Integer.toString(intExtra));
        } else {
            int intExtra2 = intent.getIntExtra("observatory-port", 0);
            if (intExtra2 > 0) {
                arrayList.add("--vm-service-port=" + Integer.toString(intExtra2));
            }
        }
        if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
            arrayList.add("--disable-service-auth-codes");
        }
        if (intent.getBooleanExtra("endless-trace-buffer", false)) {
            arrayList.add("--endless-trace-buffer");
        }
        if (intent.getBooleanExtra("use-test-fonts", false)) {
            arrayList.add("--use-test-fonts");
        }
        if (intent.getBooleanExtra("enable-dart-profiling", false)) {
            arrayList.add("--enable-dart-profiling");
        }
        if (intent.getBooleanExtra("enable-software-rendering", false)) {
            arrayList.add("--enable-software-rendering");
        }
        if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
            arrayList.add("--skia-deterministic-rendering");
        }
        if (intent.getBooleanExtra("trace-skia", false)) {
            arrayList.add("--trace-skia");
        }
        String stringExtra = intent.getStringExtra("trace-skia-allowlist");
        if (stringExtra != null) {
            arrayList.add("--trace-skia-allowlist=" + stringExtra);
        }
        if (intent.getBooleanExtra("trace-systrace", false)) {
            arrayList.add("--trace-systrace");
        }
        if (intent.hasExtra("trace-to-file")) {
            arrayList.add("--trace-to-file=" + intent.getStringExtra("trace-to-file"));
        }
        if (intent.hasExtra("enable-impeller")) {
            if (intent.getBooleanExtra("enable-impeller", false)) {
                arrayList.add("--enable-impeller=true");
            } else {
                arrayList.add("--enable-impeller=false");
            }
        }
        if (intent.getBooleanExtra("enable-vulkan-validation", false)) {
            arrayList.add("--enable-vulkan-validation");
        }
        if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
            arrayList.add("--dump-skp-on-shader-compilation");
        }
        if (intent.getBooleanExtra("cache-sksl", false)) {
            arrayList.add("--cache-sksl");
        }
        if (intent.getBooleanExtra("purge-persistent-cache", false)) {
            arrayList.add("--purge-persistent-cache");
        }
        if (intent.getBooleanExtra("verbose-logging", false)) {
            arrayList.add("--verbose-logging");
        }
        if (intent.hasExtra("dart-flags")) {
            arrayList.add("--dart-flags=" + intent.getStringExtra("dart-flags"));
        }
        return new e(arrayList);
    }

    public String[] b() {
        return (String[]) this.f2073a.toArray(new String[this.f2073a.size()]);
    }
}
