package S;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: S.z  reason: case insensitive filesystem */
public abstract class C0334z {

    /* renamed from: a  reason: collision with root package name */
    public static Map f2717a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: S.z$a */
    public static class a {
        public static float a(VelocityTracker velocityTracker, int i4) {
            return velocityTracker.getAxisVelocity(i4);
        }

        public static float b(VelocityTracker velocityTracker, int i4, int i5) {
            return velocityTracker.getAxisVelocity(i4, i5);
        }

        public static boolean c(VelocityTracker velocityTracker, int i4) {
            return velocityTracker.isAxisSupported(i4);
        }
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f2717a.containsKey(velocityTracker)) {
                f2717a.put(velocityTracker, new A());
            }
            ((A) f2717a.get(velocityTracker)).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int i4) {
        c(velocityTracker, i4, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker velocityTracker, int i4, float f4) {
        velocityTracker.computeCurrentVelocity(i4, f4);
        A e4 = e(velocityTracker);
        if (e4 != null) {
            e4.c(i4, f4);
        }
    }

    public static float d(VelocityTracker velocityTracker, int i4) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i4);
        }
        if (i4 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i4 == 1) {
            return velocityTracker.getYVelocity();
        }
        A e4 = e(velocityTracker);
        if (e4 != null) {
            return e4.d(i4);
        }
        return 0.0f;
    }

    public static A e(VelocityTracker velocityTracker) {
        return (A) f2717a.get(velocityTracker);
    }
}
