package net.sqlcipher;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.CrossProcessCursor;
import android.database.CursorWindow;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractCursor implements CrossProcessCursor, Cursor {
    private static final String TAG = "Cursor";
    protected boolean mClosed = false;
    ContentObservable mContentObservable = new ContentObservable();
    protected ContentResolver mContentResolver;
    protected Long mCurrentRowID = null;
    DataSetObservable mDataSetObservable = new DataSetObservable();
    private Bundle mExtras = Bundle.EMPTY;
    private Uri mNotifyUri;
    protected int mPos = -1;
    protected int mRowIdColumnIndex = -1;
    private ContentObserver mSelfObserver;
    private final Object mSelfObserverLock = new Object();
    private boolean mSelfObserverRegistered;
    protected HashMap<Long, Map<String, Object>> mUpdatedRows = new HashMap<>();

    public static class SelfContentObserver extends ContentObserver {
        WeakReference<AbstractCursor> mCursor;

        public SelfContentObserver(AbstractCursor abstractCursor) {
            super((Handler) null);
            this.mCursor = new WeakReference<>(abstractCursor);
        }

        public boolean deliverSelfNotifications() {
            return false;
        }

        public void onChange(boolean z4) {
            AbstractCursor abstractCursor = this.mCursor.get();
            if (abstractCursor != null) {
                abstractCursor.onChange(false);
            }
        }
    }

    public void abortUpdates() {
        synchronized (this.mUpdatedRows) {
            this.mUpdatedRows.clear();
        }
    }

    public void checkPosition() {
        if (-1 == this.mPos || getCount() == this.mPos) {
            throw new CursorIndexOutOfBoundsException(this.mPos, getCount());
        }
    }

    public void close() {
        this.mClosed = true;
        this.mContentObservable.unregisterAll();
        deactivateInternal();
    }

    public boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> map) {
        return false;
    }

    public void copyStringToBuffer(int i4, CharArrayBuffer charArrayBuffer) {
        String string = getString(i4);
        if (string != null) {
            char[] cArr = charArrayBuffer.data;
            if (cArr == null || cArr.length < string.length()) {
                charArrayBuffer.data = string.toCharArray();
            } else {
                string.getChars(0, string.length(), cArr, 0);
            }
            charArrayBuffer.sizeCopied = string.length();
            return;
        }
        charArrayBuffer.sizeCopied = 0;
    }

    public void deactivate() {
        deactivateInternal();
    }

    public void deactivateInternal() {
        ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null) {
            this.mContentResolver.unregisterContentObserver(contentObserver);
            this.mSelfObserverRegistered = false;
        }
        this.mDataSetObservable.notifyInvalidated();
    }

    public boolean deleteRow() {
        return false;
    }

    public void fillWindow(int i4, CursorWindow cursorWindow) {
        DatabaseUtils.cursorFillWindow(this, i4, cursorWindow);
    }

    public void finalize() {
        ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null && this.mSelfObserverRegistered) {
            this.mContentResolver.unregisterContentObserver(contentObserver);
        }
    }

    public byte[] getBlob(int i4) {
        throw new UnsupportedOperationException("getBlob is not supported");
    }

    public int getColumnCount() {
        return getColumnNames().length;
    }

    public int getColumnIndex(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            Exception exc = new Exception();
            Log.e(TAG, "requesting column name with table name -- " + str, exc);
            str = str.substring(lastIndexOf + 1);
        }
        String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (columnNames[i4].equalsIgnoreCase(str)) {
                return i4;
            }
        }
        return -1;
    }

    public int getColumnIndexOrThrow(String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist");
    }

    public String getColumnName(int i4) {
        return getColumnNames()[i4];
    }

    public abstract String[] getColumnNames();

    public abstract int getCount();

    public DataSetObservable getDataSetObservable() {
        return this.mDataSetObservable;
    }

    public abstract double getDouble(int i4);

    public Bundle getExtras() {
        return this.mExtras;
    }

    public abstract float getFloat(int i4);

    public abstract int getInt(int i4);

    public abstract long getLong(int i4);

    public Uri getNotificationUri() {
        return this.mNotifyUri;
    }

    public final int getPosition() {
        return this.mPos;
    }

    public abstract short getShort(int i4);

    public abstract String getString(int i4);

    public abstract int getType(int i4);

    public Object getUpdatedField(int i4) {
        return this.mUpdatedRows.get(this.mCurrentRowID).get(getColumnNames()[i4]);
    }

    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    public CursorWindow getWindow() {
        return null;
    }

    public boolean hasUpdates() {
        boolean z4;
        synchronized (this.mUpdatedRows) {
            z4 = this.mUpdatedRows.size() > 0;
        }
        return z4;
    }

    public final boolean isAfterLast() {
        return getCount() == 0 || this.mPos == getCount();
    }

    public final boolean isBeforeFirst() {
        return getCount() == 0 || this.mPos == -1;
    }

    public boolean isClosed() {
        return this.mClosed;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = r2.mUpdatedRows.get(r2.mCurrentRowID);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isFieldUpdated(int r3) {
        /*
            r2 = this;
            int r0 = r2.mRowIdColumnIndex
            r1 = -1
            if (r0 == r1) goto L_0x0027
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0027
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            java.lang.Long r1 = r2.mCurrentRowID
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0027
            java.lang.String[] r1 = r2.getColumnNames()
            r3 = r1[r3]
            boolean r3 = r0.containsKey(r3)
            if (r3 == 0) goto L_0x0027
            r3 = 1
            return r3
        L_0x0027:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.AbstractCursor.isFieldUpdated(int):boolean");
    }

    public final boolean isFirst() {
        return this.mPos == 0 && getCount() != 0;
    }

    public final boolean isLast() {
        int count = getCount();
        return this.mPos == count + -1 && count != 0;
    }

    public abstract boolean isNull(int i4);

    public final boolean move(int i4) {
        return moveToPosition(this.mPos + i4);
    }

    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    public final boolean moveToNext() {
        return moveToPosition(this.mPos + 1);
    }

    public final boolean moveToPosition(int i4) {
        int count = getCount();
        if (i4 >= count) {
            this.mPos = count;
            return false;
        } else if (i4 < 0) {
            this.mPos = -1;
            return false;
        } else {
            int i5 = this.mPos;
            if (i4 == i5) {
                return true;
            }
            boolean onMove = onMove(i5, i4);
            if (!onMove) {
                this.mPos = -1;
            } else {
                this.mPos = i4;
                int i6 = this.mRowIdColumnIndex;
                if (i6 != -1) {
                    this.mCurrentRowID = Long.valueOf(getLong(i6));
                }
            }
            return onMove;
        }
    }

    public final boolean moveToPrevious() {
        return moveToPosition(this.mPos - 1);
    }

    public void notifyDataSetChange() {
        this.mDataSetObservable.notifyChanged();
    }

    public void onChange(boolean z4) {
        synchronized (this.mSelfObserverLock) {
            try {
                this.mContentObservable.dispatchChange(z4);
                Uri uri = this.mNotifyUri;
                if (uri != null && z4) {
                    this.mContentResolver.notifyChange(uri, this.mSelfObserver);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean onMove(int i4, int i5) {
        return true;
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        this.mContentObservable.registerObserver(contentObserver);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.mDataSetObservable.registerObserver(dataSetObserver);
    }

    public boolean requery() {
        ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null && !this.mSelfObserverRegistered) {
            this.mContentResolver.registerContentObserver(this.mNotifyUri, true, contentObserver);
            this.mSelfObserverRegistered = true;
        }
        this.mDataSetObservable.notifyChanged();
        return true;
    }

    public Bundle respond(Bundle bundle) {
        return Bundle.EMPTY;
    }

    public void setExtras(Bundle bundle) {
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        this.mExtras = bundle;
    }

    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        synchronized (this.mSelfObserverLock) {
            try {
                this.mNotifyUri = uri;
                this.mContentResolver = contentResolver;
                ContentObserver contentObserver = this.mSelfObserver;
                if (contentObserver != null) {
                    contentResolver.unregisterContentObserver(contentObserver);
                }
                SelfContentObserver selfContentObserver = new SelfContentObserver(this);
                this.mSelfObserver = selfContentObserver;
                this.mContentResolver.registerContentObserver(this.mNotifyUri, true, selfContentObserver);
                this.mSelfObserverRegistered = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean supportsUpdates() {
        return this.mRowIdColumnIndex != -1;
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        if (!this.mClosed) {
            this.mContentObservable.unregisterObserver(contentObserver);
        }
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.mDataSetObservable.unregisterObserver(dataSetObserver);
    }

    public boolean update(int i4, Object obj) {
        if (!supportsUpdates()) {
            return false;
        }
        Long valueOf = Long.valueOf(getLong(this.mRowIdColumnIndex));
        synchronized (this.mUpdatedRows) {
            try {
                Map map = this.mUpdatedRows.get(valueOf);
                if (map == null) {
                    map = new HashMap();
                    this.mUpdatedRows.put(valueOf, map);
                }
                map.put(getColumnNames()[i4], obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public boolean updateBlob(int i4, byte[] bArr) {
        return update(i4, bArr);
    }

    public boolean updateDouble(int i4, double d4) {
        return update(i4, Double.valueOf(d4));
    }

    public boolean updateFloat(int i4, float f4) {
        return update(i4, Float.valueOf(f4));
    }

    public boolean updateInt(int i4, int i5) {
        return update(i4, Integer.valueOf(i5));
    }

    public boolean updateLong(int i4, long j4) {
        return update(i4, Long.valueOf(j4));
    }

    public boolean updateShort(int i4, short s4) {
        return update(i4, Short.valueOf(s4));
    }

    public boolean updateString(int i4, String str) {
        return update(i4, str);
    }

    public boolean updateToNull(int i4) {
        return update(i4, (Object) null);
    }

    public boolean commitUpdates() {
        return commitUpdates((Map<? extends Long, ? extends Map<String, Object>>) null);
    }
}
