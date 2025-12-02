package N2;

import android.os.Bundle;

/* renamed from: N2.i  reason: case insensitive filesystem */
public abstract class C0295i {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1924a = a.opaque.name();

    /* renamed from: N2.i$a */
    public enum a {
        opaque,
        transparent
    }

    public static boolean a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("flutter_deeplinking_enabled")) {
            return true;
        }
        return bundle.getBoolean("flutter_deeplinking_enabled");
    }
}
