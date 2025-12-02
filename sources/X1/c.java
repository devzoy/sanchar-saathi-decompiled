package X1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public abstract class c extends CoordinatorLayout.b {

    /* renamed from: a  reason: collision with root package name */
    public d f3476a;

    /* renamed from: b  reason: collision with root package name */
    public int f3477b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f3478c = 0;

    public c() {
    }

    public int E() {
        d dVar = this.f3476a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    public void F(CoordinatorLayout coordinatorLayout, View view, int i4) {
        coordinatorLayout.G(view, i4);
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        F(coordinatorLayout, view, i4);
        if (this.f3476a == null) {
            this.f3476a = new d(view);
        }
        this.f3476a.c();
        this.f3476a.a();
        int i5 = this.f3477b;
        if (i5 != 0) {
            this.f3476a.e(i5);
            this.f3477b = 0;
        }
        int i6 = this.f3478c;
        if (i6 == 0) {
            return true;
        }
        this.f3476a.d(i6);
        this.f3478c = 0;
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
