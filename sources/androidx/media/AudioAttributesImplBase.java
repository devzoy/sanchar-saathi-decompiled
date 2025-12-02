package androidx.media;

import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f5442a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f5443b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f5444c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f5445d = -1;

    public int a() {
        return this.f5443b;
    }

    public int b() {
        int i4 = this.f5444c;
        int c4 = c();
        if (c4 == 6) {
            i4 |= 4;
        } else if (c4 == 7) {
            i4 |= 1;
        }
        return i4 & 273;
    }

    public int c() {
        int i4 = this.f5445d;
        return i4 != -1 ? i4 : AudioAttributesCompat.a(false, this.f5444c, this.f5442a);
    }

    public int d() {
        return this.f5442a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f5443b == audioAttributesImplBase.a() && this.f5444c == audioAttributesImplBase.b() && this.f5442a == audioAttributesImplBase.d() && this.f5445d == audioAttributesImplBase.f5445d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5443b), Integer.valueOf(this.f5444c), Integer.valueOf(this.f5442a), Integer.valueOf(this.f5445d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f5445d != -1) {
            sb.append(" stream=");
            sb.append(this.f5445d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.f5442a));
        sb.append(" content=");
        sb.append(this.f5443b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f5444c).toUpperCase());
        return sb.toString();
    }
}
