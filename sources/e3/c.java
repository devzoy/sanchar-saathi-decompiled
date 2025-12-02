package E3;

import D3.Q;
import D3.V;
import D3.t0;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import l3.i;
import v3.g;
import v3.l;

public final class c extends d implements Q {
    private volatile c _immediate;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f936g;

    /* renamed from: h  reason: collision with root package name */
    public final String f937h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f938i;

    /* renamed from: j  reason: collision with root package name */
    public final c f939j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Handler handler, String str, boolean z4) {
        super((g) null);
        c cVar = null;
        this.f936g = handler;
        this.f937h = str;
        this.f938i = z4;
        this._immediate = z4 ? this : cVar;
        c cVar2 = this._immediate;
        if (cVar2 == null) {
            cVar2 = new c(handler, str, true);
            this._immediate = cVar2;
        }
        this.f939j = cVar2;
    }

    public void K(i iVar, Runnable runnable) {
        if (!this.f936g.post(runnable)) {
            P(iVar, runnable);
        }
    }

    public boolean L(i iVar) {
        return !this.f938i || !l.a(Looper.myLooper(), this.f936g.getLooper());
    }

    public final void P(i iVar, Runnable runnable) {
        t0.c(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        V.b().K(iVar, runnable);
    }

    /* renamed from: Q */
    public c N() {
        return this.f939j;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f936g == this.f936g;
    }

    public int hashCode() {
        return System.identityHashCode(this.f936g);
    }

    public String toString() {
        String O4 = O();
        if (O4 != null) {
            return O4;
        }
        String str = this.f937h;
        if (str == null) {
            str = this.f936g.toString();
        }
        if (!this.f938i) {
            return str;
        }
        return str + ".immediate";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Handler handler, String str, int i4, g gVar) {
        this(handler, (i4 & 2) != 0 ? null : str);
    }

    public c(Handler handler, String str) {
        this(handler, str, false);
    }
}
