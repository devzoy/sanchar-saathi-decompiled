package z0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import h3.C0663d;
import h3.C0664e;
import java.io.File;
import java.util.UUID;
import v3.g;
import v3.l;
import v3.m;
import y0.d;
import y0.h;

/* renamed from: z0.d  reason: case insensitive filesystem */
public final class C1012d implements h {

    /* renamed from: l  reason: collision with root package name */
    public static final a f12828l = new a((g) null);

    /* renamed from: e  reason: collision with root package name */
    public final Context f12829e;

    /* renamed from: f  reason: collision with root package name */
    public final String f12830f;

    /* renamed from: g  reason: collision with root package name */
    public final h.a f12831g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f12832h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f12833i;

    /* renamed from: j  reason: collision with root package name */
    public final C0663d f12834j = C0664e.a(new C0214d(this));

    /* renamed from: k  reason: collision with root package name */
    public boolean f12835k;

    /* renamed from: z0.d$a */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: z0.d$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public C1011c f12836a;

        public b(C1011c cVar) {
            this.f12836a = cVar;
        }

        public final C1011c a() {
            return this.f12836a;
        }

        public final void b(C1011c cVar) {
            this.f12836a = cVar;
        }
    }

    /* renamed from: z0.d$c */
    public static final class c extends SQLiteOpenHelper {

        /* renamed from: l  reason: collision with root package name */
        public static final C0212c f12837l = new C0212c((g) null);

        /* renamed from: e  reason: collision with root package name */
        public final Context f12838e;

        /* renamed from: f  reason: collision with root package name */
        public final b f12839f;

        /* renamed from: g  reason: collision with root package name */
        public final h.a f12840g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f12841h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f12842i;

        /* renamed from: j  reason: collision with root package name */
        public final A0.a f12843j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f12844k;

        /* renamed from: z0.d$c$a */
        public static final class a extends RuntimeException {

            /* renamed from: e  reason: collision with root package name */
            public final b f12845e;

            /* renamed from: f  reason: collision with root package name */
            public final Throwable f12846f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, Throwable th) {
                super(th);
                l.e(bVar, "callbackName");
                l.e(th, "cause");
                this.f12845e = bVar;
                this.f12846f = th;
            }

            public final b a() {
                return this.f12845e;
            }

            public Throwable getCause() {
                return this.f12846f;
            }
        }

        /* renamed from: z0.d$c$b */
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* renamed from: z0.d$c$c  reason: collision with other inner class name */
        public static final class C0212c {
            public /* synthetic */ C0212c(g gVar) {
                this();
            }

            public final C1011c a(b bVar, SQLiteDatabase sQLiteDatabase) {
                l.e(bVar, "refHolder");
                l.e(sQLiteDatabase, "sqLiteDatabase");
                C1011c a4 = bVar.a();
                if (a4 != null && a4.d(sQLiteDatabase)) {
                    return a4;
                }
                C1011c cVar = new C1011c(sQLiteDatabase);
                bVar.b(cVar);
                return cVar;
            }

            public C0212c() {
            }
        }

        /* renamed from: z0.d$c$d  reason: collision with other inner class name */
        public /* synthetic */ class C0213d {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f12853a;

            /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    z0.d$c$b[] r0 = z0.C1012d.c.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    z0.d$c$b r1 = z0.C1012d.c.b.ON_CONFIGURE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    z0.d$c$b r1 = z0.C1012d.c.b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    z0.d$c$b r1 = z0.C1012d.c.b.ON_UPGRADE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    z0.d$c$b r1 = z0.C1012d.c.b.ON_DOWNGRADE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    z0.d$c$b r1 = z0.C1012d.c.b.ON_OPEN     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    f12853a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: z0.C1012d.c.C0213d.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, b bVar, h.a aVar, boolean z4) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f12716a, new C1013e(aVar, bVar));
            l.e(context, "context");
            l.e(bVar, "dbRef");
            l.e(aVar, "callback");
            this.f12838e = context;
            this.f12839f = bVar;
            this.f12840g = aVar;
            this.f12841h = z4;
            if (str == null) {
                str = UUID.randomUUID().toString();
                l.d(str, "randomUUID().toString()");
            }
            File cacheDir = context.getCacheDir();
            l.d(cacheDir, "context.cacheDir");
            this.f12843j = new A0.a(str, cacheDir, false);
        }

        public static final void c(h.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            l.e(aVar, "$callback");
            l.e(bVar, "$dbRef");
            C0212c cVar = f12837l;
            l.d(sQLiteDatabase, "dbObj");
            aVar.c(cVar.a(bVar, sQLiteDatabase));
        }

        public void close() {
            try {
                A0.a.c(this.f12843j, false, 1, (Object) null);
                super.close();
                this.f12839f.b((C1011c) null);
                this.f12844k = false;
            } finally {
                this.f12843j.d();
            }
        }

        public final y0.g d(boolean z4) {
            try {
                this.f12843j.b(!this.f12844k && getDatabaseName() != null);
                this.f12842i = false;
                SQLiteDatabase g4 = g(z4);
                if (this.f12842i) {
                    close();
                    y0.g d4 = d(z4);
                    this.f12843j.d();
                    return d4;
                }
                C1011c e4 = e(g4);
                this.f12843j.d();
                return e4;
            } catch (Throwable th) {
                this.f12843j.d();
                throw th;
            }
        }

        public final C1011c e(SQLiteDatabase sQLiteDatabase) {
            l.e(sQLiteDatabase, "sqLiteDatabase");
            return f12837l.a(this.f12839f, sQLiteDatabase);
        }

        public final SQLiteDatabase f(boolean z4) {
            if (z4) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                l.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            l.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|10|12|13|14|15|16) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.database.sqlite.SQLiteDatabase g(boolean r5) {
            /*
                r4 = this;
                java.lang.String r0 = r4.getDatabaseName()
                if (r0 == 0) goto L_0x0031
                android.content.Context r1 = r4.f12838e
                java.io.File r1 = r1.getDatabasePath(r0)
                java.io.File r1 = r1.getParentFile()
                if (r1 == 0) goto L_0x0031
                r1.mkdirs()
                boolean r2 = r1.isDirectory()
                if (r2 != 0) goto L_0x0031
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid database parent file, not a directory: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "SupportSQLite"
                android.util.Log.w(r2, r1)
            L_0x0031:
                android.database.sqlite.SQLiteDatabase r5 = r4.f(r5)     // Catch:{ all -> 0x0036 }
                return r5
            L_0x0036:
                super.close()
                r1 = 500(0x1f4, double:2.47E-321)
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x003e }
            L_0x003e:
                android.database.sqlite.SQLiteDatabase r5 = r4.f(r5)     // Catch:{ all -> 0x0043 }
                return r5
            L_0x0043:
                r1 = move-exception
                super.close()
                boolean r2 = r1 instanceof z0.C1012d.c.a
                if (r2 == 0) goto L_0x0070
                z0.d$c$a r1 = (z0.C1012d.c.a) r1
                java.lang.Throwable r2 = r1.getCause()
                z0.d$c$b r1 = r1.a()
                int[] r3 = z0.C1012d.c.C0213d.f12853a
                int r1 = r1.ordinal()
                r1 = r3[r1]
                r3 = 1
                if (r1 == r3) goto L_0x006f
                r3 = 2
                if (r1 == r3) goto L_0x006f
                r3 = 3
                if (r1 == r3) goto L_0x006f
                r3 = 4
                if (r1 == r3) goto L_0x006f
                boolean r1 = r2 instanceof android.database.sqlite.SQLiteException
                if (r1 == 0) goto L_0x006e
                goto L_0x007a
            L_0x006e:
                throw r2
            L_0x006f:
                throw r2
            L_0x0070:
                boolean r2 = r1 instanceof android.database.sqlite.SQLiteException
                if (r2 == 0) goto L_0x008b
                if (r0 == 0) goto L_0x008a
                boolean r2 = r4.f12841h
                if (r2 == 0) goto L_0x008a
            L_0x007a:
                android.content.Context r1 = r4.f12838e
                r1.deleteDatabase(r0)
                android.database.sqlite.SQLiteDatabase r5 = r4.f(r5)     // Catch:{ a -> 0x0084 }
                return r5
            L_0x0084:
                r5 = move-exception
                java.lang.Throwable r5 = r5.getCause()
                throw r5
            L_0x008a:
                throw r1
            L_0x008b:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.C1012d.c.g(boolean):android.database.sqlite.SQLiteDatabase");
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            l.e(sQLiteDatabase, "db");
            try {
                this.f12840g.b(e(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            l.e(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f12840g.d(e(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
            l.e(sQLiteDatabase, "db");
            this.f12842i = true;
            try {
                this.f12840g.e(e(sQLiteDatabase), i4, i5);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            l.e(sQLiteDatabase, "db");
            if (!this.f12842i) {
                try {
                    this.f12840g.f(e(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.f12844k = true;
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
            l.e(sQLiteDatabase, "sqLiteDatabase");
            this.f12842i = true;
            try {
                this.f12840g.g(e(sQLiteDatabase), i4, i5);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }
    }

    /* renamed from: z0.d$d  reason: collision with other inner class name */
    public static final class C0214d extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ C1012d f12854f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0214d(C1012d dVar) {
            super(0);
            this.f12854f = dVar;
        }

        /* renamed from: a */
        public final c c() {
            c cVar;
            if (this.f12854f.f12830f == null || !this.f12854f.f12832h) {
                cVar = new c(this.f12854f.f12829e, this.f12854f.f12830f, new b((C1011c) null), this.f12854f.f12831g, this.f12854f.f12833i);
            } else {
                cVar = new c(this.f12854f.f12829e, new File(d.a(this.f12854f.f12829e), this.f12854f.f12830f).getAbsolutePath(), new b((C1011c) null), this.f12854f.f12831g, this.f12854f.f12833i);
            }
            y0.b.d(cVar, this.f12854f.f12835k);
            return cVar;
        }
    }

    public C1012d(Context context, String str, h.a aVar, boolean z4, boolean z5) {
        l.e(context, "context");
        l.e(aVar, "callback");
        this.f12829e = context;
        this.f12830f = str;
        this.f12831g = aVar;
        this.f12832h = z4;
        this.f12833i = z5;
    }

    public void close() {
        if (this.f12834j.a()) {
            h().close();
        }
    }

    public String getDatabaseName() {
        return this.f12830f;
    }

    public y0.g getWritableDatabase() {
        return h().d(true);
    }

    public final c h() {
        return (c) this.f12834j.getValue();
    }

    public void setWriteAheadLoggingEnabled(boolean z4) {
        if (this.f12834j.a()) {
            y0.b.d(h(), z4);
        }
        this.f12835k = z4;
    }
}
