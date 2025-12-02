package z1;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import w1.C0975h;

/* renamed from: z1.z  reason: case insensitive filesystem */
public abstract class C1042z implements DialogInterface.OnClickListener {
    public static C1042z b(Activity activity, Intent intent, int i4) {
        return new C1040x(intent, activity, i4);
    }

    public static C1042z c(C0975h hVar, Intent intent, int i4) {
        return new C1041y(intent, hVar, 2);
    }

    public abstract void a();

    public final void onClick(DialogInterface dialogInterface, int i4) {
        try {
            a();
        } catch (ActivityNotFoundException e4) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e4);
        } catch (Throwable th) {
            dialogInterface.dismiss();
            throw th;
        }
        dialogInterface.dismiss();
    }
}
