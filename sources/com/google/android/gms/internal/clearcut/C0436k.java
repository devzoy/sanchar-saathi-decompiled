package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.clearcut.k  reason: case insensitive filesystem */
public final class C0436k extends C0418e {
    public C0436k(C0448o oVar, String str, String str2) {
        super(oVar, str, str2, (C0430i) null);
    }

    public final /* synthetic */ Object m(String str) {
        return str;
    }

    /* renamed from: r */
    public final String f(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.f7061b, (String) null);
        } catch (ClassCastException e4) {
            String valueOf = String.valueOf(this.f7061b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid string value in SharedPreferences for ".concat(valueOf) : new String("Invalid string value in SharedPreferences for "), e4);
            return null;
        }
    }
}
