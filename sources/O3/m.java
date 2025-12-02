package O3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.Map;
import v3.g;
import v3.l;

public class m extends h {
    public void a(r rVar, r rVar2) {
        l.e(rVar, "source");
        l.e(rVar2, "target");
        if (!rVar.u().renameTo(rVar2.u())) {
            throw new IOException("failed to move " + rVar + " to " + rVar2);
        }
    }

    public void d(r rVar, boolean z4) {
        l.e(rVar, "dir");
        if (!rVar.u().mkdir()) {
            g h4 = h(rVar);
            if (h4 == null || !h4.c()) {
                throw new IOException("failed to create directory: " + rVar);
            } else if (z4) {
                throw new IOException(rVar + " already exist.");
            }
        }
    }

    public void f(r rVar, boolean z4) {
        l.e(rVar, "path");
        if (!Thread.interrupted()) {
            File u4 = rVar.u();
            if (u4.delete()) {
                return;
            }
            if (u4.exists()) {
                throw new IOException("failed to delete " + rVar);
            } else if (z4) {
                throw new FileNotFoundException("no such file: " + rVar);
            }
        } else {
            throw new InterruptedIOException("interrupted");
        }
    }

    public g h(r rVar) {
        l.e(rVar, "path");
        File u4 = rVar.u();
        boolean isFile = u4.isFile();
        boolean isDirectory = u4.isDirectory();
        long lastModified = u4.lastModified();
        long length = u4.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !u4.exists()) {
            return null;
        }
        return new g(isFile, isDirectory, (r) null, Long.valueOf(length), (Long) null, Long.valueOf(lastModified), (Long) null, (Map) null, 128, (g) null);
    }

    public f i(r rVar) {
        l.e(rVar, "file");
        return new l(false, new RandomAccessFile(rVar.u(), "r"));
    }

    public f k(r rVar, boolean z4, boolean z5) {
        l.e(rVar, "file");
        if (!z4 || !z5) {
            if (z4) {
                m(rVar);
            }
            if (z5) {
                n(rVar);
            }
            return new l(true, new RandomAccessFile(rVar.u(), "rw"));
        }
        throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
    }

    public y l(r rVar) {
        l.e(rVar, "file");
        return o.d(rVar.u());
    }

    public final void m(r rVar) {
        if (g(rVar)) {
            throw new IOException(rVar + " already exists.");
        }
    }

    public final void n(r rVar) {
        if (!g(rVar)) {
            throw new IOException(rVar + " doesn't exist.");
        }
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
