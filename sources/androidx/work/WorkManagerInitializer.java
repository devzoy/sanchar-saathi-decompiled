package androidx.work;

import B0.b;
import Q0.i;
import Q0.t;
import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6079a = i.i("WrkMgrInitializer");

    public List a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public t b(Context context) {
        i.e().a(f6079a, "Initializing WorkManager with default configuration.");
        t.e(context, new a.b().a());
        return t.d(context);
    }
}
