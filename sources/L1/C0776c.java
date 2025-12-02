package l1;

import Y2.j;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: l1.c  reason: case insensitive filesystem */
public class C0776c extends C0774a {

    /* renamed from: a  reason: collision with root package name */
    public final Map f10984a;

    /* renamed from: b  reason: collision with root package name */
    public final a f10985b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10986c;

    /* renamed from: l1.c$a */
    public class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public Object f10987a;

        /* renamed from: b  reason: collision with root package name */
        public String f10988b;

        /* renamed from: c  reason: collision with root package name */
        public String f10989c;

        /* renamed from: d  reason: collision with root package name */
        public Object f10990d;

        public a() {
        }

        public void a(Object obj) {
            this.f10987a = obj;
        }

        public void b(String str, String str2, Object obj) {
            this.f10988b = str;
            this.f10989c = str2;
            this.f10990d = obj;
        }
    }

    public C0776c(Map map, boolean z4) {
        this.f10984a = map;
        this.f10986c = z4;
    }

    public Object c(String str) {
        return this.f10984a.get(str);
    }

    public boolean e() {
        return this.f10986c;
    }

    public g k() {
        return this.f10985b;
    }

    public String l() {
        return (String) this.f10984a.get("method");
    }

    public Map m() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.f10985b.f10988b);
        hashMap2.put("message", this.f10985b.f10989c);
        hashMap2.put("data", this.f10985b.f10990d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }

    public Map n() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.f10985b.f10987a);
        return hashMap;
    }

    public void o(j.d dVar) {
        a aVar = this.f10985b;
        dVar.b(aVar.f10988b, aVar.f10989c, aVar.f10990d);
    }

    public void p(List list) {
        if (!e()) {
            list.add(m());
        }
    }

    public void q(List list) {
        if (!e()) {
            list.add(n());
        }
    }
}
