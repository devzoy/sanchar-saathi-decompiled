package O3;

import O3.r;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Map;
import v3.g;
import v3.l;

public class n extends m {
    public void a(r rVar, r rVar2) {
        l.e(rVar, "source");
        l.e(rVar2, "target");
        try {
            Files.move(rVar.v(), rVar2.v(), new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING});
        } catch (NoSuchFileException e4) {
            throw new FileNotFoundException(e4.getMessage());
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        }
    }

    public g h(r rVar) {
        l.e(rVar, "path");
        return o(rVar.v());
    }

    public final g o(Path path) {
        l.e(path, "nioPath");
        Long l4 = null;
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(path, BasicFileAttributes.class, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            r f4 = readSymbolicLink != null ? r.a.f(r.f2128f, readSymbolicLink, false, 1, (Object) null) : null;
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long p4 = creationTime != null ? p(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long p5 = lastModifiedTime != null ? p(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l4 = p(lastAccessTime);
            }
            return new g(isRegularFile, isDirectory, f4, valueOf, p4, p5, l4, (Map) null, 128, (g) null);
        } catch (FileSystemException | NoSuchFileException unused) {
            return null;
        }
    }

    public final Long p(FileTime fileTime) {
        Long valueOf = Long.valueOf(fileTime.toMillis());
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }

    public String toString() {
        return "NioSystemFileSystem";
    }
}
