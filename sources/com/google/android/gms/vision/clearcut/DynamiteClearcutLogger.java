package com.google.android.gms.vision.clearcut;

import S1.d;
import U1.a;
import U1.b;
import android.content.Context;
import com.google.android.gms.internal.vision.C0491c;
import com.google.android.gms.internal.vision.C0528n0;
import com.google.android.gms.internal.vision.C0556x;
import java.util.concurrent.ExecutorService;

public class DynamiteClearcutLogger {
    private static final ExecutorService zza = C0491c.a().B(2, C0528n0.f7494a);
    private b zzb = new b(0.03333333333333333d);
    /* access modifiers changed from: private */
    public VisionClearcutLogger zzc;

    public DynamiteClearcutLogger(Context context) {
        this.zzc = new VisionClearcutLogger(context);
    }

    public final void zza(int i4, C0556x xVar) {
        if (i4 != 3 || this.zzb.a()) {
            zza.execute(new a(this, i4, xVar));
        } else {
            d.e("Skipping image analysis log due to rate limiting", new Object[0]);
        }
    }
}
