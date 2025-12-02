package w0;

import C3.o;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import h3.C0673n;
import i3.C0737n;
import java.util.List;
import s3.b;
import u0.u;
import v3.l;
import y0.g;
import y0.j;

/* renamed from: w0.b  reason: case insensitive filesystem */
public abstract class C0960b {
    public static final void a(g gVar) {
        l.e(gVar, "db");
        List c4 = C0737n.c();
        Cursor query = gVar.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (query.moveToNext()) {
            try {
                c4.add(query.getString(0));
            } catch (Throwable th) {
                b.a(query, th);
                throw th;
            }
        }
        C0673n nVar = C0673n.f9639a;
        b.a(query, (Throwable) null);
        for (String str : C0737n.a(c4)) {
            l.d(str, "triggerName");
            if (o.v(str, "room_fts_content_sync_", false, 2, (Object) null)) {
                gVar.execSQL("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static final Cursor b(u uVar, j jVar, boolean z4, CancellationSignal cancellationSignal) {
        l.e(uVar, "db");
        l.e(jVar, "sqLiteQuery");
        Cursor x4 = uVar.x(jVar, cancellationSignal);
        if (!z4 || !(x4 instanceof AbstractWindowedCursor)) {
            return x4;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) x4;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? C0959a.a(x4) : x4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        s3.b.a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int c(java.io.File r8) {
        /*
            java.lang.String r0 = "databaseFile"
            v3.l.e(r8, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r8)
            java.nio.channels.FileChannel r8 = r0.getChannel()
            r0 = 4
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ all -> 0x0033 }
            r4 = 4
            r6 = 1
            r2 = 60
            r1 = r8
            r1.tryLock(r2, r4, r6)     // Catch:{ all -> 0x0033 }
            r1 = 60
            r8.position(r1)     // Catch:{ all -> 0x0033 }
            int r1 = r8.read(r7)     // Catch:{ all -> 0x0033 }
            if (r1 != r0) goto L_0x0035
            r7.rewind()     // Catch:{ all -> 0x0033 }
            int r0 = r7.getInt()     // Catch:{ all -> 0x0033 }
            r1 = 0
            s3.b.a(r8, r1)
            return r0
        L_0x0033:
            r0 = move-exception
            goto L_0x003d
        L_0x0035:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "Bad database header, unable to read 4 bytes at offset 60"
            r0.<init>(r1)     // Catch:{ all -> 0x0033 }
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x003d:
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r1 = move-exception
            s3.b.a(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.C0960b.c(java.io.File):int");
    }
}
