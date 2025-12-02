package t1;

import D1.e;
import O1.a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.clearcut.C0409b;
import com.google.android.gms.internal.clearcut.E1;
import com.google.android.gms.internal.clearcut.L0;
import com.google.android.gms.internal.clearcut.M1;
import com.google.android.gms.internal.clearcut.V1;
import com.google.android.gms.internal.clearcut.X1;
import java.util.ArrayList;
import java.util.TimeZone;
import v1.C0947a;
import v1.C0952f;
import v1.C0954h;
import z1.C1032o;

/* renamed from: t1.a  reason: case insensitive filesystem */
public final class C0926a {

    /* renamed from: n  reason: collision with root package name */
    public static final C0947a.g f12033n;

    /* renamed from: o  reason: collision with root package name */
    public static final C0947a.C0204a f12034o;

    /* renamed from: p  reason: collision with root package name */
    public static final C0947a f12035p;

    /* renamed from: q  reason: collision with root package name */
    public static final a[] f12036q = new a[0];

    /* renamed from: r  reason: collision with root package name */
    public static final String[] f12037r = new String[0];

    /* renamed from: s  reason: collision with root package name */
    public static final byte[][] f12038s = new byte[0][];

    /* renamed from: a  reason: collision with root package name */
    public final Context f12039a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12040b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12041c;

    /* renamed from: d  reason: collision with root package name */
    public String f12042d;

    /* renamed from: e  reason: collision with root package name */
    public int f12043e;

    /* renamed from: f  reason: collision with root package name */
    public String f12044f;

    /* renamed from: g  reason: collision with root package name */
    public String f12045g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f12046h;

    /* renamed from: i  reason: collision with root package name */
    public E1 f12047i;

    /* renamed from: j  reason: collision with root package name */
    public final C0928c f12048j;

    /* renamed from: k  reason: collision with root package name */
    public final D1.c f12049k;

    /* renamed from: l  reason: collision with root package name */
    public d f12050l;

    /* renamed from: m  reason: collision with root package name */
    public final b f12051m;

    /* renamed from: t1.a$a  reason: collision with other inner class name */
    public class C0195a {

        /* renamed from: a  reason: collision with root package name */
        public int f12052a;

        /* renamed from: b  reason: collision with root package name */
        public String f12053b;

        /* renamed from: c  reason: collision with root package name */
        public String f12054c;

        /* renamed from: d  reason: collision with root package name */
        public String f12055d;

        /* renamed from: e  reason: collision with root package name */
        public E1 f12056e;

        /* renamed from: f  reason: collision with root package name */
        public ArrayList f12057f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList f12058g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList f12059h;

        /* renamed from: i  reason: collision with root package name */
        public ArrayList f12060i;

        /* renamed from: j  reason: collision with root package name */
        public ArrayList f12061j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f12062k;

        /* renamed from: l  reason: collision with root package name */
        public final M1 f12063l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f12064m;

        public C0195a(C0926a aVar, byte[] bArr) {
            this(bArr, (c) null);
        }

        public void a() {
            if (!this.f12064m) {
                this.f12064m = true;
                C0931f fVar = new C0931f(new X1(C0926a.this.f12040b, C0926a.this.f12041c, this.f12052a, this.f12053b, this.f12054c, this.f12055d, C0926a.this.f12046h, this.f12056e), this.f12063l, (c) null, (c) null, C0926a.d((ArrayList) null), (String[]) null, C0926a.d((ArrayList) null), (byte[][]) null, (a[]) null, this.f12062k);
                if (C0926a.this.f12051m.a(fVar)) {
                    C0926a.this.f12048j.b(fVar);
                } else {
                    C0954h.a(Status.f6638j, (C0952f) null);
                }
            } else {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
        }

        public C0195a b(int i4) {
            this.f12063l.f6836j = i4;
            return this;
        }

        public C0195a(byte[] bArr, c cVar) {
            this.f12052a = C0926a.this.f12043e;
            this.f12053b = C0926a.this.f12042d;
            this.f12054c = C0926a.this.f12044f;
            this.f12055d = null;
            this.f12056e = C0926a.this.f12047i;
            this.f12057f = null;
            this.f12058g = null;
            this.f12059h = null;
            this.f12060i = null;
            this.f12061j = null;
            this.f12062k = true;
            M1 m12 = new M1();
            this.f12063l = m12;
            this.f12064m = false;
            this.f12054c = C0926a.this.f12044f;
            this.f12055d = null;
            m12.f6831B = C0409b.a(C0926a.this.f12039a);
            m12.f6832f = C0926a.this.f12049k.a();
            m12.f6833g = C0926a.this.f12049k.b();
            d unused = C0926a.this.f12050l;
            m12.f6847u = (long) (TimeZone.getDefault().getOffset(m12.f6832f) / 1000);
            if (bArr != null) {
                m12.f6843q = bArr;
            }
        }

        public /* synthetic */ C0195a(C0926a aVar, byte[] bArr, C0927b bVar) {
            this(aVar, bArr);
        }
    }

    /* renamed from: t1.a$b */
    public interface b {
        boolean a(C0931f fVar);
    }

    /* renamed from: t1.a$c */
    public interface c {
    }

    /* renamed from: t1.a$d */
    public static class d {
    }

    static {
        C0947a.g gVar = new C0947a.g();
        f12033n = gVar;
        C0927b bVar = new C0927b();
        f12034o = bVar;
        f12035p = new C0947a("ClearcutLogger.API", bVar, gVar);
    }

    public C0926a(Context context, int i4, String str, String str2, String str3, boolean z4, C0928c cVar, D1.c cVar2, d dVar, b bVar) {
        this.f12043e = -1;
        E1 e12 = E1.DEFAULT;
        this.f12047i = e12;
        this.f12039a = context;
        this.f12040b = context.getPackageName();
        this.f12041c = b(context);
        this.f12043e = -1;
        this.f12042d = str;
        this.f12044f = str2;
        this.f12045g = null;
        this.f12046h = z4;
        this.f12048j = cVar;
        this.f12049k = cVar2;
        this.f12050l = new d();
        this.f12047i = e12;
        this.f12051m = bVar;
        if (z4) {
            C1032o.b(str2 == null, "can't be anonymous with an upload account");
        }
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.wtf("ClearcutLogger", "This can't happen.", e4);
            return 0;
        }
    }

    public static int[] d(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            iArr[i5] = ((Integer) obj).intValue();
            i5++;
        }
        return iArr;
    }

    public final C0195a a(byte[] bArr) {
        return new C0195a(this, bArr, (C0927b) null);
    }

    public C0926a(Context context, String str, String str2) {
        this(context, -1, str, str2, (String) null, false, L0.p(context), e.c(), (d) null, new V1(context));
    }
}
