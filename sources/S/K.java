package S;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class K {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f2638a;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ L f2639a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f2640b;

        public a(L l4, View view) {
            this.f2639a = l4;
            this.f2640b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f2639a.a(this.f2640b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f2639a.b(this.f2640b);
        }

        public void onAnimationStart(Animator animator) {
            this.f2639a.c(this.f2640b);
        }
    }

    public K(View view) {
        this.f2638a = new WeakReference(view);
    }

    public K b(float f4) {
        View view = (View) this.f2638a.get();
        if (view != null) {
            view.animate().alpha(f4);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f2638a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f2638a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public K f(long j4) {
        View view = (View) this.f2638a.get();
        if (view != null) {
            view.animate().setDuration(j4);
        }
        return this;
    }

    public K g(Interpolator interpolator) {
        View view = (View) this.f2638a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public K h(L l4) {
        View view = (View) this.f2638a.get();
        if (view != null) {
            i(view, l4);
        }
        return this;
    }

    public final void i(View view, L l4) {
        if (l4 != null) {
            view.animate().setListener(new a(l4, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public K j(long j4) {
        View view = (View) this.f2638a.get();
        if (view != null) {
            view.animate().setStartDelay(j4);
        }
        return this;
    }

    public K k(N n4) {
        View view = (View) this.f2638a.get();
        if (view != null) {
            view.animate().setUpdateListener(n4 != null ? new J(n4, view) : null);
        }
        return this;
    }

    public void l() {
        View view = (View) this.f2638a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public K m(float f4) {
        View view = (View) this.f2638a.get();
        if (view != null) {
            view.animate().translationY(f4);
        }
        return this;
    }
}
