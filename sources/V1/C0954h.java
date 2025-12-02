package v1;

import com.google.android.gms.common.api.Status;
import w1.C0980m;
import z1.C1032o;

/* renamed from: v1.h  reason: case insensitive filesystem */
public abstract class C0954h {
    public static C0953g a(Status status, C0952f fVar) {
        C1032o.g(status, "Result must not be null");
        C0980m mVar = new C0980m(fVar);
        mVar.e(status);
        return mVar;
    }
}
