package R0;

import Z0.u;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.Set;

public final /* synthetic */ class H implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f2462e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ u f2463f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ u f2464g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ List f2465h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f2466i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Set f2467j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f2468k;

    public /* synthetic */ H(WorkDatabase workDatabase, u uVar, u uVar2, List list, String str, Set set, boolean z4) {
        this.f2462e = workDatabase;
        this.f2463f = uVar;
        this.f2464g = uVar2;
        this.f2465h = list;
        this.f2466i = str;
        this.f2467j = set;
        this.f2468k = z4;
    }

    public final void run() {
        I.g(this.f2462e, this.f2463f, this.f2464g, this.f2465h, this.f2466i, this.f2467j, this.f2468k);
    }
}
