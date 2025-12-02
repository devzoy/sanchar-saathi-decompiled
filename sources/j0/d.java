package j0;

import android.view.ViewGroup;
import i0.C0695p;
import v3.l;

public final class d extends g {

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f10825f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(C0695p pVar, ViewGroup viewGroup) {
        super(pVar, "Attempting to use <fragment> tag to add fragment " + pVar + " to container " + viewGroup);
        l.e(pVar, "fragment");
        this.f10825f = viewGroup;
    }
}
