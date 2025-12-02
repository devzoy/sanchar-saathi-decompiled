package w1;

import R1.g;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import u1.c;

public final class Q extends H {

    /* renamed from: b  reason: collision with root package name */
    public final C0981n f12554b;

    /* renamed from: c  reason: collision with root package name */
    public final g f12555c;

    /* renamed from: d  reason: collision with root package name */
    public final C0979l f12556d;

    public Q(int i4, C0981n nVar, g gVar, C0979l lVar) {
        super(i4);
        this.f12555c = gVar;
        this.f12554b = nVar;
        this.f12556d = lVar;
        if (i4 == 2 && nVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        this.f12555c.c(this.f12556d.a(status));
    }

    public final void b(Exception exc) {
        this.f12555c.c(exc);
    }

    public final void c(C0982o oVar, boolean z4) {
        oVar.b(this.f12555c, z4);
    }

    public final void d(C0989w wVar) {
        try {
            this.f12554b.b(wVar.t(), this.f12555c);
        } catch (DeadObjectException e4) {
            throw e4;
        } catch (RemoteException e5) {
            a(T.e(e5));
        } catch (RuntimeException e6) {
            this.f12555c.c(e6);
        }
    }

    public final c[] f(C0989w wVar) {
        return this.f12554b.d();
    }

    public final boolean g(C0989w wVar) {
        return this.f12554b.c();
    }
}
