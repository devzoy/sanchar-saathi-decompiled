package u1;

import java.lang.ref.WeakReference;

public abstract class v extends t {

    /* renamed from: e  reason: collision with root package name */
    public static final WeakReference f12335e = new WeakReference((Object) null);

    /* renamed from: d  reason: collision with root package name */
    public WeakReference f12336d = f12335e;

    public v(byte[] bArr) {
        super(bArr);
    }

    public final byte[] I() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f12336d.get();
                if (bArr == null) {
                    bArr = K();
                    this.f12336d = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    public abstract byte[] K();
}
