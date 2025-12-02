package com.google.android.gms.internal.clearcut;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import t1.C0926a;
import t1.C0931f;
import v1.C0947a;
import v1.C0952f;
import v1.C0956j;

public final class L1 extends a {

    /* renamed from: p  reason: collision with root package name */
    public final C0931f f6825p;

    public L1(C0931f fVar, C0952f fVar2) {
        super(C0926a.f12035p, fVar2);
        this.f6825p = fVar;
    }

    public final /* synthetic */ C0956j b(Status status) {
        return status;
    }

    public final /* synthetic */ void i(C0947a.b bVar) {
        P1 p12 = (P1) bVar;
        O1 o12 = new O1(this);
        try {
            C0931f fVar = this.f6825p;
            fVar.getClass();
            M1 m12 = fVar.f12077m;
            int e4 = m12.e();
            byte[] bArr = new byte[e4];
            C0479y1.b(m12, bArr, 0, e4);
            fVar.f12070f = bArr;
            ((T1) p12.C()).i(o12, this.f6825p);
        } catch (RuntimeException e5) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e5);
            m(new Status(10, "MessageProducer"));
        }
    }
}
