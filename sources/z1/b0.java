package z1;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

public final class b0 implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c0 f12909a;

    public /* synthetic */ b0(c0 c0Var, byte[] bArr) {
        Objects.requireNonNull(c0Var);
        this.f12909a = c0Var;
    }

    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 0) {
            c0 c0Var = this.f12909a;
            synchronized (c0Var.f()) {
                try {
                    Z z4 = (Z) message.obj;
                    a0 a0Var = (a0) c0Var.f().get(z4);
                    if (a0Var != null && a0Var.g()) {
                        if (a0Var.d()) {
                            a0Var.a("GmsClientSupervisor");
                        }
                        c0Var.f().remove(z4);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } else if (i4 != 1) {
            return false;
        } else {
            c0 c0Var2 = this.f12909a;
            synchronized (c0Var2.f()) {
                try {
                    Z z5 = (Z) message.obj;
                    a0 a0Var2 = (a0) c0Var2.f().get(z5);
                    if (a0Var2 != null && a0Var2.e() == 3) {
                        String valueOf = String.valueOf(z5);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                        sb.append("Timeout waiting for ServiceConnection callback ");
                        sb.append(valueOf);
                        Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                        ComponentName i5 = a0Var2.i();
                        if (i5 == null) {
                            i5 = z5.c();
                        }
                        if (i5 == null) {
                            String b4 = z5.b();
                            C1032o.f(b4);
                            i5 = new ComponentName(b4, "unknown");
                        }
                        a0Var2.onServiceDisconnected(i5);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }
}
