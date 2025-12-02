package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;

public class SurfaceTextureWrapper {
    private boolean attached;
    private boolean newFrameAvailable;
    private Runnable onFrameConsumed;
    private boolean released;
    private SurfaceTexture surfaceTexture;

    public SurfaceTextureWrapper(SurfaceTexture surfaceTexture2) {
        this(surfaceTexture2, (Runnable) null);
    }

    public void attachToGLContext(int i4) {
        synchronized (this) {
            try {
                if (!this.released) {
                    if (this.attached) {
                        this.surfaceTexture.detachFromGLContext();
                    }
                    this.surfaceTexture.attachToGLContext(i4);
                    this.attached = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void detachFromGLContext() {
        synchronized (this) {
            try {
                if (this.attached && !this.released) {
                    this.surfaceTexture.detachFromGLContext();
                    this.attached = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void getTransformMatrix(float[] fArr) {
        this.surfaceTexture.getTransformMatrix(fArr);
    }

    public void markDirty() {
        synchronized (this) {
            this.newFrameAvailable = true;
        }
    }

    public void release() {
        synchronized (this) {
            try {
                if (!this.released) {
                    this.surfaceTexture.release();
                    this.released = true;
                    this.attached = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean shouldUpdate() {
        boolean z4;
        synchronized (this) {
            z4 = this.newFrameAvailable;
        }
        return z4;
    }

    public SurfaceTexture surfaceTexture() {
        return this.surfaceTexture;
    }

    public void updateTexImage() {
        synchronized (this) {
            try {
                this.newFrameAvailable = false;
                if (!this.released) {
                    this.surfaceTexture.updateTexImage();
                    Runnable runnable = this.onFrameConsumed;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SurfaceTextureWrapper(SurfaceTexture surfaceTexture2, Runnable runnable) {
        this.newFrameAvailable = false;
        this.surfaceTexture = surfaceTexture2;
        this.released = false;
        this.onFrameConsumed = runnable;
    }
}
