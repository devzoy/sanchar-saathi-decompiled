package u0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import h3.C0673n;
import i3.C0738o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u3.l;
import v3.j;
import v3.m;
import y0.e;
import y0.f;
import y0.g;
import y0.h;
import y0.k;

public final class d implements h, g {

    /* renamed from: e  reason: collision with root package name */
    public final h f12125e;

    /* renamed from: f  reason: collision with root package name */
    public final C0940c f12126f;

    /* renamed from: g  reason: collision with root package name */
    public final a f12127g;

    public static final class a implements y0.g {

        /* renamed from: e  reason: collision with root package name */
        public final C0940c f12128e;

        /* renamed from: u0.d$a$a  reason: collision with other inner class name */
        public static final class C0198a extends m implements l {

            /* renamed from: f  reason: collision with root package name */
            public static final C0198a f12129f = new C0198a();

            public C0198a() {
                super(1);
            }

            /* renamed from: a */
            public final List i(y0.g gVar) {
                v3.l.e(gVar, "obj");
                return gVar.getAttachedDbs();
            }
        }

        public static final class b extends m implements l {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ String f12130f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(1);
                this.f12130f = str;
            }

            /* renamed from: a */
            public final Object i(y0.g gVar) {
                v3.l.e(gVar, "db");
                gVar.execSQL(this.f12130f);
                return null;
            }
        }

        public static final class c extends m implements l {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ String f12131f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ Object[] f12132g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str, Object[] objArr) {
                super(1);
                this.f12131f = str;
                this.f12132g = objArr;
            }

            /* renamed from: a */
            public final Object i(y0.g gVar) {
                v3.l.e(gVar, "db");
                gVar.execSQL(this.f12131f, this.f12132g);
                return null;
            }
        }

        /* renamed from: u0.d$a$d  reason: collision with other inner class name */
        public /* synthetic */ class C0199d extends j implements l {

            /* renamed from: n  reason: collision with root package name */
            public static final C0199d f12133n = new C0199d();

            public C0199d() {
                super(1, y0.g.class, "inTransaction", "inTransaction()Z", 0);
            }

            /* renamed from: o */
            public final Boolean i(y0.g gVar) {
                v3.l.e(gVar, "p0");
                return Boolean.valueOf(gVar.inTransaction());
            }
        }

        public static final class e extends m implements l {

            /* renamed from: f  reason: collision with root package name */
            public static final e f12134f = new e();

            public e() {
                super(1);
            }

            /* renamed from: a */
            public final Boolean i(y0.g gVar) {
                v3.l.e(gVar, "db");
                return Boolean.valueOf(gVar.isWriteAheadLoggingEnabled());
            }
        }

        public static final class f extends m implements l {

            /* renamed from: f  reason: collision with root package name */
            public static final f f12135f = new f();

            public f() {
                super(1);
            }

            /* renamed from: a */
            public final String i(y0.g gVar) {
                v3.l.e(gVar, "obj");
                return gVar.getPath();
            }
        }

        public static final class g extends m implements l {

            /* renamed from: f  reason: collision with root package name */
            public static final g f12136f = new g();

            public g() {
                super(1);
            }

            /* renamed from: a */
            public final Object i(y0.g gVar) {
                v3.l.e(gVar, "it");
                return null;
            }
        }

        public static final class h extends m implements l {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ String f12137f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ int f12138g;

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ ContentValues f12139h;

            /* renamed from: i  reason: collision with root package name */
            public final /* synthetic */ String f12140i;

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ Object[] f12141j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public h(String str, int i4, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f12137f = str;
                this.f12138g = i4;
                this.f12139h = contentValues;
                this.f12140i = str2;
                this.f12141j = objArr;
            }

            /* renamed from: a */
            public final Integer i(y0.g gVar) {
                v3.l.e(gVar, "db");
                return Integer.valueOf(gVar.update(this.f12137f, this.f12138g, this.f12139h, this.f12140i, this.f12141j));
            }
        }

        public a(C0940c cVar) {
            v3.l.e(cVar, "autoCloser");
            this.f12128e = cVar;
        }

        public final void b() {
            this.f12128e.g(g.f12136f);
        }

        public void beginTransaction() {
            try {
                this.f12128e.j().beginTransaction();
            } catch (Throwable th) {
                this.f12128e.e();
                throw th;
            }
        }

        public void beginTransactionNonExclusive() {
            try {
                this.f12128e.j().beginTransactionNonExclusive();
            } catch (Throwable th) {
                this.f12128e.e();
                throw th;
            }
        }

        public void close() {
            this.f12128e.d();
        }

        public k compileStatement(String str) {
            v3.l.e(str, "sql");
            return new b(str, this.f12128e);
        }

        public void endTransaction() {
            if (this.f12128e.h() != null) {
                try {
                    y0.g h4 = this.f12128e.h();
                    v3.l.b(h4);
                    h4.endTransaction();
                } finally {
                    this.f12128e.e();
                }
            } else {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
        }

        public void execSQL(String str) {
            v3.l.e(str, "sql");
            this.f12128e.g(new b(str));
        }

        public List getAttachedDbs() {
            return (List) this.f12128e.g(C0198a.f12129f);
        }

        public String getPath() {
            return (String) this.f12128e.g(f.f12135f);
        }

        public boolean inTransaction() {
            if (this.f12128e.h() == null) {
                return false;
            }
            return ((Boolean) this.f12128e.g(C0199d.f12133n)).booleanValue();
        }

        public boolean isOpen() {
            y0.g h4 = this.f12128e.h();
            if (h4 == null) {
                return false;
            }
            return h4.isOpen();
        }

        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.f12128e.g(e.f12134f)).booleanValue();
        }

        public Cursor query(String str) {
            v3.l.e(str, "query");
            try {
                return new c(this.f12128e.j().query(str), this.f12128e);
            } catch (Throwable th) {
                this.f12128e.e();
                throw th;
            }
        }

        public void setTransactionSuccessful() {
            C0673n nVar;
            y0.g h4 = this.f12128e.h();
            if (h4 != null) {
                h4.setTransactionSuccessful();
                nVar = C0673n.f9639a;
            } else {
                nVar = null;
            }
            if (nVar == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        public int update(String str, int i4, ContentValues contentValues, String str2, Object[] objArr) {
            v3.l.e(str, "table");
            v3.l.e(contentValues, "values");
            return ((Number) this.f12128e.g(new h(str, i4, contentValues, str2, objArr))).intValue();
        }

        public void execSQL(String str, Object[] objArr) {
            v3.l.e(str, "sql");
            v3.l.e(objArr, "bindArgs");
            this.f12128e.g(new c(str, objArr));
        }

        public Cursor query(y0.j jVar) {
            v3.l.e(jVar, "query");
            try {
                return new c(this.f12128e.j().query(jVar), this.f12128e);
            } catch (Throwable th) {
                this.f12128e.e();
                throw th;
            }
        }

        public Cursor query(y0.j jVar, CancellationSignal cancellationSignal) {
            v3.l.e(jVar, "query");
            try {
                return new c(this.f12128e.j().query(jVar, cancellationSignal), this.f12128e);
            } catch (Throwable th) {
                this.f12128e.e();
                throw th;
            }
        }
    }

    public static final class b implements k {

        /* renamed from: e  reason: collision with root package name */
        public final String f12142e;

        /* renamed from: f  reason: collision with root package name */
        public final C0940c f12143f;

        /* renamed from: g  reason: collision with root package name */
        public final ArrayList f12144g = new ArrayList();

        public static final class a extends m implements l {

            /* renamed from: f  reason: collision with root package name */
            public static final a f12145f = new a();

            public a() {
                super(1);
            }

            /* renamed from: a */
            public final Long i(k kVar) {
                v3.l.e(kVar, "obj");
                return Long.valueOf(kVar.executeInsert());
            }
        }

        /* renamed from: u0.d$b$b  reason: collision with other inner class name */
        public static final class C0200b extends m implements l {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ b f12146f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ l f12147g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0200b(b bVar, l lVar) {
                super(1);
                this.f12146f = bVar;
                this.f12147g = lVar;
            }

            /* renamed from: a */
            public final Object i(g gVar) {
                v3.l.e(gVar, "db");
                k compileStatement = gVar.compileStatement(this.f12146f.f12142e);
                this.f12146f.d(compileStatement);
                return this.f12147g.i(compileStatement);
            }
        }

        public static final class c extends m implements l {

            /* renamed from: f  reason: collision with root package name */
            public static final c f12148f = new c();

            public c() {
                super(1);
            }

            /* renamed from: a */
            public final Integer i(k kVar) {
                v3.l.e(kVar, "obj");
                return Integer.valueOf(kVar.executeUpdateDelete());
            }
        }

        public b(String str, C0940c cVar) {
            v3.l.e(str, "sql");
            v3.l.e(cVar, "autoCloser");
            this.f12142e = str;
            this.f12143f = cVar;
        }

        public void bindBlob(int i4, byte[] bArr) {
            v3.l.e(bArr, "value");
            f(i4, bArr);
        }

        public void bindDouble(int i4, double d4) {
            f(i4, Double.valueOf(d4));
        }

        public void bindLong(int i4, long j4) {
            f(i4, Long.valueOf(j4));
        }

        public void bindNull(int i4) {
            f(i4, (Object) null);
        }

        public void bindString(int i4, String str) {
            v3.l.e(str, "value");
            f(i4, str);
        }

        public void close() {
        }

        public final void d(k kVar) {
            Iterator it = this.f12144g.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    C0738o.l();
                }
                Object obj = this.f12144g.get(i4);
                if (obj == null) {
                    kVar.bindNull(i5);
                } else if (obj instanceof Long) {
                    kVar.bindLong(i5, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.bindDouble(i5, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.bindString(i5, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.bindBlob(i5, (byte[]) obj);
                }
                i4 = i5;
            }
        }

        public final Object e(l lVar) {
            return this.f12143f.g(new C0200b(this, lVar));
        }

        public long executeInsert() {
            return ((Number) e(a.f12145f)).longValue();
        }

        public int executeUpdateDelete() {
            return ((Number) e(c.f12148f)).intValue();
        }

        public final void f(int i4, Object obj) {
            int size;
            int i5 = i4 - 1;
            if (i5 >= this.f12144g.size() && (size = this.f12144g.size()) <= i5) {
                while (true) {
                    this.f12144g.add((Object) null);
                    if (size == i5) {
                        break;
                    }
                    size++;
                }
            }
            this.f12144g.set(i5, obj);
        }
    }

    public static final class c implements Cursor {

        /* renamed from: e  reason: collision with root package name */
        public final Cursor f12149e;

        /* renamed from: f  reason: collision with root package name */
        public final C0940c f12150f;

        public c(Cursor cursor, C0940c cVar) {
            v3.l.e(cursor, "delegate");
            v3.l.e(cVar, "autoCloser");
            this.f12149e = cursor;
            this.f12150f = cVar;
        }

        public void close() {
            this.f12149e.close();
            this.f12150f.e();
        }

        public void copyStringToBuffer(int i4, CharArrayBuffer charArrayBuffer) {
            this.f12149e.copyStringToBuffer(i4, charArrayBuffer);
        }

        public void deactivate() {
            this.f12149e.deactivate();
        }

        public byte[] getBlob(int i4) {
            return this.f12149e.getBlob(i4);
        }

        public int getColumnCount() {
            return this.f12149e.getColumnCount();
        }

        public int getColumnIndex(String str) {
            return this.f12149e.getColumnIndex(str);
        }

        public int getColumnIndexOrThrow(String str) {
            return this.f12149e.getColumnIndexOrThrow(str);
        }

        public String getColumnName(int i4) {
            return this.f12149e.getColumnName(i4);
        }

        public String[] getColumnNames() {
            return this.f12149e.getColumnNames();
        }

        public int getCount() {
            return this.f12149e.getCount();
        }

        public double getDouble(int i4) {
            return this.f12149e.getDouble(i4);
        }

        public Bundle getExtras() {
            return this.f12149e.getExtras();
        }

        public float getFloat(int i4) {
            return this.f12149e.getFloat(i4);
        }

        public int getInt(int i4) {
            return this.f12149e.getInt(i4);
        }

        public long getLong(int i4) {
            return this.f12149e.getLong(i4);
        }

        public Uri getNotificationUri() {
            return y0.c.a(this.f12149e);
        }

        public List getNotificationUris() {
            return f.a(this.f12149e);
        }

        public int getPosition() {
            return this.f12149e.getPosition();
        }

        public short getShort(int i4) {
            return this.f12149e.getShort(i4);
        }

        public String getString(int i4) {
            return this.f12149e.getString(i4);
        }

        public int getType(int i4) {
            return this.f12149e.getType(i4);
        }

        public boolean getWantsAllOnMoveCalls() {
            return this.f12149e.getWantsAllOnMoveCalls();
        }

        public boolean isAfterLast() {
            return this.f12149e.isAfterLast();
        }

        public boolean isBeforeFirst() {
            return this.f12149e.isBeforeFirst();
        }

        public boolean isClosed() {
            return this.f12149e.isClosed();
        }

        public boolean isFirst() {
            return this.f12149e.isFirst();
        }

        public boolean isLast() {
            return this.f12149e.isLast();
        }

        public boolean isNull(int i4) {
            return this.f12149e.isNull(i4);
        }

        public boolean move(int i4) {
            return this.f12149e.move(i4);
        }

        public boolean moveToFirst() {
            return this.f12149e.moveToFirst();
        }

        public boolean moveToLast() {
            return this.f12149e.moveToLast();
        }

        public boolean moveToNext() {
            return this.f12149e.moveToNext();
        }

        public boolean moveToPosition(int i4) {
            return this.f12149e.moveToPosition(i4);
        }

        public boolean moveToPrevious() {
            return this.f12149e.moveToPrevious();
        }

        public void registerContentObserver(ContentObserver contentObserver) {
            this.f12149e.registerContentObserver(contentObserver);
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f12149e.registerDataSetObserver(dataSetObserver);
        }

        public boolean requery() {
            return this.f12149e.requery();
        }

        public Bundle respond(Bundle bundle) {
            return this.f12149e.respond(bundle);
        }

        public void setExtras(Bundle bundle) {
            v3.l.e(bundle, "extras");
            e.a(this.f12149e, bundle);
        }

        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f12149e.setNotificationUri(contentResolver, uri);
        }

        public void setNotificationUris(ContentResolver contentResolver, List list) {
            v3.l.e(contentResolver, "cr");
            v3.l.e(list, "uris");
            f.b(this.f12149e, contentResolver, list);
        }

        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f12149e.unregisterContentObserver(contentObserver);
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f12149e.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public d(h hVar, C0940c cVar) {
        v3.l.e(hVar, "delegate");
        v3.l.e(cVar, "autoCloser");
        this.f12125e = hVar;
        this.f12126f = cVar;
        cVar.k(b());
        this.f12127g = new a(cVar);
    }

    public h b() {
        return this.f12125e;
    }

    public void close() {
        this.f12127g.close();
    }

    public String getDatabaseName() {
        return this.f12125e.getDatabaseName();
    }

    public g getWritableDatabase() {
        this.f12127g.b();
        return this.f12127g;
    }

    public void setWriteAheadLoggingEnabled(boolean z4) {
        this.f12125e.setWriteAheadLoggingEnabled(z4);
    }
}
