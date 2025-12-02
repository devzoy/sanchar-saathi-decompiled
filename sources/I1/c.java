package I1;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

public final class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f1508a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f1509b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Boolean f1510c;

    public c(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f1508a = sharedPreferences;
        this.f1509b = str;
        this.f1510c = bool;
    }

    public final /* synthetic */ Object call() {
        return Boolean.valueOf(this.f1508a.getBoolean(this.f1509b, this.f1510c.booleanValue()));
    }
}
