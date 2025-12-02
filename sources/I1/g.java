package I1;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

public final class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f1514a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f1515b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Long f1516c;

    public g(SharedPreferences sharedPreferences, String str, Long l4) {
        this.f1514a = sharedPreferences;
        this.f1515b = str;
        this.f1516c = l4;
    }

    public final /* synthetic */ Object call() {
        return Long.valueOf(this.f1514a.getLong(this.f1515b, this.f1516c.longValue()));
    }
}
