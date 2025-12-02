package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.l  reason: case insensitive filesystem */
public final class C0439l extends C0418e {

    /* renamed from: m  reason: collision with root package name */
    public final Object f7118m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public String f7119n;

    /* renamed from: o  reason: collision with root package name */
    public Object f7120o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ C0445n f7121p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0439l(C0448o oVar, String str, Object obj, C0445n nVar) {
        super(oVar, str, obj, (C0430i) null);
        this.f7121p = nVar;
    }

    public final Object f(SharedPreferences sharedPreferences) {
        try {
            return m(sharedPreferences.getString(this.f7061b, ""));
        } catch (ClassCastException e4) {
            String valueOf = String.valueOf(this.f7061b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid byte[] value in SharedPreferences for ".concat(valueOf) : new String("Invalid byte[] value in SharedPreferences for "), e4);
            return null;
        }
    }

    public final Object m(String str) {
        Object obj;
        try {
            synchronized (this.f7118m) {
                if (!str.equals(this.f7119n)) {
                    Object a4 = this.f7121p.a(Base64.decode(str, 3));
                    this.f7119n = str;
                    this.f7120o = a4;
                }
                obj = this.f7120o;
            }
            return obj;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.f7061b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 27 + String.valueOf(str).length());
            sb.append("Invalid byte[] value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
