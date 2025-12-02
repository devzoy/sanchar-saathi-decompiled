package io.flutter.plugin.platform;

import android.view.Surface;

public interface l {
    void a(int i4, int i5);

    long b();

    int getHeight();

    Surface getSurface();

    int getWidth();

    void release();

    void scheduleFrame() {
    }
}
