package s3;

import java.io.InputStream;
import java.io.OutputStream;
import v3.l;

public abstract class a {
    public static final long a(InputStream inputStream, OutputStream outputStream, int i4) {
        l.e(inputStream, "<this>");
        l.e(outputStream, "out");
        byte[] bArr = new byte[i4];
        int read = inputStream.read(bArr);
        long j4 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j4 += (long) read;
            read = inputStream.read(bArr);
        }
        return j4;
    }
}
