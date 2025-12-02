package z1;

import E1.d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

public abstract class K {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f12876a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f12877b;

    /* renamed from: c  reason: collision with root package name */
    public static String f12878c;

    /* renamed from: d  reason: collision with root package name */
    public static int f12879d;

    public static int a(Context context) {
        b(context);
        return f12879d;
    }

    public static void b(Context context) {
        synchronized (f12876a) {
            try {
                if (!f12877b) {
                    f12877b = true;
                    Bundle bundle = d.a(context).b(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f12878c = bundle.getString("com.google.app.id");
                        f12879d = bundle.getInt("com.google.android.gms.version");
                    }
                }
            } catch (PackageManager.NameNotFoundException e4) {
                Log.wtf("MetadataValueReader", "This should never happen.", e4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
