package Q0;

import androidx.work.b;
import java.util.List;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2377a = i.i("InputMerger");

    public static g a(String str) {
        try {
            return (g) Class.forName(str).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception e4) {
            i e5 = i.e();
            String str2 = f2377a;
            e5.d(str2, "Trouble instantiating + " + str, e4);
            return null;
        }
    }

    public abstract b b(List list);
}
