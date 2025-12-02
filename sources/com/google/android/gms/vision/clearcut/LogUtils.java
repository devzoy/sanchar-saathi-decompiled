package com.google.android.gms.vision.clearcut;

import E1.d;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.vision.C0515j;
import com.google.android.gms.internal.vision.C0530o;
import com.google.android.gms.internal.vision.C0541s;
import com.google.android.gms.internal.vision.C0553w;
import com.google.android.gms.internal.vision.C0556x;
import com.google.android.gms.internal.vision.C2;
import com.google.android.gms.internal.vision.N0;
import com.google.android.gms.internal.vision.r;
import java.util.ArrayList;
import java.util.List;

public class LogUtils {
    public static C0556x zza(long j4, int i4, String str, String str2, List<C0553w> list, C2 c22) {
        r.a w4 = r.w();
        C0530o.b w5 = C0530o.w().v(str2).t(j4).w((long) i4);
        w5.u(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((C0530o) ((N0) w5.s()));
        return (C0556x) ((N0) C0556x.w().t((r) ((N0) w4.u(arrayList).t((C0541s) ((N0) C0541s.w().u((long) c22.f7200f).t((long) c22.f7199e).v((long) c22.f7201g).w(c22.f7202h).s())).s())).s());
    }

    private static String zzb(Context context) {
        try {
            return d.a(context).d(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e4) {
            S1.d.c(e4, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static C0515j zza(Context context) {
        C0515j.a t4 = C0515j.w().t(context.getPackageName());
        String zzb = zzb(context);
        if (zzb != null) {
            t4.u(zzb);
        }
        return (C0515j) ((N0) t4.s());
    }
}
