package i1;

import G.m;
import Y2.l;
import Y2.n;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class p implements l, n {

    /* renamed from: c  reason: collision with root package name */
    public final Context f10256c;

    /* renamed from: d  reason: collision with root package name */
    public b f10257d;

    /* renamed from: e  reason: collision with root package name */
    public Activity f10258e;

    /* renamed from: f  reason: collision with root package name */
    public int f10259f;

    /* renamed from: g  reason: collision with root package name */
    public Map f10260g;

    public interface a {
        void a(int i4);
    }

    public interface b {
        void a(Map map);
    }

    public interface c {
        void a(boolean z4);
    }

    public p(Context context) {
        this.f10256c = context;
    }

    public final int a() {
        List c4 = t.c(this.f10256c, 21);
        if (c4 != null && !c4.isEmpty()) {
            return 1;
        }
        Log.d("permissions_handler", "Bluetooth permission missing in manifest");
        return 0;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT < 33) {
            return m.e(this.f10256c).a() ? 1 : 0;
        }
        if (this.f10256c.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return 1;
        }
        return t.b(this.f10258e, "android.permission.POST_NOTIFICATIONS");
    }

    public void c(int i4, a aVar) {
        aVar.a(d(i4));
    }

    public final int d(int i4) {
        if (i4 == 17) {
            return b();
        }
        if (i4 == 21) {
            return a();
        }
        if ((i4 == 30 || i4 == 28 || i4 == 29) && Build.VERSION.SDK_INT < 31) {
            return a();
        }
        if ((i4 == 37 || i4 == 0) && !e()) {
            return 0;
        }
        List<String> c4 = t.c(this.f10256c, i4);
        if (c4 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i4);
            return 1;
        } else if (c4.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + c4 + i4);
            return (i4 != 22 || Build.VERSION.SDK_INT >= 30) ? 0 : 2;
        } else {
            if (this.f10256c.getApplicationInfo().targetSdkVersion >= 23) {
                HashSet hashSet = new HashSet();
                for (String str : c4) {
                    if (i4 == 16) {
                        String packageName = this.f10256c.getPackageName();
                        PowerManager powerManager = (PowerManager) this.f10256c.getSystemService("power");
                        if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                            hashSet.add(0);
                        } else {
                            hashSet.add(1);
                        }
                    } else if (i4 == 22) {
                        if (Build.VERSION.SDK_INT < 30) {
                            hashSet.add(2);
                        }
                        hashSet.add(Integer.valueOf(Environment.isExternalStorageManager() ? 1 : 0));
                    } else if (i4 == 23) {
                        hashSet.add(Integer.valueOf(Settings.canDrawOverlays(this.f10256c) ? 1 : 0));
                    } else if (i4 == 24) {
                        hashSet.add(Integer.valueOf(this.f10256c.getPackageManager().canRequestPackageInstalls() ? 1 : 0));
                    } else if (i4 == 27) {
                        hashSet.add(Integer.valueOf(((NotificationManager) this.f10256c.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0));
                    } else if (i4 == 34) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            hashSet.add(Integer.valueOf(((AlarmManager) this.f10256c.getSystemService("alarm")).canScheduleExactAlarms() ? 1 : 0));
                        } else {
                            hashSet.add(1);
                        }
                    } else if (i4 == 9 || i4 == 32) {
                        int a4 = H.a.a(this.f10256c, str);
                        if ((Build.VERSION.SDK_INT >= 34 ? H.a.a(this.f10256c, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") : a4) == 0 && a4 == -1) {
                            hashSet.add(3);
                        } else if (a4 == 0) {
                            hashSet.add(1);
                        } else {
                            hashSet.add(Integer.valueOf(t.b(this.f10258e, str)));
                        }
                    } else if (H.a.a(this.f10256c, str) != 0) {
                        hashSet.add(Integer.valueOf(t.b(this.f10258e, str)));
                    }
                }
                if (!hashSet.isEmpty()) {
                    return t.h(hashSet).intValue();
                }
            }
            return 1;
        }
    }

    public final boolean e() {
        List c4 = t.c(this.f10256c, 37);
        boolean z4 = c4 != null && c4.contains("android.permission.WRITE_CALENDAR");
        boolean z5 = c4 != null && c4.contains("android.permission.READ_CALENDAR");
        if (z4 && z5) {
            return true;
        }
        if (!z4) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z5) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    public final void f(String str, int i4) {
        if (this.f10258e != null) {
            Intent intent = new Intent(str);
            if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
                intent.setData(Uri.parse("package:" + this.f10258e.getPackageName()));
            }
            this.f10258e.startActivityForResult(intent, i4);
            this.f10259f++;
        }
    }

    public void g(List list, b bVar, C0706b bVar2) {
        if (this.f10259f > 0) {
            bVar2.a("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).");
        } else if (this.f10258e == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            bVar2.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
        } else {
            this.f10257d = bVar;
            this.f10260g = new HashMap();
            this.f10259f = 0;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (d(num.intValue()) != 1) {
                    List c4 = t.c(this.f10258e, num.intValue());
                    if (c4 != null && !c4.isEmpty()) {
                        int i4 = Build.VERSION.SDK_INT;
                        if (num.intValue() == 16) {
                            f("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", 209);
                        } else if (i4 >= 30 && num.intValue() == 22) {
                            f("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", 210);
                        } else if (num.intValue() == 23) {
                            f("android.settings.action.MANAGE_OVERLAY_PERMISSION", 211);
                        } else if (num.intValue() == 24) {
                            f("android.settings.MANAGE_UNKNOWN_APP_SOURCES", 212);
                        } else if (num.intValue() == 27) {
                            f("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS", 213);
                        } else if (i4 >= 31 && num.intValue() == 34) {
                            f("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", 214);
                        } else if (num.intValue() != 37 && num.intValue() != 0) {
                            arrayList.addAll(c4);
                            this.f10259f += c4.size();
                        } else if (e()) {
                            arrayList.add("android.permission.WRITE_CALENDAR");
                            arrayList.add("android.permission.READ_CALENDAR");
                            this.f10259f += 2;
                        } else {
                            this.f10260g.put(num, 0);
                        }
                    } else if (!this.f10260g.containsKey(num)) {
                        this.f10260g.put(num, 0);
                        if (num.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                            this.f10260g.put(num, 0);
                        } else {
                            this.f10260g.put(num, 2);
                        }
                    }
                } else if (!this.f10260g.containsKey(num)) {
                    this.f10260g.put(num, 1);
                }
            }
            if (arrayList.size() > 0) {
                G.a.p(this.f10258e, (String[]) arrayList.toArray(new String[0]), 24);
            }
            b bVar3 = this.f10257d;
            if (bVar3 != null && this.f10259f == 0) {
                bVar3.a(this.f10260g);
            }
        }
    }

    public void h(Activity activity) {
        this.f10258e = activity;
    }

    public void i(int i4, c cVar, C0706b bVar) {
        Activity activity = this.f10258e;
        if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            bVar.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        List c4 = t.c(activity, i4);
        if (c4 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i4);
            cVar.a(false);
        } else if (c4.isEmpty()) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + i4 + " no need to show request rationale");
            cVar.a(false);
        } else {
            cVar.a(G.a.q(this.f10258e, (String) c4.get(0)));
        }
    }

    public boolean onActivityResult(int i4, int i5, Intent intent) {
        boolean z4;
        int i6;
        Activity activity = this.f10258e;
        boolean z5 = false;
        if (activity == null) {
            return false;
        }
        if (this.f10260g == null) {
            this.f10259f = 0;
            return false;
        }
        if (i4 == 209) {
            String packageName = this.f10256c.getPackageName();
            PowerManager powerManager = (PowerManager) this.f10256c.getSystemService("power");
            if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                z5 = true;
            }
            i6 = 16;
        } else if (i4 == 210) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            z4 = Environment.isExternalStorageManager();
            i6 = 22;
        } else if (i4 == 211) {
            z4 = Settings.canDrawOverlays(activity);
            i6 = 23;
        } else if (i4 == 212) {
            z4 = activity.getPackageManager().canRequestPackageInstalls();
            i6 = 24;
        } else if (i4 == 213) {
            z4 = ((NotificationManager) activity.getSystemService("notification")).isNotificationPolicyAccessGranted();
            i6 = 27;
        } else if (i4 != 214) {
            return false;
        } else {
            z4 = Build.VERSION.SDK_INT >= 31 ? ((AlarmManager) activity.getSystemService("alarm")).canScheduleExactAlarms() : true;
            i6 = 34;
        }
        this.f10260g.put(Integer.valueOf(i6), Integer.valueOf(z4 ? 1 : 0));
        int i7 = this.f10259f - 1;
        this.f10259f = i7;
        b bVar = this.f10257d;
        if (bVar != null && i7 == 0) {
            bVar.a(this.f10260g);
        }
        return true;
    }
}
