package net.sqlcipher;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import net.sqlcipher.IContentObserver;

public abstract class BulkCursorNative extends Binder implements IBulkCursor {
    public BulkCursorNative() {
        attachInterface(this, IBulkCursor.descriptor);
    }

    public static IBulkCursor asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IBulkCursor iBulkCursor = (IBulkCursor) iBinder.queryLocalInterface(IBulkCursor.descriptor);
        return iBulkCursor != null ? iBulkCursor : new BulkCursorProxy(iBinder);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        int i6 = 0;
        switch (i4) {
            case 1:
                parcel.enforceInterface(IBulkCursor.descriptor);
                CursorWindow window = getWindow(parcel.readInt());
                if (window == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeInt(1);
                window.writeToParcel(parcel2, 0);
                return true;
            case 2:
                parcel.enforceInterface(IBulkCursor.descriptor);
                int count = count();
                parcel2.writeNoException();
                parcel2.writeInt(count);
                return true;
            case 3:
                parcel.enforceInterface(IBulkCursor.descriptor);
                String[] columnNames = getColumnNames();
                parcel2.writeNoException();
                parcel2.writeInt(columnNames.length);
                int length = columnNames.length;
                while (i6 < length) {
                    parcel2.writeString(columnNames[i6]);
                    i6++;
                }
                return true;
            case 4:
                parcel.enforceInterface(IBulkCursor.descriptor);
                boolean updateRows = updateRows(parcel.readHashMap((ClassLoader) null));
                parcel2.writeNoException();
                if (updateRows) {
                    i6 = 1;
                }
                parcel2.writeInt(i6);
                return true;
            case 5:
                parcel.enforceInterface(IBulkCursor.descriptor);
                boolean deleteRow = deleteRow(parcel.readInt());
                parcel2.writeNoException();
                if (deleteRow) {
                    i6 = 1;
                }
                parcel2.writeInt(i6);
                return true;
            case 6:
                parcel.enforceInterface(IBulkCursor.descriptor);
                deactivate();
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface(IBulkCursor.descriptor);
                int requery = requery(IContentObserver.Stub.asInterface(parcel.readStrongBinder()), CursorWindow.CREATOR.createFromParcel(parcel));
                parcel2.writeNoException();
                parcel2.writeInt(requery);
                parcel2.writeBundle(getExtras());
                return true;
            case 8:
                parcel.enforceInterface(IBulkCursor.descriptor);
                onMove(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                parcel.enforceInterface(IBulkCursor.descriptor);
                boolean wantsAllOnMoveCalls = getWantsAllOnMoveCalls();
                parcel2.writeNoException();
                parcel2.writeInt(wantsAllOnMoveCalls ? 1 : 0);
                return true;
            case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                parcel.enforceInterface(IBulkCursor.descriptor);
                Bundle extras = getExtras();
                parcel2.writeNoException();
                parcel2.writeBundle(extras);
                return true;
            case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                parcel.enforceInterface(IBulkCursor.descriptor);
                Bundle respond = respond(parcel.readBundle(getClass().getClassLoader()));
                parcel2.writeNoException();
                parcel2.writeBundle(respond);
                return true;
            case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                try {
                    parcel.enforceInterface(IBulkCursor.descriptor);
                    close();
                    parcel2.writeNoException();
                    return true;
                } catch (Exception e4) {
                    DatabaseUtils.writeExceptionToParcel(parcel2, e4);
                    return true;
                }
            default:
                return super.onTransact(i4, parcel, parcel2, i5);
        }
    }
}
