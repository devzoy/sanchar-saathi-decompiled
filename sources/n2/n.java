package N2;

import M2.b;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

public class n extends TextureView implements io.flutter.embedding.engine.renderer.n {

    /* renamed from: c  reason: collision with root package name */
    public boolean f1946c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1947d;

    /* renamed from: e  reason: collision with root package name */
    public FlutterRenderer f1948e;

    /* renamed from: f  reason: collision with root package name */
    public Surface f1949f;

    /* renamed from: g  reason: collision with root package name */
    public final TextureView.SurfaceTextureListener f1950g;

    public class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i5) {
            b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            boolean unused = n.this.f1946c = true;
            if (n.this.q()) {
                n.this.m();
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            boolean unused = n.this.f1946c = false;
            if (n.this.q()) {
                n.this.n();
            }
            if (n.this.f1949f == null) {
                return true;
            }
            n.this.f1949f.release();
            Surface unused2 = n.this.f1949f = null;
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i5) {
            b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (n.this.q()) {
                n.this.l(i4, i5);
            }
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public n(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public void l(int i4, int i5) {
        if (this.f1948e != null) {
            b.f("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i4 + " x " + i5);
            this.f1948e.A(i4, i5);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    /* access modifiers changed from: private */
    public void m() {
        if (this.f1948e == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f1949f;
        if (surface != null) {
            surface.release();
            this.f1949f = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f1949f = surface2;
        this.f1948e.y(surface2, this.f1947d);
    }

    /* access modifiers changed from: private */
    public void n() {
        FlutterRenderer flutterRenderer = this.f1948e;
        if (flutterRenderer != null) {
            flutterRenderer.z();
            Surface surface = this.f1949f;
            if (surface != null) {
                surface.release();
                this.f1949f = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void o() {
        setSurfaceTextureListener(this.f1950g);
    }

    /* access modifiers changed from: private */
    public boolean q() {
        return this.f1948e != null && !this.f1947d;
    }

    public void a() {
        if (this.f1948e != null) {
            if (getWindowToken() != null) {
                b.f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
                n();
            }
            this.f1948e = null;
            return;
        }
        b.g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    public void b() {
        if (this.f1948e == null) {
            b.g("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (p()) {
            b.f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            m();
        }
        this.f1947d = false;
    }

    public void c(FlutterRenderer flutterRenderer) {
        b.f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f1948e != null) {
            b.f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f1948e.z();
        }
        this.f1948e = flutterRenderer;
        b();
    }

    public void d() {
        if (this.f1948e == null) {
            b.g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f1947d = true;
        }
    }

    public FlutterRenderer getAttachedRenderer() {
        return this.f1948e;
    }

    public boolean p() {
        return this.f1946c;
    }

    public void setRenderSurface(Surface surface) {
        this.f1949f = surface;
    }

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1946c = false;
        this.f1947d = false;
        this.f1950g = new a();
        o();
    }
}
