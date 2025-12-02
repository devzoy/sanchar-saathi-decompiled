package s3;

import java.io.File;
import v3.l;

public abstract class c {
    public static final String b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String sb2 = sb.toString();
        l.d(sb2, "toString(...)");
        return sb2;
    }
}
