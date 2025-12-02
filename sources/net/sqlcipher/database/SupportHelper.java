package net.sqlcipher.database;

import android.database.sqlite.SQLiteException;
import net.sqlcipher.database.SQLiteDatabase;
import y0.g;
import y0.h;

public class SupportHelper implements h {
    private final boolean clearPassphrase;
    private byte[] passphrase;
    private SQLiteOpenHelper standardHelper;

    public SupportHelper(h.b bVar, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z4) {
        SQLiteDatabase.loadLibs(bVar.f12718a);
        this.passphrase = bArr;
        this.clearPassphrase = z4;
        final h.b bVar2 = bVar;
        this.standardHelper = new SQLiteOpenHelper(bVar.f12718a, bVar.f12719b, (SQLiteDatabase.CursorFactory) null, bVar.f12720c.f12716a, sQLiteDatabaseHook) {
            public void onConfigure(SQLiteDatabase sQLiteDatabase) {
                bVar2.f12720c.b(sQLiteDatabase);
            }

            public void onCreate(SQLiteDatabase sQLiteDatabase) {
                bVar2.f12720c.d(sQLiteDatabase);
            }

            public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
                bVar2.f12720c.e(sQLiteDatabase, i4, i5);
            }

            public void onOpen(SQLiteDatabase sQLiteDatabase) {
                bVar2.f12720c.f(sQLiteDatabase);
            }

            public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
                bVar2.f12720c.g(sQLiteDatabase, i4, i5);
            }
        };
    }

    public void close() {
        this.standardHelper.close();
    }

    public String getDatabaseName() {
        return this.standardHelper.getDatabaseName();
    }

    public g getReadableDatabase() {
        return getWritableDatabase();
    }

    public g getWritableDatabase() {
        try {
            SQLiteDatabase writableDatabase = this.standardHelper.getWritableDatabase(this.passphrase);
            if (this.clearPassphrase && this.passphrase != null) {
                int i4 = 0;
                while (true) {
                    byte[] bArr = this.passphrase;
                    if (i4 >= bArr.length) {
                        break;
                    }
                    bArr[i4] = 0;
                    i4++;
                }
            }
            return writableDatabase;
        } catch (SQLiteException e4) {
            byte[] bArr2 = this.passphrase;
            if (bArr2 != null) {
                boolean z4 = true;
                for (byte b4 : bArr2) {
                    z4 = z4 && b4 == 0;
                }
                if (z4) {
                    throw new IllegalStateException("The passphrase appears to be cleared. This happens by default the first time you use the factory to open a database, so we can remove the cleartext passphrase from memory. If you close the database yourself, please use a fresh SupportFactory to reopen it. If something else (e.g., Room) closed the database, and you cannot control that, use SupportFactory boolean constructor option to opt out of the automatic password clearing step. See the project README for more information.", e4);
                }
            }
            throw e4;
        }
    }

    public void setWriteAheadLoggingEnabled(boolean z4) {
        this.standardHelper.setWriteAheadLoggingEnabled(z4);
    }
}
