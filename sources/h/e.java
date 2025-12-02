package H;

import G.d;
import R.c;
import android.content.Context;
import android.os.Binder;
import android.os.Process;

public abstract class e {
    public static int a(Context context, String str) {
        return b(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int b(Context context, String str, int i4, int i5, String str2) {
        if (context.checkPermission(str, i4, i5) == -1) {
            return -1;
        }
        String c4 = d.c(str);
        if (c4 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i5);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i5 || !c.a(context.getPackageName(), str2)) ? d.b(context, c4, str2) : d.a(context, i5, c4, str2)) == 0 ? 0 : -2;
    }

    public static int c(Context context, String str) {
        return b(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
