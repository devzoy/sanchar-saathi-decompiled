package com.pairip.licensecheck;

import android.app.PendingIntent;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class LicenseActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ LicenseActivity f$0;
    public final /* synthetic */ PendingIntent f$1;

    public /* synthetic */ LicenseActivity$$ExternalSyntheticLambda0(LicenseActivity licenseActivity, PendingIntent pendingIntent) {
        this.f$0 = licenseActivity;
        this.f$1 = pendingIntent;
    }

    public final void run() {
        this.f$0.lambda$showPaywallAndCloseApp$0(this.f$1);
    }
}
