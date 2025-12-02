package u0;

import java.util.List;
import v0.C0946b;
import v3.g;
import v3.l;
import y0.h;

public class w extends h.a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f12274g = new a((g) null);

    /* renamed from: c  reason: collision with root package name */
    public f f12275c;

    /* renamed from: d  reason: collision with root package name */
    public final b f12276d;

    /* renamed from: e  reason: collision with root package name */
    public final String f12277e;

    /* renamed from: f  reason: collision with root package name */
    public final String f12278f;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            s3.b.a(r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(y0.g r3) {
            /*
                r2 = this;
                java.lang.String r0 = "db"
                v3.l.e(r3, r0)
                java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
                android.database.Cursor r3 = r3.query((java.lang.String) r0)
                boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x001a }
                r1 = 0
                if (r0 == 0) goto L_0x001c
                int r0 = r3.getInt(r1)     // Catch:{ all -> 0x001a }
                if (r0 != 0) goto L_0x001c
                r1 = 1
                goto L_0x001c
            L_0x001a:
                r0 = move-exception
                goto L_0x0021
            L_0x001c:
                r0 = 0
                s3.b.a(r3, r0)
                return r1
            L_0x0021:
                throw r0     // Catch:{ all -> 0x0022 }
            L_0x0022:
                r1 = move-exception
                s3.b.a(r3, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: u0.w.a.a(y0.g):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            s3.b.a(r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b(y0.g r3) {
            /*
                r2 = this;
                java.lang.String r0 = "db"
                v3.l.e(r3, r0)
                java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
                android.database.Cursor r3 = r3.query((java.lang.String) r0)
                boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x001a }
                r1 = 0
                if (r0 == 0) goto L_0x001c
                int r0 = r3.getInt(r1)     // Catch:{ all -> 0x001a }
                if (r0 == 0) goto L_0x001c
                r1 = 1
                goto L_0x001c
            L_0x001a:
                r0 = move-exception
                goto L_0x0021
            L_0x001c:
                r0 = 0
                s3.b.a(r3, r0)
                return r1
            L_0x0021:
                throw r0     // Catch:{ all -> 0x0022 }
            L_0x0022:
                r1 = move-exception
                s3.b.a(r3, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: u0.w.a.b(y0.g):boolean");
        }

        public a() {
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f12279a;

        public b(int i4) {
            this.f12279a = i4;
        }

        public abstract void a(y0.g gVar);

        public abstract void b(y0.g gVar);

        public abstract void c(y0.g gVar);

        public abstract void d(y0.g gVar);

        public abstract void e(y0.g gVar);

        public abstract void f(y0.g gVar);

        public abstract c g(y0.g gVar);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f12280a;

        /* renamed from: b  reason: collision with root package name */
        public final String f12281b;

        public c(boolean z4, String str) {
            this.f12280a = z4;
            this.f12281b = str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(f fVar, b bVar, String str, String str2) {
        super(bVar.f12279a);
        l.e(fVar, "configuration");
        l.e(bVar, "delegate");
        l.e(str, "identityHash");
        l.e(str2, "legacyHash");
        this.f12275c = fVar;
        this.f12276d = bVar;
        this.f12277e = str;
        this.f12278f = str2;
    }

    public void b(y0.g gVar) {
        l.e(gVar, "db");
        super.b(gVar);
    }

    public void d(y0.g gVar) {
        l.e(gVar, "db");
        boolean a4 = f12274g.a(gVar);
        this.f12276d.a(gVar);
        if (!a4) {
            c g4 = this.f12276d.g(gVar);
            if (!g4.f12280a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g4.f12281b);
            }
        }
        j(gVar);
        this.f12276d.c(gVar);
    }

    public void e(y0.g gVar, int i4, int i5) {
        l.e(gVar, "db");
        g(gVar, i4, i5);
    }

    public void f(y0.g gVar) {
        l.e(gVar, "db");
        super.f(gVar);
        h(gVar);
        this.f12276d.d(gVar);
        this.f12275c = null;
    }

    public void g(y0.g gVar, int i4, int i5) {
        List<C0946b> d4;
        l.e(gVar, "db");
        f fVar = this.f12275c;
        if (fVar == null || (d4 = fVar.f12156d.d(i4, i5)) == null) {
            f fVar2 = this.f12275c;
            if (fVar2 == null || fVar2.a(i4, i5)) {
                throw new IllegalStateException("A migration from " + i4 + " to " + i5 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f12276d.b(gVar);
            this.f12276d.a(gVar);
            return;
        }
        this.f12276d.f(gVar);
        for (C0946b a4 : d4) {
            a4.a(gVar);
        }
        c g4 = this.f12276d.g(gVar);
        if (g4.f12280a) {
            this.f12276d.e(gVar);
            j(gVar);
            return;
        }
        throw new IllegalStateException("Migration didn't properly handle: " + g4.f12281b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        s3.b.a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(y0.g r4) {
        /*
            r3 = this;
            u0.w$a r0 = f12274g
            boolean r0 = r0.b(r4)
            if (r0 == 0) goto L_0x005e
            y0.a r0 = new y0.a
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r0.<init>(r1)
            android.database.Cursor r4 = r4.query((y0.j) r0)
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0020 }
            r1 = 0
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x0020 }
            goto L_0x0023
        L_0x0020:
            r0 = move-exception
            goto L_0x0058
        L_0x0022:
            r0 = r1
        L_0x0023:
            s3.b.a(r4, r1)
            java.lang.String r4 = r3.f12277e
            boolean r4 = v3.l.a(r4, r0)
            if (r4 != 0) goto L_0x0070
            java.lang.String r4 = r3.f12278f
            boolean r4 = v3.l.a(r4, r0)
            if (r4 == 0) goto L_0x0037
            goto L_0x0070
        L_0x0037:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r1.append(r2)
            java.lang.String r2 = r3.f12277e
            r1.append(r2)
            java.lang.String r2 = ", found: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L_0x0058:
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            s3.b.a(r4, r0)
            throw r1
        L_0x005e:
            u0.w$b r0 = r3.f12276d
            u0.w$c r0 = r0.g(r4)
            boolean r1 = r0.f12280a
            if (r1 == 0) goto L_0x0071
            u0.w$b r0 = r3.f12276d
            r0.e(r4)
            r3.j(r4)
        L_0x0070:
            return
        L_0x0071:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r1.append(r2)
            java.lang.String r0 = r0.f12281b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.w.h(y0.g):void");
    }

    public final void i(y0.g gVar) {
        gVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    public final void j(y0.g gVar) {
        i(gVar);
        gVar.execSQL(v.a(this.f12277e));
    }
}
