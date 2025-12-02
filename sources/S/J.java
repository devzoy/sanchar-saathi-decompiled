package S;

import android.animation.ValueAnimator;
import android.view.View;

public final /* synthetic */ class J implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ N f2636a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2637b;

    public /* synthetic */ J(N n4, View view) {
        this.f2636a = n4;
        this.f2637b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2636a.a(this.f2637b);
    }
}
