package S;

import android.view.MotionEvent;

/* renamed from: S.p  reason: case insensitive filesystem */
public abstract class C0325p {
    public static boolean a(MotionEvent motionEvent, int i4) {
        return (motionEvent.getSource() & i4) == i4;
    }
}
