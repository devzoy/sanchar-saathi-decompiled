package z1;

import android.os.Bundle;
import java.util.Objects;
import u1.C0941a;

public abstract class I extends P {

    /* renamed from: d  reason: collision with root package name */
    public final int f12872d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f12873e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C1021d f12874f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public I(C1021d dVar, int i4, Bundle bundle) {
        super(dVar, Boolean.TRUE);
        Objects.requireNonNull(dVar);
        this.f12874f = dVar;
        this.f12872d = i4;
        this.f12873e = bundle;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            int r4 = r3.f12872d
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L_0x001e
            boolean r4 = r3.e()
            if (r4 != 0) goto L_0x001d
            z1.d r4 = r3.f12874f
            r4.V(r0, r1)
            u1.a r4 = new u1.a
            r0 = 8
            r4.<init>(r0, r1)
            r3.f(r4)
        L_0x001d:
            return
        L_0x001e:
            z1.d r2 = r3.f12874f
            r2.V(r0, r1)
            android.os.Bundle r0 = r3.f12873e
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = "pendingIntent"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            r1 = r0
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x0030:
            u1.a r0 = new u1.a
            r0.<init>(r4, r1)
            r3.f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.I.a(java.lang.Object):void");
    }

    public abstract boolean e();

    public abstract void f(C0941a aVar);
}
