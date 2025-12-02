package u1;

import D1.f;
import E1.d;
import G.p;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f12319a = g.f12322a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f12320b = new e();

    public static e e() {
        return f12320b;
    }

    public Intent a(Context context, int i4, String str) {
        if (i4 == 1 || i4 == 2) {
            if (context == null || !f.c(context)) {
                StringBuilder sb = new StringBuilder();
                sb.append("gcore_");
                sb.append(f12319a);
                sb.append("-");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                sb.append("-");
                if (context != null) {
                    sb.append(context.getPackageName());
                }
                sb.append("-");
                if (context != null) {
                    try {
                        sb.append(d.a(context).d(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb2 = sb.toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(sb2)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i4 != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    public PendingIntent b(Context context, int i4, int i5) {
        return c(context, i4, i5, (String) null);
    }

    public PendingIntent c(Context context, int i4, int i5, String str) {
        Intent a4 = a(context, i4, str);
        if (a4 == null) {
            return null;
        }
        return p.b(context, i5, a4, 134217728, false);
    }

    public String d(int i4) {
        return g.a(i4);
    }

    public int f(Context context) {
        return g(context, f12319a);
    }

    public int g(Context context, int i4) {
        int c4 = g.c(context, i4);
        if (g.d(context, c4)) {
            return 18;
        }
        return c4;
    }

    public boolean h(Context context, String str) {
        return g.g(context, str);
    }

    public boolean i(int i4) {
        return g.f(i4);
    }
}
