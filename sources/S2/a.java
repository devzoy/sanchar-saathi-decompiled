package S2;

import N2.C0287a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import g3.C0644h;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;

public class a extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public FlutterMutatorsStack f2783c;

    /* renamed from: d  reason: collision with root package name */
    public float f2784d;

    /* renamed from: e  reason: collision with root package name */
    public int f2785e;

    /* renamed from: f  reason: collision with root package name */
    public int f2786f;

    /* renamed from: g  reason: collision with root package name */
    public int f2787g;

    /* renamed from: h  reason: collision with root package name */
    public int f2788h;

    /* renamed from: i  reason: collision with root package name */
    public final C0287a f2789i;

    /* renamed from: j  reason: collision with root package name */
    public ViewTreeObserver.OnGlobalFocusChangeListener f2790j;

    /* renamed from: S2.a$a  reason: collision with other inner class name */
    public class C0060a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View.OnFocusChangeListener f2791a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f2792b;

        public C0060a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f2791a = onFocusChangeListener;
            this.f2792b = view;
        }

        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f2791a;
            View view3 = this.f2792b;
            onFocusChangeListener.onFocusChange(view3, C0644h.d(view3));
        }
    }

    public a(Context context, float f4, C0287a aVar) {
        super(context, (AttributeSet) null);
        this.f2784d = f4;
        this.f2789i = aVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f2783c.getFinalMatrix());
        float f4 = this.f2784d;
        matrix.preScale(1.0f / f4, 1.0f / f4);
        matrix.postTranslate((float) (-this.f2785e), (float) (-this.f2786f));
        return matrix;
    }

    public void a(FlutterMutatorsStack flutterMutatorsStack, int i4, int i5, int i6, int i7) {
        this.f2783c = flutterMutatorsStack;
        this.f2785e = i4;
        this.f2786f = i5;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = i5;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public void b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.f2790j) != null) {
            this.f2790j = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.f2783c.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset((float) (-this.f2785e), (float) (-this.f2786f));
            canvas.clipPath(path2);
        }
        super.draw(canvas);
        canvas.restore();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f2789i == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i4 = this.f2785e;
            this.f2787g = i4;
            int i5 = this.f2786f;
            this.f2788h = i5;
            matrix.postTranslate((float) i4, (float) i5);
        } else if (action != 2) {
            matrix.postTranslate((float) this.f2785e, (float) this.f2786f);
        } else {
            matrix.postTranslate((float) this.f2787g, (float) this.f2788h);
            this.f2787g = this.f2785e;
            this.f2788h = this.f2786f;
        }
        return this.f2789i.k(motionEvent, matrix);
    }

    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f2790j == null) {
            C0060a aVar = new C0060a(onFocusChangeListener, this);
            this.f2790j = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }
}
