package io.flutter.plugin.platform;

import M2.b;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public abstract class z implements WindowManager {

    /* renamed from: c  reason: collision with root package name */
    public final WindowManager f10602c;

    /* renamed from: d  reason: collision with root package name */
    public u f10603d;

    public z(WindowManager windowManager, u uVar) {
        this.f10602c = windowManager;
        this.f10603d = uVar;
    }

    public void addCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f10602c.addCrossWindowBlurEnabledListener(consumer);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        u uVar = this.f10603d;
        if (uVar == null) {
            b.g("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            uVar.addView(view, layoutParams);
        }
    }

    public WindowMetrics getCurrentWindowMetrics() {
        return this.f10602c.getCurrentWindowMetrics();
    }

    public Display getDefaultDisplay() {
        return this.f10602c.getDefaultDisplay();
    }

    public WindowMetrics getMaximumWindowMetrics() {
        return this.f10602c.getMaximumWindowMetrics();
    }

    public boolean isCrossWindowBlurEnabled() {
        return this.f10602c.isCrossWindowBlurEnabled();
    }

    public void removeCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f10602c.removeCrossWindowBlurEnabledListener(consumer);
    }

    public void removeView(View view) {
        u uVar = this.f10603d;
        if (uVar == null) {
            b.g("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            uVar.removeView(view);
        }
    }

    public void removeViewImmediate(View view) {
        if (this.f10603d == null) {
            b.g("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
            return;
        }
        view.clearAnimation();
        this.f10603d.removeView(view);
    }

    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        u uVar = this.f10603d;
        if (uVar == null) {
            b.g("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            uVar.updateViewLayout(view, layoutParams);
        }
    }

    public void addCrossWindowBlurEnabledListener(Executor executor, Consumer consumer) {
        this.f10602c.addCrossWindowBlurEnabledListener(executor, consumer);
    }
}
