package w1;

import android.util.Log;
import java.util.Objects;
import u1.C0941a;
import z1.C1027j;

/* renamed from: w1.y  reason: case insensitive filesystem */
public final class C0991y implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0941a f12646e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0992z f12647f;

    public C0991y(C0992z zVar, C0941a aVar) {
        this.f12646e = aVar;
        Objects.requireNonNull(zVar);
        this.f12647f = zVar;
    }

    public final void run() {
        C0992z zVar = this.f12647f;
        C0989w wVar = (C0989w) zVar.f12653f.c().get(zVar.g());
        if (wVar != null) {
            if (this.f12646e.i()) {
                zVar.h(true);
                if (!zVar.f().o()) {
                    try {
                        zVar.f().p((C1027j) null, zVar.f().c());
                    } catch (SecurityException e4) {
                        Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                        this.f12647f.f().e("Failed to get service from broker.");
                        wVar.q(new C0941a(10), (Exception) null);
                    }
                } else {
                    zVar.e();
                }
            } else {
                wVar.q(this.f12646e, (Exception) null);
            }
        }
    }
}
