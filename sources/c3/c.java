package C3;

import java.nio.charset.Charset;
import v3.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f533a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f534b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f535c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f536d;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f537e;

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f538f;

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f539g;

    static {
        Charset forName = Charset.forName("UTF-8");
        l.d(forName, "forName(...)");
        f534b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        l.d(forName2, "forName(...)");
        f535c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        l.d(forName3, "forName(...)");
        f536d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        l.d(forName4, "forName(...)");
        f537e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        l.d(forName5, "forName(...)");
        f538f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        l.d(forName6, "forName(...)");
        f539g = forName6;
    }
}
