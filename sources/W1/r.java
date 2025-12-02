package w1;

import java.util.Objects;
import w1.C0970c;

public final class r implements C0970c.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0972e f12625a;

    public r(C0972e eVar) {
        Objects.requireNonNull(eVar);
        this.f12625a = eVar;
    }

    public final void a(boolean z4) {
        Boolean valueOf = Boolean.valueOf(z4);
        C0972e eVar = this.f12625a;
        eVar.f().sendMessage(eVar.f().obtainMessage(1, valueOf));
    }
}
