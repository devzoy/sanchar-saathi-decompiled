package p2;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import r2.C0917a;

public final class k implements C0917a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f11708a;

    public k(l lVar, Activity activity) {
        this.f11708a = activity;
    }

    public final void a(IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        this.f11708a.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
    }
}
