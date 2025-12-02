package com.google.android.gms.internal.clearcut;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.clearcut.o  reason: case insensitive filesystem */
public final class C0448o {

    /* renamed from: a  reason: collision with root package name */
    public final String f7146a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f7147b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7148c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7149d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7150e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7151f;

    public C0448o(Uri uri) {
        this((String) null, uri, "", "", false, false);
    }

    public final C0418e a(String str, Object obj, C0445n nVar) {
        return C0418e.c(this, str, obj, nVar);
    }

    public final C0418e b(String str, String str2) {
        return C0418e.d(this, str, (String) null);
    }

    public final C0418e e(String str, boolean z4) {
        return C0418e.e(this, str, false);
    }

    public final C0448o f(String str) {
        boolean z4 = this.f7150e;
        if (!z4) {
            return new C0448o(this.f7146a, this.f7147b, str, this.f7149d, z4, this.f7151f);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final C0448o h(String str) {
        return new C0448o(this.f7146a, this.f7147b, this.f7148c, str, this.f7150e, this.f7151f);
    }

    public C0448o(String str, Uri uri, String str2, String str3, boolean z4, boolean z5) {
        this.f7146a = str;
        this.f7147b = uri;
        this.f7148c = str2;
        this.f7149d = str3;
        this.f7150e = z4;
        this.f7151f = z5;
    }
}
