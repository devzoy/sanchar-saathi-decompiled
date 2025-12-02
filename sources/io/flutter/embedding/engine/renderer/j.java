package io.flutter.embedding.engine.renderer;

import android.media.ImageReader;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

public final /* synthetic */ class j implements ImageReader.OnImageAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FlutterRenderer.ImageReaderSurfaceProducer.b f10410a;

    public /* synthetic */ j(FlutterRenderer.ImageReaderSurfaceProducer.b bVar) {
        this.f10410a = bVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        this.f10410a.g(imageReader);
    }
}
