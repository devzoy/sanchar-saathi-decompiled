package a1;

import Q0.i;
import android.content.ComponentName;
import android.content.Context;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3967a = i.i("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z4) {
        String str = "disabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z4 ? 1 : 2, 1);
            i e4 = i.e();
            String str2 = f3967a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z4 ? "enabled" : str);
            e4.a(str2, sb.toString());
        } catch (Exception e5) {
            i e6 = i.e();
            String str3 = f3967a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            if (z4) {
                str = "enabled";
            }
            sb2.append(str);
            e6.b(str3, sb2.toString(), e5);
        }
    }
}
