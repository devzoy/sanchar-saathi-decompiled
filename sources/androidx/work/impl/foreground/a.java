package androidx.work.impl.foreground;

import Q0.i;
import R0.C0303e;
import R0.E;
import V0.c;
import V0.d;
import V0.e;
import Z0.m;
import Z0.u;
import Z0.x;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import c1.C0403b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class a implements c, C0303e {

    /* renamed from: m  reason: collision with root package name */
    public static final String f6214m = i.i("SystemFgDispatcher");

    /* renamed from: c  reason: collision with root package name */
    public Context f6215c;

    /* renamed from: d  reason: collision with root package name */
    public E f6216d;

    /* renamed from: e  reason: collision with root package name */
    public final C0403b f6217e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f6218f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public m f6219g;

    /* renamed from: h  reason: collision with root package name */
    public final Map f6220h;

    /* renamed from: i  reason: collision with root package name */
    public final Map f6221i;

    /* renamed from: j  reason: collision with root package name */
    public final Set f6222j;

    /* renamed from: k  reason: collision with root package name */
    public final d f6223k;

    /* renamed from: l  reason: collision with root package name */
    public b f6224l;

    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    public class C0108a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f6225e;

        public C0108a(String str) {
            this.f6225e = str;
        }

        public void run() {
            u h4 = a.this.f6216d.n().h(this.f6225e);
            if (h4 != null && h4.f()) {
                synchronized (a.this.f6218f) {
                    a.this.f6221i.put(x.a(h4), h4);
                    a.this.f6222j.add(h4);
                    a aVar = a.this;
                    aVar.f6223k.a(aVar.f6222j);
                }
            }
        }
    }

    public interface b {
        void a();

        void d(int i4);

        void e(int i4, int i5, Notification notification);

        void f(int i4, Notification notification);
    }

    public a(Context context) {
        this.f6215c = context;
        E l4 = E.l(context);
        this.f6216d = l4;
        this.f6217e = l4.r();
        this.f6219g = null;
        this.f6220h = new LinkedHashMap();
        this.f6222j = new HashSet();
        this.f6221i = new HashMap();
        this.f6223k = new e(this.f6216d.p(), (c) this);
        this.f6216d.n().g(this);
    }

    public static Intent c(Context context, m mVar, Q0.e eVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        return intent;
    }

    public static Intent f(Context context, m mVar, Q0.e eVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    public void b(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                u uVar = (u) it.next();
                String str = uVar.f3834a;
                i e4 = i.e();
                String str2 = f6214m;
                e4.a(str2, "Constraints unmet for WorkSpec " + str);
                this.f6216d.y(x.a(uVar));
            }
        }
    }

    public void d(m mVar, boolean z4) {
        Map.Entry entry;
        synchronized (this.f6218f) {
            try {
                u uVar = (u) this.f6221i.remove(mVar);
                if (uVar != null ? this.f6222j.remove(uVar) : false) {
                    this.f6223k.a(this.f6222j);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        Q0.e eVar = (Q0.e) this.f6220h.remove(mVar);
        if (mVar.equals(this.f6219g) && this.f6220h.size() > 0) {
            Iterator it = this.f6220h.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f6219g = (m) entry.getKey();
            if (this.f6224l != null) {
                Q0.e eVar2 = (Q0.e) entry.getValue();
                this.f6224l.e(eVar2.c(), eVar2.a(), eVar2.b());
                this.f6224l.d(eVar2.c());
            }
        }
        b bVar = this.f6224l;
        if (eVar != null && bVar != null) {
            i e4 = i.e();
            String str = f6214m;
            e4.a(str, "Removing Notification (id: " + eVar.c() + ", workSpecId: " + mVar + ", notificationType: " + eVar.a());
            bVar.d(eVar.c());
        }
    }

    public void e(List list) {
    }

    public final void h(Intent intent) {
        i e4 = i.e();
        String str = f6214m;
        e4.f(str, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f6216d.f(UUID.fromString(stringExtra));
        }
    }

    public final void i(Intent intent) {
        int i4 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        m mVar = new m(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        i e4 = i.e();
        String str = f6214m;
        e4.a(str, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification != null && this.f6224l != null) {
            this.f6220h.put(mVar, new Q0.e(intExtra, notification, intExtra2));
            if (this.f6219g == null) {
                this.f6219g = mVar;
                this.f6224l.e(intExtra, intExtra2, notification);
                return;
            }
            this.f6224l.f(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry value : this.f6220h.entrySet()) {
                    i4 |= ((Q0.e) value.getValue()).a();
                }
                Q0.e eVar = (Q0.e) this.f6220h.get(this.f6219g);
                if (eVar != null) {
                    this.f6224l.e(eVar.c(), i4, eVar.b());
                }
            }
        }
    }

    public final void j(Intent intent) {
        i e4 = i.e();
        String str = f6214m;
        e4.f(str, "Started foreground service " + intent);
        this.f6217e.c(new C0108a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void k(Intent intent) {
        i.e().f(f6214m, "Stopping foreground service");
        b bVar = this.f6224l;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void l() {
        this.f6224l = null;
        synchronized (this.f6218f) {
            this.f6223k.d();
        }
        this.f6216d.n().n(this);
    }

    public void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent);
        }
    }

    public void n(b bVar) {
        if (this.f6224l != null) {
            i.e().c(f6214m, "A callback already exists.");
        } else {
            this.f6224l = bVar;
        }
    }
}
