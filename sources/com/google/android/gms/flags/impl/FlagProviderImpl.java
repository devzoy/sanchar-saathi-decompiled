package com.google.android.gms.flags.impl;

import F1.a;
import H1.g;
import I1.b;
import I1.d;
import I1.f;
import I1.h;
import I1.j;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;

public class FlagProviderImpl extends g {

    /* renamed from: c  reason: collision with root package name */
    public boolean f6700c = false;

    /* renamed from: d  reason: collision with root package name */
    public SharedPreferences f6701d;

    public boolean getBooleanFlagValue(String str, boolean z4, int i4) {
        return !this.f6700c ? z4 : b.a(this.f6701d, str, Boolean.valueOf(z4)).booleanValue();
    }

    public int getIntFlagValue(String str, int i4, int i5) {
        return !this.f6700c ? i4 : d.a(this.f6701d, str, Integer.valueOf(i4)).intValue();
    }

    public long getLongFlagValue(String str, long j4, int i4) {
        return !this.f6700c ? j4 : f.a(this.f6701d, str, Long.valueOf(j4)).longValue();
    }

    public String getStringFlagValue(String str, String str2, int i4) {
        return !this.f6700c ? str2 : h.a(this.f6701d, str, str2);
    }

    public void init(a aVar) {
        Context context = (Context) F1.b.J(aVar);
        if (!this.f6700c) {
            try {
                this.f6701d = j.a(context.createPackageContext("com.google.android.gms", 0));
                this.f6700c = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e4) {
                String valueOf = String.valueOf(e4.getMessage());
                Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
            }
        }
    }
}
