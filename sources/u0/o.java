package u0;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.util.Log;
import h3.C0673n;
import i3.C0721E;
import i3.C0722F;
import i3.C0723G;
import i3.C0746w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import r.C0902b;
import v3.g;
import v3.l;
import y0.C1005a;
import y0.k;

public class o {

    /* renamed from: q  reason: collision with root package name */
    public static final a f12180q = new a((g) null);

    /* renamed from: r  reason: collision with root package name */
    public static final String[] f12181r = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    public final u f12182a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f12183b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f12184c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f12185d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f12186e;

    /* renamed from: f  reason: collision with root package name */
    public C0940c f12187f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicBoolean f12188g = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f12189h;

    /* renamed from: i  reason: collision with root package name */
    public volatile k f12190i;

    /* renamed from: j  reason: collision with root package name */
    public final b f12191j;

    /* renamed from: k  reason: collision with root package name */
    public final m f12192k;

    /* renamed from: l  reason: collision with root package name */
    public final C0902b f12193l;

    /* renamed from: m  reason: collision with root package name */
    public r f12194m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f12195n;

    /* renamed from: o  reason: collision with root package name */
    public final Object f12196o;

    /* renamed from: p  reason: collision with root package name */
    public final Runnable f12197p;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(y0.g gVar) {
            l.e(gVar, "database");
            if (gVar.isWriteAheadLoggingEnabled()) {
                gVar.beginTransactionNonExclusive();
            } else {
                gVar.beginTransaction();
            }
        }

        public final String b(String str, String str2) {
            l.e(str, "tableName");
            l.e(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final a f12198e = new a((g) null);

        /* renamed from: a  reason: collision with root package name */
        public final long[] f12199a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f12200b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f12201c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f12202d;

        public static final class a {
            public /* synthetic */ a(g gVar) {
                this();
            }

            public a() {
            }
        }

        public b(int i4) {
            this.f12199a = new long[i4];
            this.f12200b = new boolean[i4];
            this.f12201c = new int[i4];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.f12202d) {
                        return null;
                    }
                    long[] jArr = this.f12199a;
                    int length = jArr.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length) {
                        int i6 = i5 + 1;
                        int i7 = 1;
                        boolean z4 = jArr[i4] > 0;
                        boolean[] zArr = this.f12200b;
                        if (z4 != zArr[i5]) {
                            int[] iArr = this.f12201c;
                            if (!z4) {
                                i7 = 2;
                            }
                            iArr[i5] = i7;
                        } else {
                            this.f12201c[i5] = 0;
                        }
                        zArr[i5] = z4;
                        i4++;
                        i5 = i6;
                    }
                    this.f12202d = false;
                    int[] iArr2 = (int[]) this.f12201c.clone();
                    return iArr2;
                } finally {
                }
            }
        }

        public final boolean b(int... iArr) {
            boolean z4;
            l.e(iArr, "tableIds");
            synchronized (this) {
                try {
                    z4 = false;
                    for (int i4 : iArr) {
                        long[] jArr = this.f12199a;
                        long j4 = jArr[i4];
                        jArr[i4] = 1 + j4;
                        if (j4 == 0) {
                            this.f12202d = true;
                            z4 = true;
                        }
                    }
                    C0673n nVar = C0673n.f9639a;
                } finally {
                }
            }
            return z4;
        }

        public final boolean c(int... iArr) {
            boolean z4;
            l.e(iArr, "tableIds");
            synchronized (this) {
                try {
                    z4 = false;
                    for (int i4 : iArr) {
                        long[] jArr = this.f12199a;
                        long j4 = jArr[i4];
                        jArr[i4] = j4 - 1;
                        if (j4 == 1) {
                            this.f12202d = true;
                            z4 = true;
                        }
                    }
                    C0673n nVar = C0673n.f9639a;
                } finally {
                }
            }
            return z4;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f12200b, false);
                this.f12202d = true;
                C0673n nVar = C0673n.f9639a;
            }
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f12203a;

        public c(String[] strArr) {
            l.e(strArr, "tables");
            this.f12203a = strArr;
        }

        public final String[] a() {
            return this.f12203a;
        }

        public abstract boolean b();

        public abstract void c(Set set);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final c f12204a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f12205b;

        /* renamed from: c  reason: collision with root package name */
        public final String[] f12206c;

        /* renamed from: d  reason: collision with root package name */
        public final Set f12207d;

        public d(c cVar, int[] iArr, String[] strArr) {
            l.e(cVar, "observer");
            l.e(iArr, "tableIds");
            l.e(strArr, "tableNames");
            this.f12204a = cVar;
            this.f12205b = iArr;
            this.f12206c = strArr;
            this.f12207d = !(strArr.length == 0) ? C0722F.c(strArr[0]) : C0723G.d();
            if (iArr.length != strArr.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] a() {
            return this.f12205b;
        }

        public final void b(Set set) {
            Set set2;
            l.e(set, "invalidatedTablesIds");
            int[] iArr = this.f12205b;
            int length = iArr.length;
            if (length != 0) {
                int i4 = 0;
                if (length != 1) {
                    Set b4 = C0722F.b();
                    int[] iArr2 = this.f12205b;
                    int length2 = iArr2.length;
                    int i5 = 0;
                    while (i4 < length2) {
                        int i6 = i5 + 1;
                        if (set.contains(Integer.valueOf(iArr2[i4]))) {
                            b4.add(this.f12206c[i5]);
                        }
                        i4++;
                        i5 = i6;
                    }
                    set2 = C0722F.a(b4);
                } else {
                    set2 = set.contains(Integer.valueOf(iArr[0])) ? this.f12207d : C0723G.d();
                }
            } else {
                set2 = C0723G.d();
            }
            if (!set2.isEmpty()) {
                this.f12204a.c(set2);
            }
        }

        public final void c(String[] strArr) {
            Set set;
            l.e(strArr, "tables");
            int length = this.f12206c.length;
            if (length != 0) {
                if (length == 1) {
                    int length2 = strArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            set = C0723G.d();
                            break;
                        } else if (C3.o.o(strArr[i4], this.f12206c[0], true)) {
                            set = this.f12207d;
                            break;
                        } else {
                            i4++;
                        }
                    }
                } else {
                    Set b4 = C0722F.b();
                    for (String str : strArr) {
                        for (String str2 : this.f12206c) {
                            if (C3.o.o(str2, str, true)) {
                                b4.add(str2);
                            }
                        }
                    }
                    set = C0722F.a(b4);
                }
            } else {
                set = C0723G.d();
            }
            if (!set.isEmpty()) {
                this.f12204a.c(set);
            }
        }
    }

    public static final class e implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ o f12208e;

        public e(o oVar) {
            this.f12208e = oVar;
        }

        public final Set a() {
            o oVar = this.f12208e;
            Set b4 = C0722F.b();
            Cursor y4 = u.y(oVar.e(), new C1005a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), (CancellationSignal) null, 2, (Object) null);
            while (y4.moveToNext()) {
                try {
                    b4.add(Integer.valueOf(y4.getInt(0)));
                } catch (Throwable th) {
                    s3.b.a(y4, th);
                    throw th;
                }
            }
            C0673n nVar = C0673n.f9639a;
            s3.b.a(y4, (Throwable) null);
            Set a4 = C0722F.a(b4);
            if (!a4.isEmpty()) {
                if (this.f12208e.d() != null) {
                    k d4 = this.f12208e.d();
                    if (d4 != null) {
                        d4.executeUpdateDelete();
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return a4;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
            if (r0 != null) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
            r0.e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
            if (r0 == null) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bd, code lost:
            if (r0 == null) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c4, code lost:
            if (r2.isEmpty() != false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c6, code lost:
            r0 = r4.f12208e.f();
            r1 = r4.f12208e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ce, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            r1 = r1.f().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00db, code lost:
            if (r1.hasNext() == false) goto L_0x00ef;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00dd, code lost:
            ((u0.o.d) ((java.util.Map.Entry) r1.next()).getValue()).b(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ed, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ef, code lost:
            r1 = h3.C0673n.f9639a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f1, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f4, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                u0.o r0 = r4.f12208e
                u0.u r0 = r0.e()
                java.util.concurrent.locks.Lock r0 = r0.k()
                r0.lock()
                u0.o r1 = r4.f12208e     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                boolean r1 = r1.c()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                if (r1 != 0) goto L_0x0024
                r0.unlock()
                u0.o r0 = r4.f12208e
                u0.c r0 = r0.f12187f
                if (r0 == 0) goto L_0x0023
                r0.e()
            L_0x0023:
                return
            L_0x0024:
                u0.o r1 = r4.f12208e     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                java.util.concurrent.atomic.AtomicBoolean r1 = r1.g()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                r2 = 1
                r3 = 0
                boolean r1 = r1.compareAndSet(r2, r3)     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                if (r1 != 0) goto L_0x0041
                r0.unlock()
                u0.o r0 = r4.f12208e
                u0.c r0 = r0.f12187f
                if (r0 == 0) goto L_0x0040
                r0.e()
            L_0x0040:
                return
            L_0x0041:
                u0.o r1 = r4.f12208e     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                u0.u r1 = r1.e()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                boolean r1 = r1.q()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                if (r1 == 0) goto L_0x005c
                r0.unlock()
                u0.o r0 = r4.f12208e
                u0.c r0 = r0.f12187f
                if (r0 == 0) goto L_0x005b
                r0.e()
            L_0x005b:
                return
            L_0x005c:
                u0.o r1 = r4.f12208e     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                u0.u r1 = r1.e()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                y0.h r1 = r1.m()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                y0.g r1 = r1.getWritableDatabase()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                r1.beginTransactionNonExclusive()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                java.util.Set r2 = r4.a()     // Catch:{ all -> 0x008d }
                r1.setTransactionSuccessful()     // Catch:{ all -> 0x008d }
                r1.endTransaction()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                r0.unlock()
                u0.o r0 = r4.f12208e
                u0.c r0 = r0.f12187f
                if (r0 == 0) goto L_0x00c0
            L_0x0082:
                r0.e()
                goto L_0x00c0
            L_0x0086:
                r1 = move-exception
                goto L_0x00f6
            L_0x0089:
                r1 = move-exception
                goto L_0x0092
            L_0x008b:
                r1 = move-exception
                goto L_0x00a9
            L_0x008d:
                r2 = move-exception
                r1.endTransaction()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                throw r2     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
            L_0x0092:
                java.lang.String r2 = "ROOM"
                java.lang.String r3 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0086 }
                java.util.Set r2 = i3.C0723G.d()     // Catch:{ all -> 0x0086 }
                r0.unlock()
                u0.o r0 = r4.f12208e
                u0.c r0 = r0.f12187f
                if (r0 == 0) goto L_0x00c0
                goto L_0x0082
            L_0x00a9:
                java.lang.String r2 = "ROOM"
                java.lang.String r3 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0086 }
                java.util.Set r2 = i3.C0723G.d()     // Catch:{ all -> 0x0086 }
                r0.unlock()
                u0.o r0 = r4.f12208e
                u0.c r0 = r0.f12187f
                if (r0 == 0) goto L_0x00c0
                goto L_0x0082
            L_0x00c0:
                boolean r0 = r2.isEmpty()
                if (r0 != 0) goto L_0x00f5
                u0.o r0 = r4.f12208e
                r.b r0 = r0.f()
                u0.o r1 = r4.f12208e
                monitor-enter(r0)
                r.b r1 = r1.f()     // Catch:{ all -> 0x00ed }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ed }
            L_0x00d7:
                boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00ed }
                if (r3 == 0) goto L_0x00ef
                java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00ed }
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00ed }
                java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00ed }
                u0.o$d r3 = (u0.o.d) r3     // Catch:{ all -> 0x00ed }
                r3.b(r2)     // Catch:{ all -> 0x00ed }
                goto L_0x00d7
            L_0x00ed:
                r1 = move-exception
                goto L_0x00f3
            L_0x00ef:
                h3.n r1 = h3.C0673n.f9639a     // Catch:{ all -> 0x00ed }
                monitor-exit(r0)
                goto L_0x00f5
            L_0x00f3:
                monitor-exit(r0)
                throw r1
            L_0x00f5:
                return
            L_0x00f6:
                r0.unlock()
                u0.o r0 = r4.f12208e
                u0.c r0 = r0.f12187f
                if (r0 == 0) goto L_0x0104
                r0.e()
            L_0x0104:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: u0.o.e.run():void");
        }
    }

    public o(u uVar, Map map, Map map2, String... strArr) {
        String str;
        l.e(uVar, "database");
        l.e(map, "shadowTablesMap");
        l.e(map2, "viewTables");
        l.e(strArr, "tableNames");
        this.f12182a = uVar;
        this.f12183b = map;
        this.f12184c = map2;
        this.f12191j = new b(strArr.length);
        this.f12192k = new m(uVar);
        this.f12193l = new C0902b();
        this.f12195n = new Object();
        this.f12196o = new Object();
        this.f12185d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            String str2 = strArr[i4];
            Locale locale = Locale.US;
            l.d(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            l.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f12185d.put(lowerCase, Integer.valueOf(i4));
            String str3 = (String) this.f12183b.get(strArr[i4]);
            if (str3 != null) {
                l.d(locale, "US");
                str = str3.toLowerCase(locale);
                l.d(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i4] = lowerCase;
        }
        this.f12186e = strArr2;
        for (Map.Entry entry : this.f12183b.entrySet()) {
            Locale locale2 = Locale.US;
            l.d(locale2, "US");
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            l.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f12185d.containsKey(lowerCase2)) {
                l.d(locale2, "US");
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                l.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map map3 = this.f12185d;
                map3.put(lowerCase3, C0721E.h(map3, lowerCase2));
            }
        }
        this.f12197p = new e(this);
    }

    public void b(c cVar) {
        d dVar;
        l.e(cVar, "observer");
        String[] n4 = n(cVar.a());
        ArrayList arrayList = new ArrayList(n4.length);
        int length = n4.length;
        int i4 = 0;
        while (i4 < length) {
            String str = n4[i4];
            Map map = this.f12185d;
            Locale locale = Locale.US;
            l.d(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            l.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num != null) {
                arrayList.add(num);
                i4++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        int[] H4 = C0746w.H(arrayList);
        d dVar2 = new d(cVar, H4, n4);
        synchronized (this.f12193l) {
            dVar = (d) this.f12193l.y(cVar, dVar2);
        }
        if (dVar == null && this.f12191j.b(Arrays.copyOf(H4, H4.length))) {
            s();
        }
    }

    public final boolean c() {
        if (!this.f12182a.w()) {
            return false;
        }
        if (!this.f12189h) {
            this.f12182a.m().getWritableDatabase();
        }
        if (this.f12189h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final k d() {
        return this.f12190i;
    }

    public final u e() {
        return this.f12182a;
    }

    public final C0902b f() {
        return this.f12193l;
    }

    public final AtomicBoolean g() {
        return this.f12188g;
    }

    public final Map h() {
        return this.f12185d;
    }

    public final void i(y0.g gVar) {
        l.e(gVar, "database");
        synchronized (this.f12196o) {
            if (this.f12189h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            gVar.execSQL("PRAGMA temp_store = MEMORY;");
            gVar.execSQL("PRAGMA recursive_triggers='ON';");
            gVar.execSQL("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            t(gVar);
            this.f12190i = gVar.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f12189h = true;
            C0673n nVar = C0673n.f9639a;
        }
    }

    public final void j(String... strArr) {
        l.e(strArr, "tables");
        synchronized (this.f12193l) {
            try {
                for (Map.Entry entry : this.f12193l) {
                    l.d(entry, "(observer, wrapper)");
                    d dVar = (d) entry.getValue();
                    if (!((c) entry.getKey()).b()) {
                        dVar.c(strArr);
                    }
                }
                C0673n nVar = C0673n.f9639a;
            } finally {
            }
        }
    }

    public final void k() {
        synchronized (this.f12196o) {
            this.f12189h = false;
            this.f12191j.d();
            C0673n nVar = C0673n.f9639a;
        }
    }

    public void l() {
        if (this.f12188g.compareAndSet(false, true)) {
            C0940c cVar = this.f12187f;
            if (cVar != null) {
                cVar.j();
            }
            this.f12182a.n().execute(this.f12197p);
        }
    }

    public void m(c cVar) {
        d dVar;
        l.e(cVar, "observer");
        synchronized (this.f12193l) {
            dVar = (d) this.f12193l.z(cVar);
        }
        if (dVar != null) {
            b bVar = this.f12191j;
            int[] a4 = dVar.a();
            if (bVar.c(Arrays.copyOf(a4, a4.length))) {
                s();
            }
        }
    }

    public final String[] n(String[] strArr) {
        Set b4 = C0722F.b();
        for (String str : strArr) {
            Map map = this.f12184c;
            Locale locale = Locale.US;
            l.d(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            l.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f12184c;
                l.d(locale, "US");
                String lowerCase2 = str.toLowerCase(locale);
                l.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                l.b(obj);
                b4.addAll((Collection) obj);
            } else {
                b4.add(str);
            }
        }
        Object[] array = C0722F.a(b4).toArray(new String[0]);
        l.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public final void o(C0940c cVar) {
        l.e(cVar, "autoCloser");
        this.f12187f = cVar;
        cVar.m(new n(this));
    }

    public final void p(Context context, String str, Intent intent) {
        l.e(context, "context");
        l.e(str, "name");
        l.e(intent, "serviceIntent");
        this.f12194m = new r(context, str, intent, this, this.f12182a.n());
    }

    public final void q(y0.g gVar, int i4) {
        gVar.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i4 + ", 0)");
        String str = this.f12186e[i4];
        for (String str2 : f12181r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f12180q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE " + "room_table_modification_log" + " SET " + "invalidated" + " = 1" + " WHERE " + "table_id" + " = " + i4 + " AND " + "invalidated" + " = 0" + "; END";
            l.d(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.execSQL(str3);
        }
    }

    public final void r(y0.g gVar, int i4) {
        String str = this.f12186e[i4];
        for (String str2 : f12181r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f12180q.b(str, str2);
            l.d(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.execSQL(str3);
        }
    }

    public final void s() {
        if (this.f12182a.w()) {
            t(this.f12182a.m().getWritableDatabase());
        }
    }

    public final void t(y0.g gVar) {
        Lock k4;
        l.e(gVar, "database");
        if (!gVar.inTransaction()) {
            try {
                k4 = this.f12182a.k();
                k4.lock();
                synchronized (this.f12195n) {
                    int[] a4 = this.f12191j.a();
                    if (a4 == null) {
                        k4.unlock();
                        return;
                    }
                    f12180q.a(gVar);
                    try {
                        int length = a4.length;
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < length) {
                            int i6 = a4[i4];
                            int i7 = i5 + 1;
                            if (i6 == 1) {
                                q(gVar, i5);
                            } else if (i6 == 2) {
                                r(gVar, i5);
                            }
                            i4++;
                            i5 = i7;
                        }
                        gVar.setTransactionSuccessful();
                        gVar.endTransaction();
                        C0673n nVar = C0673n.f9639a;
                        k4.unlock();
                    } finally {
                        gVar.endTransaction();
                    }
                }
            } catch (IllegalStateException e4) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
            } catch (SQLiteException e5) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e5);
            } catch (Throwable th) {
                k4.unlock();
                throw th;
            }
        }
    }
}
