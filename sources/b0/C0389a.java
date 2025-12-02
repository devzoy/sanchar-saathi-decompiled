package b0;

import android.content.Context;
import java.io.File;
import v3.l;

/* renamed from: b0.a  reason: case insensitive filesystem */
public abstract class C0389a {
    public static final File a(Context context, String str) {
        l.e(context, "<this>");
        l.e(str, "fileName");
        File filesDir = context.getApplicationContext().getFilesDir();
        return new File(filesDir, "datastore/" + str);
    }
}
