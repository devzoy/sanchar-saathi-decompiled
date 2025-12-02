package a1;

import Z0.d;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import y0.g;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public final WorkDatabase f3968a;

    public q(WorkDatabase workDatabase) {
        this.f3968a = workDatabase;
    }

    public static void c(Context context, g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j4 = 0;
            long j5 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j4 = 1;
            }
            gVar.beginTransaction();
            try {
                gVar.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j5)});
                gVar.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j4)});
                sharedPreferences.edit().clear().apply();
                gVar.setTransactionSuccessful();
            } finally {
                gVar.endTransaction();
            }
        }
    }

    public long a() {
        Long a4 = this.f3968a.F().a("last_force_stop_ms");
        if (a4 != null) {
            return a4.longValue();
        }
        return 0;
    }

    public boolean b() {
        Long a4 = this.f3968a.F().a("reschedule_needed");
        return a4 != null && a4.longValue() == 1;
    }

    public void d(long j4) {
        this.f3968a.F().b(new d("last_force_stop_ms", Long.valueOf(j4)));
    }

    public void e(boolean z4) {
        this.f3968a.F().b(new d("reschedule_needed", z4));
    }
}
