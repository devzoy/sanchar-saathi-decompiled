package androidx.media;

import F0.a;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f5442a = aVar.p(audioAttributesImplBase.f5442a, 1);
        audioAttributesImplBase.f5443b = aVar.p(audioAttributesImplBase.f5443b, 2);
        audioAttributesImplBase.f5444c = aVar.p(audioAttributesImplBase.f5444c, 3);
        audioAttributesImplBase.f5445d = aVar.p(audioAttributesImplBase.f5445d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f5442a, 1);
        aVar.F(audioAttributesImplBase.f5443b, 2);
        aVar.F(audioAttributesImplBase.f5444c, 3);
        aVar.F(audioAttributesImplBase.f5445d, 4);
    }
}
