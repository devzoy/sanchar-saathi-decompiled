package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.clearcut.j  reason: case insensitive filesystem */
public final class C0433j extends C0418e {
    public C0433j(C0448o oVar, String str, Boolean bool) {
        super(oVar, str, bool, (C0430i) null);
    }

    public final /* synthetic */ Object m(String str) {
        if (Z1.f7003c.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (Z1.f7004d.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        String str2 = this.f7061b;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(str).length());
        sb.append("Invalid boolean value for ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }

    /* renamed from: r */
    public final Boolean f(SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.f7061b, false));
        } catch (ClassCastException e4) {
            String valueOf = String.valueOf(this.f7061b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid boolean value in SharedPreferences for ".concat(valueOf) : new String("Invalid boolean value in SharedPreferences for "), e4);
            return null;
        }
    }
}
