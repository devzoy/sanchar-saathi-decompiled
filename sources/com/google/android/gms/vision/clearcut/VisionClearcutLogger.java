package com.google.android.gms.vision.clearcut;

import S1.d;
import android.content.Context;
import com.google.android.gms.internal.vision.A0;
import com.google.android.gms.internal.vision.C0503f;
import com.google.android.gms.internal.vision.C0556x;
import t1.C0926a;

public class VisionClearcutLogger {
    private final C0926a zza;
    private boolean zzb = true;

    public VisionClearcutLogger(Context context) {
        this.zza = new C0926a(context, "VISION", (String) null);
    }

    public final void zza(int i4, C0556x xVar) {
        byte[] j4 = xVar.j();
        if (i4 < 0 || i4 > 3) {
            d.d("Illegal event code: %d", Integer.valueOf(i4));
            return;
        }
        try {
            if (this.zzb) {
                this.zza.a(j4).b(i4).a();
                return;
            }
            C0556x.a w4 = C0556x.w();
            try {
                w4.l(j4, 0, j4.length, A0.c());
                d.b("Would have logged:\n%s", w4.toString());
            } catch (Exception e4) {
                d.c(e4, "Parsing error", new Object[0]);
            }
        } catch (Exception e5) {
            C0503f.b(e5);
            d.c(e5, "Failed to log", new Object[0]);
        }
    }
}
