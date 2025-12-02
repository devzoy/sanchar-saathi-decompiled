package f0;

import android.content.Context;
import b0.C0389a;
import java.io.File;
import v3.l;

/* renamed from: f0.b  reason: case insensitive filesystem */
public abstract class C0618b {
    public static final File a(Context context, String str) {
        l.e(context, "<this>");
        l.e(str, "name");
        return C0389a.a(context, str + ".preferences_pb");
    }
}
