package io.flutter.plugin.platform;

import M2.b;
import N2.C0287a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import g3.C0644h;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

public class m extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public int f10554c;

    /* renamed from: d  reason: collision with root package name */
    public int f10555d;

    /* renamed from: e  reason: collision with root package name */
    public int f10556e;

    /* renamed from: f  reason: collision with root package name */
    public int f10557f;

    /* renamed from: g  reason: collision with root package name */
    public C0287a f10558g;

    /* renamed from: h  reason: collision with root package name */
    public l f10559h;

    /* renamed from: i  reason: collision with root package name */
    public ViewTreeObserver.OnGlobalFocusChangeListener f10560i;

    public class a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View.OnFocusChangeListener f10561a;

        public a(View.OnFocusChangeListener onFocusChangeListener) {
            this.f10561a = onFocusChangeListener;
        }

        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f10561a;
            m mVar = m.this;
            onFocusChangeListener.onFocusChange(mVar, C0644h.d(mVar));
        }
    }

    public m(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public void a() {
        l lVar = this.f10559h;
        if (lVar != null) {
            lVar.release();
            this.f10559h = null;
        }
    }

    public void b(int i4, int i5) {
        l lVar = this.f10559h;
        if (lVar != null) {
            lVar.a(i4, i5);
        }
    }

    public void c() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.f10560i) != null) {
            this.f10560i = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public void draw(Canvas canvas) {
        l lVar = this.f10559h;
        if (lVar == null) {
            super.draw(canvas);
            b.b("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = lVar.getSurface();
        if (!surface.isValid()) {
            b.b("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        if (lockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(lockHardwareCanvas);
        } finally {
            this.f10559h.scheduleFrame();
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f10560i;
    }

    public int getRenderTargetHeight() {
        l lVar = this.f10559h;
        if (lVar != null) {
            return lVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        l lVar = this.f10559h;
        if (lVar != null) {
            return lVar.getWidth();
        }
        return 0;
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f10558g == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i4 = this.f10556e;
            this.f10554c = i4;
            int i5 = this.f10557f;
            this.f10555d = i5;
            matrix.postTranslate((float) i4, (float) i5);
        } else if (action != 2) {
            matrix.postTranslate((float) this.f10556e, (float) this.f10557f);
        } else {
            matrix.postTranslate((float) this.f10554c, (float) this.f10555d);
            this.f10554c = this.f10556e;
            this.f10555d = this.f10557f;
        }
        return this.f10558g.k(motionEvent, matrix);
    }

    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f10556e = layoutParams.leftMargin;
        this.f10557f = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        c();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f10560i == null) {
            a aVar = new a(onFocusChangeListener);
            this.f10560i = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }

    public void setTouchProcessor(C0287a aVar) {
        this.f10558g = aVar;
    }

    public m(Context context, l lVar) {
        this(context);
        this.f10559h = lVar;
        Surface surface = lVar.getSurface();
        if (surface != null && !FlutterRenderer.f10352j) {
            Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
            try {
                lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            } finally {
                surface.unlockCanvasAndPost(lockHardwareCanvas);
            }
        }
    }
}
