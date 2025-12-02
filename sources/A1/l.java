package a1;

import Z0.d;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import y0.g;

public abstract class l {
    public static final void c(Context context, g gVar) {
        v3.l.e(context, "context");
        v3.l.e(gVar, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i4 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i5 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            gVar.beginTransaction();
            try {
                gVar.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i4)});
                gVar.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i5)});
                sharedPreferences.edit().clear().apply();
                gVar.setTransactionSuccessful();
            } finally {
                gVar.endTransaction();
            }
        }
    }

    public static final int d(WorkDatabase workDatabase, String str) {
        Long a4 = workDatabase.F().a(str);
        int i4 = 0;
        int longValue = a4 != null ? (int) a4.longValue() : 0;
        if (longValue != Integer.MAX_VALUE) {
            i4 = longValue + 1;
        }
        e(workDatabase, str, i4);
        return longValue;
    }

    public static final void e(WorkDatabase workDatabase, String str, int i4) {
        workDatabase.F().b(new d(str, Long.valueOf((long) i4)));
    }
}
