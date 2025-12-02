package w0;

import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import v3.l;

/* renamed from: w0.c  reason: case insensitive filesystem */
public abstract class C0961c {
    public static final void a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) {
        l.e(readableByteChannel, "input");
        l.e(fileChannel, "output");
        try {
            fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
