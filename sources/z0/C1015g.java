package z0;

import android.database.sqlite.SQLiteProgram;
import v3.l;
import y0.i;

/* renamed from: z0.g  reason: case insensitive filesystem */
public class C1015g implements i {

    /* renamed from: e  reason: collision with root package name */
    public final SQLiteProgram f12857e;

    public C1015g(SQLiteProgram sQLiteProgram) {
        l.e(sQLiteProgram, "delegate");
        this.f12857e = sQLiteProgram;
    }

    public void bindBlob(int i4, byte[] bArr) {
        l.e(bArr, "value");
        this.f12857e.bindBlob(i4, bArr);
    }

    public void bindDouble(int i4, double d4) {
        this.f12857e.bindDouble(i4, d4);
    }

    public void bindLong(int i4, long j4) {
        this.f12857e.bindLong(i4, j4);
    }

    public void bindNull(int i4) {
        this.f12857e.bindNull(i4);
    }

    public void bindString(int i4, String str) {
        l.e(str, "value");
        this.f12857e.bindString(i4, str);
    }

    public void close() {
        this.f12857e.close();
    }
}
