package z;

import java.util.Arrays;
import java.util.Comparator;
import z.b;

public class h extends b {

    /* renamed from: g  reason: collision with root package name */
    public int f12775g = 128;

    /* renamed from: h  reason: collision with root package name */
    public i[] f12776h = new i[128];

    /* renamed from: i  reason: collision with root package name */
    public i[] f12777i = new i[128];

    /* renamed from: j  reason: collision with root package name */
    public int f12778j = 0;

    /* renamed from: k  reason: collision with root package name */
    public b f12779k = new b(this);

    /* renamed from: l  reason: collision with root package name */
    public c f12780l;

    public class a implements Comparator {
        public a() {
        }

        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            return iVar.f12788c - iVar2.f12788c;
        }
    }

    public class b implements Comparable {

        /* renamed from: e  reason: collision with root package name */
        public i f12782e;

        /* renamed from: f  reason: collision with root package name */
        public h f12783f;

        public b(h hVar) {
            this.f12783f = hVar;
        }

        public boolean b(i iVar, float f4) {
            boolean z4 = true;
            if (this.f12782e.f12786a) {
                for (int i4 = 0; i4 < 9; i4++) {
                    float[] fArr = this.f12782e.f12794i;
                    float f5 = fArr[i4] + (iVar.f12794i[i4] * f4);
                    fArr[i4] = f5;
                    if (Math.abs(f5) < 1.0E-4f) {
                        this.f12782e.f12794i[i4] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    h.this.G(this.f12782e);
                }
                return false;
            }
            for (int i5 = 0; i5 < 9; i5++) {
                float f6 = iVar.f12794i[i5];
                if (f6 != 0.0f) {
                    float f7 = f6 * f4;
                    if (Math.abs(f7) < 1.0E-4f) {
                        f7 = 0.0f;
                    }
                    this.f12782e.f12794i[i5] = f7;
                } else {
                    this.f12782e.f12794i[i5] = 0.0f;
                }
            }
            return true;
        }

        public int compareTo(Object obj) {
            return this.f12782e.f12788c - ((i) obj).f12788c;
        }

        public void f(i iVar) {
            this.f12782e = iVar;
        }

        public final boolean k() {
            for (int i4 = 8; i4 >= 0; i4--) {
                float f4 = this.f12782e.f12794i[i4];
                if (f4 > 0.0f) {
                    return false;
                }
                if (f4 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean l(i iVar) {
            int i4 = 8;
            while (true) {
                if (i4 < 0) {
                    break;
                }
                float f4 = iVar.f12794i[i4];
                float f5 = this.f12782e.f12794i[i4];
                if (f5 == f4) {
                    i4--;
                } else if (f5 < f4) {
                    return true;
                }
            }
            return false;
        }

        public void m() {
            Arrays.fill(this.f12782e.f12794i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f12782e != null) {
                for (int i4 = 0; i4 < 9; i4++) {
                    str = str + this.f12782e.f12794i[i4] + " ";
                }
            }
            return str + "] " + this.f12782e;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f12780l = cVar;
    }

    public void C(b bVar, boolean z4) {
        i iVar = bVar.f12742a;
        if (iVar != null) {
            b.a aVar = bVar.f12746e;
            int e4 = aVar.e();
            for (int i4 = 0; i4 < e4; i4++) {
                i g4 = aVar.g(i4);
                float a4 = aVar.a(i4);
                this.f12779k.f(g4);
                if (this.f12779k.b(iVar, a4)) {
                    F(g4);
                }
                this.f12743b += bVar.f12743b * a4;
            }
            G(iVar);
        }
    }

    public final void F(i iVar) {
        int i4;
        int i5 = this.f12778j + 1;
        i[] iVarArr = this.f12776h;
        if (i5 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f12776h = iVarArr2;
            this.f12777i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f12776h;
        int i6 = this.f12778j;
        iVarArr3[i6] = iVar;
        int i7 = i6 + 1;
        this.f12778j = i7;
        if (i7 > 1 && iVarArr3[i6].f12788c > iVar.f12788c) {
            int i8 = 0;
            while (true) {
                i4 = this.f12778j;
                if (i8 >= i4) {
                    break;
                }
                this.f12777i[i8] = this.f12776h[i8];
                i8++;
            }
            Arrays.sort(this.f12777i, 0, i4, new a());
            for (int i9 = 0; i9 < this.f12778j; i9++) {
                this.f12776h[i9] = this.f12777i[i9];
            }
        }
        iVar.f12786a = true;
        iVar.a(this);
    }

    public final void G(i iVar) {
        int i4 = 0;
        while (i4 < this.f12778j) {
            if (this.f12776h[i4] == iVar) {
                while (true) {
                    int i5 = this.f12778j;
                    if (i4 < i5 - 1) {
                        i[] iVarArr = this.f12776h;
                        int i6 = i4 + 1;
                        iVarArr[i4] = iVarArr[i6];
                        i4 = i6;
                    } else {
                        this.f12778j = i5 - 1;
                        iVar.f12786a = false;
                        return;
                    }
                }
            } else {
                i4++;
            }
        }
    }

    public i a(d dVar, boolean[] zArr) {
        int i4 = -1;
        for (int i5 = 0; i5 < this.f12778j; i5++) {
            i iVar = this.f12776h[i5];
            if (!zArr[iVar.f12788c]) {
                this.f12779k.f(iVar);
                if (i4 == -1) {
                    if (!this.f12779k.k()) {
                    }
                } else if (!this.f12779k.l(this.f12776h[i4])) {
                }
                i4 = i5;
            }
        }
        if (i4 == -1) {
            return null;
        }
        return this.f12776h[i4];
    }

    public void c(i iVar) {
        this.f12779k.f(iVar);
        this.f12779k.m();
        iVar.f12794i[iVar.f12790e] = 1.0f;
        F(iVar);
    }

    public void clear() {
        this.f12778j = 0;
        this.f12743b = 0.0f;
    }

    public String toString() {
        String str = "" + " goal -> (" + this.f12743b + ") : ";
        for (int i4 = 0; i4 < this.f12778j; i4++) {
            this.f12779k.f(this.f12776h[i4]);
            str = str + this.f12779k + " ";
        }
        return str;
    }
}
