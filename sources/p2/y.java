package p2;

import android.content.Context;
import java.io.File;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11739a;

    public y(Context context) {
        this.f11739a = context;
    }

    public static long b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j4 = 0;
        if (listFiles != null) {
            for (File b4 : listFiles) {
                j4 += b(b4);
            }
        }
        return j4;
    }

    public final long a() {
        return b(new File(this.f11739a.getFilesDir(), "assetpacks"));
    }
}
