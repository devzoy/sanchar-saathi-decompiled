package w0;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.util.Log;
import i3.C0735l;
import s3.b;
import v3.l;

/* renamed from: w0.a  reason: case insensitive filesystem */
public abstract class C0959a {
    public static final Cursor a(Cursor cursor) {
        l.e(cursor, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i4 = 0; i4 < columnCount; i4++) {
                    int type = cursor.getType(i4);
                    if (type == 0) {
                        objArr[i4] = null;
                    } else if (type == 1) {
                        objArr[i4] = Long.valueOf(cursor.getLong(i4));
                    } else if (type == 2) {
                        objArr[i4] = Double.valueOf(cursor.getDouble(i4));
                    } else if (type == 3) {
                        objArr[i4] = cursor.getString(i4);
                    } else if (type == 4) {
                        objArr[i4] = cursor.getBlob(i4);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                matrixCursor.addRow(objArr);
            }
            b.a(cursor, (Throwable) null);
            return matrixCursor;
        } catch (Throwable th) {
            b.a(cursor, th);
            throw th;
        }
    }

    public static final int b(Cursor cursor, String str) {
        return -1;
    }

    public static final int c(Cursor cursor, String str) {
        l.e(cursor, "c");
        l.e(str, "name");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        return columnIndex2 >= 0 ? columnIndex2 : b(cursor, str);
    }

    public static final int d(Cursor cursor, String str) {
        String str2;
        l.e(cursor, "c");
        l.e(str, "name");
        int c4 = c(cursor, str);
        if (c4 >= 0) {
            return c4;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            l.d(columnNames, "c.columnNames");
            str2 = C0735l.y(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (u3.l) null, 63, (Object) null);
        } catch (Exception e4) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e4);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
