package c2;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: c2.a  reason: case insensitive filesystem */
public class C0404a implements View.OnTouchListener {

    /* renamed from: c  reason: collision with root package name */
    public final Dialog f6507c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6508d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6509e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6510f;

    public C0404a(Dialog dialog, Rect rect) {
        this.f6507c = dialog;
        this.f6508d = rect.left;
        this.f6509e = rect.top;
        this.f6510f = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f6508d + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f6509e + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        view.performClick();
        return this.f6507c.onTouchEvent(obtain);
    }
}
