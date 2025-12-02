package i;

import H.e;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

public class i {

    /* renamed from: d  reason: collision with root package name */
    public static i f9755d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9756a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f9757b;

    /* renamed from: c  reason: collision with root package name */
    public final a f9758c = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f9759a;

        /* renamed from: b  reason: collision with root package name */
        public long f9760b;

        /* renamed from: c  reason: collision with root package name */
        public long f9761c;

        /* renamed from: d  reason: collision with root package name */
        public long f9762d;

        /* renamed from: e  reason: collision with root package name */
        public long f9763e;

        /* renamed from: f  reason: collision with root package name */
        public long f9764f;
    }

    public i(Context context, LocationManager locationManager) {
        this.f9756a = context;
        this.f9757b = locationManager;
    }

    public static i a(Context context) {
        if (f9755d == null) {
            Context applicationContext = context.getApplicationContext();
            f9755d = new i(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f9755d;
    }

    public final Location b() {
        Location location = null;
        Location c4 = e.c(this.f9756a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        if (e.c(this.f9756a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = c("gps");
        }
        return (location == null || c4 == null) ? location != null ? location : c4 : location.getTime() > c4.getTime() ? location : c4;
    }

    public final Location c(String str) {
        try {
            if (this.f9757b.isProviderEnabled(str)) {
                return this.f9757b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e4) {
            Log.d("TwilightManager", "Failed to get last known location", e4);
            return null;
        }
    }

    public boolean d() {
        a aVar = this.f9758c;
        if (e()) {
            return aVar.f9759a;
        }
        Location b4 = b();
        if (b4 != null) {
            f(b4);
            return aVar.f9759a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i4 = Calendar.getInstance().get(11);
        return i4 < 6 || i4 >= 22;
    }

    public final boolean e() {
        return this.f9758c.f9764f > System.currentTimeMillis();
    }

    public final void f(Location location) {
        long j4;
        a aVar = this.f9758c;
        long currentTimeMillis = System.currentTimeMillis();
        h b4 = h.b();
        h hVar = b4;
        hVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j5 = b4.f9752a;
        hVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z4 = true;
        if (b4.f9754c != 1) {
            z4 = false;
        }
        boolean z5 = z4;
        long j6 = b4.f9753b;
        long j7 = j5;
        long j8 = b4.f9752a;
        long j9 = j6;
        boolean z6 = z5;
        b4.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j10 = b4.f9753b;
        if (j9 == -1 || j8 == -1) {
            j4 = 43200000 + currentTimeMillis;
        } else {
            j4 = (currentTimeMillis > j8 ? j10 : currentTimeMillis > j9 ? j8 : j9) + 60000;
        }
        aVar.f9759a = z6;
        aVar.f9760b = j7;
        aVar.f9761c = j9;
        aVar.f9762d = j8;
        aVar.f9763e = j10;
        aVar.f9764f = j4;
    }
}
