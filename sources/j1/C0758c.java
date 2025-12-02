package j1;

import T2.a;
import Y2.j;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k1.C0769a;
import l1.C0776c;
import l1.C0777d;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: j1.c  reason: case insensitive filesystem */
public class C0758c implements T2.a, j.c {

    /* renamed from: e  reason: collision with root package name */
    public static final Map f10839e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public static boolean f10840f = false;

    /* renamed from: g  reason: collision with root package name */
    public static int f10841g = 10;

    /* renamed from: h  reason: collision with root package name */
    public static int f10842h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final Object f10843i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final Object f10844j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static String f10845k;

    /* renamed from: l  reason: collision with root package name */
    public static int f10846l = 0;

    /* renamed from: m  reason: collision with root package name */
    public static HandlerThread f10847m;

    /* renamed from: n  reason: collision with root package name */
    public static Handler f10848n;

    /* renamed from: o  reason: collision with root package name */
    public static final Map f10849o = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public Context f10850c;

    /* renamed from: d  reason: collision with root package name */
    public j f10851d;

    /* renamed from: j1.c$a */
    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Y2.i f10852e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ i f10853f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ C0756a f10854g;

        public a(Y2.i iVar, i iVar2, C0756a aVar) {
            this.f10852e = iVar;
            this.f10853f = iVar2;
            this.f10854g = aVar;
        }

        public void run() {
            boolean unused = C0758c.this.M(this.f10854g, new l1.e(this.f10852e, this.f10853f));
        }
    }

    /* renamed from: j1.c$b */
    public class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Y2.i f10856e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ i f10857f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ C0756a f10858g;

        public b(Y2.i iVar, i iVar2, C0756a aVar) {
            this.f10856e = iVar;
            this.f10857f = iVar2;
            this.f10858g = aVar;
        }

        public void run() {
            l1.e eVar = new l1.e(this.f10856e, this.f10857f);
            boolean e4 = eVar.e();
            boolean h4 = eVar.h();
            ArrayList arrayList = new ArrayList();
            for (Map cVar : (List) this.f10856e.a("operations")) {
                C0776c cVar2 = new C0776c(cVar, e4);
                String l4 = cVar2.l();
                l4.hashCode();
                char c4 = 65535;
                switch (l4.hashCode()) {
                    case -1319569547:
                        if (l4.equals("execute")) {
                            c4 = 0;
                            break;
                        }
                        break;
                    case -1183792455:
                        if (l4.equals("insert")) {
                            c4 = 1;
                            break;
                        }
                        break;
                    case -838846263:
                        if (l4.equals("update")) {
                            c4 = 2;
                            break;
                        }
                        break;
                    case 107944136:
                        if (l4.equals("query")) {
                            c4 = 3;
                            break;
                        }
                        break;
                }
                switch (c4) {
                    case 0:
                        if (C0758c.this.o(this.f10858g, cVar2)) {
                            cVar2.q(arrayList);
                            break;
                        } else if (h4) {
                            cVar2.p(arrayList);
                            break;
                        } else {
                            cVar2.o(this.f10857f);
                            return;
                        }
                    case 1:
                        if (C0758c.this.w(this.f10858g, cVar2)) {
                            cVar2.q(arrayList);
                            break;
                        } else if (h4) {
                            cVar2.p(arrayList);
                            break;
                        } else {
                            cVar2.o(this.f10857f);
                            return;
                        }
                    case 2:
                        if (C0758c.this.O(this.f10858g, cVar2)) {
                            cVar2.q(arrayList);
                            break;
                        } else if (h4) {
                            cVar2.p(arrayList);
                            break;
                        } else {
                            cVar2.o(this.f10857f);
                            return;
                        }
                    case 3:
                        if (C0758c.this.M(this.f10858g, cVar2)) {
                            cVar2.q(arrayList);
                            break;
                        } else if (h4) {
                            cVar2.p(arrayList);
                            break;
                        } else {
                            cVar2.o(this.f10857f);
                            return;
                        }
                    default:
                        i iVar = this.f10857f;
                        iVar.b("bad_param", "Batch method '" + l4 + "' not supported", (Object) null);
                        return;
                }
            }
            if (e4) {
                this.f10857f.a((Object) null);
            } else {
                this.f10857f.a(arrayList);
            }
        }
    }

    /* renamed from: j1.c$c  reason: collision with other inner class name */
    public class C0178c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Y2.i f10860e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ i f10861f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ C0756a f10862g;

        public C0178c(Y2.i iVar, i iVar2, C0756a aVar) {
            this.f10860e = iVar;
            this.f10861f = iVar2;
            this.f10862g = aVar;
        }

        public void run() {
            boolean unused = C0758c.this.w(this.f10862g, new l1.e(this.f10860e, this.f10861f));
        }
    }

    /* renamed from: j1.c$d */
    public class d implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ C0756a f10864e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Y2.i f10865f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ i f10866g;

        public d(C0756a aVar, Y2.i iVar, i iVar2) {
            this.f10864e = aVar;
            this.f10865f = iVar;
            this.f10866g = iVar2;
        }

        public void run() {
            if (C0758c.this.p(this.f10864e, this.f10865f, this.f10866g) != null) {
                this.f10866g.a((Object) null);
            }
        }
    }

    /* renamed from: j1.c$e */
    public class e implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Y2.i f10868e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ i f10869f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ C0756a f10870g;

        public e(Y2.i iVar, i iVar2, C0756a aVar) {
            this.f10868e = iVar;
            this.f10869f = iVar2;
            this.f10870g = aVar;
        }

        public void run() {
            boolean unused = C0758c.this.O(this.f10870g, new l1.e(this.f10868e, this.f10869f));
        }
    }

    /* renamed from: j1.c$f */
    public class f implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f10872e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f10873f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ i f10874g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Boolean f10875h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ C0756a f10876i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Y2.i f10877j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ boolean f10878k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int f10879l;

        public f(boolean z4, String str, i iVar, Boolean bool, C0756a aVar, Y2.i iVar2, boolean z5, int i4) {
            this.f10872e = z4;
            this.f10873f = str;
            this.f10874g = iVar;
            this.f10875h = bool;
            this.f10876i = aVar;
            this.f10877j = iVar2;
            this.f10878k = z5;
            this.f10879l = i4;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
            r5.f10874g.a(j1.C0758c.y(r5.f10879l, false, false));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cb, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                java.lang.Object r0 = j1.C0758c.f10844j
                monitor-enter(r0)
                boolean r1 = r5.f10872e     // Catch:{ all -> 0x0048 }
                if (r1 != 0) goto L_0x004b
                java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0048 }
                java.lang.String r2 = r5.f10873f     // Catch:{ all -> 0x0048 }
                r1.<init>(r2)     // Catch:{ all -> 0x0048 }
                java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0048 }
                java.lang.String r1 = r1.getParent()     // Catch:{ all -> 0x0048 }
                r2.<init>(r1)     // Catch:{ all -> 0x0048 }
                boolean r1 = r2.exists()     // Catch:{ all -> 0x0048 }
                if (r1 != 0) goto L_0x004b
                boolean r1 = r2.mkdirs()     // Catch:{ all -> 0x0048 }
                if (r1 != 0) goto L_0x004b
                boolean r1 = r2.exists()     // Catch:{ all -> 0x0048 }
                if (r1 != 0) goto L_0x004b
                j1.c$i r1 = r5.f10874g     // Catch:{ all -> 0x0048 }
                java.lang.String r2 = "sqlite_error"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
                r3.<init>()     // Catch:{ all -> 0x0048 }
                java.lang.String r4 = "open_failed "
                r3.append(r4)     // Catch:{ all -> 0x0048 }
                java.lang.String r4 = r5.f10873f     // Catch:{ all -> 0x0048 }
                r3.append(r4)     // Catch:{ all -> 0x0048 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0048 }
                r4 = 0
                r1.b(r2, r3, r4)     // Catch:{ all -> 0x0048 }
                monitor-exit(r0)     // Catch:{ all -> 0x0048 }
                return
            L_0x0048:
                r1 = move-exception
                goto L_0x00e0
            L_0x004b:
                java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x005b }
                java.lang.Boolean r2 = r5.f10875h     // Catch:{ Exception -> 0x005b }
                boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x005b }
                if (r1 == 0) goto L_0x005d
                j1.a r1 = r5.f10876i     // Catch:{ Exception -> 0x005b }
                r1.h()     // Catch:{ Exception -> 0x005b }
                goto L_0x0062
            L_0x005b:
                r1 = move-exception
                goto L_0x00ce
            L_0x005d:
                j1.a r1 = r5.f10876i     // Catch:{ Exception -> 0x005b }
                r1.g()     // Catch:{ Exception -> 0x005b }
            L_0x0062:
                java.lang.Object r1 = j1.C0758c.f10843i     // Catch:{ all -> 0x0048 }
                monitor-enter(r1)     // Catch:{ all -> 0x0048 }
                boolean r2 = r5.f10878k     // Catch:{ all -> 0x0079 }
                if (r2 == 0) goto L_0x007b
                java.util.Map r2 = j1.C0758c.f10839e     // Catch:{ all -> 0x0079 }
                java.lang.String r3 = r5.f10873f     // Catch:{ all -> 0x0079 }
                int r4 = r5.f10879l     // Catch:{ all -> 0x0079 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0079 }
                r2.put(r3, r4)     // Catch:{ all -> 0x0079 }
                goto L_0x007b
            L_0x0079:
                r2 = move-exception
                goto L_0x00cc
            L_0x007b:
                java.util.Map r2 = j1.C0758c.f10849o     // Catch:{ all -> 0x0079 }
                int r3 = r5.f10879l     // Catch:{ all -> 0x0079 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0079 }
                j1.a r4 = r5.f10876i     // Catch:{ all -> 0x0079 }
                r2.put(r3, r4)     // Catch:{ all -> 0x0079 }
                monitor-exit(r1)     // Catch:{ all -> 0x0079 }
                j1.a r1 = r5.f10876i     // Catch:{ all -> 0x0048 }
                int r1 = r1.f10834e     // Catch:{ all -> 0x0048 }
                boolean r1 = j1.C0757b.b(r1)     // Catch:{ all -> 0x0048 }
                if (r1 == 0) goto L_0x00be
                java.lang.String r1 = "Sqflite"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
                r2.<init>()     // Catch:{ all -> 0x0048 }
                j1.a r3 = r5.f10876i     // Catch:{ all -> 0x0048 }
                java.lang.String r3 = r3.d()     // Catch:{ all -> 0x0048 }
                r2.append(r3)     // Catch:{ all -> 0x0048 }
                java.lang.String r3 = "opened "
                r2.append(r3)     // Catch:{ all -> 0x0048 }
                int r3 = r5.f10879l     // Catch:{ all -> 0x0048 }
                r2.append(r3)     // Catch:{ all -> 0x0048 }
                java.lang.String r3 = " "
                r2.append(r3)     // Catch:{ all -> 0x0048 }
                java.lang.String r3 = r5.f10873f     // Catch:{ all -> 0x0048 }
                r2.append(r3)     // Catch:{ all -> 0x0048 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0048 }
                android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0048 }
            L_0x00be:
                monitor-exit(r0)     // Catch:{ all -> 0x0048 }
                j1.c$i r0 = r5.f10874g
                int r1 = r5.f10879l
                r2 = 0
                java.util.Map r1 = j1.C0758c.y(r1, r2, r2)
                r0.a(r1)
                return
            L_0x00cc:
                monitor-exit(r1)     // Catch:{ all -> 0x0079 }
                throw r2     // Catch:{ all -> 0x0048 }
            L_0x00ce:
                l1.e r2 = new l1.e     // Catch:{ all -> 0x0048 }
                Y2.i r3 = r5.f10877j     // Catch:{ all -> 0x0048 }
                j1.c$i r4 = r5.f10874g     // Catch:{ all -> 0x0048 }
                r2.<init>(r3, r4)     // Catch:{ all -> 0x0048 }
                j1.c r3 = j1.C0758c.this     // Catch:{ all -> 0x0048 }
                j1.a r4 = r5.f10876i     // Catch:{ all -> 0x0048 }
                r3.v(r1, r2, r4)     // Catch:{ all -> 0x0048 }
                monitor-exit(r0)     // Catch:{ all -> 0x0048 }
                return
            L_0x00e0:
                monitor-exit(r0)     // Catch:{ all -> 0x0048 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: j1.C0758c.f.run():void");
        }
    }

    /* renamed from: j1.c$g */
    public class g implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ C0756a f10881e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ i f10882f;

        public g(C0756a aVar, i iVar) {
            this.f10881e = aVar;
            this.f10882f = iVar;
        }

        public void run() {
            synchronized (C0758c.f10844j) {
                C0758c.this.k(this.f10881e);
            }
            this.f10882f.a((Object) null);
        }
    }

    /* renamed from: j1.c$h */
    public class h implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ C0756a f10884e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f10885f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ i f10886g;

        public h(C0756a aVar, String str, i iVar) {
            this.f10884e = aVar;
            this.f10885f = str;
            this.f10886g = iVar;
        }

        public void run() {
            synchronized (C0758c.f10844j) {
                C0756a aVar = this.f10884e;
                if (aVar != null) {
                    C0758c.this.k(aVar);
                }
                try {
                    if (C0757b.c(C0758c.f10842h)) {
                        Log.d("Sqflite", "delete database " + this.f10885f);
                    }
                    C0756a.b(this.f10885f);
                } catch (Exception e4) {
                    Log.e("Sqflite", "error " + e4 + " while closing database " + C0758c.f10846l);
                }
            }
            this.f10886g.a((Object) null);
        }
    }

    /* renamed from: j1.c$i */
    public class i implements j.d {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f10888a;

        /* renamed from: b  reason: collision with root package name */
        public final j.d f10889b;

        /* renamed from: j1.c$i$a */
        public class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ Object f10891e;

            public a(Object obj) {
                this.f10891e = obj;
            }

            public void run() {
                i.this.f10889b.a(this.f10891e);
            }
        }

        /* renamed from: j1.c$i$b */
        public class b implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ String f10893e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ String f10894f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ Object f10895g;

            public b(String str, String str2, Object obj) {
                this.f10893e = str;
                this.f10894f = str2;
                this.f10895g = obj;
            }

            public void run() {
                i.this.f10889b.b(this.f10893e, this.f10894f, this.f10895g);
            }
        }

        /* renamed from: j1.c$i$c  reason: collision with other inner class name */
        public class C0179c implements Runnable {
            public C0179c() {
            }

            public void run() {
                i.this.f10889b.c();
            }
        }

        public /* synthetic */ i(C0758c cVar, j.d dVar, a aVar) {
            this(dVar);
        }

        public void a(Object obj) {
            this.f10888a.post(new a(obj));
        }

        public void b(String str, String str2, Object obj) {
            this.f10888a.post(new b(str, str2, obj));
        }

        public void c() {
            this.f10888a.post(new C0179c());
        }

        public i(j.d dVar) {
            this.f10888a = new Handler(Looper.getMainLooper());
            this.f10889b = dVar;
        }
    }

    public static String N(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof byte[])) {
            return obj instanceof Map ? r((Map) obj).toString() : obj.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (byte valueOf : (byte[]) obj) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList.toString();
    }

    public static List l(Cursor cursor, int i4) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            Object n4 = n(cursor, i5);
            if (C0769a.f10969c) {
                if (n4 == null) {
                    str = null;
                } else if (n4.getClass().isArray()) {
                    str = "array(" + n4.getClass().getComponentType().getName() + ")";
                } else {
                    str = n4.getClass().getName();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("column ");
                sb.append(i5);
                sb.append(" ");
                sb.append(cursor.getType(i5));
                sb.append(": ");
                sb.append(n4);
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = " (" + str + ")";
                }
                sb.append(str2);
                Log.d("Sqflite", sb.toString());
            }
            arrayList.add(n4);
        }
        return arrayList;
    }

    public static Map m(Cursor cursor) {
        HashMap hashMap = new HashMap();
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (C0769a.f10969c) {
                Log.d("Sqflite", "column " + i4 + " " + cursor.getType(i4));
            }
            int type = cursor.getType(i4);
            if (type == 0) {
                hashMap.put(columnNames[i4], (Object) null);
            } else if (type == 1) {
                hashMap.put(columnNames[i4], Long.valueOf(cursor.getLong(i4)));
            } else if (type == 2) {
                hashMap.put(columnNames[i4], Double.valueOf(cursor.getDouble(i4)));
            } else if (type == 3) {
                hashMap.put(columnNames[i4], cursor.getString(i4));
            } else if (type == 4) {
                hashMap.put(columnNames[i4], cursor.getBlob(i4));
            }
        }
        return hashMap;
    }

    public static Object n(Cursor cursor, int i4) {
        int type = cursor.getType(i4);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i4));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i4));
        }
        if (type == 3) {
            return cursor.getString(i4);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i4);
    }

    public static Map r(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            hashMap.put(N(entry.getKey()), value instanceof Map ? r((Map) value) : N(value));
        }
        return hashMap;
    }

    public static boolean x(String str) {
        return str == null || str.equals(SQLiteDatabase.MEMORY);
    }

    public static Map y(int i4, boolean z4, boolean z5) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i4));
        if (z4) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z5) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    public final void A(Y2.i iVar, j.d dVar) {
        C0756a t4 = t(iVar, dVar);
        if (t4 != null) {
            f10848n.post(new b(iVar, new i(this, dVar, (a) null), t4));
        }
    }

    public final void B(Y2.i iVar, j.d dVar) {
        Integer num = (Integer) iVar.a("id");
        int intValue = num.intValue();
        C0756a t4 = t(iVar, dVar);
        if (t4 != null) {
            if (C0757b.b(t4.f10834e)) {
                Log.d("Sqflite", t4.d() + "closing " + intValue + " " + t4.f10831b);
            }
            String str = t4.f10831b;
            synchronized (f10843i) {
                try {
                    f10849o.remove(num);
                    if (t4.f10830a) {
                        f10839e.remove(str);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            f10848n.post(new g(t4, new i(this, dVar, (a) null)));
        }
    }

    public final void C(Y2.i iVar, j.d dVar) {
        HashMap hashMap = new HashMap();
        if ("get".equals((String) iVar.a("cmd"))) {
            int i4 = f10842h;
            if (i4 > 0) {
                hashMap.put("logLevel", Integer.valueOf(i4));
            }
            Map map = f10849o;
            if (!map.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    C0756a aVar = (C0756a) entry.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", aVar.f10831b);
                    hashMap3.put("singleInstance", Boolean.valueOf(aVar.f10830a));
                    int i5 = aVar.f10834e;
                    if (i5 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i5));
                    }
                    hashMap2.put(((Integer) entry.getKey()).toString(), hashMap3);
                }
                hashMap.put("databases", hashMap2);
            }
        }
        dVar.a(hashMap);
    }

    public final void D(Y2.i iVar, j.d dVar) {
        C0769a.f10967a = Boolean.TRUE.equals(iVar.b());
        C0769a.f10969c = C0769a.f10968b && C0769a.f10967a;
        if (!C0769a.f10967a) {
            f10842h = 0;
        } else if (C0769a.f10969c) {
            f10842h = 2;
        } else if (C0769a.f10967a) {
            f10842h = 1;
        }
        dVar.a((Object) null);
    }

    public final void E(Y2.i iVar, j.d dVar) {
        C0756a aVar;
        String str = (String) iVar.a("path");
        synchronized (f10843i) {
            try {
                if (C0757b.c(f10842h)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f10839e.keySet());
                }
                Map map = f10839e;
                Integer num = (Integer) map.get(str);
                if (num != null) {
                    Map map2 = f10849o;
                    aVar = (C0756a) map2.get(num);
                    if (aVar != null && aVar.f10835f.isOpen()) {
                        if (C0757b.c(f10842h)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(aVar.d());
                            sb.append("found single instance ");
                            sb.append(aVar.f10836g ? "(in transaction) " : "");
                            sb.append(num);
                            sb.append(" ");
                            sb.append(str);
                            Log.d("Sqflite", sb.toString());
                        }
                        map2.remove(num);
                        map.remove(str);
                    }
                }
                aVar = null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        h hVar = new h(aVar, str, new i(this, dVar, (a) null));
        Handler handler = f10848n;
        if (handler != null) {
            handler.post(hVar);
        } else {
            hVar.run();
        }
    }

    public final void F(Y2.i iVar, j.d dVar) {
        C0756a t4 = t(iVar, dVar);
        if (t4 != null) {
            f10848n.post(new d(t4, iVar, new i(this, dVar, (a) null)));
        }
    }

    public void G(Y2.i iVar, j.d dVar) {
        if (f10845k == null) {
            f10845k = this.f10850c.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        dVar.a(f10845k);
    }

    public final void H(Y2.i iVar, j.d dVar) {
        C0756a t4 = t(iVar, dVar);
        if (t4 != null) {
            f10848n.post(new C0178c(iVar, new i(this, dVar, (a) null), t4));
        }
    }

    public final void I(Y2.i iVar, j.d dVar) {
        int i4;
        C0756a aVar;
        Y2.i iVar2 = iVar;
        j.d dVar2 = dVar;
        String str = (String) iVar2.a("path");
        Boolean bool = (Boolean) iVar2.a("readOnly");
        String str2 = (String) iVar2.a("password");
        boolean x4 = x(str);
        boolean z4 = !Boolean.FALSE.equals(iVar2.a("singleInstance")) && !x4;
        if (z4) {
            synchronized (f10843i) {
                try {
                    if (C0757b.c(f10842h)) {
                        Log.d("Sqflite", "Look for " + str + " in " + f10839e.keySet());
                    }
                    Integer num = (Integer) f10839e.get(str);
                    if (!(num == null || (aVar = (C0756a) f10849o.get(num)) == null)) {
                        if (aVar.f10835f.isOpen()) {
                            if (C0757b.c(f10842h)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(aVar.d());
                                sb.append("re-opened single instance ");
                                sb.append(aVar.f10836g ? "(in transaction) " : "");
                                sb.append(num);
                                sb.append(" ");
                                sb.append(str);
                                Log.d("Sqflite", sb.toString());
                            }
                            dVar2.a(y(num.intValue(), true, aVar.f10836g));
                            return;
                        } else if (C0757b.c(f10842h)) {
                            Log.d("Sqflite", aVar.d() + "single instance database of " + str + " not opened");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Object obj = f10843i;
        synchronized (obj) {
            i4 = f10846l + 1;
            f10846l = i4;
        }
        C0756a aVar2 = new C0756a(str, str2, i4, z4, f10842h);
        i iVar3 = new i(this, dVar2, (a) null);
        synchronized (obj) {
            try {
                if (f10848n == null) {
                    HandlerThread handlerThread = new HandlerThread("Sqflite", f10841g);
                    f10847m = handlerThread;
                    handlerThread.start();
                    f10848n = new Handler(f10847m.getLooper());
                    if (C0757b.b(aVar2.f10834e)) {
                        Log.d("Sqflite", aVar2.d() + "starting thread" + f10847m + " priority " + f10841g);
                    }
                }
                if (C0757b.b(aVar2.f10834e)) {
                    Log.d("Sqflite", aVar2.d() + "opened " + i4 + " " + str);
                }
                f fVar = r1;
                f fVar2 = new f(x4, str, iVar3, bool, aVar2, iVar, z4, i4);
                f10848n.post(fVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void J(Y2.i iVar, j.d dVar) {
        Object a4 = iVar.a("queryAsMapList");
        if (a4 != null) {
            f10840f = Boolean.TRUE.equals(a4);
        }
        Object a5 = iVar.a("androidThreadPriority");
        if (a5 != null) {
            f10841g = ((Integer) a5).intValue();
        }
        Integer a6 = C0757b.a(iVar);
        if (a6 != null) {
            f10842h = a6.intValue();
        }
        dVar.a((Object) null);
    }

    public final void K(Y2.i iVar, j.d dVar) {
        C0756a t4 = t(iVar, dVar);
        if (t4 != null) {
            f10848n.post(new a(iVar, new i(this, dVar, (a) null), t4));
        }
    }

    public final void L(Y2.i iVar, j.d dVar) {
        C0756a t4 = t(iVar, dVar);
        if (t4 != null) {
            f10848n.post(new e(iVar, new i(this, dVar, (a) null), t4));
        }
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [java.util.Map, java.util.HashMap] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007c, code lost:
        if (r4 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        r4 = new java.util.ArrayList();
        r6 = new java.util.HashMap();
        r7 = r0.getColumnCount();
        r6.put("columns", java.util.Arrays.asList(r0.getColumnNames()));
        r6.put("rows", r4);
        r11 = r6;
        r6 = r4;
        r4 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        r6.add(l(r0, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00af, code lost:
        if (r4 != null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b1, code lost:
        r4 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b6, code lost:
        r14.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0043, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean M(j1.C0756a r13, l1.f r14) {
        /*
            r12 = this;
            j1.d r0 = r14.d()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r13.f10834e
            boolean r2 = j1.C0757b.b(r2)
            java.lang.String r3 = "Sqflite"
            if (r2 == 0) goto L_0x0029
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r13.d()
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r3, r2)
        L_0x0029:
            boolean r2 = f10840f
            r4 = 0
            r5 = 0
            j1.d r0 = r0.i()     // Catch:{ Exception -> 0x00c0 }
            net.sqlcipher.database.SQLiteDatabase r6 = r13.c()     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r7 = r0.e()     // Catch:{ Exception -> 0x00c0 }
            java.lang.String[] r0 = r0.b()     // Catch:{ Exception -> 0x00c0 }
            net.sqlcipher.Cursor r0 = r6.rawQuery((java.lang.String) r7, (java.lang.String[]) r0)     // Catch:{ Exception -> 0x00c0 }
            r6 = r4
            r7 = r5
        L_0x0043:
            boolean r8 = r0.moveToNext()     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            if (r8 == 0) goto L_0x00a9
            if (r2 == 0) goto L_0x007c
            java.util.Map r8 = m(r0)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            int r9 = r13.f10834e     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            boolean r9 = j1.C0757b.b(r9)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            if (r9 == 0) goto L_0x0078
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r9.<init>()     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            java.lang.String r10 = r13.d()     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r9.append(r10)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            java.lang.String r10 = N(r8)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r9.append(r10)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            android.util.Log.d(r3, r9)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            goto L_0x0078
        L_0x0072:
            r13 = move-exception
            r4 = r0
            goto L_0x00ca
        L_0x0075:
            r1 = move-exception
            r4 = r0
            goto L_0x00c1
        L_0x0078:
            r1.add(r8)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            goto L_0x0043
        L_0x007c:
            if (r4 != 0) goto L_0x00a1
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r4.<init>()     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r6.<init>()     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            int r7 = r0.getColumnCount()     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            java.lang.String r8 = "columns"
            java.lang.String[] r9 = r0.getColumnNames()     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            java.util.List r9 = java.util.Arrays.asList(r9)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r6.put(r8, r9)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            java.lang.String r8 = "rows"
            r6.put(r8, r4)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r11 = r6
            r6 = r4
            r4 = r11
        L_0x00a1:
            java.util.List r8 = l(r0, r7)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r6.add(r8)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            goto L_0x0043
        L_0x00a9:
            if (r2 == 0) goto L_0x00af
            r14.a(r1)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            goto L_0x00b9
        L_0x00af:
            if (r4 != 0) goto L_0x00b6
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r4.<init>()     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
        L_0x00b6:
            r14.a(r4)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
        L_0x00b9:
            r0.close()
            r13 = 1
            return r13
        L_0x00be:
            r13 = move-exception
            goto L_0x00ca
        L_0x00c0:
            r1 = move-exception
        L_0x00c1:
            r12.v(r1, r14, r13)     // Catch:{ all -> 0x00be }
            if (r4 == 0) goto L_0x00c9
            r4.close()
        L_0x00c9:
            return r5
        L_0x00ca:
            if (r4 == 0) goto L_0x00cf
            r4.close()
        L_0x00cf:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.C0758c.M(j1.a, l1.f):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean O(j1.C0756a r8, l1.f r9) {
        /*
            r7 = this;
            boolean r0 = r7.q(r8, r9)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r9.e()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0014
            r9.a(r3)
            return r2
        L_0x0014:
            net.sqlcipher.database.SQLiteDatabase r0 = r8.f()     // Catch:{ Exception -> 0x008a }
            java.lang.String r4 = "SELECT changes()"
            net.sqlcipher.Cursor r0 = r0.rawQuery((java.lang.String) r4, (java.lang.String[]) r3)     // Catch:{ Exception -> 0x008a }
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L_0x0067
            int r5 = r0.getCount()     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            if (r5 <= 0) goto L_0x0067
            boolean r5 = r0.moveToFirst()     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            if (r5 == 0) goto L_0x0067
            int r3 = r0.getInt(r1)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            int r5 = r8.f10834e     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            boolean r5 = j1.C0757b.b(r5)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            if (r5 == 0) goto L_0x005c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r5.<init>()     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            java.lang.String r6 = r8.d()     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r5.append(r6)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            java.lang.String r6 = "changed "
            r5.append(r6)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r5.append(r3)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            android.util.Log.d(r4, r5)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            goto L_0x005c
        L_0x0056:
            r8 = move-exception
            r3 = r0
            goto L_0x0094
        L_0x0059:
            r2 = move-exception
            r3 = r0
            goto L_0x008b
        L_0x005c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r9.a(r3)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r0.close()
            return r2
        L_0x0067:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r5.<init>()     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            java.lang.String r6 = r8.d()     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r5.append(r6)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            java.lang.String r6 = "fail to read changes for Update/Delete"
            r5.append(r6)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            android.util.Log.e(r4, r5)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            r9.a(r3)     // Catch:{ Exception -> 0x0059, all -> 0x0056 }
            if (r0 == 0) goto L_0x0087
            r0.close()
        L_0x0087:
            return r2
        L_0x0088:
            r8 = move-exception
            goto L_0x0094
        L_0x008a:
            r2 = move-exception
        L_0x008b:
            r7.v(r2, r9, r8)     // Catch:{ all -> 0x0088 }
            if (r3 == 0) goto L_0x0093
            r3.close()
        L_0x0093:
            return r1
        L_0x0094:
            if (r3 == 0) goto L_0x0099
            r3.close()
        L_0x0099:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.C0758c.O(j1.a, l1.f):boolean");
    }

    public final void k(C0756a aVar) {
        try {
            if (C0757b.b(aVar.f10834e)) {
                Log.d("Sqflite", aVar.d() + "closing database " + f10847m);
            }
            aVar.a();
        } catch (Exception e4) {
            Log.e("Sqflite", "error " + e4 + " while closing database " + f10846l);
        }
        synchronized (f10843i) {
            try {
                if (f10849o.isEmpty() && f10848n != null) {
                    if (C0757b.b(aVar.f10834e)) {
                        Log.d("Sqflite", aVar.d() + "stopping thread" + f10847m);
                    }
                    f10847m.quit();
                    f10847m = null;
                    f10848n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean o(C0756a aVar, l1.f fVar) {
        if (!q(aVar, fVar)) {
            return false;
        }
        fVar.a((Object) null);
        return true;
    }

    public void onAttachedToEngine(a.b bVar) {
        z(bVar.a(), bVar.b());
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f10850c = null;
        this.f10851d.e((j.c) null);
        this.f10851d = null;
    }

    public void onMethodCall(Y2.i iVar, j.d dVar) {
        String str = iVar.f3766a;
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1319569547:
                if (str.equals("execute")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str.equals("closeDatabase")) {
                    c4 = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals("options")) {
                    c4 = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c4 = 3;
                    break;
                }
                break;
            case -838846263:
                if (str.equals("update")) {
                    c4 = 4;
                    break;
                }
                break;
            case -263511994:
                if (str.equals("deleteDatabase")) {
                    c4 = 5;
                    break;
                }
                break;
            case -198450538:
                if (str.equals("debugMode")) {
                    c4 = 6;
                    break;
                }
                break;
            case -17190427:
                if (str.equals("openDatabase")) {
                    c4 = 7;
                    break;
                }
                break;
            case 93509434:
                if (str.equals("batch")) {
                    c4 = 8;
                    break;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c4 = 9;
                    break;
                }
                break;
            case 107944136:
                if (str.equals("query")) {
                    c4 = 10;
                    break;
                }
                break;
            case 1385449135:
                if (str.equals("getPlatformVersion")) {
                    c4 = 11;
                    break;
                }
                break;
            case 1863829223:
                if (str.equals("getDatabasesPath")) {
                    c4 = 12;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                F(iVar, dVar);
                return;
            case 1:
                B(iVar, dVar);
                return;
            case 2:
                J(iVar, dVar);
                return;
            case 3:
                H(iVar, dVar);
                return;
            case 4:
                L(iVar, dVar);
                return;
            case 5:
                E(iVar, dVar);
                return;
            case 6:
                D(iVar, dVar);
                return;
            case 7:
                I(iVar, dVar);
                return;
            case 8:
                A(iVar, dVar);
                return;
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                C(iVar, dVar);
                return;
            case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                K(iVar, dVar);
                return;
            case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                dVar.a("Android " + Build.VERSION.RELEASE);
                return;
            case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                G(iVar, dVar);
                return;
            default:
                dVar.c();
                return;
        }
    }

    public final C0756a p(C0756a aVar, Y2.i iVar, j.d dVar) {
        if (q(aVar, new C0777d(dVar, u(iVar), (Boolean) iVar.a("inTransaction")))) {
            return aVar;
        }
        return null;
    }

    public final boolean q(C0756a aVar, l1.f fVar) {
        C0759d d4 = fVar.d();
        if (C0757b.b(aVar.f10834e)) {
            Log.d("Sqflite", aVar.d() + d4);
        }
        Boolean f4 = fVar.f();
        try {
            aVar.f().execSQL(d4.e(), d4.f());
            if (Boolean.TRUE.equals(f4)) {
                aVar.f10836g = true;
            }
            if (Boolean.FALSE.equals(f4)) {
                aVar.f10836g = false;
            }
            return true;
        } catch (Exception e4) {
            v(e4, fVar, aVar);
            if (Boolean.FALSE.equals(f4)) {
                aVar.f10836g = false;
            }
            return false;
        } catch (Throwable th) {
            if (Boolean.FALSE.equals(f4)) {
                aVar.f10836g = false;
            }
            throw th;
        }
    }

    public final C0756a s(int i4) {
        return (C0756a) f10849o.get(Integer.valueOf(i4));
    }

    public final C0756a t(Y2.i iVar, j.d dVar) {
        int intValue = ((Integer) iVar.a("id")).intValue();
        C0756a s4 = s(intValue);
        if (s4 != null) {
            return s4;
        }
        dVar.b("sqlite_error", "database_closed " + intValue, (Object) null);
        return null;
    }

    public final C0759d u(Y2.i iVar) {
        return new C0759d((String) iVar.a("sql"), (List) iVar.a("arguments"));
    }

    public final void v(Exception exc, l1.f fVar, C0756a aVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            fVar.b("sqlite_error", "open_failed " + aVar.f10831b, (Object) null);
        } else if (exc.getMessage().toLowerCase().contains("could not open database")) {
            fVar.b("sqlite_error", "open_failed " + aVar.f10831b, (Object) null);
        } else if (exc.getMessage().toLowerCase().contains("file is not a database")) {
            fVar.b("sqlite_error", "open_failed " + aVar.f10831b, (Object) null);
        } else if (exc instanceof SQLException) {
            fVar.b("sqlite_error", exc.getMessage(), l1.h.a(fVar));
        } else {
            fVar.b("sqlite_error", exc.getMessage(), l1.h.a(fVar));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w(j1.C0756a r10, l1.f r11) {
        /*
            r9 = this;
            boolean r0 = r9.q(r10, r11)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r11.e()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0014
            r11.a(r2)
            return r3
        L_0x0014:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            net.sqlcipher.database.SQLiteDatabase r4 = r10.f()     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            net.sqlcipher.Cursor r0 = r4.rawQuery((java.lang.String) r0, (java.lang.String[]) r2)     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L_0x009f
            int r5 = r0.getCount()     // Catch:{ Exception -> 0x0064 }
            if (r5 <= 0) goto L_0x009f
            boolean r5 = r0.moveToFirst()     // Catch:{ Exception -> 0x0064 }
            if (r5 == 0) goto L_0x009f
            int r5 = r0.getInt(r1)     // Catch:{ Exception -> 0x0064 }
            if (r5 != 0) goto L_0x006d
            int r5 = r10.f10834e     // Catch:{ Exception -> 0x0064 }
            boolean r5 = j1.C0757b.b(r5)     // Catch:{ Exception -> 0x0064 }
            if (r5 == 0) goto L_0x0066
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0064 }
            r5.<init>()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r6 = r10.d()     // Catch:{ Exception -> 0x0064 }
            r5.append(r6)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch:{ Exception -> 0x0064 }
            long r6 = r0.getLong(r3)     // Catch:{ Exception -> 0x0064 }
            r5.append(r6)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0064 }
            android.util.Log.d(r4, r5)     // Catch:{ Exception -> 0x0064 }
            goto L_0x0066
        L_0x0061:
            r10 = move-exception
            r2 = r0
            goto L_0x00cf
        L_0x0064:
            r2 = move-exception
            goto L_0x00c6
        L_0x0066:
            r11.a(r2)     // Catch:{ Exception -> 0x0064 }
            r0.close()
            return r3
        L_0x006d:
            long r5 = r0.getLong(r3)     // Catch:{ Exception -> 0x0064 }
            int r2 = r10.f10834e     // Catch:{ Exception -> 0x0064 }
            boolean r2 = j1.C0757b.b(r2)     // Catch:{ Exception -> 0x0064 }
            if (r2 == 0) goto L_0x0094
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0064 }
            r2.<init>()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r7 = r10.d()     // Catch:{ Exception -> 0x0064 }
            r2.append(r7)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r7 = "inserted "
            r2.append(r7)     // Catch:{ Exception -> 0x0064 }
            r2.append(r5)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0064 }
            android.util.Log.d(r4, r2)     // Catch:{ Exception -> 0x0064 }
        L_0x0094:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0064 }
            r11.a(r2)     // Catch:{ Exception -> 0x0064 }
            r0.close()
            return r3
        L_0x009f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0064 }
            r5.<init>()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r6 = r10.d()     // Catch:{ Exception -> 0x0064 }
            r5.append(r6)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0064 }
            android.util.Log.e(r4, r5)     // Catch:{ Exception -> 0x0064 }
            r11.a(r2)     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x00bf
            r0.close()
        L_0x00bf:
            return r3
        L_0x00c0:
            r10 = move-exception
            goto L_0x00cf
        L_0x00c2:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
        L_0x00c6:
            r9.v(r2, r11, r10)     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x00ce
            r0.close()
        L_0x00ce:
            return r1
        L_0x00cf:
            if (r2 == 0) goto L_0x00d4
            r2.close()
        L_0x00d4:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.C0758c.w(j1.a, l1.f):boolean");
    }

    public final void z(Context context, Y2.b bVar) {
        this.f10850c = context;
        SQLiteDatabase.loadLibs(context);
        j jVar = new j(bVar, "com.davidmartos96.sqflite_sqlcipher");
        this.f10851d = jVar;
        jVar.e(this);
    }
}
