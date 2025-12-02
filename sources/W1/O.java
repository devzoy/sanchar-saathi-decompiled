package w1;

import R1.g;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import v1.C0948b;

public abstract class O extends H {

    /* renamed from: b  reason: collision with root package name */
    public final g f12552b;

    public O(int i4, g gVar) {
        super(i4);
        this.f12552b = gVar;
    }

    public final void a(Status status) {
        this.f12552b.c(new C0948b(status));
    }

    public final void b(Exception exc) {
        this.f12552b.c(exc);
    }

    public final void d(C0989w wVar) {
        try {
            h(wVar);
        } catch (DeadObjectException e4) {
            a(T.e(e4));
            throw e4;
        } catch (RemoteException e5) {
            a(T.e(e5));
        } catch (RuntimeException e6) {
            this.f12552b.c(e6);
        }
    }

    public abstract void h(C0989w wVar);
}
