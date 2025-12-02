package G;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

public abstract class a extends H.a {

    /* renamed from: G.a$a  reason: collision with other inner class name */
    public static class C0013a {
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i4) {
            activity.requestPermissions(strArr, i4);
        }

        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public static class b {
        public static boolean a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        public static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", new Class[]{String.class}).invoke(activity.getApplication().getPackageManager(), new Object[]{str})).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    public static class c {
        public static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface d {
        void a(int i4);
    }

    public static void n(Activity activity) {
        activity.finishAffinity();
    }

    public static void o(Activity activity) {
        activity.recreate();
    }

    public static void p(Activity activity, String[] strArr, int i4) {
        HashSet hashSet = new HashSet();
        int i5 = 0;
        while (i5 < strArr.length) {
            if (!TextUtils.isEmpty(strArr[i5])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i5], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i5));
                }
                i5++;
            } else {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[(strArr.length - size)] : strArr;
        if (size > 0) {
            if (size != strArr.length) {
                int i6 = 0;
                for (int i7 = 0; i7 < strArr.length; i7++) {
                    if (!hashSet.contains(Integer.valueOf(i7))) {
                        strArr2[i6] = strArr[i7];
                        i6++;
                    }
                }
            } else {
                return;
            }
        }
        if (activity instanceof d) {
            ((d) activity).a(i4);
        }
        C0013a.b(activity, strArr, i4);
    }

    public static boolean q(Activity activity, String str) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i4 >= 32 ? c.a(activity, str) : i4 == 31 ? b.b(activity, str) : C0013a.c(activity, str);
        }
        return false;
    }

    public static void r(Activity activity, Intent intent, int i4, Bundle bundle) {
        activity.startActivityForResult(intent, i4, bundle);
    }

    public static void s(Activity activity, IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
    }
}
