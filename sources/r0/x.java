package R0;

import Q0.d;
import Q0.i;
import Q0.l;
import Q0.r;
import Q0.u;
import a1.C0346c;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class x extends r {

    /* renamed from: j  reason: collision with root package name */
    public static final String f2550j = i.i("WorkContinuationImpl");

    /* renamed from: a  reason: collision with root package name */
    public final E f2551a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2552b;

    /* renamed from: c  reason: collision with root package name */
    public final d f2553c;

    /* renamed from: d  reason: collision with root package name */
    public final List f2554d;

    /* renamed from: e  reason: collision with root package name */
    public final List f2555e;

    /* renamed from: f  reason: collision with root package name */
    public final List f2556f;

    /* renamed from: g  reason: collision with root package name */
    public final List f2557g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2558h;

    /* renamed from: i  reason: collision with root package name */
    public l f2559i;

    public x(E e4, List list) {
        this(e4, (String) null, d.KEEP, list, (List) null);
    }

    public static boolean i(x xVar, Set set) {
        set.addAll(xVar.c());
        Set l4 = l(xVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (l4.contains((String) it.next())) {
                return true;
            }
        }
        List<x> e4 = xVar.e();
        if (e4 != null && !e4.isEmpty()) {
            for (x i4 : e4) {
                if (i(i4, set)) {
                    return true;
                }
            }
        }
        set.removeAll(xVar.c());
        return false;
    }

    public static Set l(x xVar) {
        HashSet hashSet = new HashSet();
        List<x> e4 = xVar.e();
        if (e4 != null && !e4.isEmpty()) {
            for (x c4 : e4) {
                hashSet.addAll(c4.c());
            }
        }
        return hashSet;
    }

    public l a() {
        if (!this.f2558h) {
            C0346c cVar = new C0346c(this);
            this.f2551a.r().c(cVar);
            this.f2559i = cVar.d();
        } else {
            i e4 = i.e();
            String str = f2550j;
            e4.k(str, "Already enqueued work ids (" + TextUtils.join(", ", this.f2555e) + ")");
        }
        return this.f2559i;
    }

    public d b() {
        return this.f2553c;
    }

    public List c() {
        return this.f2555e;
    }

    public String d() {
        return this.f2552b;
    }

    public List e() {
        return this.f2557g;
    }

    public List f() {
        return this.f2554d;
    }

    public E g() {
        return this.f2551a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f2558h;
    }

    public void k() {
        this.f2558h = true;
    }

    public x(E e4, String str, d dVar, List list) {
        this(e4, str, dVar, list, (List) null);
    }

    public x(E e4, String str, d dVar, List list, List list2) {
        this.f2551a = e4;
        this.f2552b = str;
        this.f2553c = dVar;
        this.f2554d = list;
        this.f2557g = list2;
        this.f2555e = new ArrayList(list.size());
        this.f2556f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f2556f.addAll(((x) it.next()).f2556f);
            }
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            String b4 = ((u) list.get(i4)).b();
            this.f2555e.add(b4);
            this.f2556f.add(b4);
        }
    }
}
