package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

public final class a2 extends ContentObserver {
    public a2(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z4) {
        Z1.f7005e.set(true);
    }
}
