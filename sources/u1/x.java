package u1;

import android.content.Context;
import android.util.Log;

public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public static final v f12340a = new n(t.J("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014¢fú§pxb±"));

    /* renamed from: b  reason: collision with root package name */
    public static final v f12341b = new o(t.J("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB<"));

    /* renamed from: c  reason: collision with root package name */
    public static final v f12342c = new p(t.J("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: d  reason: collision with root package name */
    public static final v f12343d = new q(t.J("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: e  reason: collision with root package name */
    public static final v f12344e = new r(t.J("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: f  reason: collision with root package name */
    public static final v f12345f = new s(t.J("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: g  reason: collision with root package name */
    public static final Object f12346g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public static Context f12347h;

    public static synchronized void a(Context context) {
        synchronized (x.class) {
            if (f12347h != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f12347h = context.getApplicationContext();
            }
        }
    }
}
