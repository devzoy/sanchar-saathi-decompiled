package net.sqlcipher;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.Map;
import net.sqlcipher.AbstractCursor;

public final class BulkCursorToCursorAdaptor extends AbstractWindowedCursor {
    private static final String TAG = "BulkCursor";
    private IBulkCursor mBulkCursor;
    private String[] mColumns;
    private int mCount;
    private AbstractCursor.SelfContentObserver mObserverBridge;
    private boolean mWantsAllOnMoveCalls;

    public static int findRowIdColumnIndex(String[] strArr) {
        int length = strArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (strArr[i4].equals("_id")) {
                return i4;
            }
        }
        return -1;
    }

    public void close() {
        super.close();
        try {
            this.mBulkCursor.close();
        } catch (RemoteException unused) {
            Log.w(TAG, "Remote process exception when closing");
        }
        this.mWindow = null;
    }

    public boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> map) {
        if (!supportsUpdates()) {
            Log.e(TAG, "commitUpdates not supported on this cursor, did you include the _id column?");
            return false;
        }
        synchronized (this.mUpdatedRows) {
            if (map != null) {
                try {
                    this.mUpdatedRows.putAll(map);
                } catch (RemoteException unused) {
                    Log.e(TAG, "Unable to commit updates because the remote process is dead");
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.mUpdatedRows.size() <= 0) {
                return false;
            }
            boolean updateRows = this.mBulkCursor.updateRows(this.mUpdatedRows);
            if (updateRows) {
                this.mUpdatedRows.clear();
                onChange(true);
            }
            return updateRows;
        }
    }

    public void copyStringToBuffer(int i4, CharArrayBuffer charArrayBuffer) {
    }

    public void deactivate() {
        super.deactivate();
        try {
            this.mBulkCursor.deactivate();
        } catch (RemoteException unused) {
            Log.w(TAG, "Remote process exception when deactivating");
        }
        this.mWindow = null;
    }

    public boolean deleteRow() {
        try {
            boolean deleteRow = this.mBulkCursor.deleteRow(this.mPos);
            if (deleteRow) {
                this.mWindow = null;
                int count = this.mBulkCursor.count();
                this.mCount = count;
                int i4 = this.mPos;
                if (i4 < count) {
                    this.mPos = -1;
                    moveToPosition(i4);
                } else {
                    this.mPos = count;
                }
                onChange(true);
            }
            return deleteRow;
        } catch (RemoteException unused) {
            Log.e(TAG, "Unable to delete row because the remote process is dead");
            return false;
        }
    }

    public String[] getColumnNames() {
        if (this.mColumns == null) {
            try {
                this.mColumns = this.mBulkCursor.getColumnNames();
            } catch (RemoteException unused) {
                Log.e(TAG, "Unable to fetch column names because the remote process is dead");
                return null;
            }
        }
        return this.mColumns;
    }

    public int getCount() {
        return this.mCount;
    }

    public Bundle getExtras() {
        try {
            return this.mBulkCursor.getExtras();
        } catch (RemoteException e4) {
            throw new RuntimeException(e4);
        }
    }

    public synchronized IContentObserver getObserver() {
        if (this.mObserverBridge == null) {
            this.mObserverBridge = new AbstractCursor.SelfContentObserver(this);
        }
        return null;
    }

    public boolean onMove(int i4, int i5) {
        try {
            CursorWindow cursorWindow = this.mWindow;
            if (cursorWindow != null) {
                if (i5 >= cursorWindow.getStartPosition()) {
                    if (i5 < this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
                        if (this.mWantsAllOnMoveCalls) {
                            this.mBulkCursor.onMove(i5);
                        }
                    }
                }
                this.mWindow = this.mBulkCursor.getWindow(i5);
            } else {
                this.mWindow = this.mBulkCursor.getWindow(i5);
            }
            return this.mWindow != null;
        } catch (RemoteException unused) {
            Log.e(TAG, "Unable to get window because the remote process is dead");
            return false;
        }
    }

    public void registerContentObserver(ContentObserver contentObserver) {
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public boolean requery() {
        try {
            int requery = this.mBulkCursor.requery(getObserver(), new CursorWindow(false));
            this.mCount = requery;
            if (requery != -1) {
                this.mPos = -1;
                this.mWindow = null;
                super.requery();
                return true;
            }
            deactivate();
            return false;
        } catch (Exception e4) {
            Log.e(TAG, "Unable to requery because the remote process exception " + e4.getMessage());
            deactivate();
            return false;
        }
    }

    public Bundle respond(Bundle bundle) {
        try {
            return this.mBulkCursor.respond(bundle);
        } catch (RemoteException e4) {
            Log.w(TAG, "respond() threw RemoteException, returning an empty bundle.", e4);
            return Bundle.EMPTY;
        }
    }

    public void set(IBulkCursor iBulkCursor) {
        this.mBulkCursor = iBulkCursor;
        try {
            this.mCount = iBulkCursor.count();
            this.mWantsAllOnMoveCalls = this.mBulkCursor.getWantsAllOnMoveCalls();
            String[] columnNames = this.mBulkCursor.getColumnNames();
            this.mColumns = columnNames;
            this.mRowIdColumnIndex = findRowIdColumnIndex(columnNames);
        } catch (RemoteException unused) {
            Log.e(TAG, "Setup failed because the remote process is dead");
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public void set(IBulkCursor iBulkCursor, int i4, int i5) {
        this.mBulkCursor = iBulkCursor;
        this.mColumns = null;
        this.mCount = i4;
        this.mRowIdColumnIndex = i5;
    }
}
