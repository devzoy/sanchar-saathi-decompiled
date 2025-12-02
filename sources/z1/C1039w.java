package z1;

import D1.f;
import E1.d;
import O.b;
import Q0.i;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;
import s1.C0922b;
import v.g;

/* renamed from: z1.w  reason: case insensitive filesystem */
public abstract class C1039w {

    /* renamed from: a  reason: collision with root package name */
    public static final g f13025a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static Locale f13026b;

    public static String a(Context context, int i4) {
        Resources resources = context.getResources();
        switch (i4) {
            case 1:
                return resources.getString(C0922b.f12013f);
            case 2:
                return resources.getString(C0922b.f12019l);
            case 3:
                return resources.getString(C0922b.f12010c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case IBulkCursor.GET_EXTRAS_TRANSACTION:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case IBulkCursor.RESPOND_TRANSACTION:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case i.f2380c:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 22);
                sb.append("Unexpected error code ");
                sb.append(i4);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
        }
    }

    public static String b(Context context, int i4) {
        String h4 = i4 == 6 ? h(context, "common_google_play_services_resolution_required_title") : a(context, i4);
        return h4 == null ? context.getResources().getString(C0922b.f12015h) : h4;
    }

    public static String c(Context context, int i4) {
        Resources resources = context.getResources();
        String f4 = f(context);
        if (i4 == 1) {
            return resources.getString(C0922b.f12012e, new Object[]{f4});
        }
        if (i4 == 2) {
            return f.c(context) ? resources.getString(C0922b.f12021n) : resources.getString(C0922b.f12018k, new Object[]{f4});
        }
        if (i4 == 3) {
            return resources.getString(C0922b.f12009b, new Object[]{f4});
        }
        if (i4 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", f4);
        }
        if (i4 == 7) {
            return g(context, "common_google_play_services_network_error_text", f4);
        }
        if (i4 == 9) {
            return resources.getString(C0922b.f12016i, new Object[]{f4});
        }
        if (i4 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", f4);
        }
        switch (i4) {
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS:
                return g(context, "common_google_play_services_api_unavailable_text", f4);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", f4);
            case 18:
                return resources.getString(C0922b.f12020m, new Object[]{f4});
            default:
                return resources.getString(u1.i.f12327a, new Object[]{f4});
        }
    }

    public static String d(Context context, int i4) {
        return (i4 == 6 || i4 == 19) ? g(context, "common_google_play_services_resolution_required_text", f(context)) : c(context, i4);
    }

    public static String e(Context context, int i4) {
        Resources resources = context.getResources();
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? resources.getString(17039370) : resources.getString(C0922b.f12008a) : resources.getString(C0922b.f12017j) : resources.getString(C0922b.f12011d);
    }

    public static String f(Context context) {
        String packageName = context.getPackageName();
        try {
            return d.a(context).c(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h4 = h(context, str);
        if (h4 == null) {
            h4 = resources.getString(u1.i.f12327a);
        }
        return String.format(resources.getConfiguration().locale, h4, new Object[]{str2});
    }

    public static String h(Context context, String str) {
        g gVar = f13025a;
        synchronized (gVar) {
            try {
                Locale b4 = b.a(context.getResources().getConfiguration()).b(0);
                if (!b4.equals(f13026b)) {
                    gVar.clear();
                    f13026b = b4;
                }
                String str2 = (String) gVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources b5 = u1.f.b(context);
                if (b5 == null) {
                    return null;
                }
                int identifier = b5.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    StringBuilder sb = new StringBuilder(str.length() + 18);
                    sb.append("Missing resource: ");
                    sb.append(str);
                    Log.w("GoogleApiAvailability", sb.toString());
                    return null;
                }
                String string = b5.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    StringBuilder sb2 = new StringBuilder(str.length() + 20);
                    sb2.append("Got empty resource: ");
                    sb2.append(str);
                    Log.w("GoogleApiAvailability", sb2.toString());
                    return null;
                }
                gVar.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
