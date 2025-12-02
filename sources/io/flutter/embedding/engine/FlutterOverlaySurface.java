package io.flutter.embedding.engine;

import android.view.Surface;

public class FlutterOverlaySurface {
    private final int id;
    private final Surface surface;

    public FlutterOverlaySurface(int i4, Surface surface2) {
        this.id = i4;
        this.surface = surface2;
    }

    public int getId() {
        return this.id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
