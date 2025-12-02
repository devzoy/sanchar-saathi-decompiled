package z;

import java.util.Arrays;
import z.b;

/* renamed from: z.a  reason: case insensitive filesystem */
public class C1008a implements b.a {

    /* renamed from: l  reason: collision with root package name */
    public static float f12730l = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    public int f12731a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final b f12732b;

    /* renamed from: c  reason: collision with root package name */
    public final c f12733c;

    /* renamed from: d  reason: collision with root package name */
    public int f12734d = 8;

    /* renamed from: e  reason: collision with root package name */
    public i f12735e = null;

    /* renamed from: f  reason: collision with root package name */
    public int[] f12736f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public int[] f12737g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    public float[] f12738h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    public int f12739i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f12740j = -1;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12741k = false;

    public C1008a(b bVar, c cVar) {
        this.f12732b = bVar;
        this.f12733c = cVar;
    }

    public float a(int i4) {
        int i5 = this.f12739i;
        int i6 = 0;
        while (i5 != -1 && i6 < this.f12731a) {
            if (i6 == i4) {
                return this.f12738h[i5];
            }
            i5 = this.f12737g[i5];
            i6++;
        }
        return 0.0f;
    }

    public final void b(i iVar, float f4) {
        if (f4 == 0.0f) {
            d(iVar, true);
            return;
        }
        int i4 = this.f12739i;
        if (i4 == -1) {
            this.f12739i = 0;
            this.f12738h[0] = f4;
            this.f12736f[0] = iVar.f12788c;
            this.f12737g[0] = -1;
            iVar.f12798m++;
            iVar.a(this.f12732b);
            this.f12731a++;
            if (!this.f12741k) {
                int i5 = this.f12740j + 1;
                this.f12740j = i5;
                int[] iArr = this.f12736f;
                if (i5 >= iArr.length) {
                    this.f12741k = true;
                    this.f12740j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i6 = 0;
        int i7 = -1;
        while (i4 != -1 && i6 < this.f12731a) {
            int i8 = this.f12736f[i4];
            int i9 = iVar.f12788c;
            if (i8 == i9) {
                this.f12738h[i4] = f4;
                return;
            }
            if (i8 < i9) {
                i7 = i4;
            }
            i4 = this.f12737g[i4];
            i6++;
        }
        int i10 = this.f12740j;
        int i11 = i10 + 1;
        if (this.f12741k) {
            int[] iArr2 = this.f12736f;
            if (iArr2[i10] != -1) {
                i10 = iArr2.length;
            }
        } else {
            i10 = i11;
        }
        int[] iArr3 = this.f12736f;
        if (i10 >= iArr3.length && this.f12731a < iArr3.length) {
            int i12 = 0;
            while (true) {
                int[] iArr4 = this.f12736f;
                if (i12 >= iArr4.length) {
                    break;
                } else if (iArr4[i12] == -1) {
                    i10 = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        int[] iArr5 = this.f12736f;
        if (i10 >= iArr5.length) {
            i10 = iArr5.length;
            int i13 = this.f12734d * 2;
            this.f12734d = i13;
            this.f12741k = false;
            this.f12740j = i10 - 1;
            this.f12738h = Arrays.copyOf(this.f12738h, i13);
            this.f12736f = Arrays.copyOf(this.f12736f, this.f12734d);
            this.f12737g = Arrays.copyOf(this.f12737g, this.f12734d);
        }
        this.f12736f[i10] = iVar.f12788c;
        this.f12738h[i10] = f4;
        if (i7 != -1) {
            int[] iArr6 = this.f12737g;
            iArr6[i10] = iArr6[i7];
            iArr6[i7] = i10;
        } else {
            this.f12737g[i10] = this.f12739i;
            this.f12739i = i10;
        }
        iVar.f12798m++;
        iVar.a(this.f12732b);
        int i14 = this.f12731a + 1;
        this.f12731a = i14;
        if (!this.f12741k) {
            this.f12740j++;
        }
        int[] iArr7 = this.f12736f;
        if (i14 >= iArr7.length) {
            this.f12741k = true;
        }
        if (this.f12740j >= iArr7.length) {
            this.f12741k = true;
            this.f12740j = iArr7.length - 1;
        }
    }

    public void c(i iVar, float f4, boolean z4) {
        float f5 = f12730l;
        if (f4 <= (-f5) || f4 >= f5) {
            int i4 = this.f12739i;
            if (i4 == -1) {
                this.f12739i = 0;
                this.f12738h[0] = f4;
                this.f12736f[0] = iVar.f12788c;
                this.f12737g[0] = -1;
                iVar.f12798m++;
                iVar.a(this.f12732b);
                this.f12731a++;
                if (!this.f12741k) {
                    int i5 = this.f12740j + 1;
                    this.f12740j = i5;
                    int[] iArr = this.f12736f;
                    if (i5 >= iArr.length) {
                        this.f12741k = true;
                        this.f12740j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i6 = 0;
            int i7 = -1;
            while (i4 != -1 && i6 < this.f12731a) {
                int i8 = this.f12736f[i4];
                int i9 = iVar.f12788c;
                if (i8 == i9) {
                    float[] fArr = this.f12738h;
                    float f6 = fArr[i4] + f4;
                    float f7 = f12730l;
                    if (f6 > (-f7) && f6 < f7) {
                        f6 = 0.0f;
                    }
                    fArr[i4] = f6;
                    if (f6 == 0.0f) {
                        if (i4 == this.f12739i) {
                            this.f12739i = this.f12737g[i4];
                        } else {
                            int[] iArr2 = this.f12737g;
                            iArr2[i7] = iArr2[i4];
                        }
                        if (z4) {
                            iVar.c(this.f12732b);
                        }
                        if (this.f12741k) {
                            this.f12740j = i4;
                        }
                        iVar.f12798m--;
                        this.f12731a--;
                        return;
                    }
                    return;
                }
                if (i8 < i9) {
                    i7 = i4;
                }
                i4 = this.f12737g[i4];
                i6++;
            }
            int i10 = this.f12740j;
            int i11 = i10 + 1;
            if (this.f12741k) {
                int[] iArr3 = this.f12736f;
                if (iArr3[i10] != -1) {
                    i10 = iArr3.length;
                }
            } else {
                i10 = i11;
            }
            int[] iArr4 = this.f12736f;
            if (i10 >= iArr4.length && this.f12731a < iArr4.length) {
                int i12 = 0;
                while (true) {
                    int[] iArr5 = this.f12736f;
                    if (i12 >= iArr5.length) {
                        break;
                    } else if (iArr5[i12] == -1) {
                        i10 = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            int[] iArr6 = this.f12736f;
            if (i10 >= iArr6.length) {
                i10 = iArr6.length;
                int i13 = this.f12734d * 2;
                this.f12734d = i13;
                this.f12741k = false;
                this.f12740j = i10 - 1;
                this.f12738h = Arrays.copyOf(this.f12738h, i13);
                this.f12736f = Arrays.copyOf(this.f12736f, this.f12734d);
                this.f12737g = Arrays.copyOf(this.f12737g, this.f12734d);
            }
            this.f12736f[i10] = iVar.f12788c;
            this.f12738h[i10] = f4;
            if (i7 != -1) {
                int[] iArr7 = this.f12737g;
                iArr7[i10] = iArr7[i7];
                iArr7[i7] = i10;
            } else {
                this.f12737g[i10] = this.f12739i;
                this.f12739i = i10;
            }
            iVar.f12798m++;
            iVar.a(this.f12732b);
            this.f12731a++;
            if (!this.f12741k) {
                this.f12740j++;
            }
            int i14 = this.f12740j;
            int[] iArr8 = this.f12736f;
            if (i14 >= iArr8.length) {
                this.f12741k = true;
                this.f12740j = iArr8.length - 1;
            }
        }
    }

    public final void clear() {
        int i4 = this.f12739i;
        int i5 = 0;
        while (i4 != -1 && i5 < this.f12731a) {
            i iVar = this.f12733c.f12751d[this.f12736f[i4]];
            if (iVar != null) {
                iVar.c(this.f12732b);
            }
            i4 = this.f12737g[i4];
            i5++;
        }
        this.f12739i = -1;
        this.f12740j = -1;
        this.f12741k = false;
        this.f12731a = 0;
    }

    public final float d(i iVar, boolean z4) {
        if (this.f12735e == iVar) {
            this.f12735e = null;
        }
        int i4 = this.f12739i;
        if (i4 == -1) {
            return 0.0f;
        }
        int i5 = 0;
        int i6 = -1;
        while (i4 != -1 && i5 < this.f12731a) {
            if (this.f12736f[i4] == iVar.f12788c) {
                if (i4 == this.f12739i) {
                    this.f12739i = this.f12737g[i4];
                } else {
                    int[] iArr = this.f12737g;
                    iArr[i6] = iArr[i4];
                }
                if (z4) {
                    iVar.c(this.f12732b);
                }
                iVar.f12798m--;
                this.f12731a--;
                this.f12736f[i4] = -1;
                if (this.f12741k) {
                    this.f12740j = i4;
                }
                return this.f12738h[i4];
            }
            i5++;
            i6 = i4;
            i4 = this.f12737g[i4];
        }
        return 0.0f;
    }

    public int e() {
        return this.f12731a;
    }

    public boolean f(i iVar) {
        int i4 = this.f12739i;
        if (i4 == -1) {
            return false;
        }
        int i5 = 0;
        while (i4 != -1 && i5 < this.f12731a) {
            if (this.f12736f[i4] == iVar.f12788c) {
                return true;
            }
            i4 = this.f12737g[i4];
            i5++;
        }
        return false;
    }

    public i g(int i4) {
        int i5 = this.f12739i;
        int i6 = 0;
        while (i5 != -1 && i6 < this.f12731a) {
            if (i6 == i4) {
                return this.f12733c.f12751d[this.f12736f[i5]];
            }
            i5 = this.f12737g[i5];
            i6++;
        }
        return null;
    }

    public void h(float f4) {
        int i4 = this.f12739i;
        int i5 = 0;
        while (i4 != -1 && i5 < this.f12731a) {
            float[] fArr = this.f12738h;
            fArr[i4] = fArr[i4] / f4;
            i4 = this.f12737g[i4];
            i5++;
        }
    }

    public float i(b bVar, boolean z4) {
        float j4 = j(bVar.f12742a);
        d(bVar.f12742a, z4);
        b.a aVar = bVar.f12746e;
        int e4 = aVar.e();
        for (int i4 = 0; i4 < e4; i4++) {
            i g4 = aVar.g(i4);
            c(g4, aVar.j(g4) * j4, z4);
        }
        return j4;
    }

    public final float j(i iVar) {
        int i4 = this.f12739i;
        int i5 = 0;
        while (i4 != -1 && i5 < this.f12731a) {
            if (this.f12736f[i4] == iVar.f12788c) {
                return this.f12738h[i4];
            }
            i4 = this.f12737g[i4];
            i5++;
        }
        return 0.0f;
    }

    public void k() {
        int i4 = this.f12739i;
        int i5 = 0;
        while (i4 != -1 && i5 < this.f12731a) {
            float[] fArr = this.f12738h;
            fArr[i4] = fArr[i4] * -1.0f;
            i4 = this.f12737g[i4];
            i5++;
        }
    }

    public String toString() {
        int i4 = this.f12739i;
        String str = "";
        int i5 = 0;
        while (i4 != -1 && i5 < this.f12731a) {
            str = ((str + " -> ") + this.f12738h[i4] + " : ") + this.f12733c.f12751d[this.f12736f[i4]];
            i4 = this.f12737g[i4];
            i5++;
        }
        return str;
    }
}
