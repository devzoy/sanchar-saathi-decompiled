package w1;

import v1.C0947a;
import z1.C1031n;

/* renamed from: w1.b  reason: case insensitive filesystem */
public final class C0969b {

    /* renamed from: a  reason: collision with root package name */
    public final int f12570a;

    /* renamed from: b  reason: collision with root package name */
    public final C0947a f12571b;

    /* renamed from: c  reason: collision with root package name */
    public final C0947a.d f12572c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12573d;

    public C0969b(C0947a aVar, C0947a.d dVar, String str) {
        this.f12571b = aVar;
        this.f12572c = dVar;
        this.f12573d = str;
        this.f12570a = C1031n.b(aVar, dVar, str);
    }

    public static C0969b a(C0947a aVar, C0947a.d dVar, String str) {
        return new C0969b(aVar, dVar, str);
    }

    public final String b() {
        return this.f12571b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0969b)) {
            return false;
        }
        C0969b bVar = (C0969b) obj;
        return C1031n.a(this.f12571b, bVar.f12571b) && C1031n.a(this.f12572c, bVar.f12572c) && C1031n.a(this.f12573d, bVar.f12573d);
    }

    public final int hashCode() {
        return this.f12570a;
    }
}
