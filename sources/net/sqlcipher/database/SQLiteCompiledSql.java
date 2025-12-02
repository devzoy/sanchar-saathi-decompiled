package net.sqlcipher.database;

import android.util.Log;

class SQLiteCompiledSql {
    private static final String TAG = "SQLiteCompiledSql";
    SQLiteDatabase mDatabase;
    private boolean mInUse = false;
    private String mSqlStmt = null;
    long nHandle = 0;
    long nStatement = 0;

    public SQLiteCompiledSql(SQLiteDatabase sQLiteDatabase, String str) {
        if (sQLiteDatabase.isOpen()) {
            this.mDatabase = sQLiteDatabase;
            this.mSqlStmt = str;
            this.nHandle = sQLiteDatabase.mNativeHandle;
            compile(str, true);
            return;
        }
        throw new IllegalStateException("database " + sQLiteDatabase.getPath() + " already closed");
    }

    private void compile(String str, boolean z4) {
        if (!this.mDatabase.isOpen()) {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        } else if (z4) {
            this.mDatabase.lock();
            try {
                native_compile(str);
            } finally {
                this.mDatabase.unlock();
            }
        }
    }

    private final native void native_compile(String str);

    private final native void native_finalize();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean acquire() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.mInUse     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0008
            monitor-exit(r5)
            r0 = 0
            return r0
        L_0x0008:
            r0 = 1
            r5.mInUse = r0     // Catch:{ all -> 0x002d }
            boolean r1 = net.sqlcipher.database.SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = "SQLiteCompiledSql"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r2.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r3 = "Acquired DbObj (id#"
            r2.append(r3)     // Catch:{ all -> 0x002d }
            long r3 = r5.nStatement     // Catch:{ all -> 0x002d }
            r2.append(r3)     // Catch:{ all -> 0x002d }
            java.lang.String r3 = ") from DB cache"
            r2.append(r3)     // Catch:{ all -> 0x002d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x002d }
            android.util.Log.v(r1, r2)     // Catch:{ all -> 0x002d }
            goto L_0x002f
        L_0x002d:
            r0 = move-exception
            goto L_0x0031
        L_0x002f:
            monitor-exit(r5)
            return r0
        L_0x0031:
            monitor-exit(r5)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteCompiledSql.acquire():boolean");
    }

    public void finalize() {
        try {
            if (this.nStatement == 0) {
                super.finalize();
                return;
            }
            if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                Log.v(TAG, "** warning ** Finalized DbObj (id#" + this.nStatement + ")");
            }
            releaseSqlStatement();
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public synchronized void release() {
        try {
            if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                Log.v(TAG, "Released DbObj (id#" + this.nStatement + ") back to DB cache");
            }
            this.mInUse = false;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void releaseSqlStatement() {
        if (this.nStatement != 0) {
            if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                Log.v(TAG, "closed and deallocated DbObj (id#" + this.nStatement + ")");
            }
            native_finalize();
            this.nStatement = 0;
        }
    }
}
