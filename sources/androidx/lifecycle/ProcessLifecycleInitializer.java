package androidx.lifecycle;

import B0.a;
import B0.b;
import android.content.Context;
import androidx.lifecycle.v;
import i3.C0738o;
import java.util.List;
import v3.l;

public final class ProcessLifecycleInitializer implements b {
    public List a() {
        return C0738o.h();
    }

    /* renamed from: c */
    public C0384k b(Context context) {
        l.e(context, "context");
        a d4 = a.d(context);
        l.d(d4, "getInstance(context)");
        if (d4.e(ProcessLifecycleInitializer.class)) {
            C0381h.a(context);
            v.b bVar = v.f5420k;
            bVar.b(context);
            return bVar.a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }
}
