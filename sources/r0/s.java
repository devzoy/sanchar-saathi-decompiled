package R0;

import android.content.Context;
import v0.C0946b;
import v3.l;
import y0.g;

public final class s extends C0946b {

    /* renamed from: c  reason: collision with root package name */
    public final Context f2545c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(Context context, int i4, int i5) {
        super(i4, i5);
        l.e(context, "mContext");
        this.f2545c = context;
    }

    public void a(g gVar) {
        l.e(gVar, "db");
        if (this.f12405b >= 10) {
            gVar.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f2545c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
