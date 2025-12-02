package u0;

import h3.C0673n;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import v3.g;
import v3.l;
import y0.i;
import y0.j;

public final class x implements j, i {

    /* renamed from: m  reason: collision with root package name */
    public static final a f12282m = new a((g) null);

    /* renamed from: n  reason: collision with root package name */
    public static final TreeMap f12283n = new TreeMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f12284e;

    /* renamed from: f  reason: collision with root package name */
    public volatile String f12285f;

    /* renamed from: g  reason: collision with root package name */
    public final long[] f12286g;

    /* renamed from: h  reason: collision with root package name */
    public final double[] f12287h;

    /* renamed from: i  reason: collision with root package name */
    public final String[] f12288i;

    /* renamed from: j  reason: collision with root package name */
    public final byte[][] f12289j;

    /* renamed from: k  reason: collision with root package name */
    public final int[] f12290k;

    /* renamed from: l  reason: collision with root package name */
    public int f12291l;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final x a(String str, int i4) {
            l.e(str, "query");
            TreeMap treeMap = x.f12283n;
            synchronized (treeMap) {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i4));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    x xVar = (x) ceilingEntry.getValue();
                    xVar.f(str, i4);
                    l.d(xVar, "sqliteQuery");
                    return xVar;
                }
                C0673n nVar = C0673n.f9639a;
                x xVar2 = new x(i4, (g) null);
                xVar2.f(str, i4);
                return xVar2;
            }
        }

        public final void b() {
            TreeMap treeMap = x.f12283n;
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                l.d(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i4 = size - 1;
                    if (size > 0) {
                        it.next();
                        it.remove();
                        size = i4;
                    } else {
                        return;
                    }
                }
            }
        }

        public a() {
        }
    }

    public /* synthetic */ x(int i4, g gVar) {
        this(i4);
    }

    public static final x e(String str, int i4) {
        return f12282m.a(str, i4);
    }

    public String b() {
        String str = this.f12285f;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public void bindBlob(int i4, byte[] bArr) {
        l.e(bArr, "value");
        this.f12290k[i4] = 5;
        this.f12289j[i4] = bArr;
    }

    public void bindDouble(int i4, double d4) {
        this.f12290k[i4] = 3;
        this.f12287h[i4] = d4;
    }

    public void bindLong(int i4, long j4) {
        this.f12290k[i4] = 2;
        this.f12286g[i4] = j4;
    }

    public void bindNull(int i4) {
        this.f12290k[i4] = 1;
    }

    public void bindString(int i4, String str) {
        l.e(str, "value");
        this.f12290k[i4] = 4;
        this.f12288i[i4] = str;
    }

    public int c() {
        return this.f12291l;
    }

    public void close() {
    }

    public void d(i iVar) {
        l.e(iVar, "statement");
        int c4 = c();
        if (1 <= c4) {
            int i4 = 1;
            while (true) {
                int i5 = this.f12290k[i4];
                if (i5 == 1) {
                    iVar.bindNull(i4);
                } else if (i5 == 2) {
                    iVar.bindLong(i4, this.f12286g[i4]);
                } else if (i5 == 3) {
                    iVar.bindDouble(i4, this.f12287h[i4]);
                } else if (i5 == 4) {
                    String str = this.f12288i[i4];
                    if (str != null) {
                        iVar.bindString(i4, str);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (i5 == 5) {
                    byte[] bArr = this.f12289j[i4];
                    if (bArr != null) {
                        iVar.bindBlob(i4, bArr);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                if (i4 != c4) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(String str, int i4) {
        l.e(str, "query");
        this.f12285f = str;
        this.f12291l = i4;
    }

    public final void g() {
        TreeMap treeMap = f12283n;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f12284e), this);
            f12282m.b();
            C0673n nVar = C0673n.f9639a;
        }
    }

    public x(int i4) {
        this.f12284e = i4;
        int i5 = i4 + 1;
        this.f12290k = new int[i5];
        this.f12286g = new long[i5];
        this.f12287h = new double[i5];
        this.f12288i = new String[i5];
        this.f12289j = new byte[i5][];
    }
}
