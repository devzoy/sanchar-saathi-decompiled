package X2;

import Y2.a;
import Y2.o;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.d;
import java.util.HashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final Y2.a f3486a;

    /* renamed from: b  reason: collision with root package name */
    public final FlutterJNI f3487b;

    /* renamed from: c  reason: collision with root package name */
    public b f3488c;

    /* renamed from: d  reason: collision with root package name */
    public final a.d f3489d;

    /* renamed from: X2.a$a  reason: collision with other inner class name */
    public class C0066a implements a.d {
        public C0066a() {
        }

        public void a(Object obj, a.e eVar) {
            if (a.this.f3488c == null) {
                eVar.a((Object) null);
                return;
            }
            HashMap hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            HashMap hashMap2 = (HashMap) hashMap.get("data");
            M2.b.f("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            char c4 = 65535;
            switch (str.hashCode()) {
                case -1140076541:
                    if (str.equals("tooltip")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -649620375:
                    if (str.equals("announce")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 114595:
                    if (str.equals("tap")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 97604824:
                    if (str.equals("focus")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 114203431:
                    if (str.equals("longPress")) {
                        c4 = 4;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    String str2 = (String) hashMap2.get("message");
                    if (str2 != null) {
                        a.this.f3488c.d(str2);
                        break;
                    }
                    break;
                case 1:
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        a.this.f3488c.a(str3);
                        break;
                    }
                    break;
                case 2:
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        a.this.f3488c.g(num.intValue());
                        break;
                    }
                    break;
                case 3:
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        a.this.f3488c.e(num2.intValue());
                        break;
                    }
                    break;
                case 4:
                    Integer num3 = (Integer) hashMap.get("nodeId");
                    if (num3 != null) {
                        a.this.f3488c.f(num3.intValue());
                        break;
                    }
                    break;
            }
            eVar.a((Object) null);
        }
    }

    public interface b extends FlutterJNI.a {
        void a(String str);

        void d(String str);

        void e(int i4);

        void f(int i4);

        void g(int i4);
    }

    public a(P2.a aVar, FlutterJNI flutterJNI) {
        C0066a aVar2 = new C0066a();
        this.f3489d = aVar2;
        Y2.a aVar3 = new Y2.a(aVar, "flutter/accessibility", o.f3778a);
        this.f3486a = aVar3;
        aVar3.e(aVar2);
        this.f3487b = flutterJNI;
    }

    public void b(int i4, d.g gVar) {
        this.f3487b.dispatchSemanticsAction(i4, gVar);
    }

    public void c(int i4, d.g gVar, Object obj) {
        this.f3487b.dispatchSemanticsAction(i4, gVar, obj);
    }

    public void d() {
        this.f3487b.setSemanticsEnabled(false);
    }

    public void e() {
        this.f3487b.setSemanticsEnabled(true);
    }

    public void f(int i4) {
        this.f3487b.setAccessibilityFeatures(i4);
    }

    public void g(b bVar) {
        this.f3488c = bVar;
        this.f3487b.setAccessibilityDelegate(bVar);
    }
}
