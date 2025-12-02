package j1;

import android.util.Log;
import java.io.File;
import net.sqlcipher.DatabaseErrorHandler;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteDatabaseHook;

/* renamed from: j1.a  reason: case insensitive filesystem */
public class C0756a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10830a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10831b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10832c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10833d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10834e;

    /* renamed from: f  reason: collision with root package name */
    public SQLiteDatabase f10835f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10836g;

    /* renamed from: j1.a$a  reason: collision with other inner class name */
    public class C0177a implements DatabaseErrorHandler {
        public C0177a() {
        }

        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    /* renamed from: j1.a$b */
    public class b implements SQLiteDatabaseHook {
        public b() {
        }

        public void postKey(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.rawExecSQL("PRAGMA cipher_migrate;");
        }

        public void preKey(SQLiteDatabase sQLiteDatabase) {
        }
    }

    public C0756a(String str, String str2, int i4, boolean z4, int i5) {
        this.f10831b = str;
        this.f10832c = str2 == null ? "" : str2;
        this.f10830a = z4;
        this.f10833d = i4;
        this.f10834e = i5;
    }

    public static void b(String str) {
        File file = new File(str);
        file.delete();
        new File(file.getPath() + "-journal").delete();
        new File(file.getPath() + "-shm").delete();
        new File(file.getPath() + "-wal").delete();
    }

    public void a() {
        this.f10835f.close();
    }

    public SQLiteDatabase c() {
        return this.f10835f;
    }

    public String d() {
        return "[" + e() + "] ";
    }

    public String e() {
        Thread currentThread = Thread.currentThread();
        return "" + this.f10833d + "," + currentThread.getName() + "(" + currentThread.getId() + ")";
    }

    public SQLiteDatabase f() {
        return this.f10835f;
    }

    public void g() {
        i(SQLiteDatabase.CREATE_IF_NECESSARY);
    }

    public void h() {
        j(1, new C0177a());
    }

    public final void i(int i4) {
        j(i4, (DatabaseErrorHandler) null);
    }

    public final void j(int i4, DatabaseErrorHandler databaseErrorHandler) {
        try {
            this.f10835f = SQLiteDatabase.openDatabase(this.f10831b, this.f10832c, (SQLiteDatabase.CursorFactory) null, i4, (SQLiteDatabaseHook) null, databaseErrorHandler);
        } catch (Exception unused) {
            Log.d("Sqflite", "Opening db in " + this.f10831b + " with PRAGMA cipher_migrate");
            this.f10835f = SQLiteDatabase.openDatabase(this.f10831b, this.f10832c, (SQLiteDatabase.CursorFactory) null, i4, (SQLiteDatabaseHook) new b(), databaseErrorHandler);
        }
    }
}
