package L1;

import android.os.IBinder;
import android.os.IInterface;

public abstract class a implements IInterface {

    /* renamed from: c  reason: collision with root package name */
    public final IBinder f1768c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1769d;

    public a(IBinder iBinder, String str) {
        this.f1768c = iBinder;
        this.f1769d = str;
    }

    public IBinder asBinder() {
        return this.f1768c;
    }
}
