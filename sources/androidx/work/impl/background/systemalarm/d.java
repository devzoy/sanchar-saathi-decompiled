package androidx.work.impl.background.systemalarm;

import Q0.i;
import R0.C0303e;
import R0.E;
import R0.r;
import R0.w;
import Z0.m;
import a1.C0343C;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import c1.C0402a;
import c1.C0403b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class d implements C0303e {

    /* renamed from: m  reason: collision with root package name */
    public static final String f6178m = i.i("SystemAlarmDispatcher");

    /* renamed from: c  reason: collision with root package name */
    public final Context f6179c;

    /* renamed from: d  reason: collision with root package name */
    public final C0403b f6180d;

    /* renamed from: e  reason: collision with root package name */
    public final C0343C f6181e;

    /* renamed from: f  reason: collision with root package name */
    public final r f6182f;

    /* renamed from: g  reason: collision with root package name */
    public final E f6183g;

    /* renamed from: h  reason: collision with root package name */
    public final a f6184h;

    /* renamed from: i  reason: collision with root package name */
    public final List f6185i;

    /* renamed from: j  reason: collision with root package name */
    public Intent f6186j;

    /* renamed from: k  reason: collision with root package name */
    public c f6187k;

    /* renamed from: l  reason: collision with root package name */
    public w f6188l;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            Executor a4;
            C0107d dVar;
            synchronized (d.this.f6185i) {
                d dVar2 = d.this;
                dVar2.f6186j = (Intent) dVar2.f6185i.get(0);
            }
            Intent intent = d.this.f6186j;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.f6186j.getIntExtra("KEY_START_ID", 0);
                i e4 = i.e();
                String str = d.f6178m;
                e4.a(str, "Processing command " + d.this.f6186j + ", " + intExtra);
                Context context = d.this.f6179c;
                PowerManager.WakeLock b4 = a1.w.b(context, action + " (" + intExtra + ")");
                try {
                    i e5 = i.e();
                    e5.a(str, "Acquiring operation wake lock (" + action + ") " + b4);
                    b4.acquire();
                    d dVar3 = d.this;
                    dVar3.f6184h.o(dVar3.f6186j, intExtra, dVar3);
                    i e6 = i.e();
                    e6.a(str, "Releasing operation wake lock (" + action + ") " + b4);
                    b4.release();
                    a4 = d.this.f6180d.a();
                    dVar = new C0107d(d.this);
                } catch (Throwable th) {
                    i e7 = i.e();
                    String str2 = d.f6178m;
                    e7.a(str2, "Releasing operation wake lock (" + action + ") " + b4);
                    b4.release();
                    d.this.f6180d.a().execute(new C0107d(d.this));
                    throw th;
                }
                a4.execute(dVar);
            }
        }
    }

    public static class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final d f6190e;

        /* renamed from: f  reason: collision with root package name */
        public final Intent f6191f;

        /* renamed from: g  reason: collision with root package name */
        public final int f6192g;

        public b(d dVar, Intent intent, int i4) {
            this.f6190e = dVar;
            this.f6191f = intent;
            this.f6192g = i4;
        }

        public void run() {
            this.f6190e.a(this.f6191f, this.f6192g);
        }
    }

    public interface c {
        void c();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d  reason: collision with other inner class name */
    public static class C0107d implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final d f6193e;

        public C0107d(d dVar) {
            this.f6193e = dVar;
        }

        public void run() {
            this.f6193e.c();
        }
    }

    public d(Context context) {
        this(context, (r) null, (E) null);
    }

    public boolean a(Intent intent, int i4) {
        i e4 = i.e();
        String str = f6178m;
        e4.a(str, "Adding command " + intent + " (" + i4 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            i.e().k(str, "Unknown command. Ignoring");
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i4);
            synchronized (this.f6185i) {
                try {
                    boolean isEmpty = this.f6185i.isEmpty();
                    this.f6185i.add(intent);
                    if (isEmpty) {
                        k();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    public final void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public void c() {
        i e4 = i.e();
        String str = f6178m;
        e4.a(str, "Checking if commands are complete.");
        b();
        synchronized (this.f6185i) {
            try {
                if (this.f6186j != null) {
                    i e5 = i.e();
                    e5.a(str, "Removing command " + this.f6186j);
                    if (((Intent) this.f6185i.remove(0)).equals(this.f6186j)) {
                        this.f6186j = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                C0402a b4 = this.f6180d.b();
                if (!this.f6184h.n() && this.f6185i.isEmpty() && !b4.C()) {
                    i.e().a(str, "No more commands & intents.");
                    c cVar = this.f6187k;
                    if (cVar != null) {
                        cVar.c();
                    }
                } else if (!this.f6185i.isEmpty()) {
                    k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(m mVar, boolean z4) {
        this.f6180d.a().execute(new b(this, a.c(this.f6179c, mVar, z4), 0));
    }

    public r e() {
        return this.f6182f;
    }

    public C0403b f() {
        return this.f6180d;
    }

    public E g() {
        return this.f6183g;
    }

    public C0343C h() {
        return this.f6181e;
    }

    public final boolean i(String str) {
        b();
        synchronized (this.f6185i) {
            try {
                for (Intent action : this.f6185i) {
                    if (str.equals(action.getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        i.e().a(f6178m, "Destroying SystemAlarmDispatcher");
        this.f6182f.n(this);
        this.f6187k = null;
    }

    public final void k() {
        b();
        PowerManager.WakeLock b4 = a1.w.b(this.f6179c, "ProcessCommand");
        try {
            b4.acquire();
            this.f6183g.r().c(new a());
        } finally {
            b4.release();
        }
    }

    public void l(c cVar) {
        if (this.f6187k != null) {
            i.e().c(f6178m, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f6187k = cVar;
        }
    }

    public d(Context context, r rVar, E e4) {
        Context applicationContext = context.getApplicationContext();
        this.f6179c = applicationContext;
        this.f6188l = new w();
        this.f6184h = new a(applicationContext, this.f6188l);
        e4 = e4 == null ? E.l(context) : e4;
        this.f6183g = e4;
        this.f6181e = new C0343C(e4.j().k());
        rVar = rVar == null ? e4.n() : rVar;
        this.f6182f = rVar;
        this.f6180d = e4.r();
        rVar.g(this);
        this.f6185i = new ArrayList();
        this.f6186j = null;
    }
}
