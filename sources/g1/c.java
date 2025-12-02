package G1;

import dalvik.system.PathClassLoader;

public final class c extends PathClassLoader {
    public c(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    public final Class loadClass(String str, boolean z4) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z4);
    }
}
