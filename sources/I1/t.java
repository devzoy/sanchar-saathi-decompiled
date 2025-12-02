package i1;

import G.a;
import Q0.i;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;

public abstract class t {
    public static String a(Context context, String str) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 && e(context, (ArrayList) null, str)) {
            return str;
        }
        if (i4 < 29) {
            if (e(context, (ArrayList) null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            if (e(context, (ArrayList) null, "android.permission.ACCESS_COARSE_LOCATION")) {
                return "android.permission.ACCESS_COARSE_LOCATION";
            }
            return null;
        } else if (e(context, (ArrayList) null, "android.permission.ACCESS_FINE_LOCATION")) {
            return "android.permission.ACCESS_FINE_LOCATION";
        } else {
            return null;
        }
    }

    public static int b(Activity activity, String str) {
        if (activity == null) {
            return 0;
        }
        boolean i4 = i(activity, str);
        boolean f4 = f(activity, str);
        boolean z4 = !f4;
        if (i4) {
            z4 = f4;
        }
        if (!i4 && z4) {
            g(activity, str);
        }
        return (!i4 || !z4) ? 0 : 4;
    }

    public static List c(Context context, int i4) {
        String a4;
        String a5;
        String a6;
        ArrayList arrayList = new ArrayList();
        switch (i4) {
            case 0:
            case 37:
                if (e(context, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                }
                if (e(context, arrayList, "android.permission.READ_CALENDAR")) {
                    arrayList.add("android.permission.READ_CALENDAR");
                    break;
                }
                break;
            case 1:
                if (e(context, arrayList, "android.permission.CAMERA")) {
                    arrayList.add("android.permission.CAMERA");
                    break;
                }
                break;
            case 2:
                if (e(context, arrayList, "android.permission.READ_CONTACTS")) {
                    arrayList.add("android.permission.READ_CONTACTS");
                }
                if (e(context, arrayList, "android.permission.WRITE_CONTACTS")) {
                    arrayList.add("android.permission.WRITE_CONTACTS");
                }
                if (e(context, arrayList, "android.permission.GET_ACCOUNTS")) {
                    arrayList.add("android.permission.GET_ACCOUNTS");
                    break;
                }
                break;
            case 3:
            case 4:
            case 5:
                if (i4 == 4 && Build.VERSION.SDK_INT >= 29) {
                    if (e(context, arrayList, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                        break;
                    }
                } else {
                    if (e(context, arrayList, "android.permission.ACCESS_COARSE_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
                    }
                    if (e(context, arrayList, "android.permission.ACCESS_FINE_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                        break;
                    }
                }
                break;
            case 6:
            case IBulkCursor.RESPOND_TRANSACTION /*11*/:
            case i.f2380c:
                return null;
            case 7:
            case 14:
                if (e(context, arrayList, "android.permission.RECORD_AUDIO")) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                    break;
                }
                break;
            case 8:
                if (e(context, arrayList, "android.permission.READ_PHONE_STATE")) {
                    arrayList.add("android.permission.READ_PHONE_STATE");
                }
                if (Build.VERSION.SDK_INT > 29 && e(context, arrayList, "android.permission.READ_PHONE_NUMBERS")) {
                    arrayList.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (e(context, arrayList, "android.permission.CALL_PHONE")) {
                    arrayList.add("android.permission.CALL_PHONE");
                }
                if (e(context, arrayList, "android.permission.READ_CALL_LOG")) {
                    arrayList.add("android.permission.READ_CALL_LOG");
                }
                if (e(context, arrayList, "android.permission.WRITE_CALL_LOG")) {
                    arrayList.add("android.permission.WRITE_CALL_LOG");
                }
                if (e(context, arrayList, "com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    arrayList.add("com.android.voicemail.permission.ADD_VOICEMAIL");
                }
                if (e(context, arrayList, "android.permission.USE_SIP")) {
                    arrayList.add("android.permission.USE_SIP");
                }
                if (e(context, arrayList, "android.permission.ANSWER_PHONE_CALLS")) {
                    arrayList.add("android.permission.ANSWER_PHONE_CALLS");
                    break;
                }
                break;
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                if (Build.VERSION.SDK_INT >= 33 && e(context, arrayList, "android.permission.READ_MEDIA_IMAGES")) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                    break;
                }
            case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                if (e(context, arrayList, "android.permission.BODY_SENSORS")) {
                    arrayList.add("android.permission.BODY_SENSORS");
                    break;
                }
                break;
            case 13:
                if (e(context, arrayList, "android.permission.SEND_SMS")) {
                    arrayList.add("android.permission.SEND_SMS");
                }
                if (e(context, arrayList, "android.permission.RECEIVE_SMS")) {
                    arrayList.add("android.permission.RECEIVE_SMS");
                }
                if (e(context, arrayList, "android.permission.READ_SMS")) {
                    arrayList.add("android.permission.READ_SMS");
                }
                if (e(context, arrayList, "android.permission.RECEIVE_WAP_PUSH")) {
                    arrayList.add("android.permission.RECEIVE_WAP_PUSH");
                }
                if (e(context, arrayList, "android.permission.RECEIVE_MMS")) {
                    arrayList.add("android.permission.RECEIVE_MMS");
                    break;
                }
                break;
            case 15:
                if (e(context, arrayList, "android.permission.READ_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                }
                int i5 = Build.VERSION.SDK_INT;
                if ((i5 < 29 || (i5 == 29 && Environment.isExternalStorageLegacy())) && e(context, arrayList, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                    break;
                }
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                if (e(context, arrayList, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
                    arrayList.add("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    break;
                }
                break;
            case 17:
                if (Build.VERSION.SDK_INT >= 33 && e(context, arrayList, "android.permission.POST_NOTIFICATIONS")) {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                    break;
                }
            case 18:
                if (Build.VERSION.SDK_INT >= 29) {
                    if (e(context, arrayList, "android.permission.ACCESS_MEDIA_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
                        break;
                    }
                } else {
                    return null;
                }
                break;
            case 19:
                if (Build.VERSION.SDK_INT >= 29) {
                    if (e(context, arrayList, "android.permission.ACTIVITY_RECOGNITION")) {
                        arrayList.add("android.permission.ACTIVITY_RECOGNITION");
                        break;
                    }
                } else {
                    return null;
                }
                break;
            case 21:
                if (e(context, arrayList, "android.permission.BLUETOOTH")) {
                    arrayList.add("android.permission.BLUETOOTH");
                    break;
                }
                break;
            case 22:
                if (Build.VERSION.SDK_INT >= 30 && e(context, arrayList, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                    break;
                }
            case 23:
                if (e(context, arrayList, "android.permission.SYSTEM_ALERT_WINDOW")) {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                    break;
                }
                break;
            case 24:
                if (e(context, arrayList, "android.permission.REQUEST_INSTALL_PACKAGES")) {
                    arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                    break;
                }
                break;
            case 27:
                if (e(context, arrayList, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
                    break;
                }
                break;
            case 28:
                if (Build.VERSION.SDK_INT >= 31 && (a4 = a(context, "android.permission.BLUETOOTH_SCAN")) != null) {
                    arrayList.add(a4);
                    break;
                }
            case 29:
                if (Build.VERSION.SDK_INT >= 31 && (a5 = a(context, "android.permission.BLUETOOTH_ADVERTISE")) != null) {
                    arrayList.add(a5);
                    break;
                }
            case 30:
                if (Build.VERSION.SDK_INT >= 31 && (a6 = a(context, "android.permission.BLUETOOTH_CONNECT")) != null) {
                    arrayList.add(a6);
                    break;
                }
            case 31:
                if (Build.VERSION.SDK_INT >= 33 && e(context, arrayList, "android.permission.NEARBY_WIFI_DEVICES")) {
                    arrayList.add("android.permission.NEARBY_WIFI_DEVICES");
                    break;
                }
            case 32:
                if (Build.VERSION.SDK_INT >= 33 && e(context, arrayList, "android.permission.READ_MEDIA_VIDEO")) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                    break;
                }
            case 33:
                if (Build.VERSION.SDK_INT >= 33 && e(context, arrayList, "android.permission.READ_MEDIA_AUDIO")) {
                    arrayList.add("android.permission.READ_MEDIA_AUDIO");
                    break;
                }
            case 34:
                if (e(context, arrayList, "android.permission.SCHEDULE_EXACT_ALARM")) {
                    arrayList.add("android.permission.SCHEDULE_EXACT_ALARM");
                    break;
                }
                break;
            case 35:
                if (Build.VERSION.SDK_INT >= 33 && e(context, arrayList, "android.permission.BODY_SENSORS_BACKGROUND")) {
                    arrayList.add("android.permission.BODY_SENSORS_BACKGROUND");
                    break;
                }
            case 36:
                if (e(context, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                    break;
                }
                break;
        }
        return arrayList;
    }

    public static PackageInfo d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096)) : packageManager.getPackageInfo(context.getPackageName(), 4096);
    }

    public static boolean e(Context context, ArrayList arrayList, String str) {
        if (arrayList != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e4) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e4);
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageInfo d4 = d(context);
        if (d4 == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(d4.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(Activity activity, String str) {
        return !a.q(activity, str);
    }

    public static void g(Context context, String str) {
        context.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
    }

    public static Integer h(Collection collection) {
        if (collection.contains(4)) {
            return 4;
        }
        if (collection.contains(2)) {
            return 2;
        }
        if (collection.contains(0)) {
            return 0;
        }
        return collection.contains(3) ? 3 : 1;
    }

    public static boolean i(Context context, String str) {
        return context.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
    }
}
