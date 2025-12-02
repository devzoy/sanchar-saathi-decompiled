package I1;

import android.content.Context;
import java.util.concurrent.Callable;

public final class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f1521a;

    public k(Context context) {
        this.f1521a = context;
    }

    public final /* synthetic */ Object call() {
        return this.f1521a.getSharedPreferences("google_sdk_flags", 0);
    }
}
