package io.flutter.plugin.platform;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.Build;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;

public class C {

    /* renamed from: i  reason: collision with root package name */
    public static VirtualDisplay.Callback f10504i = new a();

    /* renamed from: a  reason: collision with root package name */
    public SingleViewPresentation f10505a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f10506b;

    /* renamed from: c  reason: collision with root package name */
    public final C0750a f10507c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10508d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10509e;

    /* renamed from: f  reason: collision with root package name */
    public final l f10510f;

    /* renamed from: g  reason: collision with root package name */
    public final View.OnFocusChangeListener f10511g;

    /* renamed from: h  reason: collision with root package name */
    public VirtualDisplay f10512h;

    public class a extends VirtualDisplay.Callback {
        public void onPaused() {
        }

        public void onResumed() {
        }
    }

    public class b implements View.OnAttachStateChangeListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f10513c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Runnable f10514d;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                b bVar = b.this;
                bVar.f10513c.postDelayed(bVar.f10514d, 128);
            }
        }

        public b(View view, Runnable runnable) {
            this.f10513c = view;
            this.f10514d = runnable;
        }

        public void onViewAttachedToWindow(View view) {
            c.a(this.f10513c, new a());
            this.f10513c.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static class c implements ViewTreeObserver.OnDrawListener {

        /* renamed from: e  reason: collision with root package name */
        public final View f10517e;

        /* renamed from: f  reason: collision with root package name */
        public Runnable f10518f;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                c.this.f10517e.getViewTreeObserver().removeOnDrawListener(c.this);
            }
        }

        public c(View view, Runnable runnable) {
            this.f10517e = view;
            this.f10518f = runnable;
        }

        public static void a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new c(view, runnable));
        }

        public void onDraw() {
            Runnable runnable = this.f10518f;
            if (runnable != null) {
                runnable.run();
                this.f10518f = null;
                this.f10517e.post(new a());
            }
        }
    }

    public C(Context context, C0750a aVar, VirtualDisplay virtualDisplay, h hVar, l lVar, View.OnFocusChangeListener onFocusChangeListener, int i4, Object obj) {
        this.f10506b = context;
        this.f10507c = aVar;
        this.f10510f = lVar;
        this.f10511g = onFocusChangeListener;
        this.f10509e = i4;
        this.f10512h = virtualDisplay;
        this.f10508d = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context, this.f10512h.getDisplay(), hVar, aVar, i4, onFocusChangeListener);
        this.f10505a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static C b(Context context, C0750a aVar, h hVar, l lVar, int i4, int i5, int i6, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        if (i4 == 0 || i5 == 0) {
            return null;
        }
        Context context2 = context;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        lVar.a(i4, i5);
        VirtualDisplay createVirtualDisplay = ((DisplayManager) context.getSystemService("display")).createVirtualDisplay("flutter-vd#" + i6, i4, i5, displayMetrics.densityDpi, lVar.getSurface(), 0, f10504i, (Handler) null);
        if (createVirtualDisplay == null) {
            return null;
        }
        return new C(context, aVar, createVirtualDisplay, hVar, lVar, onFocusChangeListener, i6, obj);
    }

    public void a() {
        this.f10512h.setSurface((Surface) null);
    }

    public void c(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.f10505a;
        if (singleViewPresentation != null) {
            singleViewPresentation.dispatchTouchEvent(motionEvent);
        }
    }

    public void d() {
        this.f10505a.cancel();
        this.f10505a.detachState();
        this.f10512h.release();
        this.f10510f.release();
    }

    public int e() {
        l lVar = this.f10510f;
        if (lVar != null) {
            return lVar.getHeight();
        }
        return 0;
    }

    public int f() {
        l lVar = this.f10510f;
        if (lVar != null) {
            return lVar.getWidth();
        }
        return 0;
    }

    public View g() {
        SingleViewPresentation singleViewPresentation = this.f10505a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().c();
    }

    public void h() {
        SingleViewPresentation singleViewPresentation = this.f10505a;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f10505a.getView().f();
        }
    }

    public void i() {
        SingleViewPresentation singleViewPresentation = this.f10505a;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f10505a.getView().b();
        }
    }

    public void j() {
        int f4 = f();
        int e4 = e();
        boolean isFocused = g().isFocused();
        SingleViewPresentation.d detachState = this.f10505a.detachState();
        this.f10512h.setSurface((Surface) null);
        this.f10512h.release();
        this.f10512h = ((DisplayManager) this.f10506b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + this.f10509e, f4, e4, this.f10508d, this.f10510f.getSurface(), 0, f10504i, (Handler) null);
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f10506b, this.f10512h.getDisplay(), this.f10507c, detachState, this.f10511g, isFocused);
        singleViewPresentation.show();
        this.f10505a.cancel();
        this.f10505a = singleViewPresentation;
    }

    public void k(int i4, int i5, Runnable runnable) {
        int i6 = i5;
        Runnable runnable2 = runnable;
        if (i4 == f() && i6 == e()) {
            g().postDelayed(runnable2, 0);
        } else if (Build.VERSION.SDK_INT >= 31) {
            l(g(), i4, i5, runnable2);
        } else {
            boolean isFocused = g().isFocused();
            SingleViewPresentation.d detachState = this.f10505a.detachState();
            this.f10512h.setSurface((Surface) null);
            this.f10512h.release();
            this.f10510f.a(i4, i5);
            this.f10512h = ((DisplayManager) this.f10506b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + this.f10509e, i4, i5, this.f10508d, this.f10510f.getSurface(), 0, f10504i, (Handler) null);
            View g4 = g();
            g4.addOnAttachStateChangeListener(new b(g4, runnable2));
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f10506b, this.f10512h.getDisplay(), this.f10507c, detachState, this.f10511g, isFocused);
            singleViewPresentation.show();
            this.f10505a.cancel();
            this.f10505a = singleViewPresentation;
        }
    }

    public final void l(View view, int i4, int i5, Runnable runnable) {
        this.f10510f.a(i4, i5);
        this.f10512h.resize(i4, i5, this.f10508d);
        this.f10512h.setSurface(this.f10510f.getSurface());
        view.postDelayed(runnable, 0);
    }
}
