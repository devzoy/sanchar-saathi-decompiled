package j0;

import i0.C0695p;
import v3.l;

/* renamed from: j0.a  reason: case insensitive filesystem */
public final class C0755a extends g {

    /* renamed from: f  reason: collision with root package name */
    public final String f10806f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0755a(C0695p pVar, String str) {
        super(pVar, "Attempting to reuse fragment " + pVar + " with previous ID " + str);
        l.e(pVar, "fragment");
        l.e(str, "previousFragmentId");
        this.f10806f = str;
    }
}
