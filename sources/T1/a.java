package T1;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

public class a extends A1.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: e  reason: collision with root package name */
    public int f2855e;

    /* renamed from: f  reason: collision with root package name */
    public String f2856f;

    /* renamed from: g  reason: collision with root package name */
    public String f2857g;

    /* renamed from: h  reason: collision with root package name */
    public int f2858h;

    /* renamed from: i  reason: collision with root package name */
    public Point[] f2859i;

    /* renamed from: j  reason: collision with root package name */
    public f f2860j;

    /* renamed from: k  reason: collision with root package name */
    public i f2861k;

    /* renamed from: l  reason: collision with root package name */
    public j f2862l;

    /* renamed from: m  reason: collision with root package name */
    public l f2863m;

    /* renamed from: n  reason: collision with root package name */
    public k f2864n;

    /* renamed from: o  reason: collision with root package name */
    public g f2865o;

    /* renamed from: p  reason: collision with root package name */
    public c f2866p;

    /* renamed from: q  reason: collision with root package name */
    public d f2867q;

    /* renamed from: r  reason: collision with root package name */
    public e f2868r;

    /* renamed from: s  reason: collision with root package name */
    public byte[] f2869s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2870t;

    /* renamed from: T1.a$a  reason: collision with other inner class name */
    public static class C0062a extends A1.a {
        public static final Parcelable.Creator<C0062a> CREATOR = new c();

        /* renamed from: e  reason: collision with root package name */
        public int f2871e;

        /* renamed from: f  reason: collision with root package name */
        public String[] f2872f;

        public C0062a(int i4, String[] strArr) {
            this.f2871e = i4;
            this.f2872f = strArr;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            int a4 = A1.c.a(parcel);
            A1.c.i(parcel, 2, this.f2871e);
            A1.c.n(parcel, 3, this.f2872f, false);
            A1.c.b(parcel, a4);
        }
    }

    public static class b extends A1.a {
        public static final Parcelable.Creator<b> CREATOR = new f();

        /* renamed from: e  reason: collision with root package name */
        public int f2873e;

        /* renamed from: f  reason: collision with root package name */
        public int f2874f;

        /* renamed from: g  reason: collision with root package name */
        public int f2875g;

        /* renamed from: h  reason: collision with root package name */
        public int f2876h;

        /* renamed from: i  reason: collision with root package name */
        public int f2877i;

        /* renamed from: j  reason: collision with root package name */
        public int f2878j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2879k;

        /* renamed from: l  reason: collision with root package name */
        public String f2880l;

        public b(int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, String str) {
            this.f2873e = i4;
            this.f2874f = i5;
            this.f2875g = i6;
            this.f2876h = i7;
            this.f2877i = i8;
            this.f2878j = i9;
            this.f2879k = z4;
            this.f2880l = str;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            int a4 = A1.c.a(parcel);
            A1.c.i(parcel, 2, this.f2873e);
            A1.c.i(parcel, 3, this.f2874f);
            A1.c.i(parcel, 4, this.f2875g);
            A1.c.i(parcel, 5, this.f2876h);
            A1.c.i(parcel, 6, this.f2877i);
            A1.c.i(parcel, 7, this.f2878j);
            A1.c.c(parcel, 8, this.f2879k);
            A1.c.m(parcel, 9, this.f2880l, false);
            A1.c.b(parcel, a4);
        }
    }

    public static class c extends A1.a {
        public static final Parcelable.Creator<c> CREATOR = new h();

        /* renamed from: e  reason: collision with root package name */
        public String f2881e;

        /* renamed from: f  reason: collision with root package name */
        public String f2882f;

        /* renamed from: g  reason: collision with root package name */
        public String f2883g;

        /* renamed from: h  reason: collision with root package name */
        public String f2884h;

        /* renamed from: i  reason: collision with root package name */
        public String f2885i;

        /* renamed from: j  reason: collision with root package name */
        public b f2886j;

        /* renamed from: k  reason: collision with root package name */
        public b f2887k;

        public c(String str, String str2, String str3, String str4, String str5, b bVar, b bVar2) {
            this.f2881e = str;
            this.f2882f = str2;
            this.f2883g = str3;
            this.f2884h = str4;
            this.f2885i = str5;
            this.f2886j = bVar;
            this.f2887k = bVar2;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            int a4 = A1.c.a(parcel);
            A1.c.m(parcel, 2, this.f2881e, false);
            A1.c.m(parcel, 3, this.f2882f, false);
            A1.c.m(parcel, 4, this.f2883g, false);
            A1.c.m(parcel, 5, this.f2884h, false);
            A1.c.m(parcel, 6, this.f2885i, false);
            A1.c.l(parcel, 7, this.f2886j, i4, false);
            A1.c.l(parcel, 8, this.f2887k, i4, false);
            A1.c.b(parcel, a4);
        }
    }

    public static class d extends A1.a {
        public static final Parcelable.Creator<d> CREATOR = new g();

        /* renamed from: e  reason: collision with root package name */
        public h f2888e;

        /* renamed from: f  reason: collision with root package name */
        public String f2889f;

        /* renamed from: g  reason: collision with root package name */
        public String f2890g;

        /* renamed from: h  reason: collision with root package name */
        public i[] f2891h;

        /* renamed from: i  reason: collision with root package name */
        public f[] f2892i;

        /* renamed from: j  reason: collision with root package name */
        public String[] f2893j;

        /* renamed from: k  reason: collision with root package name */
        public C0062a[] f2894k;

        public d(h hVar, String str, String str2, i[] iVarArr, f[] fVarArr, String[] strArr, C0062a[] aVarArr) {
            this.f2888e = hVar;
            this.f2889f = str;
            this.f2890g = str2;
            this.f2891h = iVarArr;
            this.f2892i = fVarArr;
            this.f2893j = strArr;
            this.f2894k = aVarArr;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            int a4 = A1.c.a(parcel);
            A1.c.l(parcel, 2, this.f2888e, i4, false);
            A1.c.m(parcel, 3, this.f2889f, false);
            A1.c.m(parcel, 4, this.f2890g, false);
            A1.c.p(parcel, 5, this.f2891h, i4, false);
            A1.c.p(parcel, 6, this.f2892i, i4, false);
            A1.c.n(parcel, 7, this.f2893j, false);
            A1.c.p(parcel, 8, this.f2894k, i4, false);
            A1.c.b(parcel, a4);
        }
    }

    public static class e extends A1.a {
        public static final Parcelable.Creator<e> CREATOR = new j();

        /* renamed from: e  reason: collision with root package name */
        public String f2895e;

        /* renamed from: f  reason: collision with root package name */
        public String f2896f;

        /* renamed from: g  reason: collision with root package name */
        public String f2897g;

        /* renamed from: h  reason: collision with root package name */
        public String f2898h;

        /* renamed from: i  reason: collision with root package name */
        public String f2899i;

        /* renamed from: j  reason: collision with root package name */
        public String f2900j;

        /* renamed from: k  reason: collision with root package name */
        public String f2901k;

        /* renamed from: l  reason: collision with root package name */
        public String f2902l;

        /* renamed from: m  reason: collision with root package name */
        public String f2903m;

        /* renamed from: n  reason: collision with root package name */
        public String f2904n;

        /* renamed from: o  reason: collision with root package name */
        public String f2905o;

        /* renamed from: p  reason: collision with root package name */
        public String f2906p;

        /* renamed from: q  reason: collision with root package name */
        public String f2907q;

        /* renamed from: r  reason: collision with root package name */
        public String f2908r;

        public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.f2895e = str;
            this.f2896f = str2;
            this.f2897g = str3;
            this.f2898h = str4;
            this.f2899i = str5;
            this.f2900j = str6;
            this.f2901k = str7;
            this.f2902l = str8;
            this.f2903m = str9;
            this.f2904n = str10;
            this.f2905o = str11;
            this.f2906p = str12;
            this.f2907q = str13;
            this.f2908r = str14;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            int a4 = A1.c.a(parcel);
            A1.c.m(parcel, 2, this.f2895e, false);
            A1.c.m(parcel, 3, this.f2896f, false);
            A1.c.m(parcel, 4, this.f2897g, false);
            A1.c.m(parcel, 5, this.f2898h, false);
            A1.c.m(parcel, 6, this.f2899i, false);
            A1.c.m(parcel, 7, this.f2900j, false);
            A1.c.m(parcel, 8, this.f2901k, false);
            A1.c.m(parcel, 9, this.f2902l, false);
            A1.c.m(parcel, 10, this.f2903m, false);
            A1.c.m(parcel, 11, this.f2904n, false);
            A1.c.m(parcel, 12, this.f2905o, false);
            A1.c.m(parcel, 13, this.f2906p, false);
            A1.c.m(parcel, 14, this.f2907q, false);
            A1.c.m(parcel, 15, this.f2908r, false);
            A1.c.b(parcel, a4);
        }
    }

    public static class f extends A1.a {
        public static final Parcelable.Creator<f> CREATOR = new i();

        /* renamed from: e  reason: collision with root package name */
        public int f2909e;

        /* renamed from: f  reason: collision with root package name */
        public String f2910f;

        /* renamed from: g  reason: collision with root package name */
        public String f2911g;

        /* renamed from: h  reason: collision with root package name */
        public String f2912h;

        public f(int i4, String str, String str2, String str3) {
            this.f2909e = i4;
            this.f2910f = str;
            this.f2911g = str2;
            this.f2912h = str3;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            int a4 = A1.c.a(parcel);
            A1.c.i(parcel, 2, this.f2909e);
            A1.c.m(parcel, 3, this.f2910f, false);
            A1.c.m(parcel, 4, this.f2911g, false);
            A1.c.m(parcel, 5, this.f2912h, false);
            A1.c.b(parcel, a4);
        }
    }

    public static class g extends A1.a {
        public static final Parcelable.Creator<g> CREATOR = new l();

        /* renamed from: e  reason: collision with root package name */
        public double f2913e;

        /* renamed from: f  reason: collision with root package name */
        public double f2914f;

        public g(double d4, double d5) {
            this.f2913e = d4;
            this.f2914f = d5;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            int a4 = A1.c.a(parcel);
            A1.c.g(parcel, 2, this.f2913e);
            A1.c.g(parcel, 3, this.f2914f);
            A1.c.b(parcel, a4);
        }
    }

    public static class h extends A1.a {
        public static final Parcelable.Creator<h> CREATOR = new k();

        /* renamed from: e  reason: collision with root package name */
        public String f2915e;

        /* renamed from: f  reason: collision with root package name */
        public String f2916f;

        /* renamed from: g  reason: collision with root package name */
        public String f2917g;

        /* renamed from: h  reason: collision with root package name */
        public String f2918h;

        /* renamed from: i  reason: collision with root package name */
        public String f2919i;

        /* renamed from: j  reason: collision with root package name */
        public String f2920j;

        /* renamed from: k  reason: collision with root package name */
        public String f2921k;

        public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f2915e = str;
            this.f2916f = str2;
            this.f2917g = str3;
            this.f2918h = str4;
            this.f2919i = str5;
            this.f2920j = str6;
            this.f2921k = str7;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            int a4 = A1.c.a(parcel);
            A1.c.m(parcel, 2, this.f2915e, false);
            A1.c.m(parcel, 3, this.f2916f, false);
            A1.c.m(parcel, 4, this.f2917g, false);
            A1.c.m(parcel, 5, this.f2918h, false);
            A1.c.m(parcel, 6, this.f2919i, false);
            A1.c.m(parcel, 7, this.f2920j, false);
            A1.c.m(parcel, 8, this.f2921k, false);
            A1.c.b(parcel, a4);
        }
    }

    public static class i extends A1.a {
        public static final Parcelable.Creator<i> CREATOR = new n();

        /* renamed from: e  reason: collision with root package name */
        public int f2922e;

        /* renamed from: f  reason: collision with root package name */
        public String f2923f;

        public i(int i4, String str) {
            this.f2922e = i4;
            this.f2923f = str;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            int a4 = A1.c.a(parcel);
            A1.c.i(parcel, 2, this.f2922e);
            A1.c.m(parcel, 3, this.f2923f, false);
            A1.c.b(parcel, a4);
        }
    }

    public static class j extends A1.a {
        public static final Parcelable.Creator<j> CREATOR = new m();

        /* renamed from: e  reason: collision with root package name */
        public String f2924e;

        /* renamed from: f  reason: collision with root package name */
        public String f2925f;

        public j(String str, String str2) {
            this.f2924e = str;
            this.f2925f = str2;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            int a4 = A1.c.a(parcel);
            A1.c.m(parcel, 2, this.f2924e, false);
            A1.c.m(parcel, 3, this.f2925f, false);
            A1.c.b(parcel, a4);
        }
    }

    public static class k extends A1.a {
        public static final Parcelable.Creator<k> CREATOR = new p();

        /* renamed from: e  reason: collision with root package name */
        public String f2926e;

        /* renamed from: f  reason: collision with root package name */
        public String f2927f;

        public k(String str, String str2) {
            this.f2926e = str;
            this.f2927f = str2;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            int a4 = A1.c.a(parcel);
            A1.c.m(parcel, 2, this.f2926e, false);
            A1.c.m(parcel, 3, this.f2927f, false);
            A1.c.b(parcel, a4);
        }
    }

    public static class l extends A1.a {
        public static final Parcelable.Creator<l> CREATOR = new o();

        /* renamed from: e  reason: collision with root package name */
        public String f2928e;

        /* renamed from: f  reason: collision with root package name */
        public String f2929f;

        /* renamed from: g  reason: collision with root package name */
        public int f2930g;

        public l(String str, String str2, int i4) {
            this.f2928e = str;
            this.f2929f = str2;
            this.f2930g = i4;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            int a4 = A1.c.a(parcel);
            A1.c.m(parcel, 2, this.f2928e, false);
            A1.c.m(parcel, 3, this.f2929f, false);
            A1.c.i(parcel, 4, this.f2930g);
            A1.c.b(parcel, a4);
        }
    }

    public a() {
    }

    public Rect d() {
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = 0;
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = this.f2859i;
            if (i6 >= pointArr.length) {
                return new Rect(i4, i7, i8, i5);
            }
            Point point = pointArr[i6];
            i4 = Math.min(i4, point.x);
            i8 = Math.max(i8, point.x);
            i7 = Math.min(i7, point.y);
            i5 = Math.max(i5, point.y);
            i6++;
        }
    }

    public void writeToParcel(Parcel parcel, int i4) {
        int a4 = A1.c.a(parcel);
        A1.c.i(parcel, 2, this.f2855e);
        A1.c.m(parcel, 3, this.f2856f, false);
        A1.c.m(parcel, 4, this.f2857g, false);
        A1.c.i(parcel, 5, this.f2858h);
        A1.c.p(parcel, 6, this.f2859i, i4, false);
        A1.c.l(parcel, 7, this.f2860j, i4, false);
        A1.c.l(parcel, 8, this.f2861k, i4, false);
        A1.c.l(parcel, 9, this.f2862l, i4, false);
        A1.c.l(parcel, 10, this.f2863m, i4, false);
        A1.c.l(parcel, 11, this.f2864n, i4, false);
        A1.c.l(parcel, 12, this.f2865o, i4, false);
        A1.c.l(parcel, 13, this.f2866p, i4, false);
        A1.c.l(parcel, 14, this.f2867q, i4, false);
        A1.c.l(parcel, 15, this.f2868r, i4, false);
        A1.c.e(parcel, 16, this.f2869s, false);
        A1.c.c(parcel, 17, this.f2870t);
        A1.c.b(parcel, a4);
    }

    public a(int i4, String str, String str2, int i5, Point[] pointArr, f fVar, i iVar, j jVar, l lVar, k kVar, g gVar, c cVar, d dVar, e eVar, byte[] bArr, boolean z4) {
        this.f2855e = i4;
        this.f2856f = str;
        this.f2869s = bArr;
        this.f2857g = str2;
        this.f2858h = i5;
        this.f2859i = pointArr;
        this.f2870t = z4;
        this.f2860j = fVar;
        this.f2861k = iVar;
        this.f2862l = jVar;
        this.f2863m = lVar;
        this.f2864n = kVar;
        this.f2865o = gVar;
        this.f2866p = cVar;
        this.f2867q = dVar;
        this.f2868r = eVar;
    }
}
