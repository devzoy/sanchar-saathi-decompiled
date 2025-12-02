package D0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public final Map f714a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f715b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f716c = new ArrayList();

    public r(View view) {
        this.f715b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f715b == rVar.f715b && this.f714a.equals(rVar.f714a);
    }

    public int hashCode() {
        return (this.f715b.hashCode() * 31) + this.f714a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f715b + "\n") + "    values:";
        for (String str2 : this.f714a.keySet()) {
            str = str + "    " + str2 + ": " + this.f714a.get(str2) + "\n";
        }
        return str;
    }
}
