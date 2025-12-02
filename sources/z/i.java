package z;

import java.util.Arrays;
import java.util.HashSet;

public class i {

    /* renamed from: o  reason: collision with root package name */
    public static int f12785o = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f12786a;

    /* renamed from: b  reason: collision with root package name */
    public String f12787b;

    /* renamed from: c  reason: collision with root package name */
    public int f12788c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f12789d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f12790e = 0;

    /* renamed from: f  reason: collision with root package name */
    public float f12791f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12792g = false;

    /* renamed from: h  reason: collision with root package name */
    public float[] f12793h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    public float[] f12794i = new float[9];

    /* renamed from: j  reason: collision with root package name */
    public a f12795j;

    /* renamed from: k  reason: collision with root package name */
    public b[] f12796k = new b[16];

    /* renamed from: l  reason: collision with root package name */
    public int f12797l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f12798m = 0;

    /* renamed from: n  reason: collision with root package name */
    public HashSet f12799n = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f12795j = aVar;
    }

    public static void b() {
        f12785o++;
    }

    public final void a(b bVar) {
        int i4 = 0;
        while (true) {
            int i5 = this.f12797l;
            if (i4 >= i5) {
                b[] bVarArr = this.f12796k;
                if (i5 >= bVarArr.length) {
                    this.f12796k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f12796k;
                int i6 = this.f12797l;
                bVarArr2[i6] = bVar;
                this.f12797l = i6 + 1;
                return;
            } else if (this.f12796k[i4] != bVar) {
                i4++;
            } else {
                return;
            }
        }
    }

    public final void c(b bVar) {
        int i4 = this.f12797l;
        int i5 = 0;
        while (i5 < i4) {
            if (this.f12796k[i5] == bVar) {
                while (i5 < i4 - 1) {
                    b[] bVarArr = this.f12796k;
                    int i6 = i5 + 1;
                    bVarArr[i5] = bVarArr[i6];
                    i5 = i6;
                }
                this.f12797l--;
                return;
            }
            i5++;
        }
    }

    public void d() {
        this.f12787b = null;
        this.f12795j = a.UNKNOWN;
        this.f12790e = 0;
        this.f12788c = -1;
        this.f12789d = -1;
        this.f12791f = 0.0f;
        this.f12792g = false;
        int i4 = this.f12797l;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f12796k[i5] = null;
        }
        this.f12797l = 0;
        this.f12798m = 0;
        this.f12786a = false;
        Arrays.fill(this.f12794i, 0.0f);
    }

    public void e(d dVar, float f4) {
        this.f12791f = f4;
        this.f12792g = true;
        int i4 = this.f12797l;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f12796k[i5].B(dVar, this, false);
        }
        this.f12797l = 0;
    }

    public void f(a aVar, String str) {
        this.f12795j = aVar;
    }

    public final void g(b bVar) {
        int i4 = this.f12797l;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f12796k[i5].C(bVar, false);
        }
        this.f12797l = 0;
    }

    public String toString() {
        if (this.f12787b != null) {
            return "" + this.f12787b;
        }
        return "" + this.f12788c;
    }
}
