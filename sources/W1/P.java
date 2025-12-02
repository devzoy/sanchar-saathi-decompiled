package w1;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import z1.C1032o;

public final class P extends T {

    /* renamed from: b  reason: collision with root package name */
    public final a f12553b;

    public P(int i4, a aVar) {
        super(i4);
        this.f12553b = (a) C1032o.g(aVar, "Null methods are not runnable.");
    }

    public final void a(Status status) {
        try {
            this.f12553b.m(status);
        } catch (IllegalStateException e4) {
            Log.w("ApiCallRunner", "Exception reporting failure", e4);
        }
    }

    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.f12553b.m(new Status(10, sb.toString()));
        } catch (IllegalStateException e4) {
            Log.w("ApiCallRunner", "Exception reporting failure", e4);
        }
    }

    public final void c(C0982o oVar, boolean z4) {
        oVar.a(this.f12553b, z4);
    }

    public final void d(C0989w wVar) {
        try {
            this.f12553b.k(wVar.t());
        } catch (RuntimeException e4) {
            b(e4);
        }
    }
}
