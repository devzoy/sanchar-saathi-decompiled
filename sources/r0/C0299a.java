package R0;

import android.content.Context;
import java.io.File;
import v3.l;

/* renamed from: R0.a  reason: case insensitive filesystem */
public final class C0299a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0299a f2509a = new C0299a();

    public final File a(Context context) {
        l.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        l.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
