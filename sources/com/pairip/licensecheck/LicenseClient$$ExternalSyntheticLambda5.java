package com.pairip.licensecheck;

import android.os.IBinder;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class LicenseClient$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ LicenseClient f$0;
    public final /* synthetic */ IBinder f$1;

    public /* synthetic */ LicenseClient$$ExternalSyntheticLambda5(LicenseClient licenseClient, IBinder iBinder) {
        this.f$0 = licenseClient;
        this.f$1 = iBinder;
    }

    public final void run() {
        this.f$0.lambda$onServiceConnected$0(this.f$1);
    }
}
