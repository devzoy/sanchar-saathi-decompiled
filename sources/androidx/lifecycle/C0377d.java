package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import v3.l;

/* renamed from: androidx.lifecycle.d  reason: case insensitive filesystem */
public abstract class C0377d implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        l.e(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        l.e(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        l.e(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        l.e(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        l.e(activity, "activity");
        l.e(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        l.e(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        l.e(activity, "activity");
    }
}
