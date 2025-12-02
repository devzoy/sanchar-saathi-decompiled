package X2;

import Y2.i;
import Y2.j;
import Y2.p;
import java.util.HashMap;
import java.util.Map;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3623a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f3624b;

    /* renamed from: c  reason: collision with root package name */
    public j f3625c;

    /* renamed from: d  reason: collision with root package name */
    public j.d f3626d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3627e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3628f;

    /* renamed from: g  reason: collision with root package name */
    public final j.c f3629g;

    public class a implements j.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f3630a;

        public a(byte[] bArr) {
            this.f3630a = bArr;
        }

        public void a(Object obj) {
            byte[] unused = s.this.f3624b = this.f3630a;
        }

        public void b(String str, String str2, Object obj) {
            M2.b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        public void c() {
        }
    }

    public class b implements j.c {
        public b() {
        }

        public void onMethodCall(i iVar, j.d dVar) {
            String str = iVar.f3766a;
            Object obj = iVar.f3767b;
            str.hashCode();
            if (str.equals("get")) {
                boolean unused = s.this.f3628f = true;
                if (!s.this.f3627e) {
                    s sVar = s.this;
                    if (sVar.f3623a) {
                        j.d unused2 = sVar.f3626d = dVar;
                        return;
                    }
                }
                s sVar2 = s.this;
                dVar.a(sVar2.i(sVar2.f3624b));
            } else if (!str.equals("put")) {
                dVar.c();
            } else {
                byte[] unused3 = s.this.f3624b = (byte[]) obj;
                dVar.a((Object) null);
            }
        }
    }

    public s(P2.a aVar, boolean z4) {
        this(new j(aVar, "flutter/restoration", p.f3781b), z4);
    }

    public void g() {
        this.f3624b = null;
    }

    public byte[] h() {
        return this.f3624b;
    }

    public final Map i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public void j(byte[] bArr) {
        this.f3627e = true;
        j.d dVar = this.f3626d;
        if (dVar != null) {
            dVar.a(i(bArr));
            this.f3626d = null;
            this.f3624b = bArr;
        } else if (this.f3628f) {
            this.f3625c.d("push", i(bArr), new a(bArr));
        } else {
            this.f3624b = bArr;
        }
    }

    public s(j jVar, boolean z4) {
        this.f3627e = false;
        this.f3628f = false;
        b bVar = new b();
        this.f3629g = bVar;
        this.f3625c = jVar;
        this.f3623a = z4;
        jVar.e(bVar);
    }
}
