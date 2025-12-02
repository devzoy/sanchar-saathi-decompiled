package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

public final /* synthetic */ class l implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FlutterRenderer.f f10412a;

    public /* synthetic */ l(FlutterRenderer.f fVar) {
        this.f10412a = fVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f10412a.d(surfaceTexture);
    }
}
