package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.view.Surface;

public interface TextureRegistry {

    public interface GLTextureConsumer {
        SurfaceTexture getSurfaceTexture();
    }

    public interface ImageConsumer {
        Image acquireLatestImage();
    }

    public interface ImageTextureEntry {
        /* synthetic */ long id();

        void pushImage(Image image);

        /* synthetic */ void release();
    }

    public interface SurfaceProducer {

        public interface a {
        }

        int getHeight();

        Surface getSurface();

        int getWidth();

        boolean handlesCropAndRotation();

        /* synthetic */ long id();

        /* synthetic */ void release();

        void scheduleFrame();

        void setCallback(a aVar);

        void setSize(int i4, int i5);
    }

    public interface SurfaceTextureEntry {
        /* synthetic */ long id();

        /* synthetic */ void release();

        void setOnFrameConsumedListener(a aVar) {
        }

        void setOnTrimMemoryListener(b bVar) {
        }

        SurfaceTexture surfaceTexture();
    }

    public interface a {
    }

    public interface b {
        void onTrimMemory(int i4);
    }

    ImageTextureEntry a();

    SurfaceProducer b();

    SurfaceTextureEntry c();
}
