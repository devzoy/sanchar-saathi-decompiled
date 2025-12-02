package androidx.profileinstaller;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

public abstract class a {

    /* renamed from: androidx.profileinstaller.a$a  reason: collision with other inner class name */
    public static class C0095a {
        public static File a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    public static boolean a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            int length = listFiles.length;
            boolean z4 = true;
            for (int i4 = 0; i4 < length; i4++) {
                z4 = a(listFiles[i4]) && z4;
            }
            return z4;
        }
        file.delete();
        return true;
    }

    public static void b(Context context, ProfileInstallReceiver.a aVar) {
        if (a(C0095a.a(context))) {
            aVar.b(14, (Object) null);
        } else {
            aVar.b(15, (Object) null);
        }
    }
}
