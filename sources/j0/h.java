package j0;

import android.view.ViewGroup;
import i0.C0695p;
import v3.l;

public final class h extends g {

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f10827f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(C0695p pVar, ViewGroup viewGroup) {
        super(pVar, "Attempting to add fragment " + pVar + " to container " + viewGroup + " which is not a FragmentContainerView");
        l.e(pVar, "fragment");
        l.e(viewGroup, "container");
        this.f10827f = viewGroup;
    }
}
