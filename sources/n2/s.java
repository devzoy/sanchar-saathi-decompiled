package N2;

import android.view.textservice.SpellCheckerInfo;
import java.util.function.Predicate;

public final /* synthetic */ class s implements Predicate {
    public final boolean test(Object obj) {
        return ((SpellCheckerInfo) obj).getPackageName().equals("com.google.android.inputmethod.latin");
    }
}
