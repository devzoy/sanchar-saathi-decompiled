package z1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;
import u1.C0941a;
import z1.C1021d;

public final class T extends I {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f12890g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C1021d f12891h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public T(C1021d dVar, int i4, IBinder iBinder, Bundle bundle) {
        super(dVar, i4, bundle);
        Objects.requireNonNull(dVar);
        this.f12891h = dVar;
        this.f12890g = iBinder;
    }

    public final boolean e() {
        try {
            IBinder iBinder = this.f12890g;
            C1032o.f(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            C1021d dVar = this.f12891h;
            if (!dVar.D().equals(interfaceDescriptor)) {
                String D4 = dVar.D();
                StringBuilder sb = new StringBuilder(String.valueOf(D4).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(D4);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface r4 = dVar.r(this.f12890g);
            if (r4 == null || (!dVar.W(2, 4, r4) && !dVar.W(3, 4, r4))) {
                return false;
            }
            dVar.f0((C0941a) null);
            C1021d.a c02 = dVar.c0();
            Bundle w4 = dVar.w();
            if (c02 == null) {
                return true;
            }
            dVar.c0().onConnected(w4);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    public final void f(C0941a aVar) {
        C1021d dVar = this.f12891h;
        if (dVar.d0() != null) {
            dVar.d0().onConnectionFailed(aVar);
        }
        dVar.K(aVar);
    }
}
