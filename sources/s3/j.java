package s3;

import java.io.File;
import v3.g;
import v3.l;

public final class j extends e {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(File file, File file2, String str, int i4, g gVar) {
        this(file, (i4 & 2) != 0 ? null : file2, (i4 & 4) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(File file, File file2, String str) {
        super(file, file2, str);
        l.e(file, "file");
    }
}
