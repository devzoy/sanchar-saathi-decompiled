package G;

import android.app.AlarmManager;
import android.app.PendingIntent;

public abstract class c {

    public static class a {
        public static AlarmManager.AlarmClockInfo a(long j4, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j4, pendingIntent);
        }

        public static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    public static class b {
        public static void a(AlarmManager alarmManager, int i4, long j4, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i4, j4, pendingIntent);
        }

        public static void b(AlarmManager alarmManager, int i4, long j4, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i4, j4, pendingIntent);
        }
    }

    public static void a(AlarmManager alarmManager, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        a.b(alarmManager, a.a(j4, pendingIntent), pendingIntent2);
    }

    public static void b(AlarmManager alarmManager, int i4, long j4, PendingIntent pendingIntent) {
        b.a(alarmManager, i4, j4, pendingIntent);
    }

    public static void c(AlarmManager alarmManager, int i4, long j4, PendingIntent pendingIntent) {
        alarmManager.setExact(i4, j4, pendingIntent);
    }

    public static void d(AlarmManager alarmManager, int i4, long j4, PendingIntent pendingIntent) {
        b.b(alarmManager, i4, j4, pendingIntent);
    }
}
