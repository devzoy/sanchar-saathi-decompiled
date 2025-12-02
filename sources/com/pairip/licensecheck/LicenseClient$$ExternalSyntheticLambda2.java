package com.pairip.licensecheck;

import com.pairip.licensecheck.LicenseClient;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class LicenseClient$$ExternalSyntheticLambda2 implements LicenseClient.ImmediateTaskExecutor {
    public final void run(Runnable runnable) {
        new Thread(runnable).start();
    }
}
