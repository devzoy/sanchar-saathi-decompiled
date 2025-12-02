package i1;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.util.List;

public final class w {

    public interface a {
        void a(int i4);
    }

    public void a(int i4, Context context, a aVar, C0706b bVar) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            bVar.a("PermissionHandler.ServiceManager", "Android context cannot be null.");
        } else if (i4 == 3 || i4 == 4 || i4 == 5) {
            aVar.a(d(context) ? 1 : 0);
        } else if (i4 == 21) {
            aVar.a(c(context) ? 1 : 0);
        } else if (i4 == 8) {
            PackageManager packageManager = context.getPackageManager();
            if (!packageManager.hasSystemFeature("android.hardware.telephony")) {
                aVar.a(2);
                return;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null || telephonyManager.getPhoneType() == 0) {
                aVar.a(2);
            } else if (b(packageManager).isEmpty()) {
                aVar.a(2);
            } else if (telephonyManager.getSimState() != 5) {
                aVar.a(0);
            } else {
                aVar.a(1);
            }
        } else if (i4 == 16) {
            aVar.a(1);
        } else {
            aVar.a(2);
        }
    }

    public final List b(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:123123"));
        return Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0)) : packageManager.queryIntentActivities(intent, 0);
    }

    public final boolean c(Context context) {
        return ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isEnabled();
    }

    public final boolean d(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
        if (locationManager == null) {
            return false;
        }
        return locationManager.isLocationEnabled();
    }
}
