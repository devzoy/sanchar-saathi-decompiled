package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f5440a;

    /* renamed from: b  reason: collision with root package name */
    public int f5441b = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f5440a.equals(((AudioAttributesImplApi21) obj).f5440a);
    }

    public int hashCode() {
        return this.f5440a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f5440a;
    }
}
