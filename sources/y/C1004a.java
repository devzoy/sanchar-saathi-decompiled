package y;

import android.view.View;

/* renamed from: y.a  reason: case insensitive filesystem */
public abstract class C1004a {
    public static String a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
