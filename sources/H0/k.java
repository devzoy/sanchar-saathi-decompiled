package H0;

import C3.p;
import h3.C0663d;
import h3.C0664e;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v3.g;
import v3.l;
import v3.m;

public final class k implements Comparable {

    /* renamed from: j  reason: collision with root package name */
    public static final a f1389j = new a((g) null);

    /* renamed from: k  reason: collision with root package name */
    public static final k f1390k = new k(0, 0, 0, "");

    /* renamed from: l  reason: collision with root package name */
    public static final k f1391l = new k(0, 1, 0, "");

    /* renamed from: m  reason: collision with root package name */
    public static final k f1392m;

    /* renamed from: n  reason: collision with root package name */
    public static final k f1393n;

    /* renamed from: e  reason: collision with root package name */
    public final int f1394e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1395f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1396g;

    /* renamed from: h  reason: collision with root package name */
    public final String f1397h;

    /* renamed from: i  reason: collision with root package name */
    public final C0663d f1398i;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final k a() {
            return k.f1391l;
        }

        public final k b(String str) {
            String group;
            if (str != null && !p.I(str)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                if (matcher.matches() && (group = matcher.group(1)) != null) {
                    int parseInt = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    if (group2 != null) {
                        int parseInt2 = Integer.parseInt(group2);
                        String group3 = matcher.group(3);
                        if (group3 != null) {
                            int parseInt3 = Integer.parseInt(group3);
                            String group4 = matcher.group(4) != null ? matcher.group(4) : "";
                            l.d(group4, "description");
                            return new k(parseInt, parseInt2, parseInt3, group4, (g) null);
                        }
                    }
                }
            }
            return null;
        }

        public a() {
        }
    }

    public static final class b extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ k f1399f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(k kVar) {
            super(0);
            this.f1399f = kVar;
        }

        /* renamed from: a */
        public final BigInteger c() {
            return BigInteger.valueOf((long) this.f1399f.l()).shiftLeft(32).or(BigInteger.valueOf((long) this.f1399f.m())).shiftLeft(32).or(BigInteger.valueOf((long) this.f1399f.n()));
        }
    }

    static {
        k kVar = new k(1, 0, 0, "");
        f1392m = kVar;
        f1393n = kVar;
    }

    public /* synthetic */ k(int i4, int i5, int i6, String str, g gVar) {
        this(i4, i5, i6, str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f1394e == kVar.f1394e && this.f1395f == kVar.f1395f && this.f1396g == kVar.f1396g;
    }

    /* renamed from: f */
    public int compareTo(k kVar) {
        l.e(kVar, "other");
        return k().compareTo(kVar.k());
    }

    public int hashCode() {
        return ((((527 + this.f1394e) * 31) + this.f1395f) * 31) + this.f1396g;
    }

    public final BigInteger k() {
        Object value = this.f1398i.getValue();
        l.d(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public final int l() {
        return this.f1394e;
    }

    public final int m() {
        return this.f1395f;
    }

    public final int n() {
        return this.f1396g;
    }

    public String toString() {
        String str;
        if (!p.I(this.f1397h)) {
            str = '-' + this.f1397h;
        } else {
            str = "";
        }
        return this.f1394e + '.' + this.f1395f + '.' + this.f1396g + str;
    }

    public k(int i4, int i5, int i6, String str) {
        this.f1394e = i4;
        this.f1395f = i5;
        this.f1396g = i6;
        this.f1397h = str;
        this.f1398i = C0664e.a(new b(this));
    }
}
