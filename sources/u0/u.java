package u0;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import i3.C0721E;
import i3.C0723G;
import i3.C0738o;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import q.C0882c;
import v0.C0946b;
import v3.l;
import v3.m;
import y0.h;
import y0.j;
import y0.k;
import z0.C1014f;

public abstract class u {

    /* renamed from: o  reason: collision with root package name */
    public static final c f12229o = new c((v3.g) null);

    /* renamed from: a  reason: collision with root package name */
    public volatile y0.g f12230a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f12231b;

    /* renamed from: c  reason: collision with root package name */
    public Executor f12232c;

    /* renamed from: d  reason: collision with root package name */
    public y0.h f12233d;

    /* renamed from: e  reason: collision with root package name */
    public final o f12234e = g();

    /* renamed from: f  reason: collision with root package name */
    public boolean f12235f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12236g;

    /* renamed from: h  reason: collision with root package name */
    public List f12237h;

    /* renamed from: i  reason: collision with root package name */
    public Map f12238i = new LinkedHashMap();

    /* renamed from: j  reason: collision with root package name */
    public final ReentrantReadWriteLock f12239j = new ReentrantReadWriteLock();

    /* renamed from: k  reason: collision with root package name */
    public C0940c f12240k;

    /* renamed from: l  reason: collision with root package name */
    public final ThreadLocal f12241l = new ThreadLocal();

    /* renamed from: m  reason: collision with root package name */
    public final Map f12242m;

    /* renamed from: n  reason: collision with root package name */
    public final Map f12243n;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f12244a;

        /* renamed from: b  reason: collision with root package name */
        public final Class f12245b;

        /* renamed from: c  reason: collision with root package name */
        public final String f12246c;

        /* renamed from: d  reason: collision with root package name */
        public final List f12247d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final List f12248e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        public List f12249f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        public Executor f12250g;

        /* renamed from: h  reason: collision with root package name */
        public Executor f12251h;

        /* renamed from: i  reason: collision with root package name */
        public h.c f12252i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f12253j;

        /* renamed from: k  reason: collision with root package name */
        public d f12254k = d.AUTOMATIC;

        /* renamed from: l  reason: collision with root package name */
        public Intent f12255l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f12256m = true;

        /* renamed from: n  reason: collision with root package name */
        public boolean f12257n;

        /* renamed from: o  reason: collision with root package name */
        public long f12258o = -1;

        /* renamed from: p  reason: collision with root package name */
        public TimeUnit f12259p;

        /* renamed from: q  reason: collision with root package name */
        public final e f12260q = new e();

        /* renamed from: r  reason: collision with root package name */
        public Set f12261r = new LinkedHashSet();

        /* renamed from: s  reason: collision with root package name */
        public Set f12262s;

        /* renamed from: t  reason: collision with root package name */
        public String f12263t;

        /* renamed from: u  reason: collision with root package name */
        public File f12264u;

        /* renamed from: v  reason: collision with root package name */
        public Callable f12265v;

        public a(Context context, Class cls, String str) {
            l.e(context, "context");
            l.e(cls, "klass");
            this.f12244a = context;
            this.f12245b = cls;
            this.f12246c = str;
        }

        public a a(b bVar) {
            l.e(bVar, "callback");
            this.f12247d.add(bVar);
            return this;
        }

        public a b(C0946b... bVarArr) {
            l.e(bVarArr, "migrations");
            if (this.f12262s == null) {
                this.f12262s = new HashSet();
            }
            for (C0946b bVar : bVarArr) {
                Set set = this.f12262s;
                l.b(set);
                set.add(Integer.valueOf(bVar.f12404a));
                Set set2 = this.f12262s;
                l.b(set2);
                set2.add(Integer.valueOf(bVar.f12405b));
            }
            this.f12260q.b((C0946b[]) Arrays.copyOf(bVarArr, bVarArr.length));
            return this;
        }

        public a c() {
            this.f12253j = true;
            return this;
        }

        public u d() {
            Executor executor = this.f12250g;
            if (executor == null && this.f12251h == null) {
                Executor f4 = C0882c.f();
                this.f12251h = f4;
                this.f12250g = f4;
            } else if (executor != null && this.f12251h == null) {
                this.f12251h = executor;
            } else if (executor == null) {
                this.f12250g = this.f12251h;
            }
            Set<Number> set = this.f12262s;
            if (set != null) {
                l.b(set);
                for (Number intValue : set) {
                    int intValue2 = intValue.intValue();
                    if (this.f12261r.contains(Integer.valueOf(intValue2))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue2).toString());
                    }
                }
            }
            e eVar = this.f12252i;
            if (eVar == null) {
                eVar = new C1014f();
            }
            if (eVar != null) {
                if (this.f12258o > 0) {
                    if (this.f12246c != null) {
                        long j4 = this.f12258o;
                        TimeUnit timeUnit = this.f12259p;
                        if (timeUnit != null) {
                            Executor executor2 = this.f12250g;
                            if (executor2 != null) {
                                eVar = new e(eVar, new C0940c(j4, timeUnit, executor2));
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                }
                String str = this.f12263t;
                if (!(str == null && this.f12264u == null && this.f12265v == null)) {
                    if (this.f12246c != null) {
                        int i4 = 0;
                        int i5 = str == null ? 0 : 1;
                        File file = this.f12264u;
                        int i6 = file == null ? 0 : 1;
                        Callable callable = this.f12265v;
                        if (callable != null) {
                            i4 = 1;
                        }
                        if (i5 + i6 + i4 == 1) {
                            eVar = new z(str, file, callable, eVar);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                }
            } else {
                eVar = null;
            }
            z zVar = eVar;
            if (zVar != null) {
                Context context = this.f12244a;
                String str2 = this.f12246c;
                e eVar2 = this.f12260q;
                List list = this.f12247d;
                boolean z4 = this.f12253j;
                d k4 = this.f12254k.k(context);
                Executor executor3 = this.f12250g;
                if (executor3 != null) {
                    Executor executor4 = this.f12251h;
                    if (executor4 != null) {
                        f fVar = new f(context, str2, zVar, eVar2, list, z4, k4, executor3, executor4, this.f12255l, this.f12256m, this.f12257n, this.f12261r, this.f12263t, this.f12264u, this.f12265v, (f) null, this.f12248e, this.f12249f);
                        u uVar = (u) t.b(this.f12245b, "_Impl");
                        uVar.r(fVar);
                        return uVar;
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public a e() {
            this.f12256m = false;
            this.f12257n = true;
            return this;
        }

        public a f(h.c cVar) {
            this.f12252i = cVar;
            return this;
        }

        public a g(Executor executor) {
            l.e(executor, "executor");
            this.f12250g = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(y0.g gVar) {
            l.e(gVar, "db");
        }

        public void b(y0.g gVar) {
            l.e(gVar, "db");
        }

        public void c(y0.g gVar) {
            l.e(gVar, "db");
        }
    }

    public static final class c {
        public /* synthetic */ c(v3.g gVar) {
            this();
        }

        public c() {
        }
    }

    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public final boolean f(ActivityManager activityManager) {
            return y0.c.b(activityManager);
        }

        public final d k(Context context) {
            l.e(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            l.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return !f((ActivityManager) systemService) ? WRITE_AHEAD_LOGGING : TRUNCATE;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final Map f12270a = new LinkedHashMap();

        public final void a(C0946b bVar) {
            int i4 = bVar.f12404a;
            int i5 = bVar.f12405b;
            Map map = this.f12270a;
            Integer valueOf = Integer.valueOf(i4);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            if (treeMap.containsKey(Integer.valueOf(i5))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i5)) + " with " + bVar);
            }
            treeMap.put(Integer.valueOf(i5), bVar);
        }

        public void b(C0946b... bVarArr) {
            l.e(bVarArr, "migrations");
            for (C0946b a4 : bVarArr) {
                a(a4);
            }
        }

        public final boolean c(int i4, int i5) {
            Map f4 = f();
            if (!f4.containsKey(Integer.valueOf(i4))) {
                return false;
            }
            Map map = (Map) f4.get(Integer.valueOf(i4));
            if (map == null) {
                map = C0721E.g();
            }
            return map.containsKey(Integer.valueOf(i5));
        }

        public List d(int i4, int i5) {
            if (i4 == i5) {
                return C0738o.h();
            }
            return e(new ArrayList(), i5 > i4, i4, i5);
        }

        public final List e(List list, boolean z4, int i4, int i5) {
            boolean z5;
            Integer num;
            do {
                if (z4) {
                    if (i4 >= i5) {
                        return list;
                    }
                } else if (i4 <= i5) {
                    return list;
                }
                TreeMap treeMap = (TreeMap) this.f12270a.get(Integer.valueOf(i4));
                if (treeMap == null) {
                    return null;
                }
                Iterator it = (z4 ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z5 = false;
                        continue;
                        break;
                    }
                    num = (Integer) it.next();
                    if (!z4) {
                        l.d(num, "targetVersion");
                        int intValue = num.intValue();
                        if (i5 <= intValue && intValue < i4) {
                            break;
                        }
                    } else {
                        int i6 = i4 + 1;
                        l.d(num, "targetVersion");
                        int intValue2 = num.intValue();
                        if (i6 <= intValue2 && intValue2 <= i5) {
                            break;
                        }
                    }
                }
                Object obj = treeMap.get(num);
                l.b(obj);
                list.add(obj);
                i4 = num.intValue();
                z5 = true;
                continue;
            } while (z5);
            return null;
        }

        public Map f() {
            return this.f12270a;
        }
    }

    public static abstract class f {
    }

    public static final class g extends m implements u3.l {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ u f12271f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(u uVar) {
            super(1);
            this.f12271f = uVar;
        }

        /* renamed from: a */
        public final Object i(y0.g gVar) {
            l.e(gVar, "it");
            this.f12271f.s();
            return null;
        }
    }

    public static final class h extends m implements u3.l {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ u f12272f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(u uVar) {
            super(1);
            this.f12272f = uVar;
        }

        /* renamed from: a */
        public final Object i(y0.g gVar) {
            l.e(gVar, "it");
            this.f12272f.t();
            return null;
        }
    }

    public u() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        l.d(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f12242m = synchronizedMap;
        this.f12243n = new LinkedHashMap();
    }

    public static /* synthetic */ Cursor y(u uVar, j jVar, CancellationSignal cancellationSignal, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                cancellationSignal = null;
            }
            return uVar.x(jVar, cancellationSignal);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
    }

    public void A(Runnable runnable) {
        l.e(runnable, "body");
        e();
        try {
            runnable.run();
            B();
        } finally {
            i();
        }
    }

    public void B() {
        m().getWritableDatabase().setTransactionSuccessful();
    }

    public final Object C(Class cls, y0.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof g) {
            return C(cls, ((g) hVar).b());
        }
        return null;
    }

    public void c() {
        if (!this.f12235f && v()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void d() {
        if (!q() && this.f12241l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void e() {
        c();
        C0940c cVar = this.f12240k;
        if (cVar == null) {
            s();
        } else {
            cVar.g(new g(this));
        }
    }

    public k f(String str) {
        l.e(str, "sql");
        c();
        d();
        return m().getWritableDatabase().compileStatement(str);
    }

    public abstract o g();

    public abstract y0.h h(f fVar);

    public void i() {
        C0940c cVar = this.f12240k;
        if (cVar == null) {
            t();
        } else {
            cVar.g(new h(this));
        }
    }

    public List j(Map map) {
        l.e(map, "autoMigrationSpecs");
        return C0738o.h();
    }

    public final Lock k() {
        ReentrantReadWriteLock.ReadLock readLock = this.f12239j.readLock();
        l.d(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public o l() {
        return this.f12234e;
    }

    public y0.h m() {
        y0.h hVar = this.f12233d;
        if (hVar != null) {
            return hVar;
        }
        l.n("internalOpenHelper");
        return null;
    }

    public Executor n() {
        Executor executor = this.f12231b;
        if (executor != null) {
            return executor;
        }
        l.n("internalQueryExecutor");
        return null;
    }

    public Set o() {
        return C0723G.d();
    }

    public Map p() {
        return C0721E.g();
    }

    public boolean q() {
        return m().getWritableDatabase().inTransaction();
    }

    public void r(f fVar) {
        l.e(fVar, "configuration");
        this.f12233d = h(fVar);
        Set o4 = o();
        BitSet bitSet = new BitSet();
        Iterator it = o4.iterator();
        while (true) {
            int i4 = -1;
            if (it.hasNext()) {
                Class cls = (Class) it.next();
                int size = fVar.f12170r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (cls.isAssignableFrom(fVar.f12170r.get(size).getClass())) {
                            bitSet.set(size);
                            i4 = size;
                            break;
                        } else if (i5 < 0) {
                            break;
                        } else {
                            size = i5;
                        }
                    }
                }
                if (i4 >= 0) {
                    this.f12238i.put(cls, fVar.f12170r.get(i4));
                } else {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
            } else {
                int size2 = fVar.f12170r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i6 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        } else if (i6 < 0) {
                            break;
                        } else {
                            size2 = i6;
                        }
                    }
                }
                for (C0946b bVar : j(this.f12238i)) {
                    if (!fVar.f12156d.c(bVar.f12404a, bVar.f12405b)) {
                        fVar.f12156d.b(bVar);
                    }
                }
                y yVar = (y) C(y.class, m());
                if (yVar != null) {
                    yVar.e(fVar);
                }
                d dVar = (d) C(d.class, m());
                if (dVar != null) {
                    this.f12240k = dVar.f12126f;
                    l().o(dVar.f12126f);
                }
                boolean z4 = fVar.f12159g == d.WRITE_AHEAD_LOGGING;
                m().setWriteAheadLoggingEnabled(z4);
                this.f12237h = fVar.f12157e;
                this.f12231b = fVar.f12160h;
                this.f12232c = new C0937C(fVar.f12161i);
                this.f12235f = fVar.f12158f;
                this.f12236g = z4;
                if (fVar.f12162j != null) {
                    if (fVar.f12154b != null) {
                        l().p(fVar.f12153a, fVar.f12154b, fVar.f12162j);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                Map p4 = p();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : p4.entrySet()) {
                    Class cls2 = (Class) entry.getKey();
                    Iterator it2 = ((List) entry.getValue()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Class cls3 = (Class) it2.next();
                            int size3 = fVar.f12169q.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i7 = size3 - 1;
                                    if (cls3.isAssignableFrom(fVar.f12169q.get(size3).getClass())) {
                                        bitSet2.set(size3);
                                        break;
                                    } else if (i7 < 0) {
                                        break;
                                    } else {
                                        size3 = i7;
                                    }
                                }
                            }
                            size3 = -1;
                            if (size3 >= 0) {
                                this.f12243n.put(cls3, fVar.f12169q.get(size3));
                            } else {
                                throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                        }
                    }
                }
                int size4 = fVar.f12169q.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i8 = size4 - 1;
                        if (!bitSet2.get(size4)) {
                            throw new IllegalArgumentException("Unexpected type converter " + fVar.f12169q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                        } else if (i8 >= 0) {
                            size4 = i8;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void s() {
        c();
        y0.g writableDatabase = m().getWritableDatabase();
        l().t(writableDatabase);
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    public final void t() {
        m().getWritableDatabase().endTransaction();
        if (!q()) {
            l().l();
        }
    }

    public void u(y0.g gVar) {
        l.e(gVar, "db");
        l().i(gVar);
    }

    public final boolean v() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean w() {
        Boolean bool;
        boolean isOpen;
        C0940c cVar = this.f12240k;
        if (cVar != null) {
            isOpen = cVar.l();
        } else {
            y0.g gVar = this.f12230a;
            if (gVar != null) {
                isOpen = gVar.isOpen();
            } else {
                bool = null;
                return l.a(bool, Boolean.TRUE);
            }
        }
        bool = Boolean.valueOf(isOpen);
        return l.a(bool, Boolean.TRUE);
    }

    public Cursor x(j jVar, CancellationSignal cancellationSignal) {
        l.e(jVar, "query");
        c();
        d();
        return cancellationSignal != null ? m().getWritableDatabase().query(jVar, cancellationSignal) : m().getWritableDatabase().query(jVar);
    }

    public Object z(Callable callable) {
        l.e(callable, "body");
        e();
        try {
            Object call = callable.call();
            B();
            return call;
        } finally {
            i();
        }
    }
}
