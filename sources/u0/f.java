package u0;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import u0.u;
import v3.l;
import y0.h;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12153a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12154b;

    /* renamed from: c  reason: collision with root package name */
    public final h.c f12155c;

    /* renamed from: d  reason: collision with root package name */
    public final u.e f12156d;

    /* renamed from: e  reason: collision with root package name */
    public final List f12157e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12158f;

    /* renamed from: g  reason: collision with root package name */
    public final u.d f12159g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f12160h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f12161i;

    /* renamed from: j  reason: collision with root package name */
    public final Intent f12162j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f12163k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f12164l;

    /* renamed from: m  reason: collision with root package name */
    public final Set f12165m;

    /* renamed from: n  reason: collision with root package name */
    public final String f12166n;

    /* renamed from: o  reason: collision with root package name */
    public final File f12167o;

    /* renamed from: p  reason: collision with root package name */
    public final Callable f12168p;

    /* renamed from: q  reason: collision with root package name */
    public final List f12169q;

    /* renamed from: r  reason: collision with root package name */
    public final List f12170r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f12171s;

    public f(Context context, String str, h.c cVar, u.e eVar, List list, boolean z4, u.d dVar, Executor executor, Executor executor2, Intent intent, boolean z5, boolean z6, Set set, String str2, File file, Callable callable, u.f fVar, List list2, List list3) {
        u.d dVar2 = dVar;
        Executor executor3 = executor;
        Executor executor4 = executor2;
        Intent intent2 = intent;
        List list4 = list2;
        List list5 = list3;
        l.e(context, "context");
        l.e(cVar, "sqliteOpenHelperFactory");
        l.e(eVar, "migrationContainer");
        l.e(dVar2, "journalMode");
        l.e(executor3, "queryExecutor");
        l.e(executor4, "transactionExecutor");
        l.e(list4, "typeConverters");
        l.e(list5, "autoMigrationSpecs");
        this.f12153a = context;
        this.f12154b = str;
        this.f12155c = cVar;
        this.f12156d = eVar;
        this.f12157e = list;
        this.f12158f = z4;
        this.f12159g = dVar2;
        this.f12160h = executor3;
        this.f12161i = executor4;
        this.f12162j = intent2;
        this.f12163k = z5;
        this.f12164l = z6;
        this.f12165m = set;
        this.f12166n = str2;
        this.f12167o = file;
        this.f12168p = callable;
        this.f12169q = list4;
        this.f12170r = list5;
        this.f12171s = intent2 != null;
    }

    public boolean a(int i4, int i5) {
        if ((i4 > i5 && this.f12164l) || !this.f12163k) {
            return false;
        }
        Set set = this.f12165m;
        return set == null || !set.contains(Integer.valueOf(i4));
    }
}
