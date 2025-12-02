package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import v3.l;

/* renamed from: androidx.lifecycle.h  reason: case insensitive filesystem */
public final class C0381h {

    /* renamed from: a  reason: collision with root package name */
    public static final C0381h f5383a = new C0381h();

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f5384b = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.h$a */
    public static final class a extends C0377d {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            l.e(activity, "activity");
            x.f5434d.c(activity);
        }
    }

    public static final void a(Context context) {
        l.e(context, "context");
        if (!f5384b.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            l.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
        }
    }
}
