package g3;

import android.content.Context;
import java.io.File;

/* renamed from: g3.b  reason: case insensitive filesystem */
public abstract class C0638b {
    public static String a(Context context) {
        File codeCacheDir = context.getCodeCacheDir();
        if (codeCacheDir == null) {
            codeCacheDir = context.getCacheDir();
        }
        if (codeCacheDir == null) {
            codeCacheDir = new File(b(context), "cache");
        }
        return codeCacheDir.getPath();
    }

    public static String b(Context context) {
        return context.getDataDir().getPath();
    }

    public static String c(Context context) {
        File dir = context.getDir("flutter", 0);
        if (dir == null) {
            dir = new File(b(context), "app_flutter");
        }
        return dir.getPath();
    }

    public static String d(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            filesDir = new File(b(context), "files");
        }
        return filesDir.getPath();
    }
}
