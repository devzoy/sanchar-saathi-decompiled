package io.flutter.plugin.platform;

import android.view.Surface;
import io.flutter.view.TextureRegistry;

public class A implements l {

    /* renamed from: a  reason: collision with root package name */
    public TextureRegistry.SurfaceProducer f10495a;

    public A(TextureRegistry.SurfaceProducer surfaceProducer) {
        this.f10495a = surfaceProducer;
    }

    public void a(int i4, int i5) {
        this.f10495a.setSize(i4, i5);
    }

    public long b() {
        return this.f10495a.id();
    }

    public int getHeight() {
        return this.f10495a.getHeight();
    }

    public Surface getSurface() {
        return this.f10495a.getSurface();
    }

    public int getWidth() {
        return this.f10495a.getWidth();
    }

    public void release() {
        this.f10495a.release();
        this.f10495a = null;
    }

    public void scheduleFrame() {
        this.f10495a.scheduleFrame();
    }
}
