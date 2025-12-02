package z1;

import android.accounts.Account;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import v.b;

/* renamed from: z1.e  reason: case insensitive filesystem */
public final class C1022e {

    /* renamed from: a  reason: collision with root package name */
    public final Account f12951a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f12952b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f12953c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f12954d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12955e;

    /* renamed from: f  reason: collision with root package name */
    public final View f12956f;

    /* renamed from: g  reason: collision with root package name */
    public final String f12957g;

    /* renamed from: h  reason: collision with root package name */
    public final String f12958h;

    /* renamed from: i  reason: collision with root package name */
    public final P1.a f12959i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f12960j;

    /* renamed from: z1.e$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Account f12961a;

        /* renamed from: b  reason: collision with root package name */
        public b f12962b;

        /* renamed from: c  reason: collision with root package name */
        public String f12963c;

        /* renamed from: d  reason: collision with root package name */
        public String f12964d;

        /* renamed from: e  reason: collision with root package name */
        public final P1.a f12965e = P1.a.f2205j;

        public C1022e a() {
            return new C1022e(this.f12961a, this.f12962b, (Map) null, 0, (View) null, this.f12963c, this.f12964d, this.f12965e, false);
        }

        public a b(String str) {
            this.f12963c = str;
            return this;
        }

        public final a c(Account account) {
            this.f12961a = account;
            return this;
        }

        public final a d(Collection collection) {
            if (this.f12962b == null) {
                this.f12962b = new b();
            }
            this.f12962b.addAll(collection);
            return this;
        }

        public final a e(String str) {
            this.f12964d = str;
            return this;
        }
    }

    public C1022e(Account account, Set set, Map map, int i4, View view, String str, String str2, P1.a aVar, boolean z4) {
        this.f12951a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f12952b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f12954d = map;
        this.f12956f = view;
        this.f12955e = i4;
        this.f12957g = str;
        this.f12958h = str2;
        this.f12959i = aVar == null ? P1.a.f2205j : aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f12953c = Collections.unmodifiableSet(hashSet);
        } else {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public Account a() {
        return this.f12951a;
    }

    public Account b() {
        Account account = this.f12951a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set c() {
        return this.f12953c;
    }

    public String d() {
        return this.f12957g;
    }

    public Set e() {
        return this.f12952b;
    }

    public final String f() {
        return this.f12958h;
    }

    public final P1.a g() {
        return this.f12959i;
    }

    public final Integer h() {
        return this.f12960j;
    }

    public final void i(Integer num) {
        this.f12960j = num;
    }
}
