package j0;

import i0.C0695p;
import v3.l;

public final class i extends g {

    /* renamed from: f  reason: collision with root package name */
    public final C0695p f10828f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10829g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(C0695p pVar, C0695p pVar2, int i4) {
        super(pVar, "Attempting to nest fragment " + pVar + " within the view of parent fragment " + pVar2 + " via container with ID " + i4 + " without using parent's childFragmentManager");
        l.e(pVar, "fragment");
        l.e(pVar2, "expectedParentFragment");
        this.f10828f = pVar2;
        this.f10829g = i4;
    }
}
