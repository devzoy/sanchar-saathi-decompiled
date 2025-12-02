package io.flutter.plugin.platform;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import io.flutter.view.d;

/* renamed from: io.flutter.plugin.platform.a  reason: case insensitive filesystem */
public class C0750a {

    /* renamed from: a  reason: collision with root package name */
    public d f10529a;

    public boolean a(MotionEvent motionEvent, boolean z4) {
        d dVar = this.f10529a;
        if (dVar == null) {
            return false;
        }
        return dVar.K(motionEvent, z4);
    }

    public boolean b(View view, View view2, AccessibilityEvent accessibilityEvent) {
        d dVar = this.f10529a;
        if (dVar == null) {
            return false;
        }
        return dVar.u(view, view2, accessibilityEvent);
    }

    public void c(d dVar) {
        this.f10529a = dVar;
    }
}
