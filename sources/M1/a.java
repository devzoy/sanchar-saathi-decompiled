package M1;

import android.os.IBinder;
import android.os.IInterface;

public abstract class a implements IInterface {

    /* renamed from: c  reason: collision with root package name */
    public final IBinder f1796c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1797d;

    public a(IBinder iBinder, String str) {
        this.f1796c = iBinder;
        this.f1797d = str;
    }

    public IBinder asBinder() {
        return this.f1796c;
    }
}
