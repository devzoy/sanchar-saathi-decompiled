package y0;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;
import v3.l;

public interface g extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    k compileStatement(String str);

    void endTransaction();

    void execPerConnectionSQL(String str, Object[] objArr) {
        l.e(str, "sql");
        throw new UnsupportedOperationException();
    }

    void execSQL(String str);

    void execSQL(String str, Object[] objArr);

    List getAttachedDbs();

    String getPath();

    boolean inTransaction();

    boolean isExecPerConnectionSQLSupported() {
        return false;
    }

    boolean isOpen();

    boolean isWriteAheadLoggingEnabled();

    Cursor query(String str);

    Cursor query(j jVar);

    Cursor query(j jVar, CancellationSignal cancellationSignal);

    void setTransactionSuccessful();

    int update(String str, int i4, ContentValues contentValues, String str2, Object[] objArr);
}
