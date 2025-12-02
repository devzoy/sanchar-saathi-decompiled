package p2;

import android.app.PendingIntent;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: p2.a  reason: case insensitive filesystem */
public class C0870a {

    /* renamed from: a  reason: collision with root package name */
    public final String f11689a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11690b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11691c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11692d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f11693e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11694f;

    /* renamed from: g  reason: collision with root package name */
    public final long f11695g;

    /* renamed from: h  reason: collision with root package name */
    public final long f11696h;

    /* renamed from: i  reason: collision with root package name */
    public final long f11697i;

    /* renamed from: j  reason: collision with root package name */
    public final long f11698j;

    /* renamed from: k  reason: collision with root package name */
    public final PendingIntent f11699k;

    /* renamed from: l  reason: collision with root package name */
    public final PendingIntent f11700l;

    /* renamed from: m  reason: collision with root package name */
    public final PendingIntent f11701m;

    /* renamed from: n  reason: collision with root package name */
    public final PendingIntent f11702n;

    /* renamed from: o  reason: collision with root package name */
    public final Map f11703o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f11704p = false;

    public C0870a(String str, int i4, int i5, int i6, Integer num, int i7, long j4, long j5, long j6, long j7, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        this.f11689a = str;
        this.f11690b = i4;
        this.f11691c = i5;
        this.f11692d = i6;
        this.f11693e = num;
        this.f11694f = i7;
        this.f11695g = j4;
        this.f11696h = j5;
        this.f11697i = j6;
        this.f11698j = j7;
        this.f11699k = pendingIntent;
        this.f11700l = pendingIntent2;
        this.f11701m = pendingIntent3;
        this.f11702n = pendingIntent4;
        this.f11703o = map;
    }

    public static C0870a k(String str, int i4, int i5, int i6, Integer num, int i7, long j4, long j5, long j6, long j7, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        return new C0870a(str, i4, i5, i6, num, i7, j4, j5, j6, j7, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    public static Set n(Set set) {
        return set == null ? new HashSet() : set;
    }

    public int a() {
        return this.f11690b;
    }

    public Integer b() {
        return this.f11693e;
    }

    public Set c(C0873d dVar) {
        return dVar.a() ? dVar.b() == 0 ? n((Set) this.f11703o.get("nonblocking.destructive.intent")) : n((Set) this.f11703o.get("blocking.destructive.intent")) : dVar.b() == 0 ? n((Set) this.f11703o.get("nonblocking.intent")) : n((Set) this.f11703o.get("blocking.intent"));
    }

    public int d() {
        return this.f11692d;
    }

    public boolean e(int i4) {
        return j(C0873d.c(i4)) != null;
    }

    public boolean f(C0873d dVar) {
        return j(dVar) != null;
    }

    public String g() {
        return this.f11689a;
    }

    public int h() {
        return this.f11691c;
    }

    public int i() {
        return this.f11694f;
    }

    public final PendingIntent j(C0873d dVar) {
        if (dVar.b() == 0) {
            PendingIntent pendingIntent = this.f11700l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (o(dVar)) {
                return this.f11702n;
            }
            return null;
        }
        if (dVar.b() == 1) {
            PendingIntent pendingIntent2 = this.f11699k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (o(dVar)) {
                return this.f11701m;
            }
        }
        return null;
    }

    public final void l() {
        this.f11704p = true;
    }

    public final boolean m() {
        return this.f11704p;
    }

    public final boolean o(C0873d dVar) {
        return dVar.a() && this.f11697i <= this.f11698j;
    }
}
