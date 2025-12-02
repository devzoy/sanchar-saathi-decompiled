package io.flutter.plugin.platform;

import M2.b;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.renderer.g;
import io.flutter.embedding.engine.renderer.h;
import io.flutter.view.TextureRegistry;

/* renamed from: io.flutter.plugin.platform.b  reason: case insensitive filesystem */
public class C0751b implements l {

    /* renamed from: a  reason: collision with root package name */
    public TextureRegistry.ImageTextureEntry f10530a;

    /* renamed from: b  reason: collision with root package name */
    public ImageReader f10531b;

    /* renamed from: c  reason: collision with root package name */
    public int f10532c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f10533d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f10534e = new Handler();

    /* renamed from: f  reason: collision with root package name */
    public final ImageReader.OnImageAvailableListener f10535f = new a();

    /* renamed from: io.flutter.plugin.platform.b$a */
    public class a implements ImageReader.OnImageAvailableListener {
        public a() {
        }

        public void onImageAvailable(ImageReader imageReader) {
            Image image;
            try {
                image = imageReader.acquireLatestImage();
            } catch (IllegalStateException e4) {
                b.b("ImageReaderPlatformViewRenderTarget", "onImageAvailable acquireLatestImage failed: " + e4.toString());
                image = null;
            }
            if (image != null) {
                C0751b.this.f10530a.pushImage(image);
            }
        }
    }

    public C0751b(TextureRegistry.ImageTextureEntry imageTextureEntry) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f10530a = imageTextureEntry;
            return;
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    public void a(int i4, int i5) {
        if (this.f10531b == null || this.f10532c != i4 || this.f10533d != i5) {
            d();
            this.f10532c = i4;
            this.f10533d = i5;
            this.f10531b = e();
        }
    }

    public long b() {
        return this.f10530a.id();
    }

    public final void d() {
        if (this.f10531b != null) {
            this.f10530a.pushImage((Image) null);
            this.f10531b.close();
            this.f10531b = null;
        }
    }

    public ImageReader e() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            return g();
        }
        if (i4 >= 29) {
            return f();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    public ImageReader f() {
        ImageReader a4 = ImageReader.newInstance(this.f10532c, this.f10533d, 34, 4, 256);
        a4.setOnImageAvailableListener(this.f10535f, this.f10534e);
        return a4;
    }

    public ImageReader g() {
        h.a();
        ImageReader.Builder a4 = g.a(this.f10532c, this.f10533d);
        ImageReader.Builder unused = a4.setMaxImages(4);
        ImageReader.Builder unused2 = a4.setImageFormat(34);
        ImageReader.Builder unused3 = a4.setUsage(256);
        ImageReader a5 = a4.build();
        a5.setOnImageAvailableListener(this.f10535f, this.f10534e);
        return a5;
    }

    public int getHeight() {
        return this.f10533d;
    }

    public Surface getSurface() {
        return this.f10531b.getSurface();
    }

    public int getWidth() {
        return this.f10532c;
    }

    public void release() {
        d();
        this.f10530a = null;
    }
}
