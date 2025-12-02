package w1;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class T {

    /* renamed from: a  reason: collision with root package name */
    public final int f12557a;

    public T(int i4) {
        this.f12557a = i4;
    }

    public static /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(C0982o oVar, boolean z4);

    public abstract void d(C0989w wVar);
}
