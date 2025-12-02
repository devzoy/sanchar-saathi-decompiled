package androidx.core.app;

import F0.a;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f4964a = (IconCompat) aVar.v(remoteActionCompat.f4964a, 1);
        remoteActionCompat.f4965b = aVar.l(remoteActionCompat.f4965b, 2);
        remoteActionCompat.f4966c = aVar.l(remoteActionCompat.f4966c, 3);
        remoteActionCompat.f4967d = (PendingIntent) aVar.r(remoteActionCompat.f4967d, 4);
        remoteActionCompat.f4968e = aVar.h(remoteActionCompat.f4968e, 5);
        remoteActionCompat.f4969f = aVar.h(remoteActionCompat.f4969f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f4964a, 1);
        aVar.D(remoteActionCompat.f4965b, 2);
        aVar.D(remoteActionCompat.f4966c, 3);
        aVar.H(remoteActionCompat.f4967d, 4);
        aVar.z(remoteActionCompat.f4968e, 5);
        aVar.z(remoteActionCompat.f4969f, 6);
    }
}
