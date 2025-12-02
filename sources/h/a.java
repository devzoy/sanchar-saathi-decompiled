package H;

import G.m;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import java.io.File;
import java.util.concurrent.Executor;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f1348a = new Object();

    /* renamed from: H.a$a  reason: collision with other inner class name */
    public static class C0019a {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i4) {
            return context.getDrawable(i4);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    public static class b {
        public static int a(Context context, int i4) {
            return context.getColor(i4);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    public static class c {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i4) {
            if ((i4 & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, a.h(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i4 & 1);
        }

        public static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    public static class d {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static class e {
        public static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String b(Context context) {
            return context.getAttributionTag();
        }

        public static Display c(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Log.w("ContextCompat", "The context:" + context + " is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    public static class f {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i4) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i4);
        }
    }

    public static int a(Context context, String str) {
        R.c.d(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : m.e(context).a() ? 0 : -1;
    }

    public static String b(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return e.b(context);
        }
        return null;
    }

    public static int c(Context context, int i4) {
        return b.a(context, i4);
    }

    public static Drawable d(Context context, int i4) {
        return C0019a.b(context, i4);
    }

    public static File[] e(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] f(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor g(Context context) {
        return d.a(context);
    }

    public static String h(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (e.c(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent i(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i4) {
        return j(context, broadcastReceiver, intentFilter, (String) null, (Handler) null, i4);
    }

    public static Intent j(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i4) {
        int i5 = i4 & 1;
        if (i5 == 0 || (i4 & 4) == 0) {
            if (i5 != 0) {
                i4 |= 2;
            }
            int i6 = i4;
            int i7 = i6 & 2;
            if (i7 == 0 && (i6 & 4) == 0) {
                throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            } else if (i7 == 0 || (i6 & 4) == 0) {
                return Build.VERSION.SDK_INT >= 33 ? f.a(context, broadcastReceiver, intentFilter, str, handler, i6) : c.a(context, broadcastReceiver, intentFilter, str, handler, i6);
            } else {
                throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            }
        } else {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
    }

    public static boolean k(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    public static void l(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void m(Context context, Intent intent) {
        c.b(context, intent);
    }
}
