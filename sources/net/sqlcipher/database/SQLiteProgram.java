package net.sqlcipher.database;

import android.util.Log;
import y0.i;

public abstract class SQLiteProgram extends SQLiteClosable implements i {
    private static final String TAG = "SQLiteProgram";
    boolean mClosed = false;
    private SQLiteCompiledSql mCompiledSql;
    @Deprecated
    protected SQLiteDatabase mDatabase;
    final String mSql;
    @Deprecated
    protected long nHandle = 0;
    @Deprecated
    protected long nStatement = 0;

    public SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str) {
        this.mDatabase = sQLiteDatabase;
        String trim = str.trim();
        this.mSql = trim;
        sQLiteDatabase.acquireReference();
        sQLiteDatabase.addSQLiteClosable(this);
        this.nHandle = sQLiteDatabase.mNativeHandle;
        trim = trim.length() >= 6 ? trim.substring(0, 6) : trim;
        if (trim.equalsIgnoreCase("INSERT") || trim.equalsIgnoreCase("UPDATE") || trim.equalsIgnoreCase("REPLAC") || trim.equalsIgnoreCase("DELETE") || trim.equalsIgnoreCase("SELECT")) {
            SQLiteCompiledSql compiledStatementForSql = sQLiteDatabase.getCompiledStatementForSql(str);
            this.mCompiledSql = compiledStatementForSql;
            if (compiledStatementForSql == null) {
                SQLiteCompiledSql sQLiteCompiledSql = new SQLiteCompiledSql(sQLiteDatabase, str);
                this.mCompiledSql = sQLiteCompiledSql;
                sQLiteCompiledSql.acquire();
                sQLiteDatabase.addToCompiledQueries(str, this.mCompiledSql);
                if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                    Log.v(TAG, "Created DbObj (id#" + this.mCompiledSql.nStatement + ") for sql: " + str);
                }
            } else if (!compiledStatementForSql.acquire()) {
                long j4 = this.mCompiledSql.nStatement;
                this.mCompiledSql = new SQLiteCompiledSql(sQLiteDatabase, str);
                if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                    Log.v(TAG, "** possible bug ** Created NEW DbObj (id#" + this.mCompiledSql.nStatement + ") because the previously created DbObj (id#" + j4 + ") was not released for sql:" + str);
                }
            }
            this.nStatement = this.mCompiledSql.nStatement;
            return;
        }
        SQLiteCompiledSql sQLiteCompiledSql2 = new SQLiteCompiledSql(sQLiteDatabase, str);
        this.mCompiledSql = sQLiteCompiledSql2;
        this.nStatement = sQLiteCompiledSql2.nStatement;
    }

    private final native void native_clear_bindings();

    private void releaseCompiledSqlIfNotInCache() {
        if (this.mCompiledSql != null) {
            synchronized (this.mDatabase.mCompiledQueries) {
                try {
                    if (!this.mDatabase.mCompiledQueries.containsValue(this.mCompiledSql)) {
                        this.mCompiledSql.releaseSqlStatement();
                        this.mCompiledSql = null;
                        this.nStatement = 0;
                    } else {
                        this.mCompiledSql.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void bindBlob(int i4, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("the bind value at index " + i4 + " is null");
        } else if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_blob(i4, bArr);
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    public void bindDouble(int i4, double d4) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_double(i4, d4);
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    public void bindLong(int i4, long j4) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_long(i4, j4);
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    public void bindNull(int i4) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_null(i4);
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    public void bindString(int i4, String str) {
        if (str == null) {
            throw new IllegalArgumentException("the bind value at index " + i4 + " is null");
        } else if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_string(i4, str);
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    public void clearBindings() {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_clear_bindings();
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        if (!this.mClosed && this.mDatabase.isOpen()) {
            this.mDatabase.lock();
            try {
                releaseReference();
                this.mDatabase.unlock();
                this.mClosed = true;
            } catch (Throwable th) {
                this.mDatabase.unlock();
                throw th;
            }
        }
    }

    @Deprecated
    public void compile(String str, boolean z4) {
    }

    public String getSqlString() {
        return this.mSql;
    }

    public final long getUniqueId() {
        return this.nStatement;
    }

    public final native void native_bind_blob(int i4, byte[] bArr);

    public final native void native_bind_double(int i4, double d4);

    public final native void native_bind_long(int i4, long j4);

    public final native void native_bind_null(int i4);

    public final native void native_bind_string(int i4, String str);

    @Deprecated
    public final native void native_compile(String str);

    @Deprecated
    public final native void native_finalize();

    public void onAllReferencesReleased() {
        releaseCompiledSqlIfNotInCache();
        this.mDatabase.releaseReference();
        this.mDatabase.removeSQLiteClosable(this);
    }

    public void onAllReferencesReleasedFromContainer() {
        releaseCompiledSqlIfNotInCache();
        this.mDatabase.releaseReference();
    }
}
