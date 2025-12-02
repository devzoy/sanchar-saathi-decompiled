package N2;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.n;

public class m extends SurfaceView implements n {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1938c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1939d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1940e;

    /* renamed from: f  reason: collision with root package name */
    public FlutterRenderer f1941f;

    /* renamed from: g  reason: collision with root package name */
    public final SurfaceHolder.Callback f1942g;

    /* renamed from: h  reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.m f1943h;

    public class a implements SurfaceHolder.Callback {
        public a() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
            M2.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (m.this.p()) {
                m.this.k(i5, i6);
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            M2.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            boolean unused = m.this.f1939d = true;
            if (m.this.p()) {
                m.this.l();
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            M2.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            boolean unused = m.this.f1939d = false;
            if (m.this.p()) {
                m.this.m();
            }
        }
    }

    public class b implements io.flutter.embedding.engine.renderer.m {
        public b() {
        }

        public void d() {
        }

        public void g() {
            M2.b.f("FlutterSurfaceView", "onFlutterUiDisplayed()");
            m.this.setAlpha(1.0f);
            if (m.this.f1941f != null) {
                m.this.f1941f.t(this);
            }
        }
    }

    public m(Context context, boolean z4) {
        this(context, (AttributeSet) null, z4);
    }

    private void n() {
        if (this.f1938c) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f1942g);
        setAlpha(0.0f);
    }

    public void a() {
        if (this.f1941f != null) {
            if (getWindowToken() != null) {
                M2.b.f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
                m();
            }
            setAlpha(0.0f);
            this.f1941f.t(this.f1943h);
            this.f1941f = null;
            return;
        }
        M2.b.g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    public void b() {
        FlutterRenderer flutterRenderer = this.f1941f;
        if (flutterRenderer == null) {
            M2.b.g("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        flutterRenderer.i(this.f1943h);
        if (o()) {
            M2.b.f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            l();
        }
        this.f1940e = false;
    }

    public void c(FlutterRenderer flutterRenderer) {
        M2.b.f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f1941f != null) {
            M2.b.f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f1941f.z();
            this.f1941f.t(this.f1943h);
        }
        this.f1941f = flutterRenderer;
        b();
    }

    public void d() {
        if (this.f1941f == null) {
            M2.b.g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f1940e = true;
        }
    }

    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i4 = iArr[0];
        region.op(i4, iArr[1], (getRight() + i4) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    public FlutterRenderer getAttachedRenderer() {
        return this.f1941f;
    }

    public final void k(int i4, int i5) {
        if (this.f1941f != null) {
            M2.b.f("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i4 + " x " + i5);
            this.f1941f.A(i4, i5);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    public final void l() {
        if (this.f1941f == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f1941f.y(getHolder().getSurface(), this.f1940e);
    }

    public final void m() {
        FlutterRenderer flutterRenderer = this.f1941f;
        if (flutterRenderer != null) {
            flutterRenderer.z();
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    public boolean o() {
        return this.f1939d;
    }

    public final boolean p() {
        return this.f1941f != null && !this.f1940e;
    }

    public m(Context context, AttributeSet attributeSet, boolean z4) {
        super(context, attributeSet);
        this.f1939d = false;
        this.f1940e = false;
        this.f1942g = new a();
        this.f1943h = new b();
        this.f1938c = z4;
        n();
    }
}
