package e3;

import i3.C0723G;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Set;
import v3.l;

public final class L extends ObjectInputStream {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public L(InputStream inputStream) {
        super(inputStream);
        l.e(inputStream, "input");
    }

    public Class resolveClass(ObjectStreamClass objectStreamClass) {
        Set g4 = C0723G.g("java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;");
        String name = objectStreamClass != null ? objectStreamClass.getName() : null;
        if (name == null || g4.contains(name)) {
            return super.resolveClass(objectStreamClass);
        }
        throw new ClassNotFoundException(objectStreamClass.getName());
    }
}
