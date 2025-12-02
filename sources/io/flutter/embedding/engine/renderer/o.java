package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.TextureRegistry;

public final class o implements TextureRegistry.SurfaceProducer, TextureRegistry.GLTextureConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final long f10413a;

    /* renamed from: b  reason: collision with root package name */
    public int f10414b;

    /* renamed from: c  reason: collision with root package name */
    public int f10415c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10416d;

    /* renamed from: e  reason: collision with root package name */
    public Surface f10417e;

    /* renamed from: f  reason: collision with root package name */
    public final TextureRegistry.SurfaceTextureEntry f10418f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f10419g;

    /* renamed from: h  reason: collision with root package name */
    public final FlutterJNI f10420h;

    public o(long j4, Handler handler, FlutterJNI flutterJNI, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        this.f10413a = j4;
        this.f10419g = handler;
        this.f10420h = flutterJNI;
        this.f10418f = surfaceTextureEntry;
    }

    public void finalize() {
        try {
            if (!this.f10416d) {
                release();
                this.f10419g.post(new FlutterRenderer.g(this.f10413a, this.f10420h));
                super.finalize();
            }
        } finally {
            super.finalize();
        }
    }

    public int getHeight() {
        return this.f10415c;
    }

    public Surface getSurface() {
        if (this.f10417e == null) {
            this.f10417e = new Surface(this.f10418f.surfaceTexture());
        }
        return this.f10417e;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.f10418f.surfaceTexture();
    }

    public int getWidth() {
        return this.f10414b;
    }

    public boolean handlesCropAndRotation() {
        return true;
    }

    public long id() {
        return this.f10413a;
    }

    public void release() {
        this.f10418f.release();
        this.f10416d = true;
    }

    public void scheduleFrame() {
        this.f10420h.markTextureFrameAvailable(this.f10413a);
    }

    public void setCallback(TextureRegistry.SurfaceProducer.a aVar) {
    }

    public void setSize(int i4, int i5) {
        this.f10414b = i4;
        this.f10415c = i5;
        getSurfaceTexture().setDefaultBufferSize(i4, i5);
    }
}
