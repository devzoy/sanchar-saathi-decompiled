package net.sqlcipher;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;

final class BulkCursorProxy implements IBulkCursor {
    private Bundle mExtras = null;
    private IBinder mRemote;

    public BulkCursorProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public void close() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        this.mRemote.transact(12, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        obtain.recycle();
        obtain2.recycle();
    }

    public int count() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        boolean transact = this.mRemote.transact(2, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        int readInt = !transact ? -1 : obtain2.readInt();
        obtain.recycle();
        obtain2.recycle();
        return readInt;
    }

    public void deactivate() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        this.mRemote.transact(6, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        obtain.recycle();
        obtain2.recycle();
    }

    public boolean deleteRow(int i4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        obtain.writeInt(i4);
        boolean z4 = false;
        this.mRemote.transact(5, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        if (obtain2.readInt() == 1) {
            z4 = true;
        }
        obtain.recycle();
        obtain2.recycle();
        return z4;
    }

    public String[] getColumnNames() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        this.mRemote.transact(3, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        int readInt = obtain2.readInt();
        String[] strArr = new String[readInt];
        for (int i4 = 0; i4 < readInt; i4++) {
            strArr[i4] = obtain2.readString();
        }
        obtain.recycle();
        obtain2.recycle();
        return strArr;
    }

    public Bundle getExtras() {
        if (this.mExtras == null) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken(IBulkCursor.descriptor);
            this.mRemote.transact(10, obtain, obtain2, 0);
            DatabaseUtils.readExceptionFromParcel(obtain2);
            this.mExtras = obtain2.readBundle(BulkCursorProxy.class.getClassLoader());
            obtain.recycle();
            obtain2.recycle();
        }
        return this.mExtras;
    }

    public boolean getWantsAllOnMoveCalls() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        this.mRemote.transact(9, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        int readInt = obtain2.readInt();
        obtain.recycle();
        obtain2.recycle();
        return readInt != 0;
    }

    public CursorWindow getWindow(int i4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        obtain.writeInt(i4);
        this.mRemote.transact(1, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        CursorWindow newFromParcel = obtain2.readInt() == 1 ? CursorWindow.newFromParcel(obtain2) : null;
        obtain.recycle();
        obtain2.recycle();
        return newFromParcel;
    }

    public void onMove(int i4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        obtain.writeInt(i4);
        this.mRemote.transact(8, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        obtain.recycle();
        obtain2.recycle();
    }

    public int requery(IContentObserver iContentObserver, CursorWindow cursorWindow) {
        int i4;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        obtain.writeStrongInterface(iContentObserver);
        cursorWindow.writeToParcel(obtain, 0);
        boolean transact = this.mRemote.transact(7, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        if (!transact) {
            i4 = -1;
        } else {
            i4 = obtain2.readInt();
            this.mExtras = obtain2.readBundle(BulkCursorProxy.class.getClassLoader());
        }
        obtain.recycle();
        obtain2.recycle();
        return i4;
    }

    public Bundle respond(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        obtain.writeBundle(bundle);
        this.mRemote.transact(11, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        Bundle readBundle = obtain2.readBundle(BulkCursorProxy.class.getClassLoader());
        obtain.recycle();
        obtain2.recycle();
        return readBundle;
    }

    public boolean updateRows(Map map) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain.writeInterfaceToken(IBulkCursor.descriptor);
        obtain.writeMap(map);
        boolean z4 = false;
        this.mRemote.transact(4, obtain, obtain2, 0);
        DatabaseUtils.readExceptionFromParcel(obtain2);
        if (obtain2.readInt() == 1) {
            z4 = true;
        }
        obtain.recycle();
        obtain2.recycle();
        return z4;
    }
}
