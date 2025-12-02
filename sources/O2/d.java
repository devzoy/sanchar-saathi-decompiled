package O2;

import android.graphics.ImageDecoder;
import io.flutter.embedding.engine.FlutterJNI;

public final /* synthetic */ class d implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f2072a;

    public /* synthetic */ d(long j4) {
        this.f2072a = j4;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        FlutterJNI.lambda$decodeImage$0(this.f2072a, imageDecoder, imageInfo, source);
    }
}
