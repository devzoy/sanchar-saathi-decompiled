package w1;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Objects;
import v1.C0953g;

public final class a0 implements C0953g.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f12568a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0982o f12569b;

    public a0(C0982o oVar, BasePendingResult basePendingResult) {
        this.f12568a = basePendingResult;
        Objects.requireNonNull(oVar);
        this.f12569b = oVar;
    }

    public final void a(Status status) {
        this.f12569b.f().remove(this.f12568a);
    }
}
