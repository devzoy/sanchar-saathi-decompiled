package y0;

import java.io.Closeable;

public interface i extends Closeable {
    void bindBlob(int i4, byte[] bArr);

    void bindDouble(int i4, double d4);

    void bindLong(int i4, long j4);

    void bindNull(int i4);

    void bindString(int i4, String str);
}
