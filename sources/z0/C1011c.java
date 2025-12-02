package z0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.util.List;
import u3.r;
import v3.l;
import v3.m;
import y0.C1005a;
import y0.g;
import y0.j;
import y0.k;

/* renamed from: z0.c  reason: case insensitive filesystem */
public final class C1011c implements g {

    /* renamed from: g  reason: collision with root package name */
    public static final a f12822g = new a((v3.g) null);

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f12823h = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f12824i = new String[0];

    /* renamed from: e  reason: collision with root package name */
    public final SQLiteDatabase f12825e;

    /* renamed from: f  reason: collision with root package name */
    public final List f12826f;

    /* renamed from: z0.c$a */
    public static final class a {
        public /* synthetic */ a(v3.g gVar) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: z0.c$b */
    public static final class b extends m implements r {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ j f12827f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(j jVar) {
            super(4);
            this.f12827f = jVar;
        }

        /* renamed from: a */
        public final SQLiteCursor k(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            j jVar = this.f12827f;
            l.b(sQLiteQuery);
            jVar.d(new C1015g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C1011c(SQLiteDatabase sQLiteDatabase) {
        l.e(sQLiteDatabase, "delegate");
        this.f12825e = sQLiteDatabase;
        this.f12826f = sQLiteDatabase.getAttachedDbs();
    }

    public static final Cursor e(r rVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        l.e(rVar, "$tmp0");
        return (Cursor) rVar.k(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static final Cursor f(j jVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        l.e(jVar, "$query");
        l.b(sQLiteQuery);
        jVar.d(new C1015g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public void beginTransaction() {
        this.f12825e.beginTransaction();
    }

    public void beginTransactionNonExclusive() {
        this.f12825e.beginTransactionNonExclusive();
    }

    public void close() {
        this.f12825e.close();
    }

    public k compileStatement(String str) {
        l.e(str, "sql");
        SQLiteStatement compileStatement = this.f12825e.compileStatement(str);
        l.d(compileStatement, "delegate.compileStatement(sql)");
        return new C1016h(compileStatement);
    }

    public final boolean d(SQLiteDatabase sQLiteDatabase) {
        l.e(sQLiteDatabase, "sqLiteDatabase");
        return l.a(this.f12825e, sQLiteDatabase);
    }

    public void endTransaction() {
        this.f12825e.endTransaction();
    }

    public void execSQL(String str) {
        l.e(str, "sql");
        this.f12825e.execSQL(str);
    }

    public List getAttachedDbs() {
        return this.f12826f;
    }

    public String getPath() {
        return this.f12825e.getPath();
    }

    public boolean inTransaction() {
        return this.f12825e.inTransaction();
    }

    public boolean isOpen() {
        return this.f12825e.isOpen();
    }

    public boolean isWriteAheadLoggingEnabled() {
        return y0.b.b(this.f12825e);
    }

    public Cursor query(String str) {
        l.e(str, "query");
        return query((j) new C1005a(str));
    }

    public void setTransactionSuccessful() {
        this.f12825e.setTransactionSuccessful();
    }

    public int update(String str, int i4, ContentValues contentValues, String str2, Object[] objArr) {
        l.e(str, "table");
        l.e(contentValues, "values");
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            int length = objArr == null ? size : objArr.length + size;
            Object[] objArr2 = new Object[length];
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE ");
            sb.append(f12823h[i4]);
            sb.append(str);
            sb.append(" SET ");
            int i5 = 0;
            for (String next : contentValues.keySet()) {
                sb.append(i5 > 0 ? "," : "");
                sb.append(next);
                objArr2[i5] = contentValues.get(next);
                sb.append("=?");
                i5++;
            }
            if (objArr != null) {
                for (int i6 = size; i6 < length; i6++) {
                    objArr2[i6] = objArr[i6 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            String sb2 = sb.toString();
            l.d(sb2, "StringBuilder().apply(builderAction).toString()");
            k compileStatement = compileStatement(sb2);
            C1005a.f12707g.b(compileStatement, objArr2);
            return compileStatement.executeUpdateDelete();
        }
        throw new IllegalArgumentException("Empty values");
    }

    public void execSQL(String str, Object[] objArr) {
        l.e(str, "sql");
        l.e(objArr, "bindArgs");
        this.f12825e.execSQL(str, objArr);
    }

    public Cursor query(j jVar) {
        l.e(jVar, "query");
        Cursor rawQueryWithFactory = this.f12825e.rawQueryWithFactory(new C1010b(new b(jVar)), jVar.b(), f12824i, (String) null);
        l.d(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public Cursor query(j jVar, CancellationSignal cancellationSignal) {
        l.e(jVar, "query");
        SQLiteDatabase sQLiteDatabase = this.f12825e;
        String b4 = jVar.b();
        String[] strArr = f12824i;
        l.b(cancellationSignal);
        return y0.b.c(sQLiteDatabase, b4, strArr, (String) null, cancellationSignal, new C1009a(jVar));
    }
}
