package O3;

import java.io.RandomAccessFile;

public final class l extends f {

    /* renamed from: i  reason: collision with root package name */
    public final RandomAccessFile f2126i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(boolean z4, RandomAccessFile randomAccessFile) {
        super(z4);
        v3.l.e(randomAccessFile, "randomAccessFile");
        this.f2126i = randomAccessFile;
    }

    public synchronized void h() {
        this.f2126i.close();
    }

    public synchronized void i() {
        this.f2126i.getFD().sync();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int j(long r2, byte[] r4, int r5, int r6) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "array"
            v3.l.e(r4, r0)     // Catch:{ all -> 0x001f }
            java.io.RandomAccessFile r0 = r1.f2126i     // Catch:{ all -> 0x001f }
            r0.seek(r2)     // Catch:{ all -> 0x001f }
            r2 = 0
        L_0x000c:
            if (r2 >= r6) goto L_0x0021
            java.io.RandomAccessFile r3 = r1.f2126i     // Catch:{ all -> 0x001f }
            int r0 = r6 - r2
            int r3 = r3.read(r4, r5, r0)     // Catch:{ all -> 0x001f }
            r0 = -1
            if (r3 != r0) goto L_0x001d
            if (r2 != 0) goto L_0x0021
            monitor-exit(r1)
            return r0
        L_0x001d:
            int r2 = r2 + r3
            goto L_0x000c
        L_0x001f:
            r2 = move-exception
            goto L_0x0023
        L_0x0021:
            monitor-exit(r1)
            return r2
        L_0x0023:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.l.j(long, byte[], int, int):int");
    }

    public synchronized long k() {
        return this.f2126i.length();
    }

    public synchronized void l(long j4, byte[] bArr, int i4, int i5) {
        v3.l.e(bArr, "array");
        this.f2126i.seek(j4);
        this.f2126i.write(bArr, i4, i5);
    }
}
