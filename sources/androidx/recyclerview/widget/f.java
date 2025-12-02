package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5994a = true;

    /* renamed from: b  reason: collision with root package name */
    public int f5995b;

    /* renamed from: c  reason: collision with root package name */
    public int f5996c;

    /* renamed from: d  reason: collision with root package name */
    public int f5997d;

    /* renamed from: e  reason: collision with root package name */
    public int f5998e;

    /* renamed from: f  reason: collision with root package name */
    public int f5999f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f6000g = 0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6001h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6002i;

    public boolean a(RecyclerView.z zVar) {
        int i4 = this.f5996c;
        return i4 >= 0 && i4 < zVar.b();
    }

    public View b(RecyclerView.u uVar) {
        View o4 = uVar.o(this.f5996c);
        this.f5996c += this.f5997d;
        return o4;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f5995b + ", mCurrentPosition=" + this.f5996c + ", mItemDirection=" + this.f5997d + ", mLayoutDirection=" + this.f5998e + ", mStartLine=" + this.f5999f + ", mEndLine=" + this.f6000g + '}';
    }
}
