package I1;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

public final class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f1511a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f1512b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Integer f1513c;

    public e(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f1511a = sharedPreferences;
        this.f1512b = str;
        this.f1513c = num;
    }

    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.f1511a.getInt(this.f1512b, this.f1513c.intValue()));
    }
}
