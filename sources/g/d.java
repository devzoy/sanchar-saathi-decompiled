package G;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

public abstract class d {

    public static class a {
        public static <T> T a(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        public static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        public static int c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        public static String d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    public static class b {
        public static int a(AppOpsManager appOpsManager, String str, int i4, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i4, str2);
        }

        public static String b(Context context) {
            return context.getOpPackageName();
        }

        public static AppOpsManager c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static int a(Context context, int i4, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return b(context, str, str2);
        }
        AppOpsManager c4 = b.c(context);
        int a4 = b.a(c4, str, Binder.getCallingUid(), str2);
        return a4 != 0 ? a4 : b.a(c4, str, i4, b.b(context));
    }

    public static int b(Context context, String str, String str2) {
        return a.c((AppOpsManager) a.a(context, AppOpsManager.class), str, str2);
    }

    public static String c(String str) {
        return a.d(str);
    }
}
