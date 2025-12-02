package androidx.media;

import F0.a;
import android.media.AudioAttributes;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f5440a = (AudioAttributes) aVar.r(audioAttributesImplApi26.f5440a, 1);
        audioAttributesImplApi26.f5441b = aVar.p(audioAttributesImplApi26.f5441b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, a aVar) {
        aVar.x(false, false);
        aVar.H(audioAttributesImplApi26.f5440a, 1);
        aVar.F(audioAttributesImplApi26.f5441b, 2);
    }
}
