package u1;

import J1.f;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

public final class k extends f {

    /* renamed from: b  reason: collision with root package name */
    public final Context f12331b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f12332c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        Objects.requireNonNull(dVar);
        this.f12332c = dVar;
        this.f12331b = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i4);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        d dVar = this.f12332c;
        Context context = this.f12331b;
        int f4 = dVar.f(context);
        if (dVar.i(f4)) {
            dVar.o(context, f4);
        }
    }
}
