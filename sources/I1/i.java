package I1;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

public final class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f1517a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f1518b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f1519c;

    public i(SharedPreferences sharedPreferences, String str, String str2) {
        this.f1517a = sharedPreferences;
        this.f1518b = str;
        this.f1519c = str2;
    }

    public final /* synthetic */ Object call() {
        return this.f1517a.getString(this.f1518b, this.f1519c);
    }
}
