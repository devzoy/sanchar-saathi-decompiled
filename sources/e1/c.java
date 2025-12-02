package E1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f882a;

    public c(Context context) {
        this.f882a = context;
    }

    public int a(String str) {
        return this.f882a.checkCallingOrSelfPermission(str);
    }

    public ApplicationInfo b(String str, int i4) {
        return this.f882a.getPackageManager().getApplicationInfo(str, i4);
    }

    public CharSequence c(String str) {
        Context context = this.f882a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo d(String str, int i4) {
        return this.f882a.getPackageManager().getPackageInfo(str, i4);
    }
}
