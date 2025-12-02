package H0;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import v3.x;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f1371a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final String f1372b = x.b(e.class).c();

    public final int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (c.f1363a.a() != j.LOG) {
                return 0;
            }
            Log.d(f1372b, "Embedding extension version not found");
            return 0;
        } catch (UnsupportedOperationException unused2) {
            if (c.f1363a.a() != j.LOG) {
                return 0;
            }
            Log.d(f1372b, "Stub Extension");
            return 0;
        }
    }
}
