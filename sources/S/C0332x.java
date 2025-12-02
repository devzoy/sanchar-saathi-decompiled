package S;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: S.x  reason: case insensitive filesystem */
public final class C0332x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: c  reason: collision with root package name */
    public final View f2711c;

    /* renamed from: d  reason: collision with root package name */
    public ViewTreeObserver f2712d;

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f2713e;

    public C0332x(View view, Runnable runnable) {
        this.f2711c = view;
        this.f2712d = view.getViewTreeObserver();
        this.f2713e = runnable;
    }

    public static C0332x a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C0332x xVar = new C0332x(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(xVar);
            view.addOnAttachStateChangeListener(xVar);
            return xVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public void b() {
        if (this.f2712d.isAlive()) {
            this.f2712d.removeOnPreDrawListener(this);
        } else {
            this.f2711c.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f2711c.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f2713e.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f2712d = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
