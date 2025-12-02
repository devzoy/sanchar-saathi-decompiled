package o1;

import android.os.Build;
import o1.C0818c;

/* renamed from: o1.e  reason: case insensitive filesystem */
public final class C0820e implements C0818c.b {
    public String a(String str) {
        return (!str.startsWith("lib") || !str.endsWith(".so")) ? System.mapLibraryName(str) : str;
    }

    public String b(String str) {
        return str.substring(3, str.length() - 3);
    }

    public void c(String str) {
        System.loadLibrary(str);
    }

    public String[] d() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !C0821f.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    public void e(String str) {
        System.load(str);
    }
}
