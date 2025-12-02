package R0;

import Q0.i;
import android.content.Context;
import h3.C0666g;
import h3.C0670k;
import i3.C0720D;
import i3.C0721E;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import v3.l;
import z3.e;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    public static final A f2438a = new A();

    public static final void d(Context context) {
        String str;
        l.e(context, "context");
        A a4 = f2438a;
        if (a4.b(context).exists()) {
            i.e().a(B.f2439a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : a4.e(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        i.e().k(B.f2439a, "Over-writing contents of " + file2);
                    }
                    if (file.renameTo(file2)) {
                        str = "Migrated " + file + "to " + file2;
                    } else {
                        str = "Renaming " + file + " to " + file2 + " failed";
                    }
                    i.e().a(B.f2439a, str);
                }
            }
        }
    }

    public final File a(Context context) {
        l.e(context, "context");
        return c(context);
    }

    public final File b(Context context) {
        l.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        l.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final File c(Context context) {
        return new File(C0299a.f2509a.a(context), "androidx.work.workdb");
    }

    public final Map e(Context context) {
        l.e(context, "context");
        File b4 = b(context);
        File a4 = a(context);
        String[] a5 = B.f2440b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.a(C0720D.d(a5.length), 16));
        for (String str : a5) {
            C0666g a6 = C0670k.a(new File(b4.getPath() + str), new File(a4.getPath() + str));
            linkedHashMap.put(a6.c(), a6.d());
        }
        return C0721E.l(linkedHashMap, C0670k.a(b4, a4));
    }
}
