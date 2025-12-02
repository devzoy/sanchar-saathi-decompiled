package u0;

import A0.a;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import v3.l;
import w0.C0960b;
import w0.C0961c;
import y0.g;
import y0.h;

public final class y implements h, g {

    /* renamed from: e  reason: collision with root package name */
    public final Context f12292e;

    /* renamed from: f  reason: collision with root package name */
    public final String f12293f;

    /* renamed from: g  reason: collision with root package name */
    public final File f12294g;

    /* renamed from: h  reason: collision with root package name */
    public final Callable f12295h;

    /* renamed from: i  reason: collision with root package name */
    public final int f12296i;

    /* renamed from: j  reason: collision with root package name */
    public final h f12297j;

    /* renamed from: k  reason: collision with root package name */
    public f f12298k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12299l;

    public y(Context context, String str, File file, Callable callable, int i4, h hVar) {
        l.e(context, "context");
        l.e(hVar, "delegate");
        this.f12292e = context;
        this.f12293f = str;
        this.f12294g = file;
        this.f12295h = callable;
        this.f12296i = i4;
        this.f12297j = hVar;
    }

    public h b() {
        return this.f12297j;
    }

    public final void c(File file, boolean z4) {
        ReadableByteChannel readableByteChannel;
        if (this.f12293f != null) {
            readableByteChannel = Channels.newChannel(this.f12292e.getAssets().open(this.f12293f));
            l.d(readableByteChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f12294g != null) {
            readableByteChannel = new FileInputStream(this.f12294g).getChannel();
            l.d(readableByteChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.f12295h;
            if (callable != null) {
                try {
                    readableByteChannel = Channels.newChannel((InputStream) callable.call());
                    l.d(readableByteChannel, "newChannel(inputStream)");
                } catch (Exception e4) {
                    throw new IOException("inputStreamCallable exception on call", e4);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f12292e.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        l.d(channel, "output");
        C0961c.a(readableByteChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            l.d(createTempFile, "intermediateFile");
            d(createTempFile, z4);
            if (!createTempFile.renameTo(file)) {
                throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
            }
            return;
        }
        throw new IOException("Failed to create directories for " + file.getAbsolutePath());
    }

    public synchronized void close() {
        b().close();
        this.f12299l = false;
    }

    public final void d(File file, boolean z4) {
        f fVar = this.f12298k;
        if (fVar == null) {
            l.n("databaseConfiguration");
            fVar = null;
        }
        fVar.getClass();
    }

    public final void e(f fVar) {
        l.e(fVar, "databaseConfiguration");
        this.f12298k = fVar;
    }

    public final void f(boolean z4) {
        String databaseName = getDatabaseName();
        if (databaseName != null) {
            File databasePath = this.f12292e.getDatabasePath(databaseName);
            f fVar = this.f12298k;
            f fVar2 = null;
            if (fVar == null) {
                l.n("databaseConfiguration");
                fVar = null;
            }
            boolean z5 = fVar.f12171s;
            File filesDir = this.f12292e.getFilesDir();
            l.d(filesDir, "context.filesDir");
            a aVar = new a(databaseName, filesDir, z5);
            try {
                a.c(aVar, false, 1, (Object) null);
                if (!databasePath.exists()) {
                    l.d(databasePath, "databaseFile");
                    c(databasePath, z4);
                    aVar.d();
                    return;
                }
                try {
                    l.d(databasePath, "databaseFile");
                    int c4 = C0960b.c(databasePath);
                    if (c4 == this.f12296i) {
                        aVar.d();
                        return;
                    }
                    f fVar3 = this.f12298k;
                    if (fVar3 == null) {
                        l.n("databaseConfiguration");
                    } else {
                        fVar2 = fVar3;
                    }
                    if (fVar2.a(c4, this.f12296i)) {
                        aVar.d();
                        return;
                    }
                    if (this.f12292e.deleteDatabase(databaseName)) {
                        try {
                            c(databasePath, z4);
                        } catch (IOException e4) {
                            Log.w("ROOM", "Unable to copy database file.", e4);
                        }
                    } else {
                        Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                    }
                    aVar.d();
                } catch (IOException e5) {
                    Log.w("ROOM", "Unable to read database version.", e5);
                    aVar.d();
                }
            } catch (IOException e6) {
                throw new RuntimeException("Unable to copy database file.", e6);
            } catch (Throwable th) {
                aVar.d();
                throw th;
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public String getDatabaseName() {
        return b().getDatabaseName();
    }

    public g getWritableDatabase() {
        if (!this.f12299l) {
            f(true);
            this.f12299l = true;
        }
        return b().getWritableDatabase();
    }

    public void setWriteAheadLoggingEnabled(boolean z4) {
        b().setWriteAheadLoggingEnabled(z4);
    }
}
