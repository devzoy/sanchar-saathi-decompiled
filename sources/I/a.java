package I;

import F.f;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public abstract class a {

    /* renamed from: I.a$a  reason: collision with other inner class name */
    public static class C0022a {
        public static int a(TypedArray typedArray, int i4) {
            return typedArray.getType(i4);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final d[] f1481a;

        public c(d[] dVarArr) {
            this.f1481a = dVarArr;
        }

        public d[] a() {
            return this.f1481a;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f1482a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1483b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f1484c;

        /* renamed from: d  reason: collision with root package name */
        public final String f1485d;

        /* renamed from: e  reason: collision with root package name */
        public final int f1486e;

        /* renamed from: f  reason: collision with root package name */
        public final int f1487f;

        public d(String str, int i4, boolean z4, String str2, int i5, int i6) {
            this.f1482a = str;
            this.f1483b = i4;
            this.f1484c = z4;
            this.f1485d = str2;
            this.f1486e = i5;
            this.f1487f = i6;
        }

        public String a() {
            return this.f1482a;
        }

        public int b() {
            return this.f1487f;
        }

        public int c() {
            return this.f1486e;
        }

        public String d() {
            return this.f1485d;
        }

        public int e() {
            return this.f1483b;
        }

        public boolean f() {
            return this.f1484c;
        }
    }

    public static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        public final P.e f1488a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1489b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1490c;

        /* renamed from: d  reason: collision with root package name */
        public final String f1491d;

        public e(P.e eVar, int i4, int i5, String str) {
            this.f1488a = eVar;
            this.f1490c = i4;
            this.f1489b = i5;
            this.f1491d = str;
        }

        public int a() {
            return this.f1490c;
        }

        public P.e b() {
            return this.f1488a;
        }

        public String c() {
            return this.f1491d;
        }

        public int d() {
            return this.f1489b;
        }
    }

    public static int a(TypedArray typedArray, int i4) {
        return C0022a.a(typedArray, i4);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static I.a.b b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            I.a$b r3 = d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: I.a.b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):I.a$b");
    }

    public static List c(Resources resources, int i4) {
        if (i4 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i4);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i5 = 0; i5 < obtainTypedArray.length(); i5++) {
                    int resourceId = obtainTypedArray.getResourceId(i5, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i4)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    public static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), f.f998c);
        String string = obtainAttributes.getString(f.f999d);
        String string2 = obtainAttributes.getString(f.f1003h);
        String string3 = obtainAttributes.getString(f.f1004i);
        int resourceId = obtainAttributes.getResourceId(f.f1000e, 0);
        int integer = obtainAttributes.getInteger(f.f1001f, 1);
        int integer2 = obtainAttributes.getInteger(f.f1002g, 500);
        String string4 = obtainAttributes.getString(f.f1005j);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(f(xmlPullParser, resources));
                    } else {
                        g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new e(new P.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
    }

    public static d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), f.f1006k);
        int i4 = obtainAttributes.getInt(obtainAttributes.hasValue(f.f1015t) ? f.f1015t : f.f1008m, 400);
        boolean z4 = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(f.f1013r) ? f.f1013r : f.f1009n, 0);
        int i5 = obtainAttributes.hasValue(f.f1016u) ? f.f1016u : f.f1010o;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(f.f1014s) ? f.f1014s : f.f1011p);
        int i6 = obtainAttributes.getInt(i5, 0);
        int i7 = obtainAttributes.hasValue(f.f1012q) ? f.f1012q : f.f1007l;
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i4, z4, string, i6, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) {
        int i4 = 1;
        while (i4 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i4++;
            } else if (next == 3) {
                i4--;
            }
        }
    }

    public static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
