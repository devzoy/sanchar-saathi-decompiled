package R2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2590a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f2591b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f2592c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f2593d;

    static {
        StringBuilder sb = new StringBuilder();
        Class<d> cls = d.class;
        sb.append(cls.getName());
        sb.append('.');
        sb.append("aot-shared-library-name");
        f2590a = sb.toString();
        f2591b = cls.getName() + '.' + "vm-snapshot-data";
        f2592c = cls.getName() + '.' + "isolate-snapshot-data";
        f2593d = cls.getName() + '.' + "flutter-assets-dir";
    }

    public static ApplicationInfo a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static boolean b(Bundle bundle, String str, boolean z4) {
        return bundle == null ? z4 : bundle.getBoolean(str, z4);
    }

    public static String c(ApplicationInfo applicationInfo, Context context) {
        int i4;
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i4 = bundle.getInt("io.flutter.network-policy", 0)) <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            XmlResourceParser xml = context.getResources().getXml(i4);
            xml.next();
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2 && xml.getName().equals("domain-config")) {
                    g(xml, jSONArray, false);
                }
            }
            return jSONArray.toString();
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public static String d(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str, (String) null);
    }

    public static b e(Context context) {
        ApplicationInfo a4 = a(context);
        return new b(d(a4.metaData, f2590a), d(a4.metaData, f2591b), d(a4.metaData, f2592c), d(a4.metaData, f2593d), c(a4, context), a4.nativeLibraryDir, b(a4.metaData, "io.flutter.automatically-register-plugins", true));
    }

    public static void f(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z4) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue((String) null, "includeSubdomains", false);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() == 4) {
            String trim = xmlResourceParser.getText().trim();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(trim);
            jSONArray2.put(attributeBooleanValue);
            jSONArray2.put(z4);
            jSONArray.put(jSONArray2);
            xmlResourceParser.next();
            if (xmlResourceParser.getEventType() != 3) {
                throw new IllegalStateException("Expected end of domain tag");
            }
            return;
        }
        throw new IllegalStateException("Expected text");
    }

    public static void g(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z4) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue((String) null, "cleartextTrafficPermitted", z4);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    f(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    g(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    h(xmlResourceParser);
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    public static void h(XmlResourceParser xmlResourceParser) {
        String name = xmlResourceParser.getName();
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType != 3 || xmlResourceParser.getName() != name) {
                eventType = xmlResourceParser.next();
            } else {
                return;
            }
        }
    }
}
