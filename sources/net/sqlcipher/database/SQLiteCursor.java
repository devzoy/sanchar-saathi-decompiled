package net.sqlcipher.database;

import android.database.DataSetObserver;
import android.database.SQLException;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import net.sqlcipher.AbstractWindowedCursor;
import net.sqlcipher.CursorWindow;

public class SQLiteCursor extends AbstractWindowedCursor {
    static final int NO_COUNT = -1;
    static final String TAG = "Cursor";
    private boolean fillWindowForwardOnly;
    private Map<String, Integer> mColumnNameMap;
    private String[] mColumns;
    /* access modifiers changed from: private */
    public int mCount = NO_COUNT;
    /* access modifiers changed from: private */
    public int mCursorState;
    private int mCursorWindowCapacity;
    private SQLiteDatabase mDatabase;
    private SQLiteCursorDriver mDriver;
    private String mEditTable;
    private int mInitialRead;
    /* access modifiers changed from: private */
    public ReentrantLock mLock;
    /* access modifiers changed from: private */
    public int mMaxRead;
    protected MainThreadNotificationHandler mNotificationHandler;
    /* access modifiers changed from: private */
    public boolean mPendingData;
    /* access modifiers changed from: private */
    public SQLiteQuery mQuery;
    private Throwable mStackTrace;

    public static class MainThreadNotificationHandler extends Handler {
        private final WeakReference<SQLiteCursor> wrappedCursor;

        public MainThreadNotificationHandler(SQLiteCursor sQLiteCursor) {
            this.wrappedCursor = new WeakReference<>(sQLiteCursor);
        }

        public void handleMessage(Message message) {
            SQLiteCursor sQLiteCursor = this.wrappedCursor.get();
            if (sQLiteCursor != null) {
                sQLiteCursor.notifyDataSetChange();
            }
        }
    }

    public final class QueryThread implements Runnable {
        private final int mThreadState;

        public QueryThread(int i4) {
            this.mThreadState = i4;
        }

        private void sendMessage() {
            SQLiteCursor sQLiteCursor = SQLiteCursor.this;
            MainThreadNotificationHandler mainThreadNotificationHandler = sQLiteCursor.mNotificationHandler;
            if (mainThreadNotificationHandler != null) {
                mainThreadNotificationHandler.sendEmptyMessage(1);
                boolean unused = SQLiteCursor.this.mPendingData = false;
                return;
            }
            boolean unused2 = sQLiteCursor.mPendingData = true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            net.sqlcipher.database.SQLiteCursor.access$502(r4.this$0, r1);
            sendMessage();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                net.sqlcipher.database.SQLiteCursor r0 = net.sqlcipher.database.SQLiteCursor.this
                net.sqlcipher.CursorWindow r0 = r0.mWindow
                int r1 = android.os.Process.myTid()
                r2 = 10
                android.os.Process.setThreadPriority(r1, r2)
            L_0x000f:
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r1 = r1.mLock
                if (r1 != 0) goto L_0x0022
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock
                r3 = 1
                r2.<init>(r3)
                java.util.concurrent.locks.ReentrantLock unused = r1.mLock = r2
            L_0x0022:
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r1 = r1.mLock
                r1.lock()
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                int r1 = r1.mCursorState
                int r2 = r4.mThreadState
                if (r1 == r2) goto L_0x003f
                net.sqlcipher.database.SQLiteCursor r0 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r0 = r0.mLock
                r0.unlock()
                goto L_0x008e
            L_0x003f:
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this     // Catch:{ Exception -> 0x007a, all -> 0x0070 }
                net.sqlcipher.database.SQLiteQuery r1 = r1.mQuery     // Catch:{ Exception -> 0x007a, all -> 0x0070 }
                net.sqlcipher.database.SQLiteCursor r2 = net.sqlcipher.database.SQLiteCursor.this     // Catch:{ Exception -> 0x007a, all -> 0x0070 }
                int r2 = r2.mMaxRead     // Catch:{ Exception -> 0x007a, all -> 0x0070 }
                net.sqlcipher.database.SQLiteCursor r3 = net.sqlcipher.database.SQLiteCursor.this     // Catch:{ Exception -> 0x007a, all -> 0x0070 }
                int r3 = r3.mCount     // Catch:{ Exception -> 0x007a, all -> 0x0070 }
                int r1 = r1.fillWindow(r0, r2, r3)     // Catch:{ Exception -> 0x007a, all -> 0x0070 }
                if (r1 == 0) goto L_0x007a
                r2 = -1
                if (r1 != r2) goto L_0x0072
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this     // Catch:{ Exception -> 0x007a, all -> 0x0070 }
                int r2 = r1.mMaxRead     // Catch:{ Exception -> 0x007a, all -> 0x0070 }
                net.sqlcipher.database.SQLiteCursor.access$512(r1, r2)     // Catch:{ Exception -> 0x007a, all -> 0x0070 }
                r4.sendMessage()     // Catch:{ Exception -> 0x007a, all -> 0x0070 }
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r1 = r1.mLock
                r1.unlock()
                goto L_0x000f
            L_0x0070:
                r0 = move-exception
                goto L_0x0084
            L_0x0072:
                net.sqlcipher.database.SQLiteCursor r0 = net.sqlcipher.database.SQLiteCursor.this     // Catch:{ Exception -> 0x007a, all -> 0x0070 }
                int unused = r0.mCount = r1     // Catch:{ Exception -> 0x007a, all -> 0x0070 }
                r4.sendMessage()     // Catch:{ Exception -> 0x007a, all -> 0x0070 }
            L_0x007a:
                net.sqlcipher.database.SQLiteCursor r0 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r0 = r0.mLock
                r0.unlock()
                goto L_0x008e
            L_0x0084:
                net.sqlcipher.database.SQLiteCursor r1 = net.sqlcipher.database.SQLiteCursor.this
                java.util.concurrent.locks.ReentrantLock r1 = r1.mLock
                r1.unlock()
                throw r0
            L_0x008e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteCursor.QueryThread.run():void");
        }
    }

    public SQLiteCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.mCursorWindowCapacity = 0;
        this.fillWindowForwardOnly = false;
        this.mMaxRead = Integer.MAX_VALUE;
        this.mInitialRead = Integer.MAX_VALUE;
        this.mCursorState = 0;
        this.mLock = null;
        this.mPendingData = false;
        this.mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();
        this.mDatabase = sQLiteDatabase;
        this.mDriver = sQLiteCursorDriver;
        this.mEditTable = str;
        this.mColumnNameMap = null;
        this.mQuery = sQLiteQuery;
        try {
            sQLiteDatabase.lock();
            int columnCountLocked = this.mQuery.columnCountLocked();
            this.mColumns = new String[columnCountLocked];
            for (int i4 = 0; i4 < columnCountLocked; i4++) {
                String columnNameLocked = this.mQuery.columnNameLocked(i4);
                this.mColumns[i4] = columnNameLocked;
                if ("_id".equals(columnNameLocked)) {
                    this.mRowIdColumnIndex = i4;
                }
            }
        } finally {
            sQLiteDatabase.unlock();
        }
    }

    public static /* synthetic */ int access$512(SQLiteCursor sQLiteCursor, int i4) {
        int i5 = sQLiteCursor.mCount + i4;
        sQLiteCursor.mCount = i5;
        return i5;
    }

    private void deactivateCommon() {
        this.mCursorState = 0;
        CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow != null) {
            cursorWindow.close();
            this.mWindow = null;
        }
    }

    private void fillWindow(int i4) {
        int i5;
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
            } finally {
                queryThreadUnlock();
            }
        }
        if (this.fillWindowForwardOnly) {
            i5 = i4;
        } else if (this.mCount == NO_COUNT) {
            i5 = cursorPickFillWindowStartPosition(i4, 0);
        } else {
            i5 = cursorPickFillWindowStartPosition(i4, this.mCursorWindowCapacity);
        }
        this.mWindow.setStartPosition(i5);
        this.mWindow.setRequiredPosition(i4);
        this.mCount = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        if (this.mCursorWindowCapacity == 0) {
            this.mCursorWindowCapacity = this.mWindow.getNumRows();
        }
        if (this.mCount == NO_COUNT) {
            this.mCount = i5 + this.mInitialRead;
            new Thread(new QueryThread(this.mCursorState), "query thread").start();
        }
    }

    private void queryThreadLock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.lock();
        }
    }

    private void queryThreadUnlock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.unlock();
        }
    }

    public void close() {
        super.close();
        deactivateCommon();
        this.mQuery.close();
        this.mDriver.cursorClosed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b7, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r11.mDatabase.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012d, code lost:
        throw r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean commitUpdates(java.util.Map<? extends java.lang.Long, ? extends java.util.Map<java.lang.String, java.lang.Object>> r12) {
        /*
            r11 = this;
            boolean r0 = r11.supportsUpdates()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r11.mUpdatedRows
            monitor-enter(r0)
            if (r12 == 0) goto L_0x0016
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r2 = r11.mUpdatedRows     // Catch:{ all -> 0x0013 }
            r2.putAll(r12)     // Catch:{ all -> 0x0013 }
            goto L_0x0016
        L_0x0013:
            r12 = move-exception
            goto L_0x012e
        L_0x0016:
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r12 = r11.mUpdatedRows     // Catch:{ all -> 0x0013 }
            int r12 = r12.size()     // Catch:{ all -> 0x0013 }
            r2 = 1
            if (r12 != 0) goto L_0x0021
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return r2
        L_0x0021:
            net.sqlcipher.database.SQLiteDatabase r12 = r11.mDatabase     // Catch:{ all -> 0x0013 }
            r12.beginTransaction()     // Catch:{ all -> 0x0013 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
            r3 = 128(0x80, float:1.794E-43)
            r12.<init>(r3)     // Catch:{ all -> 0x00b7 }
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r3 = r11.mUpdatedRows     // Catch:{ all -> 0x00b7 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x00b7 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00b7 }
        L_0x0037:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00b7 }
            if (r4 == 0) goto L_0x0114
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00b7 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x00b7 }
            java.lang.Object r5 = r4.getValue()     // Catch:{ all -> 0x00b7 }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ all -> 0x00b7 }
            java.lang.Object r4 = r4.getKey()     // Catch:{ all -> 0x00b7 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x00b7 }
            if (r4 == 0) goto L_0x00f5
            if (r5 == 0) goto L_0x00f5
            int r6 = r5.size()     // Catch:{ all -> 0x00b7 }
            if (r6 != 0) goto L_0x005a
            goto L_0x0037
        L_0x005a:
            long r6 = r4.longValue()     // Catch:{ all -> 0x00b7 }
            java.util.Set r4 = r5.entrySet()     // Catch:{ all -> 0x00b7 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00b7 }
            r12.setLength(r1)     // Catch:{ all -> 0x00b7 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
            r8.<init>()     // Catch:{ all -> 0x00b7 }
            java.lang.String r9 = "UPDATE "
            r8.append(r9)     // Catch:{ all -> 0x00b7 }
            java.lang.String r9 = r11.mEditTable     // Catch:{ all -> 0x00b7 }
            r8.append(r9)     // Catch:{ all -> 0x00b7 }
            java.lang.String r9 = " SET "
            r8.append(r9)     // Catch:{ all -> 0x00b7 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00b7 }
            r12.append(r8)     // Catch:{ all -> 0x00b7 }
            int r5 = r5.size()     // Catch:{ all -> 0x00b7 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00b7 }
            r8 = r1
        L_0x008b:
            boolean r9 = r4.hasNext()     // Catch:{ all -> 0x00b7 }
            if (r9 == 0) goto L_0x00bc
            java.lang.Object r9 = r4.next()     // Catch:{ all -> 0x00b7 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ all -> 0x00b7 }
            java.lang.Object r10 = r9.getKey()     // Catch:{ all -> 0x00b7 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x00b7 }
            r12.append(r10)     // Catch:{ all -> 0x00b7 }
            java.lang.String r10 = "=?"
            r12.append(r10)     // Catch:{ all -> 0x00b7 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x00b7 }
            r5[r8] = r9     // Catch:{ all -> 0x00b7 }
            boolean r9 = r4.hasNext()     // Catch:{ all -> 0x00b7 }
            if (r9 == 0) goto L_0x00b9
            java.lang.String r9 = ", "
            r12.append(r9)     // Catch:{ all -> 0x00b7 }
            goto L_0x00b9
        L_0x00b7:
            r12 = move-exception
            goto L_0x0128
        L_0x00b9:
            int r8 = r8 + 1
            goto L_0x008b
        L_0x00bc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
            r4.<init>()     // Catch:{ all -> 0x00b7 }
            java.lang.String r8 = " WHERE "
            r4.append(r8)     // Catch:{ all -> 0x00b7 }
            java.lang.String[] r8 = r11.mColumns     // Catch:{ all -> 0x00b7 }
            int r9 = r11.mRowIdColumnIndex     // Catch:{ all -> 0x00b7 }
            r8 = r8[r9]     // Catch:{ all -> 0x00b7 }
            r4.append(r8)     // Catch:{ all -> 0x00b7 }
            r8 = 61
            r4.append(r8)     // Catch:{ all -> 0x00b7 }
            r4.append(r6)     // Catch:{ all -> 0x00b7 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00b7 }
            r12.append(r4)     // Catch:{ all -> 0x00b7 }
            r4 = 59
            r12.append(r4)     // Catch:{ all -> 0x00b7 }
            net.sqlcipher.database.SQLiteDatabase r4 = r11.mDatabase     // Catch:{ all -> 0x00b7 }
            java.lang.String r8 = r12.toString()     // Catch:{ all -> 0x00b7 }
            r4.execSQL(r8, r5)     // Catch:{ all -> 0x00b7 }
            net.sqlcipher.database.SQLiteDatabase r4 = r11.mDatabase     // Catch:{ all -> 0x00b7 }
            java.lang.String r5 = r11.mEditTable     // Catch:{ all -> 0x00b7 }
            r4.rowUpdated(r5, r6)     // Catch:{ all -> 0x00b7 }
            goto L_0x0037
        L_0x00f5:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
            r1.<init>()     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = "null rowId or values found! rowId = "
            r1.append(r2)     // Catch:{ all -> 0x00b7 }
            r1.append(r4)     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = ", values = "
            r1.append(r2)     // Catch:{ all -> 0x00b7 }
            r1.append(r5)     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b7 }
            r12.<init>(r1)     // Catch:{ all -> 0x00b7 }
            throw r12     // Catch:{ all -> 0x00b7 }
        L_0x0114:
            net.sqlcipher.database.SQLiteDatabase r12 = r11.mDatabase     // Catch:{ all -> 0x00b7 }
            r12.setTransactionSuccessful()     // Catch:{ all -> 0x00b7 }
            net.sqlcipher.database.SQLiteDatabase r12 = r11.mDatabase     // Catch:{ all -> 0x0013 }
            r12.endTransaction()     // Catch:{ all -> 0x0013 }
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r12 = r11.mUpdatedRows     // Catch:{ all -> 0x0013 }
            r12.clear()     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            r11.onChange(r2)
            return r2
        L_0x0128:
            net.sqlcipher.database.SQLiteDatabase r1 = r11.mDatabase     // Catch:{ all -> 0x0013 }
            r1.endTransaction()     // Catch:{ all -> 0x0013 }
            throw r12     // Catch:{ all -> 0x0013 }
        L_0x012e:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteCursor.commitUpdates(java.util.Map):boolean");
    }

    public int cursorPickFillWindowStartPosition(int i4, int i5) {
        return Math.max(i4 - (i5 / 3), 0);
    }

    public void deactivate() {
        super.deactivate();
        deactivateCommon();
        this.mDriver.cursorDeactivated();
    }

    public boolean deleteRow() {
        boolean z4;
        checkPosition();
        if (this.mRowIdColumnIndex == NO_COUNT || this.mCurrentRowID == null) {
            return false;
        }
        this.mDatabase.lock();
        try {
            this.mDatabase.delete(this.mEditTable, this.mColumns[this.mRowIdColumnIndex] + "=?", new String[]{this.mCurrentRowID.toString()});
            z4 = true;
        } catch (SQLException unused) {
            z4 = false;
        }
        try {
            int i4 = this.mPos;
            requery();
            moveToPosition(i4);
            if (!z4) {
                return false;
            }
            onChange(true);
            return true;
        } finally {
            this.mDatabase.unlock();
        }
    }

    public void finalize() {
        try {
            if (this.mWindow != null) {
                this.mQuery.mSql.length();
                close();
                SQLiteDebug.notifyActiveCursorFinalized();
            }
        } finally {
            super.finalize();
        }
    }

    public int getColumnIndex(String str) {
        if (this.mColumnNameMap == null) {
            String[] strArr = this.mColumns;
            int length = strArr.length;
            HashMap hashMap = new HashMap(length, 1.0f);
            for (int i4 = 0; i4 < length; i4++) {
                hashMap.put(strArr[i4], Integer.valueOf(i4));
            }
            this.mColumnNameMap = hashMap;
        }
        if (str.lastIndexOf(46) != NO_COUNT) {
            new Exception();
        }
        Integer num = this.mColumnNameMap.get(str);
        return num != null ? num.intValue() : NO_COUNT;
    }

    public String[] getColumnNames() {
        return this.mColumns;
    }

    public int getCount() {
        if (this.mCount == NO_COUNT) {
            fillWindow(0);
        }
        return this.mCount;
    }

    public SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    public boolean onMove(int i4, int i5) {
        CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow != null && i5 >= cursorWindow.getStartPosition() && i5 < this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
            return true;
        }
        fillWindow(i5);
        return true;
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        super.registerDataSetObserver(dataSetObserver);
        if (!(Integer.MAX_VALUE == this.mMaxRead && Integer.MAX_VALUE == this.mInitialRead) && this.mNotificationHandler == null) {
            queryThreadLock();
            try {
                this.mNotificationHandler = new MainThreadNotificationHandler(this);
                if (this.mPendingData) {
                    notifyDataSetChange();
                    this.mPendingData = false;
                }
            } finally {
                queryThreadUnlock();
            }
        }
    }

    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        this.mDatabase.lock();
        try {
            CursorWindow cursorWindow = this.mWindow;
            if (cursorWindow != null) {
                cursorWindow.clear();
            }
            this.mPos = NO_COUNT;
            this.mDriver.cursorRequeried(this);
            this.mCount = NO_COUNT;
            this.mCursorState++;
            queryThreadLock();
            this.mQuery.requery();
            queryThreadUnlock();
            this.mDatabase.unlock();
            return super.requery();
        } catch (Throwable th) {
            this.mDatabase.unlock();
            throw th;
        }
    }

    public void setFillWindowForwardOnly(boolean z4) {
        this.fillWindowForwardOnly = z4;
    }

    public void setLoadStyle(int i4, int i5) {
        this.mMaxRead = i5;
        this.mInitialRead = i4;
        this.mLock = new ReentrantLock(true);
    }

    public void setSelectionArguments(String[] strArr) {
        this.mDriver.setBindArguments(strArr);
    }

    /* JADX INFO: finally extract failed */
    public void setWindow(CursorWindow cursorWindow) {
        if (this.mWindow != null) {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.close();
                queryThreadUnlock();
                this.mCount = NO_COUNT;
            } catch (Throwable th) {
                queryThreadUnlock();
                throw th;
            }
        }
        this.mWindow = cursorWindow;
    }

    public boolean supportsUpdates() {
        return !TextUtils.isEmpty(this.mEditTable);
    }

    public void fillWindow(int i4, android.database.CursorWindow cursorWindow) {
        int i5;
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
            } finally {
                queryThreadUnlock();
            }
        }
        if (this.fillWindowForwardOnly) {
            i5 = i4;
        } else if (this.mCount == NO_COUNT) {
            i5 = cursorPickFillWindowStartPosition(i4, 0);
        } else {
            i5 = cursorPickFillWindowStartPosition(i4, this.mCursorWindowCapacity);
        }
        this.mWindow.setStartPosition(i5);
        this.mWindow.setRequiredPosition(i4);
        this.mCount = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        if (this.mCursorWindowCapacity == 0) {
            this.mCursorWindowCapacity = this.mWindow.getNumRows();
        }
        if (this.mCount == NO_COUNT) {
            this.mCount = i5 + this.mInitialRead;
            new Thread(new QueryThread(this.mCursorState), "query thread").start();
        }
    }
}
