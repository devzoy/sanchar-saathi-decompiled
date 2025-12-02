package net.sqlcipher.database;

import net.sqlcipher.Cursor;

public class SQLiteDirectCursorDriver implements SQLiteCursorDriver {
    private Cursor mCursor;
    private SQLiteDatabase mDatabase;
    private String mEditTable;
    private SQLiteQuery mQuery;
    private String mSql;

    public SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        this.mDatabase = sQLiteDatabase;
        this.mEditTable = str2;
        this.mSql = str;
    }

    public void cursorClosed() {
        this.mCursor = null;
    }

    public void cursorDeactivated() {
    }

    public void cursorRequeried(android.database.Cursor cursor) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public net.sqlcipher.Cursor query(net.sqlcipher.database.SQLiteDatabase.CursorFactory r5, java.lang.Object[] r6) {
        /*
            r4 = this;
            net.sqlcipher.database.SQLiteQuery r0 = new net.sqlcipher.database.SQLiteQuery
            net.sqlcipher.database.SQLiteDatabase r1 = r4.mDatabase
            java.lang.String r2 = r4.mSql
            r3 = 0
            r0.<init>((net.sqlcipher.database.SQLiteDatabase) r1, (java.lang.String) r2, (int) r3, (java.lang.Object[]) r6)
            r0.bindArguments(r6)     // Catch:{ all -> 0x001b }
            if (r5 != 0) goto L_0x001d
            net.sqlcipher.database.SQLiteCursor r5 = new net.sqlcipher.database.SQLiteCursor     // Catch:{ all -> 0x001b }
            net.sqlcipher.database.SQLiteDatabase r6 = r4.mDatabase     // Catch:{ all -> 0x001b }
            java.lang.String r1 = r4.mEditTable     // Catch:{ all -> 0x001b }
            r5.<init>(r6, r4, r1, r0)     // Catch:{ all -> 0x001b }
            r4.mCursor = r5     // Catch:{ all -> 0x001b }
            goto L_0x0027
        L_0x001b:
            r5 = move-exception
            goto L_0x002e
        L_0x001d:
            net.sqlcipher.database.SQLiteDatabase r6 = r4.mDatabase     // Catch:{ all -> 0x001b }
            java.lang.String r1 = r4.mEditTable     // Catch:{ all -> 0x001b }
            net.sqlcipher.Cursor r5 = r5.newCursor(r6, r4, r1, r0)     // Catch:{ all -> 0x001b }
            r4.mCursor = r5     // Catch:{ all -> 0x001b }
        L_0x0027:
            r4.mQuery = r0     // Catch:{ all -> 0x001b }
            net.sqlcipher.Cursor r5 = r4.mCursor     // Catch:{ all -> 0x002c }
            return r5
        L_0x002c:
            r5 = move-exception
            r0 = 0
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r0.close()
        L_0x0033:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDirectCursorDriver.query(net.sqlcipher.database.SQLiteDatabase$CursorFactory, java.lang.Object[]):net.sqlcipher.Cursor");
    }

    public void setBindArguments(String[] strArr) {
        int length = strArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1;
            this.mQuery.bindString(i5, strArr[i4]);
            i4 = i5;
        }
    }

    public String toString() {
        return "SQLiteDirectCursorDriver: " + this.mSql;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public net.sqlcipher.Cursor query(net.sqlcipher.database.SQLiteDatabase.CursorFactory r5, java.lang.String[] r6) {
        /*
            r4 = this;
            net.sqlcipher.database.SQLiteQuery r0 = new net.sqlcipher.database.SQLiteQuery
            net.sqlcipher.database.SQLiteDatabase r1 = r4.mDatabase
            java.lang.String r2 = r4.mSql
            r3 = 0
            r0.<init>((net.sqlcipher.database.SQLiteDatabase) r1, (java.lang.String) r2, (int) r3, (java.lang.String[]) r6)
            if (r6 != 0) goto L_0x000e
            r1 = r3
            goto L_0x000f
        L_0x000e:
            int r1 = r6.length     // Catch:{ all -> 0x001a }
        L_0x000f:
            if (r3 >= r1) goto L_0x001c
            int r2 = r3 + 1
            r3 = r6[r3]     // Catch:{ all -> 0x001a }
            r0.bindString(r2, r3)     // Catch:{ all -> 0x001a }
            r3 = r2
            goto L_0x000f
        L_0x001a:
            r5 = move-exception
            goto L_0x003b
        L_0x001c:
            if (r5 != 0) goto L_0x002a
            net.sqlcipher.database.SQLiteCursor r5 = new net.sqlcipher.database.SQLiteCursor     // Catch:{ all -> 0x001a }
            net.sqlcipher.database.SQLiteDatabase r6 = r4.mDatabase     // Catch:{ all -> 0x001a }
            java.lang.String r1 = r4.mEditTable     // Catch:{ all -> 0x001a }
            r5.<init>(r6, r4, r1, r0)     // Catch:{ all -> 0x001a }
            r4.mCursor = r5     // Catch:{ all -> 0x001a }
            goto L_0x0034
        L_0x002a:
            net.sqlcipher.database.SQLiteDatabase r6 = r4.mDatabase     // Catch:{ all -> 0x001a }
            java.lang.String r1 = r4.mEditTable     // Catch:{ all -> 0x001a }
            net.sqlcipher.Cursor r5 = r5.newCursor(r6, r4, r1, r0)     // Catch:{ all -> 0x001a }
            r4.mCursor = r5     // Catch:{ all -> 0x001a }
        L_0x0034:
            r4.mQuery = r0     // Catch:{ all -> 0x001a }
            net.sqlcipher.Cursor r5 = r4.mCursor     // Catch:{ all -> 0x0039 }
            return r5
        L_0x0039:
            r5 = move-exception
            r0 = 0
        L_0x003b:
            if (r0 == 0) goto L_0x0040
            r0.close()
        L_0x0040:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDirectCursorDriver.query(net.sqlcipher.database.SQLiteDatabase$CursorFactory, java.lang.String[]):net.sqlcipher.Cursor");
    }
}
