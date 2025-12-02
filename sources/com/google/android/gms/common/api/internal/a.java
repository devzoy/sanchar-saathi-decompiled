package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import v1.C0947a;
import v1.C0952f;
import v1.C0956j;
import z1.C1032o;

public abstract class a extends BasePendingResult {

    /* renamed from: n  reason: collision with root package name */
    public final C0947a.c f6662n;

    /* renamed from: o  reason: collision with root package name */
    public final C0947a f6663o;

    public a(C0947a aVar, C0952f fVar) {
        super((C0952f) C1032o.g(fVar, "GoogleApiClient must not be null"));
        C1032o.g(aVar, "Api must not be null");
        this.f6662n = aVar.b();
        this.f6663o = aVar;
    }

    public abstract void i(C0947a.b bVar);

    public void j(C0956j jVar) {
    }

    public final void k(C0947a.b bVar) {
        try {
            i(bVar);
        } catch (DeadObjectException e4) {
            l(e4);
            throw e4;
        } catch (RemoteException e5) {
            l(e5);
        }
    }

    public final void l(RemoteException remoteException) {
        m(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    public final void m(Status status) {
        C1032o.b(!status.i(), "Failed result must not be success");
        C0956j b4 = b(status);
        e(b4);
        j(b4);
    }
}
