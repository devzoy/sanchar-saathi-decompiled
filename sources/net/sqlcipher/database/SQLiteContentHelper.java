package net.sqlcipher.database;

import android.content.res.AssetFileDescriptor;
import android.os.MemoryFile;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import net.sqlcipher.Cursor;

public class SQLiteContentHelper {
    public static AssetFileDescriptor getBlobColumnAsAssetFile(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            MemoryFile simpleQueryForBlobMemoryFile = simpleQueryForBlobMemoryFile(sQLiteDatabase, str, strArr);
            if (simpleQueryForBlobMemoryFile != null) {
                try {
                    Method declaredMethod = simpleQueryForBlobMemoryFile.getClass().getDeclaredMethod("getParcelFileDescriptor", (Class[]) null);
                    declaredMethod.setAccessible(true);
                    parcelFileDescriptor = (ParcelFileDescriptor) declaredMethod.invoke(simpleQueryForBlobMemoryFile, (Object[]) null);
                } catch (Exception e4) {
                    Log.i("SQLiteContentHelper", "SQLiteCursor.java: " + e4);
                    parcelFileDescriptor = null;
                }
                return new AssetFileDescriptor(parcelFileDescriptor, 0, (long) simpleQueryForBlobMemoryFile.length());
            }
            throw new FileNotFoundException("No results.");
        } catch (IOException e5) {
            throw new FileNotFoundException(e5.toString());
        }
    }

    private static MemoryFile simpleQueryForBlobMemoryFile(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr);
        if (rawQuery == null) {
            return null;
        }
        try {
            if (!rawQuery.moveToFirst()) {
                return null;
            }
            byte[] blob = rawQuery.getBlob(0);
            if (blob == null) {
                rawQuery.close();
                return null;
            }
            MemoryFile memoryFile = new MemoryFile((String) null, blob.length);
            memoryFile.writeBytes(blob, 0, 0, blob.length);
            rawQuery.close();
            return memoryFile;
        } finally {
            rawQuery.close();
        }
    }
}
