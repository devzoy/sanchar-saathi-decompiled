package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.renderer.FlutterRenderer;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FlutterRenderer.ImageReaderSurfaceProducer f10409e;

    public /* synthetic */ i(FlutterRenderer.ImageReaderSurfaceProducer imageReaderSurfaceProducer) {
        this.f10409e = imageReaderSurfaceProducer;
    }

    public final void run() {
        this.f10409e.lambda$dequeueImage$0();
    }
}
