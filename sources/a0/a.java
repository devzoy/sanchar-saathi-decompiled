package A0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import v3.g;
import v3.l;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0000a f158e = new C0000a((g) null);

    /* renamed from: f  reason: collision with root package name */
    public static final Map f159f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f160a;

    /* renamed from: b  reason: collision with root package name */
    public final File f161b;

    /* renamed from: c  reason: collision with root package name */
    public final Lock f162c;

    /* renamed from: d  reason: collision with root package name */
    public FileChannel f163d;

    /* renamed from: A0.a$a  reason: collision with other inner class name */
    public static final class C0000a {
        public /* synthetic */ C0000a(g gVar) {
            this();
        }

        public final Lock b(String str) {
            Lock lock;
            synchronized (a.f159f) {
                try {
                    Map a4 = a.f159f;
                    Object obj = a4.get(str);
                    if (obj == null) {
                        obj = new ReentrantLock();
                        a4.put(str, obj);
                    }
                    lock = (Lock) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        public C0000a() {
        }
    }

    public a(String str, File file, boolean z4) {
        l.e(str, "name");
        l.e(file, "lockDir");
        this.f160a = z4;
        File file2 = new File(file, str + ".lck");
        this.f161b = file2;
        C0000a aVar = f158e;
        String absolutePath = file2.getAbsolutePath();
        l.d(absolutePath, "lockFile.absolutePath");
        this.f162c = aVar.b(absolutePath);
    }

    public static /* synthetic */ void c(a aVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = aVar.f160a;
        }
        aVar.b(z4);
    }

    public final void b(boolean z4) {
        this.f162c.lock();
        if (z4) {
            try {
                File parentFile = this.f161b.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f161b).getChannel();
                channel.lock();
                this.f163d = channel;
            } catch (IOException e4) {
                this.f163d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e4);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f163d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f162c.unlock();
    }
}
