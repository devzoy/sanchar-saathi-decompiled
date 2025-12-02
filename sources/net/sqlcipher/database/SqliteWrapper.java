package net.sqlcipher.database;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;
import net.sqlcipher.Cursor;

public final class SqliteWrapper {
    private static final String SQLITE_EXCEPTION_DETAIL_MESSAGE = "unable to open database file";
    private static final String TAG = "SqliteWrapper";

    private SqliteWrapper() {
    }

    public static void checkSQLiteException(Context context, SQLiteException sQLiteException) {
        if (isLowMemory(sQLiteException)) {
            Toast.makeText(context, sQLiteException.getMessage(), 0).show();
            return;
        }
        throw sQLiteException;
    }

    public static int delete(Context context, ContentResolver contentResolver, Uri uri, String str, String[] strArr) {
        try {
            return contentResolver.delete(uri, str, strArr);
        } catch (SQLiteException e4) {
            Log.e(TAG, "Catch a SQLiteException when delete: ", e4);
            checkSQLiteException(context, e4);
            return -1;
        }
    }

    public static Uri insert(Context context, ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
        try {
            return contentResolver.insert(uri, contentValues);
        } catch (SQLiteException e4) {
            Log.e(TAG, "Catch a SQLiteException when insert: ", e4);
            checkSQLiteException(context, e4);
            return null;
        }
    }

    private static boolean isLowMemory(SQLiteException sQLiteException) {
        return sQLiteException.getMessage().equals(SQLITE_EXCEPTION_DETAIL_MESSAGE);
    }

    public static Cursor query(Context context, ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            return (Cursor) contentResolver.query(uri, strArr, str, strArr2, str2);
        } catch (SQLiteException e4) {
            Log.e(TAG, "Catch a SQLiteException when query: ", e4);
            checkSQLiteException(context, e4);
            return null;
        }
    }

    public static boolean requery(Context context, android.database.Cursor cursor) {
        try {
            return cursor.requery();
        } catch (SQLiteException e4) {
            Log.e(TAG, "Catch a SQLiteException when requery: ", e4);
            checkSQLiteException(context, e4);
            return false;
        }
    }

    public static int update(Context context, ContentResolver contentResolver, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            return contentResolver.update(uri, contentValues, str, strArr);
        } catch (SQLiteException e4) {
            Log.e(TAG, "Catch a SQLiteException when update: ", e4);
            checkSQLiteException(context, e4);
            return -1;
        }
    }
}
