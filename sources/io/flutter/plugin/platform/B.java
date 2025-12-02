package io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import io.flutter.view.TextureRegistry;

public class B implements l {

    /* renamed from: a  reason: collision with root package name */
    public final TextureRegistry.SurfaceTextureEntry f10496a;

    /* renamed from: b  reason: collision with root package name */
    public SurfaceTexture f10497b;

    /* renamed from: c  reason: collision with root package name */
    public Surface f10498c;

    /* renamed from: d  reason: collision with root package name */
    public int f10499d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f10500e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10501f = false;

    /* renamed from: g  reason: collision with root package name */
    public final TextureRegistry.b f10502g;

    public class a implements TextureRegistry.b {
        public a() {
        }

        public void onTrimMemory(int i4) {
            if (i4 == 80 && Build.VERSION.SDK_INT >= 29) {
                boolean unused = B.this.f10501f = true;
            }
        }
    }

    public B(TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        a aVar = new a();
        this.f10502g = aVar;
        this.f10496a = surfaceTextureEntry;
        this.f10497b = surfaceTextureEntry.surfaceTexture();
        surfaceTextureEntry.setOnTrimMemoryListener(aVar);
    }

    public void a(int i4, int i5) {
        this.f10499d = i4;
        this.f10500e = i5;
        SurfaceTexture surfaceTexture = this.f10497b;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i4, i5);
        }
    }

    public long b() {
        return this.f10496a.id();
    }

    public Surface d() {
        return new Surface(this.f10497b);
    }

    public final void e() {
        Surface surface = this.f10498c;
        if (surface == null || this.f10501f) {
            if (surface != null) {
                surface.release();
                this.f10498c = null;
            }
            this.f10498c = d();
            this.f10501f = false;
        }
    }

    public int getHeight() {
        return this.f10500e;
    }

    public Surface getSurface() {
        e();
        SurfaceTexture surfaceTexture = this.f10497b;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return null;
        }
        return this.f10498c;
    }

    public int getWidth() {
        return this.f10499d;
    }

    public void release() {
        this.f10497b = null;
        Surface surface = this.f10498c;
        if (surface != null) {
            surface.release();
            this.f10498c = null;
        }
    }
}
