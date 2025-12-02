package y0;

import android.content.Context;
import java.io.File;
import v3.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f12712a = new d();

    public static final File a(Context context) {
        l.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        l.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
