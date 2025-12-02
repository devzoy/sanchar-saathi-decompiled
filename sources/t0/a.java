package T0;

import Q0.i;
import Z0.j;
import Z0.l;
import Z0.m;
import a1.k;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2852a = i.i("Alarms");

    /* renamed from: T0.a$a  reason: collision with other inner class name */
    public static class C0061a {
        public static void a(AlarmManager alarmManager, int i4, long j4, PendingIntent pendingIntent) {
            alarmManager.setExact(i4, j4, pendingIntent);
        }
    }

    public static void a(Context context, WorkDatabase workDatabase, m mVar) {
        j G4 = workDatabase.G();
        Z0.i e4 = G4.e(mVar);
        if (e4 != null) {
            b(context, mVar, e4.f3809c);
            i e5 = i.e();
            String str = f2852a;
            e5.a(str, "Removing SystemIdInfo for workSpecId (" + mVar + ")");
            G4.a(mVar);
        }
    }

    public static void b(Context context, m mVar, int i4) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i4, androidx.work.impl.background.systemalarm.a.b(context, mVar), 603979776);
        if (service != null && alarmManager != null) {
            i e4 = i.e();
            String str = f2852a;
            e4.a(str, "Cancelling existing alarm with (workSpecId, systemId) (" + mVar + ", " + i4 + ")");
            alarmManager.cancel(service);
        }
    }

    public static void c(Context context, WorkDatabase workDatabase, m mVar, long j4) {
        j G4 = workDatabase.G();
        Z0.i e4 = G4.e(mVar);
        if (e4 != null) {
            b(context, mVar, e4.f3809c);
            d(context, mVar, e4.f3809c, j4);
            return;
        }
        int c4 = new k(workDatabase).c();
        G4.c(l.a(mVar, c4));
        d(context, mVar, c4, j4);
    }

    public static void d(Context context, m mVar, int i4, long j4) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i4, androidx.work.impl.background.systemalarm.a.b(context, mVar), 201326592);
        if (alarmManager != null) {
            C0061a.a(alarmManager, 0, j4, service);
        }
    }
}
