package w1;

import u1.c;
import z1.C1031n;

/* renamed from: w1.x  reason: case insensitive filesystem */
public final class C0990x {

    /* renamed from: a  reason: collision with root package name */
    public final C0969b f12644a;

    /* renamed from: b  reason: collision with root package name */
    public final c f12645b;

    public /* synthetic */ C0990x(C0969b bVar, c cVar, byte[] bArr) {
        this.f12644a = bVar;
        this.f12645b = cVar;
    }

    public final /* synthetic */ C0969b a() {
        return this.f12644a;
    }

    public final /* synthetic */ c b() {
        return this.f12645b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0990x) {
            C0990x xVar = (C0990x) obj;
            return C1031n.a(this.f12644a, xVar.f12644a) && C1031n.a(this.f12645b, xVar.f12645b);
        }
    }

    public final int hashCode() {
        return C1031n.b(this.f12644a, this.f12645b);
    }

    public final String toString() {
        return C1031n.c(this).a("key", this.f12644a).a("feature", this.f12645b).toString();
    }
}
