package w1;

import android.util.Log;
import java.util.Objects;
import java.util.Set;
import u1.C0941a;
import v1.C0947a;
import z1.C1021d;
import z1.C1027j;

/* renamed from: w1.z  reason: case insensitive filesystem */
public final class C0992z implements C1021d.c, L {

    /* renamed from: a  reason: collision with root package name */
    public final C0947a.f f12648a;

    /* renamed from: b  reason: collision with root package name */
    public final C0969b f12649b;

    /* renamed from: c  reason: collision with root package name */
    public C1027j f12650c = null;

    /* renamed from: d  reason: collision with root package name */
    public Set f12651d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12652e = false;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0972e f12653f;

    public C0992z(C0972e eVar, C0947a.f fVar, C0969b bVar) {
        Objects.requireNonNull(eVar);
        this.f12653f = eVar;
        this.f12648a = fVar;
        this.f12649b = bVar;
    }

    public final void a(C0941a aVar) {
        this.f12653f.f().post(new C0991y(this, aVar));
    }

    public final void b(C0941a aVar) {
        C0989w wVar = (C0989w) this.f12653f.c().get(this.f12649b);
        if (wVar != null) {
            wVar.p(aVar);
        }
    }

    public final void c(int i4) {
        C0989w wVar = (C0989w) this.f12653f.c().get(this.f12649b);
        if (wVar == null) {
            return;
        }
        if (wVar.b()) {
            wVar.p(new C0941a(17));
        } else {
            wVar.onConnectionSuspended(i4);
        }
    }

    public final void d(C1027j jVar, Set set) {
        if (jVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new C0941a(4));
            return;
        }
        this.f12650c = jVar;
        this.f12651d = set;
        e();
    }

    public final /* synthetic */ C0947a.f f() {
        return this.f12648a;
    }

    public final /* synthetic */ C0969b g() {
        return this.f12649b;
    }

    public final /* synthetic */ void h(boolean z4) {
        this.f12652e = true;
    }

    /* renamed from: i */
    public final void e() {
        C1027j jVar;
        if (this.f12652e && (jVar = this.f12650c) != null) {
            this.f12648a.p(jVar, this.f12651d);
        }
    }
}
