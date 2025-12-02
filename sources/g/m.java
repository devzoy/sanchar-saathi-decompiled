package G;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.C0388a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class m {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f1209c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static String f1210d;

    /* renamed from: e  reason: collision with root package name */
    public static Set f1211e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public static final Object f1212f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static e f1213g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1214a;

    /* renamed from: b  reason: collision with root package name */
    public final NotificationManager f1215b;

    public static class a {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    public static class b {
        public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        public static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        public static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        public static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        public static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        public static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        public static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        public static List<NotificationChannel> k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    public static class c implements f {

        /* renamed from: a  reason: collision with root package name */
        public final String f1216a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1217b;

        /* renamed from: c  reason: collision with root package name */
        public final String f1218c;

        /* renamed from: d  reason: collision with root package name */
        public final Notification f1219d;

        public c(String str, int i4, String str2, Notification notification) {
            this.f1216a = str;
            this.f1217b = i4;
            this.f1218c = str2;
            this.f1219d = notification;
        }

        public void a(C0388a aVar) {
            aVar.B(this.f1216a, this.f1217b, this.f1218c, this.f1219d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f1216a + ", id:" + this.f1217b + ", tag:" + this.f1218c + "]";
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final ComponentName f1220a;

        /* renamed from: b  reason: collision with root package name */
        public final IBinder f1221b;

        public d(ComponentName componentName, IBinder iBinder) {
            this.f1220a = componentName;
            this.f1221b = iBinder;
        }
    }

    public static class e implements Handler.Callback, ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1222a;

        /* renamed from: b  reason: collision with root package name */
        public final HandlerThread f1223b;

        /* renamed from: c  reason: collision with root package name */
        public final Handler f1224c;

        /* renamed from: d  reason: collision with root package name */
        public final Map f1225d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        public Set f1226e = new HashSet();

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ComponentName f1227a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f1228b = false;

            /* renamed from: c  reason: collision with root package name */
            public C0388a f1229c;

            /* renamed from: d  reason: collision with root package name */
            public ArrayDeque f1230d = new ArrayDeque();

            /* renamed from: e  reason: collision with root package name */
            public int f1231e = 0;

            public a(ComponentName componentName) {
                this.f1227a = componentName;
            }
        }

        public e(Context context) {
            this.f1222a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f1223b = handlerThread;
            handlerThread.start();
            this.f1224c = new Handler(handlerThread.getLooper(), this);
        }

        public final boolean a(a aVar) {
            if (aVar.f1228b) {
                return true;
            }
            boolean bindService = this.f1222a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f1227a), this, 33);
            aVar.f1228b = bindService;
            if (bindService) {
                aVar.f1231e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f1227a);
                this.f1222a.unbindService(this);
            }
            return aVar.f1228b;
        }

        public final void b(a aVar) {
            if (aVar.f1228b) {
                this.f1222a.unbindService(this);
                aVar.f1228b = false;
            }
            aVar.f1229c = null;
        }

        public final void c(f fVar) {
            j();
            for (a aVar : this.f1225d.values()) {
                aVar.f1230d.add(fVar);
                g(aVar);
            }
        }

        public final void d(ComponentName componentName) {
            a aVar = (a) this.f1225d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        public final void e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f1225d.get(componentName);
            if (aVar != null) {
                aVar.f1229c = C0388a.C0109a.H(iBinder);
                aVar.f1231e = 0;
                g(aVar);
            }
        }

        public final void f(ComponentName componentName) {
            a aVar = (a) this.f1225d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        public final void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f1227a + ", " + aVar.f1230d.size() + " queued tasks");
            }
            if (!aVar.f1230d.isEmpty()) {
                if (!a(aVar) || aVar.f1229c == null) {
                    i(aVar);
                    return;
                }
                while (true) {
                    f fVar = (f) aVar.f1230d.peek();
                    if (fVar == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + fVar);
                        }
                        fVar.a(aVar.f1229c);
                        aVar.f1230d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f1227a);
                        }
                    } catch (RemoteException e4) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f1227a, e4);
                    }
                }
                if (!aVar.f1230d.isEmpty()) {
                    i(aVar);
                }
            }
        }

        public void h(f fVar) {
            this.f1224c.obtainMessage(0, fVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 0) {
                c((f) message.obj);
                return true;
            } else if (i4 == 1) {
                d dVar = (d) message.obj;
                e(dVar.f1220a, dVar.f1221b);
                return true;
            } else if (i4 == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i4 != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        public final void i(a aVar) {
            if (!this.f1224c.hasMessages(3, aVar.f1227a)) {
                int i4 = aVar.f1231e;
                int i5 = i4 + 1;
                aVar.f1231e = i5;
                if (i5 > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f1230d.size() + " tasks to " + aVar.f1227a + " after " + aVar.f1231e + " retries");
                    aVar.f1230d.clear();
                    return;
                }
                int i6 = (1 << i4) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i6 + " ms");
                }
                this.f1224c.sendMessageDelayed(this.f1224c.obtainMessage(3, aVar.f1227a), (long) i6);
            }
        }

        public final void j() {
            Set f4 = m.f(this.f1222a);
            if (!f4.equals(this.f1226e)) {
                this.f1226e = f4;
                List<ResolveInfo> queryIntentServices = this.f1222a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (f4.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f1225d.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f1225d.put(componentName2, new a(componentName2));
                    }
                }
                Iterator it = this.f1225d.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        b((a) entry.getValue());
                        it.remove();
                    }
                }
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f1224c.obtainMessage(1, new d(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f1224c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface f {
        void a(C0388a aVar);
    }

    public m(Context context) {
        this.f1214a = context;
        this.f1215b = (NotificationManager) context.getSystemService("notification");
    }

    public static m e(Context context) {
        return new m(context);
    }

    public static Set f(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f1209c) {
            if (string != null) {
                try {
                    if (!string.equals(f1210d)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String unflattenFromString : split) {
                            ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                            if (unflattenFromString2 != null) {
                                hashSet.add(unflattenFromString2.getPackageName());
                            }
                        }
                        f1211e = hashSet;
                        f1210d = string;
                    }
                } finally {
                }
            }
            set = f1211e;
        }
        return set;
    }

    public static boolean k(Notification notification) {
        Bundle a4 = i.a(notification);
        return a4 != null && a4.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        return a.a(this.f1215b);
    }

    public void b(int i4) {
        c((String) null, i4);
    }

    public void c(String str, int i4) {
        this.f1215b.cancel(str, i4);
    }

    public void d() {
        this.f1215b.cancelAll();
    }

    public List g() {
        return b.k(this.f1215b);
    }

    public void h(int i4, Notification notification) {
        i((String) null, i4, notification);
    }

    public void i(String str, int i4, Notification notification) {
        if (k(notification)) {
            j(new c(this.f1214a.getPackageName(), i4, str, notification));
            this.f1215b.cancel(str, i4);
            return;
        }
        this.f1215b.notify(str, i4, notification);
    }

    public final void j(f fVar) {
        synchronized (f1212f) {
            try {
                if (f1213g == null) {
                    f1213g = new e(this.f1214a.getApplicationContext());
                }
                f1213g.h(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
