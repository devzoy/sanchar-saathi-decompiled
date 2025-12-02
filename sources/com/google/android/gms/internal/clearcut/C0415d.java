package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.clearcut.d  reason: case insensitive filesystem */
public final class C0415d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0412c f7051a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0415d(C0412c cVar, Handler handler) {
        super((Handler) null);
        this.f7051a = cVar;
    }

    public final void onChange(boolean z4) {
        this.f7051a.d();
        this.f7051a.f();
    }
}
