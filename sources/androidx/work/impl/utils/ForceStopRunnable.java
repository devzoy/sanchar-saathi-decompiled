package androidx.work.impl.utils;

import Q0.i;
import Q0.s;
import R0.A;
import R0.E;
import U0.c;
import Z0.r;
import Z0.u;
import Z0.v;
import a1.f;
import a1.q;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ForceStopRunnable implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public static final String f6227i = i.i("ForceStopRunnable");

    /* renamed from: j  reason: collision with root package name */
    public static final long f6228j = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: e  reason: collision with root package name */
    public final Context f6229e;

    /* renamed from: f  reason: collision with root package name */
    public final E f6230f;

    /* renamed from: g  reason: collision with root package name */
    public final q f6231g;

    /* renamed from: h  reason: collision with root package name */
    public int f6232h = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public static final String f6233a = i.i("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                i.e().j(f6233a, "Rescheduling alarm that keeps track of force-stops.");
                ForceStopRunnable.g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, E e4) {
        this.f6229e = context.getApplicationContext();
        this.f6230f = e4;
        this.f6231g = e4.m();
    }

    public static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public static PendingIntent d(Context context, int i4) {
        return PendingIntent.getBroadcast(context, -1, c(context), i4);
    }

    public static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d4 = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f6228j;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d4);
        }
    }

    public boolean a() {
        boolean i4 = c.i(this.f6229e, this.f6230f);
        WorkDatabase q4 = this.f6230f.q();
        v J4 = q4.J();
        r I4 = q4.I();
        q4.e();
        try {
            List<u> b4 = J4.b();
            boolean z4 = b4 != null && !b4.isEmpty();
            if (z4) {
                for (u uVar : b4) {
                    J4.n(s.ENQUEUED, uVar.f3834a);
                    J4.f(uVar.f3834a, -1);
                }
            }
            I4.b();
            q4.B();
            q4.i();
            return z4 || i4;
        } catch (Throwable th) {
            q4.i();
            throw th;
        }
    }

    public void b() {
        boolean a4 = a();
        if (h()) {
            i.e().a(f6227i, "Rescheduling Workers.");
            this.f6230f.u();
            this.f6230f.m().e(false);
        } else if (e()) {
            i.e().a(f6227i, "Application was force-stopped, rescheduling.");
            this.f6230f.u();
            this.f6231g.d(System.currentTimeMillis());
        } else if (a4) {
            i.e().a(f6227i, "Found unfinished work, scheduling it.");
            R0.u.b(this.f6230f.j(), this.f6230f.q(), this.f6230f.o());
        }
    }

    public boolean e() {
        try {
            int i4 = Build.VERSION.SDK_INT;
            PendingIntent d4 = d(this.f6229e, i4 >= 31 ? 570425344 : 536870912);
            if (i4 >= 30) {
                if (d4 != null) {
                    d4.cancel();
                }
                List a4 = ((ActivityManager) this.f6229e.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
                if (a4 != null && !a4.isEmpty()) {
                    long a5 = this.f6231g.a();
                    for (int i5 = 0; i5 < a4.size(); i5++) {
                        ApplicationExitInfo a6 = f.a(a4.get(i5));
                        if (a6.getReason() == 10 && a6.getTimestamp() >= a5) {
                            return true;
                        }
                    }
                }
            } else if (d4 == null) {
                g(this.f6229e);
                return true;
            }
            return false;
        } catch (SecurityException e4) {
            e = e4;
            i.e().l(f6227i, "Ignoring exception", e);
            return true;
        } catch (IllegalArgumentException e5) {
            e = e5;
            i.e().l(f6227i, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a j4 = this.f6230f.j();
        if (TextUtils.isEmpty(j4.c())) {
            i.e().a(f6227i, "The default process name was not specified.");
            return true;
        }
        boolean b4 = a1.r.b(this.f6229e, j4);
        i e4 = i.e();
        String str = f6227i;
        e4.a(str, "Is default app process = " + b4);
        return b4;
    }

    public boolean h() {
        return this.f6230f.m().b();
    }

    public void i(long j4) {
        try {
            Thread.sleep(j4);
        } catch (InterruptedException unused) {
        }
    }

    public void run() {
        try {
            if (!f()) {
                this.f6230f.t();
                return;
            }
            while (true) {
                A.d(this.f6229e);
                i.e().a(f6227i, "Performing cleanup operations.");
                b();
                break;
            }
            this.f6230f.t();
        } catch (SQLiteException e4) {
            i.e().c(f6227i, "Unexpected SQLite exception during migrations");
            IllegalStateException illegalStateException = new IllegalStateException("Unexpected SQLite exception during migrations", e4);
            R.a e5 = this.f6230f.j().e();
            if (e5 != null) {
                e5.accept(illegalStateException);
            } else {
                throw illegalStateException;
            }
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e6) {
            int i4 = this.f6232h + 1;
            this.f6232h = i4;
            if (i4 >= 3) {
                i e7 = i.e();
                String str = f6227i;
                e7.d(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e6);
                IllegalStateException illegalStateException2 = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e6);
                R.a e8 = this.f6230f.j().e();
                if (e8 != null) {
                    i.e().b(str, "Routing exception to the specified exception handler", illegalStateException2);
                    e8.accept(illegalStateException2);
                } else {
                    throw illegalStateException2;
                }
            } else {
                i e9 = i.e();
                String str2 = f6227i;
                e9.b(str2, "Retrying after " + (((long) i4) * 300), e6);
                i(((long) this.f6232h) * 300);
            }
        } catch (Throwable th) {
            this.f6230f.t();
            throw th;
        }
    }
}
