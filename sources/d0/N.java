package D0;

import android.view.View;
import android.view.WindowId;

public class N implements O {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f591a;

    public N(View view) {
        this.f591a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof N) && ((N) obj).f591a.equals(this.f591a);
    }

    public int hashCode() {
        return this.f591a.hashCode();
    }
}
