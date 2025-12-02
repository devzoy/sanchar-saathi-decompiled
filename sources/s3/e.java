package s3;

import java.io.File;
import java.io.IOException;
import v3.l;

public class e extends IOException {

    /* renamed from: e  reason: collision with root package name */
    public final File f12028e;

    /* renamed from: f  reason: collision with root package name */
    public final File f12029f;

    /* renamed from: g  reason: collision with root package name */
    public final String f12030g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(File file, File file2, String str) {
        super(c.a(file, file2, str));
        l.e(file, "file");
        this.f12028e = file;
        this.f12029f = file2;
        this.f12030g = str;
    }
}
