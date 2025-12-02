package d;

import android.window.BackEvent;
import v3.l;

/* renamed from: d.a  reason: case insensitive filesystem */
public final class C0565a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0565a f8581a = new C0565a();

    public final BackEvent a(float f4, float f5, float f6, int i4) {
        return new BackEvent(f4, f5, f6, i4);
    }

    public final float b(BackEvent backEvent) {
        l.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        l.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        l.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        l.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
