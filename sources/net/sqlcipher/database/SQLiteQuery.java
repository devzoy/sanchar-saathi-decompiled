package net.sqlcipher.database;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteMisuseException;
import android.os.SystemClock;
import android.util.Log;
import net.sqlcipher.CursorWindow;

public class SQLiteQuery extends SQLiteProgram {
    private static final String TAG = "Cursor";
    private String[] mBindArgs;
    private Object[] mObjectBindArgs;
    private int mOffsetIndex;

    public SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, int i4, String[] strArr) {
        super(sQLiteDatabase, str);
        this.mOffsetIndex = i4;
        this.mBindArgs = strArr;
    }

    private final native int native_column_count();

    private final native String native_column_name(int i4);

    private final native int native_fill_window(CursorWindow cursorWindow, int i4, int i5, int i6, int i7, int i8);

    public void bindArguments(Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (int i4 = 0; i4 < objArr.length; i4++) {
                Double d4 = objArr[i4];
                if (d4 == null) {
                    bindNull(i4 + 1);
                } else if (d4 instanceof Double) {
                    bindDouble(i4 + 1, d4.doubleValue());
                } else if (d4 instanceof Float) {
                    bindDouble(i4 + 1, (double) d4.floatValue());
                } else if (d4 instanceof Long) {
                    bindLong(i4 + 1, ((Long) d4).longValue());
                } else if (d4 instanceof Integer) {
                    bindLong(i4 + 1, (long) d4.intValue());
                } else if (d4 instanceof Boolean) {
                    bindLong(i4 + 1, ((Boolean) d4).booleanValue() ? 1 : 0);
                } else if (d4 instanceof byte[]) {
                    bindBlob(i4 + 1, (byte[]) d4);
                } else {
                    bindString(i4 + 1, d4.toString());
                }
            }
        }
    }

    public void bindDouble(int i4, double d4) {
        this.mBindArgs[i4 - 1] = Double.toString(d4);
        if (!this.mClosed) {
            super.bindDouble(i4, d4);
        }
    }

    public void bindLong(int i4, long j4) {
        this.mBindArgs[i4 - 1] = Long.toString(j4);
        if (!this.mClosed) {
            super.bindLong(i4, j4);
        }
    }

    public void bindNull(int i4) {
        this.mBindArgs[i4 - 1] = null;
        if (!this.mClosed) {
            super.bindNull(i4);
        }
    }

    public void bindString(int i4, String str) {
        this.mBindArgs[i4 - 1] = str;
        if (!this.mClosed) {
            super.bindString(i4, str);
        }
    }

    public int columnCountLocked() {
        acquireReference();
        try {
            return native_column_count();
        } finally {
            releaseReference();
        }
    }

    public String columnNameLocked(int i4) {
        acquireReference();
        try {
            return native_column_name(i4);
        } finally {
            releaseReference();
        }
    }

    public int fillWindow(CursorWindow cursorWindow, int i4, int i5) {
        SystemClock.uptimeMillis();
        this.mDatabase.lock();
        try {
            acquireReference();
            cursorWindow.acquireReference();
            int native_fill_window = native_fill_window(cursorWindow, cursorWindow.getStartPosition(), cursorWindow.getRequiredPosition(), this.mOffsetIndex, i4, i5);
            if (SQLiteDebug.DEBUG_SQL_STATEMENTS) {
                Log.d(TAG, "fillWindow(): " + this.mSql);
            }
            cursorWindow.releaseReference();
            releaseReference();
            this.mDatabase.unlock();
            return native_fill_window;
        } catch (IllegalStateException unused) {
            cursorWindow.releaseReference();
            releaseReference();
            this.mDatabase.unlock();
            return 0;
        } catch (SQLiteDatabaseCorruptException e4) {
            this.mDatabase.onCorruption();
            throw e4;
        } catch (Throwable th) {
            releaseReference();
            this.mDatabase.unlock();
            throw th;
        }
    }

    public void requery() {
        String[] strArr = this.mBindArgs;
        if (strArr != null) {
            int length = strArr.length;
            try {
                Object[] objArr = this.mObjectBindArgs;
                if (objArr != null) {
                    bindArguments(objArr);
                    return;
                }
                int i4 = 0;
                while (i4 < length) {
                    int i5 = i4 + 1;
                    super.bindString(i5, this.mBindArgs[i4]);
                    i4 = i5;
                }
            } catch (SQLiteMisuseException e4) {
                StringBuilder sb = new StringBuilder("mSql " + this.mSql);
                for (int i6 = 0; i6 < length; i6++) {
                    sb.append(" ");
                    sb.append(this.mBindArgs[i6]);
                }
                sb.append(" ");
                throw new IllegalStateException(sb.toString(), e4);
            }
        }
    }

    public String toString() {
        return "SQLiteQuery: " + this.mSql;
    }

    public SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, int i4, Object[] objArr) {
        super(sQLiteDatabase, str);
        this.mOffsetIndex = i4;
        this.mObjectBindArgs = objArr;
        this.mBindArgs = new String[(objArr != null ? objArr.length : 0)];
    }
}
